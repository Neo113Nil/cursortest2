package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.concurrent.Executor;
import xsna.ub9;
import xsna.yu6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class wu6 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wu6(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                yu6.a aVar = (yu6.a) this.c;
                v7i v7iVar = (v7i) this.d;
                v7i v7iVar2 = (v7i) this.e;
                aVar.l = false;
                v7i shutdown = aVar.c.shutdown();
                shutdown.f(new xu6(v7iVar, shutdown, v7iVar2, 0));
                break;
            case 1:
                ((ry6) this.c).accept((String) this.d, (com.google.firebase.remoteconfig.internal.a) this.e);
                break;
            case 2:
                ((Executor) this.c).execute(new li0(3, (sez) this.d, (ub9.a) this.e));
                break;
            default:
                rhq0 rhq0Var = (rhq0) this.c;
                FragmentActivity fragmentActivity = (FragmentActivity) this.d;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) this.e;
                rhq0Var.e.c().a(fragmentActivity, extendedUserProfile.a, extendedUserProfile.b);
                break;
        }
    }
}
