package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class nqa extends qqa {
    public static final nqa INSTANCE = new nqa();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new fna(13));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nqa);
    }

    public final int hashCode() {
        return -1325038308;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "PartnerSubscriptionActionDto";
    }
}
