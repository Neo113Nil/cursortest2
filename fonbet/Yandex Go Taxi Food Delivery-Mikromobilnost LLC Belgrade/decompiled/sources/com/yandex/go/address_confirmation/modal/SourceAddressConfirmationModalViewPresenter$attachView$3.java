package com.yandex.go.address_confirmation.modal;

import android.graphics.Bitmap;
import defpackage.g16;
import defpackage.mob0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.rbt0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address_confirmation.modal.SourceAddressConfirmationModalViewPresenter$attachView$3", f = "SourceAddressConfirmationModalViewPresenter.kt", l = {108, 112}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SourceAddressConfirmationModalViewPresenter$attachView$3 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceAddressConfirmationModalViewPresenter$attachView$3(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SourceAddressConfirmationModalViewPresenter$attachView$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SourceAddressConfirmationModalViewPresenter$attachView$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r7 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        d dVar;
        pz40 pz40Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g16 b = this.this$0.L.b().b(this.this$0.K.a.d());
            this.label = 1;
            obj = ru.yandex.taxi.utils.a.b(b, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pz40Var = (pz40) this.L$3;
                bitmap = (Bitmap) this.L$2;
                dVar = (d) this.L$0;
                kotlin.b.b(obj);
                rbt0 rbt0Var = new rbt0(bitmap, (String) obj, dVar.K.a.e());
                r0 r0Var = (r0) pz40Var;
                r0Var.getClass();
                r0Var.m(null, rbt0Var);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        bitmap = (Bitmap) obj;
        if (bitmap != null) {
            d dVar2 = this.this$0;
            r0 r0Var2 = dVar2.Q;
            mob0 mob0Var = dVar2.K;
            this.L$0 = dVar2;
            this.L$1 = null;
            this.L$2 = bitmap;
            this.L$3 = r0Var2;
            this.label = 2;
            String a = mob0Var.a();
            if (a != coroutineSingletons) {
                obj = a;
                dVar = dVar2;
                pz40Var = r0Var2;
                rbt0 rbt0Var2 = new rbt0(bitmap, (String) obj, dVar.K.a.e());
                r0 r0Var3 = (r0) pz40Var;
                r0Var3.getClass();
                r0Var3.m(null, rbt0Var2);
            }
            return coroutineSingletons;
        }
        return zy11.a;
    }
}
