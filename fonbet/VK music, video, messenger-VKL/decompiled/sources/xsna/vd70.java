package xsna;

import java.util.List;

/* compiled from: NotificationMenuModalRender.kt */
/* loaded from: classes4.dex */
public interface vd70 extends fm50<yd70> {

    /* compiled from: NotificationMenuModalRender.kt */
    public static final class a implements vd70 {
        public final yzt0<Boolean> a;
        public final yzt0<Boolean> b;
        public final yzt0<Boolean> c;
        public final yzt0<Boolean> d;
        public final yzt0<List<ee70>> e;
        public final yzt0<Long> f;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(isLoading=");
            sb.append(this.a);
            sb.append(", isError=");
            sb.append(this.b);
            sb.append(", showProfileStats=");
            sb.append(this.c);
            sb.append(", tabsEnabled=");
            sb.append(this.d);
            sb.append(", sources=");
            sb.append(this.e);
            sb.append(", currentSourceId=");
            return tr.c(sb, this.f, ')');
        }
    }

    /* compiled from: NotificationMenuModalRender.kt */
    public static final class b implements vd70 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1743230299;
        }

        public final String toString() {
            return "Initial";
        }
    }
}
