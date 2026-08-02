package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutBlockDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutDescriptionDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutGoalsDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutSubscriptionsDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.video.dto.VideoSetNotificationsStatusStatusDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.libvideo.api.Subscription;
import com.vk.libvideo.donut.model.Donut;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.d1o;
import xsna.wqu;

/* compiled from: VideoSubscriptionRepositoryImpl.kt */
/* loaded from: classes2.dex */
public final class wit0 implements vit0 {
    public static final List<GroupsFieldsDto> c = Collections.singletonList(GroupsFieldsDto.DONUT);
    public final uft0 a;
    public final zqu b;

    /* compiled from: VideoSubscriptionRepositoryImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[VideoNotificationsStatus.values().length];
            try {
                iArr[VideoNotificationsStatus.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoNotificationsStatus.PREFERRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoNotificationsStatus.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GroupsGroupFullDto.VideoNotificationsStatusDto.values().length];
            try {
                iArr2[GroupsGroupFullDto.VideoNotificationsStatusDto.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GroupsGroupFullDto.VideoNotificationsStatusDto.ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GroupsGroupFullDto.VideoNotificationsStatusDto.PREFERRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Subscription.Subscribed.Notifications.values().length];
            try {
                iArr3[Subscription.Subscribed.Notifications.All.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[Subscription.Subscribed.Notifications.Preferred.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[Subscription.Subscribed.Notifications.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* compiled from: VideoSubscriptionRepositoryImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<GroupsGroupFullDto, u2o> {
        public static final b b = new b(1, d1o.class, "toDonutStatus", "toDonutStatus(Lcom/vk/api/generated/groups/dto/GroupsGroupFullDto;)Lcom/vk/libvideo/donut/model/DonutStatus;", 1);

        /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0077  */
        @Override // xsna.izs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final u2o invoke(GroupsGroupFullDto groupsGroupFullDto) {
            Donut donut;
            lyn lynVar;
            BaseBoolIntDto o3;
            Pair pair;
            Donut.DonutStatus donutStatus;
            Donut.DonutStatus donutStatus2;
            BaseLinkButtonActionDto e;
            GroupsGroupFullDto groupsGroupFullDto2 = groupsGroupFullDto;
            GroupsGroupDonutDto l0 = groupsGroupFullDto2.l0();
            Boolean bool = null;
            if (l0 != null) {
                GroupsGroupDonutDescriptionDto e2 = l0.e();
                if (e2 instanceof GroupsGroupDonutDescriptionDto.GroupsGroupDonutDescriptionLevelsDisabledDto) {
                    BaseLinkButtonDto e3 = ((GroupsGroupDonutDescriptionDto.GroupsGroupDonutDescriptionLevelsDisabledDto) e2).e();
                    pair = new Pair(e3 != null ? e3.getTitle() : null, (e3 == null || (e = e3.e()) == null) ? null : e.getUrl());
                } else {
                    pair = new Pair(null, null);
                }
                String str = (String) pair.d();
                String str2 = (String) pair.g();
                boolean j = l0.j();
                GroupsGroupDonutDto.StatusDto g = l0.g();
                int i = g == null ? -1 : d1o.a.$EnumSwitchMapping$0[g.ordinal()];
                if (i == 1) {
                    donutStatus = Donut.DonutStatus.ACTIVE;
                } else if (i != 2) {
                    donutStatus2 = null;
                    BaseLinkButtonActionDto f = l0.f();
                    donut = new Donut(j, donutStatus2, str, str2, f == null ? f.getUrl() : null);
                } else {
                    donutStatus = Donut.DonutStatus.EXPIRING;
                }
                donutStatus2 = donutStatus;
                BaseLinkButtonActionDto f2 = l0.f();
                donut = new Donut(j, donutStatus2, str, str2, f2 == null ? f2.getUrl() : null);
            } else {
                donut = null;
            }
            GroupsGroupDonutBlockDto v0 = groupsGroupFullDto2.v0();
            if (v0 != null) {
                GroupsGroupDonutSubscriptionsDto e4 = v0.e();
                String title = e4 != null ? e4.getTitle() : null;
                GroupsGroupDonutGoalsDto d = v0.d();
                String title2 = d != null ? d.getTitle() : null;
                if (title != null && title2 != null) {
                    lynVar = new lyn(title, title2);
                    o3 = groupsGroupFullDto2.o3();
                    if (o3 != null) {
                        bool = Boolean.valueOf(o3 == BaseBoolIntDto.YES);
                    }
                    return new u2o(donut, lynVar, bool);
                }
            }
            lynVar = null;
            o3 = groupsGroupFullDto2.o3();
            if (o3 != null) {
            }
            return new u2o(donut, lynVar, bool);
        }
    }

    public wit0(uft0 uft0Var, zqu zquVar) {
        this.a = uft0Var;
        this.b = zquVar;
    }

    @Override // xsna.vit0
    public final void a(UserId userId) {
        io.reactivex.rxjava3.subjects.f<Pair<UserId, VideoNotificationsStatus>> fVar = tys0.a;
        tys0.a.onNext(new Pair<>(userId, VideoNotificationsStatus.PREFERRED));
    }

    @Override // xsna.vit0
    public final io.reactivex.rxjava3.core.q<Subscription> b(UserId userId) {
        dz2 x = yfb.x(wqu.a.b(this.b, Collections.singletonList(fkq0.a(userId)), e43.l(GroupsFieldsDto.IS_MEMBER, GroupsFieldsDto.VIDEO_NOTIFICATIONS_STATUS), null, 4));
        ahn.D(x);
        return rsg0.w0(x).l(new u730(new av70(24), 18)).w().L(new or20(new zas0(1, this, userId), 19), false);
    }

    @Override // xsna.vit0
    public final io.reactivex.rxjava3.internal.operators.completable.w c(UserId userId, VideoNotificationsStatus videoNotificationsStatus) {
        VideoSetNotificationsStatusStatusDto videoSetNotificationsStatusStatusDto;
        int i = a.$EnumSwitchMapping$0[videoNotificationsStatus.ordinal()];
        if (i == 1) {
            videoSetNotificationsStatusStatusDto = VideoSetNotificationsStatusStatusDto.ALL;
        } else if (i == 2) {
            videoSetNotificationsStatusStatusDto = VideoSetNotificationsStatusStatusDto.PREFERRED;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            videoSetNotificationsStatusStatusDto = VideoSetNotificationsStatusStatusDto.NONE;
        }
        return new io.reactivex.rxjava3.internal.operators.observable.l0(rsg0.T(yfb.x(this.a.n(userId, videoSetNotificationsStatusStatusDto))), new oe40(new vnb0(8, videoSetNotificationsStatusStatusDto, userId), 17)).o(asu0.a.d()).g(new isa(6, userId, videoNotificationsStatus));
    }

    @Override // xsna.vit0
    public final io.reactivex.rxjava3.core.q<VideoNotificationsStatus> d(UserId userId) {
        if (!fkq0.b(userId)) {
            return io.reactivex.rxjava3.core.q.H(new IllegalArgumentException("Allowed to subscribe to change notifications only for groups"));
        }
        io.reactivex.rxjava3.internal.operators.observable.j1 a2 = tys0.a(userId);
        dz2 x = yfb.x(wqu.a.b(this.b, Collections.singletonList(fkq0.a(userId)), Collections.singletonList(GroupsFieldsDto.VIDEO_NOTIFICATIONS_STATUS), null, 4));
        ahn.D(x);
        return io.reactivex.rxjava3.core.q.X(a2, new io.reactivex.rxjava3.internal.operators.observable.c2(new io.reactivex.rxjava3.internal.operators.observable.i0(rsg0.T(x).U(new gs00(new gz30(28), 20)), new xw70(new t6c0(14), 14)).U(new vtg0(new o7j0(14), 12)), new xb20(new nc90(28), 25)));
    }

    @Override // xsna.vit0
    public final io.reactivex.rxjava3.core.q<u2o> e(UserId userId) {
        dz2 x = yfb.x(wqu.a.b(this.b, Collections.singletonList(fkq0.a(userId)), c, null, 4));
        ahn.D(x);
        return rsg0.w0(x).l(new mft0(new wep0(6))).l(new o8c0(new xep0(6), 11)).l(new e4r(b.b, 2)).w();
    }

    @Override // xsna.vit0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 f(UserId userId) {
        return new io.reactivex.rxjava3.internal.operators.observable.i0(xwk.e().T().m().d, new f0j0(new wqp(userId, 1), 7)).U(new hi70(new t810(25), 12));
    }
}
