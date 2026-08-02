package yads;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.bdn;
import xsna.myc0;
import xsna.spj;
import xsna.wgl;

/* loaded from: classes10.dex */
public final class sw0 {
    public final nw0 a;
    public final ix0 b;

    public /* synthetic */ sw0(Context context) {
        this(new nw0(context), new ix0(context));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(6:11|12|13|(1:15)(1:19)|16|17)(2:21|22))(2:23|24))(2:29|(2:31|32)(2:33|(2:35|27)(1:36)))|25|(5:28|13|(0)(0)|16|17)|27))|38|6|7|(0)(0)|25|(0)|27) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0094 A[Catch: Exception -> 0x009b, TRY_LEAVE, TryCatch #0 {Exception -> 0x009b, blocks: (B:12:0x002b, B:13:0x0086, B:19:0x0094, B:24:0x003b, B:25:0x0065, B:33:0x0051), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(eo2 eo2Var, spj spjVar) {
        ow0 ow0Var;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        sw0 sw0Var;
        tw0 a;
        sw0 sw0Var2;
        if (spjVar instanceof ow0) {
            ow0Var = (ow0) spjVar;
            int i2 = ow0Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ow0Var.f = i2 - Integer.MIN_VALUE;
                obj = ow0Var.d;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ow0Var.f;
                boolean z = false;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (this.b.a(eo2Var.a()) != null) {
                        return Boolean.TRUE;
                    }
                    nw0 nw0Var = this.a;
                    String b = eo2Var.b();
                    ow0Var.b = this;
                    ow0Var.c = eo2Var;
                    ow0Var.f = 1;
                    obj = nw0Var.a(b, ow0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    sw0Var = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        eo2Var = ow0Var.c;
                        sw0Var2 = ow0Var.b;
                        kotlin.a.a(obj);
                        if (sw0Var2.b.a(eo2Var.a()) == null) {
                            z = true;
                        } else {
                            eo2Var.a().name();
                        }
                        return Boolean.valueOf(z);
                    }
                    eo2Var = ow0Var.c;
                    sw0Var = ow0Var.b;
                    kotlin.a.a(obj);
                }
                a = eo2Var.a();
                ow0Var.b = sw0Var;
                ow0Var.c = eo2Var;
                ow0Var.f = 2;
                sw0Var.getClass();
                bdn bdnVar = bdn.a;
                if (myc0.k(wgl.c, new rw0((byte[]) obj, sw0Var, a, null), ow0Var) != coroutineSingletons) {
                    sw0Var2 = sw0Var;
                    if (sw0Var2.b.a(eo2Var.a()) == null) {
                    }
                    return Boolean.valueOf(z);
                }
                return coroutineSingletons;
            }
        }
        ow0Var = new ow0(this, spjVar);
        obj = ow0Var.d;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ow0Var.f;
        boolean z2 = false;
        if (i != 0) {
        }
        a = eo2Var.a();
        ow0Var.b = sw0Var;
        ow0Var.c = eo2Var;
        ow0Var.f = 2;
        sw0Var.getClass();
        bdn bdnVar2 = bdn.a;
        if (myc0.k(wgl.c, new rw0((byte[]) obj, sw0Var, a, null), ow0Var) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public sw0(nw0 nw0Var, ix0 ix0Var) {
        this.a = nw0Var;
        this.b = ix0Var;
    }
}
