package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes5.dex */
public final class drk0 extends krk0 {
    public static final drk0 INSTANCE = new drk0();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new apk0(2));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof drk0);
    }

    public final int hashCode() {
        return -1518358281;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "None";
    }
}
