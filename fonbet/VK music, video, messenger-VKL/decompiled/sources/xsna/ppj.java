package xsna;

import java.util.List;
import kotlinx.serialization.KSerializer;

/* compiled from: SerializersModule.kt */
/* loaded from: classes8.dex */
public abstract class ppj {

    /* compiled from: SerializersModule.kt */
    public static final class a extends ppj {
        @Override // xsna.ppj
        public final KSerializer<?> a(List<? extends KSerializer<?>> list) {
            return null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }
    }

    /* compiled from: SerializersModule.kt */
    public static final class b extends ppj {
        @Override // xsna.ppj
        public final KSerializer<?> a(List<? extends KSerializer<?>> list) {
            throw null;
        }
    }

    public abstract KSerializer<?> a(List<? extends KSerializer<?>> list);
}
