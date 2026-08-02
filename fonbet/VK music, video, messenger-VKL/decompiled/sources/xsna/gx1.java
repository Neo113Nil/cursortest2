package xsna;

import com.vk.uxpolls.api.models.UxPollsAnswer;
import java.util.List;

/* compiled from: AnalyticsController.kt */
/* loaded from: classes6.dex */
public interface gx1 {

    /* compiled from: AnalyticsController.kt */
    public static final class a implements gx1 {
        public static final a a = new a();
    }

    /* compiled from: AnalyticsController.kt */
    public static final class b implements gx1 {
        public final List<UxPollsAnswer> a;

        public b(List<UxPollsAnswer> list) {
            this.a = list;
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
            return ms9.a(')', new StringBuilder("SendAnswer(answers="), this.a);
        }
    }

    /* compiled from: AnalyticsController.kt */
    public static final class c implements gx1 {
        public static final c a = new c();
    }
}
