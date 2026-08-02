package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ContactsEvent.kt */
/* loaded from: classes2.dex */
public abstract class yaj implements e900 {

    /* compiled from: ContactsEvent.kt */
    public static final class a extends yaj {
        public final Peer a;

        public a(Peer peer) {
            this.a = peer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return eq.a(new StringBuilder("AddContact(member="), this.a, ')');
        }
    }

    /* compiled from: ContactsEvent.kt */
    public static final class b extends yaj {
        public static final b a = new b();
    }

    /* compiled from: ContactsEvent.kt */
    public static final class c extends yaj {
        public static final c a = new c();
    }

    /* compiled from: ContactsEvent.kt */
    public static final class d extends yaj {
        public final Peer a;

        public d(Peer peer) {
            this.a = peer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return eq.a(new StringBuilder("RemoveContact(member="), this.a, ')');
        }
    }
}
