package xsna;

import com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem;
import com.vkontakte.android.R;

/* compiled from: MiniWidgetSettingsItem.kt */
/* loaded from: classes6.dex */
public abstract class lr20 extends zif0 {
    public boolean a;

    /* compiled from: MiniWidgetSettingsItem.kt */
    public static final class a extends lr20 {
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final MiniWidgetItem.HeaderIconAlign f;
        public final boolean g;

        public a(String str, String str2, String str3, String str4, MiniWidgetItem.HeaderIconAlign headerIconAlign, boolean z) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = headerIconAlign;
            this.g = z;
        }

        @Override // xsna.zif0
        public final int b() {
            return R.layout.mini_widget_item_view_holder;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + ((this.f.hashCode() + urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MiniWidget(uid=");
            sb.append(this.b);
            sb.append(", text=");
            sb.append(this.c);
            sb.append(", imageUrl=");
            sb.append(this.d);
            sb.append(", type=");
            sb.append(this.e);
            sb.append(", headerIconAlign=");
            sb.append(this.f);
            sb.append(", isEnabled=");
            return defpackage.q0.a(sb, this.g, ')');
        }
    }

    /* compiled from: MiniWidgetSettingsItem.kt */
    public static final class b extends lr20 {
        public static final b b = new b();

        @Override // xsna.zif0
        public final int b() {
            return R.layout.mini_widget_shimmer_view_holder;
        }
    }

    /* compiled from: MiniWidgetSettingsItem.kt */
    public static final class c extends lr20 {
        public final String b;
        public final boolean c;

        public c(String str, boolean z) {
            this.b = str;
            this.c = z;
        }

        @Override // xsna.zif0
        public final int b() {
            return R.layout.mini_widget_title_view_holder;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && this.c == cVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + qoy.b(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Title(text=");
            sb.append(this.b);
            sb.append(", isEnabled=");
            return n23.b(sb, this.c, ", isHeadline=false)");
        }
    }
}
