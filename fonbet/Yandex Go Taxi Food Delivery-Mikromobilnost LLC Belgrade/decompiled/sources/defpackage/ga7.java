package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes6.dex */
public final class ga7 extends ha7 {
    public static final ga7 INSTANCE = new ga7();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new rm6(25));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ga7);
    }

    public final int hashCode() {
        return -2116586800;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "None";
    }
}
