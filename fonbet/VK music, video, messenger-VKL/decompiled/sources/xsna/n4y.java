package xsna;

import com.vk.superapp.vksteps.VkStepsBridgeDelegatesFactory;
import com.vk.superapp.vkworkout.VkWorkoutBridgeDelegatesFactory;

/* compiled from: JsHealthDelegateFactoryImpl.kt */
/* loaded from: classes6.dex */
public final class n4y implements com.vk.superapp.health.js.bridge.api.di.b {
    public final ayu0 a;
    public final VkWorkoutBridgeDelegatesFactory b;
    public final VkStepsBridgeDelegatesFactory c;

    public n4y(ayu0 ayu0Var, VkWorkoutBridgeDelegatesFactory vkWorkoutBridgeDelegatesFactory, VkStepsBridgeDelegatesFactory vkStepsBridgeDelegatesFactory) {
        this.a = ayu0Var;
        this.b = vkWorkoutBridgeDelegatesFactory;
        this.c = vkStepsBridgeDelegatesFactory;
    }

    @Override // com.vk.superapp.health.js.bridge.api.di.b
    public final m4y a(com.vk.superapp.base.js.bridge.b bVar, fvv0 fvv0Var, bfm bfmVar) {
        return new l4y(this.a, this.c, this.b, bVar, fvv0Var, bfmVar);
    }
}
