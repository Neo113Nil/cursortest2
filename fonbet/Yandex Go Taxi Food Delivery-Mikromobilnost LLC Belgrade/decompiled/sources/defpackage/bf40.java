package defpackage;

import defpackage.qe40;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes6.dex */
public final class bf40 extends qe40.a {
    public static final bf40 INSTANCE = new bf40();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new e540(14));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
