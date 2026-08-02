package yads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.bdn;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wgl;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class rw0 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ sw0 d;
    public final /* synthetic */ tw0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw0(byte[] bArr, sw0 sw0Var, tw0 tw0Var, spj spjVar) {
        super(2, spjVar);
        this.c = bArr;
        this.d = sw0Var;
        this.e = tw0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new rw0(this.c, this.d, this.e, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((rw0) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            kotlin.a.a(obj);
            byte[] bArr = this.c;
            if (bArr == null) {
                return null;
            }
            ix0 ix0Var = this.d.b;
            tw0 tw0Var = this.e;
            this.b = 1;
            iw0 iw0Var = ix0Var.a;
            iw0Var.getClass();
            bdn bdnVar = bdn.a;
            Object k = myc0.k(wgl.c, new hw0(iw0Var, tw0Var, bArr, null), this);
            if (k != obj2) {
                k = s3q0.a;
            }
            if (k == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
