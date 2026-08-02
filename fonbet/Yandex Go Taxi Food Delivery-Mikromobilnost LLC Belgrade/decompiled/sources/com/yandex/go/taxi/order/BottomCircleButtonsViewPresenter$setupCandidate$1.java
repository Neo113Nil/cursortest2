package com.yandex.go.taxi.order;

import android.graphics.Bitmap;
import defpackage.evu0;
import defpackage.g16;
import defpackage.mvg;
import defpackage.nfv;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wl70;
import defpackage.wls;
import defpackage.zb6;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lwl70;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.BottomCircleButtonsViewPresenter$setupCandidate$1", f = "BottomCircleButtonsViewPresenter.kt", l = {230, 237, 238}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class BottomCircleButtonsViewPresenter$setupCandidate$1 extends SuspendLambda implements wls {
    final /* synthetic */ zb6 $driverCandidateInfo;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomCircleButtonsViewPresenter$setupCandidate$1(zb6 zb6Var, p pVar, Continuation continuation) {
        super(2, continuation);
        this.$driverCandidateInfo = zb6Var;
        this.this$0 = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BottomCircleButtonsViewPresenter$setupCandidate$1 bottomCircleButtonsViewPresenter$setupCandidate$1 = new BottomCircleButtonsViewPresenter$setupCandidate$1(this.$driverCandidateInfo, this.this$0, continuation);
        bottomCircleButtonsViewPresenter$setupCandidate$1.L$0 = obj;
        return bottomCircleButtonsViewPresenter$setupCandidate$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BottomCircleButtonsViewPresenter$setupCandidate$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d4, code lost:
    
        if (r0.emit(r7, r14) != r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        wl70 wl70Var;
        int i;
        wl70 wl70Var2;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            str = this.$driverCandidateInfo.c;
            boolean z = ((str == null || evu0.J(str)) ? (char) 1 : (char) 0) ^ 1;
            zb6 zb6Var = this.$driverCandidateInfo;
            String str2 = zb6Var.a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = zb6Var.b;
            if (str3 == null) {
                str3 = "";
            }
            wl70 wl70Var3 = new wl70(str2, str3, z, null, zb6Var.d);
            this.L$0 = vprVar;
            this.L$1 = str;
            this.L$2 = wl70Var3;
            this.I$0 = z ? 1 : 0;
            this.label = 1;
            if (vprVar.emit(wl70Var3, this) != coroutineSingletons) {
                wl70Var = wl70Var3;
                i = z ? 1 : 0;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            i = this.I$0;
            wl70Var = (wl70) this.L$2;
            str = (String) this.L$1;
            kotlin.b.b(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            i = this.I$0;
            wl70Var2 = (wl70) this.L$2;
            kotlin.b.b(obj);
            wl70 wl70Var4 = new wl70(wl70Var2.a, wl70Var2.b, false, (Bitmap) obj, wl70Var2.e);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.I$0 = i;
            this.label = 3;
        }
        if (i != 0) {
            g16 e = this.this$0.C.b().b(str).e(nfv.a);
            int i3 = this.this$0.I;
            g16 g = e.g(i3, i3);
            this.L$0 = vprVar;
            this.L$1 = null;
            this.L$2 = wl70Var;
            this.I$0 = i;
            this.label = 2;
            obj = ru.yandex.taxi.utils.a.b(g, this);
            if (obj != coroutineSingletons) {
                wl70Var2 = wl70Var;
                wl70 wl70Var42 = new wl70(wl70Var2.a, wl70Var2.b, false, (Bitmap) obj, wl70Var2.e);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = i;
                this.label = 3;
            }
            return coroutineSingletons;
        }
        return zy11.a;
    }
}
