package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes5.dex */
public final class pde0 extends sde0 {
    public static final pde0 INSTANCE = new pde0();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new yud0(26));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pde0);
    }

    public final int hashCode() {
        return -511788162;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "ClarifyAddressOnMap";
    }
}
