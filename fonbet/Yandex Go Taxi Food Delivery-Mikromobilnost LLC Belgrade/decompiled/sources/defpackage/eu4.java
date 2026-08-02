package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes5.dex */
public final class eu4 implements fu4 {
    public static final eu4 INSTANCE = new eu4();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new tt4(1));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof eu4);
    }

    public final int hashCode() {
        return 764988406;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Unknown";
    }
}
