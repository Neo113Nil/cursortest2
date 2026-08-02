package ru.ok.android.externcalls.sdk.feature.internal.commands;

import java.util.Set;
import kotlin.collections.EmptySet;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.feature.exception.ConversationFeatureException;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;
import ru.ok.android.webrtc.features.CallFeature;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.feature.CallFeatureCommandParamsCreator;
import xsna.cq;
import xsna.gzs;
import xsna.izs;
import xsna.qrj;
import xsna.rrj;
import xsna.ru1;
import xsna.s3q0;

/* compiled from: ConversationFeatureCommandExecutorImpl.kt */
/* loaded from: classes9.dex */
public final class ConversationFeatureCommandExecutorImpl implements ConversationFeatureCommandExecutor {
    private final CallFeatureCommandParamsCreator paramsCreator = new CallFeatureCommandParamsCreator();
    private final SignalingProvider signalingProvider;

    public ConversationFeatureCommandExecutorImpl(SignalingProvider signalingProvider) {
        this.signalingProvider = signalingProvider;
    }

    private final JSONObject createParamsOrPassExceptionToOnError(izs<? super Throwable, s3q0> izsVar, gzs<? extends JSONObject> gzsVar) {
        try {
            return gzsVar.invoke();
        } catch (JSONException e) {
            if (izsVar == null) {
                return null;
            }
            izsVar.invoke(new ConversationFeatureException("Can't create params for the method", e));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject enableFeatureForRoles$lambda$0(ConversationFeatureCommandExecutorImpl conversationFeatureCommandExecutorImpl, CallFeature callFeature, Set set) {
        return conversationFeatureCommandExecutorImpl.paramsCreator.createEnableFeatureParams(callFeature, set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableFeatureForRoles$lambda$1(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableFeatureForRoles$lambda$2(izs izsVar, JSONObject jSONObject) {
        if (izsVar != null) {
            izsVar.invoke(new ConversationFeatureException(cq.c("Command error ", jSONObject)));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutor
    public void enableFeatureForAll(CallFeature callFeature, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        enableFeatureForRoles(callFeature, EmptySet.b, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutor
    public void enableFeatureForRoles(CallFeature callFeature, Set<? extends CallParticipant.Role> set, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        JSONObject createParamsOrPassExceptionToOnError;
        Signaling signaling = SignalingProviderKt.get(this.signalingProvider, izsVar);
        if (signaling == null || (createParamsOrPassExceptionToOnError = createParamsOrPassExceptionToOnError(izsVar, new ru1(this, callFeature, set, 3))) == null) {
            return;
        }
        int i = 0;
        signaling.send(createParamsOrPassExceptionToOnError, new qrj(i, gzsVar), new rrj(i, izsVar));
    }
}
