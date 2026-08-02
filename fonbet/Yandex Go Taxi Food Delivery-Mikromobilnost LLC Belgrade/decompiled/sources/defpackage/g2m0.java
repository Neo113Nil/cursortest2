package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class g2m0 {
    public final i2m0 a;
    public xii0 b;

    public g2m0(i2m0 i2m0Var) {
        this.a = i2m0Var;
    }

    public final Bundle a(String str) {
        Bundle bundle;
        i2m0 i2m0Var = this.a;
        if (!i2m0Var.g) {
            ny61.r("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle2 = i2m0Var.f;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(str)) {
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                qxa1.b(str);
                throw null;
            }
        } else {
            bundle = null;
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            i2m0Var.f = null;
        }
        return bundle;
    }

    public final f2m0 b(String str) {
        f2m0 f2m0Var;
        i2m0 i2m0Var = this.a;
        synchronized (i2m0Var.c) {
            Iterator it = i2m0Var.d.entrySet().iterator();
            do {
                f2m0Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                f2m0 f2m0Var2 = (f2m0) entry.getValue();
                if (jl40.l(str2, str)) {
                    f2m0Var = f2m0Var2;
                }
            } while (f2m0Var == null);
        }
        return f2m0Var;
    }

    public final void c(String str, f2m0 f2m0Var) {
        i2m0 i2m0Var = this.a;
        synchronized (i2m0Var.c) {
            if (i2m0Var.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            i2m0Var.d.put(str, f2m0Var);
        }
    }

    public final void d() {
        if (!this.a.h) {
            ny61.r("Can not perform this action after onSaveInstanceState");
            return;
        }
        xii0 xii0Var = this.b;
        if (xii0Var == null) {
            xii0Var = new xii0(this);
        }
        this.b = xii0Var;
        try {
            eay.class.getDeclaredConstructor(null);
            xii0 xii0Var2 = this.b;
            if (xii0Var2 != null) {
                xii0Var2.b(eay.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + eay.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
