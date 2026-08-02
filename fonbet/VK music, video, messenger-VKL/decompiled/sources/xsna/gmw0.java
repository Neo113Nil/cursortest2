package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: VoipChangeNameViewEvent.kt */
/* loaded from: classes7.dex */
public abstract class gmw0 {

    /* compiled from: VoipChangeNameViewEvent.kt */
    public static final class a extends gmw0 {
        public static final a a = new a();
    }

    /* compiled from: VoipChangeNameViewEvent.kt */
    public static final class b extends gmw0 {
        public static final b a = new b();
    }

    /* compiled from: VoipChangeNameViewEvent.kt */
    public static final class c extends gmw0 {
        public final UserId a;

        public c(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("GroupClick(groupId="), this.a, ')');
        }
    }
}
