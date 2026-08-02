package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes14.dex */
public final class kz7 extends nz7 {
    public static final kz7 INSTANCE = new kz7();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new ij7(8));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
