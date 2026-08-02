package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class bxa extends cxa {
    public static final bxa INSTANCE = new bxa();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new eua(11));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bxa);
    }

    public final int hashCode() {
        return 959136710;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Unknown";
    }
}
