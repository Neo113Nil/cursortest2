package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.preorder.suggested.menu.EntryPoint;

/* loaded from: classes6.dex */
public final class d4o {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = EntryPoint.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
