package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.metrics.eventtracking.Event;
import com.vk.pushes.stat.AppStateOnChange;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.LazyThreadSafetyMode;

/* compiled from: NotificationEnabledChangeListener.kt */
/* loaded from: classes5.dex */
public final class w970 {
    public final mcd a;
    public final rvq b;
    public final pll c;
    public final Object d;
    public final TreeMap e;

    /* compiled from: NotificationEnabledChangeListener.kt */
    public static final class a {
        public final AppStateOnChange a;
        public final boolean b;
        public final boolean c;

        public a(AppStateOnChange appStateOnChange, boolean z, boolean z2) {
            this.a = appStateOnChange;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeReport(appStateOnChange=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            sb.append(this.b);
            sb.append(", shouldBeStoredSilently=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    public w970(mcd mcdVar, rvq rvqVar, Context context) {
        this.a = mcdVar;
        this.b = rvqVar;
        pll pllVar = new pll();
        pllVar.b = msy.a(LazyThreadSafetyMode.NONE, new ywn(context, 2));
        this.c = pllVar;
        this.d = msy.a(LazyThreadSafetyMode.NONE, new t970(this));
        this.e = new TreeMap(Comparator.nullsLast(Comparator.naturalOrder()));
        b(context, true);
        zqn0.a.b(new v970(this, context));
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void a() {
        if (!((Boolean) this.a.invoke()).booleanValue()) {
            this.b.invoke(new ag20(this, 15));
        }
        TreeMap treeMap = this.e;
        for (Map.Entry entry : treeMap.entrySet()) {
            String str = (String) entry.getKey();
            a aVar = (a) entry.getValue();
            ?? r4 = this.d;
            pll pllVar = this.c;
            if (str == null) {
                boolean z = aVar.c;
                boolean z2 = aVar.b;
                if (!z) {
                    s870 s870Var = (s870) r4.getValue();
                    AppStateOnChange appStateOnChange = aVar.a;
                    s870Var.getClass();
                    el3 el3Var = Event.b;
                    Event.a b = h5s.b("push_permission_changed");
                    b.c("app_state", appStateOnChange.name().toLowerCase(Locale.ROOT));
                    b.b("enabled", Integer.valueOf(z2 ? 1 : 0));
                    b.j(thp0.c);
                    com.vk.metrics.eventtracking.b.a.k(b.e());
                }
                qaj0.c((SharedPreferences) pllVar.b.getValue(), "__system_all_notifications__", Boolean.valueOf(z2));
            } else {
                if (!aVar.c) {
                    ((s870) r4.getValue()).getClass();
                }
                qaj0.c((SharedPreferences) pllVar.b.getValue(), str, Boolean.valueOf(aVar.b));
            }
        }
        treeMap.clear();
    }

    public final void b(Context context, boolean z) {
        AppStateOnChange appStateOnChange;
        if (z) {
            appStateOnChange = AppStateOnChange.NOT_RUNNING;
        } else {
            c63 c63Var = c63.a;
            appStateOnChange = (c63.f && gz80.a(33)) ? AppStateOnChange.FOREGROUND : AppStateOnChange.BACKGROUND;
        }
        asu0.a.getClass();
        asu0.o().execute(new u970(context, this, appStateOnChange, 0));
    }
}
