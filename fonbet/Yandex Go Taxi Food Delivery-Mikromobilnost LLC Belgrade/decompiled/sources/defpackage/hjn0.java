package defpackage;

import com.yandex.go.scooters.driver_license.data.model.ScootersDriverLicenseVerificationStatusDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class hjn0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScootersDriverLicenseVerificationStatusDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
