package xsna;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vk.core.widget.LifecycleHandler;

/* compiled from: StoryViewActivityLauncher.kt */
/* loaded from: classes6.dex */
public final class v4z implements u90 {
    public final LifecycleHandler a;
    public final String b;

    public v4z(LifecycleHandler lifecycleHandler, String str) {
        this.a = lifecycleHandler;
        this.b = str;
    }

    @Override // xsna.u90
    public final Context B() {
        return this.a.getActivity();
    }

    @Override // xsna.u90
    public final void D(Intent intent, int i, Bundle bundle) {
        String str = this.b;
        LifecycleHandler lifecycleHandler = this.a;
        lifecycleHandler.g.put(i, str);
        lifecycleHandler.startActivityForResult(intent, i, bundle);
    }

    @Override // xsna.u90
    public final void E(Intent intent) {
        ww50<?> Y;
        LifecycleHandler lifecycleHandler = this.a;
        ComponentCallbacks2 activity = lifecycleHandler.getActivity();
        ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
        if (ey50Var == null || (Y = ey50Var.Y()) == null || !Y.r(intent)) {
            lifecycleHandler.getActivity().startActivity(intent, null);
        }
    }
}
