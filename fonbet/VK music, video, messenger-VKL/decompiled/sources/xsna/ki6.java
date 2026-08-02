package xsna;

import com.vk.auth.main.AuthActivity;
import com.vk.core.apps.BuildInfo;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.pushes.NotificationUtils;
import xsna.a7b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ki6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ki6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ni6 ni6Var = (ni6) obj2;
                if (((Boolean) obj).booleanValue()) {
                    int i2 = AuthActivity.W;
                    NavigationDelegateActivity navigationDelegateActivity = ni6Var.b;
                    navigationDelegateActivity.startActivityForResult(AuthActivity.a.a(navigationDelegateActivity), 100);
                }
                return s3q0.a;
            case 1:
                a7b a7bVar = (a7b) obj2;
                long a = ((a7b.a) obj).a();
                if (!a7bVar.f.w(com.vk.dto.common.a.b(a7bVar.b.q()), "community_msg") && !a7bVar.e.a(a)) {
                    NotificationUtils.Type type = BuildInfo.s() ? NotificationUtils.Type.VkAppChannels : NotificationUtils.Type.CommunityChannelsMessages;
                    boolean b = lsn.b();
                    boolean c = NotificationUtils.c(a7bVar.a, type, a7bVar.g.c());
                    if (!b && c) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                return new io.reactivex.rxjava3.internal.operators.completable.m(new zge((dun0) obj2, 3));
        }
    }
}
