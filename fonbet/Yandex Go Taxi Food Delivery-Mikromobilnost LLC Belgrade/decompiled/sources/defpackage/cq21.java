package defpackage;

import com.yandex.go.data.entities.network.UserPhotoActionTypeDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class cq21 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = UserPhotoActionTypeDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
