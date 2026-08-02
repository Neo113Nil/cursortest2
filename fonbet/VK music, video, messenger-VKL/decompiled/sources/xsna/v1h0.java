package xsna;

import android.os.Bundle;
import androidx.lifecycle.g;
import java.util.Iterator;
import java.util.Map;
import xsna.xhf0;

/* compiled from: SavedStateRegistry.android.kt */
/* loaded from: classes.dex */
public final class v1h0 {
    public final y1h0 a;
    public xhf0.a b;

    /* compiled from: SavedStateRegistry.android.kt */
    /* loaded from: classes12.dex */
    public interface a {
        void a(z1h0 z1h0Var);
    }

    /* compiled from: SavedStateRegistry.android.kt */
    public interface b {
        Bundle r();
    }

    public v1h0(y1h0 y1h0Var) {
        this.a = y1h0Var;
    }

    public final Bundle a(String str) {
        Bundle bundle;
        y1h0 y1h0Var = this.a;
        if (!y1h0Var.g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle2 = y1h0Var.f;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(str)) {
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                sd9.m(str);
                throw null;
            }
        } else {
            bundle = null;
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            y1h0Var.f = null;
        }
        return bundle;
    }

    public final b b(String str) {
        b bVar;
        y1h0 y1h0Var = this.a;
        synchronized (y1h0Var.c) {
            Iterator it = y1h0Var.d.entrySet().iterator();
            do {
                bVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                b bVar2 = (b) entry.getValue();
                if (epx.f(str2, str)) {
                    bVar = bVar2;
                }
            } while (bVar == null);
        }
        return bVar;
    }

    public final void c(String str, b bVar) {
        y1h0 y1h0Var = this.a;
        synchronized (y1h0Var.c) {
            if (y1h0Var.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            y1h0Var.d.put(str, bVar);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void d() {
        if (!this.a.h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        xhf0.a aVar = this.b;
        if (aVar == null) {
            aVar = new xhf0.a(this);
        }
        this.b = aVar;
        try {
            g.a.class.getDeclaredConstructor(null);
            xhf0.a aVar2 = this.b;
            if (aVar2 != null) {
                aVar2.a(g.a.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + g.a.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
