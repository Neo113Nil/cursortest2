package xsna;

import android.app.Application;
import android.os.Bundle;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.dto.user.UserSex;
import com.vk.metrics.eventtracking.VkMainTracker;
import com.vkontakte.android.VKApplication;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class y9i implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y9i(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z;
        switch (this.b) {
            case 0:
                mwy mwyVar = (mwy) this.c;
                f9e0 f9e0Var = (f9e0) this.d;
                synchronized (mwyVar) {
                    try {
                        if (mwyVar.b == null) {
                            mwyVar.a.add(f9e0Var);
                        } else {
                            mwyVar.b.add(f9e0Var.get());
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                ((sto0) this.c).b.b((tqk0) this.d, 3);
                return;
            default:
                Application application = (Application) this.c;
                VKApplication vKApplication = (VKApplication) this.d;
                VKApplication.a aVar = VKApplication.c;
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                synchronized (bVar) {
                    i = 0;
                    z = com.vk.metrics.eventtracking.b.c != null;
                }
                if (!z || bVar.p()) {
                    VkMainTracker vkMainTracker = new VkMainTracker();
                    synchronized (bVar) {
                        try {
                            VkMainTracker vkMainTracker2 = com.vk.metrics.eventtracking.b.c;
                            if (vkMainTracker2 != null) {
                                vkMainTracker2.h(null);
                            }
                            com.vk.metrics.eventtracking.b.c = vkMainTracker;
                        } finally {
                        }
                    }
                }
                bVar.getClass();
                VkMainTracker vkMainTracker3 = com.vk.metrics.eventtracking.b.c;
                if (vkMainTracker3 != null ? vkMainTracker3.r() : false) {
                    return;
                }
                cn o = o25.a().o();
                boolean b = txz.b();
                List<String> list = m6x.a;
                boolean z2 = q6r0.f().e(m6r0.v) && Preference.j().getBoolean("trackInstalledApps", true);
                rhp0 rhp0Var = new rhp0();
                rhp0Var.a.putBoolean("APPS_TRACKING_ENABLED", z2);
                rhp0Var.a.putBoolean("LOCATION_TRACKING_ENABLED", b);
                rhp0Var.a.putLong(CommonConstant.RETKEY.USERID, o.a.b);
                rhp0Var.a.putString("USER_NAME", "" + o.b);
                rhp0Var.a.putString("STORE_NAME", dy2.h(application, null));
                rhp0Var.a.putString("APP_VERSION", BuildInfo.a());
                UserSex userSex = o.d;
                userSex.getClass();
                int i2 = UserSex.b.$EnumSwitchMapping$0[userSex.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        i = 2;
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = 1;
                    }
                }
                rhp0Var.a.putInt(CommonConstant.RETKEY.GENDER, i);
                rhp0Var.a.putBoolean("IS_DEBUG", BuildInfo.h());
                rhp0Var.a.putString("MY_TRACKER_ID", VKApplication.e);
                Bundle bundle = rhp0Var.a;
                uc00.f = new je5(vKApplication, 2);
                bVar.b(uc00.a);
                bVar.b(i200.a);
                bVar.b(uyk0.a);
                bVar.b(oa3.a);
                Iterator it = Collections.singletonList(new vkr(new g4k(new dw9(vKApplication), new bpn0(new ib3(13))))).iterator();
                while (it.hasNext()) {
                    com.vk.metrics.eventtracking.b.a.b((ohp0) it.next());
                }
                com.vk.metrics.eventtracking.b.a.c(application, bundle, new y56(9));
                return;
        }
    }
}
