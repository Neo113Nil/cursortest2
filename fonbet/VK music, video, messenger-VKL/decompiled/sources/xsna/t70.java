package xsna;

import android.view.View;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ActionsProvider.kt */
/* loaded from: classes7.dex */
public abstract class t70 {
    public h70 a;
    public s0p0 b;
    public boolean c = true;

    /* compiled from: ActionsProvider.kt */
    public static final class b {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("MainMenuActionState(isVisible="), this.a, ')');
        }
    }

    /* compiled from: ActionsProvider.kt */
    public interface c {
        boolean a();
    }

    public abstract List<ku<? extends Object, ? extends View>> a();

    public List<ku<? extends Object, ? extends View>> b() {
        return EmptyList.b;
    }

    public abstract ku<? extends c, ? extends View> c();

    public void d(h70 h70Var) {
        this.a = h70Var;
        if (h70Var != null) {
            h70Var.a(this, false);
        }
    }

    /* compiled from: ActionsProvider.kt */
    public static final class a extends t70 {
        @Override // xsna.t70
        public final List<ku<? extends Object, ? extends View>> a() {
            return EmptyList.b;
        }

        @Override // xsna.t70
        public final ku<? extends c, ? extends View> c() {
            return null;
        }

        @Override // xsna.t70
        public final void d(h70 h70Var) {
        }
    }
}
