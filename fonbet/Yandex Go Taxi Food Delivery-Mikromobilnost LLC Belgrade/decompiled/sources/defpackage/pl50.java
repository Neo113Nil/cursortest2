package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class pl50 extends ql50 {
    public static final pl50 INSTANCE = new pl50();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new rk50(4));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
