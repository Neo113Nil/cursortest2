package defpackage;

import com.yandex.go.drive.unifiedpolling.dto.DriveOrderStatusDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class iem {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = DriveOrderStatusDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
