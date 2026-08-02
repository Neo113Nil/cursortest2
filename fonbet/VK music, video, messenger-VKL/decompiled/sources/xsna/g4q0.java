package xsna;

import android.content.Context;
import com.vk.superapp.ui.uniwidgets.dto.CardUniWidget;
import com.vk.superapp.ui.uniwidgets.dto.CounterUniWidget;
import com.vk.superapp.ui.uniwidgets.dto.GridUniWidget;
import com.vk.superapp.ui.uniwidgets.dto.InformerUniWidget;
import com.vk.superapp.ui.uniwidgets.dto.InternalUniWidget;
import com.vk.superapp.ui.uniwidgets.dto.PlaceholderUniWidget;
import com.vk.superapp.ui.uniwidgets.dto.ScrollUniWidget;
import com.vk.superapp.ui.uniwidgets.dto.TableUniWidget;
import com.vk.superapp.ui.uniwidgets.dto.UniversalWidget;
import xsna.w1w0;

/* compiled from: UniversalWidgetFabric.kt */
/* loaded from: classes6.dex */
public final class g4q0 {

    /* compiled from: UniversalWidgetFabric.kt */
    public static final class a {
        public final boolean a;
        public final int b;
        public final yfb c;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, qoy.b(Boolean.hashCode(false) * 31, 31, this.a), 31);
        }

        public final String toString() {
            return "UiParams(isWidgetActionEnabled=false, showHeaderButton=" + this.a + ", maxWidgetWidth=" + this.b + ", widgetColors=" + this.c + ')';
        }

        public a(int i, yfb yfbVar) {
            this.a = true;
            this.b = i;
            this.c = yfbVar;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(int i) {
            this(r2, r0 == null ? null : r0);
            int a = iah0.f().widthPixels - iah0.a(16);
            yfb yfbVar = m3q0.a;
        }
    }

    static {
        new a(0);
    }

    public static cpx0 a(Context context, UniversalWidget universalWidget, w1w0.a aVar, a aVar2) {
        Context a2 = hnj.a(context);
        if (universalWidget instanceof ScrollUniWidget) {
            return new vgh0(aVar2, aVar).j(a2, universalWidget);
        }
        if (universalWidget instanceof CounterUniWidget) {
            return new wxj(aVar2, aVar).j(a2, universalWidget);
        }
        if (universalWidget instanceof InformerUniWidget) {
            return new tww(aVar2, aVar).j(a2, universalWidget);
        }
        if (universalWidget instanceof GridUniWidget) {
            return new pgu(aVar2, aVar).j(a2, universalWidget);
        }
        if (universalWidget instanceof InternalUniWidget) {
            return new mnx(aVar2, aVar).j(a2, universalWidget);
        }
        if (universalWidget instanceof CardUniWidget) {
            return new zt9(aVar2, aVar).j(a2, universalWidget);
        }
        if (universalWidget instanceof PlaceholderUniWidget) {
            return new ssa0(aVar2, aVar).j(a2, universalWidget);
        }
        if (universalWidget instanceof TableUniWidget) {
            return new rxn0(aVar2, aVar).j(a2, universalWidget);
        }
        throw new IllegalArgumentException("Unknown uni widget: " + universalWidget);
    }
}
