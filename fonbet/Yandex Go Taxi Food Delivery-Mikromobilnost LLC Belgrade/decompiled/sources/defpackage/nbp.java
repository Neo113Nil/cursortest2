package defpackage;

import com.yandex.plus.pay.data.mb.dto.FamilyRoleDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class nbp {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = FamilyRoleDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
