package xsna;

import android.util.Size;
import android.view.View;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AnimationDelegate.kt */
/* loaded from: classes16.dex */
public interface wn2 {

    /* compiled from: AnimationDelegate.kt */
    public static final class a {
        public static void a(wn2 wn2Var, View view, View view2, b bVar, List list, int i) {
            if ((i & 8) != 0) {
                list = EmptyList.b;
            }
            wn2Var.c(view, view2, bVar, list);
        }
    }

    /* compiled from: AnimationDelegate.kt */
    public static final class b {
        public final boolean a;
        public final boolean b = true;
        public final boolean c;

        public b(boolean z, boolean z2) {
            this.a = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(animated=");
            sb.append(this.a);
            sb.append(", limitHeightByViewHeight=");
            sb.append(this.b);
            sb.append(", limitWidthByViewWidth=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    Size a();

    Float b();

    void c(View view, View view2, b bVar, List list);

    void d(View view, odc0 odc0Var);

    void e(float f);
}
