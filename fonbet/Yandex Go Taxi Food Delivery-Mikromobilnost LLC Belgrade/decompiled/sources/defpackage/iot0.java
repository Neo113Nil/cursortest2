package defpackage;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact;
import androidx.fragment.app.SpecialEffectsController$Operation$State;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.collections.a;

/* loaded from: classes.dex */
public abstract class iot0 {
    public SpecialEffectsController$Operation$State a;
    public SpecialEffectsController$Operation$LifecycleImpact b;
    public final Fragment c;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList d = new ArrayList();
    public boolean i = true;

    public iot0(SpecialEffectsController$Operation$State specialEffectsController$Operation$State, SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact, Fragment fragment) {
        this.a = specialEffectsController$Operation$State;
        this.b = specialEffectsController$Operation$LifecycleImpact;
        this.c = fragment;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.k = arrayList;
    }

    public final void a(ViewGroup viewGroup) {
        this.h = false;
        if (this.e) {
            return;
        }
        this.e = true;
        if (this.j.isEmpty()) {
            b();
            return;
        }
        Iterator it = a.J0(this.k).iterator();
        while (it.hasNext()) {
            ((eot0) it.next()).a(viewGroup);
        }
    }

    public abstract void b();

    public final void c(eot0 eot0Var) {
        ArrayList arrayList = this.j;
        if (arrayList.remove(eot0Var) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(SpecialEffectsController$Operation$State specialEffectsController$Operation$State, SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact) {
        int i = hot0.a[specialEffectsController$Operation$LifecycleImpact.ordinal()];
        Fragment fragment = this.c;
        if (i == 1) {
            if (this.a == SpecialEffectsController$Operation$State.REMOVED) {
                if (FragmentManager.O(2)) {
                    Objects.toString(fragment);
                    Objects.toString(this.b);
                }
                this.a = SpecialEffectsController$Operation$State.VISIBLE;
                this.b = SpecialEffectsController$Operation$LifecycleImpact.ADDING;
                this.i = true;
                return;
            }
            return;
        }
        if (i == 2) {
            if (FragmentManager.O(2)) {
                Objects.toString(fragment);
                Objects.toString(this.a);
                Objects.toString(this.b);
            }
            this.a = SpecialEffectsController$Operation$State.REMOVED;
            this.b = SpecialEffectsController$Operation$LifecycleImpact.REMOVING;
            this.i = true;
            return;
        }
        if (i == 3 && this.a != SpecialEffectsController$Operation$State.REMOVED) {
            if (FragmentManager.O(2)) {
                Objects.toString(fragment);
                Objects.toString(this.a);
                specialEffectsController$Operation$State.toString();
            }
            this.a = specialEffectsController$Operation$State;
        }
    }

    public final String toString() {
        StringBuilder x = unr0.x("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        x.append(this.a);
        x.append(" lifecycleImpact = ");
        x.append(this.b);
        x.append(" fragment = ");
        x.append(this.c);
        x.append('}');
        return x.toString();
    }
}
