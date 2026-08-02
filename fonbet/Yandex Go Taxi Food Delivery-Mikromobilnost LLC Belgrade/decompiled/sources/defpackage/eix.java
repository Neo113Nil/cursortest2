package defpackage;

import android.view.KeyEvent;

/* loaded from: classes10.dex */
public final class eix {
    public final KeyEvent a;

    public final boolean equals(Object obj) {
        if (obj instanceof eix) {
            return jl40.l(this.a, ((eix) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ')';
    }
}
