package ru.ok.tracer.session;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.tracer.base.io.FileUtils;
import ru.ok.tracer.utils.TracerFiles;
import ru.ok.tracer.utils.TracerThreads;
import xsna.brm0;
import xsna.erm0;
import xsna.j5g;
import xsna.k73;
import xsna.nbr;
import xsna.qc9;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: TagsStorage.kt */
/* loaded from: classes11.dex */
public final class TagsStorage {
    public static final Companion Companion = new Companion(null);
    private static final String FILE_TAGS = "tags";
    private final Context applicationContext;
    private final Object lock;
    private final int maxKeysCount;
    private List<String> prevTagsData;
    private volatile PrevTagsState prevTagsState;
    private final List<String> tagsData;

    /* compiled from: TagsStorage.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private final boolean addTag(List<String> list, String str, String str2, int i) {
            String D0 = erm0.D0(31, str);
            int length = D0.length();
            String D02 = erm0.D0(31, str2);
            Iterator<String> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (brm0.B(next, D0, false) && next.length() > length && next.charAt(length) == '=') {
                    it.remove();
                    if (brm0.v(next, D02, false) && next.length() == k73.a(length, 1, D02)) {
                        list.add(next);
                        return false;
                    }
                }
            }
            list.add(D0 + "=" + D02);
            while (list.size() > i) {
                list.remove(0);
            }
            return true;
        }

        public static /* synthetic */ boolean addTag$default(Companion companion, List list, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                i = 30;
            }
            return companion.addTag(list, str, str2, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void deleteIfExists(File file) {
            if (file.exists()) {
                try {
                    FileUtils.deleteChecked(file);
                } catch (IOException unused) {
                    file.toString();
                }
            }
        }

        public static /* synthetic */ boolean putTag$tracer_commons_release$default(Companion companion, List list, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                i = 30;
            }
            return companion.putTag$tracer_commons_release(list, str, str2, i);
        }

        private final boolean removeTag(List<String> list, String str) {
            String D0 = erm0.D0(31, str);
            int length = D0.length();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (brm0.B(next, D0, false) && next.length() > length && next.charAt(length) == '=') {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        public final boolean putTag$tracer_commons_release(List<String> list, String str, String str2, int i) {
            return str2 != null ? addTag(list, str, str2, i) : removeTag(list, str);
        }

        private Companion() {
        }
    }

    /* compiled from: TagsStorage.kt */
    public enum PrevTagsState {
        NONE,
        LOADED,
        CLEAN
    }

    /* compiled from: TagsStorage.kt */
    /* loaded from: classes9.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrevTagsState.values().length];
            try {
                iArr[PrevTagsState.LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrevTagsState.CLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrevTagsState.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TagsStorage(Context context, int i) {
        this.maxKeysCount = i;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.applicationContext = applicationContext;
        this.lock = new Object();
        this.prevTagsState = PrevTagsState.NONE;
        this.tagsData = new ArrayList();
    }

    private final void ensurePrevTagsState(PrevTagsState prevTagsState) {
        List<String> readTags;
        if (this.prevTagsState.compareTo(prevTagsState) >= 0) {
            return;
        }
        synchronized (this.lock) {
            try {
                PrevTagsState prevTagsState2 = this.prevTagsState;
                if (prevTagsState2.compareTo(prevTagsState) >= 0) {
                    return;
                }
                File t = nbr.t(TracerFiles.INSTANCE.getTracerDir(this.applicationContext), FILE_TAGS);
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                int i = iArr[prevTagsState2.ordinal()];
                if (i != 1) {
                    if (i != 3) {
                        throw new AssertionError("Unreachable code");
                    }
                    int i2 = iArr[prevTagsState.ordinal()];
                    if (i2 == 1) {
                        readTags = TagsStorageKt.readTags(t);
                        this.prevTagsData = readTags;
                    } else {
                        if (i2 != 2) {
                            throw new AssertionError("Unreachable code");
                        }
                        Companion.deleteIfExists(t);
                    }
                } else {
                    if (iArr[prevTagsState.ordinal()] != 2) {
                        throw new AssertionError("Unreachable code");
                    }
                    Companion.deleteIfExists(t);
                    this.prevTagsData = null;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setKeys$lambda$4(TagsStorage tagsStorage) {
        tagsStorage.ensurePrevTagsState(PrevTagsState.LOADED);
        try {
            File tracerDir = TracerFiles.INSTANCE.getTracerDir(tagsStorage.applicationContext);
            FileUtils.mkdirsChecked(tracerDir);
            TagsStorageKt.writeTags(nbr.t(tracerDir, FILE_TAGS), tagsStorage.getTags());
        } catch (Exception unused) {
        }
    }

    public final void clearPrevTags() {
        ensurePrevTagsState(PrevTagsState.CLEAN);
    }

    public final List<String> getPrevTags() {
        ensurePrevTagsState(PrevTagsState.LOADED);
        List<String> list = this.prevTagsData;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Cannot get prev tags after clear");
    }

    public final List<String> getTags() {
        List<String> O0;
        synchronized (this.tagsData) {
            O0 = j5g.O0(this.tagsData);
        }
        return O0;
    }

    public final void setKeys$tracer_commons_release(Map<String, String> map) {
        boolean z;
        synchronized (this.tagsData) {
            try {
                z = false;
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    z |= Companion.putTag$tracer_commons_release(this.tagsData, entry.getKey(), entry.getValue(), this.maxKeysCount);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            TracerThreads.INSTANCE.runInBgSequential(new qc9(this, 8));
        }
    }

    public /* synthetic */ TagsStorage(Context context, int i, int i2, zcl zclVar) {
        this(context, (i2 & 2) != 0 ? 30 : i);
    }
}
