package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.libvideo.bottomsheet.notifications.SubscriptionAction;
import com.vk.video.profile.presentation.a;
import com.vk.video.profile.presentation.f;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.sym0;
import xsna.w6t0;
import xsna.wlg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class vlg implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vlg(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        List l;
        SubscriptionAction subscriptionAction;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                wlg wlgVar = (wlg) obj2;
                w6t0.d dVar = (w6t0.d) obj;
                FragmentActivity fragmentActivity = wlgVar.a;
                if (anj.a(fragmentActivity, "android.permission.POST_NOTIFICATIONS") == 0) {
                    int i2 = wlg.a.$EnumSwitchMapping$0[dVar.a.ordinal()];
                    if (i2 == 1) {
                        subscriptionAction = SubscriptionAction.FULLY_ENABLED_NOTIFICATIONS;
                    } else if (i2 == 2) {
                        subscriptionAction = SubscriptionAction.PREFERRED_VIDEOS_NOTIFICATIONS;
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        subscriptionAction = SubscriptionAction.DISABLED_NOTIFICATIONS;
                    }
                    l = e43.l(new sym0.a(subscriptionAction), new sym0.e(subscriptionAction), new sym0.d(subscriptionAction), sym0.f.g);
                } else {
                    l = e43.l(sym0.b.g, sym0.f.g);
                }
                ik70 ik70Var = new ik70(fragmentActivity, l, new u4e(wlgVar, 5), new yad(wlgVar, 11), 24);
                wlgVar.i = ik70Var;
                ik70Var.c();
                return;
            default:
                ud8 ud8Var = ((e8t0) obj2).e;
                ((a.c) obj).getClass();
                ud8Var.invoke(new f.c.a());
                return;
        }
    }
}
