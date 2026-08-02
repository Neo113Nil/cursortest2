package defpackage;

import android.net.Uri;
import com.yandex.go.scooters.domain.ScootersMobilityHubNavigationLifecycleInteractor$onLaunch$$inlined$collectIn$1;
import kotlinx.coroutines.flow.e;

/* loaded from: classes13.dex */
public final class oyn0 implements cwn0 {
    public final tse a;
    public final y50 b;
    public final ra00 c;
    public final o3h d;
    public final hyn0 e;
    public final f0o0 f;
    public gyn0 g;

    public oyn0(tse tseVar, y50 y50Var, ra00 ra00Var, o3h o3hVar, hyn0 hyn0Var, f0o0 f0o0Var) {
        this.a = tseVar;
        this.b = y50Var;
        this.c = ra00Var;
        this.d = o3hVar;
        this.e = hyn0Var;
        this.f = f0o0Var;
    }

    @Override // defpackage.cwn0
    public final void b() {
        tje.N(this.a, null, null, new ScootersMobilityHubNavigationLifecycleInteractor$onLaunch$$inlined$collectIn$1(e.c(this.e.a), null, this), 3);
    }

    @Override // defpackage.cwn0
    public final void onDismiss() {
        gyn0 gyn0Var = this.g;
        this.g = null;
        if (gyn0Var instanceof fyn0) {
            this.c.a();
            return;
        }
        if (gyn0Var instanceof eyn0) {
            Uri.Builder builder = new Uri.Builder();
            ((pux0) this.d).getClass();
            ((a60) this.b).c(builder.scheme(pux0.c).authority("multimodal_route").appendQueryParameter("id", ((eyn0) gyn0Var).a).appendQueryParameter("route_type", "scooter_multimodal").build().toString(), v770.c);
            return;
        }
        if (gyn0Var instanceof dyn0) {
            this.f.a = ((dyn0) gyn0Var).a;
        } else {
            if (gyn0Var == null) {
                return;
            }
            w511.b();
        }
    }
}
