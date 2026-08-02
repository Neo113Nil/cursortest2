package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.video.Doc2DocItem;
import com.vk.ecomm.cart.impl.checkout.feature.state.PaymentInfoField;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.domain.PostingContentType;
import com.vk.superapp.api.dto.ad.AdInfo;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cri;
import xsna.dt1;
import xsna.gna0;
import xsna.phw;
import xsna.q630;
import xsna.vp1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class mq1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mq1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        com.vk.core.compose.component.cell.content.j0 j0Var;
        switch (this.b) {
            case 0:
                com.vk.movika.sdk.base.logic.interactor.p pVar = (com.vk.movika.sdk.base.logic.interactor.p) this.c;
                qq1 qq1Var = (qq1) this.d;
                pVar.invoke(new vp1.j((PhotoAlbum) obj2));
                qq1Var.f.x((RecyclerView.e0) obj);
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((zn7) this.c).a((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                j9c.b((PaymentInfoField.a) this.c, (gzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 3:
                List list = (List) this.c;
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                q1k.b(ne7.I(1), (androidx.compose.runtime.a) obj, list, q630Var);
                return s3q0.a;
            case 4:
                AboutVideoItem.l lVar = (AboutVideoItem.l) this.c;
                wzs wzsVar = (wzs) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1027607441, intValue, -1, "com.vk.video.ui.discovery.minimizable.doc2doc.MetaChannelBanner.<anonymous> (Doc2DocBannerDelegate.kt:78)");
                    }
                    float f = 16;
                    q630 d = rte0.d(s200.G(q630.a.a, f, 8, f, 28), vog0.b(f));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    iyk0 iyk0Var = rrv0.a;
                    ylu0 ylu0Var = (ylu0) aVar.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630 m = hr80.m(d, ylu0Var.getImage().c, androidx.compose.ui.graphics.e.a);
                    final String str = lVar.c;
                    gzs gzsVar = null;
                    if (str == null) {
                        aVar.K(1074009284);
                        aVar.j();
                        j0Var = null;
                    } else {
                        aVar.K(1074009285);
                        com.vk.core.compose.component.cell.content.j0 a = Cell$Left.Main.a.C0731a.a(kai.c(-76482195, new zzs() { // from class: xsna.btn
                            @Override // xsna.zzs
                            public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                                q630 q630Var2 = (q630) obj4;
                                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                if ((intValue2 & 48) == 0) {
                                    intValue2 |= aVar2.J(q630Var2) ? 32 : 16;
                                }
                                if (aVar2.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-76482195, intValue2, -1, "com.vk.video.ui.discovery.minimizable.doc2doc.MetaChannelBanner.<anonymous>.<anonymous>.<anonymous> (Doc2DocBannerDelegate.kt:90)");
                                    }
                                    gdv0.e(phw.a.a(fwu0.l(str, null, null, null, aVar2, 0, 62), null, null, null, null, aVar2, 196616, 30), txj0.s(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 1, q630Var2), 30, 40), null, PictureRadius.Medium, null, null, aVar2, 3072);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar2.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar), aVar);
                        aVar.j();
                        j0Var = a;
                    }
                    com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(Cell$Middle.d.b.a(lVar.b, null, null, 0, null, null, aVar, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, aVar, 196608, 30);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1231053620, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronCompactRight24> (VkSdkIcons.kt:416)");
                    }
                    lg90 a3 = pg90.a(R.drawable.vk_icon_chevron_compact_right_24, 0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    com.vk.core.compose.component.cell.content.y0 a4 = o.c.a(null, com.vk.core.compose.component.cell.content.p.a(a3, ylu0Var2.getIcon().n, 0L, null, null, null, aVar, 1572872, 60), null, null, null, aVar, 61);
                    Doc2DocItem.Banner.Action action = lVar.d;
                    if (action == null) {
                        aVar.K(1074945949);
                    } else {
                        aVar.K(1074945950);
                        boolean J = aVar.J(wzsVar) | aVar.o(action.ordinal()) | aVar.y(lVar);
                        Object x = aVar.x();
                        if (J || x == a.C0011a.a) {
                            x = new ctn(wzsVar, action, lVar, 0);
                            aVar.R(x);
                        }
                        gzsVar = (gzs) x;
                    }
                    aVar.j();
                    wiu0.b(m, false, j0Var, a2, a4, gzsVar, null, aVar, 0, 66);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((f6s) this.c).b7((q6s) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 6:
                lg90 lg90Var = (lg90) this.c;
                String str2 = (String) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-952398165, intValue2, -1, "com.vk.design.demo.presentation.components.IconCard.<anonymous> (IconCard.kt:33)");
                    }
                    q630.a aVar3 = q630.a.a;
                    q630 D = s200.D(aVar3, 8);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a5 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, aVar2, 48);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D2 = aVar2.D();
                    q630 c = qri.c(aVar2, D);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar4);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, a5, cri.a.f);
                    k9q0.w(aVar2, D2, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c, cri.a.d);
                    vqv.a(lg90Var, null, null, l5g.k, aVar2, 3128, 4);
                    q630 H = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str2, H, 0L, null, null, 0, 3, null, 0, false, 2, 2, null, wuv0Var.m0, aVar2, 48, 54, 5052);
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                vma0.g((gna0.a) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                xqc0.a((PostingContentType) this.c, (gzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 9:
                zdn0 zdn0Var = (zdn0) this.c;
                AdInfo adInfo = (AdInfo) this.d;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1053995233, intValue3, -1, "com.vk.superapp.holders.SuperAppWidgetShowcaseSectionScrollHolder.showAdInfoContextMenu.<anonymous>.<anonymous> (SuperAppWidgetShowcaseSectionScrollHolder.kt:167)");
                    }
                    dt1.a.getClass();
                    ty6 ty6Var = dt1.a.d;
                    q630 v = txj0.v(q630.a.a, 260);
                    boolean booleanValue = ((Boolean) ((zak0) zdn0Var.s).getValue()).booleanValue();
                    boolean y = aVar5.y(zdn0Var);
                    Object x2 = aVar5.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (y || x2 == c0012a) {
                        x2 = new v5n0(zdn0Var, 2);
                        aVar5.R(x2);
                    }
                    gzs gzsVar2 = (gzs) x2;
                    boolean y2 = aVar5.y(zdn0Var) | aVar5.y(adInfo);
                    Object x3 = aVar5.x();
                    if (y2 || x3 == c0012a) {
                        x3 = new ydn0(0, zdn0Var, adInfo);
                        aVar5.R(x3);
                    }
                    aou0.g(booleanValue, gzsVar2, v, ty6Var, 0L, null, null, (izs) x3, aVar5, 3456, PsExtractor.VIDEO_STREAM_MASK);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            default:
                fuv0 fuv0Var = (fuv0) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(801902942, intValue4, -1, "com.vk.profile.user.impl.ui.adapter.holders.UserProfileAdvertBannerViewHolder.AdvertisingBanner.<anonymous>.<anonymous>.<anonymous> (UserProfileAdvertBannerViewHolder.kt:153)");
                    }
                    Object x4 = aVar6.x();
                    a.C0011a.C0012a c0012a2 = a.C0011a.a;
                    if (x4 == c0012a2) {
                        x4 = ir.h(aVar6);
                    }
                    sg50 sg50Var = (sg50) x4;
                    boolean J2 = aVar6.J(fuv0Var);
                    Object x5 = aVar6.x();
                    if (J2 || x5 == c0012a2) {
                        x5 = new w2j0(fuv0Var, 10);
                        aVar6.R(x5);
                    }
                    q630 o = egi.o(ojc.b(q630.a.a, sg50Var, null, false, null, (gzs) x5, 28), new uyn0(2, fuv0Var, ref$ObjectRef));
                    Object x6 = aVar6.x();
                    if (x6 == c0012a2) {
                        x6 = new w9l0(5);
                        aVar6.R(x6);
                    }
                    q630 b = egi0.b(o, false, (izs) x6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var2 = (wuv0) aVar6.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var2.v0;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var3 = (ylu0) aVar6.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(d370.N(R.string.advert_banner_tooltip_button, 0, aVar6), b, ylu0Var3.getText().q, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar6, 0, 0, 8184);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ mq1(AboutVideoItem.l lVar, wzs wzsVar) {
        this.b = 4;
        this.c = lVar;
        this.d = wzsVar;
    }

    public /* synthetic */ mq1(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
