package xsna;

import android.view.View;

/* compiled from: MviViewComponent.kt */
/* loaded from: classes3.dex */
public final class zyt0 {
    public final View a;

    public zyt0(View view) {
        this.a = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zyt0) && epx.f(this.a, ((zyt0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return br.b(new StringBuilder("View(view="), this.a, ')');
    }
}
