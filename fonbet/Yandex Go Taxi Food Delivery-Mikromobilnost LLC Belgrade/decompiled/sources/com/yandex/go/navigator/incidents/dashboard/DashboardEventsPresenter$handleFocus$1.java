package com.yandex.go.navigator.incidents.dashboard;

import com.yandex.mapkit.geometry.Point;
import defpackage.ah00;
import defpackage.gh00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sig;
import defpackage.tse;
import defpackage.vjg;
import defpackage.vmz;
import defpackage.wjg;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.incidents.dashboard.DashboardEventsPresenter$handleFocus$1", f = "DashboardIncidentsPresenter.kt", l = {HProv.ALG_SID_SHA3_224, HProv.ALG_SID_SHA3_384}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DashboardEventsPresenter$handleFocus$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ sig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardEventsPresenter$handleFocus$1(sig sigVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sigVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DashboardEventsPresenter$handleFocus$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DashboardEventsPresenter$handleFocus$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (com.yandex.go.navigator.a.c(r7, null, r6, 7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        if (r7.awaitFocusRectReady(r6) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            vjg vjgVar = (vjg) this.this$0.Dg();
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        sig sigVar = this.this$0;
        wjg wjgVar = sigVar.z;
        if (wjgVar.c) {
            com.yandex.go.navigator.a aVar = sigVar.E;
            this.label = 2;
        } else {
            ah00 ah00Var = sigVar.D;
            Point point = wjgVar.a;
            gh00 gh00Var = (gh00) ah00Var;
            gh00Var.getClass();
            gh00Var.q(new vmz(7, gh00Var, point));
        }
        return zy11.a;
    }
}
