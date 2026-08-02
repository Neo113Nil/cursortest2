package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes9.dex */
public final class aiu extends kr {
    public static final aiu INSTANCE = new aiu();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new mvt(25));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
