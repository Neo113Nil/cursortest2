package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes6.dex */
public final class lp extends er {
    public static final lp INSTANCE = new lp();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new pd(24));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lp);
    }

    public final int hashCode() {
        return -1113371231;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Deposit";
    }
}
