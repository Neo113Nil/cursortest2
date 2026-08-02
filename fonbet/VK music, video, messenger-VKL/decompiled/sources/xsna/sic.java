package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClearVkpnsPushDatabaseUseCase.kt */
/* loaded from: classes5.dex */
public final class sic {
    public final g790 a;
    public final fje0 b;
    public final ske0 c;

    public sic(g790 g790Var, fje0 fje0Var, ske0 ske0Var) {
        this.a = g790Var;
        this.b = fje0Var;
        this.c = ske0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (r7.a(r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (r7.a(r0) != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ric ricVar;
        int i;
        sic sicVar;
        if (continuationImpl instanceof ric) {
            ricVar = (ric) continuationImpl;
            int i2 = ricVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ricVar.label = i2 - Integer.MIN_VALUE;
                Object obj = ricVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ricVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ricVar.L$0 = this;
                    ricVar.label = 1;
                    if (this.a.a(ricVar) != coroutineSingletons) {
                        sicVar = this;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    sicVar = (sic) ricVar.L$0;
                    kotlin.a.a(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    sicVar = (sic) ricVar.L$0;
                    kotlin.a.a(obj);
                    ske0 ske0Var = sicVar.c;
                    ricVar.L$0 = null;
                    ricVar.label = 3;
                }
                fje0 fje0Var = sicVar.b;
                ricVar.L$0 = sicVar;
                ricVar.label = 2;
            }
        }
        ricVar = new ric(this, continuationImpl);
        Object obj2 = ricVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ricVar.label;
        if (i != 0) {
        }
        fje0 fje0Var2 = sicVar.b;
        ricVar.L$0 = sicVar;
        ricVar.label = 2;
    }
}
