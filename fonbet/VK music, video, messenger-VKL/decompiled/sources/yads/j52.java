package yads;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.asl;
import xsna.eyx;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yok0;
import xsna.yvj;
import xsna.zrl;

/* loaded from: classes10.dex */
public final class j52 extends SuspendLambda implements wzs {
    public zrl b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ d4 e;
    public final /* synthetic */ k52 f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ sz1 h;
    public final /* synthetic */ z30 i;
    public final /* synthetic */ nj2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j52(d4 d4Var, k52 k52Var, Context context, sz1 sz1Var, z30 z30Var, nj2 nj2Var, spj spjVar) {
        super(2, spjVar);
        this.e = d4Var;
        this.f = k52Var;
        this.g = context;
        this.h = sz1Var;
        this.i = z30Var;
        this.j = nj2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        j52 j52Var = new j52(this.e, this.f, this.g, this.h, this.i, this.j, spjVar);
        j52Var.d = obj;
        return j52Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((j52) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        if (r2.y(r13) == r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        eyx h;
        zrl zrlVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) this.d;
            if (this.e.m) {
                yok0 h2 = myc0.h(yvjVar, null, null, new g52(this.f, this.h, this.j, null), 3);
                h = myc0.h(yvjVar, null, null, new i52(this.f, this.g, this.h, null), 3);
                asl b = myc0.b(yvjVar, null, null, new h52(this.f, this.g, this.h, this.i, null), 3);
                this.d = h;
                this.b = b;
                this.c = 1;
                if (h2.y(this) != coroutineSingletons) {
                    zrlVar = b;
                }
            } else {
                j72 j72Var = this.f.c;
                Context context = this.g;
                sz1 sz1Var = this.h;
                z30 z30Var = this.i;
                this.c = 4;
                Object a = j72Var.a(false, context, sz1Var, z30Var, (spj) this);
                if (a != coroutineSingletons) {
                    return a;
                }
            }
        }
        if (i != 1) {
            if (i == 2) {
                zrlVar = (zrl) this.d;
                kotlin.a.a(obj);
                this.d = null;
                this.c = 3;
                Object H = zrlVar.H(this);
                return H == coroutineSingletons ? coroutineSingletons : H;
            }
            if (i == 3) {
                kotlin.a.a(obj);
                return obj;
            }
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        zrlVar = this.b;
        h = (eyx) this.d;
        kotlin.a.a(obj);
        this.d = zrlVar;
        this.b = null;
        this.c = 2;
    }
}
