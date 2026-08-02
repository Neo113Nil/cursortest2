package xsna;

import android.app.Activity;
import android.content.Context;
import android.util.Size;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.ui.core.analytics.tracking.SearchAuthorAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.c;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.libvideo.bottomsheet.notifications.SubscriptionAction;
import com.vk.permission.PermissionHelper;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeSystemPushClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.subscription.api.SubscribeStatus;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ikv0;
import xsna.spb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class gqb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ gqb(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        int i = this.b;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                List list = (List) obj6;
                ph90 ph90Var = (ph90) obj5;
                spb.a aVar = (spb.a) obj4;
                int[] iArr = (int[]) obj3;
                iqb iqbVar = (iqb) obj2;
                int i2 = ((ModalActionSheetListItem) obj).a;
                if (!epx.f(ph90Var.b, (String) list.get(i2))) {
                    aVar.e = iArr[i2];
                    ph90Var.b = (String) list.get(i2);
                    iqbVar.a.notifyDataSetChanged();
                    qus qusVar = iqbVar.f;
                    if (qusVar != null) {
                        qusVar.d(ph90Var);
                    }
                }
                return s3q0.a;
            default:
                final com.vk.catalog2.common.ui.holders.c cVar = (com.vk.catalog2.common.ui.holders.c) obj6;
                Group group = (Group) obj5;
                Activity activity = (Activity) obj4;
                final Context context = (Context) obj3;
                final UIBlockSearchAuthor uIBlockSearchAuthor = (UIBlockSearchAuthor) obj2;
                int i3 = 1;
                switch (c.a.$EnumSwitchMapping$0[((SubscriptionAction) obj).ordinal()]) {
                    case 1:
                        cVar.a(group.c, VideoNotificationsStatus.ALL);
                        break;
                    case 2:
                        cVar.a(group.c, VideoNotificationsStatus.PREFERRED);
                        break;
                    case 3:
                        cVar.a(group.c, VideoNotificationsStatus.NONE);
                        break;
                    case 4:
                        new bjc(MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_ALL_AUTHORS, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsVideoStat$TypeSystemPushClick(null, i3, 0 == true ? 1 : 0), 2)).q();
                        PermissionHelper.v(PermissionHelper.a, activity);
                        break;
                    case 5:
                        Owner a = tsj.a(group);
                        cVar.g = true;
                        fxc0.B().getClass();
                        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(a.b.b), null, null, null, 58, null), new MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick(MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick.EventType.HIDE_CREATOR_FROM_SUBSCRIPTIONS), 2);
                        UiTracker uiTracker = UiTracker.a;
                        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                        uzp0 uzp0Var = UiTracker.h;
                        uzp0Var.getClass();
                        new bjc(c, b, uzp0Var.a).q();
                        break;
                    case 6:
                        final UserId userId = group.c;
                        if (uIBlockSearchAuthor == null || (str = uIBlockSearchAuthor.D) == null) {
                            str = group.O;
                        }
                        final String str2 = str;
                        com.vk.core.utils.newtork.b.a.getClass();
                        if (!com.vk.core.utils.newtork.b.d()) {
                            cvk.u(R.string.error_network, false);
                            break;
                        } else {
                            io.reactivex.rxjava3.disposables.c cVar2 = cVar.d;
                            if (cVar2 != null) {
                                cVar2.dispose();
                            }
                            io.reactivex.rxjava3.disposables.c subscribe = rsg0.Z(new hqu(userId, (String) null, str2, (AdminLeaveAction) null, 26)).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.syd0
                                /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
                                @Override // io.reactivex.rxjava3.functions.a
                                public final void run() {
                                    com.vk.catalog2.common.ui.holders.c cVar3 = com.vk.catalog2.common.ui.holders.c.this;
                                    ?? r1 = cVar3.c;
                                    q3a q3aVar = cVar3.a;
                                    r1.invoke(SearchAuthorAnalyticsInfo.ClickTarget.Unsubscribe);
                                    Context context2 = context;
                                    ikv0.a aVar2 = new ikv0.a(context2);
                                    float f = 28;
                                    aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_minus_square_outline_28, Integer.valueOf(R.attr.vk_ui_icon_accent_themed), new Size(iah0.a(f), iah0.a(f)), 8);
                                    aVar2.u = new ikv0.d(context2.getString(R.string.community_unsubscribed), (String) null, (ikv0.d.a) null, 6);
                                    String string = context2.getString(R.string.cancel);
                                    UIBlockSearchAuthor uIBlockSearchAuthor2 = uIBlockSearchAuthor;
                                    UserId userId2 = userId;
                                    aVar2.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, string, new xs70(cVar3, uIBlockSearchAuthor2, userId2, str2, 1));
                                    aVar2.o = Integer.valueOf(iah0.a(8));
                                    pkv0.f(aVar2);
                                    if (uIBlockSearchAuthor2 != null) {
                                        q3aVar.b(new xxf0(uIBlockSearchAuthor2.Fb()), false);
                                    }
                                    q3aVar.b(new oon0("author_unsubscribe", null, false, false, 14), false);
                                    com.vk.catalog2.common.ui.holders.c.d(userId2);
                                    xwk.e().T().m().b(new kym0(SubscribeStatus.MEMBER_STATUS_NOT_MEMBER, userId2, null, null, 12));
                                }
                            }, new p350(new y510(17), 11));
                            cVar.b.a(subscribe);
                            cVar.d = subscribe;
                            break;
                        }
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
        }
    }
}
