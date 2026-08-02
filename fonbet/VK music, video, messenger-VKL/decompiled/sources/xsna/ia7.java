package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: BirthdaysListAction.kt */
/* loaded from: classes15.dex */
public interface ia7 extends kj50 {

    /* compiled from: BirthdaysListAction.kt */
    public static final class a implements ia7 {
        public static final a b = new a();
    }

    /* compiled from: BirthdaysListAction.kt */
    public static final class b implements ia7 {
        public final UserId b;
        public final ka7 c;

        public b(UserId userId, ka7 ka7Var) {
            this.b = userId;
            this.c = ka7Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            return "ListItemClick(userId=" + this.b + ", clickAction=" + this.c + ')';
        }
    }

    /* compiled from: BirthdaysListAction.kt */
    public interface c extends ia7 {

        /* compiled from: BirthdaysListAction.kt */
        public static final class a implements c {
            public static final a b = new a();
        }

        /* compiled from: BirthdaysListAction.kt */
        public static final class b implements c {
            public static final b b = new b();
        }
    }

    /* compiled from: BirthdaysListAction.kt */
    public interface d extends ia7 {

        /* compiled from: BirthdaysListAction.kt */
        public static final class a implements d {
            public static final a b = new a();
        }

        /* compiled from: BirthdaysListAction.kt */
        public static final class b implements d {
            public static final b b = new b();
        }
    }
}
