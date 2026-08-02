package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.contacts.Contact;

/* compiled from: VoipCallByPhoneNavigationEvent.kt */
/* loaded from: classes7.dex */
public abstract class ogw0 {

    /* compiled from: VoipCallByPhoneNavigationEvent.kt */
    public static final class a extends ogw0 {
        public final Contact a;

        public a(Contact contact) {
            this.a = contact;
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
            return "GoToCallContact(contact=" + this.a + ')';
        }
    }

    /* compiled from: VoipCallByPhoneNavigationEvent.kt */
    public static final class b extends ogw0 {
        public final UserId a;

        public b(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("GoToCallUser(userId="), this.a, ')');
        }
    }

    /* compiled from: VoipCallByPhoneNavigationEvent.kt */
    public static final class c extends ogw0 {
        public final String a;

        public c(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("NativeShareLink(link="), this.a, ')');
        }
    }
}
