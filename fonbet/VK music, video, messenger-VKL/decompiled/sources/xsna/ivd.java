package xsna;

import android.content.ComponentCallbacks2;
import android.content.Context;
import java.util.HashMap;

/* compiled from: ClipsEditSdkNavigationCallbackVk.kt */
/* loaded from: classes16.dex */
public final class ivd implements uw50 {
    public final nne a;
    public final HashMap<String, fcn> b = new HashMap<>();

    public ivd(nne nneVar) {
        this.a = nneVar;
    }

    @Override // xsna.uw50
    public final void a(Context context) {
        ww50<?> Y;
        HashMap<String, fcn> hashMap = this.b;
        fcn fcnVar = hashMap.get("edit_bs");
        if (fcnVar != null) {
            this.a.e();
            ComponentCallbacks2 h = e3m.h(context);
            ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
            if (ey50Var != null && (Y = ey50Var.Y()) != null) {
                Y.H(fcnVar);
            }
        }
        hashMap.remove("edit_bs");
    }

    @Override // xsna.uw50
    public final void b(Context context, com.vk.movika.sdk.base.model.e eVar) {
        ww50<?> Y;
        hvd hvdVar = new hvd(eVar);
        this.a.b();
        ComponentCallbacks2 h = e3m.h(context);
        ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
        if (ey50Var != null && (Y = ey50Var.Y()) != null) {
            Y.S(hvdVar);
        }
        this.b.put("edit_bs", hvdVar);
    }
}
