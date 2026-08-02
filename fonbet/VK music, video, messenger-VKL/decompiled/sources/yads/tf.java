package yads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class tf extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ vf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(vf vfVar, spj spjVar) {
        super(2, spjVar);
        this.c = vfVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new tf(this.c, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new tf(this.c, (spj) obj2).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (xsna.qsl.b(r4, r8) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r9 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0045 -> B:13:0x001c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                kotlin.a.a(obj);
                if (!((Boolean) obj).booleanValue()) {
                    vf.a(this.c);
                    return s3q0.a;
                }
                long j = this.c.a;
                this.b = 2;
            } else if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        kotlin.a.a(obj);
        vf vfVar = this.c;
        jf jfVar = vfVar.e;
        long j2 = vfVar.b;
        this.b = 1;
        obj = myc0.k(jfVar.a, new Cif(jfVar, j2, null), this);
    }
}
