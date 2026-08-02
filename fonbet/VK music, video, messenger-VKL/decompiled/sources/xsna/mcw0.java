package xsna;

import com.vk.voip.call_effects.CallEffectsDependency;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;

/* compiled from: VoipActionsFeature.kt */
/* loaded from: classes7.dex */
public abstract class mcw0<S extends VoipActionsFeatureState> extends com.vk.voip.ui.actions.feature.b implements pdw0 {
    public final io.reactivex.rxjava3.disposables.b g;
    public final odw0 h;

    public mcw0(gzs gzsVar, l570 l570Var, CallEffectsDependency callEffectsDependency, gj9 gj9Var, wot wotVar, rd9 rd9Var, com.vk.voip.ui.actions.feature.c cVar) {
        super(gzsVar, l570Var, callEffectsDependency, gj9Var, wotVar, rd9Var, cVar);
        this.g = new io.reactivex.rxjava3.disposables.b();
        this.h = new odw0();
    }

    @Override // xsna.pdw0
    public final io.reactivex.rxjava3.core.q<? extends mdw0> a() {
        return this.h.a;
    }

    public abstract io.reactivex.rxjava3.core.q<S> k();
}
