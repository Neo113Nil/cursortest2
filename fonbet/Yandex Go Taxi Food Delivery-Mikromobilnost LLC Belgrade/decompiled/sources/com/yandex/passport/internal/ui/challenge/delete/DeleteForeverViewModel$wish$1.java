package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.challenge.delete.DeleteForeverViewModel$wish$1", f = "DeleteForeverViewModel.kt", l = {HProv.PP_DELETE_KEYSET}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DeleteForeverViewModel$wish$1 extends SuspendLambda implements wls {
    final /* synthetic */ o0 $bouncerWish;
    int label;
    final /* synthetic */ f1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteForeverViewModel$wish$1(f1 f1Var, o0 o0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = f1Var;
        this.$bouncerWish = o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeleteForeverViewModel$wish$1(this.this$0, this.$bouncerWish, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeleteForeverViewModel$wish$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r6 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008a, code lost:
    
        if (r6 != r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r6 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        if (r6 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        if (r6 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
    
        if (r6 == r0) goto L37;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object emit;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        y0 y0Var = this.this$0.c;
        if (y0Var == null) {
            y0Var = null;
        }
        o0 o0Var = this.$bouncerWish;
        this.label = 1;
        kotlinx.coroutines.flow.n0 n0Var = y0Var.i;
        if (jl40.l(o0Var, n.b)) {
            emit = n0Var.emit(new u0(com.yandex.passport.api.p0.a), this);
        } else if (jl40.l(o0Var, n.c)) {
            emit = n0Var.emit(new u0(com.yandex.passport.api.p0.b), this);
        } else if (jl40.l(o0Var, n.d)) {
            emit = y0Var.i(this);
        } else if (jl40.l(o0Var, n.e)) {
            emit = y0Var.g(this);
        } else {
            if (!(o0Var instanceof n0)) {
                w511.b();
                return null;
            }
            emit = n0Var.emit(new u0(new com.yandex.passport.api.q0(((n0) o0Var).a)), this);
        }
    }
}
