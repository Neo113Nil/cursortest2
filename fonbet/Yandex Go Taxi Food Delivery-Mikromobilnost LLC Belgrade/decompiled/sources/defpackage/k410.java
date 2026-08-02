package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class k410 implements n410 {
    public static final k410 INSTANCE = new k410();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new kr00(20));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof k410);
    }

    public final int hashCode() {
        return 1957057639;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "ActivationWithOnboarding";
    }
}
