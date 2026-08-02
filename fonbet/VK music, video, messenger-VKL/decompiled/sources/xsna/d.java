package xsna;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.util.ArrayList;
import okio.ByteString;

/* compiled from: Path.kt */
/* loaded from: classes11.dex */
public final class d {
    public static final ByteString a;
    public static final ByteString b;
    public static final ByteString c;
    public static final ByteString d;
    public static final ByteString e;

    static {
        ByteString byteString = new ByteString(DomExceptionUtils.SEPARATOR.getBytes(emb.b));
        byteString.c = DomExceptionUtils.SEPARATOR;
        a = byteString;
        ByteString byteString2 = new ByteString("\\".getBytes(emb.b));
        byteString2.c = "\\";
        b = byteString2;
        ByteString byteString3 = new ByteString("/\\".getBytes(emb.b));
        byteString3.c = "/\\";
        c = byteString3;
        ByteString byteString4 = new ByteString(".".getBytes(emb.b));
        byteString4.c = ".";
        d = byteString4;
        ByteString byteString5 = new ByteString("..".getBytes(emb.b));
        byteString5.c = "..";
        e = byteString5;
    }

    public static final int a(aq90 aq90Var) {
        ByteString byteString = aq90Var.b;
        if (byteString.n() != 0) {
            if (byteString.s(0) != 47) {
                if (byteString.s(0) == 92) {
                    if (byteString.n() > 2 && byteString.s(1) == 92) {
                        int p = byteString.p(2, b.r());
                        return p == -1 ? byteString.n() : p;
                    }
                } else if (byteString.n() > 2 && byteString.s(1) == 58 && byteString.s(2) == 92) {
                    char s = (char) byteString.s(0);
                    if ('a' <= s && s < '{') {
                        return 3;
                    }
                    if ('A' <= s && s < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final aq90 b(aq90 aq90Var, aq90 aq90Var2, boolean z) {
        aq90Var2.getClass();
        if (a(aq90Var2) != -1) {
            return aq90Var2;
        }
        if (aq90Var2.k() != null) {
            return aq90Var2;
        }
        ByteString c2 = c(aq90Var);
        if (c2 == null && (c2 = c(aq90Var2)) == null) {
            c2 = f(aq90.c);
        }
        vl8 vl8Var = new vl8();
        vl8Var.H(aq90Var.b);
        if (vl8Var.c > 0) {
            vl8Var.H(c2);
        }
        vl8Var.H(aq90Var2.b);
        return d(vl8Var, z);
    }

    public static final ByteString c(aq90 aq90Var) {
        ByteString byteString = aq90Var.b;
        ByteString byteString2 = a;
        if (ByteString.q(byteString, byteString2) != -1) {
            return byteString2;
        }
        ByteString byteString3 = aq90Var.b;
        ByteString byteString4 = b;
        if (ByteString.q(byteString3, byteString4) != -1) {
            return byteString4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010e A[EDGE_INSN: B:68:0x010e->B:69:0x010e BREAK  A[LOOP:1: B:20:0x00a9->B:36:0x00a9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final aq90 d(vl8 vl8Var, boolean z) {
        ByteString byteString;
        long j;
        char q;
        boolean W1;
        ByteString byteString2;
        int size;
        int i;
        ByteString F0;
        vl8 vl8Var2 = new vl8();
        ByteString byteString3 = null;
        int i2 = 0;
        while (true) {
            if (!vl8Var.t(0L, a)) {
                byteString = b;
                if (!vl8Var.t(0L, byteString)) {
                    break;
                }
            }
            byte readByte = vl8Var.readByte();
            if (byteString3 == null) {
                byteString3 = e(readByte);
            }
            i2++;
        }
        boolean z2 = i2 >= 2 && epx.f(byteString3, byteString);
        ByteString byteString4 = c;
        if (z2) {
            vl8Var2.H(byteString3);
            byteString3.B(vl8Var2, byteString3.n());
        } else if (i2 > 0) {
            vl8Var2.H(byteString3);
        } else {
            long s = vl8Var.s(0L, byteString4);
            if (byteString3 == null) {
                byteString3 = s == -1 ? f(aq90.c) : e(vl8Var.q(s));
            }
            if (epx.f(byteString3, byteString) && vl8Var.c >= 2) {
                j = -1;
                if (vl8Var.q(1L) == 58 && (('a' <= (q = (char) vl8Var.q(0L)) && q < '{') || ('A' <= q && q < '['))) {
                    if (s == 2) {
                        vl8Var2.n1(vl8Var, 3L);
                    } else {
                        vl8Var2.n1(vl8Var, 2L);
                    }
                }
                boolean z3 = vl8Var2.c <= 0;
                ArrayList arrayList = new ArrayList();
                while (true) {
                    W1 = vl8Var.W1();
                    byteString2 = d;
                    if (!W1) {
                        break;
                    }
                    long s2 = vl8Var.s(0L, byteString4);
                    if (s2 == j) {
                        F0 = vl8Var.F0(vl8Var.c);
                    } else {
                        F0 = vl8Var.F0(s2);
                        vl8Var.readByte();
                    }
                    ByteString byteString5 = e;
                    if (F0.equals(byteString5)) {
                        if (!z3 || !arrayList.isEmpty()) {
                            if (!z || (!z3 && (arrayList.isEmpty() || epx.f(j5g.i0(arrayList), byteString5)))) {
                                arrayList.add(F0);
                            } else if (!z2 || arrayList.size() != 1) {
                                g5g.J(arrayList);
                            }
                        }
                    } else if (!F0.equals(byteString2) && !F0.equals(ByteString.d)) {
                        arrayList.add(F0);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        vl8Var2.H(byteString3);
                    }
                    vl8Var2.H((ByteString) arrayList.get(i));
                }
                if (vl8Var2.c == 0) {
                    vl8Var2.H(byteString2);
                }
                return new aq90(vl8Var2.F0(vl8Var2.c));
            }
        }
        j = -1;
        if (vl8Var2.c <= 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            W1 = vl8Var.W1();
            byteString2 = d;
            if (!W1) {
            }
        }
        size = arrayList2.size();
        while (i < size) {
        }
        if (vl8Var2.c == 0) {
        }
        return new aq90(vl8Var2.F0(vl8Var2.c));
    }

    public static final ByteString e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        throw new IllegalArgumentException(lhg.a(b2, "not a directory separator: "));
    }

    public static final ByteString f(String str) {
        if (epx.f(str, DomExceptionUtils.SEPARATOR)) {
            return a;
        }
        if (epx.f(str, "\\")) {
            return b;
        }
        throw new IllegalArgumentException(go9.b("not a directory separator: ", str));
    }
}
