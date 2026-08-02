package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eatskit.dto.GeoPointSource;

/* loaded from: classes5.dex */
public final class c0t {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = GeoPointSource.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
