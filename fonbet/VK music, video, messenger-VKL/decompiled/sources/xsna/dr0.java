package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.fullscreenvideo.design.view.bottom.FullscreenBottomControlsView;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.kyj;
import xsna.q630;
import xsna.vp1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class dr0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dr0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        q630.a aVar = q630.a.a;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                TopBar$Before.e eVar = (TopBar$Before.e) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1457976162, intValue, -1, "com.vk.newsfeed.posting.additional_settings.presentation.base.view.AdditionalSettingsContentView.ThemedContent.<anonymous>.<anonymous>.<anonymous> (AdditionalSettingsContentView.kt:71)");
                    }
                    muv0.h(TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.additional_settings_screen_title, 0, aVar2), null, null, null, null, aVar2, 196608, 30), null, null, null, aVar2, 14), ahn.E(aVar, "AdditionalSettingsToolbar"), null, null, null, eVar, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 1572912, 0, 8092);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 1:
                ((com.vk.movika.sdk.base.logic.interactor.p) obj3).invoke(new vp1.h((List) obj, ((Boolean) obj2).booleanValue()));
                return s3q0.a;
            case 2:
                ((izs) obj3).invoke((g47) obj);
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                zyg.a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 4:
                kyj kyjVar = (kyj) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2071853605, intValue2, -1, "com.vk.clips.design.compose.counters.ComposableSingletons$CountersBlockKt.lambda$687888334.<anonymous>.<anonymous> (CountersBlock.kt:70)");
                    }
                    if (kyjVar instanceof kyj.b) {
                        aVar3.K(-384181024);
                        gyj.e(((kyj.b) kyjVar).a, 0, aVar3);
                        aVar3.j();
                    } else {
                        if (!(kyjVar instanceof kyj.a)) {
                            throw alb0.c(-1813510022, aVar3);
                        }
                        aVar3.K(-384039385);
                        ArrayList arrayList = ((kyj.a) kyjVar).a;
                        Object x = aVar3.x();
                        if (x == a.C0011a.a) {
                            x = new ob(16);
                            aVar3.R(x);
                        }
                        gyj.b(arrayList, (izs) x, aVar3, 48);
                        aVar3.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 5:
                String str = (String) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-935400128, intValue3, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.DeliveryPointAddressDetails.<anonymous> (DeliveryPointDetails.kt:238)");
                    }
                    q630 f = txj0.f(aVar, 1.0f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getText().m;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar4.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str, f, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.c0, aVar4, 48, 0, 8184);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 6:
                ((DialogActionsListView) obj).setActionIconColor(e3m.f(R.attr.vk_ui_icon_accent_themed, (Context) obj3));
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                int i2 = FullscreenBottomControlsView.o;
                ((FullscreenBottomControlsView) obj3).o(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                vma0.b((n80) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 9:
                fgb0 fgb0Var = (fgb0) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2100566395, intValue4, -1, "com.vk.music.stickyplayer.presentation.components.podcast.PodcastBigPlayerControls.Content.<anonymous> (PodcastBigPlayerControls.kt:37)");
                    }
                    fgb0Var.d(0, aVar5);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 10:
                ((Boolean) obj).booleanValue();
                lf30 lf30Var = ((hcp0) obj3).v;
                if (lf30Var != null) {
                    lf30Var.a();
                }
                return s3q0.a;
            default:
                tet0 tet0Var = (tet0) obj3;
                int intValue5 = ((Integer) obj).intValue();
                wh50<set0> wh50Var = tet0Var.m;
                VideoSearchFiltersImpl copy = ((set0) ((zak0) wh50Var).getValue()).copy();
                copy.h = intValue5;
                copy.l = ((ecr) obj2).getType();
                ((zak0) wh50Var).setValue(copy);
                tet0Var.B();
                return s3q0.a;
        }
    }

    public /* synthetic */ dr0(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
