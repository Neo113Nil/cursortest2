package defpackage;

import com.yandex.go.layers.api.model.params.Mode;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class a430 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Mode.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
