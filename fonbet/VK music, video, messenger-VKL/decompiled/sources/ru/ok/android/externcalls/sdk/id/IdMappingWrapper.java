package ru.ok.android.externcalls.sdk.id;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.reactivex.rxjava3.schedulers.a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.kv3;
import xsna.r44;

/* loaded from: classes9.dex */
public class IdMappingWrapper {
    private static final String CACHE_FILE_NAME = "ids";
    private static final String CACHE_SUBDIR = "external_calls";
    private static final int DISK_CACHE_RECORDS_LIMIT = 2000;
    private static final String LOG_TAG = "IdMappingWrapper";
    private final Context appContext;
    private final RTCLog log;
    private static final long ANONYM_INVALIDATE_INTERVAL_MS = TimeUnit.HOURS.toMillis(4);
    private static volatile IdMappingWrapper DEFAULT = null;
    private boolean changed = false;
    private boolean wasRead = false;
    private final LinkedHashMap<ParticipantId, CallParticipant.ParticipantId> externalToInternal = new LinkedHashMap<>();
    private final LinkedHashMap<CallParticipant.ParticipantId, ParticipantId> internalToExternal = new LinkedHashMap<>();
    private final LinkedHashMap<ParticipantId, Long> externalAnonymToCacheSaveTimestamp = new LinkedHashMap<>();

    private IdMappingWrapper(Context context, @NonNull RTCLog rTCLog) {
        this.log = rTCLog;
        this.appContext = context;
        scheduleReadCacheFromDisk();
    }

    private synchronized void ensureMappingNotOutdated(CallParticipant.ParticipantId participantId) {
        ensureMappingNotOutdated(this.internalToExternal.get(participantId));
    }

    @NonNull
    public static IdMappingWrapper get(@NonNull Context context, @NonNull RTCLog rTCLog) {
        if (DEFAULT == null) {
            synchronized (IdMappingWrapper.class) {
                try {
                    if (DEFAULT == null) {
                        DEFAULT = new IdMappingWrapper(context.getApplicationContext(), rTCLog);
                    }
                } finally {
                }
            }
        }
        return DEFAULT;
    }

    private File getFile(boolean z) throws IOException {
        File file = new File(this.appContext.getCacheDir(), CACHE_SUBDIR);
        file.mkdirs();
        File file2 = new File(file, CACHE_FILE_NAME);
        if (file2.createNewFile()) {
            this.log.log(LOG_TAG, "getFile: empty file");
            if (!z) {
                return null;
            }
        }
        return file2;
    }

    private synchronized List<ParticipantId> getMappingKeysForWritingToDisk() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(this.externalToInternal.keySet());
            ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
            while (listIterator.hasPrevious() && arrayList.size() < 2000) {
                ParticipantId participantId = (ParticipantId) listIterator.previous();
                if (!participantId.isAnon) {
                    arrayList.add(participantId);
                }
            }
            Collections.reverse(arrayList);
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    private synchronized boolean isParticipantIdOutdated(@NonNull ParticipantId participantId) {
        if (!participantId.isAnon) {
            return false;
        }
        Long l = this.externalAnonymToCacheSaveTimestamp.get(participantId);
        if (l == null) {
            return false;
        }
        return System.currentTimeMillis() - l.longValue() > ANONYM_INVALIDATE_INTERVAL_MS;
    }

    private synchronized void read() throws IOException {
        boolean z = true;
        File file = getFile(true);
        if (file == null) {
            return;
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (TextUtils.isEmpty(readLine)) {
                    break;
                }
                int indexOf = readLine.indexOf(9);
                if (indexOf != -1) {
                    String substring = readLine.substring(0, indexOf);
                    String substring2 = readLine.substring(indexOf + 1);
                    try {
                        ParticipantId fromStringValue = ParticipantId.fromStringValue(substring);
                        CallParticipant.ParticipantId fromStringValue2 = CallParticipant.ParticipantId.fromStringValue(substring2);
                        this.externalToInternal.put(fromStringValue, fromStringValue2);
                        this.internalToExternal.put(fromStringValue2, fromStringValue);
                        z = false;
                    } catch (NumberFormatException unused) {
                        this.log.log(LOG_TAG, "malformed internal id " + substring + " : " + substring2);
                    }
                }
            } finally {
            }
        }
        if (z) {
            this.log.log(LOG_TAG, "empty mapping");
        }
        bufferedReader.close();
    }

    private synchronized void removeIdMapping(@NonNull ParticipantId participantId) {
        CallParticipant.ParticipantId participantId2 = this.externalToInternal.get(participantId);
        this.externalToInternal.remove(participantId);
        this.externalAnonymToCacheSaveTimestamp.remove(participantId);
        this.internalToExternal.remove(participantId2);
    }

    private synchronized void write() throws IOException {
        if (this.changed) {
            File file = getFile(false);
            if (file == null) {
                return;
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            try {
                for (ParticipantId participantId : getMappingKeysForWritingToDisk()) {
                    CallParticipant.ParticipantId participantId2 = this.externalToInternal.get(participantId);
                    if (participantId2 != null) {
                        bufferedWriter.write(participantId.toStringValue());
                        bufferedWriter.write(9);
                        bufferedWriter.write(participantId2.toStringValue());
                        bufferedWriter.write(10);
                    }
                }
                bufferedWriter.close();
            } finally {
            }
        }
    }

    public synchronized void addMapping(ParticipantId participantId, CallParticipant.ParticipantId participantId2) {
        try {
            if (this.internalToExternal.get(participantId2) == null) {
                this.changed = true;
            }
            this.internalToExternal.put(participantId2, participantId);
            this.externalToInternal.put(participantId, participantId2);
            if (participantId != null && participantId.isAnon) {
                this.externalAnonymToCacheSaveTimestamp.put(participantId, Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void clear() {
        this.externalToInternal.clear();
        this.externalAnonymToCacheSaveTimestamp.clear();
        this.internalToExternal.clear();
        this.changed = true;
        scheduleWriteCacheToDisk();
    }

    @Nullable
    public synchronized CallParticipant.ParticipantId getByExternal(ParticipantId participantId) {
        if (!this.wasRead) {
            return null;
        }
        ensureMappingNotOutdated(participantId);
        return this.externalToInternal.get(participantId);
    }

    @Nullable
    public synchronized ParticipantId getByInternal(CallParticipant.ParticipantId participantId) {
        if (!this.wasRead) {
            return null;
        }
        ensureMappingNotOutdated(participantId);
        return this.internalToExternal.get(participantId);
    }

    public synchronized void readCacheFromDisk() {
        try {
            read();
        } catch (IOException e) {
            this.log.reportException(LOG_TAG, "read failed", e);
        }
        this.wasRead = true;
    }

    public void scheduleReadCacheFromDisk() {
        a.b().c(new kv3(this, 9));
    }

    public void scheduleWriteCacheToDisk() {
        a.b().c(new r44(this, 13));
    }

    public synchronized void writeCacheToDisk() {
        if (this.changed) {
            try {
                write();
                this.changed = false;
            } catch (IOException e) {
                this.log.logException(LOG_TAG, "failed to commit", e);
            }
        }
    }

    private synchronized void ensureMappingNotOutdated(@Nullable ParticipantId participantId) {
        if (participantId != null) {
            if (isParticipantIdOutdated(participantId)) {
                removeIdMapping(participantId);
            }
        }
    }
}
