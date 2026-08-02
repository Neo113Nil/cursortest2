package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.feature.music.holders.audiobook.ComposeAudioBookSliderVh;
import com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent;
import com.vk.core.compose.component.tile.TileContentType;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import com.vk.games.presentation.catalog.model.GamesDetailCatalogHeaderType;
import com.vk.video.ui.discovery.minimizable.c;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.iev;
import xsna.k8s;
import xsna.kdh0;
import xsna.oy20;
import xsna.py20;
import xsna.q630;
import xsna.qy20;
import xsna.t8s;
import xsna.tkd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class n85 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n85(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                jai jaiVar = (jai) obj4;
                rv5 rv5Var = (rv5) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-489572487, intValue, -1, "com.vk.profile.design.compose.header.content.measureBadgePlaceable.<anonymous> (AuthorHeaderHeaderContent.kt:314)");
                    }
                    float f = 16;
                    jaiVar.invoke(f370.P(s200.H(q630.a.a, f, 12, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), 3.0f), rv5Var, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                oo7.a((mtk0) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                vj4 vj4Var = (vj4) obj4;
                ComposeAudioBookSliderVh composeAudioBookSliderVh = (ComposeAudioBookSliderVh) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(651172964, intValue2, -1, "com.vk.catalog2.feature.music.holders.audiobook.ComposeAudioBookSliderVh.bindData.<anonymous>.<anonymous> (ComposeAudioBookSliderVh.kt:98)");
                    }
                    float d = r490.d(R.dimen.music_playlist_slider_image_size, aVar2);
                    TileContentType tileContentType = TileContentType.Other;
                    Image image = vj4Var.c;
                    boolean z2 = vj4Var.d;
                    boolean z3 = vj4Var.e;
                    boolean y = aVar2.y(composeAudioBookSliderVh);
                    Object x = aVar2.x();
                    if (y || x == c0012a) {
                        z = z3;
                        ComposeAudioBookSliderVh.a aVar3 = new ComposeAudioBookSliderVh.a(0, composeAudioBookSliderVh, ComposeAudioBookSliderVh.class, "handleClick", "handleClick()V", 0);
                        aVar2.R(aVar3);
                        x = aVar3;
                    } else {
                        z = z3;
                    }
                    pja0 a = HorizontalListItem$VisualContent.c.a(new nf4(image, z, z2, (gzs) ((fcy) x)), aVar2, 0, 6);
                    long b = byc0.b(d, d);
                    fsv0 a2 = iev.b.a(vj4Var.a, null, null, null, null, null, vj4Var.b, null, null, null, null, null, aVar2, 0, 4030);
                    q630 H = s200.H(ahn.E(q630.a.a, z2 ? "freeAudioBookSliderItem" : "audioBookSliderItem"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z ? 0 : 12, 7);
                    buw buwVar = (buw) aVar2.r(cuw.a);
                    Object x2 = aVar2.x();
                    if (x2 == c0012a) {
                        x2 = ir.h(aVar2);
                    }
                    sg50 sg50Var = (sg50) x2;
                    boolean y2 = aVar2.y(composeAudioBookSliderVh);
                    Object x3 = aVar2.x();
                    if (y2 || x3 == c0012a) {
                        ComposeAudioBookSliderVh.b bVar = new ComposeAudioBookSliderVh.b(0, composeAudioBookSliderVh, ComposeAudioBookSliderVh.class, "handleClick", "handleClick()V", 0);
                        aVar2.R(bVar);
                        x3 = bVar;
                    }
                    asv0.d(tileContentType, a, b, a2, ojc.b(H, sg50Var, buwVar, false, null, (gzs) ((fcy) x3), 28), false, false, null, null, null, aVar2, 6, 992);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 3:
                uu20 uu20Var = (uu20) obj3;
                int intValue3 = ((Integer) obj).intValue();
                ArrayList arrayList = new ArrayList(uu20Var.e);
                arrayList.set(intValue3, ((izs) obj2).invoke(arrayList.get(intValue3)));
                ((izs) obj4).invoke(uu20.a(uu20Var, null, null, null, null, new wow(arrayList), 15));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((t8s.d) obj4).a((k8s.a) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                lft.a((GamesDetailCatalogHeaderType) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                crz.a((kdh0.a) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((k8d0) obj4).g((znj) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 8:
                qjd0 qjd0Var = (qjd0) obj4;
                tkd0.a.b bVar2 = (tkd0.a.b) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1739998637, intValue4, -1, "com.vk.ecomm.market.good.good2.presentation.businessonboarding.ProductCardBusinessOnboardingEventHandler.showBusinessOnboardingDialog.<anonymous>.<anonymous> (ProductCardBusinessOnboardingEventHandler.kt:138)");
                    }
                    boolean y3 = aVar4.y(qjd0Var);
                    Object x4 = aVar4.x();
                    if (y3 || x4 == c0012a) {
                        pjd0 pjd0Var = new pjd0(0, qjd0Var, qjd0.class, "hideDialog", "hideDialog()V", 0);
                        aVar4.R(pjd0Var);
                        x4 = pjd0Var;
                    }
                    fcy fcyVar = (fcy) x4;
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-921676656, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-IllustrationMarketProductInterested120H> (VkIcons.kt:3848)");
                    }
                    lg90 a3 = pg90.a(R.drawable.vk_icon_illustration_market_product_interested_120h, 0, aVar4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    vy20 a4 = qy20.c.a.a(a3, 0L, null, aVar4, 6);
                    xy20 a5 = py20.a.a(384, 0, aVar4, bVar2.a, bVar2.b);
                    String str = bVar2.c;
                    boolean y4 = aVar4.y(qjd0Var);
                    Object x5 = aVar4.x();
                    if (y4 || x5 == c0012a) {
                        x5 = new r010(qjd0Var, 25);
                        aVar4.R(x5);
                    }
                    e5v0.a((gzs) fcyVar, q630.a.a, a4, a5, null, oy20.b.a(oy20.a.C3478a.a(str, (gzs) x5, null, null, null, null, aVar4, 0, 8188), null, false, aVar4, 6), true, false, null, aVar4, 1572912, 400);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                wsh0.a((String) obj4, (gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((clm0) obj4).U0((gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(55));
                break;
            default:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) obj4;
                VideoFile videoFile = (VideoFile) obj3;
                long longValue = ((Long) obj).longValue();
                long longValue2 = ((Long) obj2).longValue();
                gVar.b0.a(videoFile.a1());
                gVar.C(new c.a1.a(longValue, longValue2, videoFile.a1()));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ n85(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
