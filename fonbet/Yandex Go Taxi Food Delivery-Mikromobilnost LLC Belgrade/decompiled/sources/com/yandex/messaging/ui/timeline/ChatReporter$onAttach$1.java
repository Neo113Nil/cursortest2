package com.yandex.messaging.ui.timeline;

import android.content.Intent;
import defpackage.ey4;
import defpackage.j3b;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.x270;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.timeline.ChatReporter$onAttach$1", f = "ChatReporter.kt", l = {HProv.ALG_SID_SHA3_224, HProv.ALG_SID_SHA3_256}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatReporter$onAttach$1 extends SuspendLambda implements wls {
    final /* synthetic */ Intent $intent;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatReporter$onAttach$1(b bVar, Intent intent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$intent = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatReporter$onAttach$1(this.this$0, this.$intent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatReporter$onAttach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if (r5 == r0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        j3b j3bVar;
        x270 x270Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.this$0.g;
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.A(tprVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j3bVar = (j3b) this.L$0;
                kotlin.b.b(obj);
                x270Var = (x270) obj;
                if (x270Var == null) {
                    x270Var = x270.b;
                }
                b bVar = this.this$0;
                kgx[] kgxVarArr = b.p;
                bVar.b(j3bVar, x270Var);
                this.this$0.a(j3bVar, this.$intent);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        j3b j3bVar2 = (j3b) obj;
        ey4 a = this.this$0.e.a();
        this.L$0 = j3bVar2;
        this.label = 2;
        Object A = kotlinx.coroutines.flow.e.A(a, this);
        if (A != coroutineSingletons) {
            j3bVar = j3bVar2;
            obj = A;
            x270Var = (x270) obj;
            if (x270Var == null) {
            }
            b bVar2 = this.this$0;
            kgx[] kgxVarArr2 = b.p;
            bVar2.b(j3bVar, x270Var);
            this.this$0.a(j3bVar, this.$intent);
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
