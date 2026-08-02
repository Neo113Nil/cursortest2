package xsna;

import java.io.RandomAccessFile;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.ArrayList;
import javax.net.ssl.SSLContext;
import kotlin.NoWhenBranchMatchedException;
import one.video.upload.impl.UploadMode;

/* compiled from: UploadConnection.kt */
/* loaded from: classes8.dex */
public final class maq0 extends t3j {
    public final String m;
    public final String n;
    public final String o;
    public final scq0 p;
    public final UploadMode q;
    public final RandomAccessFile r;
    public final b9r s;
    public final c4j t;
    public boolean u;
    public final fl40 v;
    public a w;
    public final qsu x;
    public bcc y;
    public final byte[] z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UploadConnection.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a IDLE;
        public static final a SENDING_DATA;
        public static final a SENDING_UPLOAD_REQUEST;
        public static final a SHUTDOWN;
        public static final a WAITING_FOR_CHUNK_STATUS;
        public static final a WAITING_FOR_UPLOAD_STATUS;

        static {
            a aVar = new a("IDLE", 0);
            IDLE = aVar;
            a aVar2 = new a("WAITING_FOR_UPLOAD_STATUS", 1);
            WAITING_FOR_UPLOAD_STATUS = aVar2;
            a aVar3 = new a("SENDING_UPLOAD_REQUEST", 2);
            SENDING_UPLOAD_REQUEST = aVar3;
            a aVar4 = new a("SENDING_DATA", 3);
            SENDING_DATA = aVar4;
            a aVar5 = new a("WAITING_FOR_CHUNK_STATUS", 4);
            WAITING_FOR_CHUNK_STATUS = aVar5;
            a aVar6 = new a("SHUTDOWN", 5);
            SHUTDOWN = aVar6;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: UploadConnection.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[UploadMode.values().length];
            try {
                iArr[UploadMode.FIXED_FILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UploadMode.STREAMING_FILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[a.WAITING_FOR_UPLOAD_STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[a.WAITING_FOR_CHUNK_STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[a.IDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[a.SENDING_UPLOAD_REQUEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[a.SENDING_DATA.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public maq0(String str, String str2, scq0 scq0Var, UploadMode uploadMode, RandomAccessFile randomAccessFile, b9r b9rVar, udq0 udq0Var, kdq0 kdq0Var, c4j c4jVar, SSLContext sSLContext, boolean z, fl40 fl40Var) {
        super(udq0Var, sSLContext, kdq0Var, c4jVar);
        this.m = str;
        this.n = str2;
        this.o = "video.mp4";
        this.p = scq0Var;
        this.q = uploadMode;
        this.r = randomAccessFile;
        this.s = b9rVar;
        this.t = c4jVar;
        this.u = z;
        this.v = fl40Var;
        this.w = a.IDLE;
        this.x = new qsu();
        this.z = new byte[8096];
    }

    public final void o() {
        Object obj;
        ArrayList arrayList;
        hpt0 hpt0Var = hpt0.a;
        lbs lbsVar = lbs.b;
        scq0 scq0Var = this.p;
        b9r b9rVar = scq0Var.a;
        int i = scq0Var.b;
        ArrayList arrayList2 = scq0Var.c;
        long j = 0;
        if (arrayList2.isEmpty()) {
            if (b9rVar.b || b9rVar.a > i) {
                bcc bccVar = new bcc(0L, Math.min(i, b9rVar.a));
                obj = new xt(bccVar);
                scq0Var.a(0, bccVar);
            }
            obj = lbsVar;
        } else {
            int i2 = 0;
            while (i2 < arrayList2.size() - 1) {
                bcc bccVar2 = (bcc) arrayList2.get(i2);
                int i3 = i2 + 1;
                bcc bccVar3 = (bcc) arrayList2.get(i3);
                boolean z = bccVar2.d;
                long j2 = j;
                long j3 = bccVar2.a;
                long j4 = bccVar2.b;
                if (z && bccVar3.d && j3 + j4 == bccVar3.a) {
                    arrayList2.remove(i3);
                    arrayList2.remove(i2);
                    long j5 = j4 + bccVar3.b;
                    bcc bccVar4 = new bcc(j3, j5);
                    bccVar4.b(j5);
                    bccVar4.a();
                    arrayList2.add(i2, bccVar4);
                } else {
                    i2 = i3;
                }
                j = j2;
            }
            long j6 = j;
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList2.size()) {
                    obj = hpt0Var;
                    break;
                }
                bcc bccVar5 = (bcc) arrayList2.get(i4);
                i4++;
                bcc bccVar6 = (bcc) j5g.b0(i4, arrayList2);
                long j7 = bccVar5.a + bccVar5.b;
                if (bccVar6 == null) {
                    long j8 = b9rVar.a;
                    r13 = j7 < j8 ? Math.min(i, j8 - j7) : -1L;
                    if (!b9rVar.b) {
                        arrayList = arrayList2;
                        if (i + j7 >= b9rVar.a) {
                            break;
                        }
                    } else {
                        arrayList = arrayList2;
                    }
                } else {
                    arrayList = arrayList2;
                    long j9 = bccVar6.a;
                    if (j7 < j9) {
                        r13 = Math.min(i, j9 - j7);
                    }
                }
                if (r13 > j6) {
                    bcc bccVar7 = new bcc(j7, r13);
                    obj = new xt(bccVar7);
                    scq0Var.a(i4, bccVar7);
                    break;
                }
                arrayList2 = arrayList;
            }
            obj = lbsVar;
        }
        boolean z2 = obj instanceof xt;
        c4j c4jVar = this.t;
        if (z2) {
            this.y = ((xt) obj).a;
            c4jVar.getClass();
            new StringBuilder("acquireChunk chunk: ").append(this.y);
            p(a.SENDING_UPLOAD_REQUEST);
            n();
            return;
        }
        if (obj.equals(hpt0Var)) {
            this.y = null;
            c4jVar.getClass();
            p(a.SHUTDOWN);
            close();
            return;
        }
        if (!obj.equals(lbsVar)) {
            throw new NoWhenBranchMatchedException();
        }
        UploadMode uploadMode = UploadMode.STREAMING_FILE;
        UploadMode uploadMode2 = this.q;
        if (uploadMode2 != uploadMode) {
            throw new IllegalStateException(("Unexpected mode: " + uploadMode2).toString());
        }
        c4jVar.getClass();
        this.y = null;
        p(a.IDLE);
        SelectionKey keyFor = this.f.a.keyFor((Selector) this.b.b);
        if (keyFor == null) {
            return;
        }
        keyFor.interestOps(keyFor.interestOps() & (-5));
    }

    public final void p(a aVar) {
        this.w = aVar;
        this.t.getClass();
        new StringBuilder("state set to ").append(aVar);
    }
}
