package com.yandex.go.image.domain.requests;

import android.graphics.Bitmap;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Landroid/graphics/Bitmap;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.image.domain.requests.CoilBitmapRequest$safeSubmitFlow$2", f = "CoilBitmapRequest.kt", l = {174, HProv.PP_EXPORT_CSP}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class CoilBitmapRequest$safeSubmitFlow$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoilBitmapRequest$safeSubmitFlow$2(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CoilBitmapRequest$safeSubmitFlow$2 coilBitmapRequest$safeSubmitFlow$2 = new CoilBitmapRequest$safeSubmitFlow$2(this.this$0, continuation);
        coilBitmapRequest$safeSubmitFlow$2.L$0 = obj;
        return coilBitmapRequest$safeSubmitFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CoilBitmapRequest$safeSubmitFlow$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r0.emit(r7, r6) != r1) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        Bitmap bitmap;
        vpr vprVar2 = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                try {
                    d dVar = this.this$0;
                    this.L$0 = null;
                    this.L$1 = vprVar2;
                    this.L$2 = vprVar2;
                    this.label = 1;
                    obj = dVar.a(this);
                    if (obj != coroutineSingletons) {
                        vprVar = vprVar2;
                    }
                } catch (Throwable unused) {
                    bitmap = null;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar2 = (vpr) this.L$2;
            vprVar = (vpr) this.L$1;
            try {
                kotlin.b.b(obj);
            } catch (Throwable unused2) {
                vprVar2 = vprVar;
                bitmap = null;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
            }
            bitmap = (Bitmap) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
