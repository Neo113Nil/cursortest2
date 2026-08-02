package xsna;

import com.vk.profile.user.impl.domain.donut.state.DonutBannerDonutType;
import java.util.List;

/* compiled from: DonutBannerState.kt */
/* loaded from: classes5.dex */
public interface hyn {

    /* compiled from: DonutBannerState.kt */
    public static final class a implements hyn {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -652699628;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: DonutBannerState.kt */
    public static final class b implements hyn {
        public final pwn a;

        public b(pwn pwnVar) {
            this.a = pwnVar;
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
            return "Loaded(banner=" + this.a + ')';
        }
    }

    /* compiled from: DonutBannerState.kt */
    public static final class c implements hyn {
        public final List<DonutBannerDonutType> a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends DonutBannerDonutType> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("Loading(types="), this.a);
        }
    }
}
