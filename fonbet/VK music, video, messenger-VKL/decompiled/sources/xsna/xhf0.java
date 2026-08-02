package xsna;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import xsna.v1h0;

/* compiled from: Recreator.android.kt */
/* loaded from: classes.dex */
public final class xhf0 implements androidx.lifecycle.l {
    public final z1h0 b;

    /* compiled from: Recreator.android.kt */
    /* loaded from: classes12.dex */
    public static final class a implements v1h0.b {
        public final LinkedHashSet a = new LinkedHashSet();

        public a(v1h0 v1h0Var) {
            v1h0Var.c("androidx.savedstate.Restarter", this);
        }

        public final void a(String str) {
            this.a.add(str);
        }

        @Override // xsna.v1h0.b
        public final Bundle r() {
            Bundle b = yfb.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
            List O0 = j5g.O0(this.a);
            b.putStringArrayList("classes_to_restore", O0 instanceof ArrayList ? (ArrayList) O0 : new ArrayList<>(O0));
            return b;
        }
    }

    public xhf0(z1h0 z1h0Var) {
        this.b = z1h0Var;
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        f5zVar.getLifecycle().removeObserver(this);
        z1h0 z1h0Var = this.b;
        Bundle a2 = z1h0Var.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (a2 == null) {
            return;
        }
        ArrayList<String> stringArrayList = a2.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> asSubclass = Class.forName(str, false, xhf0.class.getClassLoader()).asSubclass(v1h0.a.class);
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        ((v1h0.a) declaredConstructor.newInstance(null)).a(z1h0Var);
                    } catch (Exception e) {
                        throw new RuntimeException(go9.b("Failed to instantiate ", str), e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(zr.a("Class ", str, " wasn't found"), e3);
            }
        }
    }
}
