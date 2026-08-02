package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.q850;
import xsna.u850;

/* compiled from: MusicStoriesPlayer.kt */
/* loaded from: classes3.dex */
public final class s850 extends e200 {
    public final /* synthetic */ q850 a;

    public s850(q850 q850Var) {
        this.a = q850Var;
    }

    @Override // xsna.gv10.a
    public final void a(gv10 gv10Var, int i) {
        q850 q850Var = this.a;
        io.reactivex.rxjava3.subjects.f<u850> fVar = q850Var.e;
        c6q c6qVar = q850Var.d;
        fza0 fza0Var = q850Var.j;
        if (fza0Var != null) {
            fza0Var.a(i - (q850Var.f != null ? Integer.valueOf(r6.b) : null).intValue());
        }
        q850.a aVar = q850Var.f;
        if (aVar == null) {
            return;
        }
        int i2 = aVar.c;
        if (i2 > 0) {
            if ((c6qVar.g ? ((androidx.media3.exoplayer.l) c6qVar.r.b()).getCurrentPosition() : 0L) > i2) {
                if (aVar.d) {
                    c6qVar.f(aVar.b);
                    u850.c cVar = u850.c.a;
                    q850Var.i = cVar;
                    fVar.onNext(cVar);
                } else if (q850Var.k) {
                    c6qVar.g(false);
                } else {
                    c6qVar.f(0);
                    q850Var.stop(26);
                }
                q850Var.g = 0;
            }
        }
        if (c6qVar.b() && c6qVar.b()) {
            u850.g gVar = new u850.g(gv10Var.getDuration() == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : i / gv10Var.getDuration());
            q850Var.i = gVar;
            fVar.onNext(gVar);
        }
        q850Var.g = 0;
    }
}
