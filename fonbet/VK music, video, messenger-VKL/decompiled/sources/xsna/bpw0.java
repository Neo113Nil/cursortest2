package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: VoipGroupSelectorResultEvent.kt */
/* loaded from: classes7.dex */
public abstract class bpw0 {

    /* compiled from: VoipGroupSelectorResultEvent.kt */
    public static final class a extends bpw0 {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        @Override // xsna.bpw0
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("AllUsersSelected(requestKey="), this.a, ')');
        }
    }

    /* compiled from: VoipGroupSelectorResultEvent.kt */
    public static final class b extends bpw0 {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        @Override // xsna.bpw0
        public final String a() {
            return this.a;
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
            return ho8.a(new StringBuilder("CurrentUserSelected(requestKey="), this.a, ')');
        }
    }

    /* compiled from: VoipGroupSelectorResultEvent.kt */
    public static final class c extends bpw0 {
        public final String a;
        public final UserId b;

        public c(String str, UserId userId) {
            this.a = str;
            this.b = userId;
        }

        @Override // xsna.bpw0
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GroupSelected(requestKey=");
            sb.append(this.a);
            sb.append(", groupId=");
            return gp.b(sb, this.b, ')');
        }
    }

    public abstract String a();
}
