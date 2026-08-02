package com.yandex.passport.internal.storage;

import androidx.datastore.core.CorruptionException;
import defpackage.cvu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p53;
import defpackage.rzo;
import defpackage.sbx;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.serialization.SerializationException;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lcom/yandex/passport/internal/storage/l;", "<anonymous>", "(Ltse;)Ljava/util/Set;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.storage.UidWithTtlSetSerializer$readFrom$2", f = "UidWithTtlSetSerializer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class UidWithTtlSetSerializer$readFrom$2 extends SuspendLambda implements wls {
    final /* synthetic */ InputStream $input;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UidWithTtlSetSerializer$readFrom$2(InputStream inputStream, Continuation continuation) {
        super(2, continuation);
        this.$input = inputStream;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UidWithTtlSetSerializer$readFrom$2(this.$input, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UidWithTtlSetSerializer$readFrom$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        try {
            return sbx.d.b(new p53(l.Companion.serializer(), 1), cvu0.q(rzo.R(this.$input)));
        } catch (SerializationException e) {
            throw new CorruptionException("Unable to read Set<UidWithTtl>.", e);
        }
    }
}
