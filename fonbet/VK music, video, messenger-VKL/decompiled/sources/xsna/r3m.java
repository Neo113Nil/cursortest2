package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.design.demo.presentation.nav.ScreenKey;
import xsna.q630;
import xsna.w3m;

/* compiled from: DesignDemoMviView.kt */
/* loaded from: classes18.dex */
public final class r3m extends i6v0<y3m, h3m> {
    public final wh50 f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r3m(Context context, f5z f5zVar) {
        super(r0, f5zVar);
        lpj lpjVar = new lpj(context, 0);
        this.f = androidx.compose.runtime.k.b(lpjVar);
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        j((y3m) ao50Var, izsVar, aVar, 512);
    }

    @Override // xsna.i6v0
    public final void g(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-525841355);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (M.y(jaiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(this) : M.y(this) ? 32 : 16;
        }
        int i4 = 0;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-525841355, i2, -1, "com.vk.design.demo.presentation.DesignDemoMviView.Theme (DesignDemoMviView.kt:43)");
            }
            h6v0 h6v0Var = h6v0.a;
            Boolean bool = (Boolean) ((zak0) h6v0.c).getValue();
            boolean booleanValue = bool.booleanValue();
            rvi.b(new c9e0[]{vsx.b.b(Boolean.valueOf(vsx.a())), AndroidCompositionLocals_androidKt.b.b(k())}, kai.c(321240949, new k3m(i4, jaiVar), M), M, 56);
            Boolean valueOf = Boolean.valueOf(vsx.a());
            int i5 = i2 & 112;
            boolean z = i5 == 32 || ((i2 & 64) != 0 && M.y(this));
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new p3m(this, null);
                M.R(x);
            }
            bap.g(valueOf, (wzs) x, M, 0);
            boolean l = (i5 == 32 || ((i2 & 64) != 0 && M.y(this))) | M.l(booleanValue);
            Object x2 = M.x();
            if (l || x2 == c0012a) {
                x2 = new q3m(this, booleanValue, null);
                M.R(x2);
            }
            bap.g(bool, (wzs) x2, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rac((Object) this, (Object) jaiVar, i, i3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public final void h(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(208521212);
        int i2 = (M.y(izsVar) ? 4 : 2) | i | 48 | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(208521212, i2, -1, "com.vk.design.demo.presentation.DesignDemoMviView.InitContent (DesignDemoMviView.kt:122)");
            }
            boolean booleanValue = ((Boolean) M.r(vsx.b)).booleanValue();
            yah0 yah0Var = (yah0) mpg0.a.get(ScreenKey.Main);
            if (yah0Var == null) {
                M.K(1532950789);
            } else {
                M.K(1532950790);
                boolean z = false;
                x5 x5Var = new x5(14);
                int i3 = i2 & 14;
                boolean z2 = i3 == 4;
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z2 || x == c0012a) {
                    x = new oe1(izsVar, 3);
                    M.R(x);
                }
                gzs gzsVar = (gzs) x;
                boolean l = M.l(booleanValue);
                Object x2 = M.x();
                if (l || x2 == c0012a) {
                    x2 = new m3m(booleanValue, 0);
                    M.R(x2);
                }
                gzs gzsVar2 = (gzs) x2;
                if (i3 == 4) {
                    z = true;
                }
                Object x3 = M.x();
                if (z || x3 == c0012a) {
                    x3 = new n3m(izsVar, 0);
                    M.R(x3);
                }
                yah0Var.a(gzsVar, gzsVar2, x5Var, (izs) x3, M, 24576);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new o3m(this, izsVar, q630Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(w3m.b bVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        a.C0011a.C0012a c0012a;
        androidx.compose.runtime.a M = aVar.M(-1864900148);
        int i2 = i | (M.J(bVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384 | (M.y(this) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1864900148, i2, -1, "com.vk.design.demo.presentation.DesignDemoMviView.MainContent (DesignDemoMviView.kt:95)");
            }
            yzt0<ScreenKey> yzt0Var = bVar.a;
            ScreenKey screenKey = ScreenKey.Main;
            wh50 d = jk50.d(yzt0Var, screenKey, M, 48);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = bbk0.b(new uo7(d, 1));
                M.R(x);
            }
            boolean booleanValue = ((Boolean) M.r(vsx.b)).booleanValue();
            yah0 yah0Var = (yah0) ((mtk0) x).getValue();
            if (yah0Var == null) {
                M.K(-1837898083);
                M.j();
                c0012a = c0012a2;
            } else {
                M.K(-1837898082);
                x5 x5Var = new x5(14);
                int i3 = i2 & 112;
                boolean z = i3 == 32;
                Object x2 = M.x();
                if (z || x2 == c0012a2) {
                    x2 = new ee1(izsVar, 3);
                    M.R(x2);
                }
                gzs gzsVar = (gzs) x2;
                boolean l = ((i2 & 7168) == 2048 || M.y(this)) | M.l(booleanValue);
                Object x3 = M.x();
                if (l || x3 == c0012a2) {
                    x3 = new ws8(booleanValue, this);
                    M.R(x3);
                }
                gzs gzsVar2 = (gzs) x3;
                boolean z2 = i3 == 32;
                Object x4 = M.x();
                if (z2 || x4 == c0012a2) {
                    x4 = new r38(izsVar, 1);
                    M.R(x4);
                }
                c0012a = c0012a2;
                yah0Var.a(gzsVar, gzsVar2, x5Var, (izs) x4, M, 24576);
                M.j();
            }
            boolean z3 = ((ScreenKey) d.getValue()) != screenKey;
            boolean z4 = (i2 & 112) == 32;
            Object x5 = M.x();
            if (z4 || x5 == c0012a) {
                x5 = new me0(izsVar, 4);
                M.R(x5);
            }
            fo50.k(0, 0, M, (gzs) x5, z3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630.a.a;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new j3m(this, bVar, izsVar, q630Var2, i);
        }
    }

    public final void j(y3m y3mVar, izs<? super h3m, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-112601645);
        int i2 = i | (M.J(y3mVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-112601645, i2, -1, "com.vk.design.demo.presentation.DesignDemoMviView.ThemedContent (DesignDemoMviView.kt:81)");
            }
            uov0.a(null, null, 0L, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(1137175596, new ri1(this, y3mVar, izsVar, 4), M), M, 1572864, 63);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n77(this, y3mVar, izsVar, i, 1);
        }
    }

    public final lpj k() {
        return (lpj) ((zak0) this.f).getValue();
    }
}
