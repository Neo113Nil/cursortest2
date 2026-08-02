package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.collections.b;
import okio.ByteString;

/* loaded from: classes9.dex */
public abstract class lvu {
    public static final ByteString a;
    public static final ByteString b;

    static {
        ByteString byteString = new ByteString("\"\\".getBytes(uza.a));
        byteString.b = "\"\\";
        a = byteString;
        ByteString byteString2 = new ByteString("\t ,=".getBytes(uza.a));
        byteString2.b = "\t ,=";
        b = byteString2;
    }

    public static final boolean a(kvj0 kvj0Var) {
        if (jl40.l(kvj0Var.a.b, "HEAD")) {
            return false;
        }
        int i = kvj0Var.w;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || bg61.f(kvj0Var) != -1) {
            return true;
        }
        String a2 = kvj0Var.y.a("Transfer-Encoding");
        if (a2 == null) {
            a2 = null;
        }
        return "chunked".equalsIgnoreCase(a2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0103, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0103, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(yp6 yp6Var, ArrayList arrayList) {
        String c;
        int o;
        LinkedHashMap linkedHashMap;
        String c2;
        while (true) {
            String str = null;
            while (true) {
                if (str == null) {
                    d(yp6Var);
                    str = c(yp6Var);
                    if (str == null) {
                        return;
                    }
                }
                boolean d = d(yp6Var);
                c = c(yp6Var);
                if (c == null) {
                    if (yp6Var.I1()) {
                        arrayList.add(new q89(str, b.f()));
                        return;
                    }
                    return;
                }
                o = yf61.o(yp6Var);
                boolean d2 = d(yp6Var);
                if (d || (!d2 && !yp6Var.I1())) {
                    linkedHashMap = new LinkedHashMap();
                    int o2 = yf61.o(yp6Var) + o;
                    while (true) {
                        if (c == null) {
                            c = c(yp6Var);
                            if (!d(yp6Var)) {
                                o2 = yf61.o(yp6Var);
                            }
                        }
                        if (o2 != 0) {
                            if (o2 > 1 || d(yp6Var)) {
                                return;
                            }
                            if (!yp6Var.I1()) {
                                long j = 0;
                                if (yp6Var.e(0L) == 34) {
                                    if (yp6Var.readByte() != 34) {
                                        ny61.g("Failed requirement.");
                                        return;
                                    }
                                    yp6 yp6Var2 = new yp6();
                                    while (true) {
                                        long o3 = yp6Var.o(j, a);
                                        if (o3 == -1) {
                                            break;
                                        }
                                        if (yp6Var.e(o3) == 34) {
                                            yp6Var2.write(yp6Var, o3);
                                            yp6Var.readByte();
                                            c2 = yp6Var2.I0();
                                            break;
                                        } else {
                                            if (yp6Var.b == o3 + 1) {
                                                break;
                                            }
                                            yp6Var2.write(yp6Var, o3);
                                            yp6Var.readByte();
                                            yp6Var2.write(yp6Var, 1L);
                                            j = 0;
                                        }
                                    }
                                    c2 = null;
                                    if (c2 != null || ((String) linkedHashMap.put(c, c2)) != null) {
                                        return;
                                    }
                                    if (d(yp6Var) && !yp6Var.I1()) {
                                        return;
                                    } else {
                                        c = null;
                                    }
                                }
                            }
                            c2 = c(yp6Var);
                            if (c2 != null) {
                                return;
                            }
                            if (d(yp6Var)) {
                            }
                            c = null;
                        }
                    }
                }
                arrayList.add(new q89(str, linkedHashMap));
                str = c;
            }
            StringBuilder t = qv10.t(c);
            t.append(cvu0.u(o, "="));
            arrayList.add(new q89(str, Collections.singletonMap(null, t.toString())));
        }
    }

    public static final String c(yp6 yp6Var) {
        long o = yp6Var.o(0L, b);
        if (o == -1) {
            o = yp6Var.b;
        }
        if (o != 0) {
            return yp6Var.T(o, uza.a);
        }
        return null;
    }

    public static final boolean d(yp6 yp6Var) {
        boolean z = false;
        while (!yp6Var.I1()) {
            byte e = yp6Var.e(0L);
            if (e != 44) {
                if (e != 32 && e != 9) {
                    break;
                }
                yp6Var.readByte();
            } else {
                yp6Var.readByte();
                z = true;
            }
        }
        return z;
    }
}
