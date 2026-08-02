package defpackage;

import com.yandex.go.superapp.unified_polling.data.dto.TrackingsGroupMethodDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class l801 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TrackingsGroupMethodDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
