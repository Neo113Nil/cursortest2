package com.yandex.go.superapp.tracking.data;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import defpackage.gic;
import defpackage.k401;
import defpackage.l401;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.tls;
import defpackage.z48;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.superapp.tracking.data.TrackingCardPlateLayeredImageRepositoryImpl$getLayeredImage$2", f = "TrackingCardPlateLayeredImageRepositoryImpl.kt", l = {47}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TrackingCardPlateLayeredImageRepositoryImpl$getLayeredImage$2 extends SuspendLambda implements tls {
    final /* synthetic */ l401 $configuration;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingCardPlateLayeredImageRepositoryImpl$getLayeredImage$2(a aVar, l401 l401Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$configuration = l401Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TrackingCardPlateLayeredImageRepositoryImpl$getLayeredImage$2(this.this$0, this.$configuration, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TrackingCardPlateLayeredImageRepositoryImpl$getLayeredImage$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            k401 k401Var = this.$configuration.b;
            this.label = 1;
            obj = a.a(aVar, k401Var, this);
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
        List list = (List) obj;
        z48 z48Var = (z48) kotlin.collections.a.R(list);
        if (z48Var == null) {
            return null;
        }
        Bitmap bitmap = z48Var.b;
        a aVar2 = this.this$0;
        l401 l401Var = this.$configuration;
        gic gicVar = aVar2.e;
        Context context = aVar2.a;
        int m = s8o.m(l401Var.a, context);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        gicVar.getClass();
        return new BitmapDrawable(context.getResources(), gic.b(m, width, height, list));
    }
}
