package com.yandex.passport.internal.ui.sloth.ebs;

import defpackage.w511;
import defpackage.ymi0;

/* loaded from: classes2.dex */
public final class d0 implements ymi0 {
    public static final d0 a = new d0();

    @Override // defpackage.ymi0
    public final Object a(Object obj, Object obj2) {
        BiometricVerificationViewModel$State biometricVerificationViewModel$State = (BiometricVerificationViewModel$State) obj;
        c0 c0Var = (c0) obj2;
        if (c0Var instanceof z) {
            z zVar = (z) c0Var;
            return BiometricVerificationViewModel$State.copy$default(biometricVerificationViewModel$State, zVar.a, 0, null, null, zVar.b, false, 46, null);
        }
        if (c0Var instanceof x) {
            return BiometricVerificationViewModel$State.copy$default(biometricVerificationViewModel$State, null, biometricVerificationViewModel$State.getCountRetryingTrackIdRequests() + 1, null, null, null, false, 61, null);
        }
        if (c0Var instanceof w) {
            return BiometricVerificationViewModel$State.copy$default(biometricVerificationViewModel$State, null, 0, null, null, null, false, 61, null);
        }
        if (c0Var instanceof a0) {
            return BiometricVerificationViewModel$State.copy$default(biometricVerificationViewModel$State, null, 0, Integer.valueOf(((a0) c0Var).a), null, null, false, 59, null);
        }
        if (c0Var instanceof b0) {
            return BiometricVerificationViewModel$State.copy$default(biometricVerificationViewModel$State, null, 0, null, ((b0) c0Var).a, null, false, 55, null);
        }
        if (c0Var instanceof y) {
            return BiometricVerificationViewModel$State.copy$default(biometricVerificationViewModel$State, null, 0, null, null, null, true, 31, null);
        }
        w511.b();
        return null;
    }
}
