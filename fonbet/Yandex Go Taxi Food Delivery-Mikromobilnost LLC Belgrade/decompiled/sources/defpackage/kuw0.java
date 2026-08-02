package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes6.dex */
public final class kuw0 extends luw0 {
    public static final kuw0 INSTANCE = new kuw0();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new bhw0(29));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
