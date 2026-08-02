package xsna;

import androidx.credentials.provider.CredentialEntry;
import com.vk.dto.common.ImageSizeKey;
import io.jsonwebtoken.JwtParser;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.math.BigInteger;

/* compiled from: JsonSanitizer.java */
/* loaded from: classes13.dex */
public final class oay {
    public static final c g;
    public static final char[] h;
    public static final int[] i;
    public final int a = Math.min(Math.max(1, 64), 4096);
    public final String b;
    public int c;
    public boolean[] d;
    public StringBuilder e;
    public int f;

    /* compiled from: JsonSanitizer.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.BEFORE_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.BEFORE_ELEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.BEFORE_KEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.AFTER_KEY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.START_MAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.START_ARRAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[b.AFTER_ELEMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[b.AFTER_VALUE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: JsonSanitizer.java */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b AFTER_ELEMENT;
        public static final b AFTER_KEY;
        public static final b AFTER_VALUE;
        public static final b BEFORE_ELEMENT;
        public static final b BEFORE_KEY;
        public static final b BEFORE_VALUE;
        public static final b START_ARRAY;
        public static final b START_MAP;

        static {
            b bVar = new b("START_ARRAY", 0);
            START_ARRAY = bVar;
            b bVar2 = new b("BEFORE_ELEMENT", 1);
            BEFORE_ELEMENT = bVar2;
            b bVar3 = new b("AFTER_ELEMENT", 2);
            AFTER_ELEMENT = bVar3;
            b bVar4 = new b("START_MAP", 3);
            START_MAP = bVar4;
            b bVar5 = new b("BEFORE_KEY", 4);
            BEFORE_KEY = bVar5;
            b bVar6 = new b("AFTER_KEY", 5);
            AFTER_KEY = bVar6;
            b bVar7 = new b("BEFORE_VALUE", 6);
            BEFORE_VALUE = bVar7;
            b bVar8 = new b("AFTER_VALUE", 7);
            AFTER_VALUE = bVar8;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: JsonSanitizer.java */
    public static final class c extends Exception {
        private static final long serialVersionUID = 783239978717247850L;
    }

    static {
        c cVar = new c();
        g = cVar;
        cVar.setStackTrace(new StackTraceElement[0]);
        h = new char[]{ImageSizeKey.SIZE_KEY_UNDEFINED, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        i = new int[]{-1, -1, 63, 39, 31, 27, 24, 22, 21, 19, 18, 18, 17, 17, 16, 16, 15};
    }

    public oay(String str) {
        this.b = str == null ? "null" : str;
    }

    public static int e(char c2) {
        int i2 = c2 | ' ';
        return i2 - (i2 <= 57 ? 48 : 87);
    }

    public static boolean f(char c2) {
        if ('0' <= c2 && c2 <= '9') {
            return true;
        }
        int i2 = c2 | ' ';
        return 97 <= i2 && i2 <= 102;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x036b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a A[Catch: c -> 0x0092, TryCatch #3 {c -> 0x0092, blocks: (B:32:0x0062, B:37:0x0088, B:55:0x009a, B:57:0x00a1, B:62:0x00b6, B:64:0x00bb, B:70:0x00e6, B:165:0x00c9, B:167:0x00cf), top: B:31:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1 A[Catch: c -> 0x0092, TryCatch #3 {c -> 0x0092, blocks: (B:32:0x0062, B:37:0x0088, B:55:0x009a, B:57:0x00a1, B:62:0x00b6, B:64:0x00bb, B:70:0x00e6, B:165:0x00c9, B:167:0x00cf), top: B:31:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6 A[Catch: c -> 0x0092, TryCatch #3 {c -> 0x0092, blocks: (B:32:0x0062, B:37:0x0088, B:55:0x009a, B:57:0x00a1, B:62:0x00b6, B:64:0x00bb, B:70:0x00e6, B:165:0x00c9, B:167:0x00cf), top: B:31:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0153 A[Catch: c -> 0x0147, TryCatch #0 {c -> 0x0147, blocks: (B:90:0x013c, B:92:0x0144, B:78:0x014f, B:80:0x0153, B:82:0x015a, B:83:0x0175, B:84:0x0161, B:86:0x0167, B:88:0x016d, B:186:0x017c, B:211:0x0190, B:240:0x0194, B:213:0x019f, B:222:0x01bf, B:226:0x01d2, B:227:0x01d7, B:229:0x01db, B:232:0x01e4, B:234:0x01e7, B:236:0x01b4, B:237:0x01b8, B:238:0x01bc, B:243:0x01eb, B:245:0x01f3, B:249:0x0200, B:251:0x020c, B:252:0x0210, B:254:0x0214, B:256:0x021a, B:257:0x021e), top: B:89:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String l(String str) {
        char c2;
        char c3;
        StringBuilder sb;
        int i2;
        int i3;
        int length;
        int i4;
        char c4;
        b bVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        oay oayVar = new oay(str);
        boolean z5 = false;
        oayVar.f = 0;
        oayVar.c = 0;
        oayVar.e = null;
        b bVar2 = b.START_ARRAY;
        String str2 = oayVar.b;
        int length2 = str2.length();
        int i5 = 0;
        while (true) {
            if (i5 < length2) {
                try {
                    char charAt = str2.charAt(i5);
                    if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                        if (charAt == '\"') {
                            c2 = '}';
                            c3 = ']';
                        } else if (charAt == ',') {
                            c2 = '}';
                            c3 = ']';
                            if (oayVar.c == 0) {
                                throw g;
                            }
                            switch (a.a[bVar2.ordinal()]) {
                                case 1:
                                    oayVar.j(i5, i5, "null");
                                    bVar2 = b.BEFORE_KEY;
                                    break;
                                case 2:
                                case 6:
                                    oayVar.j(i5, i5, "null");
                                    bVar2 = b.BEFORE_ELEMENT;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                    oayVar.b(i5, i5 + 1);
                                    break;
                                case 7:
                                    bVar2 = b.BEFORE_ELEMENT;
                                    break;
                                case 8:
                                    bVar2 = b.BEFORE_KEY;
                                    break;
                            }
                        } else if (charAt == '/') {
                            int i6 = i5 + 1;
                            if (i6 < length2) {
                                char charAt2 = str2.charAt(i6);
                                if (charAt2 == '*') {
                                    if (i5 + 3 < length2) {
                                        i4 = i5 + 2;
                                        do {
                                            i4 = str2.indexOf(47, i4 + 1);
                                            if (i4 >= 0) {
                                            }
                                        } while (str2.charAt(i4 - 1) != '*');
                                        i6 = i4 + 1;
                                    }
                                    i6 = length2;
                                } else if (charAt2 == '/') {
                                    i4 = i5 + 2;
                                    while (i4 < length2) {
                                        char charAt3 = str2.charAt(i4);
                                        if (charAt3 != '\n' && charAt3 != '\r' && charAt3 != 8232 && charAt3 != 8233) {
                                            i4++;
                                        }
                                        i6 = i4 + 1;
                                    }
                                    i6 = length2;
                                }
                            }
                            oayVar.b(i5, i6);
                            i5 = i6 - 1;
                        } else if (charAt != ':') {
                            if (charAt != '[') {
                                if (charAt != ']') {
                                    if (charAt != '{') {
                                        if (charAt != '}') {
                                            switch (charAt) {
                                                case '\'':
                                                    c3 = ']';
                                                    c2 = '}';
                                                    break;
                                                case '(':
                                                case ')':
                                                    oayVar.b(i5, i5 + 1);
                                                    z5 = false;
                                                    break;
                                                default:
                                                    int i7 = i5;
                                                    while (i7 < length2) {
                                                        try {
                                                            char charAt4 = str2.charAt(i7);
                                                            if (('a' > charAt4 || charAt4 > 'z') && !(('0' <= charAt4 && charAt4 <= '9') || charAt4 == '+' || charAt4 == '-' || charAt4 == '.' || (('A' <= charAt4 && charAt4 <= 'Z') || charAt4 == '_' || charAt4 == '$'))) {
                                                                if (i7 != i5) {
                                                                    oayVar.b(i5, i5 + 1);
                                                                } else {
                                                                    bVar2 = oayVar.k(i5, bVar2, true);
                                                                    if (('0' > charAt || charAt > '9') && charAt != '.' && charAt != '+' && charAt != '-') {
                                                                        z = false;
                                                                        if (!z) {
                                                                            int i8 = i7 - i5;
                                                                            if (i8 == 5) {
                                                                                z4 = CredentialEntry.FALSE_STRING.regionMatches(0, str2, i5, i8);
                                                                            } else {
                                                                                if (i8 != 4 || (!"null".regionMatches(0, str2, i5, i8) && !"true".regionMatches(0, str2, i5, i8))) {
                                                                                    z4 = false;
                                                                                }
                                                                                z4 = true;
                                                                            }
                                                                            if (z4) {
                                                                                z2 = true;
                                                                                if (z && !z2) {
                                                                                    while (true) {
                                                                                        if (i7 < length2) {
                                                                                            char charAt5 = str2.charAt(i7);
                                                                                            if (charAt5 <= ' ') {
                                                                                                z3 = true;
                                                                                                c4 = '}';
                                                                                                c3 = ']';
                                                                                            } else {
                                                                                                if (charAt5 == '\"') {
                                                                                                    c4 = '}';
                                                                                                } else if (charAt5 == ',') {
                                                                                                    c4 = '}';
                                                                                                } else if (charAt5 == ':') {
                                                                                                    c4 = '}';
                                                                                                    c3 = ']';
                                                                                                    z3 = true;
                                                                                                } else if (charAt5 != '[') {
                                                                                                    c3 = ']';
                                                                                                    if (charAt5 == ']' || charAt5 == '{') {
                                                                                                        c4 = '}';
                                                                                                    } else {
                                                                                                        c4 = '}';
                                                                                                        if (charAt5 != '}') {
                                                                                                            z3 = false;
                                                                                                        }
                                                                                                    }
                                                                                                    z3 = true;
                                                                                                } else {
                                                                                                    c4 = '}';
                                                                                                    c3 = ']';
                                                                                                    z3 = true;
                                                                                                }
                                                                                                c3 = ']';
                                                                                                z3 = true;
                                                                                            }
                                                                                            if (!z3) {
                                                                                                i7++;
                                                                                            }
                                                                                        } else {
                                                                                            c4 = '}';
                                                                                            c3 = ']';
                                                                                        }
                                                                                    }
                                                                                    if (i7 < length2) {
                                                                                        try {
                                                                                            if (str2.charAt(i7) == '\"') {
                                                                                                i7++;
                                                                                            }
                                                                                        } catch (c unused) {
                                                                                            c2 = c4;
                                                                                            oayVar.b(i5, str2.length());
                                                                                            if (bVar2 == b.START_ARRAY) {
                                                                                                oayVar.j(length2, length2, "null");
                                                                                                bVar2 = b.AFTER_ELEMENT;
                                                                                                break;
                                                                                            }
                                                                                            sb = oayVar.e;
                                                                                            if (sb != null) {
                                                                                                if (oayVar.e == null) {
                                                                                                }
                                                                                                oayVar.e.append((CharSequence) str2, oayVar.f, length2);
                                                                                                oayVar.f = length2;
                                                                                                i2 = a.a[bVar2.ordinal()];
                                                                                                if (i2 == 1) {
                                                                                                }
                                                                                                while (true) {
                                                                                                    i3 = oayVar.c;
                                                                                                    if (i3 != 0) {
                                                                                                    }
                                                                                                    r2.append(r3[r1] ? c2 : c3);
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                            if (oayVar.e == null) {
                                                                                            }
                                                                                            oayVar.e.append((CharSequence) str2, oayVar.f, length2);
                                                                                            oayVar.f = length2;
                                                                                            i2 = a.a[bVar2.ordinal()];
                                                                                            if (i2 == 1) {
                                                                                            }
                                                                                            while (true) {
                                                                                                i3 = oayVar.c;
                                                                                                if (i3 != 0) {
                                                                                                }
                                                                                                r2.append(r3[r1] ? c2 : c3);
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (bVar2 == b.AFTER_KEY) {
                                                                                    oayVar.i(i5, i5, '\"');
                                                                                    if (z) {
                                                                                        oayVar.a(i5, i7);
                                                                                        oayVar.i(i7, i7, '\"');
                                                                                    } else {
                                                                                        oayVar.m(i5, i7);
                                                                                    }
                                                                                } else if (z) {
                                                                                    oayVar.h(i5, i7);
                                                                                } else if (!z2) {
                                                                                    oayVar.i(i5, i5, '\"');
                                                                                    oayVar.m(i5, i7);
                                                                                }
                                                                                i5 = i7 - 1;
                                                                            }
                                                                        }
                                                                        z2 = false;
                                                                        if (z) {
                                                                        }
                                                                        if (bVar2 == b.AFTER_KEY) {
                                                                        }
                                                                        i5 = i7 - 1;
                                                                    }
                                                                    z = true;
                                                                    if (!z) {
                                                                    }
                                                                    z2 = false;
                                                                    if (z) {
                                                                    }
                                                                    if (bVar2 == b.AFTER_KEY) {
                                                                    }
                                                                    i5 = i7 - 1;
                                                                }
                                                                z5 = false;
                                                                break;
                                                            } else {
                                                                i7++;
                                                            }
                                                        } catch (c unused2) {
                                                            c3 = ']';
                                                            c2 = '}';
                                                            oayVar.b(i5, str2.length());
                                                            if (bVar2 == b.START_ARRAY) {
                                                            }
                                                            sb = oayVar.e;
                                                            if (sb != null) {
                                                            }
                                                            if (oayVar.e == null) {
                                                            }
                                                            oayVar.e.append((CharSequence) str2, oayVar.f, length2);
                                                            oayVar.f = length2;
                                                            i2 = a.a[bVar2.ordinal()];
                                                            if (i2 == 1) {
                                                            }
                                                            while (true) {
                                                                i3 = oayVar.c;
                                                                if (i3 != 0) {
                                                                }
                                                                r2.append(r3[r1] ? c2 : c3);
                                                            }
                                                        }
                                                    }
                                                    if (i7 != i5) {
                                                    }
                                                    z5 = false;
                                                    break;
                                            }
                                        }
                                    }
                                }
                                c4 = '}';
                                c3 = ']';
                                if (oayVar.c == 0) {
                                    oayVar.b(i5, str2.length());
                                    c2 = '}';
                                } else {
                                    int i9 = a.a[bVar2.ordinal()];
                                    if (i9 == 1) {
                                        oayVar.j(i5, i5, "null");
                                    } else if (i9 == 2 || i9 == 3) {
                                        oayVar.c(i5);
                                    } else if (i9 == 4) {
                                        oayVar.j(i5, i5, ":null");
                                    }
                                    int i10 = oayVar.c - 1;
                                    oayVar.c = i10;
                                    char c5 = oayVar.d[i10] ? '}' : ']';
                                    if (charAt != c5) {
                                        oayVar.i(i5, i5 + 1, c5);
                                    }
                                    int i11 = oayVar.c;
                                    if (i11 != 0 && oayVar.d[i11 - 1]) {
                                        bVar = b.AFTER_VALUE;
                                        bVar2 = bVar;
                                        z5 = false;
                                    }
                                    bVar = b.AFTER_ELEMENT;
                                    bVar2 = bVar;
                                    z5 = false;
                                }
                            }
                            oayVar.k(i5, bVar2, z5);
                            if (oayVar.d == null) {
                                oayVar.d = new boolean[oayVar.a];
                            }
                            boolean z6 = charAt == '{' ? true : z5;
                            boolean[] zArr = oayVar.d;
                            int i12 = oayVar.c;
                            zArr[i12] = z6;
                            oayVar.c = i12 + 1;
                            bVar2 = z6 ? b.START_MAP : b.START_ARRAY;
                        } else if (bVar2 == b.AFTER_KEY) {
                            bVar2 = b.BEFORE_VALUE;
                        } else {
                            oayVar.b(i5, i5 + 1);
                        }
                        int i13 = 1;
                        try {
                            bVar2 = oayVar.k(i5, bVar2, true);
                            char charAt6 = str2.charAt(i5);
                            int i14 = i5;
                            while (true) {
                                i14 = str2.indexOf(charAt6, i14 + i13);
                                if (i14 >= 0) {
                                    int i15 = i14;
                                    while (i15 > i5 && str2.charAt(i15 - 1) == '\\') {
                                        i15--;
                                    }
                                    if (((i14 - i15) & 1) == 0) {
                                        length = i14 + 1;
                                    } else {
                                        i13 = 1;
                                    }
                                } else {
                                    length = str2.length();
                                }
                            }
                            oayVar.m(i5, length);
                            i5 = length - 1;
                        } catch (c unused3) {
                            oayVar.b(i5, str2.length());
                            if (bVar2 == b.START_ARRAY) {
                            }
                            sb = oayVar.e;
                            if (sb != null) {
                            }
                            if (oayVar.e == null) {
                            }
                            oayVar.e.append((CharSequence) str2, oayVar.f, length2);
                            oayVar.f = length2;
                            i2 = a.a[bVar2.ordinal()];
                            if (i2 == 1) {
                            }
                            while (true) {
                                i3 = oayVar.c;
                                if (i3 != 0) {
                                }
                                r2.append(r3[r1] ? c2 : c3);
                            }
                        }
                    }
                    i5++;
                } catch (c unused4) {
                    c2 = '}';
                    c3 = ']';
                }
            } else {
                c2 = '}';
                c3 = ']';
            }
        }
        if (bVar2 == b.START_ARRAY && oayVar.c == 0) {
            oayVar.j(length2, length2, "null");
            bVar2 = b.AFTER_ELEMENT;
        }
        sb = oayVar.e;
        if ((sb != null && sb.length() != 0) || oayVar.f != 0 || oayVar.c != 0) {
            if (oayVar.e == null) {
                oayVar.e = new StringBuilder(oayVar.c + length2);
            }
            oayVar.e.append((CharSequence) str2, oayVar.f, length2);
            oayVar.f = length2;
            i2 = a.a[bVar2.ordinal()];
            if (i2 == 1) {
                oayVar.e.append("null");
            } else if (i2 == 2 || i2 == 3) {
                oayVar.c(length2);
            } else if (i2 == 4) {
                oayVar.e.append(":null");
            }
            while (true) {
                i3 = oayVar.c;
                if (i3 != 0) {
                    StringBuilder sb2 = oayVar.e;
                    boolean[] zArr2 = oayVar.d;
                    int i16 = i3 - 1;
                    oayVar.c = i16;
                    sb2.append(zArr2[i16] ? c2 : c3);
                }
            }
        }
        return oayVar.toString();
    }

    public static int n(int i2, String str) {
        char charAt;
        char charAt2;
        int length = str.length();
        int i3 = 0;
        if (i2 >= length) {
            return 0;
        }
        char charAt3 = str.charAt(i2);
        if (charAt3 != '\\') {
            return charAt3 | 0;
        }
        int i4 = i2 + 1;
        if (i4 == length) {
            return 65536;
        }
        char charAt4 = str.charAt(i4);
        if (charAt4 == 'b') {
            return 131080;
        }
        if (charAt4 == 'f') {
            return 131084;
        }
        if (charAt4 == 'n') {
            return 131082;
        }
        if (charAt4 == 'r') {
            return 131085;
        }
        if (charAt4 != 'x') {
            switch (charAt4) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    int i5 = i2 + 2;
                    if (i5 < length && '0' <= (charAt = str.charAt(i5)) && charAt <= '7') {
                        i5 = i2 + 3;
                        if (charAt4 <= '3' && i5 < length && '0' <= (charAt2 = str.charAt(i5)) && charAt2 <= '7') {
                            i5 = i2 + 4;
                        }
                    }
                    while (i4 < i5) {
                        i3 = (i3 << 3) | (str.charAt(i4) - ImageSizeKey.SIZE_KEY_UNDEFINED);
                        i4++;
                    }
                    return ((i5 - i2) << 16) | i3;
                default:
                    switch (charAt4) {
                        case 't':
                            return 131081;
                        case ASSET_FAILED_STATUS_CODE_VALUE:
                            int i6 = i2 + 5;
                            if (i6 < length) {
                                char charAt5 = str.charAt(i2 + 2);
                                char charAt6 = str.charAt(i2 + 3);
                                char charAt7 = str.charAt(i2 + 4);
                                char charAt8 = str.charAt(i6);
                                if (f(charAt5) && f(charAt6) && f(charAt7) && f(charAt8)) {
                                    return (e(charAt7) << 4) | (e(charAt5) << 12) | 393216 | (e(charAt6) << 8) | e(charAt8);
                                }
                            }
                            break;
                        case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                            return 131080;
                    }
            }
        } else {
            int i7 = i2 + 3;
            if (i7 < length) {
                char charAt9 = str.charAt(i2 + 2);
                char charAt10 = str.charAt(i7);
                if (f(charAt9) && f(charAt10)) {
                    return (e(charAt9) << 4) | SQLiteDatabase.OPEN_PRIVATECACHE | e(charAt10);
                }
            }
        }
        return 0 | charAt4;
    }

    public static int o(int i2, String str) {
        int i3;
        if (i2 < 0) {
            return 0;
        }
        int i4 = 1;
        while (true) {
            if (i4 >= 6 || (i3 = i2 - i4) < 0) {
                break;
            }
            if (str.charAt(i3) == '\\') {
                int i5 = 1;
                while (true) {
                    int i6 = i3 - i5;
                    if (i6 < 0 || str.charAt(i6) != '\\') {
                        break;
                    }
                    i5++;
                }
                if ((i5 & 1) == 1) {
                    int n = n(i3, str);
                    if ((n >>> 16) - 1 == i4) {
                        return n;
                    }
                }
            } else {
                i4++;
            }
        }
        return str.charAt(i2) | 0;
    }

    public final void a(int i2, int i3) {
        int i4;
        int parseInt;
        int i5;
        int i6;
        char c2;
        char charAt;
        char charAt2;
        b(i2, i2);
        int length = this.e.length();
        h(i2, i3);
        b(i3, i3);
        int length2 = this.e.length();
        StringBuilder sb = this.e;
        int i7 = (sb.charAt(length) == '-' ? 1 : 0) + length;
        int i8 = i7;
        while (i8 < length2 && '0' <= (charAt2 = sb.charAt(i8)) && charAt2 <= '9') {
            i8++;
        }
        if (i8 != length2 && '.' == sb.charAt(i8)) {
            do {
                i8++;
                if (i8 >= length2 || '0' > (charAt = sb.charAt(i8))) {
                    break;
                }
            } while (charAt <= '9');
        }
        if (i8 == length2) {
            i4 = length2;
        } else {
            i4 = i8 + 1;
            if (sb.charAt(i4) == '+') {
                i4 = i8 + 2;
            }
        }
        if (length2 == i4) {
            parseInt = 0;
        } else {
            try {
                parseInt = Integer.parseInt(sb.substring(i4, length2), 10);
            } catch (NumberFormatException unused) {
                return;
            }
        }
        int i9 = i7;
        int i10 = i9;
        boolean z = false;
        int i11 = 0;
        boolean z2 = true;
        while (i9 < i8) {
            char charAt3 = sb.charAt(i9);
            if (charAt3 == '.') {
                if (z2) {
                    i11 = 0;
                }
                z = true;
            } else {
                if ((!z2 || charAt3 != '0') && !z) {
                    parseInt++;
                }
                if (charAt3 == '0') {
                    i11++;
                } else {
                    if (z2) {
                        if (z) {
                            parseInt -= i11;
                        }
                        i5 = parseInt;
                        i6 = 0;
                    } else {
                        int i12 = i11;
                        i5 = parseInt;
                        i6 = i12;
                    }
                    while (true) {
                        if (i6 == 0 && charAt3 == 0) {
                            break;
                        }
                        if (i6 == 0) {
                            c2 = 0;
                        } else {
                            i6--;
                            c2 = charAt3;
                            charAt3 = '0';
                        }
                        sb.setCharAt(i10, charAt3);
                        charAt3 = c2;
                        i10++;
                    }
                    int i13 = i5;
                    i11 = i6;
                    parseInt = i13;
                    z2 = false;
                }
            }
            i9++;
        }
        sb.setLength(i10);
        int i14 = i10 - i7;
        if (z2) {
            sb.setLength(length);
            sb.append(ImageSizeKey.SIZE_KEY_UNDEFINED);
            return;
        }
        if (i14 <= parseInt && parseInt <= 21) {
            while (i14 < parseInt) {
                sb.append(ImageSizeKey.SIZE_KEY_UNDEFINED);
                i14++;
            }
        } else {
            if (parseInt > 0 && parseInt <= 21) {
                sb.insert(i7 + parseInt, JwtParser.SEPARATOR_CHAR);
                return;
            }
            if (-6 < parseInt && parseInt <= 0) {
                sb.insert(i7, "0.000000".substring(0, 2 - parseInt));
                return;
            }
            if (i14 != 1) {
                sb.insert(i7 + 1, JwtParser.SEPARATOR_CHAR);
            }
            int i15 = parseInt - 1;
            sb.append('e');
            sb.append(i15 < 0 ? '-' : '+');
            sb.append(Math.abs(i15));
        }
    }

    public final void b(int i2, int i3) {
        StringBuilder sb = this.e;
        String str = this.b;
        if (sb == null) {
            this.e = new StringBuilder(str.length() + 16);
        }
        this.e.append((CharSequence) str, this.f, i2);
        this.f = i3;
    }

    public final void c(int i2) {
        while (true) {
            int i3 = i2 - 1;
            int i4 = this.f;
            String str = this.b;
            if (i3 >= i4) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                    if (charAt == ',') {
                        b(i3, i2);
                        return;
                    } else {
                        throw new AssertionError("" + str.charAt(i3));
                    }
                }
                i2 = i3;
            } else {
                int length = this.e.length();
                while (true) {
                    length--;
                    if (length < 0) {
                        throw new AssertionError("Trailing comma not found in " + str + " or " + ((Object) this.e));
                    }
                    char charAt2 = this.e.charAt(length);
                    if (charAt2 != '\t' && charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ') {
                        if (charAt2 == ',') {
                            this.e.setLength(length);
                            return;
                        } else {
                            throw new AssertionError("" + this.e.charAt(length));
                        }
                    }
                }
            }
        }
    }

    public final int d(int i2, int i3) {
        while (i2 < i3) {
            char charAt = this.b.charAt(i2);
            if ('0' > charAt || charAt > '9') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public final boolean g(int i2) {
        return f(this.b.charAt(i2));
    }

    public final void h(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        char charAt;
        String str = this.b;
        if (i2 < i3) {
            char charAt2 = str.charAt(i2);
            if (charAt2 == '+') {
                int i8 = i2 + 1;
                b(i2, i8);
                i2 = i8;
            } else if (charAt2 == '-') {
                i2++;
            }
        }
        int d = d(i2, i3);
        if (i2 == d) {
            i(i2, i2, ImageSizeKey.SIZE_KEY_UNDEFINED);
        } else if ('0' == str.charAt(i2)) {
            int i9 = d - i2;
            int i10 = 16;
            int i11 = 0;
            boolean z = true;
            if (i9 == 1 && d < i3 && 120 == (str.charAt(d) | ' ')) {
                int i12 = d + 1;
                int i13 = i12;
                while (i13 < i3) {
                    char charAt3 = str.charAt(i13);
                    if ('0' > charAt3 || charAt3 > '9') {
                        char c2 = (char) (charAt3 | ' ');
                        if ('a' > c2 || c2 > 'f') {
                            break;
                        } else {
                            i7 = c2 - 'W';
                        }
                    } else {
                        i7 = charAt3 - '0';
                    }
                    i11 = Math.max(i7, i11);
                    i13++;
                }
                int i14 = i13;
                i4 = i12;
                d = i14;
                i5 = i11;
                i6 = 16;
            } else if (i9 > 1) {
                for (int i15 = i2; i15 < d; i15++) {
                    int charAt4 = str.charAt(i15) - ImageSizeKey.SIZE_KEY_UNDEFINED;
                    if (charAt4 < 0) {
                        break;
                    }
                    i11 = Math.max(charAt4, i11);
                }
                i5 = i11;
                i6 = 8;
                i4 = i2;
            } else {
                i4 = -1;
                z = false;
                i5 = 0;
                i6 = 10;
            }
            if (z) {
                b(i2, d);
                String substring = str.substring(i4, d);
                int length = substring.length();
                if (i6 > i5) {
                    i10 = i6;
                } else if (i5 <= 10) {
                    i10 = 10;
                }
                if (length == 0) {
                    this.e.append(ImageSizeKey.SIZE_KEY_UNDEFINED);
                } else if (i[i10] >= length) {
                    this.e.append(Long.parseLong(substring, i10));
                } else {
                    this.e.append(new BigInteger(substring, i10));
                }
            }
        }
        if (d < i3 && str.charAt(d) == '.') {
            int i16 = d + 1;
            int d2 = d(i16, i3);
            if (d2 == i16) {
                i(i16, i16, ImageSizeKey.SIZE_KEY_UNDEFINED);
            }
            d = d2;
        }
        if (d < i3 && 101 == (str.charAt(d) | ' ')) {
            int i17 = d + 1;
            if (i17 < i3 && ((charAt = str.charAt(i17)) == '+' || charAt == '-')) {
                i17 = d + 2;
            }
            d = d(i17, i3);
            if (d == i17) {
                i(i17, i17, ImageSizeKey.SIZE_KEY_UNDEFINED);
            }
        }
        if (d != i3) {
            b(d, i3);
        }
    }

    public final void i(int i2, int i3, char c2) {
        b(i2, i3);
        this.e.append(c2);
    }

    public final void j(int i2, int i3, String str) {
        b(i2, i3);
        this.e.append(str);
    }

    public final b k(int i2, b bVar, boolean z) throws c {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return b.AFTER_VALUE;
            case 2:
            case 6:
                return b.AFTER_ELEMENT;
            case 3:
            case 5:
                if (z) {
                    return b.AFTER_KEY;
                }
                j(i2, i2, "\"\":");
                return b.AFTER_VALUE;
            case 4:
                i(i2, i2, ':');
                return b.AFTER_VALUE;
            case 7:
                if (this.c == 0) {
                    throw g;
                }
                i(i2, i2, ',');
                return b.AFTER_ELEMENT;
            case 8:
                if (z) {
                    i(i2, i2, ',');
                    return b.AFTER_KEY;
                }
                j(i2, i2, ",\"\":");
                return b.AFTER_VALUE;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
    
        if (r8 <= 65533) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int i2, int i3) {
        char charAt;
        char charAt2;
        int i4;
        int i5 = i2;
        boolean z = false;
        while (i5 < i3) {
            String str = this.b;
            char charAt3 = str.charAt(i5);
            if (charAt3 == '\t') {
                j(i5, i5 + 1, "\\t");
            } else if (charAt3 == '\n') {
                j(i5, i5 + 1, "\\n");
            } else if (charAt3 == '\r') {
                j(i5, i5 + 1, "\\r");
            } else if (charAt3 == '\"' || charAt3 == '\'') {
                if (i5 != i2) {
                    int i6 = i5 + 1;
                    if (i6 == i3) {
                        char charAt4 = str.charAt(i2);
                        if (charAt4 != '\'') {
                            charAt4 = '\"';
                        }
                        z = charAt4 == charAt3;
                    }
                    if (z) {
                        if (charAt3 == '\'') {
                            i(i5, i6, '\"');
                        }
                    } else if (charAt3 == '\"') {
                        i(i5, i5, '\\');
                    }
                } else if (charAt3 == '\'') {
                    i(i5, i5 + 1, '\"');
                }
            } else if (charAt3 != '<') {
                if (charAt3 == '>') {
                    int i7 = i5 - 2;
                    if (i7 >= i2) {
                        int i8 = i5 - 1;
                        int i9 = i8;
                        while (i9 >= 0 && str.charAt(i9) == '\\') {
                            i9--;
                        }
                        if (((i8 - i9) & 1) != 1) {
                            i7 = i8;
                        }
                        int o = o(i7, str);
                        if ('-' == ((char) o) && '-' == ((char) o(i7 - (o >>> 16), str))) {
                            j(i5, i5 + 1, "\\u003e");
                        }
                    }
                } else if (charAt3 == '\\') {
                    int i10 = i5 + 1;
                    if (i10 == i3) {
                        b(i5, i10);
                    } else {
                        char charAt5 = str.charAt(i10);
                        if (charAt5 != '\"' && charAt5 != '\\' && charAt5 != 'b' && charAt5 != 'f' && charAt5 != 'n' && charAt5 != 'r') {
                            if (charAt5 != 'x') {
                                switch (charAt5) {
                                    case '/':
                                        break;
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                        int i11 = i5 + 2;
                                        if (i11 < i3 && '0' <= (charAt = str.charAt(i11)) && charAt <= '7') {
                                            i11 = i5 + 3;
                                            if (charAt5 <= '3' && i11 < i3 && '0' <= (charAt2 = str.charAt(i11)) && charAt2 <= '7') {
                                                i11 = i5 + 4;
                                            }
                                        }
                                        int i12 = 0;
                                        for (int i13 = i10; i13 < i11; i13++) {
                                            i12 = (i12 << 3) | (str.charAt(i13) - ImageSizeKey.SIZE_KEY_UNDEFINED);
                                        }
                                        j(i10, i11, "u00");
                                        int i14 = 2;
                                        while (true) {
                                            i14--;
                                            if (i14 < 0) {
                                                i5 = i11 - 1;
                                                break;
                                            } else {
                                                int i15 = (i12 >>> (i14 * 4)) & 15;
                                                this.e.append((char) (i15 + (i15 < 10 ? 48 : 87)));
                                            }
                                        }
                                        break;
                                    default:
                                        switch (charAt5) {
                                            case 't':
                                                break;
                                            case ASSET_FAILED_STATUS_CODE_VALUE:
                                                if (i5 + 6 < i3 && g(i5 + 2) && g(i5 + 3) && g(i5 + 4)) {
                                                    int i16 = i5 + 5;
                                                    if (g(i16)) {
                                                        i5 = i16;
                                                        break;
                                                    }
                                                }
                                                b(i5, i10);
                                                break;
                                            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                                j(i5, i5 + 2, "\\u0008");
                                                break;
                                            default:
                                                b(i5, i10);
                                                break;
                                        }
                                }
                                i5++;
                            } else {
                                if (i5 + 4 < i3) {
                                    int i17 = i5 + 2;
                                    if (g(i17)) {
                                        int i18 = i5 + 3;
                                        if (g(i18)) {
                                            j(i5, i17, "\\u00");
                                            i5 = i18;
                                            i5++;
                                        }
                                    }
                                }
                                b(i5, i10);
                            }
                        }
                        i5 = i10;
                        i5++;
                    }
                } else if (charAt3 != ']') {
                    if (charAt3 == 8232) {
                        j(i5, i5 + 1, "\\u2028");
                    } else if (charAt3 != 8233) {
                        if (charAt3 >= ' ') {
                            if (charAt3 >= 55296) {
                                if (charAt3 < 57344) {
                                    if (Character.isHighSurrogate(charAt3) && (i4 = i5 + 1) < i3 && Character.isLowSurrogate(str.charAt(i4))) {
                                        i5 = i4;
                                    }
                                }
                            }
                        }
                        j(i5, i5 + 1, "\\u");
                        int i19 = 4;
                        while (true) {
                            i19--;
                            if (i19 >= 0) {
                                this.e.append(h[(charAt3 >>> (i19 << 2)) & 15]);
                            }
                        }
                    } else {
                        j(i5, i5 + 1, "\\u2029");
                    }
                } else if (i5 + 2 < i3) {
                    int i20 = i5 + 1;
                    char n = (char) n(i20, str);
                    char n2 = (char) n((int) (i20 + (r13 >>> 16)), str);
                    if (']' == n && '>' == n2) {
                        j(i5, i20, "\\u005d");
                    }
                }
            } else if (i5 + 3 < i3) {
                int i21 = i5 + 1;
                int n3 = n(i21, str);
                char c2 = (char) n3;
                char n4 = (char) n((n3 >>> 16) + i21, str);
                int i22 = i5;
                char n5 = (char) n((int) (r8 + (r10 >>> 16)), str);
                char c3 = (char) (c2 | ' ');
                char c4 = (char) (n4 | ' ');
                char c5 = (char) (n5 | ' ');
                if ((c2 == '!' && n4 == '-' && n5 == '-') || ((c3 == 's' && c4 == 'c' && c5 == 'r') || (c2 == '/' && c4 == 's' && c5 == 'c'))) {
                    i5 = i22;
                    j(i5, i21, "\\u003c");
                } else {
                    i5 = i22;
                }
            }
            i5++;
        }
        if (z) {
            return;
        }
        i(i3, i3, '\"');
    }

    public final String toString() {
        StringBuilder sb = this.e;
        return sb != null ? sb.toString() : this.b;
    }
}
