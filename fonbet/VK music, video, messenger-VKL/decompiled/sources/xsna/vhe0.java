package xsna;

import android.content.Context;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import org.chromium.net.NetError;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class vhe0 implements gzs {
    public final /* synthetic */ whe0 b;
    public final /* synthetic */ androidx.work.d c;
    public final /* synthetic */ akq d;

    public /* synthetic */ vhe0(whe0 whe0Var, androidx.work.d dVar, akq akqVar) {
        this.b = whe0Var;
        this.c = dVar;
        this.d = akqVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        whe0 whe0Var = this.b;
        androidx.work.d dVar = this.c;
        akq akqVar = this.d;
        ((awx0) whe0Var.d.getValue()).g(dVar.a).f(whe0Var.e);
        rll rllVar = whe0Var.b;
        l5m l5mVar = new l5m(null, null, 3);
        boolean z = pmr0.a;
        Context context = (Context) rllVar.b;
        boolean a = pmr0.a(context);
        boolean b = pmr0.b(context);
        int g = a201.a().g();
        xuo0.a.getClass();
        l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.PUSH_FALLBACK_ENGINE.h(), null, String.valueOf(xuo0.a()), null, String.valueOf(g), null, String.valueOf(a), null, String.valueOf(b), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, akqVar.a, null, NetError.ERR_UNEXPECTED_SECURITY_LIBRARY_STATUS, 2, null);
        l5mVar.q();
        return s3q0.a;
    }
}
