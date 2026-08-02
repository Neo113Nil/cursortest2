package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ViewState.kt */
/* loaded from: classes7.dex */
public abstract class txp {

    /* compiled from: ViewState.kt */
    public static final class a extends txp {
        public static final a a = new a();
    }

    /* compiled from: ViewState.kt */
    public static final class b extends txp {
        public final UserId a;

        public b(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            return epx.f(this.a, bVar.a);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(false) * 31;
            UserId userId = this.a;
            return hashCode + (userId != null ? Long.hashCode(userId.b) : 0);
        }

        public final String toString() {
            return gp.b(new StringBuilder("CallSourceSelected(isVideo=false, groupInfo="), this.a, ')');
        }
    }
}
