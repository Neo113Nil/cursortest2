package com.yandex.go.payments.cards.data.model;

import com.yandex.go.payments.cards.domain.exception.InvalidResponseException;
import defpackage.nc5;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.payments.cards.dto.VerificationStatus;

/* loaded from: classes13.dex */
public final class r {
    public static void a(nc5 nc5Var) {
        String e;
        String g;
        if (nc5Var == null) {
            throw new InvalidResponseException("Response does not contain verification");
        }
        if (nc5Var.getC() == null) {
            throw new InvalidResponseException("Verification does not contain status");
        }
        if (nc5Var.getC() == VerificationStatus.REQUIRED_3DS && (nc5Var.getC() == null || (e = nc5Var.getE()) == null || e.length() == 0 || (g = nc5Var.getG()) == null || g.length() == 0)) {
            throw new InvalidResponseException("Invalid 3ds parameters");
        }
        if (nc5Var.getC() == VerificationStatus.AMOUNT_EXPECTED) {
            if (nc5Var.getC() == null || nc5Var.getH() == null) {
                throw new InvalidResponseException("Invalid parameters for random amount");
            }
        }
    }

    public final KSerializer serializer() {
        return VerificationsStatusResponse$$serializer.INSTANCE;
    }
}
