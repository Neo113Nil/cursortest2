package xsna;

import com.vk.superapp.dto.WidgetSettingsModalOpenSource;

/* compiled from: WidgetSettingsMvi.kt */
/* loaded from: classes6.dex */
public abstract class vnx0 implements kj50 {

    /* compiled from: WidgetSettingsMvi.kt */
    public static final class a extends vnx0 {
        public final WidgetSettingsModalOpenSource b;

        public a(WidgetSettingsModalOpenSource widgetSettingsModalOpenSource) {
            this.b = widgetSettingsModalOpenSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            WidgetSettingsModalOpenSource widgetSettingsModalOpenSource = this.b;
            if (widgetSettingsModalOpenSource == null) {
                return 0;
            }
            return widgetSettingsModalOpenSource.hashCode();
        }

        public final String toString() {
            return "LoadData(source=" + this.b + ')';
        }
    }
}
