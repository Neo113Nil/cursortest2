package com.yandex.fintechsdk.core.nfc.impl.internal;

import defpackage.g6u;
import defpackage.gbi0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.obi0;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.ymu;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.core.nfc.impl.internal.NfcControllerImpl$readBlocks$1", f = "NfcControllerImpl.kt", l = {JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class NfcControllerImpl$readBlocks$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<obi0> $keys;
    final /* synthetic */ sls $onError;
    final /* synthetic */ tls $onSuccess;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NfcControllerImpl$readBlocks$1(a aVar, List list, tls tlsVar, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$keys = list;
        this.$onSuccess = tlsVar;
        this.$onError = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NfcControllerImpl$readBlocks$1 nfcControllerImpl$readBlocks$1 = new NfcControllerImpl$readBlocks$1(this.this$0, this.$keys, this.$onSuccess, this.$onError, continuation);
        nfcControllerImpl$readBlocks$1.L$0 = obj;
        return nfcControllerImpl$readBlocks$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NfcControllerImpl$readBlocks$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0061  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            List<obi0> list = this.$keys;
            try {
                int i2 = 28;
                failure = new ymu(i2, aVar.b, aVar.e).y(list);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            tls tlsVar = this.$onSuccess;
            if (!(failure instanceof Result.Failure)) {
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                NfcControllerImpl$readBlocks$1$2$1 nfcControllerImpl$readBlocks$1$2$1 = new NfcControllerImpl$readBlocks$1$2$1(tlsVar, (gbi0) failure, null);
                this.L$0 = failure;
                this.label = 1;
                if (tje.k0(g6uVar, nfcControllerImpl$readBlocks$1$2$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj2 = failure;
            }
            sls slsVar = this.$onError;
            a aVar2 = this.this$0;
            if (Result.a(failure) != null) {
                slsVar.invoke();
                aVar2.c();
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        obj2 = this.L$0;
        b.b(obj);
        failure = obj2;
        sls slsVar2 = this.$onError;
        a aVar22 = this.this$0;
        if (Result.a(failure) != null) {
        }
        return zy11.a;
    }
}
