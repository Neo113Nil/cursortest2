package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.storage.StorageManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.UUID;
import kotlin.time.DurationUnit;
import one.video.stat.transport.SequencePosition;
import one.video.stat.transport.internal.upload.UploadExecutionResult;
import xsna.dbq0;
import xsna.ibq0;
import xsna.zno;

/* compiled from: FileEventStorage.kt */
/* loaded from: classes8.dex */
public final class u8r {
    public static boolean b;
    public static mrk0 c;
    public static up70 d;
    public static File e;
    public static rbn f;
    public static ibq0 g;
    public static pdq0 h;
    public static dbq0.a i;
    public static final bpn0 a = new bpn0(new mg(11));
    public static final LinkedHashMap j = new LinkedHashMap();
    public static final bpn0 k = new bpn0(new com.vk.movika.sdk.base.model.props.c(13));
    public static final bpn0 l = new bpn0(new com.vk.movika.sdk.base.model.props.d(22));
    public static final bpn0 m = new bpn0(new com.vk.movika.tools.controls.seekbar.n(20));
    public static final kq n = new kq(16);
    public static final gu0 o = new gu0(15);
    public static final noi p = new noi(0, 2);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FileEventStorage.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CREATE_AGGREGATOR_FROM_FILE_SESSION_EXISTS;
        public static final a HANDLE_PUT_ONE_LOG_EVENT_SESSION_DUPLICATE;
        public static final a HANDLE_PUT_ONE_LOG_EVENT_WRITE_UNAVAILABLE;
        public static final a INIT_CONFIG_INVALID;
        public static final a PUT_USING_INVALID_CONFIG;
        private final String value;

        static {
            a aVar = new a("INIT_CONFIG_INVALID", 0, "fes_i_cf");
            INIT_CONFIG_INVALID = aVar;
            a aVar2 = new a("CREATE_AGGREGATOR_FROM_FILE_SESSION_EXISTS", 1, "fes_caff_se");
            CREATE_AGGREGATOR_FROM_FILE_SESSION_EXISTS = aVar2;
            a aVar3 = new a("PUT_USING_INVALID_CONFIG", 2, "fes_p_uic");
            PUT_USING_INVALID_CONFIG = aVar3;
            a aVar4 = new a("HANDLE_PUT_ONE_LOG_EVENT_SESSION_DUPLICATE", 3, "fes_hpole_sd");
            HANDLE_PUT_ONE_LOG_EVENT_SESSION_DUPLICATE = aVar4;
            a aVar5 = new a("HANDLE_PUT_ONE_LOG_EVENT_WRITE_UNAVAILABLE", 4, "fes_hpole_wu");
            HANDLE_PUT_ONE_LOG_EVENT_WRITE_UNAVAILABLE = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, String str2) {
            this.value = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.value;
        }
    }

    /* compiled from: FileEventStorage.kt */
    public static final class b extends Handler {

        /* compiled from: FileEventStorage.kt */
        public static final class a {
            public final mrk0 a;
            public final f260 b;
            public final StorageManager c;

            public a(mrk0 mrk0Var, f260 f260Var, StorageManager storageManager) {
                this.a = mrk0Var;
                this.b = f260Var;
                this.c = storageManager;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                f260 f260Var = this.b;
                int hashCode2 = (hashCode + (f260Var == null ? 0 : f260Var.hashCode())) * 31;
                StorageManager storageManager = this.c;
                return hashCode2 + (storageManager != null ? storageManager.hashCode() : 0);
            }

            public final String toString() {
                return "MsgInit(config=" + this.a + ", networkAvailability=" + this.b + ", storageManager=" + this.c + ")";
            }
        }

        /* compiled from: FileEventStorage.kt */
        /* renamed from: xsna.u8r$b$b, reason: collision with other inner class name */
        public static final class C3790b {
            public final yi80 a;
            public final boolean b;
            public final SequencePosition c;
            public final UUID d;

            public C3790b(yi80 yi80Var, boolean z, SequencePosition sequencePosition, UUID uuid) {
                this.a = yi80Var;
                this.b = z;
                this.c = sequencePosition;
                this.d = uuid;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3790b)) {
                    return false;
                }
                C3790b c3790b = (C3790b) obj;
                return epx.f(this.a, c3790b.a) && this.b == c3790b.b && this.c == c3790b.c && epx.f(this.d, c3790b.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + ((this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b)) * 31);
            }

            public final String toString() {
                return "MsgPutObject(event=" + this.a + ", force=" + this.b + ", sequencePosition=" + this.c + ", sessionInstanceId=" + this.d + ")";
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:202:0x02d8  */
        /* JADX WARN: Removed duplicated region for block: B:204:0x02e9  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void handleMessage(Message message) {
            boolean z;
            iar iarVar;
            dbq0 c;
            boolean z2;
            iar iarVar2;
            dbq0 c2;
            dbq0 c3;
            super.handleMessage(message);
            int i = message.what;
            int i2 = 10;
            int i3 = 2;
            if (i != 0) {
                if (i == 1) {
                    C3790b c3790b = (C3790b) message.obj;
                    bpn0 bpn0Var = u8r.a;
                    yi80 yi80Var = c3790b.a;
                    boolean z3 = c3790b.b;
                    SequencePosition sequencePosition = c3790b.c;
                    UUID uuid = c3790b.d;
                    up70 up70Var = u8r.d;
                    if (up70Var == null) {
                        up70Var = null;
                    }
                    up70Var.o("FileEventStorage", new t8r(yi80Var, z3, sequencePosition, uuid));
                    xti0 xti0Var = new xti0(yi80Var.b, uuid);
                    if (sequencePosition == SequencePosition.FIRST) {
                        LinkedHashMap linkedHashMap = u8r.j;
                        synchronized (linkedHashMap) {
                            if (linkedHashMap.containsKey(xti0Var)) {
                                u8r.b().b(false, a.HANDLE_PUT_ONE_LOG_EVENT_SESSION_DUPLICATE, new w8q(xti0Var, i3));
                                iarVar2 = null;
                            } else {
                                File file = u8r.e;
                                File file2 = file == null ? null : file;
                                dbq0.a aVar = u8r.i;
                                dbq0.a aVar2 = aVar == null ? null : aVar;
                                rbn rbnVar = u8r.f;
                                rbn rbnVar2 = rbnVar == null ? null : rbnVar;
                                mrk0 mrk0Var = u8r.c;
                                mrk0 mrk0Var2 = mrk0Var == null ? null : mrk0Var;
                                kq kqVar = u8r.n;
                                vw3 b = u8r.b();
                                up70 up70Var2 = u8r.d;
                                iarVar2 = new iar(xti0Var, file2, aVar2, rbnVar2, mrk0Var2, kqVar, b, up70Var2 == null ? null : up70Var2);
                                if (!(iarVar2.g != null)) {
                                    iarVar2 = null;
                                }
                                if (iarVar2 != null) {
                                    linkedHashMap.put(xti0Var, iarVar2);
                                } else {
                                    iarVar2 = null;
                                }
                            }
                        }
                    } else {
                        LinkedHashMap linkedHashMap2 = u8r.j;
                        synchronized (linkedHashMap2) {
                            iarVar2 = (iar) linkedHashMap2.get(xti0Var);
                        }
                    }
                    if (iarVar2 == null) {
                        return;
                    }
                    if (!iarVar2.k || iarVar2.l) {
                        u8r.b().b(false, a.HANDLE_PUT_ONE_LOG_EVENT_WRITE_UNAVAILABLE, new ncg(yi80Var, 19));
                        return;
                    }
                    iarVar2.c(yi80Var, z3, true);
                    if (!u8r.e(iarVar2) && (c2 = u8r.c(iarVar2)) != null) {
                        ibq0 ibq0Var = u8r.g;
                        if (ibq0Var == null) {
                            ibq0Var = null;
                        }
                        ibq0Var.c(c2);
                        pdq0 pdq0Var = u8r.h;
                        if (pdq0Var == null) {
                            pdq0Var = null;
                        }
                        pdq0Var.d();
                    }
                    if (sequencePosition == SequencePosition.LAST) {
                        iarVar2.f.o("FileSessionAggregator", new jpf(iarVar2, 18));
                        iarVar2.a(true, null);
                        iarVar2.d.getClass();
                        iarVar2.m = System.currentTimeMillis();
                        u7r u7rVar = (u7r) iarVar2.j.getValue();
                        if (u7rVar != null) {
                            u7rVar.a();
                        }
                        iarVar2.l = true;
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    LinkedHashMap linkedHashMap3 = u8r.j;
                    synchronized (linkedHashMap3) {
                        try {
                            epx.f(Looper.myLooper(), (Looper) u8r.l.getValue());
                            up70 up70Var3 = u8r.d;
                            if (up70Var3 == null) {
                                up70Var3 = null;
                            }
                            up70Var3.o("FileEventStorage", new ob0(12));
                            for (iar iarVar3 : j5g.V(linkedHashMap3.values())) {
                                iarVar3.a(false, null);
                                if (!u8r.e(iarVar3) && (c3 = u8r.c(iarVar3)) != null) {
                                    ibq0 ibq0Var2 = u8r.g;
                                    if (ibq0Var2 == null) {
                                        ibq0Var2 = null;
                                    }
                                    ibq0Var2.c(c3);
                                }
                            }
                            pdq0 pdq0Var2 = u8r.h;
                            if (pdq0Var2 == null) {
                                pdq0Var2 = null;
                            }
                            pdq0Var2.d();
                            b d = u8r.d();
                            d.removeMessages(2);
                            Message obtainMessage = d.obtainMessage(2);
                            mrk0 mrk0Var3 = u8r.c;
                            if (mrk0Var3 != null) {
                                r5 = mrk0Var3;
                            }
                            d.sendMessageDelayed(obtainMessage, r5.h);
                            s3q0 s3q0Var = s3q0.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                if (i != 3) {
                    return;
                }
                up70 up70Var4 = u8r.d;
                if (up70Var4 == null) {
                    up70Var4 = null;
                }
                up70Var4.o("FileEventStorage", new vg0(13));
                LinkedHashMap linkedHashMap4 = u8r.j;
                synchronized (linkedHashMap4) {
                    try {
                        Set entrySet = linkedHashMap4.entrySet();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : entrySet) {
                            iar iarVar4 = (iar) ((Map.Entry) obj).getValue();
                            if (iarVar4 != null && iarVar4.b()) {
                                arrayList.add(obj);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add((xti0) ((Map.Entry) it.next()).getKey());
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            xti0 xti0Var2 = (xti0) it2.next();
                            ibq0 ibq0Var3 = u8r.g;
                            if (ibq0Var3 == null) {
                                ibq0Var3 = null;
                            }
                            ibq0Var3.a(xti0Var2);
                            u8r.a(xti0Var2);
                        }
                        s3q0 s3q0Var2 = s3q0.a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                b d2 = u8r.d();
                d2.removeMessages(3);
                Message obtainMessage2 = d2.obtainMessage(3);
                mrk0 mrk0Var4 = u8r.c;
                d2.sendMessageDelayed(obtainMessage2, (mrk0Var4 != null ? mrk0Var4 : null).i);
                return;
            }
            a aVar3 = (a) message.obj;
            bpn0 bpn0Var2 = u8r.a;
            mrk0 mrk0Var5 = aVar3.a;
            StorageManager storageManager = aVar3.c;
            f260 f260Var = aVar3.b;
            Looper myLooper = Looper.myLooper();
            bpn0 bpn0Var3 = u8r.l;
            epx.f(myLooper, (Looper) bpn0Var3.getValue());
            up70 up70Var5 = u8r.d;
            if (up70Var5 == null) {
                up70Var5 = null;
            }
            up70Var5.o("FileEventStorage", new s1m(mrk0Var5, i2));
            epx.f(Looper.myLooper(), (Looper) bpn0Var3.getValue());
            up70 up70Var6 = u8r.d;
            if (up70Var6 == null) {
                up70Var6 = null;
            }
            up70Var6.o("FileEventStorage", new u3k(mrk0Var5, 8));
            u8r.c = mrk0Var5;
            boolean l = cvk.l(mrk0Var5.a);
            long j = mrk0Var5.e;
            if (j >= 0) {
                long j2 = mrk0Var5.f;
                if (j2 > 0 && j < j2 && mrk0Var5.g > 0) {
                    long j3 = mrk0Var5.h;
                    zno.a aVar4 = zno.c;
                    DurationUnit durationUnit = DurationUnit.SECONDS;
                    if (j3 > zno.e(eoo.e(1, durationUnit)) && mrk0Var5.i > zno.e(eoo.e(1, durationUnit)) && mrk0Var5.j > 0 && mrk0Var5.k > 0 && mrk0Var5.l > 0 && l) {
                        z = true;
                        u8r.b = z;
                        if (z) {
                            u8r.b().b(false, a.INIT_CONFIG_INVALID, new mxj(mrk0Var5, 14));
                            return;
                        }
                        u8r.e = new File(mrk0Var5.a, "onelog_video");
                        kq kqVar2 = u8r.n;
                        up70 up70Var7 = u8r.d;
                        u8r.f = new rbn(mrk0Var5, storageManager, kqVar2, up70Var7 == null ? null : up70Var7);
                        if (up70Var7 == null) {
                            up70Var7 = null;
                        }
                        u8r.g = new ibq0(mrk0Var5, kqVar2, up70Var7);
                        gu0 gu0Var = u8r.o;
                        noi noiVar = u8r.p;
                        vw3 b2 = u8r.b();
                        up70 up70Var8 = u8r.d;
                        u8r.h = new pdq0(mrk0Var5, b2, gu0Var, f260Var, noiVar, up70Var8 == null ? null : up70Var8);
                        vw3 b3 = u8r.b();
                        up70 up70Var9 = u8r.d;
                        if (up70Var9 == null) {
                            up70Var9 = null;
                        }
                        u8r.i = new dbq0.a(b3, up70Var9);
                        File file3 = u8r.e;
                        if (file3 == null) {
                            file3 = null;
                        }
                        String[] list = file3.list();
                        if (list != null) {
                            ArrayList arrayList3 = new ArrayList();
                            for (String str : list) {
                                File file4 = u8r.e;
                                if (file4 == null) {
                                    file4 = null;
                                }
                                File file5 = new File(file4, str);
                                try {
                                    z2 = file5.isDirectory();
                                } catch (Throwable unused) {
                                    z2 = false;
                                }
                                if (!z2) {
                                    try {
                                        file5.delete();
                                    } catch (Throwable unused2) {
                                    }
                                    file5 = null;
                                }
                                if (file5 != null) {
                                    arrayList3.add(file5);
                                }
                            }
                            Iterator it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                File file6 = (File) it3.next();
                                LinkedHashMap linkedHashMap5 = u8r.j;
                                synchronized (linkedHashMap5) {
                                    try {
                                        File file7 = u8r.e;
                                        File file8 = file7 == null ? null : file7;
                                        String name = file6.getName();
                                        dbq0.a aVar5 = u8r.i;
                                        dbq0.a aVar6 = aVar5 == null ? null : aVar5;
                                        rbn rbnVar3 = u8r.f;
                                        rbn rbnVar4 = rbnVar3 == null ? null : rbnVar3;
                                        mrk0 mrk0Var6 = u8r.c;
                                        mrk0 mrk0Var7 = mrk0Var6 == null ? null : mrk0Var6;
                                        kq kqVar3 = u8r.n;
                                        vw3 b4 = u8r.b();
                                        up70 up70Var10 = u8r.d;
                                        iarVar = new iar(name, file8, aVar6, rbnVar4, mrk0Var7, kqVar3, b4, up70Var10 == null ? null : up70Var10);
                                        if (!(iarVar.g != null)) {
                                            iarVar = null;
                                        }
                                        if (iarVar == null) {
                                            iarVar = null;
                                        } else {
                                            xti0 xti0Var3 = iarVar.g;
                                            if (xti0Var3 == null) {
                                                xti0Var3 = null;
                                            }
                                            if (linkedHashMap5.containsKey(xti0Var3)) {
                                                u8r.b().b(false, a.CREATE_AGGREGATOR_FROM_FILE_SESSION_EXISTS, new n5i(xti0Var3, 11));
                                                iarVar = null;
                                            } else {
                                                linkedHashMap5.put(xti0Var3, iarVar);
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                                if (iarVar != null && (c = u8r.c(iarVar)) != null) {
                                    ibq0 ibq0Var4 = u8r.g;
                                    if (ibq0Var4 == null) {
                                        ibq0Var4 = null;
                                    }
                                    ibq0Var4.c(c);
                                }
                            }
                            s3q0 s3q0Var3 = s3q0.a;
                        }
                        b d3 = u8r.d();
                        d3.removeMessages(2);
                        Message obtainMessage3 = d3.obtainMessage(2);
                        mrk0 mrk0Var8 = u8r.c;
                        if (mrk0Var8 == null) {
                            mrk0Var8 = null;
                        }
                        d3.sendMessageDelayed(obtainMessage3, mrk0Var8.h);
                        b d4 = u8r.d();
                        d4.removeMessages(3);
                        Message obtainMessage4 = d4.obtainMessage(3);
                        mrk0 mrk0Var9 = u8r.c;
                        d4.sendMessageDelayed(obtainMessage4, (mrk0Var9 != null ? mrk0Var9 : null).i);
                        return;
                    }
                }
            }
            z = false;
            u8r.b = z;
            if (z) {
            }
        }
    }

    /* compiled from: FileEventStorage.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UploadExecutionResult.values().length];
            try {
                iArr[UploadExecutionResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UploadExecutionResult.REQUEST_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UploadExecutionResult.UPLOAD_FILE_TOO_BIG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UploadExecutionResult.INVOCATION_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UploadExecutionResult.UNKNOWN_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UploadExecutionResult.UPLOAD_FILE_IO_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[UploadExecutionResult.NETWORK_CONNECTION_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[UploadExecutionResult.SKIPPED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(xti0 xti0Var) {
        LinkedHashMap linkedHashMap = j;
        synchronized (linkedHashMap) {
            iar iarVar = (iar) linkedHashMap.get(xti0Var);
            if (iarVar != null) {
                iarVar.f.o("FileSessionAggregator", new sfg(iarVar, 18));
                iarVar.i.clear();
                u7r u7rVar = (u7r) iarVar.j.getValue();
                if (u7rVar != null) {
                    u7rVar.a();
                }
                File file = iarVar.h;
                if (file == null) {
                    file = null;
                }
                try {
                    nbr.l(file);
                } catch (Throwable unused) {
                }
                iarVar.l = true;
                j.put(xti0Var, null);
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    public static vw3 b() {
        return (vw3) a.getValue();
    }

    public static dbq0 c(iar iarVar) {
        dbq0 dbq0Var = (dbq0) iarVar.i.poll();
        if (!iarVar.b()) {
            if (iarVar.k && !iarVar.l) {
                return dbq0Var;
            }
            if (dbq0Var != null) {
                return dbq0Var;
            }
        }
        xti0 xti0Var = iarVar.g;
        if (xti0Var == null) {
            xti0Var = null;
        }
        a(xti0Var);
        return null;
    }

    public static b d() {
        return (b) m.getValue();
    }

    public static boolean e(iar iarVar) {
        boolean z;
        boolean z2;
        ibq0 ibq0Var = g;
        if (ibq0Var == null) {
            ibq0Var = null;
        }
        xti0 xti0Var = iarVar.g;
        if (xti0Var == null) {
            xti0Var = null;
        }
        synchronized (ibq0Var.d) {
            try {
                PriorityQueue<ibq0.a> priorityQueue = ibq0Var.d;
                if (priorityQueue == null || !priorityQueue.isEmpty()) {
                    Iterator<ibq0.a> it = priorityQueue.iterator();
                    while (it.hasNext()) {
                        if (epx.f(it.next().e.b, xti0Var)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            pdq0 pdq0Var = h;
            if (pdq0Var == null) {
                pdq0Var = null;
            }
            xti0 xti0Var2 = iarVar.g;
            xti0 xti0Var3 = xti0Var2 != null ? xti0Var2 : null;
            synchronized (pdq0Var.h) {
                mbr mbrVar = pdq0Var.i;
                if (mbrVar != null) {
                    LinkedList linkedList = mbrVar.b;
                    if (!linkedList.isEmpty()) {
                        Iterator it2 = linkedList.iterator();
                        while (it2.hasNext()) {
                            if (epx.f(((dbq0) it2.next()).b, xti0Var3)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                }
                z2 = false;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }
}
