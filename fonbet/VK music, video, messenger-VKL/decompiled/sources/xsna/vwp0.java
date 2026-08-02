package xsna;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity;
import com.google.android.gms.internal.cast.zzpm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import xsna.lvf0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class vwp0 implements lvf0.b, iui0<g0a> {
    public static final o100 i = new o100("UIMediaController", null);
    public final ExpandedControllerActivity b;

    @Nullable
    public final hui0 c;
    public final HashMap d = new HashMap();
    public final HashSet e = new HashSet();
    public final utz0 f = new utz0();

    @Nullable
    public lvf0.b g;

    @Nullable
    public lvf0 h;

    public vwp0(@NonNull ExpandedControllerActivity expandedControllerActivity) {
        this.b = expandedControllerActivity;
        uz9 g = uz9.g(expandedControllerActivity);
        com.google.android.gms.internal.cast.zzr.zzb(zzpm.UI_MEDIA_CONTROLLER);
        hui0 d = g != null ? g.d() : null;
        this.c = d;
        if (d != null) {
            d.a(this);
            h(d.c());
        }
    }

    @Override // xsna.lvf0.b
    public final void a() {
        k();
        lvf0.b bVar = this.g;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // xsna.lvf0.b
    public final void b() {
        k();
        lvf0.b bVar = this.g;
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // xsna.lvf0.b
    public final void c() {
        k();
        lvf0.b bVar = this.g;
        if (bVar != null) {
            bVar.c();
        }
    }

    @Override // xsna.lvf0.b
    public final void d() {
        k();
        lvf0.b bVar = this.g;
        if (bVar != null) {
            bVar.d();
        }
    }

    @Override // xsna.lvf0.b
    public final void e() {
        k();
        lvf0.b bVar = this.g;
        if (bVar != null) {
            bVar.e();
        }
    }

    @Override // xsna.lvf0.b
    public final void f() {
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((twp0) it2.next()).onSendingRemoteMediaRequest();
            }
        }
        lvf0.b bVar = this.g;
        if (bVar != null) {
            bVar.f();
        }
    }

    @Nullable
    public final lvf0 g() {
        exc0.e("Must be called from the main thread.");
        return this.h;
    }

    public final void h(@Nullable ssi0 ssi0Var) {
        exc0.e("Must be called from the main thread.");
        if (this.h == null && ssi0Var != null && ssi0Var.c()) {
            g0a g0aVar = (g0a) ssi0Var;
            lvf0 k = g0aVar.k();
            this.h = k;
            if (k != null) {
                exc0.e("Must be called from the main thread.");
                k.h.add(this);
                utz0 utz0Var = this.f;
                exc0.i(utz0Var);
                utz0Var.a = g0aVar.k();
                Iterator it = this.d.values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        ((twp0) it2.next()).onSessionConnected(g0aVar);
                    }
                }
                k();
            }
        }
    }

    public final void i() {
        exc0.e("Must be called from the main thread.");
        if (this.h != null) {
            this.f.a = null;
            Iterator it = this.d.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) it.next()).iterator();
                while (it2.hasNext()) {
                    ((twp0) it2.next()).onSessionEnded();
                }
            }
            exc0.i(this.h);
            lvf0 lvf0Var = this.h;
            lvf0Var.getClass();
            exc0.e("Must be called from the main thread.");
            lvf0Var.h.remove(this);
            this.h = null;
        }
    }

    public final void j(View view, twp0 twp0Var) {
        hui0 hui0Var = this.c;
        if (hui0Var == null) {
            return;
        }
        HashMap hashMap = this.d;
        List list = (List) hashMap.get(view);
        if (list == null) {
            list = new ArrayList();
            hashMap.put(view, list);
        }
        list.add(twp0Var);
        exc0.e("Must be called from the main thread.");
        if (this.h != null) {
            g0a c = hui0Var.c();
            exc0.i(c);
            twp0Var.onSessionConnected(c);
            k();
        }
    }

    public final void k() {
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((twp0) it2.next()).onMediaStatusUpdated();
            }
        }
    }

    @Override // xsna.iui0
    public final void onSessionEnded(@NonNull g0a g0aVar, int i2) {
        i();
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionEnding(@NonNull g0a g0aVar) {
    }

    @Override // xsna.iui0
    public final void onSessionResumeFailed(@NonNull g0a g0aVar, int i2) {
        i();
    }

    @Override // xsna.iui0
    public final void onSessionResumed(@NonNull g0a g0aVar, boolean z) {
        h(g0aVar);
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionResuming(@NonNull g0a g0aVar, @NonNull String str) {
    }

    @Override // xsna.iui0
    public final void onSessionStartFailed(@NonNull g0a g0aVar, int i2) {
        i();
    }

    @Override // xsna.iui0
    public final void onSessionStarted(@NonNull g0a g0aVar, @NonNull String str) {
        h(g0aVar);
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionStarting(@NonNull g0a g0aVar) {
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionSuspended(@NonNull g0a g0aVar, int i2) {
    }
}
