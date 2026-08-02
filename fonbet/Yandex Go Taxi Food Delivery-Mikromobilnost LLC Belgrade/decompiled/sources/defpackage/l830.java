package defpackage;

import com.yandex.go.morphlex.data.dto.MorphlexScreenPresentType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class l830 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MorphlexScreenPresentType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
