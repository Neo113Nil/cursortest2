package xsna;

import java.io.File;
import kotlin.text.Regex;

/* compiled from: UploadFile.kt */
/* loaded from: classes8.dex */
public final class dbq0 {
    public static final Regex g = new Regex("^upload_(\\d{4})_(\\d{16})(?:_(\\d+))?$");
    public final File a;
    public final xti0 b;
    public final long c;
    public final int d;
    public final i100 e;
    public int f;

    /* compiled from: UploadFile.kt */
    public static final class a {
        public final vw3 a;
        public final i100 b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UploadFile.kt */
        /* renamed from: xsna.dbq0$a$a, reason: collision with other inner class name */
        public static final class EnumC2720a {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ EnumC2720a[] $VALUES;
            public static final EnumC2720a BY_PATH_FILE_NOT_EXISTS_OR_NOT_FILE;
            public static final EnumC2720a BY_PATH_FILE_UNKNOWN_ERROR;
            public static final EnumC2720a GENERATE_UPLOAD_FILE_TOO_MUCH_SUFFIX_NUM;
            private final String value;

            static {
                EnumC2720a enumC2720a = new EnumC2720a("BY_PATH_FILE_NOT_EXISTS_OR_NOT_FILE", 0, "uff_bp_fneonf");
                BY_PATH_FILE_NOT_EXISTS_OR_NOT_FILE = enumC2720a;
                EnumC2720a enumC2720a2 = new EnumC2720a("BY_PATH_FILE_UNKNOWN_ERROR", 1, "uff_bp_ue");
                BY_PATH_FILE_UNKNOWN_ERROR = enumC2720a2;
                EnumC2720a enumC2720a3 = new EnumC2720a("GENERATE_UPLOAD_FILE_TOO_MUCH_SUFFIX_NUM", 2, "uff_guf_tmsn");
                GENERATE_UPLOAD_FILE_TOO_MUCH_SUFFIX_NUM = enumC2720a3;
                EnumC2720a[] enumC2720aArr = {enumC2720a, enumC2720a2, enumC2720a3};
                $VALUES = enumC2720aArr;
                $ENTRIES = new asp(enumC2720aArr);
            }

            public EnumC2720a(String str, int i, String str2) {
                this.value = str2;
            }

            public static EnumC2720a valueOf(String str) {
                return (EnumC2720a) Enum.valueOf(EnumC2720a.class, str);
            }

            public static EnumC2720a[] values() {
                return (EnumC2720a[]) $VALUES.clone();
            }

            @Override // java.lang.Enum
            public final String toString() {
                return this.value;
            }
        }

        public a(vw3 vw3Var, up70 up70Var) {
            this.a = vw3Var;
            this.b = up70Var;
        }
    }

    public dbq0(File file, xti0 xti0Var, long j, int i, i100 i100Var) {
        this.a = file;
        this.b = xti0Var;
        this.c = j;
        this.d = i;
        this.e = i100Var;
    }
}
