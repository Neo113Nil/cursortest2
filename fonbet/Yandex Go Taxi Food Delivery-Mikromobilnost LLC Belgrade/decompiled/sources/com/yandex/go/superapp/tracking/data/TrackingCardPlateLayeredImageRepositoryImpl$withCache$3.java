package com.yandex.go.superapp.tracking.data;

import android.graphics.drawable.Drawable;
import defpackage.a401;
import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.tracking.data.TrackingCardPlateLayeredImageRepositoryImpl$withCache$3", f = "TrackingCardPlateLayeredImageRepositoryImpl.kt", l = {143, 99}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TrackingCardPlateLayeredImageRepositoryImpl$withCache$3 extends SuspendLambda implements wls {
    final /* synthetic */ a401 $configuration;
    final /* synthetic */ tls $createDrawable;
    final /* synthetic */ g050 $mutex;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingCardPlateLayeredImageRepositoryImpl$withCache$3(g050 g050Var, a aVar, a401 a401Var, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$mutex = g050Var;
        this.this$0 = aVar;
        this.$configuration = a401Var;
        this.$createDrawable = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrackingCardPlateLayeredImageRepositoryImpl$withCache$3(this.$mutex, this.this$0, this.$configuration, this.$createDrawable, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackingCardPlateLayeredImageRepositoryImpl$withCache$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g050 g050Var;
        a aVar;
        tls tlsVar;
        a401 a401Var;
        Throwable th;
        g050 g050Var2;
        a401 a401Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                g050Var = this.$mutex;
                aVar = this.this$0;
                a401 a401Var3 = this.$configuration;
                tlsVar = this.$createDrawable;
                this.L$0 = g050Var;
                this.L$1 = aVar;
                this.L$2 = a401Var3;
                this.L$3 = tlsVar;
                this.label = 1;
                if (g050Var.a(this) != coroutineSingletons) {
                    a401Var = a401Var3;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a401Var2 = (a401) this.L$2;
                aVar = (a) this.L$1;
                g050Var2 = (g050) this.L$0;
                try {
                    kotlin.b.b(obj);
                    aVar.f.put(a401Var2, new WeakReference((Drawable) obj));
                    Drawable drawable = (Drawable) obj;
                    g050Var = g050Var2;
                    g050Var.d(null);
                    return drawable;
                } catch (Throwable th2) {
                    th = th2;
                    g050Var2.d(null);
                    throw th;
                }
            }
            tls tlsVar2 = (tls) this.L$3;
            a401Var = (a401) this.L$2;
            a aVar2 = (a) this.L$1;
            g050 g050Var3 = (g050) this.L$0;
            kotlin.b.b(obj);
            g050Var = g050Var3;
            tlsVar = tlsVar2;
            aVar = aVar2;
            WeakReference weakReference = (WeakReference) aVar.f.get(a401Var);
            if (weakReference != null && (drawable = (Drawable) weakReference.get()) != null) {
                g050Var.d(null);
                return drawable;
            }
            this.L$0 = g050Var;
            this.L$1 = aVar;
            this.L$2 = a401Var;
            this.L$3 = null;
            this.label = 2;
            Object invoke = tlsVar.invoke(this);
            if (invoke != coroutineSingletons) {
                g050 g050Var4 = g050Var;
                obj = invoke;
                g050Var2 = g050Var4;
                a401Var2 = a401Var;
                aVar.f.put(a401Var2, new WeakReference((Drawable) obj));
                Drawable drawable2 = (Drawable) obj;
                g050Var = g050Var2;
                g050Var.d(null);
                return drawable2;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            g050 g050Var5 = g050Var;
            th = th3;
            g050Var2 = g050Var5;
            g050Var2.d(null);
            throw th;
        }
    }
}
