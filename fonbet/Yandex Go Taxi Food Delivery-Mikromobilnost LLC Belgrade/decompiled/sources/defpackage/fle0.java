package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes2.dex */
public final class fle0 extends gle0 {
    public static final fle0 INSTANCE = new fle0();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(16));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
