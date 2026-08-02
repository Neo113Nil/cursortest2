package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.communications.model.widgets.ActionType;

@gsq0
/* loaded from: classes5.dex */
public final class j121 extends ckz0 {
    public static final j121 INSTANCE = new j121();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new jg11(20));

    @Override // defpackage.ckz0
    public final ActionType a() {
        return ActionType.UNKNOWN;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
