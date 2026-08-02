package xsna;

import java.util.List;

/* compiled from: WidgetSettingsTabMvi.kt */
/* loaded from: classes6.dex */
public abstract class jox0 implements xl50 {

    /* compiled from: WidgetSettingsTabMvi.kt */
    public static abstract class a extends jox0 {

        /* compiled from: WidgetSettingsTabMvi.kt */
        /* renamed from: xsna.jox0$a$a, reason: collision with other inner class name */
        public static final class C3135a extends a {
            public final List<qnx0> b;

            public C3135a(List<qnx0> list) {
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3135a) && epx.f(this.b, ((C3135a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("Loaded(widgetsList="), this.b);
            }
        }

        /* compiled from: WidgetSettingsTabMvi.kt */
        public static final class b extends a {
            public static final b b = new b();
        }
    }
}
