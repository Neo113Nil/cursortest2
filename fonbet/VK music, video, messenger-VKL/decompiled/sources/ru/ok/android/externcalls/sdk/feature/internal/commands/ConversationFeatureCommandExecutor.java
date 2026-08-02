package ru.ok.android.externcalls.sdk.feature.internal.commands;

import java.util.Set;
import ru.ok.android.webrtc.features.CallFeature;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ConversationFeatureCommandExecutor.kt */
/* loaded from: classes9.dex */
public interface ConversationFeatureCommandExecutor {
    void enableFeatureForAll(CallFeature callFeature, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void enableFeatureForRoles(CallFeature callFeature, Set<? extends CallParticipant.Role> set, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);
}
