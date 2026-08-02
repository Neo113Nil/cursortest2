package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class m521 extends x251 {
    public static final m521 INSTANCE = new m521();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new z121(5));

    @Override // defpackage.x251
    /* renamed from: a */
    public final String getB() {
        return "";
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
