package yads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.asl;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;
import xsna.zrl;

/* loaded from: classes10.dex */
public final class un extends SuspendLambda implements wzs {
    public d4 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ zn e;
    public final /* synthetic */ vb3 f;
    public final /* synthetic */ hp g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un(zn znVar, vb3 vb3Var, hp hpVar, spj spjVar) {
        super(2, spjVar);
        this.e = znVar;
        this.f = vb3Var;
        this.g = hpVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        un unVar = new un(this.e, this.f, this.g, spjVar);
        unVar.d = obj;
        return unVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((un) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zrl zrlVar;
        d4 d4Var;
        d4 d4Var2;
        zn znVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) this.d;
            asl b = myc0.b(yvjVar, null, null, new tn(this.e, this.g, null), 3);
            asl b2 = myc0.b(yvjVar, null, null, new sn(this.e, this.g, null), 3);
            d4 d4Var3 = this.e.c;
            this.d = b;
            this.b = d4Var3;
            this.c = 1;
            obj = b2.J(this);
            if (obj != coroutineSingletons) {
                zrlVar = b;
                d4Var = d4Var3;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d4Var2 = (d4) this.d;
            kotlin.a.a(obj);
            d4Var2.i = (String) obj;
            this.e.b.a(v5.g);
            znVar = this.e;
            vb3 vb3Var = this.f;
            synchronized (znVar) {
                myc0.h(znVar.e, null, null, new qn(znVar, vb3Var, null), 3);
            }
            return s3q0.a;
        }
        d4Var = this.b;
        zrlVar = (zrl) this.d;
        kotlin.a.a(obj);
        d4Var.h = (String) obj;
        d4 d4Var4 = this.e.c;
        this.d = d4Var4;
        this.b = null;
        this.c = 2;
        Object H = zrlVar.H(this);
        if (H != coroutineSingletons) {
            d4Var2 = d4Var4;
            obj = H;
            d4Var2.i = (String) obj;
            this.e.b.a(v5.g);
            znVar = this.e;
            vb3 vb3Var2 = this.f;
            synchronized (znVar) {
            }
        }
        return coroutineSingletons;
    }
}
