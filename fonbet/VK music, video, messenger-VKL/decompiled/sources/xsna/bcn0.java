package xsna;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import com.vk.superapp.ui.SuperAppFragment;
import xsna.sw50;

/* compiled from: SuperAppTabSwitcher.kt */
/* loaded from: classes6.dex */
public final class bcn0 implements sw50.q {
    @Override // xsna.sw50.q
    public final void a(Context context, Bundle bundle) {
        ComponentCallbacks2 h = e3m.h(context);
        ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
        ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
        if (Y != null) {
            Y.X(bundle);
        } else {
            new oz50(SuperAppFragment.class, null, bundle).k(context);
        }
    }
}
