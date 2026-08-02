package xsna;

import com.vk.antispam.SpamAction;
import com.vk.antispam.SpammerModel;

/* compiled from: AntispamAction.kt */
/* loaded from: classes14.dex */
public interface sv2 extends kj50 {

    /* compiled from: AntispamAction.kt */
    public static final class a implements sv2 {
        public final SpamAction b;
        public final boolean c;

        public a(SpamAction spamAction, boolean z) {
            this.b = spamAction;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeSpamActionState(spamAction=");
            sb.append(this.b);
            sb.append(", isSelected=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: AntispamAction.kt */
    public static final class b implements sv2 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1376796400;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: AntispamAction.kt */
    public static final class c implements sv2 {
        public final SpammerModel b;

        public c(SpammerModel spammerModel) {
            this.b = spammerModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Init(spammerModel=" + this.b + ')';
        }
    }

    /* compiled from: AntispamAction.kt */
    public static final class d implements sv2 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 734969856;
        }

        public final String toString() {
            return "Submit";
        }
    }
}
