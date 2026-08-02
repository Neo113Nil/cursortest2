package com.yandex.go.image.internal.coil.intercept;

import coil3.graphics.EnumC0136DataSource;
import coil3.intercept.c;
import defpackage.adi0;
import defpackage.ebv;
import defpackage.iev;
import defpackage.ii10;
import defpackage.ji10;
import defpackage.l8w;
import defpackage.mev;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q7v;
import defpackage.sac;
import defpackage.t3v0;
import defpackage.tse;
import defpackage.w06;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lmev;", "<anonymous>", "(Ltse;)Lmev;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.image.internal.coil.intercept.ImageMetaInterceptor$intercept$2", f = "ImageMetaInterceptor.kt", l = {19}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class ImageMetaInterceptor$intercept$2 extends SuspendLambda implements wls {
    final /* synthetic */ l8w $chain;
    final /* synthetic */ iev $element;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageMetaInterceptor$intercept$2(l8w l8wVar, iev ievVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$chain = l8wVar;
        this.$element = ievVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ImageMetaInterceptor$intercept$2(this.$chain, this.$element, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ImageMetaInterceptor$intercept$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            l8w l8wVar = this.$chain;
            this.label = 1;
            obj = ((c) l8wVar).a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        mev mevVar = (mev) obj;
        ebv ebvVar = this.$element.a;
        if (ebvVar == null || !(mevVar instanceof t3v0)) {
            return mevVar;
        }
        t3v0 t3v0Var = (t3v0) mevVar;
        EnumC0136DataSource enumC0136DataSource = t3v0Var.c;
        if (enumC0136DataSource == EnumC0136DataSource.NETWORK || enumC0136DataSource == EnumC0136DataSource.DISK) {
            q7v q7vVar = t3v0Var.a;
            if (q7vVar instanceof w06) {
                sac sacVar = new sac((w06) q7vVar, ebvVar);
                ii10 ii10Var = t3v0Var.d;
                if (ii10Var != null) {
                    adi0 adi0Var = (adi0) this.this$0.a.getValue();
                    ji10 a = adi0Var.a(ii10Var);
                    if (a != null && !(a.a instanceof sac)) {
                        adi0Var.b(ii10Var, new ji10(sacVar, a.b));
                    }
                    ((c) this.$chain).d.getClass();
                }
                return new t3v0(sacVar, t3v0Var.b, t3v0Var.c, t3v0Var.d, t3v0Var.e, t3v0Var.f, t3v0Var.g);
            }
        }
        return mevVar;
    }
}
