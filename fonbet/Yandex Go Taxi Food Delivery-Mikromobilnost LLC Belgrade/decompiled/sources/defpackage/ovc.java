package defpackage;

import com.yandex.go.overdraft.data.model.ComparisonType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class ovc {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ComparisonType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
