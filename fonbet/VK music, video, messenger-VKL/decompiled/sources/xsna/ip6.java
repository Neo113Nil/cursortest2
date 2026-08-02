package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dzenarticle.impl.ui.view.ad.AdActions;
import com.vk.dzenarticle.impl.ui.view.ad.BaseTopAdView;
import com.vk.ecomm.design.compose.productattaches.ProductVideoAttach;
import com.vk.music.informer.mvi.MusicPlayerInformerViewState;
import com.vk.newsfeed.impl.items.posting.item.modals.d;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ip6 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ip6(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                fe0 fe0Var = (fe0) obj5;
                BaseTopAdView baseTopAdView = (BaseTopAdView) obj4;
                BaseTopAdView.a aVar = (BaseTopAdView.a) obj3;
                VkContextMenu vkContextMenu = (VkContextMenu) obj;
                String str = (String) obj2;
                if (str.equals(AdActions.DEBUG.h()) || str.equals(AdActions.ADS_COPY_URL.h()) || str.equals(AdActions.SHOW_ADVERTISER_INFO.h()) || str.equals(AdActions.ADS_RECOMMENDATIONS_INFO.h()) || str.equals(AdActions.AD_MARKER_TEMPLATE.h()) || str.equals(AdActions.ERID.h())) {
                    fe0Var.c(str);
                } else if (str.equals(AdActions.PURCHASED.h()) || str.equals(AdActions.TOO_MANY.h()) || str.equals(AdActions.OFFENSIVE_HIDE.h()) || str.equals(AdActions.SEXUAL_HIDE.h()) || str.equals(AdActions.ILLEGAL_HIDE.h()) || str.equals(AdActions.SCAM_HIDE.h()) || str.equals(AdActions.NOT_INTERESTED.h())) {
                    fe0Var.c(str);
                    izs<cro, s3q0> onAction = baseTopAdView.getOnAction();
                    if (onAction != null) {
                        onAction.invoke(aVar.c);
                    }
                } else if (str.equals(AdActions.REPORT.h())) {
                    if (vkContextMenu != null) {
                        vkContextMenu.e(null);
                    }
                    izs<cro, s3q0> onAction2 = baseTopAdView.getOnAction();
                    if (onAction2 != null) {
                        onAction2.invoke(aVar.d);
                    }
                }
                if (vkContextMenu != null) {
                    vkContextMenu.b();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                nr8.c((hkr0) obj5, (String) obj4, (VkBlurContentView) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((hv40) obj5).j(ne7.I(49), (androidx.compose.runtime.a) obj, (izs) obj4, (q630) obj3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((com.vk.music.informer.mvi.a) obj5).h((MusicPlayerInformerViewState) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 4:
                cic0 cic0Var = (cic0) obj5;
                wpc0<?> wpc0Var = (wpc0) obj4;
                izs<? super PostingAction, s3q0> izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-389175751, intValue, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.PostingOtherStepsContentView.ThemedContent.<anonymous>.<anonymous>.<anonymous> (PostingOtherStepsContentView.kt:110)");
                    }
                    int i2 = ComposeView.n;
                    cic0Var.h(wpc0Var, izsVar, aVar2, 512);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 5:
                d.b bVar = (d.b) obj5;
                spg0 spg0Var = (spg0) obj4;
                q630 q630Var = (q630) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1185619213, intValue2, -1, "com.vk.newsfeed.impl.items.posting.item.modals.SimplePostingCreateBottomSheet.TooltipIcon.Content.<anonymous> (SimplePostingCreateBottomSheet.kt:459)");
                    }
                    bVar.b.a(spg0Var, q630Var, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                z9q0.a((fze) obj5, (izs) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                d0s0.a((e0s0) obj5, (gzs) obj4, (gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                com.vk.ecomm.design.compose.productattaches.b.a((ProductVideoAttach) obj5, (q630) obj4, (gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            default:
                DateTimePickerState dateTimePickerState = (DateTimePickerState) obj5;
                DateTimePickerState.DialogState.TimePicker timePicker = (DateTimePickerState.DialogState.TimePicker) obj4;
                tuo0 tuo0Var = (tuo0) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1873600829, intValue3, -1, "com.vk.core.compose.component.datetime.VkTimePickerDialog.<anonymous>.<anonymous> (VkDateTimePicker.kt:122)");
                    }
                    boolean J = aVar4.J(dateTimePickerState) | aVar4.y(timePicker) | aVar4.y(tuo0Var);
                    Object x = aVar4.x();
                    if (J || x == a.C0011a.a) {
                        x = new bv3(dateTimePickerState, timePicker, tuo0Var, 8);
                        aVar4.R(x);
                    }
                    bqv0.d(0, 1, aVar4, (gzs) x, false);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ip6(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
