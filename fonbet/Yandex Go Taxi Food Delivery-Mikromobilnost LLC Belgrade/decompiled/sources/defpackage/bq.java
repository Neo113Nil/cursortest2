package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes6.dex */
public final class bq extends er {
    public static final bq INSTANCE = new bq();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new pd(29));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bq);
    }

    public final int hashCode() {
        return 2006683413;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "None";
    }
}
