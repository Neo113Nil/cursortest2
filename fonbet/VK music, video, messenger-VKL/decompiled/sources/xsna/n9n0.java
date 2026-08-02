package xsna;

import com.vk.superapp.api.dto.menu.UpdateOptions;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import java.util.List;
import java.util.Set;

/* compiled from: SuperAppMenuData.kt */
/* loaded from: classes6.dex */
public final class n9n0 {
    public final q9n0 a;
    public final a b;

    /* compiled from: SuperAppMenuData.kt */
    public static abstract class a {

        /* compiled from: SuperAppMenuData.kt */
        /* renamed from: xsna.n9n0$a$a, reason: collision with other inner class name */
        public static final class C3389a extends a {
            public final boolean a;

            public C3389a(boolean z) {
                this.a = z;
            }

            public final boolean a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3389a) && this.a == ((C3389a) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Cache(warmedUp="), this.a, ')');
            }
        }

        /* compiled from: SuperAppMenuData.kt */
        public static final class b extends a {
            public static final b a = new b();
        }

        /* compiled from: SuperAppMenuData.kt */
        public static final class c extends a {
            public static final c a = new c();
        }
    }

    public n9n0(q9n0 q9n0Var, a aVar) {
        this.a = q9n0Var;
        this.b = aVar;
    }

    public final Set<String> a() {
        return this.a.c;
    }

    public final q9n0 b() {
        return this.a;
    }

    public final a c() {
        return this.b;
    }

    public final UpdateOptions d() {
        return this.a.e;
    }

    public final List<SuperAppWidget> e() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9n0)) {
            return false;
        }
        n9n0 n9n0Var = (n9n0) obj;
        return epx.f(this.a, n9n0Var.a) && epx.f(this.b, n9n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SuperAppMenuData(response=" + this.a + ", source=" + this.b + ')';
    }
}
