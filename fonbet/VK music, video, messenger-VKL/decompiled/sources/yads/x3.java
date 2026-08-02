package yads;

import android.content.Context;
import android.view.View;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.spj;

/* loaded from: classes10.dex */
public final class x3 implements y3 {
    public final ov2 a;
    public final v9 b;
    public final d4 c;
    public final v02 d;
    public final t63 e;
    public final za f;
    public final a02 g;
    public final n93 h;
    public final s5 i;
    public final v3 j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ x3(Context context, ov2 ov2Var, v9 v9Var, d4 d4Var, v02 v02Var, t63 t63Var) {
        this(ov2Var, v9Var, d4Var, v02Var, t63Var, r6, new a02(context, d4Var, ov2Var, v9Var), new n93(r6), new s5(v02Var), new v3());
        za zaVar = new za(context, ov2Var, d4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v0, types: [yads.v0] */
    /* JADX WARN: Type inference failed for: r8v2, types: [yads.pb2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(View view, jg1 jg1Var, v0 v0Var, l52 l52Var, spj spjVar) {
        w3 w3Var;
        int i;
        x3 x3Var;
        l52 l52Var2;
        String str;
        if (spjVar instanceof w3) {
            w3Var = (w3) spjVar;
            int i2 = w3Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w3Var.g = i2 - Integer.MIN_VALUE;
                Object obj = w3Var.e;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = w3Var.g;
                if (i != 0) {
                    kotlin.a.a(obj);
                    List list = jg1Var.a;
                    w3Var.b = this;
                    w3Var.c = jg1Var;
                    w3Var.d = l52Var;
                    w3Var.g = 1;
                    obj = v0Var.a(view, list, w3Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    x3Var = this;
                    l52Var2 = l52Var;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r8 = w3Var.d;
                    jg1Var = w3Var.c;
                    x3Var = w3Var.b;
                    kotlin.a.a(obj);
                    l52Var2 = r8;
                }
                p01 p01Var = (p01) obj;
                str = jg1Var.d;
                if (str != null || str.length() <= 0) {
                    str = null;
                }
                v3 v3Var = x3Var.j;
                th2 th2Var = p01Var.b;
                v3Var.getClass();
                x3Var.h.a(jg1Var.c, (str != null || th2Var == null) ? str == null ? vu.a : th2Var != null ? new uu(th2Var) : wu.a : xu.a);
                if (str != null) {
                    l52Var2.a(str);
                }
                return p01Var;
            }
        }
        w3Var = new w3(this, spjVar);
        Object obj2 = w3Var.e;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = w3Var.g;
        if (i != 0) {
        }
        p01 p01Var2 = (p01) obj2;
        str = jg1Var.d;
        if (str != null) {
        }
        str = null;
        v3 v3Var2 = x3Var.j;
        th2 th2Var2 = p01Var2.b;
        v3Var2.getClass();
        x3Var.h.a(jg1Var.c, (str != null || th2Var2 == null) ? str == null ? vu.a : th2Var2 != null ? new uu(th2Var2) : wu.a : xu.a);
        if (str != null) {
        }
        return p01Var2;
    }

    public x3(ov2 ov2Var, v9 v9Var, d4 d4Var, v02 v02Var, t63 t63Var, za zaVar, a02 a02Var, n93 n93Var, s5 s5Var, v3 v3Var) {
        this.a = ov2Var;
        this.b = v9Var;
        this.c = d4Var;
        this.d = v02Var;
        this.e = t63Var;
        this.f = zaVar;
        this.g = a02Var;
        this.h = n93Var;
        this.i = s5Var;
        this.j = v3Var;
    }
}
