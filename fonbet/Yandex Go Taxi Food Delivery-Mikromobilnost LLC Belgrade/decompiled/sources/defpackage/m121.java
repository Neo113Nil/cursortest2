package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.masstransit.trains.checkout.model.ModalButtonResultType;

@gsq0
/* loaded from: classes6.dex */
public final class m121 extends sx20 {
    public static final m121 INSTANCE = new m121();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new jg11(22));

    @Override // defpackage.sx20
    public final ModalButtonResultType a() {
        return ModalButtonResultType.UNKNOWN;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
