package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.com.vk.donut.popup.api.model.VideoPopupArgs;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.zra0;

/* compiled from: VideoDonutBottomSheet.kt */
/* loaded from: classes17.dex */
public final class ihs0 extends jmu0 {
    public final ComposeView h1;
    public final wh50 i1 = androidx.compose.runtime.k.b(null);
    public final wh50 j1 = androidx.compose.runtime.k.b(null);

    /* compiled from: VideoDonutBottomSheet.kt */
    public static final class a extends wpi {
        public final VideoPopupArgs g;
        public final y4o h;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(Context context, VideoPopupArgs videoPopupArgs, boolean z, y4o y4oVar) {
            super(r1 != null ? r1 : context, new hhs0());
            TypedValue typedValue = krv0.a;
            Integer d = krv0.d();
            d = (d == null || !z) ? null : d;
            l7s l7sVar = d != null ? new l7s(context, d.intValue()) : null;
            this.g = videoPopupArgs;
            this.h = y4oVar;
            P0();
            int i = y1z.a;
            LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
            O0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            ihs0 ihs0Var = new ihs0(S0());
            ihs0Var.setArguments(yfb.b(new Pair("arg_display_data", this.g)));
            ((zak0) ihs0Var.i1).setValue(this.h);
            return ihs0Var;
        }
    }

    static {
        int i = ComposeView.n;
    }

    public ihs0(ComposeView composeView) {
        this.h1 = composeView;
    }

    @Override // xsna.vpi
    public final ComposeView ao() {
        return this.h1;
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1609426247);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1609426247, i2, -1, "com.vk.com.vk.donut.popup.impl.video.VideoDonutBottomSheet.ThemedContent (VideoDonutBottomSheet.kt:59)");
            }
            TypedValue typedValue = krv0.a;
            int i3 = this.A0;
            dhr0 dhr0Var = krv0.b;
            r490.a(epx.f(dhr0Var != null ? Boolean.valueOf(dhr0Var.O(i3)) : null, Boolean.TRUE), kai.c(-1076715178, new o85(this, 12), M), M, 48);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ah7(this, i, 10);
        }
    }

    public final void eo(int i, androidx.compose.runtime.a aVar) {
        boolean z;
        ihs0 ihs0Var = this;
        androidx.compose.runtime.a M = aVar.M(316262287);
        int i2 = (M.y(ihs0Var) ? 4 : 2) | i;
        boolean z2 = true;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(316262287, i2, -1, "com.vk.com.vk.donut.popup.impl.video.VideoDonutBottomSheet.ModalContent (VideoDonutBottomSheet.kt:72)");
            }
            VideoPopupArgs videoPopupArgs = (VideoPopupArgs) ((zak0) ihs0Var.j1).getValue();
            if (videoPopupArgs == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new b47(ihs0Var, i, 11);
                    return;
                }
                return;
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(1099309949);
            TopBar$Middle.a aVar4 = TopBar$Middle.a.c;
            int i3 = i2 & 14;
            boolean z3 = i3 == 4 || M.y(ihs0Var);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z3 || x == c0012a) {
                x = new d3j0(ihs0Var, 12);
                M.R(x);
            }
            com.vk.core.compose.component.topbar.a a3 = d.a.a(d.c.C0759c.a((gzs) x, null, M, 2), null, null, null, M, 24576, 14);
            if (androidx.compose.runtime.b.d()) {
                z = false;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                z = false;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(aVar4, null, null, null, null, null, a3, null, false, ylu0Var.d().a, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 6, 0, 7614);
            ldv0.d(txj0.f(s200.F(32, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), 1.0f), ad0.s(pg90.a(videoPopupArgs.b, 0, M), 0L, null, null, null, null, null, M, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), zra0.a.a(videoPopupArgs.c, null, videoPopupArgs.d, null, M, 196608, 26), null, null, null, false, M, 1572870, 56);
            M = M;
            ck70.b(aVar2, 4, M, 6);
            if (videoPopupArgs.e != null) {
                M.K(1100201137);
                q630 f = txj0.f(s200.E(aVar2, kqu0.b, kqu0.v), 1.0f);
                ButtonSize buttonSize = ButtonSize.Large;
                ButtonStyle buttonStyle = ButtonStyle.Secondary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                String str = videoPopupArgs.e;
                if (i3 != 4) {
                    ihs0Var = this;
                    if (!M.y(ihs0Var)) {
                        z2 = false;
                    }
                } else {
                    ihs0Var = this;
                }
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new ipq0(ihs0Var, 4);
                    M.R(x2);
                }
                bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, f, null, false, false, null, null, null, str, null, null, null, null, false, null, null, null, M, X2.b.f, 0, 0, 4190176);
                M = M;
            } else {
                ihs0Var = this;
                M.K(1095831005);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new bt3(ihs0Var, i, 16);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = requireArguments.getParcelable("arg_display_data", VideoPopupArgs.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = requireArguments.getParcelable("arg_display_data");
            if (!(parcelable3 instanceof VideoPopupArgs)) {
                parcelable3 = null;
            }
            parcelable = (VideoPopupArgs) parcelable3;
        }
        ((zak0) this.j1).setValue((VideoPopupArgs) parcelable);
    }
}
