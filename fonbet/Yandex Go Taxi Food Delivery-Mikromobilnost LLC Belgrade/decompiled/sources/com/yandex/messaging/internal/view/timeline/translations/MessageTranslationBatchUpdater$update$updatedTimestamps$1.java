package com.yandex.messaging.internal.view.timeline.translations;

import com.yandex.messaging.internal.translator.j;
import defpackage.m8g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s020;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls020;", "", "", "<anonymous>", "(Ls020;)Ljava/util/Set;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.timeline.translations.MessageTranslationBatchUpdater$update$updatedTimestamps$1", f = "MessageTranslationBatchUpdater.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class MessageTranslationBatchUpdater$update$updatedTimestamps$1 extends SuspendLambda implements wls {
    final /* synthetic */ Set<Long> $timestampsToUpdate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageTranslationBatchUpdater$update$updatedTimestamps$1(Set set, Continuation continuation) {
        super(2, continuation);
        this.$timestampsToUpdate = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MessageTranslationBatchUpdater$update$updatedTimestamps$1 messageTranslationBatchUpdater$update$updatedTimestamps$1 = new MessageTranslationBatchUpdater$update$updatedTimestamps$1(this.$timestampsToUpdate, continuation);
        messageTranslationBatchUpdater$update$updatedTimestamps$1.L$0 = obj;
        return messageTranslationBatchUpdater$update$updatedTimestamps$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MessageTranslationBatchUpdater$update$updatedTimestamps$1) create((s020) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        j jVar = (j) ((m8g) ((s020) this.L$0)).P.get();
        Set<Long> set = this.$timestampsToUpdate;
        this.label = 1;
        Object b = jVar.b(set, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
