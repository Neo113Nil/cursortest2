package ru.ok.android.externcalls.sdk.signaling;

import ru.ok.android.externcalls.sdk.exceptions.ConversationNotPreparedException;
import ru.ok.android.webrtc.signaling.api.Signaling;
import xsna.izs;
import xsna.s3q0;

/* compiled from: SignalingProvider.kt */
/* loaded from: classes9.dex */
public final class SignalingProviderKt {
    public static final Signaling get(SignalingProvider signalingProvider, izs<? super Throwable, s3q0> izsVar) {
        if (signalingProvider.getSignaling() == null && izsVar != null) {
            izsVar.invoke(new ConversationNotPreparedException());
        }
        return signalingProvider.getSignaling();
    }
}
