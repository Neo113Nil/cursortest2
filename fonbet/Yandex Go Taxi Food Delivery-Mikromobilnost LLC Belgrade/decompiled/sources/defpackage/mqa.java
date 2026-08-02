package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class mqa extends qqa {
    public static final mqa INSTANCE = new mqa();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new fna(12));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mqa);
    }

    public final int hashCode() {
        return -2022029060;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "OpenTariffsActionDto";
    }
}
