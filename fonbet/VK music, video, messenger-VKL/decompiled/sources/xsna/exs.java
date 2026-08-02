package xsna;

import android.app.Activity;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.superapp.advertisement.requestsanalytics.AdRequestPurpose;
import kotlin.NoWhenBranchMatchedException;
import xsna.dxs;
import xsna.fxs;
import xsna.gi0;
import xsna.j11;
import xsna.y31;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class exs implements izs {
    public final /* synthetic */ fxs b;
    public final /* synthetic */ AdRequestPurpose c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ y31.a e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ WebAdConfig g;

    public /* synthetic */ exs(fxs fxsVar, AdRequestPurpose adRequestPurpose, Activity activity, y31.a aVar, boolean z, WebAdConfig webAdConfig) {
        this.b = fxsVar;
        this.c = adRequestPurpose;
        this.d = activity;
        this.e = aVar;
        this.f = z;
        this.g = webAdConfig;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        fxs fxsVar = this.b;
        y31.b bVar = fxsVar.e;
        gi0 gi0Var = (gi0) obj;
        boolean z = gi0Var instanceof gi0.a;
        y31.a aVar = this.e;
        boolean z2 = this.f;
        if (z) {
            gi0.a aVar2 = (gi0.a) gi0Var;
            dxs.a a = fxsVar.s().a(aVar2.c);
            long i = fxsVar.g.i();
            if (a == null || !(a.g || a.a(i))) {
                fxsVar.v(new uh0(this.c), this.d, aVar, aVar2, new fxs.a(false, z2), this.g);
            } else if (z2 && a.g) {
                a.e = true;
            } else if (z2 && a.a(i)) {
                bVar.d(aVar2.c, z2, null);
            }
        } else {
            if (!epx.f(gi0Var, gi0.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z2) {
                bVar.f(aVar.d, z2, new j11.a(2004, "No slots available", "Hasn't banners error"), null);
            }
        }
        return s3q0.a;
    }
}
