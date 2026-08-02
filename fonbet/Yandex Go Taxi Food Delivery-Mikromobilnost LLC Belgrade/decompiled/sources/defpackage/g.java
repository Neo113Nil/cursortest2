package defpackage;

import java.util.ArrayList;
import kotlin.collections.a;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public abstract class g {
    public static final ByteString a;
    public static final ByteString b;
    public static final ByteString c;
    public static final ByteString d;
    public static final ByteString e;

    static {
        ByteString byteString = new ByteString("/".getBytes(uza.a));
        byteString.b = "/";
        a = byteString;
        ByteString byteString2 = new ByteString("\\".getBytes(uza.a));
        byteString2.b = "\\";
        b = byteString2;
        ByteString byteString3 = new ByteString("/\\".getBytes(uza.a));
        byteString3.b = "/\\";
        c = byteString3;
        ByteString byteString4 = new ByteString(Extension.DOT_CHAR.getBytes(uza.a));
        byteString4.b = Extension.DOT_CHAR;
        d = byteString4;
        ByteString byteString5 = new ByteString("..".getBytes(uza.a));
        byteString5.b = "..";
        e = byteString5;
    }

    public static final int a(oq90 oq90Var) {
        ByteString byteString = oq90Var.a;
        if (byteString.h() != 0) {
            if (byteString.m(0) != 47) {
                if (byteString.m(0) == 92) {
                    if (byteString.h() > 2 && byteString.m(1) == 92) {
                        int j = byteString.j(2, b.l());
                        return j == -1 ? byteString.h() : j;
                    }
                } else if (byteString.h() > 2 && byteString.m(1) == 58 && byteString.m(2) == 92) {
                    char m = (char) byteString.m(0);
                    if ('a' <= m && m < '{') {
                        return 3;
                    }
                    if ('A' <= m && m < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final oq90 b(oq90 oq90Var, oq90 oq90Var2, boolean z) {
        if (a(oq90Var2) != -1 || oq90Var2.f() != null) {
            return oq90Var2;
        }
        ByteString c2 = c(oq90Var);
        if (c2 == null && (c2 = c(oq90Var2)) == null) {
            c2 = f(oq90.b);
        }
        yp6 yp6Var = new yp6();
        yp6Var.b0(oq90Var.a);
        if (yp6Var.b > 0) {
            yp6Var.b0(c2);
        }
        yp6Var.b0(oq90Var2.a);
        return d(yp6Var, z);
    }

    public static final ByteString c(oq90 oq90Var) {
        ByteString byteString = oq90Var.a;
        ByteString byteString2 = a;
        if (ByteString.k(byteString, byteString2) != -1) {
            return byteString2;
        }
        ByteString byteString3 = oq90Var.a;
        ByteString byteString4 = b;
        if (ByteString.k(byteString3, byteString4) != -1) {
            return byteString4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010a A[EDGE_INSN: B:68:0x010a->B:69:0x010a BREAK  A[LOOP:1: B:20:0x00a5->B:36:0x00a5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final oq90 d(yp6 yp6Var, boolean z) {
        ByteString byteString;
        long j;
        char e2;
        boolean I1;
        ByteString byteString2;
        int size;
        int i;
        ByteString l0;
        yp6 yp6Var2 = new yp6();
        ByteString byteString3 = null;
        int i2 = 0;
        while (true) {
            if (!yp6Var.Q(0L, a)) {
                byteString = b;
                if (!yp6Var.Q(0L, byteString)) {
                    break;
                }
            }
            byte readByte = yp6Var.readByte();
            if (byteString3 == null) {
                byteString3 = e(readByte);
            }
            i2++;
        }
        boolean z2 = i2 >= 2 && jl40.l(byteString3, byteString);
        ByteString byteString4 = c;
        if (z2) {
            yp6Var2.b0(byteString3);
            yp6Var2.b0(byteString3);
        } else if (i2 > 0) {
            yp6Var2.b0(byteString3);
        } else {
            long o = yp6Var.o(0L, byteString4);
            if (byteString3 == null) {
                byteString3 = o == -1 ? f(oq90.b) : e(yp6Var.e(o));
            }
            if (jl40.l(byteString3, byteString) && yp6Var.b >= 2) {
                j = -1;
                if (yp6Var.e(1L) == 58 && (('a' <= (e2 = (char) yp6Var.e(0L)) && e2 < '{') || ('A' <= e2 && e2 < '['))) {
                    if (o == 2) {
                        yp6Var2.write(yp6Var, 3L);
                    } else {
                        yp6Var2.write(yp6Var, 2L);
                    }
                }
                boolean z3 = yp6Var2.b <= 0;
                ArrayList arrayList = new ArrayList();
                while (true) {
                    I1 = yp6Var.I1();
                    byteString2 = d;
                    if (!I1) {
                        break;
                    }
                    long o2 = yp6Var.o(0L, byteString4);
                    if (o2 == j) {
                        l0 = yp6Var.l0(yp6Var.b);
                    } else {
                        l0 = yp6Var.l0(o2);
                        yp6Var.readByte();
                    }
                    ByteString byteString5 = e;
                    if (l0.equals(byteString5)) {
                        if (!z3 || !arrayList.isEmpty()) {
                            if (!z || (!z3 && (arrayList.isEmpty() || jl40.l(a.Z(arrayList), byteString5)))) {
                                arrayList.add(l0);
                            } else if (!z2 || arrayList.size() != 1) {
                                ycc.A(arrayList);
                            }
                        }
                    } else if (!l0.equals(byteString2) && !l0.equals(ByteString.c)) {
                        arrayList.add(l0);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        yp6Var2.b0(byteString3);
                    }
                    yp6Var2.b0((ByteString) arrayList.get(i));
                }
                if (yp6Var2.b == 0) {
                    yp6Var2.b0(byteString2);
                }
                return new oq90(yp6Var2.l0(yp6Var2.b));
            }
        }
        j = -1;
        if (yp6Var2.b <= 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            I1 = yp6Var.I1();
            byteString2 = d;
            if (!I1) {
            }
        }
        size = arrayList2.size();
        while (i < size) {
        }
        if (yp6Var2.b == 0) {
        }
        return new oq90(yp6Var2.l0(yp6Var2.b));
    }

    public static final ByteString e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        ny61.g(oyr.i(b2, "not a directory separator: "));
        return null;
    }

    public static final ByteString f(String str) {
        if (jl40.l(str, "/")) {
            return a;
        }
        if (jl40.l(str, "\\")) {
            return b;
        }
        ny61.g(g8e.o("not a directory separator: ", str));
        return null;
    }
}
