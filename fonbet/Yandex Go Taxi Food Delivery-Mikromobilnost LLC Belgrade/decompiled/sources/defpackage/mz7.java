package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes14.dex */
public final class mz7 extends nz7 {
    public static final mz7 INSTANCE = new mz7();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new ij7(9));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
