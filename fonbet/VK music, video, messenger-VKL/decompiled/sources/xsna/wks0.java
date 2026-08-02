package xsna;

import androidx.fragment.app.FragmentManager;
import com.vk.voip.VoipCallActivity;
import com.vk.voip.call_effects.CallEffectsDependency;
import com.vk.voip.ui.ns.NoiseSuppressorFeature$State;
import java.util.ArrayList;
import java.util.List;
import xsna.dw20;
import xsna.yks0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class wks0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wks0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((yks0.c) obj2).invoke(obj);
                return;
            case 1:
                ((lyl0) obj2).invoke(obj);
                return;
            case 2:
                ((h2h0) obj2).invoke(obj);
                return;
            default:
                VoipCallActivity voipCallActivity = (VoipCallActivity) obj2;
                if (obj instanceof fjw0) {
                    kvp kvpVar = voipCallActivity.L;
                    if (kvpVar != null && kvpVar.b != null) {
                        com.vk.voip.ui.c.b.getClass();
                        if (!com.vk.voip.ui.c.v0()) {
                            zew0 zew0Var = kvpVar.b;
                            if (zew0Var != null) {
                                zew0Var.j1 = new fc(11);
                            }
                            if (zew0Var != null) {
                                zew0Var.tn();
                            }
                            kvpVar.b = null;
                        }
                    }
                    com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                    cVar.getClass();
                    com.vk.voip.call_effects.a aVar = (com.vk.voip.call_effects.a) com.vk.voip.ui.c.Q();
                    cVar.getClass();
                    boolean h = com.vk.voip.ui.c.K0.h();
                    boolean z = aVar.e == null;
                    boolean z2 = aVar.f.P0() == CallEffectsDependency.DynamicLibsState.NOT_LOADED;
                    if (h && z && z2) {
                        aVar.d(voipCallActivity);
                        return;
                    }
                    return;
                }
                int i2 = VoipCallActivity.P;
                if (!(obj instanceof f2x0)) {
                    if (obj instanceof shj0) {
                        FragmentManager supportFragmentManager = voipCallActivity.getSupportFragmentManager();
                        supportFragmentManager.l0("unlock_key", voipCallActivity, new uxb0((shj0) obj, 17));
                        ((shj0) obj).a.Td(supportFragmentManager, "");
                        return;
                    }
                    return;
                }
                voipCallActivity.getClass();
                com.vk.voip.ui.c.b.getClass();
                k570 k570Var = (k570) com.vk.voip.ui.c.x0.getValue();
                k570Var.getClass();
                dhr0.a.getClass();
                lpj lpjVar = new lpj(voipCallActivity, dhr0.u().c);
                dw20 dw20Var = k570Var.f;
                if (dw20Var != null) {
                    dw20Var.tn();
                }
                k570Var.f = null;
                dw20.b u0 = new dw20.b(lpjVar, tzp0.a(null, 3)).u0(dhr0.u().c);
                List<NoiseSuppressorFeature$State> b = k570Var.b();
                ArrayList arrayList = new ArrayList(c5g.u(b, 10));
                int i3 = 0;
                for (Object obj3 : b) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        e43.t();
                        throw null;
                    }
                    NoiseSuppressorFeature$State noiseSuppressorFeature$State = (NoiseSuppressorFeature$State) obj3;
                    arrayList.add(new brj0(i3, 0, null, noiseSuppressorFeature$State.h(), null, noiseSuppressorFeature$State == k570Var.c(), false, null, 0, null, null, null, null, null, 130996));
                    i3 = i4;
                }
                dw20 I0 = ((dw20.b) u0.P(arrayList, new dn20(k570Var, 9))).I0("noise_suppressor");
                k570Var.f = I0;
                voipCallActivity.p.b(new io.reactivex.rxjava3.disposables.f(new xq3(I0, 10)));
                return;
        }
    }
}
