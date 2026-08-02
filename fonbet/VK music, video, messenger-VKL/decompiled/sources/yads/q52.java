package yads;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yok0;
import xsna.yvj;
import xsna.zrl;

/* loaded from: classes10.dex */
public final class q52 extends SuspendLambda implements wzs {
    public zrl b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ i02 f;
    public final /* synthetic */ k02 g;
    public final /* synthetic */ r52 h;
    public final /* synthetic */ d4 i;
    public final /* synthetic */ sz1 j;
    public final /* synthetic */ z30 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q52(Context context, i02 i02Var, k02 k02Var, r52 r52Var, d4 d4Var, sz1 sz1Var, z30 z30Var, spj spjVar) {
        super(2, spjVar);
        this.e = context;
        this.f = i02Var;
        this.g = k02Var;
        this.h = r52Var;
        this.i = d4Var;
        this.j = sz1Var;
        this.k = z30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        q52 q52Var = new q52(this.e, this.f, this.g, this.h, this.i, this.j, this.k, spjVar);
        q52Var.d = obj;
        return q52Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((q52) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0079  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zrl b;
        nj2 nj2Var;
        nj2 nj2Var2;
        sz1 sz1Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) this.d;
            nj2 nj2Var3 = new nj2(this.e);
            b = myc0.b(yvjVar, null, null, new p52(this.h, this.i, this.e, this.j, nj2Var3, this.k, null), 3);
            yok0 h = myc0.h(yvjVar, null, null, new o52(this.h, this.j, null), 3);
            this.d = nj2Var3;
            this.b = b;
            this.c = 1;
            if (h.y(this) != coroutineSingletons) {
                nj2Var = nj2Var3;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nj2 nj2Var4 = (nj2) this.d;
            kotlin.a.a(obj);
            nj2Var2 = nj2Var4;
            sz1Var = (sz1) obj;
            if (sz1Var != null) {
                this.f.a(h9.w);
            } else {
                k02 k02Var = this.g;
                k02Var.b.a(v5.n);
                l02 l02Var = k02Var.c;
                n02 n02Var = l02Var.g;
                myc0.h(n02Var.d, null, null, new j02(n02Var, sz1Var, nj2Var2, l02Var, k02Var, null), 3);
            }
            return s3q0.a;
        }
        b = this.b;
        nj2Var = (nj2) this.d;
        kotlin.a.a(obj);
        this.d = nj2Var;
        this.b = null;
        this.c = 2;
        obj = b.H(this);
        if (obj != coroutineSingletons) {
            nj2Var2 = nj2Var;
            sz1Var = (sz1) obj;
            if (sz1Var != null) {
            }
            return s3q0.a;
        }
        return coroutineSingletons;
    }
}
