package xsna;

import android.content.Context;
import com.vk.stat.scheme.SchemeStat$TypeUniversalWidget;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.uniwidgets.dto.UniversalWidget;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.menu.ExpandableMenuState;

/* compiled from: SuperAppClickListener.kt */
/* loaded from: classes6.dex */
public interface u7n0 {

    /* compiled from: SuperAppClickListener.kt */
    public static final class a {
        public final UniversalWidget a;
        public final SchemeStat$TypeUniversalWidget.ElementUiType b;
        public final int c;
        public final boolean d;

        public /* synthetic */ a(UniversalWidget universalWidget, SchemeStat$TypeUniversalWidget.ElementUiType elementUiType, int i, int i2) {
            this(universalWidget, elementUiType, (i2 & 4) != 0 ? -1 : i, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + shy.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UniWidgetInteractionInfo(uniWidget=");
            sb.append(this.a);
            sb.append(", element=");
            sb.append(this.b);
            sb.append(", actionIndex=");
            sb.append(this.c);
            sb.append(", isScrollWidget=");
            return defpackage.q0.a(sb, this.d, ')');
        }

        public a(UniversalWidget universalWidget, SchemeStat$TypeUniversalWidget.ElementUiType elementUiType, int i, boolean z) {
            this.a = universalWidget;
            this.b = elementUiType;
            this.c = i;
            this.d = z;
        }
    }

    void D0(yk ykVar, m84 m84Var);

    void Y0(String str);

    void Z(Context context, WebAction webAction, SuperAppWidget superAppWidget);

    void b(Context context, WebAction webAction, f9n0 f9n0Var, Integer num);

    void d0(SuperAppWidget superAppWidget);

    void e0(WidgetIds widgetIds, int i);

    void f0(String str);

    void g0(String str);

    void h0(Context context, b9n0 b9n0Var);

    void h1(j8q j8qVar, ExpandableMenuState expandableMenuState);

    void i0(WidgetIds widgetIds);

    void i1(obn0 obn0Var);

    void u0(Context context, a aVar, WebAction webAction);

    void x(Context context, z8n0 z8n0Var, WebAction webAction, int i, boolean z);

    void x0(String str);

    void z(SuperAppWidget superAppWidget);

    default void g(CharSequence charSequence, CharSequence charSequence2) {
    }
}
