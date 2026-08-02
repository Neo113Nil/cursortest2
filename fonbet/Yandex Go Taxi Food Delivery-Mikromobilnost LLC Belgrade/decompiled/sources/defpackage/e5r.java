package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes6.dex */
public final class e5r extends hf40 {
    public static final e5r INSTANCE = new e5r();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new nsq(25));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
