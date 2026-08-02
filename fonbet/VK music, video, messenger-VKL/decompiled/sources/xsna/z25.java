package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.debug.ui.DebugTabsFragment;

/* compiled from: AuthDebugRouterDecorator.kt */
/* loaded from: classes.dex */
public final class z25 {
    public final e370 a;
    public int b;

    public z25(e370 e370Var) {
        this.a = e370Var;
    }

    public final void a(Context context) {
        int i = this.b + 1;
        this.b = i;
        if (i >= 5) {
            this.a.getClass();
            Intent n = new oz50(DebugTabsFragment.class, null, null).n(context);
            n.addFlags(268435456);
            context.startActivity(n);
            this.b = 0;
        }
    }
}
