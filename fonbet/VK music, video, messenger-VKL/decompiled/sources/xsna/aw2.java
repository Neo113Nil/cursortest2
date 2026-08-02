package xsna;

import com.vk.antispam.SpamAction;
import com.vk.antispam.SpammerModel;

/* compiled from: AntispamPatch.kt */
/* loaded from: classes14.dex */
public interface aw2 extends xl50 {

    /* compiled from: AntispamPatch.kt */
    public static final class a implements aw2 {
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
            sb.append(", isChecked=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: AntispamPatch.kt */
    public static final class b implements aw2 {
        public final SpammerModel b;

        public b(SpammerModel spammerModel) {
            this.b = spammerModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetSpammerData(spammerModel=" + this.b + ')';
        }
    }
}
