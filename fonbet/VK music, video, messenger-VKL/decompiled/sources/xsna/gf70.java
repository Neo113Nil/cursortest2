package xsna;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.cf70;

/* compiled from: NotificationSettingReducer.kt */
/* loaded from: classes5.dex */
public final class gf70 extends dm50<nf70, cf70, jf70> {
    @Override // xsna.dm50
    public final jf70 c(jf70 jf70Var, cf70 cf70Var) {
        jf70 jf70Var2 = jf70Var;
        cf70 cf70Var2 = cf70Var;
        NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto = jf70Var2.e;
        if (cf70Var2 instanceof cf70.d) {
            cf70.d dVar = (cf70.d) cf70Var2;
            return jf70.a(jf70Var2, false, false, dVar.b, dVar.d, dVar.c, null, false, null, null, 2003);
        }
        if (cf70Var2 instanceof cf70.f) {
            return jf70.a(jf70Var2, false, false, null, ((cf70.f) cf70Var2).b, null, null, false, null, null, 2039);
        }
        if (cf70Var2.equals(cf70.k.b)) {
            return jf70.a(jf70Var2, notificationsNotificationSettingRedesignDto == null, false, null, null, null, null, false, null, null, 2044);
        }
        if (cf70Var2 instanceof cf70.g) {
            return jf70.a(jf70Var2, false, false, null, ((cf70.g) cf70Var2).b, null, null, false, null, null, 2039);
        }
        if (cf70Var2 instanceof cf70.n) {
            return jf70.a(jf70Var2, false, false, null, ((cf70.n) cf70Var2).b, null, null, false, null, null, 2039);
        }
        if (cf70Var2 instanceof cf70.o) {
            return jf70.a(jf70Var2, false, false, null, ((cf70.o) cf70Var2).b, null, null, false, null, null, 2039);
        }
        if (cf70Var2 instanceof cf70.a) {
            cf70.a aVar = (cf70.a) cf70Var2;
            NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto2 = aVar.b;
            return jf70.a(jf70Var2, false, false, null, notificationsNotificationSettingRedesignDto2, notificationsNotificationSettingRedesignDto2.getTitle(), aVar.c, false, null, null, 1924);
        }
        if (cf70Var2.equals(cf70.b.b)) {
            return jf70.a(jf70Var2, false, notificationsNotificationSettingRedesignDto == null, null, null, null, null, false, null, null, 2044);
        }
        ArrayList arrayList = null;
        if (cf70Var2 instanceof cf70.e) {
            List<UserProfile> list = jf70Var2.i;
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!epx.f(((UserProfile) obj).c, ((cf70.e) cf70Var2).b)) {
                        arrayList.add(obj);
                    }
                }
            }
            return jf70.a(jf70Var2, false, false, null, null, null, null, false, arrayList, null, 1535);
        }
        if (cf70Var2 instanceof cf70.h) {
            return jf70.a(jf70Var2, false, false, null, null, null, null, false, ((cf70.h) cf70Var2).b, null, 1279);
        }
        if (cf70Var2.equals(cf70.i.b)) {
            return jf70.a(jf70Var2, false, false, null, null, null, null, true, null, null, 1791);
        }
        if (!(cf70Var2 instanceof cf70.m)) {
            if (cf70Var2 instanceof cf70.l) {
                return jf70.a(jf70Var2, false, false, null, null, null, null, false, null, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
            }
            if (cf70Var2 instanceof cf70.c) {
                return jf70.a(jf70Var2, false, false, null, null, null, null, false, null, ((cf70.c) cf70Var2).b, 767);
            }
            if (cf70Var2.equals(cf70.j.b)) {
                return jf70.a(jf70Var2, false, false, null, null, null, null, false, null, null, 1791);
            }
            throw new NoWhenBranchMatchedException();
        }
        List<Group> list2 = jf70Var2.j;
        if (list2 != null) {
            List<Group> list3 = list2;
            arrayList = new ArrayList(c5g.u(list3, 10));
            for (Group group : list3) {
                cf70.m mVar = (cf70.m) cf70Var2;
                if (epx.f(group.c, mVar.b)) {
                    group.I = mVar.c;
                }
                arrayList.add(group);
            }
        }
        return jf70.a(jf70Var2, false, false, null, null, null, null, false, null, arrayList, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
    }

    @Override // xsna.dm50
    public final nf70 d() {
        return new nf70(e(new qw30(this, 9)));
    }

    @Override // xsna.dm50
    public final void h(jf70 jf70Var, nf70 nf70Var) {
        f(nf70Var.a, jf70Var);
    }
}
