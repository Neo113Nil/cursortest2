package xsna;

import com.vk.external.miniapp.net.app.WebApiApplication;

/* compiled from: ProfileButton.kt */
/* loaded from: classes7.dex */
public abstract class gs90 {

    /* compiled from: ProfileButton.kt */
    public static final class a extends gs90 {
        public final WebApiApplication a;

        public a(WebApiApplication webApiApplication) {
            this.a = webApiApplication;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return (int) this.a.b;
        }

        public final String toString() {
            return "AppPayload(webApiApplication=" + this.a + ')';
        }
    }
}
