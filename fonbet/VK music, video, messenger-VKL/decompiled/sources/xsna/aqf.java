package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import java.util.List;

/* compiled from: ClipsWrapperExternalAction.kt */
/* loaded from: classes17.dex */
public interface aqf {

    /* compiled from: ClipsWrapperExternalAction.kt */
    public static final class a implements aqf {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ActiveProfilePageChange(isUser="), this.a, ')');
        }
    }

    /* compiled from: ClipsWrapperExternalAction.kt */
    public static final class b implements aqf {
        public final List<ClipFeedTab> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends ClipFeedTab> list) {
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
            return ms9.a(')', new StringBuilder("TabsUpdated(tabs="), this.a);
        }
    }
}
