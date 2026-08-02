package com.yandex.go.safety.center;

import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.model.PresentationContact$Mode;
import defpackage.jst;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.swe0;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.exception.GeneralApiException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.SafetyCenterProvider$updateContacts$1", f = "SafetyCenterProvider.kt", l = {362, 363}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterProvider$updateContacts$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<swe0> $contacts;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterProvider$updateContacts$1(j jVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$contacts = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterProvider$updateContacts$1(this.this$0, this.$contacts, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterProvider$updateContacts$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (defpackage.tje.k0(r1, r6, r8) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        j jVar;
        j jVar2;
        List<swe0> list;
        Throwable th;
        j jVar3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jVar3 = (j) this.L$0;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    return zy11.a;
                }
                j jVar4 = (j) this.L$2;
                list = (List) this.L$1;
                jVar2 = (j) this.L$0;
                try {
                    kotlin.b.b(obj);
                    jVar = jVar4;
                } catch (Throwable th3) {
                    th = th3;
                    jVar3 = jVar4;
                }
                jVar3.getClass();
                jst.e.k(th, "Can not update trusted contacts");
                n0 n0Var = jVar3.v;
                RuntimeException b = jVar3.b.b(th);
                GeneralApiException generalApiException = b instanceof GeneralApiException ? (GeneralApiException) b : null;
                String message = generalApiException != null ? generalApiException.getMessage() : null;
                if (message == null || message.length() == 0) {
                    n0Var.g(jVar3.f.a(SafetyCenterExperiment.L10nKey.ERROR_SECTION_NOT_LOADED));
                } else {
                    n0Var.g(message);
                }
                jVar3.i(PresentationContact$Mode.REMOVING);
                return zy11.a;
            }
            kotlin.b.b(obj);
            jVar = this.this$0;
            List<swe0> list2 = this.$contacts;
            try {
                ru.yandex.taxi.launch.c cVar = jVar.e;
                this.L$0 = jVar;
                this.L$1 = list2;
                this.L$2 = jVar;
                this.label = 1;
                if (cVar.d(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                jVar2 = jVar;
                list = list2;
            } catch (Throwable th4) {
                j jVar5 = jVar;
                th = th4;
                jVar3 = jVar5;
            }
            jVar2.j.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            SafetyCenterProvider$updateContacts$1$1$1 safetyCenterProvider$updateContacts$1$1$1 = new SafetyCenterProvider$updateContacts$1$1$1(jVar2, list, null);
            this.L$0 = jVar;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
