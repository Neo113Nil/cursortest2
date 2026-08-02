package xsna;

import android.view.KeyEvent;

/* compiled from: KeyEvent.kt */
@vby
/* loaded from: classes11.dex */
public final class hdy {
    public final KeyEvent a;

    public final boolean equals(Object obj) {
        if (obj instanceof hdy) {
            return epx.f(this.a, ((hdy) obj).a);
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
