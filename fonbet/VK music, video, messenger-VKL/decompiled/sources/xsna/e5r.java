package xsna;

import com.vk.clips.sdk.shared.feed.controller.mvi.state.spinner.ScreenSpinnerViewState;

/* compiled from: FeedViewState.kt */
/* loaded from: classes17.dex */
public final class e5r implements ao50 {
    public final fi50 a;

    /* compiled from: FeedViewState.kt */
    public static final class a implements fm50<q4r> {
        public final yzt0<d1r> a;
        public final yzt0<s4r> b;
        public final yzt0<Boolean> c;
        public final yzt0<ScreenSpinnerViewState> d;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Main(items=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", reloadingInBackground=");
            sb.append(this.c);
            sb.append(", spinnerViewState=");
            return tr.c(sb, this.d, ')');
        }
    }

    public e5r(fi50 fi50Var) {
        this.a = fi50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e5r) && this.a.equals(((e5r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j8.b(new StringBuilder("FeedViewState(main="), this.a, ')');
    }
}
