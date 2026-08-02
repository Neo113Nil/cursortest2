package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;

/* compiled from: FileAppender.kt */
/* loaded from: classes8.dex */
public final class u7r {
    public static final byte[] j = StringUtils.COMMA.getBytes(emb.b);
    public final File a;
    public final mrk0 b;
    public final rbn c;
    public final vw3 d;
    public final i100 e;
    public int f = 1;
    public long g;
    public boolean h;
    public boolean i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FileAppender.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ALLOCATE_BYTES_REQUIRED_BYTES_MORE_THAT_STOCK;
        public static final a ALLOCATE_BYTES_STORAGE_MANAGER_IS_NULL;
        public static final a ALLOCATE_BYTES_UNKNOWN_ERROR;
        public static final a APPEND_ATOMICALLY_APPEND_FAILED;
        public static final a APPEND_ATOMICALLY_PARENT_IS_NULL;
        public static final a APPEND_CAN_NOT_ENSURE_FILE;
        public static final a DROP_DROP_FAILED;
        public static final a DROP_IS_NOT_FILE;
        public static final a GET_DATA_FAILED;
        public static final a MOVE_CAN_NOT_RENAME;
        public static final a MOVE_DEST_FILE_EXISTS;
        public static final a MOVE_FILE_NOT_EXISTS_OR_NOT_FILE;
        public static final a RESTORE_FILE_STATE_FILE_NOT_EXIST;
        public static final a RESTORE_FILE_STATE_INVALID_LENGTH;
        public static final a RESTORE_FILE_STATE_RESTORE_FAILED;
        private final String value;

        static {
            a aVar = new a("APPEND_CAN_NOT_ENSURE_FILE", 0, "fa_a_ef");
            APPEND_CAN_NOT_ENSURE_FILE = aVar;
            a aVar2 = new a("APPEND_ATOMICALLY_PARENT_IS_NULL", 1, "fa_aa_pn");
            APPEND_ATOMICALLY_PARENT_IS_NULL = aVar2;
            a aVar3 = new a("APPEND_ATOMICALLY_APPEND_FAILED", 2, "fa_aa_af");
            APPEND_ATOMICALLY_APPEND_FAILED = aVar3;
            a aVar4 = new a("GET_DATA_FAILED", 3, "fa_gd_f");
            GET_DATA_FAILED = aVar4;
            a aVar5 = new a("ALLOCATE_BYTES_STORAGE_MANAGER_IS_NULL", 4, "fa_ab_smin");
            ALLOCATE_BYTES_STORAGE_MANAGER_IS_NULL = aVar5;
            a aVar6 = new a("ALLOCATE_BYTES_REQUIRED_BYTES_MORE_THAT_STOCK", 5, "fa_ab_rbmts");
            ALLOCATE_BYTES_REQUIRED_BYTES_MORE_THAT_STOCK = aVar6;
            a aVar7 = new a("ALLOCATE_BYTES_UNKNOWN_ERROR", 6, "fa_ab_ue");
            ALLOCATE_BYTES_UNKNOWN_ERROR = aVar7;
            a aVar8 = new a("RESTORE_FILE_STATE_FILE_NOT_EXIST", 7, "fa_rfs_fne");
            RESTORE_FILE_STATE_FILE_NOT_EXIST = aVar8;
            a aVar9 = new a("RESTORE_FILE_STATE_INVALID_LENGTH", 8, "fa_rfs_il");
            RESTORE_FILE_STATE_INVALID_LENGTH = aVar9;
            a aVar10 = new a("RESTORE_FILE_STATE_RESTORE_FAILED", 9, "fa_rfs_rf");
            RESTORE_FILE_STATE_RESTORE_FAILED = aVar10;
            a aVar11 = new a("MOVE_FILE_NOT_EXISTS_OR_NOT_FILE", 10, "fa_m_fneonf");
            MOVE_FILE_NOT_EXISTS_OR_NOT_FILE = aVar11;
            a aVar12 = new a("MOVE_DEST_FILE_EXISTS", 11, "fa_m_dfe");
            MOVE_DEST_FILE_EXISTS = aVar12;
            a aVar13 = new a("MOVE_CAN_NOT_RENAME", 12, "fa_m_cnr");
            MOVE_CAN_NOT_RENAME = aVar13;
            a aVar14 = new a("DROP_IS_NOT_FILE", 13, "fa_d_nf");
            DROP_IS_NOT_FILE = aVar14;
            a aVar15 = new a("DROP_DROP_FAILED", 14, "fa_d_df");
            DROP_DROP_FAILED = aVar15;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15};
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

    public u7r(File file, mrk0 mrk0Var, rbn rbnVar, vw3 vw3Var, i100 i100Var) {
        this.a = file;
        this.b = mrk0Var;
        this.c = rbnVar;
        this.d = vw3Var;
        this.e = i100Var;
        this.g = cvk.q(file);
    }

    public final void a() {
        boolean z;
        boolean z2;
        boolean z3;
        sfg sfgVar = new sfg(this, 17);
        i100 i100Var = this.e;
        i100Var.o("FileAppender", sfgVar);
        File file = this.a;
        try {
            z = file.exists();
        } catch (Throwable unused) {
            z = false;
        }
        if (!z) {
            i100Var.o("FileAppender", new mag(this, 21));
            return;
        }
        try {
            z2 = file.isFile();
        } catch (Throwable unused2) {
            z2 = false;
        }
        vw3 vw3Var = this.d;
        if (!z2) {
            vw3Var.b(false, a.DROP_IS_NOT_FILE, new bih(this, 17));
            return;
        }
        try {
            z3 = file.delete();
        } catch (Throwable unused3) {
            z3 = false;
        }
        if (!z3) {
            vw3Var.b(false, a.DROP_DROP_FAILED, new h1j(this, 12));
            return;
        }
        this.h = false;
        this.i = false;
        this.g = cvk.q(file);
    }
}
