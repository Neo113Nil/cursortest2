package xsna;

import com.vk.external.miniapp.net.app.WebImage;
import com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AllWidgetSettingsModel.kt */
/* loaded from: classes6.dex */
public final class uu1 {
    public final b a;
    public final ArrayList b;

    /* compiled from: AllWidgetSettingsModel.kt */
    public static final class a {
        public final WebImage a;
        public final String b;
        public final MiniWidgetItem c;

        public a(WebImage webImage, String str, MiniWidgetItem miniWidgetItem) {
            this.a = webImage;
            this.b = str;
            this.c = miniWidgetItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.b.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "MiniWidgetInfo(image=" + this.a + ", text=" + this.b + ", widget=" + this.c + ')';
        }
    }

    /* compiled from: AllWidgetSettingsModel.kt */
    public static final class b {
        public final boolean a;
        public final int b;
        public final List<a> c;

        public b(boolean z, int i, List<a> list) {
            this.a = z;
            this.b = i;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, Boolean.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MiniWidgetSettings(isMiniWidgetsEnabled=");
            sb.append(this.a);
            sb.append(", savingDelay=");
            sb.append(this.b);
            sb.append(", miniWidgets=");
            return ms9.a(')', sb, this.c);
        }
    }

    public uu1(b bVar, ArrayList arrayList) {
        this.a = bVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu1)) {
            return false;
        }
        uu1 uu1Var = (uu1) obj;
        return this.a.equals(uu1Var.a) && this.b.equals(uu1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AllWidgetSettingsModel(miniWidgets=");
        sb.append(this.a);
        sb.append(", widgetSettings=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
