package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupDto;
import com.vk.api.generated.notifications.dto.NotificationsGroupUnreadCounterDto;
import com.vk.api.generated.notifications.dto.NotificationsUnreadCountersDto;
import com.vk.core.preference.Preference;
import com.vk.dto.user.UserProfile;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.fd70;
import xsna.nd70;
import xsna.tlo0;
import xsna.wd70;

/* compiled from: NotificationMenuModalFeature.kt */
/* loaded from: classes4.dex */
public final class md70 extends wk50<ce70, yd70, fd70, nd70> {
    public final ExtendedProfilesRepository f;
    public final b25 g;
    public final f4z h;
    public final hpj i;
    public final s101 j;
    public final Object k;

    public md70(ExtendedProfilesRepository extendedProfilesRepository, b25 b25Var) {
        super(fd70.b.b, new ud70(new yd70(0)));
        this.f = extendedProfilesRepository;
        this.g = b25Var;
        this.h = new f4z();
        this.i = zvj.a(hqu0.a());
        this.j = new s101();
        this.k = msy.a(LazyThreadSafetyMode.NONE, new vo50(5));
    }

    public static final ee70 U(md70 md70Var, int i) {
        UserProfile userProfile;
        ExtendedUserProfile L0 = md70Var.f.L0(md70Var.g.c());
        String str = (L0 == null || (userProfile = L0.a) == null) ? null : userProfile.h;
        tlo0.f h = tq.h(tlo0.Companion, R.string.notification_list_dot_menu_user_source_title);
        if (str == null) {
            str = "";
        }
        return new ee70(null, h, str, i);
    }

    public static final ArrayList V(md70 md70Var, List list, NotificationsUnreadCountersDto notificationsUnreadCountersDto) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GroupsGroupDto groupsGroupDto = (GroupsGroupDto) it.next();
            Long valueOf = Long.valueOf(groupsGroupDto.g().b);
            tlo0.a aVar = tlo0.Companion;
            String i = groupsGroupDto.i();
            if (i == null) {
                i = "";
            }
            tlo0.h d = oq.d(aVar, i);
            String o = groupsGroupDto.o();
            String str = (o == null && (o = groupsGroupDto.k()) == null && (o = groupsGroupDto.j()) == null && (o = groupsGroupDto.n()) == null) ? "" : o;
            Iterator<T> it2 = notificationsUnreadCountersDto.d().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (epx.f(((NotificationsGroupUnreadCounterDto) obj).e(), groupsGroupDto.g())) {
                    break;
                }
            }
            NotificationsGroupUnreadCounterDto notificationsGroupUnreadCounterDto = (NotificationsGroupUnreadCounterDto) obj;
            arrayList.add(new ee70(valueOf, d, str, notificationsGroupUnreadCounterDto != null ? notificationsGroupUnreadCounterDto.d() : 0));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wk50
    public final void N(yd70 yd70Var, fd70 fd70Var) {
        boolean z;
        fd70 fd70Var2 = fd70Var;
        boolean z2 = yd70Var.e;
        boolean z3 = fd70Var2 instanceof fd70.b;
        hpj hpjVar = this.i;
        ?? r4 = this.k;
        if (z3) {
            if (this.f.L0(this.g.c()) == null) {
                z = false;
            } else {
                ComFeatures comFeatures = ComFeatures.COM_REMOVE_USER_STATS_IN_NOTIFY_SCREEN;
                comFeatures.getClass();
                z = !com.vk.toggle.b.A.a(comFeatures);
            }
            ((he70) r4.getValue()).getClass();
            boolean b = he70.b();
            ((he70) r4.getValue()).getClass();
            T(new nd70.c(he70.a(), z, b));
            myc0.h(hpjVar, null, null, new ld70(this, null), 3);
            return;
        }
        if (fd70Var2.equals(fd70.c.b)) {
            myc0.h(hpjVar, null, null, new ld70(this, null), 3);
            return;
        }
        boolean equals = fd70Var2.equals(fd70.f.b);
        f4z f4zVar = this.h;
        if (equals) {
            f4zVar.b(wd70.d.a);
            return;
        }
        if (fd70Var2.equals(fd70.e.b)) {
            f4zVar.b(wd70.c.a);
            return;
        }
        if (fd70Var2.equals(fd70.d.b)) {
            f4zVar.b(wd70.b.a);
            return;
        }
        if (fd70Var2.equals(fd70.g.b)) {
            boolean z4 = !z2;
            ((he70) r4.getValue()).getClass();
            Preference.I("notification_prefs", "notification_grouping_enabled", z4);
            T(new nd70.f(z4));
            return;
        }
        if (!(fd70Var2 instanceof fd70.a)) {
            throw new NoWhenBranchMatchedException();
        }
        he70 he70Var = (he70) r4.getValue();
        fd70.a aVar = (fd70.a) fd70Var2;
        Long l = aVar.b;
        he70Var.getClass();
        if (l == null) {
            Preference.C("notification_prefs", "notification_current_source");
        } else {
            Preference.F(l.longValue(), "notification_prefs", "notification_current_source");
        }
        he70 he70Var2 = (he70) r4.getValue();
        String str = l != null ? aVar.c : null;
        he70Var2.getClass();
        if (str == null) {
            Preference.C("notification_prefs", "notification_current_source_title");
        } else {
            Preference.H("notification_prefs", "notification_current_source_title", str);
        }
        T(new nd70.e(l));
        f4zVar.b(wd70.a.a);
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        zvj.c(this.i, null);
    }
}
