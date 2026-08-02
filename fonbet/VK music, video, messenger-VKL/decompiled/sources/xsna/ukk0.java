package xsna;

import android.app.Activity;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import java.util.List;
import xsna.gi0;

/* compiled from: SplashAdShowRequest.kt */
/* loaded from: classes6.dex */
public final class ukk0 {
    public static final AdvertisementType g = AdvertisementType.INTERSTITIAL;
    public final tkk0 a;
    public final zws b;
    public final df0 c;
    public final a d;
    public final j1y e;
    public boolean f;

    /* compiled from: SplashAdShowRequest.kt */
    public static final class a {
        public final r31 a;
        public final vh0 b;

        public a(r31 r31Var, vh0 vh0Var) {
            this.a = r31Var;
            this.b = vh0Var;
        }
    }

    public ukk0(tkk0 tkk0Var, zws zwsVar, df0 df0Var, a aVar, j1y j1yVar) {
        this.a = tkk0Var;
        this.b = zwsVar;
        this.c = df0Var;
        this.d = aVar;
        this.e = j1yVar;
    }

    public final void a(uh0 uh0Var, Activity activity, long j, List<gi0.a> list, j11 j11Var) {
        gi0.a aVar = (gi0.a) j5g.a0(list);
        tkk0 tkk0Var = this.a;
        if (aVar == null) {
            tkk0Var.f(g, false, j11Var, (String) uh0Var.b);
            this.e.invoke();
            return;
        }
        cxs a2 = this.b.a(activity, jn00.a(aVar), this.c);
        if (a2 == null) {
            x19.O(xgx0.a, "Incorrect fullscreen ad slot");
            tkk0Var.a(aVar.c, aVar.a, false, true, (String) uh0Var.b);
        } else {
            a2.c(new vkk0(this, uh0Var, aVar, activity, aVar.c, j, list));
            a2.load();
        }
    }
}
