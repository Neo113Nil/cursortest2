package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.messages.Msg;
import java.util.Collection;
import java.util.List;

/* compiled from: HistoryEvent.kt */
/* loaded from: classes13.dex */
public abstract class m8v {

    /* compiled from: HistoryEvent.kt */
    public static final class a extends m8v {
        public final Attach a;

        public a(Attach attach) {
            this.a = attach;
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
            return "AttachUpdateEvent(attach=" + this.a + ')';
        }
    }

    /* compiled from: HistoryEvent.kt */
    public static final class b extends m8v {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1424715366;
        }

        public final String toString() {
            return "CacheInvalidateEvent";
        }
    }

    /* compiled from: HistoryEvent.kt */
    public static final class c extends m8v {
        public final Collection<Integer> a;

        public c(Collection<Integer> collection) {
            this.a = collection;
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
            return l4.h(new StringBuilder("MsgAddEvent(messagesIds="), this.a, ')');
        }
    }

    /* compiled from: HistoryEvent.kt */
    public static final class d extends m8v {
        public final List<Msg> a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends Msg> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("MsgSendEvent(messages="), this.a);
        }
    }

    /* compiled from: HistoryEvent.kt */
    public static final class e extends m8v {
        public final Collection<Integer> a;

        public e(Collection<Integer> collection) {
            this.a = collection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return l4.h(new StringBuilder("MsgUpdateEvent(messagesIds="), this.a, ')');
        }
    }
}
