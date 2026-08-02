package xsna;

import android.os.storage.StorageManager;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.Regex;
import xsna.dbq0;
import xsna.hl10;
import xsna.u7r;
import xsna.wu1;

/* compiled from: FileSessionAggregator.kt */
/* loaded from: classes8.dex */
public final class iar {
    public final dbq0.a a;
    public final rbn b;
    public final mrk0 c;
    public final kq d;
    public final vw3 e;
    public final i100 f;
    public final xti0 g;
    public final File h;
    public final LinkedList i;
    public final bpn0 j;
    public boolean k;
    public boolean l;
    public long m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FileSessionAggregator.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a APPEND_EVENT_APPEND_FAILED;
        public static final a INIT_DIRECTORY_ALREADY_EXISTS;
        public static final a INIT_DIRECTORY_NOT_EXIST;
        public static final a INIT_ENSURE_DIR_FAILED;
        public static final a INIT_INVALID_DIRECTORY_NAME;
        private final String value;

        static {
            a aVar = new a("APPEND_EVENT_APPEND_FAILED", 0, "fsa_we_af");
            APPEND_EVENT_APPEND_FAILED = aVar;
            a aVar2 = new a("INIT_DIRECTORY_ALREADY_EXISTS", 1, "fsa_i_dae");
            INIT_DIRECTORY_ALREADY_EXISTS = aVar2;
            a aVar3 = new a("INIT_ENSURE_DIR_FAILED", 2, "fsa_i_edf");
            INIT_ENSURE_DIR_FAILED = aVar3;
            a aVar4 = new a("INIT_DIRECTORY_NOT_EXIST", 3, "fsa_i_dne");
            INIT_DIRECTORY_NOT_EXIST = aVar4;
            a aVar5 = new a("INIT_INVALID_DIRECTORY_NAME", 4, "fsa_i_idn");
            INIT_INVALID_DIRECTORY_NAME = aVar5;
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

    public iar(dbq0.a aVar, rbn rbnVar, mrk0 mrk0Var, kq kqVar, vw3 vw3Var, i100 i100Var) {
        this.a = aVar;
        this.b = rbnVar;
        this.c = mrk0Var;
        this.d = kqVar;
        this.e = vw3Var;
        this.f = i100Var;
        this.i = new LinkedList();
        this.j = new bpn0(new dnh(this, 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z, Integer num) {
        String str;
        boolean z2;
        File file;
        boolean z3;
        dbq0 dbq0Var;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean renameTo;
        boolean z9;
        mo0 mo0Var = new mo0(this, z, num);
        i100 i100Var = this.f;
        i100Var.o("FileSessionAggregator", mo0Var);
        u7r u7rVar = (u7r) this.j.getValue();
        if (u7rVar == null) {
            return;
        }
        File file2 = u7rVar.a;
        if (z || u7rVar.g >= this.c.e) {
            i100Var.o("FileSessionAggregator", new x5(19));
            xti0 xti0Var = this.g;
            xti0 xti0Var2 = xti0Var != null ? xti0Var : null;
            final File file3 = this.h;
            if (file3 == null) {
                file3 = null;
            }
            dbq0.a aVar = this.a;
            i100 i100Var2 = aVar.b;
            i100Var2.o("UploadFile", new sdr(file3, xti0Var2, num, 5));
            long j = 0;
            if (u7rVar.g == 0) {
                i100Var2.j("UploadFile", new uv80(10));
                dbq0Var = null;
                z3 = false;
            } else {
                try {
                    j = file2.lastModified();
                } catch (Throwable unused) {
                }
                final long j2 = j;
                final int intValue = num != null ? num.intValue() : u7rVar.f;
                i100Var2.o("UploadFile", new gzs() { // from class: xsna.cbq0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        StringBuilder sb = new StringBuilder("generateUploadFile(directory: ");
                        sb.append(file3);
                        sb.append(", batchNum: ");
                        sb.append(intValue);
                        sb.append(", logTimestamp: ");
                        return efz.b(j2, ")", sb);
                    }
                });
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                int i = intValue;
                xti0 xti0Var3 = xti0Var2;
                String a2 = y57.a("upload_", String.format("%04d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue)}, 1)), BundleUtil.UNDERLINE_TAG, String.format("%016d", Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1)));
                while (true) {
                    int i2 = ref$IntRef.element;
                    Integer valueOf = Integer.valueOf(i2);
                    if (i2 <= 0) {
                        valueOf = null;
                    }
                    if (valueOf == null || (str = lhg.a(ref$IntRef.element, BundleUtil.UNDERLINE_TAG)) == null) {
                        str = "";
                    }
                    File file4 = new File(file3, fo8.a(a2, str));
                    try {
                        z2 = file4.exists();
                    } catch (Throwable unused2) {
                        z2 = false;
                    }
                    if (!z2) {
                        file = file4;
                        break;
                    }
                    String str2 = a2;
                    i100Var2.o("UploadFile", new i6m0(file4, 4));
                    int i3 = ref$IntRef.element + 1;
                    ref$IntRef.element = i3;
                    if (i3 >= 100) {
                        aVar.a.b(false, dbq0.a.EnumC2720a.GENERATE_UPLOAD_FILE_TOO_MUCH_SUFFIX_NUM, new nid0(ref$IntRef, 15));
                        file = null;
                        break;
                    }
                    a2 = str2;
                }
                if (file != null) {
                    vw3 vw3Var = u7rVar.d;
                    u7rVar.e.o("FileAppender", new com.vk.voip.a(11, u7rVar, file));
                    try {
                        z4 = file2.exists();
                    } catch (Throwable unused3) {
                        z4 = false;
                    }
                    if (z4) {
                        try {
                            z5 = file2.isFile();
                        } catch (Throwable unused4) {
                            z5 = false;
                        }
                        if (z5) {
                            try {
                                z6 = file.exists();
                            } catch (Throwable unused5) {
                                z6 = false;
                            }
                            if (z6) {
                                vw3Var.b(false, u7r.a.MOVE_DEST_FILE_EXISTS, new m1i(file, 11));
                                z3 = false;
                                z9 = false;
                            } else {
                                try {
                                    z7 = file2.exists();
                                } catch (Throwable unused6) {
                                    z7 = false;
                                }
                                if (z7) {
                                    try {
                                        z8 = file.exists();
                                    } catch (Throwable unused7) {
                                        z8 = false;
                                    }
                                    if (!z8) {
                                        File parentFile = file.getParentFile();
                                        if (!((parentFile == null || cvk.l(parentFile)) ? false : true)) {
                                            try {
                                                renameTo = file2.renameTo(file);
                                            } catch (Throwable unused8) {
                                            }
                                            if (renameTo) {
                                                z3 = false;
                                                vw3Var.b(false, u7r.a.MOVE_CAN_NOT_RENAME, new rp1(10, u7rVar, file));
                                            } else {
                                                u7rVar.f++;
                                                z3 = false;
                                                u7rVar.h = false;
                                                u7rVar.i = false;
                                                u7rVar.g = cvk.q(file2);
                                            }
                                            z9 = renameTo;
                                        }
                                    }
                                }
                                renameTo = false;
                                if (renameTo) {
                                }
                                z9 = renameTo;
                            }
                            if (z9) {
                                dbq0Var = new dbq0(file, xti0Var3, j2, i, aVar.b);
                            }
                        }
                    }
                    z3 = false;
                    vw3Var.b(false, u7r.a.MOVE_FILE_NOT_EXISTS_OR_NOT_FILE, new ecm(u7rVar, 8));
                    z9 = false;
                    if (z9) {
                    }
                } else {
                    z3 = false;
                }
                dbq0Var = null;
            }
            if (dbq0Var != null) {
                this.i.add(dbq0Var);
                return;
            }
            i100Var.m("FileSessionAggregator", new enh(this, 14));
            u7rVar.a();
            this.k = z3;
        }
    }

    public final boolean b() {
        if (this.m <= 0) {
            return false;
        }
        this.d.getClass();
        return System.currentTimeMillis() - this.m > this.c.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(final yi80 yi80Var, final boolean z, final boolean z2) {
        boolean z3;
        byte[] bArr;
        i100 i100Var;
        u7r u7rVar;
        byte[] bArr2;
        Object c3958a;
        final u7r u7rVar2;
        boolean z4;
        boolean z5;
        gzs<String> gzsVar = new gzs() { // from class: xsna.gar
            @Override // xsna.gzs
            public final Object invoke() {
                xti0 xti0Var = iar.this.g;
                if (xti0Var == null) {
                    xti0Var = null;
                }
                return "writeEvent: compositeKey= " + xti0Var + " event= " + yi80Var.a + ", force= " + z + ", isFirstCall= " + z2;
            }
        };
        i100 i100Var2 = this.f;
        i100Var2.o("FileSessionAggregator", gzsVar);
        if (!this.k || this.l) {
            i100Var2.j("FileSessionAggregator", new te0(17));
            return;
        }
        final u7r u7rVar3 = (u7r) this.j.getValue();
        if (u7rVar3 == null) {
            return;
        }
        i100 i100Var3 = u7rVar3.e;
        i100Var3.o("FileAppender", new com.vk.catalog2.common.ui.holders.b(12, yi80Var, u7rVar3));
        vw3 vw3Var = u7rVar3.d;
        File file = u7rVar3.a;
        boolean z6 = false;
        if (file.exists()) {
            z3 = file.isFile();
        } else {
            File parentFile = file.getParentFile();
            if (parentFile == null || cvk.l(parentFile)) {
                file.createNewFile();
                z3 = file.isFile();
            }
            z3 = false;
        }
        if (z3) {
            try {
                file.exists();
            } catch (Throwable unused) {
            }
            try {
                file.isFile();
            } catch (Throwable unused2) {
            }
            File parentFile2 = file.getParentFile();
            int i = 10;
            if (parentFile2 == null) {
                vw3Var.b(false, u7r.a.APPEND_ATOMICALLY_PARENT_IS_NULL, new m2j(u7rVar3, i));
            } else {
                try {
                    try {
                        StringWriter stringWriter = new StringWriter();
                        typ.a(yi80Var, stringWriter);
                        byte[] bytes = stringWriter.toString().getBytes(emb.b);
                        if (!(u7rVar3.g == 0)) {
                            bytes = jw5.x(u7r.j, bytes);
                        }
                        bArr = bytes;
                    } catch (IOException unused3) {
                        throw new AssertionError("WTF! StringWriter thrown IOException");
                    }
                } catch (Throwable th) {
                    vw3Var.b(false, u7r.a.GET_DATA_FAILED, new odm(th, 6));
                    bArr = null;
                }
                if (bArr != null) {
                    final long j = u7rVar3.g;
                    final long length = bArr.length;
                    i100Var3.o("FileAppender", new gzs() { // from class: xsna.s7r
                        @Override // xsna.gzs
                        public final Object invoke() {
                            return "Atomically append data (size " + length + ") into file " + u7rVar3.a;
                        }
                    });
                    if (j + length > u7rVar3.b.f) {
                        i100Var3.j("FileAppender", new ee4(13));
                        u7rVar3.h = true;
                        u7rVar2 = u7rVar3;
                        z6 = false;
                    } else {
                        rbn rbnVar = u7rVar3.c;
                        i100 i100Var4 = rbnVar.d;
                        StorageManager storageManager = rbnVar.b;
                        if (storageManager == null) {
                            c3958a = wu1.a.d.a;
                            i100Var = i100Var3;
                            u7rVar = u7rVar3;
                            bArr2 = bArr;
                        } else {
                            rbnVar.c.getClass();
                            long currentTimeMillis = System.currentTimeMillis();
                            if (rbnVar.e + rbn.f < currentTimeMillis) {
                                try {
                                    UUID uuidForPath = storageManager.getUuidForPath(parentFile2);
                                    bArr2 = bArr;
                                    try {
                                        long allocatableBytes = storageManager.getAllocatableBytes(uuidForPath);
                                        if (length > allocatableBytes) {
                                            c3958a = new wu1.a.b(length, allocatableBytes);
                                            u7rVar = u7rVar3;
                                            i100Var = i100Var3;
                                        } else {
                                            u7rVar = u7rVar3;
                                            try {
                                                i100Var = i100Var3;
                                                try {
                                                    final long min = Math.min(allocatableBytes, rbnVar.a.g);
                                                    if (length > min) {
                                                        c3958a = new wu1.a.c(length, min);
                                                    } else {
                                                        i100Var4.o("DiskSpaceAllocator", new gzs() { // from class: xsna.qbn
                                                            @Override // xsna.gzs
                                                            public final Object invoke() {
                                                                return qlb0.a(min, "Allocate ", " bytes");
                                                            }
                                                        });
                                                        storageManager.allocateBytes(uuidForPath, min);
                                                        rbnVar.e = currentTimeMillis;
                                                        c3958a = wu1.c.a;
                                                    }
                                                } catch (IOException e) {
                                                    e = e;
                                                    i100Var4.j("DiskSpaceAllocator", new mag(e, 15));
                                                    c3958a = wu1.b.a;
                                                    if (epx.f(c3958a, wu1.c.a)) {
                                                    }
                                                    u7rVar2 = u7rVar;
                                                    i100 i100Var5 = i100Var;
                                                    try {
                                                        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                                                        try {
                                                            fileOutputStream.write(bArr2);
                                                            s3q0 s3q0Var = s3q0.a;
                                                            fileOutputStream.close();
                                                            z5 = true;
                                                        } finally {
                                                        }
                                                    } catch (Exception e2) {
                                                        vw3Var.b(false, u7r.a.APPEND_ATOMICALLY_APPEND_FAILED, new com.vk.movika.sdk.base.ui.r(10, u7rVar2, e2));
                                                        i100Var5.o("FileAppender", new xyh(u7rVar2, 12));
                                                        try {
                                                            z4 = file.exists();
                                                        } catch (Throwable unused4) {
                                                            z4 = false;
                                                        }
                                                        int i2 = 5;
                                                        try {
                                                            if (z4) {
                                                                final long q = cvk.q(file);
                                                                boolean z7 = q >= j;
                                                                u7r.a aVar = u7r.a.RESTORE_FILE_STATE_INVALID_LENGTH;
                                                                try {
                                                                    gzs<String> gzsVar2 = new gzs() { // from class: xsna.t7r
                                                                        @Override // xsna.gzs
                                                                        public final Object invoke() {
                                                                            File file2 = u7r.this.a;
                                                                            StringBuilder sb = new StringBuilder("File ");
                                                                            sb.append(file2);
                                                                            sb.append(" has invalid size ");
                                                                            sb.append(q);
                                                                            return xy6.a(j, ". Original size ", sb);
                                                                        }
                                                                    };
                                                                    u7rVar2 = u7rVar2;
                                                                    vw3Var.b(z7, aVar, gzsVar2);
                                                                    if (q > j) {
                                                                        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                                                                        try {
                                                                            randomAccessFile.setLength(j);
                                                                            randomAccessFile.getChannel().force(true);
                                                                            s3q0 s3q0Var2 = s3q0.a;
                                                                            randomAccessFile.close();
                                                                        } finally {
                                                                        }
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    u7rVar2 = u7rVar2;
                                                                    u7rVar2.a();
                                                                    vw3Var.b(false, u7r.a.RESTORE_FILE_STATE_RESTORE_FAILED, new ufk(th, i2));
                                                                    z5 = false;
                                                                    z6 = z5;
                                                                    u7rVar2.g = cvk.q(file);
                                                                    if (z6) {
                                                                    }
                                                                }
                                                            } else {
                                                                vw3Var.b(false, u7r.a.RESTORE_FILE_STATE_FILE_NOT_EXIST, new dgm(u7rVar2, 5));
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            u7rVar2.a();
                                                            vw3Var.b(false, u7r.a.RESTORE_FILE_STATE_RESTORE_FAILED, new ufk(th, i2));
                                                            z5 = false;
                                                            z6 = z5;
                                                            u7rVar2.g = cvk.q(file);
                                                            if (z6) {
                                                            }
                                                        }
                                                    }
                                                    z6 = z5;
                                                    u7rVar2.g = cvk.q(file);
                                                    if (z6) {
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    c3958a = new wu1.a.C3958a(e);
                                                    if (epx.f(c3958a, wu1.c.a)) {
                                                    }
                                                    u7rVar2 = u7rVar;
                                                    i100 i100Var52 = i100Var;
                                                    FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                                                    fileOutputStream2.write(bArr2);
                                                    s3q0 s3q0Var3 = s3q0.a;
                                                    fileOutputStream2.close();
                                                    z5 = true;
                                                    z6 = z5;
                                                    u7rVar2.g = cvk.q(file);
                                                    if (z6) {
                                                    }
                                                }
                                            } catch (IOException e4) {
                                                e = e4;
                                                i100Var = i100Var3;
                                                i100Var4.j("DiskSpaceAllocator", new mag(e, 15));
                                                c3958a = wu1.b.a;
                                                if (epx.f(c3958a, wu1.c.a)) {
                                                }
                                                u7rVar2 = u7rVar;
                                                i100 i100Var522 = i100Var;
                                                FileOutputStream fileOutputStream22 = new FileOutputStream(file, true);
                                                fileOutputStream22.write(bArr2);
                                                s3q0 s3q0Var32 = s3q0.a;
                                                fileOutputStream22.close();
                                                z5 = true;
                                                z6 = z5;
                                                u7rVar2.g = cvk.q(file);
                                                if (z6) {
                                                }
                                            } catch (Exception e5) {
                                                e = e5;
                                                i100Var = i100Var3;
                                                c3958a = new wu1.a.C3958a(e);
                                                if (epx.f(c3958a, wu1.c.a)) {
                                                }
                                                u7rVar2 = u7rVar;
                                                i100 i100Var5222 = i100Var;
                                                FileOutputStream fileOutputStream222 = new FileOutputStream(file, true);
                                                fileOutputStream222.write(bArr2);
                                                s3q0 s3q0Var322 = s3q0.a;
                                                fileOutputStream222.close();
                                                z5 = true;
                                                z6 = z5;
                                                u7rVar2.g = cvk.q(file);
                                                if (z6) {
                                                }
                                            }
                                        }
                                    } catch (IOException e6) {
                                        e = e6;
                                        u7rVar = u7rVar3;
                                    } catch (Exception e7) {
                                        e = e7;
                                        u7rVar = u7rVar3;
                                    }
                                } catch (IOException e8) {
                                    e = e8;
                                    i100Var = i100Var3;
                                    u7rVar = u7rVar3;
                                    bArr2 = bArr;
                                } catch (Exception e9) {
                                    e = e9;
                                    i100Var = i100Var3;
                                    u7rVar = u7rVar3;
                                    bArr2 = bArr;
                                }
                            } else {
                                i100Var = i100Var3;
                                u7rVar = u7rVar3;
                                bArr2 = bArr;
                                c3958a = wu1.b.a;
                            }
                        }
                        if (!epx.f(c3958a, wu1.c.a) || epx.f(c3958a, wu1.b.a)) {
                            u7rVar2 = u7rVar;
                            i100 i100Var52222 = i100Var;
                            FileOutputStream fileOutputStream2222 = new FileOutputStream(file, true);
                            fileOutputStream2222.write(bArr2);
                            s3q0 s3q0Var3222 = s3q0.a;
                            fileOutputStream2222.close();
                            z5 = true;
                        } else {
                            if (epx.f(c3958a, wu1.a.d.a)) {
                                vw3Var.b(false, u7r.a.ALLOCATE_BYTES_STORAGE_MANAGER_IS_NULL, new l63(13));
                                u7rVar2 = u7rVar;
                            } else if (c3958a instanceof wu1.a.b) {
                                i100Var.m("FileAppender", new ozf((wu1.a.b) c3958a, 27));
                                u7rVar2 = u7rVar;
                                u7rVar2.i = true;
                            } else {
                                u7rVar2 = u7rVar;
                                if (c3958a instanceof wu1.a.C3958a) {
                                    vw3Var.b(false, u7r.a.ALLOCATE_BYTES_UNKNOWN_ERROR, new gbh((wu1.a.C3958a) c3958a, 14));
                                    z5 = false;
                                } else {
                                    if (!(c3958a instanceof wu1.a.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    vw3Var.b(false, u7r.a.ALLOCATE_BYTES_REQUIRED_BYTES_MORE_THAT_STOCK, new k6k((wu1.a.c) c3958a, 11));
                                }
                            }
                            z5 = false;
                        }
                        z6 = z5;
                    }
                    u7rVar2.g = cvk.q(file);
                }
            }
            u7rVar2 = u7rVar3;
            u7rVar2.g = cvk.q(file);
        } else {
            vw3Var.b(false, u7r.a.APPEND_CAN_NOT_ENSURE_FILE, new fgm(u7rVar3, 8));
            u7rVar2 = u7rVar3;
        }
        if (z6) {
            a(z, null);
            return;
        }
        if (z2 && u7rVar2.h) {
            a(true, null);
            c(yi80Var, z, false);
        } else {
            this.e.b(u7rVar2.i, a.APPEND_EVENT_APPEND_FAILED, new kbe(yi80Var, 21));
            this.d.getClass();
            this.m = System.currentTimeMillis();
            this.k = false;
        }
    }

    public iar(xti0 xti0Var, File file, dbq0.a aVar, rbn rbnVar, mrk0 mrk0Var, kq kqVar, vw3 vw3Var, up70 up70Var) {
        this(aVar, rbnVar, mrk0Var, kqVar, vw3Var, up70Var);
        boolean z;
        up70Var.o("FileSessionAggregator", new pff(xti0Var, 20));
        File file2 = new File(file, xti0Var.toString());
        this.h = file2;
        try {
            z = file2.exists();
        } catch (Throwable unused) {
            z = false;
        }
        if (z) {
            vw3Var.b(false, a.INIT_DIRECTORY_ALREADY_EXISTS, new m2g(this, 17));
            return;
        }
        File file3 = this.h;
        if (!cvk.l(file3 == null ? null : file3)) {
            vw3Var.b(false, a.INIT_ENSURE_DIR_FAILED, new fbh(this, 14));
        } else {
            this.g = xti0Var;
            this.k = true;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:31|(1:33)|(1:35)(1:76)|36|37|38|(3:61|62|(13:64|65|(5:67|68|(6:51|(1:53)(1:60)|54|55|56|57)|(3:46|47|48)(1:50)|49)|42|(0)|51|(0)(0)|54|55|56|57|(0)(0)|49))|40|41|42|(0)|51|(0)(0)|54|55|56|57|(0)(0)|49|29) */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0157 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public iar(String str, File file, dbq0.a aVar, rbn rbnVar, mrk0 mrk0Var, kq kqVar, vw3 vw3Var, up70 up70Var) {
        this(aVar, rbnVar, mrk0Var, kqVar, vw3Var, up70Var);
        boolean z;
        xti0 xti0Var;
        long j;
        Iterator it;
        Long l;
        boolean z2;
        boolean z3;
        hl10 b;
        dbq0 dbq0Var;
        up70Var.o("FileSessionAggregator", new har(str, 0));
        File file2 = new File(file, str);
        this.h = file2;
        try {
            z = file2.exists();
        } catch (Throwable unused) {
            z = false;
        }
        if (!z) {
            vw3Var.b(false, a.INIT_DIRECTORY_NOT_EXIST, new qbj(this, 7));
            return;
        }
        Regex regex = xti0.c;
        int P = drm0.P(str, '_', 0, 6);
        if (P != -1) {
            String D0 = erm0.D0(P, str);
            String substring = str.substring(P + 1);
            if (xti0.c.f(D0) && xti0.d.f(substring)) {
                xti0Var = new xti0(D0, UUID.fromString(substring));
                if (xti0Var != null) {
                    vw3Var.b(false, a.INIT_INVALID_DIRECTORY_NAME, new i5f(this, 22));
                    return;
                }
                this.g = xti0Var;
                LinkedList linkedList = this.i;
                this.f.o("FileSessionAggregator", new p5h(this, 15));
                File file3 = this.h;
                String[] list = (file3 == null ? null : file3).list();
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : list) {
                        if (!brm0.B(str2, "append", false)) {
                            arrayList.add(str2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    boolean z4 = true;
                    while (it2.hasNext()) {
                        String str3 = (String) it2.next();
                        dbq0.a aVar2 = this.a;
                        xti0 xti0Var2 = this.g;
                        xti0Var2 = xti0Var2 == null ? null : xti0Var2;
                        File file4 = file3 == null ? null : file3;
                        vw3 vw3Var2 = aVar2.a;
                        aVar2.b.o("UploadFile", new vq6(24, file4, str3));
                        File file5 = new File(file4, str3);
                        try {
                            z2 = file5.exists();
                        } catch (Throwable unused2) {
                            z2 = false;
                        }
                        if (z2) {
                            try {
                                z3 = file5.isFile();
                            } catch (Throwable unused3) {
                                z3 = false;
                            }
                            if (z3) {
                                try {
                                    b = dbq0.g.b(file5.getName());
                                } catch (Exception e) {
                                    vw3Var2.b(false, dbq0.a.EnumC2720a.BY_PATH_FILE_UNKNOWN_ERROR, new z4d0(e, 21));
                                }
                                if (b != null) {
                                    hl10.a aVar3 = (hl10.a) b.b();
                                    dbq0Var = new dbq0(file5, xti0Var2, Long.parseLong((String) aVar3.get(2)), Integer.parseInt((String) aVar3.get(1)), aVar2.b);
                                    if (dbq0Var != null || !z4) {
                                        new File(file3 == null ? null : file3, str3).delete();
                                        z4 = false;
                                        dbq0Var = null;
                                    }
                                    if (dbq0Var != null) {
                                        arrayList2.add(dbq0Var);
                                    }
                                }
                                dbq0Var = null;
                                if (dbq0Var != null) {
                                }
                                new File(file3 == null ? null : file3, str3).delete();
                                z4 = false;
                                dbq0Var = null;
                                if (dbq0Var != null) {
                                }
                            }
                        }
                        vw3Var2.b(false, dbq0.a.EnumC2720a.BY_PATH_FILE_NOT_EXISTS_OR_NOT_FILE, new jcf0(file5, 12));
                        dbq0Var = null;
                        if (dbq0Var != null) {
                        }
                        new File(file3 == null ? null : file3, str3).delete();
                        z4 = false;
                        dbq0Var = null;
                        if (dbq0Var != null) {
                        }
                    }
                    List D02 = j5g.D0(new h8p0(3), arrayList2);
                    if (D02 != null) {
                        Iterator it3 = D02.iterator();
                        while (it3.hasNext()) {
                            linkedList.add((dbq0) it3.next());
                        }
                    }
                }
                u7r u7rVar = (u7r) this.j.getValue();
                if (u7rVar != null) {
                    try {
                        j = u7rVar.a.lastModified();
                    } catch (Throwable unused4) {
                    }
                    a(true, Integer.valueOf(linkedList.isEmpty() ? ((dbq0) j5g.h0(linkedList)).d + 1 : 1));
                    it = linkedList.iterator();
                    if (!it.hasNext()) {
                        Long valueOf = Long.valueOf(((dbq0) it.next()).c);
                        loop3: while (true) {
                            l = valueOf;
                            while (it.hasNext()) {
                                valueOf = Long.valueOf(((dbq0) it.next()).c);
                                if (l.compareTo(valueOf) < 0) {
                                    break;
                                }
                            }
                        }
                    } else {
                        l = null;
                    }
                    this.m = Math.max(l != null ? l.longValue() : 0L, j);
                    return;
                }
                j = 0;
                a(true, Integer.valueOf(linkedList.isEmpty() ? ((dbq0) j5g.h0(linkedList)).d + 1 : 1));
                it = linkedList.iterator();
                if (!it.hasNext()) {
                }
                this.m = Math.max(l != null ? l.longValue() : 0L, j);
                return;
            }
        }
        xti0Var = null;
        if (xti0Var != null) {
        }
    }
}
