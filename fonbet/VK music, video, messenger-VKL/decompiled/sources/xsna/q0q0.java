package xsna;

import android.app.Activity;
import com.vk.core.ui.tracking.UiTrackingScreen;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Stack;

/* compiled from: UiTrackingActivityInfoProcessor.kt */
/* loaded from: classes.dex */
public final class q0q0 {
    public final t1q0 a;
    public final ArrayList b = new ArrayList();

    /* compiled from: UiTrackingActivityInfoProcessor.kt */
    public static final class a {
        public final Class<Activity> a;
        public UiTrackingScreen b;
        public final LinkedHashSet c;
        public final Stack<UiTrackingScreen> d;

        public a() {
            throw null;
        }

        public a(Class cls) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Stack<UiTrackingScreen> stack = new Stack<>();
            this.a = cls;
            this.b = null;
            this.c = linkedHashSet;
            this.d = stack;
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
            int hashCode = this.a.hashCode() * 31;
            UiTrackingScreen uiTrackingScreen = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (uiTrackingScreen == null ? 0 : uiTrackingScreen.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            return "ActivityInfo(clazz=" + this.a + ", latestScreen=" + this.b + ", onActivityScreens=" + this.c + ", dialogPreviousScreens=" + this.d + ')';
        }
    }

    public q0q0(t1q0 t1q0Var) {
        this.a = t1q0Var;
    }
}
