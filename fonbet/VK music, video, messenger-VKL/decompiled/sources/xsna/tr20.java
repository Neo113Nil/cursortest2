package xsna;

import java.util.ArrayList;

/* compiled from: MiniWidgetSettingsTabMvi.kt */
/* loaded from: classes6.dex */
public abstract class tr20 implements kj50 {

    /* compiled from: MiniWidgetSettingsTabMvi.kt */
    public static final class a extends tr20 {
        public final String b;

        public a(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("DisabledMiniWidgetClick(widgetType="), this.b, ')');
        }
    }

    /* compiled from: MiniWidgetSettingsTabMvi.kt */
    public static final class b extends tr20 {
        public static final b b = new b();
    }

    /* compiled from: MiniWidgetSettingsTabMvi.kt */
    public static final class c extends tr20 {
        public final boolean b;

        public c(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("MiniWidgetsEnabledStateChanged(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: MiniWidgetSettingsTabMvi.kt */
    public static final class d extends tr20 {
        public final ArrayList b;

        public d(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("PinnedWidgetsChanged(pinnedWidgetIds="), this.b);
        }
    }

    /* compiled from: MiniWidgetSettingsTabMvi.kt */
    public static final class e extends tr20 {
        public static final e b = new e();
    }

    /* compiled from: MiniWidgetSettingsTabMvi.kt */
    public static final class f extends tr20 {
        public static final f b = new f();
    }

    /* compiled from: MiniWidgetSettingsTabMvi.kt */
    public static final class g extends tr20 {
        public final boolean b;

        public g(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.b == ((g) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("UserInteractStatusChanged(isInteracting="), this.b, ')');
        }
    }
}
