package xsna;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import xsna.v1h0;

/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: classes.dex */
public final class r1h0 implements v1h0.b {
    public final v1h0 a;
    public boolean b;
    public Bundle c;
    public final bpn0 d;

    public r1h0(v1h0 v1h0Var, xyt0 xyt0Var) {
        this.a = v1h0Var;
        this.d = new bpn0(new rx2(xyt0Var, 6));
    }

    public final void a() {
        if (this.b) {
            return;
        }
        Bundle a = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle b = yfb.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            b.putAll(bundle);
        }
        if (a != null) {
            b.putAll(a);
        }
        this.c = b;
        this.b = true;
    }

    @Override // xsna.v1h0.b
    public final Bundle r() {
        Bundle b = yfb.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            b.putAll(bundle);
        }
        for (Map.Entry entry : ((s1h0) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle r = ((androidx.lifecycle.w) entry.getValue()).b().r();
            if (!r.isEmpty()) {
                b.putBundle(str, r);
            }
        }
        this.b = false;
        return b;
    }
}
