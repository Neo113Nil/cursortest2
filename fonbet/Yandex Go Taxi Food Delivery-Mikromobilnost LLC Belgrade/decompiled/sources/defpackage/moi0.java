package defpackage;

import com.yandex.go.promocodes.referral.api.net.dto.ReferralService;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class moi0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ReferralService.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
