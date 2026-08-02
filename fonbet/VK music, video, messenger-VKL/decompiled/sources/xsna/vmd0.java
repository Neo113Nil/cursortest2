package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.d;
import com.vk.ecomm.market.good.ui.topbar.ProductCardTopBarControlAction;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ProductCardTopBarActionMenu.kt */
/* loaded from: classes18.dex */
public final class vmd0 extends d.c {
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;

    /* compiled from: ProductCardTopBarActionMenu.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductCardTopBarControlAction.values().length];
            try {
                iArr[ProductCardTopBarControlAction.Edit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductCardTopBarControlAction.Promote.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductCardTopBarControlAction.Statistics.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProductCardTopBarControlAction.CopyLink.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProductCardTopBarControlAction.Remove.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public vmd0() {
        throw null;
    }

    public vmd0(izs izsVar, List list, boolean z, com.vk.core.compose.component.semantics.a aVar) {
        this.d = androidx.compose.runtime.k.b(izsVar);
        this.e = androidx.compose.runtime.k.b(list);
        this.f = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.g = androidx.compose.runtime.k.b(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.core.compose.component.topbar.d.c
    public final void e(mtk0 mtk0Var, androidx.compose.runtime.a aVar, int i) {
        vmd0 vmd0Var;
        androidx.compose.runtime.a aVar2;
        wh50 wh50Var;
        androidx.compose.runtime.a M = aVar.M(606839945);
        int i2 = i | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(606839945, i2, -1, "com.vk.ecomm.market.good.ui.topbar.compose.ProductCardTopBarActionMenu.Content (ProductCardTopBarActionMenu.kt:47)");
            }
            float f = 44;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var2 = (wh50) x;
            SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) ((zak0) this.g).getValue();
            q630.a aVar3 = q630.a.a;
            q630 q = txj0.q(com.vk.core.compose.component.semantics.b.b(aVar3, semanticsConfiguration), f);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.f;
            cp10 d = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new vmi(4, wh50Var2);
                M.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(950398620, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical28> (VkSdkIcons.kt:2670)");
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_more_vertical_28, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.product_card_control_action_title, 0, M);
            q630 b = ra8.a.b(aVar3, ty6Var);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new xpt(18);
                M.R(x3);
            }
            q630 b2 = egi0.b(b, false, (izs) x3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            nzu0.c(gzsVar, a2, N, b2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ylu0Var.getIcon().b, false, null, false, null, null, aVar2, 70, 2000);
            boolean booleanValue = ((Boolean) wh50Var2.getValue()).booleanValue();
            Object x4 = aVar2.x();
            if (x4 == c0012a) {
                wh50Var = wh50Var2;
                x4 = new xmi(2, wh50Var);
                aVar2.R(x4);
            } else {
                wh50Var = wh50Var2;
            }
            gzs gzsVar2 = (gzs) x4;
            ty6 ty6Var2 = dt1.a.d;
            float f2 = 2;
            long floatToRawIntBits = (Float.floatToRawIntBits((-f) / f2) << 32) | (Float.floatToRawIntBits(f / f2) & 4294967295L);
            gxb0 gxb0Var = new gxb0(false, false, 22);
            boolean z = (i2 & 896) == 256;
            Object x5 = aVar2.x();
            if (z || x5 == c0012a) {
                vmd0Var = this;
                x5 = new com.vk.movika.sdk.base.logic.processor.d(27, vmd0Var, wh50Var);
                aVar2.R(x5);
            } else {
                vmd0Var = this;
            }
            aou0.g(booleanValue, gzsVar2, null, ty6Var2, floatToRawIntBits, gxb0Var, null, (izs) x5, aVar2, 224304, 196);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            vmd0Var = this;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new h08(vmd0Var, mtk0Var, i, 8);
        }
    }
}
