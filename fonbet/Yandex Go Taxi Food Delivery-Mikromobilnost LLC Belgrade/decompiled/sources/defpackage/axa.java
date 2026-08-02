package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class axa extends cxa {
    public static final axa INSTANCE = new axa();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new eua(10));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof axa);
    }

    public final int hashCode() {
        return -1497635062;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "ShowHiddenLinesAction";
    }
}
