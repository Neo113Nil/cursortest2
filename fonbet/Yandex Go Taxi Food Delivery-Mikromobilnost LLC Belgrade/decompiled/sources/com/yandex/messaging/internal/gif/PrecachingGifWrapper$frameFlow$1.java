package com.yandex.messaging.internal.gif;

import android.graphics.Bitmap;
import defpackage.che0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Landroid/graphics/Bitmap;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.gif.PrecachingGifWrapper$frameFlow$1", f = "PrecachingGifWrapper.kt", l = {114, HProv.PP_NK_SYNC, HProv.PP_INFO}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PrecachingGifWrapper$frameFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrecachingGifWrapper$frameFlow$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PrecachingGifWrapper$frameFlow$1 precachingGifWrapper$frameFlow$1 = new PrecachingGifWrapper$frameFlow$1(this.this$0, continuation);
        precachingGifWrapper$frameFlow$1.L$0 = obj;
        return precachingGifWrapper$frameFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PrecachingGifWrapper$frameFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x008f, code lost:
    
        if (defpackage.wpb1.h(r5, r8) != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005f, code lost:
    
        if (r4.u0(r8) == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x008f -> B:7:0x0092). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        che0 che0Var;
        vpr vprVar2;
        che0 che0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            pzt0 pzt0Var = this.this$0.m;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            b bVar = this.this$0;
            pzt0 N = tje.N(bVar.b, null, null, new PrecachingGifWrapper$precache$1(bVar, null), 3);
            bVar.m = N;
            this.L$0 = vprVar;
            this.label = 1;
        } else if (i == 1) {
            vprVar = (vpr) this.L$0;
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                che0Var2 = (che0) this.L$1;
                vprVar2 = (vpr) this.L$0;
                kotlin.b.b(obj);
                che0Var = che0Var2.c;
                if (che0Var == null) {
                    throw new CancellationException("Cache is inconsistent");
                }
                vprVar = vprVar2;
                if (kotlinx.coroutines.a.p(get_context())) {
                    return zy11.a;
                }
                Bitmap bitmap = che0Var.a;
                this.L$0 = vprVar;
                this.L$1 = che0Var;
                this.label = 2;
                if (vprVar.emit(bitmap, this) != coroutineSingletons) {
                    vprVar2 = vprVar;
                    che0Var2 = che0Var;
                    long j = che0Var2.b;
                    this.L$0 = vprVar2;
                    this.L$1 = che0Var2;
                    this.label = 3;
                }
                return coroutineSingletons;
            }
            che0Var2 = (che0) this.L$1;
            vprVar2 = (vpr) this.L$0;
            kotlin.b.b(obj);
            long j2 = che0Var2.b;
            this.L$0 = vprVar2;
            this.L$1 = che0Var2;
            this.label = 3;
        }
        che0Var = this.this$0.i;
        if (che0Var == null) {
            throw new CancellationException("Cache is not ready");
        }
        if (kotlinx.coroutines.a.p(get_context())) {
        }
    }
}
