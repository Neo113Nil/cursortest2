package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes10.dex */
public final class crt0 extends drt0 {
    public static final crt0 INSTANCE = new crt0();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new s7s0(21));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
