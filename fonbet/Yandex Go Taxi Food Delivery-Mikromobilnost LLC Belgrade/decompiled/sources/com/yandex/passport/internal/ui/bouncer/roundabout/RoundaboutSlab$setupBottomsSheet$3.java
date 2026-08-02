package com.yandex.passport.internal.ui.bouncer.roundabout;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.spb1;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.roundabout.RoundaboutSlab$setupBottomsSheet$3", f = "RoundaboutSlab.kt", l = {MSException.ERROR_BUSY}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RoundaboutSlab$setupBottomsSheet$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundaboutSlab$setupBottomsSheet$3(v vVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RoundaboutSlab$setupBottomsSheet$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RoundaboutSlab$setupBottomsSheet$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            long g = spb1.g(0, 100);
            this.label = 1;
            if (kotlinx.coroutines.a.i(g, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        v vVar = this.this$0;
        BottomSheetBehavior bottomSheetBehavior = vVar.H.w;
        bottomSheetBehavior.W(3);
        bottomSheetBehavior.v(new u(vVar));
        return zy11.a;
    }
}
