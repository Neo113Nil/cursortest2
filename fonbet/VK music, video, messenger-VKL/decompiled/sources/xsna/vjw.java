package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wkj;

/* compiled from: Image.kt */
/* loaded from: classes11.dex */
public final class vjw {

    /* compiled from: Image.kt */
    public static final class a implements cp10 {
        public static final a a = new a();

        @Override // xsna.cp10
        public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
            return ep10Var.Q(o6j.k(j), o6j.j(j), jgp.b, new dam(12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final lg90 lg90Var, final String str, q630 q630Var, dt1 dt1Var, wkj wkjVar, float f, d6g d6gVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        dt1 dt1Var2;
        int i5;
        wkj wkjVar2;
        int i6;
        float f2;
        int i7;
        final d6g d6gVar2;
        final q630 q630Var3;
        final dt1 dt1Var3;
        final wkj wkjVar3;
        final float f3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(1142754848);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(str) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                dt1Var2 = dt1Var;
                i3 |= M.J(dt1Var2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    wkjVar2 = wkjVar;
                    i3 |= M.J(wkjVar2) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        f2 = f;
                        i3 |= M.n(f2) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= M.J(d6gVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        }
                        if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
                            q630 q630Var4 = q630.a.a;
                            q630 q630Var5 = i8 != 0 ? q630Var4 : q630Var2;
                            if (i4 != 0) {
                                dt1.a.getClass();
                                dt1Var2 = dt1.a.f;
                            }
                            if (i5 != 0) {
                                wkjVar2 = wkj.a.b;
                            }
                            float f4 = i6 != 0 ? 1.0f : f2;
                            d6g d6gVar3 = i7 != 0 ? null : d6gVar;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1142754848, i3, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                            }
                            a.C0011a.C0012a c0012a = a.C0011a.a;
                            if (str != null) {
                                M.K(1899222916);
                                boolean z = (i3 & 112) == 32;
                                Object x = M.x();
                                if (z || x == c0012a) {
                                    x = new k17(str, 2);
                                    M.R(x);
                                }
                                q630Var4 = egi0.b(q630Var4, false, (izs) x);
                                M.j();
                            } else {
                                M.K(1899381698);
                                M.j();
                            }
                            dt1 dt1Var4 = dt1Var2;
                            wkj wkjVar4 = wkjVar2;
                            q630 q630Var6 = q630Var5;
                            q630 a2 = ng90.a(rte0.e(q630Var5.g(q630Var4)), lg90Var, dt1Var4, wkjVar4, f4, d6gVar3, 2);
                            Object x2 = M.x();
                            if (x2 == c0012a) {
                                x2 = a.a;
                                M.R(x2);
                            }
                            cp10 cp10Var = (cp10) x2;
                            int hashCode = Long.hashCode(n34.n(M));
                            q630 c = qri.c(M, a2);
                            sy90 D = M.D();
                            cri.h7.getClass();
                            LayoutNode.a aVar2 = cri.a.b;
                            if (M.N() == null) {
                                n34.r();
                                throw null;
                            }
                            M.H();
                            if (M.L()) {
                                M.I(aVar2);
                            } else {
                                M.f();
                            }
                            k9q0.w(M, cp10Var, cri.a.f);
                            k9q0.w(M, D, cri.a.e);
                            k9q0.t(M, cri.a.h);
                            k9q0.w(M, c, cri.a.d);
                            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                            M.G();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            f3 = f4;
                            d6gVar2 = d6gVar3;
                            dt1Var3 = dt1Var4;
                            wkjVar3 = wkjVar4;
                            q630Var3 = q630Var6;
                        } else {
                            M.h();
                            d6gVar2 = d6gVar;
                            q630Var3 = q630Var2;
                            dt1Var3 = dt1Var2;
                            wkjVar3 = wkjVar2;
                            f3 = f2;
                        }
                        s = M.s();
                        if (s != null) {
                            s.d = new wzs() { // from class: xsna.ujw
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    vjw.a(lg90.this, str, q630Var3, dt1Var3, wkjVar3, f3, d6gVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                    return s3q0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    f2 = f;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
                    }
                    s = M.s();
                    if (s != null) {
                    }
                }
                wkjVar2 = wkjVar;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                f2 = f;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
                }
                s = M.s();
                if (s != null) {
                }
            }
            dt1Var2 = dt1Var;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            wkjVar2 = wkjVar;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            f2 = f;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        dt1Var2 = dt1Var;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        wkjVar2 = wkjVar;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        f2 = f;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    public static final void b(agw agwVar, q630 q630Var, wkj wkjVar, androidx.compose.runtime.a aVar, int i, int i2) {
        dt1.a.getClass();
        ty6 ty6Var = dt1.a.f;
        if ((i2 & 16) != 0) {
            wkjVar = wkj.a.b;
        }
        wkj wkjVar2 = wkjVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1396260732, i, -1, "androidx.compose.foundation.Image (Image.kt:156)");
        }
        boolean J = aVar.J(agwVar);
        Object x = aVar.x();
        if (J || x == a.C0011a.a) {
            rc7 rc7Var = new rc7((agwVar.getWidth() << 32) | (agwVar.getHeight() & 4294967295L), agwVar);
            rc7Var.i = 1;
            aVar.R(rc7Var);
            x = rc7Var;
        }
        a((rc7) x, null, q630Var, ty6Var, wkjVar2, 1.0f, null, aVar, (i & 896) | 56 | (57344 & i), 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }
}
