package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.communications.model.ConfigurationType;

@gsq0
/* loaded from: classes6.dex */
public final class e0e extends t0e {
    public static final e0e INSTANCE = new e0e();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new kpd(26));

    @Override // defpackage.t0e
    public final ConfigurationType a() {
        return ConfigurationType.BUBBLE;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
