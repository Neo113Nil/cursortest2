package xsna;

import xsna.ha70;

/* compiled from: NotificationSnackbarType.kt */
/* loaded from: classes4.dex */
public interface xh70 {

    /* compiled from: NotificationSnackbarType.kt */
    public static final class a implements xh70 {
        public final ha70.w a;

        public a(ha70.w wVar) {
            this.a = wVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DeleteNotificationSuccess(cancelAction=" + this.a + ')';
        }
    }

    /* compiled from: NotificationSnackbarType.kt */
    public static final class b implements xh70 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -267057730;
        }

        public final String toString() {
            return "Error";
        }
    }
}
