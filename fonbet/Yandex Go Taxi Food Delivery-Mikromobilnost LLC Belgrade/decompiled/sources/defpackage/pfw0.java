package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes8.dex */
public final class pfw0 extends mjm0 {
    public static final pfw0 INSTANCE = new pfw0();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new w5w0(11));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
