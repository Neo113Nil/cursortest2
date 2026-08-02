package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes6.dex */
public final class nj40 extends tc30 {
    public static final nj40 INSTANCE = new nj40();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new ah40(2));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
