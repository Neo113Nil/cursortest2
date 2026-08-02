package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class m410 implements n410 {
    public static final m410 INSTANCE = new m410();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new kr00(21));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof m410);
    }

    public final int hashCode() {
        return 1263815016;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "None";
    }
}
