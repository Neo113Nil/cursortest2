package com.yandex.go.scooters.qr.ui;

import defpackage.mvg;
import defpackage.npo0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zgz;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.scooters.domain.model.ScootersPermissionsNotGranted;
import ru.yandex.taxi.scooters.domain.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.qr.ui.ScootersQrPresenter$start$1", f = "ScootersQrPresenter.kt", l = {214, 215, 217, HProv.PP_AUTH_INFO}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersQrPresenter$start$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersQrPresenter$start$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersQrPresenter$start$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersQrPresenter$start$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
    
        if (com.yandex.go.scooters.qr.ui.e.Kg(r1, r7) == r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        e eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            if (!(th instanceof ScootersPermissionsNotGranted)) {
                zgz.a(null, th);
            }
        }
        if (i == 0) {
            kotlin.b.b(obj);
            if (!this.this$0.E.b.a.c()) {
                ((npo0) this.this$0.Dg()).V();
            }
            eVar = this.this$0;
            o oVar = eVar.E;
            this.L$0 = eVar;
            this.label = 1;
            if (oVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            eVar = (e) this.L$0;
            kotlin.b.b(obj);
        } else if (i == 2) {
            eVar = (e) this.L$0;
            kotlin.b.b(obj);
            ((npo0) eVar.Dg()).startCamera();
            this.L$0 = eVar;
            this.label = 3;
            if (kotlinx.coroutines.a.i(100L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            this.L$0 = null;
            this.label = 4;
        } else {
            if (i != 3) {
                if (i == 4) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar = (e) this.L$0;
            kotlin.b.b(obj);
            this.L$0 = null;
            this.label = 4;
        }
        this.L$0 = eVar;
        this.label = 2;
        if (e.Lg(eVar, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        ((npo0) eVar.Dg()).startCamera();
        this.L$0 = eVar;
        this.label = 3;
        if (kotlinx.coroutines.a.i(100L, this) == coroutineSingletons) {
        }
        this.L$0 = null;
        this.label = 4;
    }
}
