package yads;

import java.io.File;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.bdn;
import xsna.emb;
import xsna.myc0;
import xsna.nbr;
import xsna.s3q0;
import xsna.spj;
import xsna.wgl;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class xf1 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ ag1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf1(ag1 ag1Var, spj spjVar) {
        super(2, spjVar);
        this.c = ag1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new xf1(this.c, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new xf1(this.c, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                ag1 ag1Var = this.c;
                this.b = 1;
                ag1Var.getClass();
                bdn bdnVar = bdn.a;
                obj = myc0.k(wgl.c, new uf1(ag1Var, null), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            File file = new File((File) obj, "light_bundle_script.js");
            if (file.exists()) {
                return nbr.r(file, emb.b);
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
