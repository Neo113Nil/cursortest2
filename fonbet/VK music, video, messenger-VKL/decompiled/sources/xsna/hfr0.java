package xsna;

import com.vk.superapp.js.bridge.events.AddToFavorites$Error;
import com.vk.superapp.js.bridge.events.EventNames;
import xsna.aex0;

/* compiled from: VKSocialViewDelegate.kt */
/* loaded from: classes6.dex */
public final class hfr0 implements aex0.c {
    public final /* synthetic */ kfr0 a;

    public hfr0(kfr0 kfr0Var) {
        this.a = kfr0Var;
    }

    @Override // xsna.aex0.c
    public final void onCancel() {
        mfu0 mfu0Var = this.a.c;
        EventNames eventNames = EventNames.AddToFavorites;
        mfu0Var.x(eventNames, new AddToFavorites$Error(null, uyp.b(eventNames, mfu0Var, null), 1, null));
    }
}
