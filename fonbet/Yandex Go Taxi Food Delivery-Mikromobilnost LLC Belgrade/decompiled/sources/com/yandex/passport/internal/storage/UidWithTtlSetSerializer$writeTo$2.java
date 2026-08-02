package com.yandex.passport.internal.storage;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.p53;
import defpackage.sbx;
import defpackage.tse;
import defpackage.uza;
import defpackage.wls;
import defpackage.zy11;
import java.io.OutputStream;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.storage.UidWithTtlSetSerializer$writeTo$2", f = "UidWithTtlSetSerializer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class UidWithTtlSetSerializer$writeTo$2 extends SuspendLambda implements wls {
    final /* synthetic */ OutputStream $output;
    final /* synthetic */ Set<l> $t;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UidWithTtlSetSerializer$writeTo$2(OutputStream outputStream, Set set, Continuation continuation) {
        super(2, continuation);
        this.$output = outputStream;
        this.$t = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UidWithTtlSetSerializer$writeTo$2(this.$output, this.$t, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        UidWithTtlSetSerializer$writeTo$2 uidWithTtlSetSerializer$writeTo$2 = (UidWithTtlSetSerializer$writeTo$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        uidWithTtlSetSerializer$writeTo$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$output.write(sbx.d.c(this.$t, new p53(l.Companion.serializer(), 1)).getBytes(uza.a));
        return zy11.a;
    }
}
