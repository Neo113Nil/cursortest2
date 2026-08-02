package com.yandex.go.settings.email;

import defpackage.avj0;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.settings.email.EmailSectionInteractor$deleteEmail$1", f = "EmailSectionInteractor.kt", l = {HProv.PP_CIPHEROID, HProv.PP_DHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class EmailSectionInteractor$deleteEmail$1 extends SuspendLambda implements wls {
    final /* synthetic */ Consumer<String> $onFailure;
    final /* synthetic */ Runnable $onSuccess;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailSectionInteractor$deleteEmail$1(c cVar, Runnable runnable, Consumer consumer, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$onSuccess = runnable;
        this.$onFailure = consumer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EmailSectionInteractor$deleteEmail$1(this.this$0, this.$onSuccess, this.$onFailure, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EmailSectionInteractor$deleteEmail$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        if (r8 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        c cVar;
        Object obj2;
        Runnable runnable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.settings.email.a aVar = this.this$0.a;
            this.label = 1;
            b = aVar.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                runnable = (Runnable) this.L$2;
                cVar = (c) this.L$1;
                obj2 = this.L$0;
                kotlin.b.b(obj);
                cVar.e = false;
                runnable.run();
                b = obj2;
                c cVar2 = this.this$0;
                Consumer<String> consumer = this.$onFailure;
                if (Result.a(b) != null) {
                    cVar2.e = false;
                    consumer.accept(((avj0) cVar2.b).h(kyh0.email_change_error_send_general));
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        cVar = this.this$0;
        Runnable runnable2 = this.$onSuccess;
        if (!(b instanceof Result.Failure)) {
            this.L$0 = b;
            this.L$1 = cVar;
            this.L$2 = runnable2;
            this.L$3 = null;
            this.label = 2;
            cVar.a.d();
            if (cVar.a(this) != coroutineSingletons) {
                obj2 = b;
                runnable = runnable2;
                cVar.e = false;
                runnable.run();
                b = obj2;
            }
            return coroutineSingletons;
        }
        c cVar22 = this.this$0;
        Consumer<String> consumer2 = this.$onFailure;
        if (Result.a(b) != null) {
        }
        return zy11.a;
    }
}
