package xsna;

import androidx.fragment.app.FragmentActivity;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.g;
import com.vkontakte.android.api.ExtendedUserProfile;
import one.video.player.error.OneVideoPlaybackException;
import xsna.yft0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class wop0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wop0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                xop0 xop0Var = (xop0) this.c;
                NetworkRequestMetric networkRequestMetric = (NetworkRequestMetric) this.d;
                ApplicationProcessState applicationProcessState = (ApplicationProcessState) this.e;
                xop0Var.getClass();
                g.b n = com.google.firebase.perf.v1.g.n();
                n.d(networkRequestMetric);
                xop0Var.f(n, applicationProcessState);
                break;
            case 1:
                rhq0 rhq0Var = (rhq0) this.c;
                rhq0Var.e.c().h((FragmentActivity) this.d, ((ExtendedUserProfile) this.e).a.c);
                break;
            default:
                ((yft0) this.c).b.a(new yft0.b((OneVideoPlaybackException) this.d, (sht0) this.e, null));
                break;
        }
    }
}
