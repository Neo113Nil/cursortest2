package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.a;

/* loaded from: classes.dex */
public final class c2m0 implements f2m0 {
    public final g2m0 a;
    public boolean b;
    public Bundle c;
    public final i3y d;

    public c2m0(g2m0 g2m0Var, rs31 rs31Var) {
        this.a = g2m0Var;
        this.d = a.a(new csf0(19, rs31Var));
    }

    @Override // defpackage.f2m0
    public final Bundle a() {
        Bundle g = wwg.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            g.putAll(bundle);
        }
        for (Map.Entry entry : ((d2m0) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a = ((v1m0) entry.getValue()).b.b().a();
            if (!a.isEmpty()) {
                g.putBundle(str, a);
            }
        }
        this.b = false;
        return g;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle a = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle g = wwg.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            g.putAll(bundle);
        }
        if (a != null) {
            g.putAll(a);
        }
        this.c = g;
        this.b = true;
    }
}
