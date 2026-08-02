package com.yandex.go.pickup_from_photo.presentation;

import android.content.Context;
import defpackage.er7;
import defpackage.euy;
import defpackage.fq7;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ns7;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.tse;
import defpackage.vp7;
import defpackage.w8v;
import defpackage.wls;
import defpackage.xs7;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.camera.CameraPreview;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pickup_from_photo.presentation.CameraController$rebindForNightMode$2", f = "CameraController.kt", l = {184, 185, 200}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CameraController$rebindForNightMode$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $useNight;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraController$rebindForNightMode$2(b bVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$useNight = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CameraController$rebindForNightMode$2(this.this$0, this.$useNight, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CameraController$rebindForNightMode$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0099 A[Catch: all -> 0x0024, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:8:0x001e, B:22:0x002f, B:25:0x0099, B:29:0x00b4, B:31:0x00be, B:45:0x0037, B:54:0x004e), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0 A[Catch: all -> 0x010a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x010a, blocks: (B:23:0x0089, B:27:0x00b0, B:33:0x00cd, B:43:0x00c8, B:46:0x0078, B:51:0x003e, B:56:0x0065), top: B:50:0x003e }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        CameraController$rebindForNightMode$2 cameraController$rebindForNightMode$2;
        Context context;
        AtomicReference atomicReference;
        vp7 vp7Var;
        b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                try {
                    boolean z = ((fq7) this.this$0.g.get()).a;
                    b bVar2 = this.this$0;
                    if (!z) {
                        bVar2.g.updateAndGet(new vp7(2));
                        atomicReference = this.this$0.g;
                        vp7Var = new vp7(3);
                        atomicReference.updateAndGet(vp7Var);
                        return zy11Var;
                    }
                    Context context2 = bVar2.a;
                    noh nohVar = bVar2.j;
                    this.L$0 = context2;
                    this.label = 1;
                    Object k = nohVar.k(this);
                    if (k == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    context = context2;
                    obj = k;
                } catch (Throwable th2) {
                    th = th2;
                    cameraController$rebindForNightMode$2 = this;
                    th = th;
                    cameraController$rebindForNightMode$2.this$0.g.updateAndGet(new vp7(3));
                    throw th;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bVar = (b) this.L$2;
                        kotlin.b.b(obj);
                        cameraController$rebindForNightMode$2 = this;
                        bVar.getClass();
                        AtomicReference atomicReference2 = cameraController$rebindForNightMode$2.this$0.g;
                        final boolean z2 = cameraController$rebindForNightMode$2.$useNight;
                        atomicReference = cameraController$rebindForNightMode$2.this$0.g;
                        vp7Var = new vp7(3);
                        atomicReference.updateAndGet(vp7Var);
                        return zy11Var;
                    }
                    kotlin.b.b(obj);
                    androidx.camera.extensions.a aVar = (androidx.camera.extensions.a) obj;
                    if (((fq7) this.this$0.g.get()).a) {
                        this.this$0.g.updateAndGet(new vp7(4));
                        atomicReference = this.this$0.g;
                        vp7Var = new vp7(3);
                        atomicReference.updateAndGet(vp7Var);
                        return zy11Var;
                    }
                    xs7 a = (this.$useNight && aVar.d(this.this$0.h)) ? aVar.a(this.this$0.h) : this.this$0.h;
                    b bVar3 = this.this$0;
                    er7 er7Var = bVar3.i;
                    CameraPreview cameraPreview = bVar3.c;
                    w8v w8vVar = bVar3.d;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = bVar3;
                    this.label = 3;
                    cameraController$rebindForNightMode$2 = this;
                    try {
                        obj = b.a(bVar3, er7Var, a, cameraPreview, w8vVar, cameraController$rebindForNightMode$2);
                        if (obj != coroutineSingletons) {
                            bVar = bVar3;
                            bVar.getClass();
                            AtomicReference atomicReference22 = cameraController$rebindForNightMode$2.this$0.g;
                            final boolean z22 = cameraController$rebindForNightMode$2.$useNight;
                            atomicReference = cameraController$rebindForNightMode$2.this$0.g;
                            vp7Var = new vp7(3);
                            atomicReference.updateAndGet(vp7Var);
                            return zy11Var;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        cameraController$rebindForNightMode$2.this$0.g.updateAndGet(new vp7(3));
                        throw th;
                    }
                }
                context = (Context) this.L$0;
                kotlin.b.b(obj);
            }
            euy b = androidx.camera.extensions.a.b((ns7) obj, context);
            this.L$0 = null;
            this.label = 2;
            obj = ooc.e(b, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            androidx.camera.extensions.a aVar2 = (androidx.camera.extensions.a) obj;
            if (((fq7) this.this$0.g.get()).a) {
            }
        } catch (Throwable th4) {
            th = th4;
            cameraController$rebindForNightMode$2 = this;
        }
    }
}
