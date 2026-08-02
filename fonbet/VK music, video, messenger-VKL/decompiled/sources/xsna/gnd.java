package xsna;

import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState;
import com.vk.core.compose.component.defaults.SpinnerState;

/* compiled from: ClipsCoauthorsSelectorViewState.kt */
/* loaded from: classes16.dex */
public final class gnd implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;

    /* compiled from: ClipsCoauthorsSelectorViewState.kt */
    public interface a<T extends ClipsCoauthorsSelectorMviState> extends fm50<ClipsCoauthorsSelectorMviState> {

        /* compiled from: ClipsCoauthorsSelectorViewState.kt */
        /* renamed from: xsna.gnd$a$a, reason: collision with other inner class name */
        public static final class C2950a implements a<ClipsCoauthorsSelectorMviState.c> {
            public final yzt0<tlo0> a;
            public final yzt0<tlo0> b;
            public final yzt0<w0h0> c;
            public final yzt0<tlo0> d;
            public final yzt0<d8p0> e;
            public final yzt0<umd> f;
            public final yzt0<Boolean> g;
            public final yzt0<SpinnerState> h;
            public final yzt0<tlo0> i;

            public C2950a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9) {
                this.a = h0u0Var;
                this.b = h0u0Var2;
                this.c = h0u0Var3;
                this.d = h0u0Var4;
                this.e = h0u0Var5;
                this.f = h0u0Var6;
                this.g = h0u0Var7;
                this.h = h0u0Var8;
                this.i = h0u0Var9;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2950a)) {
                    return false;
                }
                C2950a c2950a = (C2950a) obj;
                return epx.f(this.a, c2950a.a) && epx.f(this.b, c2950a.b) && epx.f(this.c, c2950a.c) && epx.f(this.d, c2950a.d) && epx.f(this.e, c2950a.e) && epx.f(this.f, c2950a.f) && epx.f(this.g, c2950a.g) && epx.f(this.h, c2950a.h) && epx.f(this.i, c2950a.i);
            }

            public final int hashCode() {
                return this.i.hashCode() + sr.a(this.h, sr.a(this.g, sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Content(topBarTitle=");
                sb.append(this.a);
                sb.append(", topBarSubtitle=");
                sb.append(this.b);
                sb.append(", saveButtonState=");
                sb.append(this.c);
                sb.append(", saveDescriptionText=");
                sb.append(this.d);
                sb.append(", topBarViewState=");
                sb.append(this.e);
                sb.append(", userItems=");
                sb.append(this.f);
                sb.append(", hasTopSeparator=");
                sb.append(this.g);
                sb.append(", spinnerState=");
                sb.append(this.h);
                sb.append(", recommendedTitle=");
                return tr.c(sb, this.i, ')');
            }
        }

        /* compiled from: ClipsCoauthorsSelectorViewState.kt */
        public static final class b implements a<ClipsCoauthorsSelectorMviState.a> {
            public final yzt0<tlo0> a;
            public final yzt0<tlo0> b;
            public final yzt0<w0h0> c;
            public final yzt0<tlo0> d;
            public final yzt0<d8p0> e;
            public final yzt0<tlo0> f;
            public final yzt0<Boolean> g;

            public b(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7) {
                this.a = h0u0Var;
                this.b = h0u0Var2;
                this.c = h0u0Var3;
                this.d = h0u0Var4;
                this.e = h0u0Var5;
                this.f = h0u0Var6;
                this.g = h0u0Var7;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g);
            }

            public final int hashCode() {
                return this.g.hashCode() + sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Error(topBarTitle=");
                sb.append(this.a);
                sb.append(", topBarSubtitle=");
                sb.append(this.b);
                sb.append(", saveButtonState=");
                sb.append(this.c);
                sb.append(", saveDescriptionText=");
                sb.append(this.d);
                sb.append(", topBarViewState=");
                sb.append(this.e);
                sb.append(", error=");
                sb.append(this.f);
                sb.append(", hasSeparator=");
                return tr.c(sb, this.g, ')');
            }
        }

        /* compiled from: ClipsCoauthorsSelectorViewState.kt */
        public static final class c implements a<ClipsCoauthorsSelectorMviState.b> {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 957872542;
            }

            public final String toString() {
                return "Init";
            }
        }

        /* compiled from: ClipsCoauthorsSelectorViewState.kt */
        public static final class d implements a<ClipsCoauthorsSelectorMviState.d> {
            public final yzt0<tlo0> a;
            public final yzt0<tlo0> b;
            public final yzt0<w0h0> c;
            public final yzt0<tlo0> d;
            public final yzt0<d8p0> e;

            public d(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5) {
                this.a = h0u0Var;
                this.b = h0u0Var2;
                this.c = h0u0Var3;
                this.d = h0u0Var4;
                this.e = h0u0Var5;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Loading(topBarTitle=");
                sb.append(this.a);
                sb.append(", topBarSubtitle=");
                sb.append(this.b);
                sb.append(", saveButtonState=");
                sb.append(this.c);
                sb.append(", saveDescriptionText=");
                sb.append(this.d);
                sb.append(", topBarViewState=");
                return tr.c(sb, this.e, ')');
            }
        }
    }

    public gnd(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
    }
}
