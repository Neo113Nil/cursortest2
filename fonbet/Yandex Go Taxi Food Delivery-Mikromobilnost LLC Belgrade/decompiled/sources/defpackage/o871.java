package defpackage;

import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.Action;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow;
import ru.rt.ebs.cryptosdk.presentation.biometry_capturing.videoRecording.f;

/* loaded from: classes4.dex */
public final class o871 implements vpr {
    public final /* synthetic */ yn31 a;

    public o871(yn31 yn31Var) {
        this.a = yn31Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r1.cancelProcessingStateUpdating(r2) == r3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
    
        if (r1.startProcessingStateUpdatingIfNotStarted(r2) == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Action action, Continuation continuation) {
        f fVar;
        int i;
        o871 o871Var = this;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.d = i2 - Integer.MIN_VALUE;
                Object obj = fVar.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fVar.d;
                int i3 = 2;
                if (i != 0) {
                    b.b(obj);
                    int i4 = xn31.a[action.ordinal()];
                    yn31 yn31Var = o871Var.a;
                    if (i4 == 1) {
                        IFlow currentFlow = yn31Var.E.getCurrentFlow();
                        fVar.a = o871Var;
                        fVar.d = 1;
                    } else if (i4 == 2) {
                        IFlow currentFlow2 = yn31Var.E.getCurrentFlow();
                        fVar.a = o871Var;
                        fVar.d = 2;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    o871Var = fVar.a;
                    b.b(obj);
                    yn31 yn31Var2 = o871Var.a;
                    vn31 a = vn31.a((vn31) yn31Var2.a0(), null, null, null, false, true, false, yn31Var2.b0(), false, 287);
                    r0 r0Var = (r0) yn31Var2.c0();
                    r0Var.getClass();
                    r0Var.m(null, a);
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o871Var = fVar.a;
                    b.b(obj);
                    yn31 yn31Var3 = o871Var.a;
                    vn31 a2 = vn31.a((vn31) yn31Var3.a0(), null, null, null, false, false, true, 0, false, 415);
                    r0 r0Var2 = (r0) yn31Var3.c0();
                    r0Var2.getClass();
                    r0Var2.m(null, a2);
                    yn31 yn31Var4 = o871Var.a;
                    yn31Var4.g0(1500L, new wn31(yn31Var4, i3));
                }
                return zy11.a;
            }
        }
        fVar = new f(o871Var, continuation);
        Object obj2 = fVar.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fVar.d;
        int i32 = 2;
        if (i != 0) {
        }
        return zy11.a;
    }
}
