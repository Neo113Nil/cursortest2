package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes6.dex */
public final class evw0 extends kvw0 {
    public static final evw0 INSTANCE = new evw0();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new dvw0(0));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
