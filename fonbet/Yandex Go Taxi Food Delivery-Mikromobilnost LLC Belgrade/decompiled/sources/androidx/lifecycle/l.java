package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
public final class l {
    public static Lifecycle.Event a(Lifecycle.State state) {
        int i = k.a[state.ordinal()];
        if (i == 1) {
            return Lifecycle.Event.ON_DESTROY;
        }
        if (i == 2) {
            return Lifecycle.Event.ON_STOP;
        }
        if (i != 3) {
            return null;
        }
        return Lifecycle.Event.ON_PAUSE;
    }

    public static Lifecycle.Event b(Lifecycle.State state) {
        int i = k.a[state.ordinal()];
        if (i == 1) {
            return Lifecycle.Event.ON_START;
        }
        if (i == 2) {
            return Lifecycle.Event.ON_RESUME;
        }
        if (i != 5) {
            return null;
        }
        return Lifecycle.Event.ON_CREATE;
    }

    public static Lifecycle.Event c(Lifecycle.State state) {
        int i = k.a[state.ordinal()];
        if (i == 1) {
            return Lifecycle.Event.ON_CREATE;
        }
        if (i == 2) {
            return Lifecycle.Event.ON_START;
        }
        if (i != 3) {
            return null;
        }
        return Lifecycle.Event.ON_RESUME;
    }
}
