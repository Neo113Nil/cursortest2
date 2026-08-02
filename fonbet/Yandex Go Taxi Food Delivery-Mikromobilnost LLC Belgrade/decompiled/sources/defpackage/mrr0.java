package defpackage;

import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsDisplayContextDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class mrr0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SharingPersonalGoalsDisplayContextDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
