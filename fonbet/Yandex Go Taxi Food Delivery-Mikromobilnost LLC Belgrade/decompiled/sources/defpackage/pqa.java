package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class pqa extends qqa {
    public static final pqa INSTANCE = new pqa();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new fna(14));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pqa);
    }

    public final int hashCode() {
        return 1312064370;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Unknown";
    }
}
