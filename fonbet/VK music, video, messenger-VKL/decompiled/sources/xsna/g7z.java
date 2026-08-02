package xsna;

import com.vk.music.analytics.api.collector.strategy.CollectorStrategy;

/* compiled from: LimitConfig.kt */
/* loaded from: classes3.dex */
public interface g7z {

    /* compiled from: LimitConfig.kt */
    public static final class a implements g7z {
        public final int a;
        public final int b;
        public final CollectorStrategy.OverflowStrategy c;

        public a() {
            this(0);
        }

        @Override // xsna.g7z
        public final CollectorStrategy.OverflowStrategy a() {
            return this.c;
        }

        @Override // xsna.g7z
        public final int b() {
            return this.b;
        }

        @Override // xsna.g7z
        public final int d() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            return "Default(eventsAmount=" + this.a + ", sizeInKb=" + this.b + ", overflowStrategy=" + this.c + ')';
        }

        public a(int i) {
            CollectorStrategy.OverflowStrategy overflowStrategy = CollectorStrategy.OverflowStrategy.REMOVE_OLDEST;
            this.a = 50;
            this.b = -1;
            this.c = overflowStrategy;
            if (super.isValid()) {
                return;
            }
            throw new IllegalArgumentException("LimitConfig is invalid: " + this);
        }
    }

    CollectorStrategy.OverflowStrategy a();

    int b();

    default boolean c() {
        return d() > 0;
    }

    int d();

    default boolean isValid() {
        if (d() != -1 && !c()) {
            return false;
        }
        if (b() != -1) {
            return b() > 0;
        }
        return true;
    }
}
