package xsna;

import com.vk.voip.call_effects.CallEffectsDependency;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ocw0 implements a0t {
    @Override // xsna.a0t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        CallEffectsDependency.DynamicLibsState dynamicLibsState = (CallEffectsDependency.DynamicLibsState) obj;
        Boolean bool = (Boolean) obj2;
        w5w0 w5w0Var = (w5w0) obj4;
        boolean z = false;
        boolean z2 = (!((Boolean) obj3).booleanValue() || dynamicLibsState.h() || ((Boolean) obj5).booleanValue()) ? false : true;
        boolean z3 = !epx.f(w5w0Var, va9.r) && dynamicLibsState.i();
        if (bool.booleanValue() && dynamicLibsState.i()) {
            z = true;
        }
        return new VoipActionsFeatureState.x(z2, z3, z, w5w0Var);
    }
}
