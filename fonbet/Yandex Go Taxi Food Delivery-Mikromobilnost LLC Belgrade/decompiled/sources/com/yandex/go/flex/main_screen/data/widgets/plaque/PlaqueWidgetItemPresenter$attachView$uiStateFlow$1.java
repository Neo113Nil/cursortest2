package com.yandex.go.flex.main_screen.data.widgets.plaque;

import com.yandex.go.flex.main_screen.api.domain.SuperappTopPlaqueType;
import com.yandex.go.flex.main_screen.domain.h;
import com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.f;
import com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.x;
import defpackage.ceu0;
import defpackage.f4w0;
import defpackage.fnb0;
import defpackage.g92;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rtc0;
import defpackage.stc0;
import defpackage.tig0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lh4w0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.data.widgets.plaque.PlaqueWidgetItemPresenter$attachView$uiStateFlow$1", f = "PlaqueWidgetItemPresenter.kt", l = {36, 50}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class PlaqueWidgetItemPresenter$attachView$uiStateFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ stc0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaqueWidgetItemPresenter$attachView$uiStateFlow$1(stc0 stc0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = stc0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlaqueWidgetItemPresenter$attachView$uiStateFlow$1 plaqueWidgetItemPresenter$attachView$uiStateFlow$1 = new PlaqueWidgetItemPresenter$attachView$uiStateFlow$1(this.this$0, continuation);
        plaqueWidgetItemPresenter$attachView$uiStateFlow$1.L$0 = obj;
        return plaqueWidgetItemPresenter$attachView$uiStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaqueWidgetItemPresenter$attachView$uiStateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r6, r0, r7) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        if (r8 == r1) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar = this.this$0.B;
            this.L$0 = vprVar;
            this.label = 1;
            obj = hVar.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        int i2 = rtc0.a[((SuperappTopPlaqueType) obj).ordinal()];
        if (i2 == 1) {
            g92Var = new g92(2, f4w0.a);
        } else if (i2 == 2) {
            tig0 tig0Var = this.this$0.z;
            g92Var = new x(((f) tig0Var.a).a(), new fnb0(16), tig0Var);
        } else {
            if (i2 != 3) {
                w511.b();
                return null;
            }
            tig0 tig0Var2 = this.this$0.z;
            g92Var = new x(((f) tig0Var2.a).a(), new ceu0(5), tig0Var2);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
    }
}
