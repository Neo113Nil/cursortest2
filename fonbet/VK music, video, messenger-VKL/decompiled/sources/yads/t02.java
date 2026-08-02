package yads;

import android.content.Context;
import android.view.View;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class t02 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ u02 c;
    public final /* synthetic */ View d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t02(u02 u02Var, View view, spj spjVar) {
        super(2, spjVar);
        this.c = u02Var;
        this.d = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new t02(this.c, this.d, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new t02(this.c, this.d, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            kotlin.a.a(obj);
            u02 u02Var = this.c;
            y3 y3Var = u02Var.b;
            View view = this.d;
            oi oiVar = u02Var.a;
            jg1 jg1Var = u02Var.e;
            m22 m22Var = u02Var.c;
            this.b = 1;
            x3 x3Var = (x3) y3Var;
            f1 f1Var = x3Var.d.b;
            e1 e1Var = new e1(f1Var.e, f1Var.a, f1Var.b, f1Var.c, f1Var.d, jg1Var.b);
            f1Var.f = e1Var;
            j32 j32Var = f1Var.g;
            if (j32Var != null) {
                f1Var.g = j32Var;
                e1Var.b.k = j32Var;
            }
            Context context = view.getContext();
            z9 z9Var = x3Var.i.a;
            a02 a02Var = x3Var.g;
            lv lvVar = new lv(a02Var.c, a02Var.a, new b02(oiVar.a, a02Var.e, m22Var.b), ((mv3) a02Var.b).a(), new sx(), new we(a02Var.d));
            t63 t63Var = x3Var.e;
            ov2 ov2Var = x3Var.a;
            d4 d4Var = x3Var.c;
            v9 v9Var = x3Var.b;
            t63Var.getClass();
            qu2 a2 = gx2.a().a(context);
            if (a2 != null) {
                boolean z = a2.f;
            }
            eb0 eb0Var = new eb0(context, d4Var, v9Var, z9Var, new p2(ov2Var), lm0.a(context));
            za zaVar = x3Var.f;
            m52 m52Var = new m52(zaVar, eb0Var);
            a = x3Var.a(view, jg1Var, new v0(new p0(x3Var.c, x3Var.a, x3Var.b, lvVar, m52Var, m22Var, x3Var.d, x3Var.h)), new l52(zaVar, eb0Var, lvVar), this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            a = obj;
        }
        if (((p01) a).a) {
            this.c.f.a();
        }
        return s3q0.a;
    }
}
