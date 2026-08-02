package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes9.dex */
public final class p9r extends b9r {
    public static final p9r INSTANCE = new p9r();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new n6r(11));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof p9r);
    }

    public final int hashCode() {
        return -840400019;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "FingerprintUnknown";
    }
}
