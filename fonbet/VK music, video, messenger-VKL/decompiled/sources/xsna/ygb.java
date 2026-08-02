package xsna;

import com.vk.channels.impl.list.loader.ChannelsListItemsLoader;
import xsna.ogb;

/* compiled from: ChannelsListProcessedItemsLoader.kt */
/* loaded from: classes16.dex */
public interface ygb<ProcessedState> extends pgb<a<ProcessedState>, ogb.b> {

    /* compiled from: ChannelsListProcessedItemsLoader.kt */
    public static final class a<ProcessedState> {
        public final ogb.a a;
        public final ChannelsListItemsLoader.a b;

        public a(ogb.a aVar, ChannelsListItemsLoader.a aVar2) {
            this.a = aVar;
            this.b = aVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.a.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ChannelsProcessedState(baseState=" + this.a + ", processedState=" + this.b + ')';
        }
    }
}
