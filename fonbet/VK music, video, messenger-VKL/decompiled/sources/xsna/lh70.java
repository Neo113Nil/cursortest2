package xsna;

import java.util.List;

/* compiled from: NotificationSettingsRender.kt */
/* loaded from: classes5.dex */
public interface lh70 extends fm50<oh70> {

    /* compiled from: NotificationSettingsRender.kt */
    public static final class a implements lh70 {
        public final yzt0<Boolean> a;
        public final yzt0<Boolean> b;
        public final yzt0<List<dg70>> c;
        public final yzt0<Boolean> d;
        public final yzt0<Integer> e;
        public final yzt0<String> f;
        public final yzt0<String> g;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7) {
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(isLoading=");
            sb.append(this.a);
            sb.append(", isError=");
            sb.append(this.b);
            sb.append(", items=");
            sb.append(this.c);
            sb.append(", isLEDDialogShow=");
            sb.append(this.d);
            sb.append(", ledColor=");
            sb.append(this.e);
            sb.append(", sectionId=");
            sb.append(this.f);
            sb.append(", sectionTitle=");
            return tr.c(sb, this.g, ')');
        }
    }

    /* compiled from: NotificationSettingsRender.kt */
    public static final class b implements lh70 {
        public static final b a = new b();
    }
}
