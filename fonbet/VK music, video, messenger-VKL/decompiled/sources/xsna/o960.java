package xsna;

import com.vkontakte.android.R;

/* compiled from: NewWidgetSettingsItem.kt */
/* loaded from: classes6.dex */
public abstract class o960 extends zif0 {

    /* compiled from: NewWidgetSettingsItem.kt */
    public static final class a extends o960 {
        public static final a a = new a();

        @Override // xsna.zif0
        public final int b() {
            return R.layout.item_widget_setting_skeleton;
        }
    }

    /* compiled from: NewWidgetSettingsItem.kt */
    public static final class b extends o960 {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        @Override // xsna.zif0
        public final int b() {
            return R.layout.vk_item_widget_settings_title;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Title(text="), this.a, ')');
        }
    }
}
