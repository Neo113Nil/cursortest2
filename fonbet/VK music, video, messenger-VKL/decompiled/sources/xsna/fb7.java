package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: BirthdaysListViewEvent.kt */
/* loaded from: classes15.dex */
public interface fb7 {

    /* compiled from: BirthdaysListViewEvent.kt */
    public static final class a implements fb7 {
        public static final a a = new a();
    }

    /* compiled from: BirthdaysListViewEvent.kt */
    public static final class b implements fb7 {
        public final UserId a;
        public final ka7 b;

        public b(UserId userId, ka7 ka7Var) {
            this.a = userId;
            this.b = ka7Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            return "ListItemClick(userId=" + this.a + ", clickAction=" + this.b + ')';
        }
    }

    /* compiled from: BirthdaysListViewEvent.kt */
    public static final class c implements fb7 {
        public static final c a = new c();
    }

    /* compiled from: BirthdaysListViewEvent.kt */
    public static final class d implements fb7 {
        public static final d a = new d();
    }

    /* compiled from: BirthdaysListViewEvent.kt */
    public static final class e implements fb7 {
        public static final e a = new e();
    }
}
