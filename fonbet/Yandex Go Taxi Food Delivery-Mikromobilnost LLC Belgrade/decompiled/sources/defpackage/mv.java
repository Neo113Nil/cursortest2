package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes8.dex */
public final class mv implements wv {
    public static final mv INSTANCE = new mv();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new ar(9));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mv);
    }

    public final int hashCode() {
        return -2022041916;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "JustInteract";
    }
}
