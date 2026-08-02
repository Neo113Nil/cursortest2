package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes14.dex */
public final class iz7 extends nz7 {
    public static final iz7 INSTANCE = new iz7();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new ij7(7));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
