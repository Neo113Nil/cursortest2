package xsna;

import com.vk.im.reporters.api.analytics.click.ImCallTypeAnalyticsItem;
import xsna.mwv;

/* compiled from: ImCallViewAnalyticsItem.kt */
/* loaded from: classes2.dex */
public interface iyv extends mwv.a {

    /* compiled from: ImCallViewAnalyticsItem.kt */
    public static final class a implements iyv {
        public final ImCallTypeAnalyticsItem a;

        public a(ImCallTypeAnalyticsItem imCallTypeAnalyticsItem) {
            this.a = imCallTypeAnalyticsItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowMaxButtonFromChatToolbar(callType=" + this.a + ')';
        }
    }
}
