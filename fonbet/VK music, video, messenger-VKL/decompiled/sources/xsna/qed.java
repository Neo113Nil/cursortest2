package xsna;

import androidx.compose.runtime.a;
import com.vk.community.design.view.components.compose.CommunityCardTitle$Text;
import com.vk.donut.design.compose.banner.DonutBannerSkeletonContent;
import com.vk.dto.stickers.StickerItem;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.stickers.views.sticker.StickerPackPreviewWithStickerId;
import com.vk.vas.design.view.VKStickerPackView;
import com.vkontakte.android.R;
import java.util.Date;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.q630;
import xsna.r0i;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class qed implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qed(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        int i2 = 18;
        Object obj3 = a.C0011a.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                red.a((String) obj5, (q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                fuv0 fuv0Var = (fuv0) obj5;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2052851084, intValue, -1, "com.vk.profile.community.impl.ui.view.CommunityAdBannerComposeView.AdvertisingBanner.<anonymous>.<anonymous>.<anonymous> (CommunityAdBannerComposeView.kt:146)");
                    }
                    Object x = aVar.x();
                    if (x == obj3) {
                        x = ir.h(aVar);
                    }
                    sg50 sg50Var = (sg50) x;
                    boolean J = aVar.J(fuv0Var);
                    Object x2 = aVar.x();
                    if (J || x2 == obj3) {
                        x2 = new hg(fuv0Var, 28);
                        aVar.R(x2);
                    }
                    q630 o = egi.o(ojc.b(q630.a.a, sg50Var, null, false, null, (gzs) x2, 28), new com.vk.im.engine.commands.messages.a(14, fuv0Var, ref$ObjectRef));
                    Object x3 = aVar.x();
                    if (x3 == obj3) {
                        x3 = new a60(i2);
                        aVar.R(x3);
                    }
                    q630 b = egi0.b(o, false, (izs) x3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.v0;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(d370.N(R.string.advert_banner_tooltip_button, 0, aVar), b, ylu0Var.getText().q, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar, 0, 0, 8184);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((CommunityCardTitle$Text) obj5).a((q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 3:
                r0i r0iVar = (r0i) obj5;
                com.vk.profile.core.scheduled_clips.h hVar = (com.vk.profile.core.scheduled_clips.h) obj4;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(625736787, intValue2, -1, "com.vk.profile.core.scheduled_clips.CommunityScheduledClipsGridView.updateOverlayState.<anonymous> (CommunityScheduledClipsGridView.kt:179)");
                    }
                    if (r0iVar instanceof r0i.a) {
                        aVar2.K(1166709771);
                        k0i k0iVar = ((r0i.a) r0iVar).a;
                        String string = hVar.b.getString(R.string.video_date_picker_title);
                        Object x4 = aVar2.x();
                        if (x4 == obj3) {
                            x4 = new yy(i2);
                            aVar2.R(x4);
                        }
                        q630 b2 = egi0.b(q630.a.a, false, (izs) x4);
                        Date date = k0iVar.a;
                        Date date2 = k0iVar.b;
                        Date date3 = k0iVar.c;
                        boolean y = aVar2.y(hVar);
                        Object x5 = aVar2.x();
                        if (y || x5 == obj3) {
                            x5 = new i2f(hVar);
                            aVar2.R(x5);
                        }
                        fcy fcyVar = (fcy) x5;
                        boolean y2 = aVar2.y(hVar);
                        Object x6 = aVar2.x();
                        if (y2 || x6 == obj3) {
                            x6 = new q83(hVar);
                            aVar2.R(x6);
                        }
                        fcy fcyVar2 = (fcy) x6;
                        boolean y3 = aVar2.y(k0iVar) | aVar2.y(hVar);
                        Object x7 = aVar2.x();
                        if (y3 || x7 == obj3) {
                            x7 = new ll1(6, k0iVar, hVar);
                            aVar2.R(x7);
                        }
                        eyk.a(string, (izs) x7, b2, null, date, date2, date3, (gzs) fcyVar2, (gzs) fcyVar, aVar2, 0, 24);
                        aVar2.j();
                    } else {
                        if (!epx.f(r0iVar, r0i.b.a)) {
                            throw alb0.c(37632378, aVar2);
                        }
                        aVar2.K(1167609453);
                        aVar2.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                gyj.d((q630) obj4, (jai) obj5, (androidx.compose.runtime.a) obj, ne7.I(55));
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                com.vk.donut.design.compose.banner.b.b((DonutBannerSkeletonContent.Type) obj5, (q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 6:
                g8u g8uVar = (g8u) obj5;
                h8u h8uVar = (h8u) obj4;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1218950962, intValue3, -1, "com.vk.ecomm.market.good.marketitemreviews.GoodReviewsComposeHolder.setupHeaderBlock.<anonymous> (GoodReviewsComposeHolder.kt:248)");
                    }
                    rrv0.d(null, null, null, null, kai.c(1983296649, new yn7(5, g8uVar, h8uVar), aVar3), aVar3, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                ((fxu) obj5).a((q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                ((iiz) obj5).c((q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                se10.b(ne7.I(7), (androidx.compose.runtime.a) obj, (izs) obj5, (q630) obj4);
                return s3q0.a;
            case 10:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.preview.c.y((PreviewViewState.x) obj5, (q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 11:
                rui ruiVar = (rui) obj;
                nn50 nn50Var = (nn50) obj2;
                ruiVar.b = new xf4(10, ruiVar.a(new tqd0(nn50Var, (hap) obj4)), ruiVar.a(new fpl0((lml0) obj5, nn50Var)));
                return s3q0.a;
            default:
                VKStickerPackView vKStickerPackView = (VKStickerPackView) obj4;
                ((Integer) obj).getClass();
                int intValue4 = ((Integer) obj2).intValue();
                StickerItem stickerItem = (StickerItem) ((StickerPackPreviewWithStickerId) obj5).d.getValue();
                if (stickerItem == null) {
                    return null;
                }
                t6g0 t6g0Var = t6g0.b;
                return t6g0.d().z0(stickerItem, intValue4, dhr0.a.c(vKStickerPackView.getContext()));
        }
    }

    public /* synthetic */ qed(Object obj, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = q630Var;
    }

    public /* synthetic */ qed(q630 q630Var, xzs xzsVar, int i, int i2) {
        this.b = i2;
        this.d = q630Var;
        this.c = xzsVar;
    }
}
