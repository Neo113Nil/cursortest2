package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.profile.community.impl.ui.events.CommunityEventsFragment;
import com.vk.profile.community.impl.ui.events.CommunityEventsState;
import com.vk.subscription.api.SubscribeStatus;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.dg70;
import xsna.ikv0;
import xsna.loh0;
import xsna.oap;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class bta implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bta(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        int i2 = 2;
        int i3 = 3;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                izs izsVar = (izs) obj2;
                ((gta) obj4).getClass();
                Context context = ((po6) obj3).getContext();
                lpj lpjVar = context instanceof lpj ? (lpj) context : null;
                Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
                dhr0.a.getClass();
                int i4 = dhr0.u().c;
                if (valueOf == null || valueOf.intValue() != i4) {
                    context = new l7s(context, dhr0.u().c);
                }
                int i5 = h03.a(th) ? R.string.network_error : R.string.download_error;
                ikv0.a aVar = new ikv0.a(context);
                aVar.u = new ikv0.d(context.getString(i5), (String) null, (ikv0.d.a) null, 6);
                aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.viewer_retry), new zsa(izsVar, null == true ? 1 : 0));
                aVar.o = 0;
                aVar.e = -1L;
                return new in0(pkv0.f(aVar), 14);
            case 1:
                UserId userId = (UserId) obj4;
                UIBlock uIBlock = (UIBlock) obj2;
                SubscribeStatus.Companion.getClass();
                boolean c = SubscribeStatus.a.c((SubscribeStatus) obj3);
                if (uIBlock instanceof UIBlockSearchAuthor) {
                    UIBlockSearchAuthor uIBlockSearchAuthor = (UIBlockSearchAuthor) uIBlock;
                    if (uIBlockSearchAuthor.Pb().equals(fkq0.a(userId))) {
                        oap<? extends UserProfile, ? extends Group> oapVar = uIBlockSearchAuthor.y;
                        if (oapVar instanceof oap.b) {
                            Group group = (Group) ((oap.b) oapVar).a;
                            if ((group.C() || group.n()) && c && !fkq0.c(group.L)) {
                                group.j = false;
                                group.C = 4;
                            } else {
                                group.j = c;
                                group.C = c ? 1 : -1;
                            }
                        } else {
                            if (!(oapVar instanceof oap.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            UserProfile userProfile = (UserProfile) ((oap.a) oapVar).a;
                            if (c) {
                                i2 = 1;
                            } else if (userProfile.v != 3) {
                                i2 = 0;
                            }
                            userProfile.v = i2;
                        }
                    }
                }
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                d1h.c((loh0.c.b) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 3:
                CommunityEventsState communityEventsState = (CommunityEventsState) obj4;
                CommunityEventsFragment communityEventsFragment = (CommunityEventsFragment) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = CommunityEventsFragment.P;
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-123133624, intValue, -1, "com.vk.profile.community.impl.ui.events.CommunityEventsFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommunityEventsFragment.kt:108)");
                    }
                    boolean y = aVar2.y(communityEventsFragment);
                    Object x = aVar2.x();
                    if (y || x == c0012a) {
                        x = new dwg(communityEventsFragment, true ? 1 : 0);
                        aVar2.R(x);
                    }
                    com.vk.profile.community.impl.ui.events.d.e(communityEventsState, (izs) x, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 4:
                u710 u710Var = (u710) obj4;
                z37 z37Var = (z37) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1451444145, intValue2, -1, "com.vk.ecomm.market.good.linkedcontent.mvi2.ui.ComposableSingletons$MarketLinkedContentScreenKt.lambda$-998467283.<anonymous>.<anonymous> (MarketLinkedContentScreen.kt:119)");
                    }
                    boolean J = aVar3.J(z37Var);
                    Object x2 = aVar3.x();
                    if (J || x2 == c0012a) {
                        x2 = new igh(z37Var, i3);
                        aVar3.R(x2);
                    }
                    j710.e(u710Var, (izs) x2, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 5:
                us2 us2Var = (us2) obj4;
                frv0 frv0Var = (frv0) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1282927012, intValue3, -1, "com.vk.notifications.design.compose.list.common.NotificationSubtitleAsTitleContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MilkshakeNotification.kt:249)");
                    }
                    yqv0.d(us2Var, ahn.E(q630.a.a, "NotificationSubtitle"), 0L, 0, null, 2, false, 7, null, null, frv0Var, aVar4, 100663344, 6, 6908);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                fg70.f((dg70.e) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.preview.c.q((PreviewViewState.n) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                ((obe0) obj4).d((bn50) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                kol0.b((zol0) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                anx anxVar = (anx) obj4;
                yzs yzsVar = (yzs) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1315356744, intValue4, -1, "com.vk.core.compose.component.VkAccentScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VkAccentTabRow.kt:231)");
                    }
                    yzsVar.invoke(u6u0.g(anxVar, aVar5, 0), aVar5, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ bta(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ bta(c2e c2eVar, UserId userId, SubscribeStatus subscribeStatus) {
        this.b = 1;
        this.c = userId;
        this.d = subscribeStatus;
    }
}
