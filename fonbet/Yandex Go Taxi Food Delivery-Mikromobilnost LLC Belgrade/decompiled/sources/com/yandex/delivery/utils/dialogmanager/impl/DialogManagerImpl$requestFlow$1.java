package com.yandex.delivery.utils.dialogmanager.impl;

import defpackage.eyc;
import defpackage.fyc;
import defpackage.iej;
import defpackage.jej;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zej;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Liej;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "com.yandex.delivery.utils.dialogmanager.impl.DialogManagerImpl$requestFlow$1", f = "DialogManagerImpl.kt", l = {26, 32, 34}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class DialogManagerImpl$requestFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogManagerImpl$requestFlow$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DialogManagerImpl$requestFlow$1 dialogManagerImpl$requestFlow$1 = new DialogManagerImpl$requestFlow$1(this.this$0, continuation);
        dialogManagerImpl$requestFlow$1.L$0 = obj;
        return dialogManagerImpl$requestFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DialogManagerImpl$requestFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        if (r11 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0096 -> B:9:0x0099). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jej jejVar;
        eyc eycVar;
        Object s;
        jej jejVar2;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            kotlinx.coroutines.channels.a aVar = this.this$0.a;
            this.L$0 = vprVar;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 1;
            aVar.getClass();
            obj = kotlinx.coroutines.channels.a.J(aVar, this);
        } else {
            if (i == 1) {
                kotlin.b.b(obj);
                jejVar = (jej) obj;
                fyc fycVar = new fyc(jejVar.a());
                iej iejVar = new iej(jejVar.b(), fycVar);
                this.L$0 = vprVar;
                this.L$1 = jejVar;
                this.L$2 = fycVar;
                this.L$3 = null;
                this.label = 2;
                if (vprVar.emit(iejVar, this) != coroutineSingletons) {
                    eycVar = fycVar;
                    this.L$0 = vprVar;
                    this.L$1 = jejVar;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 3;
                    s = ((fyc) eycVar).s(this);
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (s != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i == 2) {
                eycVar = (eyc) this.L$2;
                jej jejVar3 = (jej) this.L$1;
                kotlin.b.b(obj);
                jejVar = jejVar3;
                this.L$0 = vprVar;
                this.L$1 = jejVar;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 3;
                s = ((fyc) eycVar).s(this);
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (s != coroutineSingletons) {
                    jejVar2 = jejVar;
                    obj = s;
                    ((fyc) jejVar2.a()).T((zej) obj);
                    kotlinx.coroutines.channels.a aVar2 = this.this$0.a;
                    this.L$0 = vprVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 1;
                    aVar2.getClass();
                    obj = kotlinx.coroutines.channels.a.J(aVar2, this);
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jejVar2 = (jej) this.L$1;
            try {
                kotlin.b.b(obj);
            } catch (CancellationException unused) {
            }
            ((fyc) jejVar2.a()).T((zej) obj);
            kotlinx.coroutines.channels.a aVar22 = this.this$0.a;
            this.L$0 = vprVar;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 1;
            aVar22.getClass();
            obj = kotlinx.coroutines.channels.a.J(aVar22, this);
        }
    }
}
