package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.dto.common.Good;
import com.vk.ecomm.fave.api.models.FaveMarketItem;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.libvideo.design.compose.video.videocell.VideoCellViewState;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.R;
import java.util.List;
import xsna.i3o;
import xsna.q630;
import xsna.xii;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class a73 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a73(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        com.vk.core.compose.component.topbar.a a;
        Good good;
        switch (this.b) {
            case 0:
                d73 d73Var = (d73) this.c;
                mq2 mq2Var = (mq2) this.d;
                Integer num = (Integer) obj;
                num.getClass();
                d73Var.i = 0;
                mq2Var.invoke(num, (String) obj2);
                break;
            case 1:
                List list = (List) this.c;
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                ay9.j(ne7.I(1), (androidx.compose.runtime.a) obj, list, q630Var);
                break;
            case 2:
                dt70 dt70Var = (dt70) this.c;
                z37 z37Var = (z37) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2036251312, intValue, -1, "com.vk.music.playlist.display.audiobook.offline.presentation.compose.ComposableSingletons$OfflineAudioBookChaptersMviComposeComponentKt.lambda$-1072746645.<anonymous>.<anonymous> (OfflineAudioBookChaptersMviComposeComponent.kt:113)");
                    }
                    boolean J = aVar.J(z37Var);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        xii.a aVar2 = new xii.a(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                        aVar.R(aVar2);
                        x = aVar2;
                    }
                    zs70.f(dt70Var, (izs) ((fcy) x), aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 3:
                final izs izsVar = (izs) this.c;
                wh50 wh50Var = (wh50) this.d;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1684319182, intValue2, -1, "com.vk.newsfeed.posting.donut_teaser.presentation.DonutTeaserContentView.ThemedContent.<anonymous> (DonutTeaserContentView.kt:64)");
                    }
                    TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.post_teaser, 0, aVar3), null, null, null, null, aVar3, 196608, 30), null, null, null, aVar3, 14);
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1425642413, 64, -1, "com.vk.newsfeed.posting.donut_teaser.presentation.DonutTeaserContentView.getTopBarStartPart (DonutTeaserContentView.kt:130)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
                    }
                    lg90 b = or.b(aVar3, 861936997, R.drawable.vk_icon_cancel_outline_28, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    String N = d370.N(R.string.accesibility_post_teaser_cancel_button, 0, aVar3);
                    boolean J2 = aVar3.J(izsVar);
                    Object x2 = aVar3.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new vpd(izsVar, 2);
                        aVar3.R(x2);
                    }
                    gzs gzsVar = (gzs) x2;
                    SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
                    Object x3 = aVar3.x();
                    if (x3 == c0012a) {
                        x3 = new gv3(21);
                        aVar3.R(x3);
                    }
                    TopBar$Before.e a3 = TopBar$Before.e.a.a(b, N, gzsVar, null, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x3, 2), aVar3, 1572872, 24);
                    androidx.compose.runtime.a aVar4 = aVar3;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    x3o x3oVar = (x3o) wh50Var.getValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1144176340, 512, -1, "com.vk.newsfeed.posting.donut_teaser.presentation.DonutTeaserContentView.getTopBarEndPart (DonutTeaserContentView.kt:143)");
                    }
                    if (x3oVar.b) {
                        aVar4.K(-1296717350);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        a = d.a.a(d.c.f.a.a(ylu0Var.getIcon().b, aVar4), null, null, null, aVar4, 24576, 14);
                        aVar4.j();
                    } else {
                        aVar4.K(-1296570410);
                        final boolean z = !x3oVar.a && x3oVar.f == null;
                        float f = z ? 1.0f : 0.64f;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1060031380, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DoneOutline28> (VkSdkIcons.kt:712)");
                        }
                        lg90 a4 = pg90.a(R.drawable.vk_icon_done_outline_28, 0, aVar4);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar4.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long c = l5g.c(14, ylu0Var2.getIcon().b, f);
                        String N2 = d370.N(R.string.accesibility_post_teaser_save_button, 0, aVar4);
                        Object x4 = aVar4.x();
                        if (x4 == c0012a) {
                            x4 = new gt(19);
                            aVar4.R(x4);
                        }
                        com.vk.core.compose.component.semantics.a a5 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x4, 2);
                        boolean l = aVar4.l(z) | aVar4.J(izsVar);
                        Object x5 = aVar4.x();
                        if (l || x5 == c0012a) {
                            x5 = new gzs() { // from class: xsna.l3o
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    if (z) {
                                        izsVar.invoke(i3o.a.b);
                                    }
                                    return s3q0.a;
                                }
                            };
                            aVar4.R(x5);
                        }
                        d.c.C0760d a6 = d.c.C0760d.a.a(a4, N2, (gzs) x5, null, new l5g(c), a5, aVar4, 1572872, 8);
                        aVar4 = aVar4;
                        a = d.a.a(a6, null, null, null, aVar4, 24576, 14);
                        aVar4.j();
                    }
                    com.vk.core.compose.component.topbar.a aVar5 = a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    muv0.h(a2, ahn.E(q630.a.a, "DonutTeaserToolbar"), null, null, null, a3, aVar5, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar4, 48, 0, 8092);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 4:
                eoq eoqVar = (eoq) this.c;
                up60 up60Var = (up60) this.d;
                ((Boolean) obj).getClass();
                Object obj3 = (gmq) obj2;
                if (!(obj3 instanceof Good)) {
                    if (!(obj3 instanceof FaveMarketItem)) {
                        break;
                    } else {
                        good = ((FaveMarketItem) obj3).b;
                    }
                } else {
                    good = (Good) obj3;
                }
                ((MarketComponent) eoqVar.a.J.getValue()).l7().d(ao8.s(good), CommonMarketStat$TypeRefSource.BOOKMARKS, Integer.valueOf(up60Var.a.Cb().c), up60Var.a.Cb().b);
                break;
            case 5:
                fsd0 fsd0Var = (fsd0) this.c;
                vod0 vod0Var = (vod0) this.d;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1279331418, intValue3, -1, "com.vk.ecomm.market.search.filters.adapter.holders.ProductFilterSpinnerHolder.bind.<anonymous> (ProductFilterSpinnerHolder.kt:43)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-1961843969, new e3(12, fsd0Var, vod0Var), aVar6), aVar6, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((bdn0) this.c).i6((jdj0) this.d, (androidx.compose.runtime.a) obj, ne7.I(9));
                break;
            case 7:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.video.videocell.a.e((VideoCellViewState.d) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj2).getClass();
                grv0.a((frv0) this.c, (jai) this.d, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ a73(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ a73(m3o m3oVar, izs izsVar, wh50 wh50Var) {
        this.b = 3;
        this.c = izsVar;
        this.d = wh50Var;
    }
}
