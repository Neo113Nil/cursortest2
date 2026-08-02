package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;

/* compiled from: ClipCoauthorListAction.kt */
/* loaded from: classes16.dex */
public interface coc extends lj50 {

    /* compiled from: ClipCoauthorListAction.kt */
    public static final class a implements coc {
        public static final a b = new a();
    }

    /* compiled from: ClipCoauthorListAction.kt */
    public static final class b implements coc {
        public static final b b = new b();
    }

    /* compiled from: ClipCoauthorListAction.kt */
    public static final class c implements coc {
        public static final c b = new c();
    }

    /* compiled from: ClipCoauthorListAction.kt */
    public static final class d implements coc {
        public final UserId b;

        public d(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("ProfileClicked(userId="), this.b, ')');
        }
    }

    /* compiled from: ClipCoauthorListAction.kt */
    public static final class e implements coc {
        public final UserId b;

        public e(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("SubscribeClicked(userId="), this.b, ')');
        }
    }

    /* compiled from: ClipCoauthorListAction.kt */
    public static final class f implements coc {
        public final ArrayList b;

        public f(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b.equals(((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("UpdateCoauthors(newAuthors="), this.b);
        }
    }
}
