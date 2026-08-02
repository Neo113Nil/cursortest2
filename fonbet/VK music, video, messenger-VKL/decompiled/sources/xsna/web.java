package xsna;

import com.vk.im.engine.models.events.channels.OnChannelsCacheInvalidateEvent;
import java.util.HashMap;

/* compiled from: ChannelsEventsProvider.kt */
/* loaded from: classes16.dex */
public abstract class web {

    /* compiled from: ChannelsEventsProvider.kt */
    public static final class a extends web {
        public final OnChannelsCacheInvalidateEvent.Reason a;

        public a(OnChannelsCacheInvalidateEvent.Reason reason) {
            this.a = reason;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CacheInvalidate(reason=" + this.a + ')';
        }
    }

    /* compiled from: ChannelsEventsProvider.kt */
    public static final class b extends web {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1540130215;
        }

        public final String toString() {
            return "ChannelsCountUpdateEvent";
        }
    }

    /* compiled from: ChannelsEventsProvider.kt */
    public static final class c extends web {
        public final HashMap a;

        public c(HashMap hashMap) {
            this.a = hashMap;
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
            return "ChannelsUpdateEvent" + this.a.keySet();
        }
    }

    /* compiled from: ChannelsEventsProvider.kt */
    public static final class d extends web {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -635156358;
        }

        public final String toString() {
            return "Reset";
        }
    }
}
