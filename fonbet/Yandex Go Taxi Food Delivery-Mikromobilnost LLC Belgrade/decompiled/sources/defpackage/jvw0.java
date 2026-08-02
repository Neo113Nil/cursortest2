package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes6.dex */
public final class jvw0 extends kvw0 {
    public static final jvw0 INSTANCE = new jvw0();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new dvw0(1));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
