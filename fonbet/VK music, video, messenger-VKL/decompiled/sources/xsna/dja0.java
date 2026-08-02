package xsna;

import com.vk.dto.common.id.UserId;
import java.util.Set;

/* compiled from: PickingExternalEvent.kt */
/* loaded from: classes17.dex */
public interface dja0 {

    /* compiled from: PickingExternalEvent.kt */
    public static final class a implements dja0 {
        public static final a a = new a();
    }

    /* compiled from: PickingExternalEvent.kt */
    public static final class b implements dja0 {
        public final Set<UserId> a;

        public b(Set<UserId> set) {
            this.a = set;
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
            return ur.c(new StringBuilder("Dismiss(resultList="), this.a, ')');
        }
    }
}
