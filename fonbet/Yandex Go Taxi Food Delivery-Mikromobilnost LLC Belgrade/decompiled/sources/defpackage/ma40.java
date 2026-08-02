package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes6.dex */
public final class ma40 extends ka40 {
    public static final ma40 INSTANCE = new ma40();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new e540(6));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
