package com.ybsdk.core.utils.ext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import defpackage.abm;
import defpackage.bev;
import defpackage.hev;
import defpackage.mvg;
import defpackage.nev;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vam;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Labm;", "<anonymous>", "(Ltse;)Labm;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.core.utils.ext.CoilExtKt$downloadDrawable$2", f = "CoilExt.kt", l = {130}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CoilExtKt$downloadDrawable$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $allowHardwareAcceleration;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $imageUrl;
    final /* synthetic */ vam $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoilExtKt$downloadDrawable$2(Context context, boolean z, String str, vam vamVar, Continuation continuation) {
        super(2, continuation);
        this.$context = context;
        this.$allowHardwareAcceleration = z;
        this.$imageUrl = str;
        this.$params = vamVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoilExtKt$downloadDrawable$2(this.$context, this.$allowHardwareAcceleration, this.$imageUrl, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CoilExtKt$downloadDrawable$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            coil.c f = a.f();
            bev b = a.b(this.$context, 4, this.$allowHardwareAcceleration);
            a.e(b, this.$imageUrl, this.$params.a, this.$context);
            this.$params.getClass();
            b.v = null;
            b.u = 0;
            hev d = b.d();
            this.label = 1;
            obj = f.c(d, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        Drawable a = ((nev) obj).a();
        this.$params.getClass();
        return new abm(this.$imageUrl, a);
    }
}
