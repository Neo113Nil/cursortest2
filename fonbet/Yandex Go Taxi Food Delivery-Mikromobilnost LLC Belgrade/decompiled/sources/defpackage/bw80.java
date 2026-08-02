package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes2.dex */
public final class bw80 implements pw80 {
    public static final bw80 INSTANCE = new bw80();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new aw80(0));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bw80);
    }

    public final int hashCode() {
        return -1570506669;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "TreasuryStateReceived";
    }
}
