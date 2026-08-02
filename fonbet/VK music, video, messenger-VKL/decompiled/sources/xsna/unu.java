package xsna;

import com.vk.notifications.list.impl.presentation.model.common.ListNextState;
import java.util.List;

/* compiled from: GroupedNotificationListRender.kt */
/* loaded from: classes4.dex */
public interface unu extends fm50<wnu> {

    /* compiled from: GroupedNotificationListRender.kt */
    public static final class a implements unu {
        public final yzt0<Boolean> a;
        public final yzt0<Boolean> b;
        public final yzt0<Boolean> c;
        public final yzt0<List<kb70>> d;
        public final yzt0<tlo0> e;
        public final yzt0<Boolean> f;
        public final yzt0<ListNextState> g;
        public final yzt0<Integer> h;
        public final yzt0<xh70> i;
        public final yzt0<umu> j;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9, h0u0 h0u0Var10) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
            this.g = h0u0Var7;
            this.h = h0u0Var8;
            this.i = h0u0Var9;
            this.j = h0u0Var10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j);
        }

        public final int hashCode() {
            return this.j.hashCode() + sr.a(this.i, sr.a(this.h, sr.a(this.g, sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(isLoading=");
            sb.append(this.a);
            sb.append(", isRefreshing=");
            sb.append(this.b);
            sb.append(", isError=");
            sb.append(this.c);
            sb.append(", items=");
            sb.append(this.d);
            sb.append(", title=");
            sb.append(this.e);
            sb.append(", settingEnabled=");
            sb.append(this.f);
            sb.append(", nextState=");
            sb.append(this.g);
            sb.append(", snackbarKey=");
            sb.append(this.h);
            sb.append(", snackbarType=");
            sb.append(this.i);
            sb.append(", alert=");
            return tr.c(sb, this.j, ')');
        }
    }

    /* compiled from: GroupedNotificationListRender.kt */
    public static final class b implements unu {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1259048250;
        }

        public final String toString() {
            return "Initial";
        }
    }
}
