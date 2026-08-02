package defpackage;

import com.yandex.go.walking.navigation.impl.model.WalkNavFocusButtonState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class e541 {
    public final t741 a;
    public final z041 b;
    public final WalkNavFocusButtonState c;
    public final boolean d;

    public e541() {
        this(new t741(0), new z041(0), WalkNavFocusButtonState.FOCUS_USER_LOCATION, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e541)) {
            return false;
        }
        e541 e541Var = (e541) obj;
        return jl40.l(this.a, e541Var.a) && jl40.l(this.b, e541Var.b) && this.c == e541Var.c && this.d == e541Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "WalkNavOverviewUiState(sectionState=" + this.a + ", compassFabState=" + this.b + ", focusFabState=" + this.c + ", enableV2Design=" + this.d + Extension.C_BRAKE;
    }

    public e541(t741 t741Var, z041 z041Var, WalkNavFocusButtonState walkNavFocusButtonState, boolean z) {
        this.a = t741Var;
        this.b = z041Var;
        this.c = walkNavFocusButtonState;
        this.d = z;
    }
}
