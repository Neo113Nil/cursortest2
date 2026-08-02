package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class aka implements bka {
    public static final aka INSTANCE = new aka();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new nba(25));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof aka);
    }

    public final int hashCode() {
        return -1411824082;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Unknown";
    }
}
