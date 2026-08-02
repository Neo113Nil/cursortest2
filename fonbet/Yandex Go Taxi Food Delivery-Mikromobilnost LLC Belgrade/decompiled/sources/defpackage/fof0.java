package defpackage;

import com.yandex.go.shortcuts.dto.response.PromoMode;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class fof0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PromoMode.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
