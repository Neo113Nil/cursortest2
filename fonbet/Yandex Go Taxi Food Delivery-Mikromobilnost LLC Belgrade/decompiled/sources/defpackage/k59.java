package defpackage;

import com.yandex.go.places.models.data.entities.network.CategoryFilterType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class k59 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CategoryFilterType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
