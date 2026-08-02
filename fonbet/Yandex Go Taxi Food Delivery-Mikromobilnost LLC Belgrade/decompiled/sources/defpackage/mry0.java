package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.TextMetaStyle;

/* loaded from: classes9.dex */
public final class mry0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TextMetaStyle.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
