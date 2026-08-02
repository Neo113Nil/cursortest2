package defpackage;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
public final class des {
    public int a;
    public Fragment b;
    public boolean c = true;
    public int d;
    public int e;
    public int f;
    public int g;
    public Lifecycle.State h;
    public Lifecycle.State i;

    public des(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
        Lifecycle.State state = Lifecycle.State.RESUMED;
        this.h = state;
        this.i = state;
    }

    public des(int i, Fragment fragment, int i2) {
        this.a = i;
        this.b = fragment;
        Lifecycle.State state = Lifecycle.State.RESUMED;
        this.h = state;
        this.i = state;
    }
}
