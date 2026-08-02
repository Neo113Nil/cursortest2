package com.yandex.messaging.internal.chat.info.settings.domain;

import com.yandex.messaging.base.rights.ChatRightsFlag;
import com.yandex.messaging.internal.entities.ChatBackendConfig;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8b;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ls8b;", "rights", "Lcom/yandex/messaging/internal/entities/ChatBackendConfig;", ConfigConstants.CONFIG, "", "<anonymous>", "(Ls8b;Lcom/yandex/messaging/internal/entities/ChatBackendConfig;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.chat.info.settings.domain.GetCanMarkAsImportantUseCase$run$1", f = "GetCanMarkAsImportantUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetCanMarkAsImportantUseCase$run$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetCanMarkAsImportantUseCase$run$1 getCanMarkAsImportantUseCase$run$1 = new GetCanMarkAsImportantUseCase$run$1(3, (Continuation) obj3);
        getCanMarkAsImportantUseCase$run$1.L$0 = (s8b) obj;
        getCanMarkAsImportantUseCase$run$1.L$1 = (ChatBackendConfig) obj2;
        return getCanMarkAsImportantUseCase$run$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        s8b s8bVar = (s8b) this.L$0;
        ChatBackendConfig chatBackendConfig = (ChatBackendConfig) this.L$1;
        s8bVar.getClass();
        ChatRightsFlag chatRightsFlag = ChatRightsFlag.MarkAsImportant;
        kgx kgxVar = s8b.d[10];
        return Boolean.valueOf(chatRightsFlag.c(s8bVar).booleanValue() && chatBackendConfig.a);
    }
}
