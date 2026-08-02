package xsna;

import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.users.User;

/* compiled from: InvitationBroadcastItem.kt */
/* loaded from: classes2.dex */
public abstract class dqx implements hfz {
    public final long b;
    public boolean c = false;

    /* compiled from: InvitationBroadcastItem.kt */
    public static final class a extends dqx {
        public final Contact d;

        public a(Contact contact) {
            super(contact.G3());
            this.d = contact;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.d, ((a) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "ContactItem(contact=" + this.d + ')';
        }
    }

    /* compiled from: InvitationBroadcastItem.kt */
    public static final class b extends dqx {
        public final User d;

        public b(User user) {
            super(user.G3());
            this.d = user;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.d, ((b) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "UserItem(user=" + this.d + ')';
        }
    }

    public dqx(long j) {
        this.b = j;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Long.valueOf(this.b);
    }
}
