package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.dto.group.Group;
import com.vk.music.informer.mvi.MusicPlayerInformerViewState;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink;
import com.vk.newsfeed.posting.impl.domain.model.CropFitContainerMode;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ys0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ys0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                bt0.d((String) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                Group group = (Group) this.c;
                CatalogProfileLocalState.FollowSource followSource = (CatalogProfileLocalState.FollowSource) this.d;
                UIBlock uIBlock = (UIBlock) obj2;
                if (uIBlock instanceof UIBlockGroup) {
                    UIBlockGroup uIBlockGroup = (UIBlockGroup) uIBlock;
                    if (epx.f(uIBlockGroup.y.c, group != null ? group.c : null)) {
                        uIBlockGroup.A.b = followSource;
                    }
                }
                return s3q0.a;
            case 2:
                fm50 fm50Var = (fm50) this.c;
                izs izsVar = (izs) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-837844855, intValue, -1, "com.vk.newsfeed.posting.crop_editor.presentation.base.view.CropEditorContentView.ThemedContent.<anonymous> (CropEditorContentView.kt:45)");
                    }
                    v6a0 v6a0Var = (v6a0) fm50Var;
                    ImageLink imageLink = (ImageLink) jk50.a(v6a0Var.a, aVar, 48, 2).getValue();
                    ImageCropArea imageCropArea = (ImageCropArea) jk50.a(v6a0Var.c, aVar, 48, 2).getValue();
                    PostingPreviewRatio postingPreviewRatio = (PostingPreviewRatio) jk50.c(v6a0Var.b, aVar).getValue();
                    yzt0<Boolean> yzt0Var = v6a0Var.d;
                    Boolean bool = Boolean.FALSE;
                    boolean booleanValue = ((Boolean) jk50.d(yzt0Var, bool, aVar, 48).getValue()).booleanValue();
                    boolean booleanValue2 = ((Boolean) jk50.d(v6a0Var.e, bool, aVar, 48).getValue()).booleanValue();
                    CropFitContainerMode cropFitContainerMode = (CropFitContainerMode) jk50.d(v6a0Var.f, CropFitContainerMode.CROP_ONLY, aVar, 48).getValue();
                    if (imageLink != null) {
                        aVar.K(2114422673);
                        ugk.b(imageLink, imageCropArea, postingPreviewRatio, booleanValue, booleanValue2, true, cropFitContainerMode, izsVar, aVar, 196608);
                    } else {
                        aVar.K(2112087257);
                    }
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 3:
                f7u f7uVar = (f7u) this.c;
                lbe lbeVar = (lbe) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1767274986, intValue2, -1, "com.vk.ecomm.market.goodpreview.presentation.view.GoodPreviewView.bindTopBar.<anonymous>.<anonymous> (GoodPreviewView.kt:154)");
                    }
                    erd0.a(f7uVar, lbeVar, txj0.f(q630.a.a, 1.0f), aVar2, 384);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                ((bkd0) this.c).x6((ikd0) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                jai jaiVar = (jai) this.c;
                v3h0 v3h0Var = (v3h0) this.d;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-574531306, intValue3, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:535)");
                    }
                    jaiVar.invoke(v3h0Var, aVar3, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 6:
                szm0 szm0Var = (szm0) this.c;
                sdh0 sdh0Var = (sdh0) this.d;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-142038937, intValue4, -1, "com.vk.video.ui.discovery.minimizable.player.views.SubscriptionProposalHolder.setContent.<anonymous>.<anonymous> (SubscriptionProposalHolder.kt:157)");
                    }
                    q630.a aVar5 = q630.a.a;
                    q630 c = txj0.c(aVar5, 1.0f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    iyk0 iyk0Var = rrv0.a;
                    ylu0 ylu0Var = (ylu0) aVar4.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630 m = hr80.m(c, ylu0Var.getBackground().x, androidx.compose.ui.graphics.e.a);
                    Object x = aVar4.x();
                    if (x == a.C0011a.a) {
                        x = new jzm0(0);
                        aVar4.R(x);
                    }
                    q630 b = ojc.b(m, null, null, false, null, (gzs) x, 28);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar4, 0);
                    int hashCode = Long.hashCode(n34.n(aVar4));
                    sy90 D = aVar4.D();
                    q630 c2 = qri.c(aVar4, b);
                    cri.h7.getClass();
                    LayoutNode.a aVar6 = cri.a.b;
                    if (aVar4.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar4.H();
                    if (aVar4.L()) {
                        aVar4.I(aVar6);
                    } else {
                        aVar4.f();
                    }
                    k9q0.w(aVar4, a, cri.a.f);
                    k9q0.w(aVar4, D, cri.a.e);
                    k9q0.w(aVar4, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar4, cri.a.h);
                    k9q0.w(aVar4, c2, cri.a.d);
                    float f = 16;
                    f9t.e(txj0.h(aVar5, f), aVar4, 6);
                    f9t.e(q9g.a(aVar5, 1.0f), aVar4, 0);
                    rrv0.e(false, null, null, null, null, null, kai.c(-2071631040, new onb(6, szm0Var, sdh0Var), aVar4), aVar4, 1572870, 62);
                    f9t.e(q9g.a(aVar5, 1.0f), aVar4, 0);
                    float intValue5 = ((Number) nr2.s(szm0Var.h, 100, null, aVar4, 48, 2).getValue()).intValue() / 100;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar4.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    bev0.a(intValue5, 48, 0, ylu0Var2.getIcon().p, aVar4, txj0.f(txj0.z(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar5), null, 3), 1.0f));
                    if (xga0.c(aVar5, f, aVar4, 6)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            default:
                izs izsVar2 = (izs) this.c;
                MusicPlayerInformerViewState.a aVar7 = (MusicPlayerInformerViewState.a) this.d;
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (aVar8.t(intValue6 & 1, (intValue6 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1492809135, intValue6, -1, "com.vk.music.informer.VkAppInformerContainer.<anonymous> (VkAppInformerContainer.kt:72)");
                    }
                    float f2 = 16;
                    q630 H = s200.H(s200.G(q630.a.a, f2, 8, f2, 6), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bw40.c, 7);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode2 = Long.hashCode(n34.n(aVar8));
                    sy90 D2 = aVar8.D();
                    q630 c3 = qri.c(aVar8, H);
                    cri.h7.getClass();
                    LayoutNode.a aVar9 = cri.a.b;
                    if (aVar8.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar8.H();
                    if (aVar8.L()) {
                        aVar8.I(aVar9);
                    } else {
                        aVar8.f();
                    }
                    k9q0.w(aVar8, d, cri.a.f);
                    k9q0.w(aVar8, D2, cri.a.e);
                    k9q0.w(aVar8, Integer.valueOf(hashCode2), cri.a.g);
                    k9q0.t(aVar8, cri.a.h);
                    k9q0.w(aVar8, c3, cri.a.d);
                    fau0.a(izsVar2, aVar7, null, aVar8, 0);
                    aVar8.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar8.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ ys0(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
