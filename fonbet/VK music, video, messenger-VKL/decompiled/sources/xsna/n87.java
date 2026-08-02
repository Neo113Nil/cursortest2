package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.biometrics.lock.impl.presentation.base.mvi.setup.e;
import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vk.core.compose.component.datetime.p;
import com.vk.dto.fave.MarketFavable;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.newsfeed.impl.items.posting.item.modals.PostingType;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import kotlin.collections.builders.ListBuilder;
import xsna.vd70;
import xsna.zjq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class n87 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n87(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((com.vk.biometrics.lock.impl.presentation.base.mvi.setup.g) this.d).h((e.b) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((com.vk.clips.attachments.impl.publish.geolocation.presentation.d) this.d).g((com.vk.clips.attachments.impl.publish.geolocation.presentation.j) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 2:
                x3g x3gVar = (x3g) this.d;
                izs izsVar = (izs) this.c;
                mtk0 mtk0Var = (mtk0) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1434170561, intValue, -1, "com.vk.video.playlist.playlistscreen.ui.view.CollapsableHeader.<anonymous> (CollapsableHeader.kt:76)");
                    }
                    w3g.c(x3gVar, izsVar, mtk0Var, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 3:
                MarketFavable marketFavable = (MarketFavable) this.d;
                v110 v110Var = (v110) this.e;
                a210 a210Var = (a210) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (((gmq) obj2).equals(marketFavable)) {
                    v110Var.q.T4(new MarketProductTileConfig.b(booleanValue, true));
                    a210Var.k = booleanValue;
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((fe10) this.d).i((ve10) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((be70) this.d).h((vd70.a) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 6:
                wzs wzsVar = (wzs) this.d;
                qv2 qv2Var = (qv2) this.e;
                wh50 wh50Var = (wh50) this.c;
                ((Integer) obj).intValue();
                String str = (String) obj2;
                wzsVar.invoke(qv2Var, str);
                wh50Var.setValue(str);
                break;
            case 7:
                ((wh50) this.e).setValue(((com.vk.newsfeed.impl.items.posting.item.modals.d) this.d).c.c(new PostingType.UserRedesigned((PostingType.UserRedesigned.Onboarding) obj)));
                ((wh50) this.c).setValue((VkOnboardingCampaign) obj2);
                break;
            case 8:
                siq0 siq0Var = (siq0) this.d;
                zjq0.a.b bVar = (zjq0.a.b) this.e;
                izs izsVar2 = (izs) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1303980430, intValue2, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.UserEditProfileMviView.UserEditContent.<anonymous> (UserEditProfileMviView.kt:79)");
                    }
                    siq0Var.k(bVar, izsVar2, null, aVar2, 4096);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((lrq0) this.d).b((ListBuilder) this.e, (qvm0) this.c, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            default:
                DateTimePickerState dateTimePickerState = (DateTimePickerState) this.d;
                DateTimePickerState.DialogState.TimePicker timePicker = (DateTimePickerState.DialogState.TimePicker) this.e;
                tuo0 tuo0Var = (tuo0) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1466069749, intValue3, -1, "com.vk.core.compose.component.datetime.VkTimePickerDialog.<anonymous> (VkDateTimePicker.kt:119)");
                    }
                    boolean J = aVar3.J(dateTimePickerState);
                    Object x = aVar3.x();
                    if (J || x == a.C0011a.a) {
                        p.b bVar2 = new p.b(0, dateTimePickerState, DateTimePickerState.class, "dismissDialog", "dismissDialog$components_release()V", 0);
                        aVar3.R(bVar2);
                        x = bVar2;
                    }
                    y12.a((gzs) ((fcy) x), kai.c(1873600829, new ip6(dateTimePickerState, timePicker, tuo0Var, 9), aVar3), null, kai.c(-206982849, new hue(dateTimePickerState, 15), aVar3), kai.c(967108930, new bn7(tuo0Var, 18), aVar3), null, 0L, 0L, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar3, 1575984);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ n87(Object obj, Object obj2, izs izsVar, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = izsVar;
    }

    public /* synthetic */ n87(x3g x3gVar, izs izsVar, mtk0 mtk0Var) {
        this.b = 2;
        this.d = x3gVar;
        this.c = izsVar;
        this.e = mtk0Var;
    }
}
