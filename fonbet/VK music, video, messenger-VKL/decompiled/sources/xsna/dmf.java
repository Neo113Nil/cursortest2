package xsna;

import android.content.Context;
import com.vk.api.generated.utils.dto.UtilsDomainResolvedWithDataDto;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.clips.viewer.impl.unknown.NotFoundClipsFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.notifications.NotificationItem;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.notifications.NotificationClickHandlerImpl;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vkontakte.android.R;
import xsna.o0r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class dmf implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ dmf(Context context, boolean z, SearchStatsLoggingInfo searchStatsLoggingInfo, yp80 yp80Var) {
        this.d = context;
        this.c = z;
        this.e = searchStatsLoggingInfo;
        this.f = yp80Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
    
        if (r3.equals("group") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x018b, code lost:
    
        r3 = r2.g();
        r2 = r2.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0194, code lost:
    
        if (r2 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x019c, code lost:
    
        if (r2.o3() != com.vk.api.generated.base.dto.BaseBoolIntDto.YES) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01a4, code lost:
    
        if (r2.f() == com.vk.api.generated.groups.dto.GroupsGroupAdminLevelDto.EDITOR) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x01ac, code lost:
    
        if (r2.f() != com.vk.api.generated.groups.dto.GroupsGroupAdminLevelDto.ADMINISTRATOR) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01ae, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01b1, code lost:
    
        r3 = -r3;
        r2 = new com.vk.dto.shortvideo.ClipGridParams.OnlyId.Profile(new com.vk.dto.common.id.UserId(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01c8, code lost:
    
        if (xsna.g620.f().getExperiments().k() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01ca, code lost:
    
        com.vk.clips.viewer.api.routing.ClipsRouter.j(xsna.g620.f().a(), r7, r2, r5, r13, null, 40);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0207, code lost:
    
        r1.onSuccess();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01df, code lost:
    
        xsna.xwk.e().m(r7, new com.vk.dto.common.id.UserId(r3), new xsna.o0r0.a(false, null, null, null, r13, null, null, false, false, false, false, null, null, null, 65519));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01b0, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x015a, code lost:
    
        if (r3.equals("page") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x017b, code lost:
    
        if (r3.equals(io.appmetrica.analytics.BuildConfig.SDK_BUILD_FLAVOR) == false) goto L45;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        boolean z = this.c;
        switch (i) {
            case 0:
                Context context = (Context) obj4;
                SearchStatsLoggingInfo searchStatsLoggingInfo = (SearchStatsLoggingInfo) obj3;
                yp80 yp80Var = (yp80) obj2;
                UtilsDomainResolvedWithDataDto utilsDomainResolvedWithDataDto = (UtilsDomainResolvedWithDataDto) obj;
                String type = utilsDomainResolvedWithDataDto.getType();
                switch (type.hashCode()) {
                    case -977423767:
                        break;
                    case 3392903:
                        if (type.equals("null")) {
                            new NotFoundClipsFragment.a(NotFoundClipsFragment.Type.PROFILE).k(context);
                            yp80Var.onSuccess();
                            break;
                        }
                        yp80Var.onError(new IllegalStateException(utilsDomainResolvedWithDataDto.getType()));
                        break;
                    case 3433103:
                        break;
                    case 3599307:
                        if (type.equals("user")) {
                            long g = utilsDomainResolvedWithDataDto.g();
                            if (g620.f().getExperiments().k()) {
                                t6g0 t6g0Var = t6g0.b;
                                Group C0 = t6g0.b().C0(fkq0.a(new UserId(g)));
                                ClipsRouter.j(g620.f().a(), context, new ClipGridParams.OnlyId.Profile(new UserId(g)), o25.a().a(new UserId(g)) || (C0 != null && C0.e()), searchStatsLoggingInfo, null, 40);
                            } else {
                                xwk.e().m(context, new UserId(g), new o0r0.a(false, null, null, null, searchStatsLoggingInfo, null, null, false, false, false, false, null, null, null, 65519));
                            }
                            if (z) {
                                new iof(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE, new SchemeStat$TypeClipViewerItem(SchemeStat$TypeClipViewerItem.ScreenType.PROFILE, SchemeStat$TypeClipViewerItem.EventType.SHOW_PROFILE_FROM_QR_CODE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741820, null)).q();
                            }
                            yp80Var.onSuccess();
                            break;
                        }
                        yp80Var.onError(new IllegalStateException(utilsDomainResolvedWithDataDto.getType()));
                        break;
                    case 98629247:
                        break;
                    default:
                        yp80Var.onError(new IllegalStateException(utilsDomainResolvedWithDataDto.getType()));
                        break;
                }
                break;
            default:
                NotificationItem notificationItem = (NotificationItem) obj4;
                bj70 bj70Var = (bj70) obj3;
                NotificationClickHandlerImpl notificationClickHandlerImpl = (NotificationClickHandlerImpl) obj2;
                if (z) {
                    notificationItem.v = new NotificationItem.b(Integer.valueOf(R.drawable.vk_icon_done_24), Integer.valueOf(R.string.friend_req_accepted));
                } else {
                    notificationItem.v = new NotificationItem.b(Integer.valueOf(R.drawable.vk_icon_cancel_24), Integer.valueOf(R.string.friend_req_declined));
                }
                if (bj70Var != null) {
                    bj70Var.Q(notificationItem);
                }
                notificationClickHandlerImpl.a.b();
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ dmf(boolean z, NotificationItem notificationItem, bj70 bj70Var, NotificationClickHandlerImpl notificationClickHandlerImpl) {
        this.c = z;
        this.d = notificationItem;
        this.e = bj70Var;
        this.f = notificationClickHandlerImpl;
    }
}
