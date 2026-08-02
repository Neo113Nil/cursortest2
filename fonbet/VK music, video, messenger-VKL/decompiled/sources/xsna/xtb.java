package xsna;

import ru.ok.android.externcalls.sdk.chat.message.InboundMessage;

/* compiled from: ChatObserver.kt */
/* loaded from: classes7.dex */
public interface xtb {

    /* compiled from: ChatObserver.kt */
    public static final class a implements xtb {
        public final InboundMessage a;

        public a(InboundMessage inboundMessage) {
            this.a = inboundMessage;
        }

        public final InboundMessage a() {
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
            return "NewMessage(message=" + this.a + ')';
        }
    }
}
