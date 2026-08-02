package com.yandex.go.navigator.alt_select;

import com.yandex.go.address.models.Address;
import com.yandex.mapkit.geometry.Point;
import defpackage.dh00;
import defpackage.hv1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oe50;
import defpackage.pe50;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.alt_select.AltSelectPresenter$focusToSourceAddress$1", f = "AltSelectPresenter.kt", l = {405, 407}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AltSelectPresenter$focusToSourceAddress$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AltSelectPresenter$focusToSourceAddress$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AltSelectPresenter$focusToSourceAddress$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AltSelectPresenter$focusToSourceAddress$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (com.yandex.go.navigator.a.c(r10, null, r9, 7) == r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Point point;
        e eVar;
        oe50 oe50Var;
        Address address;
        zzs B;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pe50 c = this.this$0.U.c();
            point = (c == null || (oe50Var = c.a) == null || (address = oe50Var.c) == null || (B = address.B()) == null) ? null : new Point(B.a, B.b);
            e eVar2 = this.this$0;
            if (point != null) {
                hv1 hv1Var = (hv1) eVar2.Dg();
                this.L$0 = eVar2;
                this.L$1 = point;
                this.label = 1;
                if (hv1Var.awaitFocusRectReady(this) != coroutineSingletons) {
                    eVar = eVar2;
                    dh00.a(eVar.T, point, 17.0f, null, null, HProv.PP_SAME_MEDIA);
                }
            } else {
                com.yandex.go.navigator.a aVar = eVar2.K;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            Point point2 = (Point) this.L$1;
            eVar = (e) this.L$0;
            kotlin.b.b(obj);
            point = point2;
            dh00.a(eVar.T, point, 17.0f, null, null, HProv.PP_SAME_MEDIA);
        } else {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
