package xsna;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.NonNull;
import xsna.mwj0;
import xsna.y7g0;

/* compiled from: DefaultConnectivityMonitor.java */
/* loaded from: classes12.dex */
public final class xcl implements q4j {
    public final Context b;
    public final y7g0.b c;

    public xcl(@NonNull Context context, @NonNull y7g0.b bVar) {
        this.b = context.getApplicationContext();
        this.c = bVar;
    }

    @Override // xsna.c5z
    public final void onStart() {
        mwj0 a = mwj0.a(this.b);
        y7g0.b bVar = this.c;
        synchronized (a) {
            a.b.add(bVar);
            if (!a.c && !a.b.isEmpty()) {
                mwj0.c cVar = a.a;
                c1u c1uVar = cVar.c;
                boolean z = false;
                cVar.a = ((ConnectivityManager) c1uVar.get()).getActiveNetwork() != null;
                try {
                    ((ConnectivityManager) c1uVar.get()).registerDefaultNetworkCallback(cVar.d);
                    z = true;
                } catch (RuntimeException unused) {
                }
                a.c = z;
            }
        }
    }

    @Override // xsna.c5z
    public final void onStop() {
        mwj0 a = mwj0.a(this.b);
        y7g0.b bVar = this.c;
        synchronized (a) {
            a.b.remove(bVar);
            if (a.c && a.b.isEmpty()) {
                mwj0.c cVar = a.a;
                ((ConnectivityManager) cVar.c.get()).unregisterNetworkCallback(cVar.d);
                a.c = false;
            }
        }
    }

    @Override // xsna.c5z
    public final void onDestroy() {
    }
}
