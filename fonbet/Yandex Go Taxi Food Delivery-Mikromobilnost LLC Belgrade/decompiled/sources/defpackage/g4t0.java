package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes9.dex */
public final class g4t0 extends x4t0 {
    public static final g4t0 INSTANCE = new g4t0();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new s7s0(10));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
