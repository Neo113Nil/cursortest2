package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import com.yandex.xplat.common.YSError;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes10.dex */
public abstract class m83 {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, 104, Constants.VPN_TRAFFIC, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final YSError a(Throwable th) {
        return new YSError(smw0.j("Failure from Throwable: ", "\nUnderlying stack trace: ", Log.getStackTraceString(th), th), null);
    }

    public static yma b(y9j0 y9j0Var, ViewGroup viewGroup, rqc rqcVar) {
        y9j0Var.getClass();
        viewGroup.getClass();
        yma ymaVar = new yma();
        ymaVar.a = n3w.a(viewGroup);
        n3w a2 = n3w.a(rqcVar);
        n6g n6gVar = new n6g(y9j0Var, 0);
        n6g n6gVar2 = new n6g(y9j0Var, 5);
        int i = 2;
        n7i0 n7i0Var = new n7i0(n6gVar, n6gVar2, i);
        n6g n6gVar3 = new n6g(y9j0Var, i);
        byte b2 = 0;
        ymaVar.b = i5m.b(new vfg0(ymaVar.a, a2, n7i0Var, new taj0(new tgb0(n6gVar3, new tgb0(n6gVar3, new i1w(n6gVar, new n6g(y9j0Var, 3), new n6g(y9j0Var, 16), new n6g(y9j0Var, 1), new n6g(y9j0Var, 17), new n6g(y9j0Var, 9), new n6g(y9j0Var, 10), new n6g(y9j0Var, 13), new n6g(y9j0Var, 11), new n6g(y9j0Var, 6), new n6g(y9j0Var, 7), new n6g(y9j0Var, 8), new n6g(y9j0Var, 14), new n6g(y9j0Var, 4), new n6g(y9j0Var, 15), n6gVar2, 1), new n6g(y9j0Var, 12), 23, b2), new n7i0(n6gVar, new n6g(y9j0Var, 18), 3), 24, b2), 1), 7));
        return ymaVar;
    }

    public static final ExecutorService c(String str) {
        q7x0 q7x0Var = zmx.a;
        return Executors.newSingleThreadExecutor(new ywd(str, 1));
    }

    public static int d(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = b[i];
        if (i4 == 44100) {
            return ((i2 % 2) + f[i3]) * 2;
        }
        int i5 = e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static hb e(df90 df90Var) {
        int i;
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int g;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int e2 = df90Var.e();
        df90Var.o(40);
        boolean z = df90Var.g(5) > 10;
        df90Var.m(e2);
        int[] iArr = d;
        int[] iArr2 = b;
        if (z) {
            df90Var.o(16);
            int g2 = df90Var.g(2);
            if (g2 == 0) {
                r8 = 0;
            } else if (g2 == 1) {
                r8 = 1;
            } else if (g2 == 2) {
                r8 = 2;
            }
            df90Var.o(3);
            int g3 = (df90Var.g(11) + 1) * 2;
            int g4 = df90Var.g(2);
            if (g4 == 3) {
                i7 = c[df90Var.g(2)];
                g = 3;
                i8 = 6;
            } else {
                g = df90Var.g(2);
                int i13 = a[g];
                i7 = iArr2[g4];
                i8 = i13;
            }
            int i14 = i8 * 256;
            int i15 = (g3 * i7) / (i8 * 32);
            int g5 = df90Var.g(3);
            boolean f2 = df90Var.f();
            int i16 = iArr[g5] + (f2 ? 1 : 0);
            df90Var.o(10);
            if (df90Var.f()) {
                df90Var.o(8);
            }
            if (g5 == 0) {
                df90Var.o(5);
                if (df90Var.f()) {
                    df90Var.o(8);
                }
            }
            if (r8 == 1 && df90Var.f()) {
                df90Var.o(16);
            }
            if (df90Var.f()) {
                if (g5 > 2) {
                    df90Var.o(2);
                }
                if ((g5 & 1) == 0 || g5 <= 2) {
                    i10 = 6;
                } else {
                    i10 = 6;
                    df90Var.o(6);
                }
                if ((g5 & 4) != 0) {
                    df90Var.o(i10);
                }
                if (f2 && df90Var.f()) {
                    df90Var.o(5);
                }
                if (r8 == 0) {
                    if (df90Var.f()) {
                        i11 = 6;
                        df90Var.o(6);
                    } else {
                        i11 = 6;
                    }
                    if (g5 == 0 && df90Var.f()) {
                        df90Var.o(i11);
                    }
                    if (df90Var.f()) {
                        df90Var.o(i11);
                    }
                    int g6 = df90Var.g(2);
                    if (g6 == 1) {
                        df90Var.o(5);
                        i12 = 2;
                    } else {
                        if (g6 == 2) {
                            df90Var.o(12);
                        } else if (g6 == 3) {
                            int g7 = df90Var.g(5);
                            if (df90Var.f()) {
                                df90Var.o(5);
                                if (df90Var.f()) {
                                    df90Var.o(4);
                                }
                                if (df90Var.f()) {
                                    df90Var.o(4);
                                }
                                if (df90Var.f()) {
                                    df90Var.o(4);
                                }
                                if (df90Var.f()) {
                                    df90Var.o(4);
                                }
                                if (df90Var.f()) {
                                    df90Var.o(4);
                                }
                                if (df90Var.f()) {
                                    df90Var.o(4);
                                }
                                if (df90Var.f()) {
                                    df90Var.o(4);
                                }
                                if (df90Var.f()) {
                                    if (df90Var.f()) {
                                        df90Var.o(4);
                                    }
                                    if (df90Var.f()) {
                                        df90Var.o(4);
                                    }
                                }
                            }
                            if (df90Var.f()) {
                                df90Var.o(5);
                                if (df90Var.f()) {
                                    df90Var.o(7);
                                    if (df90Var.f()) {
                                        df90Var.o(8);
                                        i12 = 2;
                                        df90Var.o((g7 + i12) * 8);
                                        df90Var.c();
                                    }
                                }
                            }
                            i12 = 2;
                            df90Var.o((g7 + i12) * 8);
                            df90Var.c();
                        }
                        i12 = 2;
                    }
                    if (g5 < i12) {
                        if (df90Var.f()) {
                            df90Var.o(14);
                        }
                        if (g5 == 0 && df90Var.f()) {
                            df90Var.o(14);
                        }
                    }
                    if (df90Var.f()) {
                        if (g == 0) {
                            df90Var.o(5);
                        } else {
                            for (int i17 = 0; i17 < i8; i17++) {
                                if (df90Var.f()) {
                                    df90Var.o(5);
                                }
                            }
                        }
                    }
                }
            }
            if (df90Var.f()) {
                df90Var.o(5);
                if (g5 == 2) {
                    df90Var.o(4);
                }
                if (g5 >= 6) {
                    df90Var.o(2);
                }
                if (df90Var.f()) {
                    df90Var.o(8);
                }
                if (g5 == 0 && df90Var.f()) {
                    df90Var.o(8);
                }
                if (g4 < 3) {
                    df90Var.n();
                }
            }
            if (r8 == 0 && g != 3) {
                df90Var.n();
            }
            if (r8 == 2 && (g == 3 || df90Var.f())) {
                i9 = 6;
                df90Var.o(6);
            } else {
                i9 = 6;
            }
            str = (df90Var.f() && df90Var.g(i9) == 1 && df90Var.g(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i3 = i7;
            i2 = i15;
            i4 = i16;
            i6 = g3;
            i5 = i14;
        } else {
            df90Var.o(32);
            int g8 = df90Var.g(2);
            String str2 = g8 == 3 ? null : "audio/ac3";
            int g9 = df90Var.g(6);
            int i18 = e[g9 / 2] * 1000;
            int d2 = d(g8, g9);
            df90Var.o(8);
            int g10 = df90Var.g(3);
            if ((g10 & 1) == 0 || g10 == 1) {
                i = 2;
            } else {
                i = 2;
                df90Var.o(2);
            }
            if ((g10 & 4) != 0) {
                df90Var.o(i);
            }
            if (g10 == i) {
                df90Var.o(i);
            }
            str = str2;
            i2 = i18;
            i3 = g8 < 3 ? iArr2[g8] : -1;
            i4 = iArr[g10] + (df90Var.f() ? 1 : 0);
            i5 = 1536;
            i6 = d2;
        }
        return new hb(i4, i3, i6, i5, i2, str);
    }
}
