package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: FragmentLifecycle.kt */
/* loaded from: classes3.dex */
public final class mbs implements obs {
    public final HashSet<obs> b = new HashSet<>();

    public final void a(obs obsVar) {
        this.b.add(obsVar);
    }

    @Override // xsna.obs
    public final void b() {
        Iterator it = j5g.O0(this.b).iterator();
        while (it.hasNext()) {
            ((obs) it.next()).b();
        }
    }

    @Override // xsna.obs
    public final void c() {
        HashSet<obs> hashSet = this.b;
        Iterator it = j5g.O0(hashSet).iterator();
        while (it.hasNext()) {
            ((obs) it.next()).c();
        }
        hashSet.clear();
    }

    public final void d(obs obsVar) {
        this.b.remove(obsVar);
    }

    @Override // xsna.obs
    public final void onActivityResult(int i, int i2, Intent intent) {
        Iterator it = j5g.O0(this.b).iterator();
        while (it.hasNext()) {
            ((obs) it.next()).onActivityResult(i, i2, intent);
        }
    }

    @Override // xsna.obs
    public final void onConfigurationChanged(Configuration configuration) {
        Iterator it = j5g.O0(this.b).iterator();
        while (it.hasNext()) {
            ((obs) it.next()).onConfigurationChanged(configuration);
        }
    }

    @Override // xsna.obs
    public final void onCreate(Bundle bundle) {
        Iterator it = j5g.O0(this.b).iterator();
        while (it.hasNext()) {
            ((obs) it.next()).onCreate(bundle);
        }
    }

    @Override // xsna.obs
    public final void onDestroy() {
        Iterator it = j5g.O0(this.b).iterator();
        while (it.hasNext()) {
            ((obs) it.next()).onDestroy();
        }
    }

    @Override // xsna.obs
    public final void onDestroyView() {
        Iterator it = j5g.O0(this.b).iterator();
        while (it.hasNext()) {
            ((obs) it.next()).onDestroyView();
        }
    }

    @Override // xsna.obs
    public final void onPause() {
        Iterator it = j5g.O0(this.b).iterator();
        while (it.hasNext()) {
            ((obs) it.next()).onPause();
        }
    }

    @Override // xsna.obs
    public final void onResume() {
        Iterator it = j5g.O0(this.b).iterator();
        while (it.hasNext()) {
            ((obs) it.next()).onResume();
        }
    }

    @Override // xsna.obs
    public final void onStop() {
        Iterator it = j5g.O0(this.b).iterator();
        while (it.hasNext()) {
            ((obs) it.next()).onStop();
        }
    }
}
