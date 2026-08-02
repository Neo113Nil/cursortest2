package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.design.view.subscriptioninfo.SubscriptionInfoView;
import com.vk.video.profile.presentation.models.StateSubscribeNotification;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.j5h;
import xsna.j7t0;
import xsna.k4i;
import xsna.kol0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg4 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sg4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Group b;
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                yg4.a((gzs) obj4, (gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((j5h.d) obj4).g((znj) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                ((gjh) obj4).c.invoke(new d.t.b.a((f5u) obj3, ((Boolean) obj).booleanValue()));
                break;
            case 3:
                k4i.a aVar = (k4i.a) obj4;
                ComposeView composeView = (ComposeView) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(567000698, intValue, -1, "com.vk.profile.community.impl.ui.item.header.CommunityTrustMarkItem.CommunityTrustMarkViewHolder.bindTrustMarkItem.<anonymous>.<anonymous> (CommunityTrustMarkItem.kt:66)");
                    }
                    rrv0.d(null, null, null, null, kai.c(117561845, new vue(r8 ? 1 : 0, aVar, composeView), aVar2), aVar2, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 4:
                zol0 zol0Var = (zol0) obj4;
                z37 z37Var = (z37) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1066931188, intValue2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesScreen.<anonymous>.<anonymous> (StorefrontServicesScreen.kt:60)");
                    }
                    boolean J = aVar3.J(z37Var);
                    Object x = aVar3.x();
                    if (J || x == c0012a) {
                        kol0.c cVar = new kol0.c(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                        aVar3.R(cVar);
                        x = cVar;
                    }
                    kol0.b(zol0Var, (izs) ((fcy) x), aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 5:
                clm0 clm0Var = (clm0) obj4;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1494696080, intValue3, -1, "com.vk.story.viewer.impl.presentation.stories.view.StoryViewBestFriendsModal.Builder.build.<anonymous>.<anonymous>.<anonymous> (StoryViewBestFriendsModal.kt:66)");
                    }
                    zkm0 zkm0Var = new zkm0(ref$ObjectRef, 0);
                    boolean y = aVar4.y(clm0Var);
                    Object x2 = aVar4.x();
                    if (y || x2 == c0012a) {
                        x2 = new rjd(clm0Var, 5);
                        aVar4.R(x2);
                    }
                    clm0Var.T0(zkm0Var, (gzs) ((fcy) x2), aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 6:
                SubscriptionInfoView subscriptionInfoView = (SubscriptionInfoView) obj4;
                int[] iArr = (int[]) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i2 = SubscriptionInfoView.p;
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-871242542, intValue4, -1, "com.vk.profile.design.view.subscriptioninfo.SubscriptionInfoView.ThemedContent.<anonymous>.<anonymous>.<anonymous> (SubscriptionInfoView.kt:69)");
                    }
                    r5j0 shape = subscriptionInfoView.getShape();
                    gzs<s3q0> onClick = subscriptionInfoView.getOnClick();
                    String subscriptionInfoText = subscriptionInfoView.getSubscriptionInfoText();
                    boolean y2 = aVar5.y(iArr);
                    Object x3 = aVar5.x();
                    if (y2 || x3 == c0012a) {
                        x3 = new mdm0(iArr, 3);
                        aVar5.R(x3);
                    }
                    qym0.a(shape, onClick, subscriptionInfoText, null, (izs) x3, aVar5, 0, 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
            default:
                UserId userId = (UserId) obj4;
                StateSubscribeNotification stateSubscribeNotification = (StateSubscribeNotification) obj3;
                UIBlock uIBlock = (UIBlock) obj2;
                if ((uIBlock instanceof UIBlockSearchAuthor) && fkq0.b(userId) && epx.f(uIBlock.g, fkq0.a(userId)) && (b = ((UIBlockSearchAuthor) uIBlock).y.b()) != null) {
                    int i3 = j7t0.a.$EnumSwitchMapping$0[stateSubscribeNotification.ordinal()];
                    b.k0 = i3 != 3 ? i3 != 4 ? i3 != 5 ? "" : VideoNotificationsStatus.NONE.i() : VideoNotificationsStatus.PREFERRED.i() : VideoNotificationsStatus.ALL.i();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ sg4(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
