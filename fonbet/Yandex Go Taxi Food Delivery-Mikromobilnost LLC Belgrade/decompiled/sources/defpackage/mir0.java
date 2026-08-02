package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes8.dex */
public final class mir0 implements nir0 {
    public static final mir0 INSTANCE = new mir0();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new dwq0(14));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mir0);
    }

    public final int hashCode() {
        return -733093548;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "HalfHeight";
    }
}
