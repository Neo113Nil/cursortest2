package xsna;

import android.view.View;

/* compiled from: MviContent.kt */
/* loaded from: classes3.dex */
public abstract class mk50 {

    /* compiled from: MviContent.kt */
    public static final class a extends mk50 {
        public static final a a = new a();
    }

    /* compiled from: MviContent.kt */
    public static final class b extends mk50 {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Layout(layoutId="), this.a, ')');
        }
    }

    /* compiled from: MviContent.kt */
    public static final class c extends mk50 {
        public final View a;

        public c(View view) {
            this.a = view;
        }

        public final View a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return br.b(new StringBuilder("View(view="), this.a, ')');
        }
    }
}
