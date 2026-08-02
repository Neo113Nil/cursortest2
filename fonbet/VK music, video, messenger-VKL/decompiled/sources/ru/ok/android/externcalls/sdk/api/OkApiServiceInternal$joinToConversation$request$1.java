package ru.ok.android.externcalls.sdk.api;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.common.BasicApiRequest;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: OkApiServiceInternal.kt */
/* loaded from: classes9.dex */
public final /* synthetic */ class OkApiServiceInternal$joinToConversation$request$1 extends FunctionReferenceImpl implements wzs<StartCallApiParams, BasicApiRequest.Builder, s3q0> {
    public OkApiServiceInternal$joinToConversation$request$1(Object obj) {
        super(2, obj, OkApiService.class, "addJoinToConversationParams", "addJoinToConversationParams(Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;Lru/ok/android/api/common/BasicApiRequest$Builder;)V", 0);
    }

    @Override // xsna.wzs
    public /* bridge */ /* synthetic */ s3q0 invoke(StartCallApiParams startCallApiParams, BasicApiRequest.Builder builder) {
        invoke2(startCallApiParams, builder);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(StartCallApiParams startCallApiParams, BasicApiRequest.Builder builder) {
        ((OkApiService) this.receiver).addJoinToConversationParams(startCallApiParams, builder);
    }
}
