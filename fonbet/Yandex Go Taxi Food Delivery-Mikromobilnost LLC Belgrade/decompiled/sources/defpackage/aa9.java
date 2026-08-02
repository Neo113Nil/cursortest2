package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes.dex */
public final class aa9 extends kr {
    public static final aa9 INSTANCE = new aa9();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new y99(0));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
