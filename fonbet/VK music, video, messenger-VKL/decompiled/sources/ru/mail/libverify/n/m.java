package ru.mail.libverify.n;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import defpackage.k0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import ru.mail.libverify.n.l;
import ru.mail.verify.core.utils.FileLog;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.d8h;
import xsna.oq80;
import xsna.x500;

/* loaded from: classes9.dex */
public final class m implements l {
    static final Pattern g = Pattern.compile(".*", 32);
    private static final Pattern h = Pattern.compile("content://sms/[0-9]+");

    @NonNull
    private final LinkedHashMap a = new LinkedHashMap();
    private final ContentResolver b;

    @NonNull
    private final ru.mail.libverify.c.b c;
    private long d;

    @NonNull
    private final String[] e;

    @NonNull
    private final x500<b> f;

    public static class a<T> extends x500<T> {
        private final int a = 128;

        @Override // xsna.x500
        public final void put(long j, T t) {
            if (size() == this.a && get(j) == null) {
                removeAt(0);
            }
            super.put(j, t);
        }

        @Override // xsna.x500
        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("{");
            for (int i = 0; i < size(); i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(keyAt(i) + StringUtils.PROCESS_POSTFIX_DELIMITER + valueAt(i));
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b DRAFT;
        public static final b FAILED;
        public static final b INBOX;
        public static final b OUTBOX;
        public static final b QUEUED;
        public static final b SENT;
        public static final b UNKNOWN;
        private static final SparseArray<b> values;
        private final int mCode;

        public enum a extends b {
            public /* synthetic */ a(int i) {
                this();
            }

            @Override // ru.mail.libverify.n.m.b
            public final void a(@NonNull m mVar, @NonNull ru.mail.libverify.n.b bVar) {
                FileLog.v("SmsManager", ">>> onReceived(%s)", bVar);
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(bVar.b()) && !TextUtils.isEmpty(bVar.c())) {
                    synchronized (mVar) {
                        try {
                            for (Map.Entry entry : mVar.a.entrySet()) {
                                c cVar = (c) entry.getKey();
                                if (cVar.b.matcher(bVar.b()).matches() && cVar.a.matcher(bVar.c()).matches()) {
                                    arrayList.addAll((Collection) entry.getValue());
                                }
                            }
                        } finally {
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((l.a) it.next()).a(bVar);
                }
            }

            private a() {
            }
        }

        /* renamed from: ru.mail.libverify.n.m$b$b, reason: collision with other inner class name */
        public class C2208b extends SparseArray<b> {
            public C2208b() {
                for (b bVar : b.values()) {
                    put(bVar.mCode, bVar);
                }
            }
        }

        static {
            a aVar = new a(0);
            INBOX = aVar;
            b bVar = new b("SENT", 1, 2);
            SENT = bVar;
            b bVar2 = new b("DRAFT", 2, 3);
            DRAFT = bVar2;
            b bVar3 = new b("OUTBOX", 3, 4);
            OUTBOX = bVar3;
            b bVar4 = new b(SignalingProtocol.HUNGUP_REASON_FAILED, 4, 5);
            FAILED = bVar4;
            b bVar5 = new b("QUEUED", 5, 6);
            QUEUED = bVar5;
            b bVar6 = new b(GrsBaseInfo.CountryCodeSource.UNKNOWN, 6, -1);
            UNKNOWN = bVar6;
            $VALUES = new b[]{aVar, bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
            values = new C2208b();
        }

        public /* synthetic */ b() {
            this("INBOX", 0, 1);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        private b(String str, int i, int i2) {
            this.mCode = i2;
        }

        public void a(m mVar, @NonNull ru.mail.libverify.n.b bVar) {
            FileLog.v("SmsManager", ">>> Unprocessable message type: %s", bVar.d());
        }

        @NonNull
        public static b a(int i) {
            b bVar = values.get(i);
            return bVar == null ? UNKNOWN : bVar;
        }
    }

    public static class c {
        final Pattern a;
        final Pattern b;

        @NonNull
        final String c;

        @NonNull
        final String d;

        public /* synthetic */ c(Pattern pattern, Pattern pattern2, int i) {
            this(pattern, pattern2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.d.equals(cVar.d)) {
                return this.c.equals(cVar.c);
            }
            return false;
        }

        public final int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        private c(Pattern pattern, Pattern pattern2) {
            this.b = pattern;
            this.a = pattern2;
            this.c = pattern2.pattern();
            this.d = pattern.pattern();
        }
    }

    public class d extends ContentObserver {
        public d(ru.mail.libverify.p0.b bVar) {
            super(bVar);
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            m.this.b(null);
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z, Uri uri) {
            m.this.b(uri);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (r11 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(@NonNull ru.mail.libverify.c.b bVar) {
        String[] strArr = {"_id", "type", RTCStatsConstants.KEY_ADDRESS, "body"};
        this.e = strArr;
        this.f = new a();
        this.c = bVar;
        ContentResolver contentResolver = bVar.e().getContext().getContentResolver();
        this.b = contentResolver;
        if (!ru.mail.libverify.n0.e.b(bVar.e().getContext(), "android.permission.READ_SMS")) {
            FileLog.e("SmsManager", "can't init SmsManager without %s", "android.permission.READ_SMS");
            return;
        }
        b();
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(ru.mail.libverify.n.a.a, strArr, null, null, "_id DESC LIMIT 128");
            } catch (Exception e) {
                FileLog.e("SmsManager", "prefillKnownMessages error", e);
            }
            try {
                if (cursor == null) {
                    if (cursor != null) {
                    }
                    this.b.registerContentObserver(ru.mail.libverify.n.a.a, true, new d(this.c.b()));
                    return;
                } else {
                    f fVar = new f(cursor);
                    while (fVar.c()) {
                        ru.mail.libverify.n.b a2 = fVar.a();
                        this.f.put(a2.a(), a2.d());
                    }
                }
                this.b.registerContentObserver(ru.mail.libverify.n.a.a, true, new d(this.c.b()));
                return;
            } catch (Exception e2) {
                FileLog.e("SmsManager", "start error", e2);
                return;
            }
            cursor.close();
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(@Nullable Uri uri) {
        FileLog.v("SmsManager", "Got some message folder change: uri=%s", uri);
        this.c.b().post(new d8h(8, this, uri));
    }

    private void c(@NonNull Uri uri) {
        String uri2 = uri.toString();
        try {
            this.f.remove(Long.parseLong(uri2.substring(uri2.lastIndexOf(47) + 1)));
        } catch (IndexOutOfBoundsException e) {
            ru.mail.libverify.n0.b.a("SmsManager", "untrackMessage", e);
        } catch (NumberFormatException e2) {
            ru.mail.libverify.n0.b.a("SmsManager", "untrackMessage", new Exception(uri.toString(), e2));
        }
    }

    @NonNull
    public final i a() {
        return new i(new oq80(this, 18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public e a(@NonNull Pattern pattern, @NonNull Pattern pattern2, @NonNull final l.a aVar) {
        final c cVar = new c(pattern, pattern2, 0);
        synchronized (this) {
            try {
                List list = (List) this.a.get(cVar);
                if (list == null) {
                    list = new ArrayList();
                    this.a.put(cVar, list);
                }
                list.add(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return new e() { // from class: ru.mail.libverify.n.q
            @Override // ru.mail.libverify.n.e
            public final void a() {
                m.this.a(cVar, aVar);
            }
        };
    }

    private void b() {
        long j;
        Cursor query;
        try {
            query = this.b.query(ru.mail.libverify.n.a.a, new String[]{"_id"}, null, null, "_id DESC LIMIT 1");
        } catch (Exception e) {
            FileLog.e("SmsManager", "obtainLastSmsId error", e);
        }
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    int columnIndex = query.getColumnIndex("_id");
                    if (columnIndex >= 0) {
                        j = query.getLong(columnIndex);
                        query.close();
                        this.d = j;
                    }
                    throw new IllegalArgumentException("ColumnIndex must be >= 0");
                }
            } finally {
            }
        }
        if (query != null) {
            query.close();
        }
        j = -1;
        this.d = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c cVar, l.a aVar) {
        synchronized (this) {
            try {
                List list = (List) this.a.get(cVar);
                if (list != null) {
                    list.remove(aVar);
                    if (list.isEmpty()) {
                        this.a.remove(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Uri uri) {
        ArrayList<ru.mail.libverify.n.b> arrayList;
        Uri uri2;
        Cursor cursor;
        long j = this.d;
        b();
        FileLog.v("SmsManager", "last id: %s -> %s", Long.valueOf(j), Long.valueOf(this.d));
        if (this.d < j) {
            FileLog.v("SmsManager", "last message ID was decreased (SMS deleted)");
            long j2 = this.d;
            while (!this.f.isEmpty()) {
                if (this.f.keyAt(r12.size() - 1) <= j2) {
                    return;
                }
                this.f.removeAt(r12.size() - 1);
            }
            return;
        }
        if (this.a.isEmpty()) {
            return;
        }
        ru.mail.libverify.n.b bVar = null;
        Cursor cursor2 = null;
        bVar = null;
        bVar = null;
        if (uri != null) {
            if (h.matcher(uri.toString()).matches()) {
                try {
                    uri2 = uri;
                } catch (Exception e) {
                    e = e;
                    uri2 = uri;
                }
                try {
                    cursor = this.b.query(uri2, this.e, null, null, "_id ASC");
                } catch (Exception e2) {
                    e = e2;
                    FileLog.e("SmsManager", "getLastMessages error", e);
                    cursor = null;
                    if (cursor != null) {
                    }
                    if (bVar == null) {
                    }
                }
                try {
                    if (cursor != null) {
                        c(uri2);
                    } else {
                        f fVar = new f(cursor);
                        if (fVar.b()) {
                            ru.mail.libverify.n.b a2 = fVar.a();
                            if (this.f.get(a2.a()) != a2.d()) {
                                this.f.put(a2.a(), a2.d());
                                cursor.close();
                                bVar = a2;
                            }
                        } else {
                            c(uri2);
                        }
                    }
                } catch (Exception e3) {
                    FileLog.e("SmsManager", "getMessage error", e3);
                } finally {
                    cursor.close();
                }
                if (bVar == null) {
                    FileLog.v("SmsManager", "Got message, have some listeners.");
                    bVar.d().a(this, bVar);
                    return;
                } else {
                    FileLog.v("SmsManager", "There is no message for %s (deleted?)", uri2);
                    return;
                }
            }
            FileLog.v("SmsManager", "Skip unwanted URI: " + uri);
            return;
        }
        if (!this.f.isEmpty()) {
            j = this.f.keyAt(0) - 1;
        }
        try {
            cursor2 = this.b.query(ru.mail.libverify.n.a.a, this.e, k0.a(j, "_id > "), null, "_id ASC");
        } catch (Exception e4) {
            FileLog.e("SmsManager", "getLastMessages error", e4);
        }
        if (cursor2 == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            try {
                ArrayList arrayList2 = new ArrayList();
                f fVar2 = new f(cursor2);
                while (fVar2.c()) {
                    ru.mail.libverify.n.b a3 = fVar2.a();
                    if (this.f.get(a3.a()) != a3.d()) {
                        arrayList2.add(a3);
                        this.f.put(a3.a(), a3.d());
                    }
                }
            } finally {
            }
        }
        FileLog.v("SmsManager", "Got %s message(s), have some listeners.", Integer.valueOf(arrayList.size()));
        for (ru.mail.libverify.n.b bVar2 : arrayList) {
            bVar2.d().a(this, bVar2);
        }
    }
}
