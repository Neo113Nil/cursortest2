package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.models.CopySource;

/* loaded from: classes9.dex */
public final class bpe {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CopySource.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
