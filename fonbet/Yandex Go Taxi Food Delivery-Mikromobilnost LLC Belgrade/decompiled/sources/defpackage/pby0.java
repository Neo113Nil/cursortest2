package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes14.dex */
public final class pby0 extends uby0 {
    public static final pby0 INSTANCE = new pby0();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new y6y0(12));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
