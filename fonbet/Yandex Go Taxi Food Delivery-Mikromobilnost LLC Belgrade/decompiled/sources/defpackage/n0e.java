package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.communications.model.ConfigurationType;

@gsq0
/* loaded from: classes6.dex */
public final class n0e extends t0e {
    public static final n0e INSTANCE = new n0e();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new kpd(28));

    @Override // defpackage.t0e
    public final ConfigurationType a() {
        return ConfigurationType.MODAL_WINDOW;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
