package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import com.bumptech.glide.manager.c;
import java.util.HashSet;

/* loaded from: classes10.dex */
public final class d9h implements a6e {
    public final Context a;
    public final l7j0 b;

    public d9h(Context context, l7j0 l7j0Var) {
        this.a = context.getApplicationContext();
        this.b = l7j0Var;
    }

    @Override // defpackage.hey
    public final void onDestroy() {
    }

    @Override // defpackage.hey
    public final void onStart() {
        tis0 K = tis0.K(this.a);
        l7j0 l7j0Var = this.b;
        synchronized (K) {
            ((HashSet) K.w).add(l7j0Var);
            K.V();
        }
    }

    @Override // defpackage.hey
    public final void onStop() {
        tis0 K = tis0.K(this.a);
        l7j0 l7j0Var = this.b;
        synchronized (K) {
            ((HashSet) K.w).remove(l7j0Var);
            if (K.b && ((HashSet) K.w).isEmpty()) {
                c cVar = (c) K.c;
                ((ConnectivityManager) cVar.c.get()).unregisterNetworkCallback(cVar.d);
                K.b = false;
            }
        }
    }
}
