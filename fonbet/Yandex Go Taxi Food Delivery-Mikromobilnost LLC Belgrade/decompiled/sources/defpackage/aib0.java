package defpackage;

import com.yandex.go.pickup_from_photo.data.model.PhotoRecognitionStatus;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class aib0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PhotoRecognitionStatus.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
