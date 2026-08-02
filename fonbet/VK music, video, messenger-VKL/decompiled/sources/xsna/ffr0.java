package xsna;

import com.vk.superapp.js.bridge.events.AddToFavorites$Response;
import com.vk.superapp.js.bridge.events.EventNames;
import xsna.aex0;

/* compiled from: VKSocialViewDelegate.kt */
/* loaded from: classes6.dex */
public final class ffr0 implements aex0.b {
    public final /* synthetic */ kfr0 a;

    public ffr0(kfr0 kfr0Var) {
        this.a = kfr0Var;
    }

    @Override // xsna.aex0.b
    public final void a() {
        kfr0 kfr0Var = this.a;
        kfr0Var.e.t();
        kfr0Var.c.s(EventNames.AddToFavorites, new AddToFavorites$Response(null, new AddToFavorites$Response.Data(true, null, 2, null), 1, null));
    }
}
