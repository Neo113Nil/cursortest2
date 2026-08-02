package defpackage;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import ru.yandex.alice.cuttlefish.services.features_limiter.proto.api.quark.webchat.EDecision;

/* loaded from: classes4.dex */
public final class nan extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        EDecision.Companion.getClass();
        if (i == 0) {
            return EDecision.D_UNKNOWN;
        }
        if (i == 1) {
            return EDecision.D_ALLOW;
        }
        if (i == 2) {
            return EDecision.D_TOO_MANY_REQUESTS;
        }
        if (i != 3) {
            return null;
        }
        return EDecision.D_NOT_AWAILABLE_FOR_USER;
    }
}
