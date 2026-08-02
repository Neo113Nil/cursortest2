package xsna;

import com.vk.core.snackbar.HideReason;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.acn;
import xsna.q7k0;

/* compiled from: VkSnackbarHost.kt */
/* loaded from: classes17.dex */
public final class dlv0 {
    public final wi50 a = bay.a();
    public final wh50 b = androidx.compose.runtime.k.b(null);

    public static /* synthetic */ Object d(dlv0 dlv0Var, String str, q7k0 q7k0Var, spj spjVar, int i) {
        if ((i & 2) != 0) {
            q7k0Var = new q7k0.b(4000L);
        }
        return dlv0Var.c(str, q7k0Var, acn.e.a, 0.7f, spjVar);
    }

    public final void a() {
        l7k0 b = b();
        if (b != null) {
            HideReason hideReason = HideReason.Manual;
            if (b.h.isActive()) {
                Object obj = flv0.a;
                flv0.b(b.b, hideReason);
            }
        }
    }

    public final l7k0 b() {
        return (l7k0) ((zak0) this.b).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int, xsna.ui50] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, q7k0 q7k0Var, acn acnVar, float f, spj spjVar) {
        alv0 alv0Var;
        CoroutineSingletons coroutineSingletons;
        ?? r3;
        wh50 wh50Var;
        float f2;
        String str2;
        acn acnVar2;
        ui50 ui50Var;
        boolean z;
        q7k0 q7k0Var2;
        lq9 lq9Var;
        ui50 ui50Var2;
        try {
            try {
                if (spjVar instanceof alv0) {
                    alv0Var = (alv0) spjVar;
                    int i = alv0Var.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        alv0Var.label = i - Integer.MIN_VALUE;
                        Object obj = alv0Var.result;
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        r3 = alv0Var.label;
                        wh50Var = this.b;
                        if (r3 != 0) {
                            kotlin.a.a(obj);
                            wi50 wi50Var = this.a;
                            if (wi50Var.e()) {
                                a();
                            }
                            alv0Var.L$0 = str;
                            alv0Var.L$1 = q7k0Var;
                            alv0Var.L$2 = acnVar;
                            alv0Var.L$3 = wi50Var;
                            f2 = f;
                            alv0Var.F$0 = f2;
                            alv0Var.Z$0 = false;
                            alv0Var.label = 1;
                            if (wi50Var.b(alv0Var) != coroutineSingletons) {
                                str2 = str;
                                acnVar2 = acnVar;
                                ui50Var = wi50Var;
                                z = false;
                                q7k0Var2 = q7k0Var;
                            }
                            return coroutineSingletons;
                        }
                        if (r3 != 1) {
                            if (r3 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ui50Var2 = (ui50) alv0Var.L$3;
                            try {
                                kotlin.a.a(obj);
                                ((zak0) wh50Var).setValue(null);
                                s3q0 s3q0Var = s3q0.a;
                                ui50Var2.c(null);
                                return s3q0.a;
                            } catch (Throwable th) {
                                th = th;
                                ((zak0) wh50Var).setValue(null);
                                throw th;
                            }
                        }
                        boolean z2 = alv0Var.Z$0;
                        float f3 = alv0Var.F$0;
                        ui50Var = (ui50) alv0Var.L$3;
                        acn acnVar3 = (acn) alv0Var.L$2;
                        q7k0Var2 = (q7k0) alv0Var.L$1;
                        str2 = (String) alv0Var.L$0;
                        kotlin.a.a(obj);
                        z = z2;
                        acnVar2 = acnVar3;
                        f2 = f3;
                        alv0Var.L$0 = str2;
                        alv0Var.L$1 = q7k0Var2;
                        alv0Var.L$2 = acnVar2;
                        alv0Var.L$3 = ui50Var;
                        alv0Var.L$4 = alv0Var;
                        alv0Var.F$0 = f2;
                        alv0Var.Z$0 = z;
                        alv0Var.label = 2;
                        lq9Var = new lq9(1, s7s0.c(alv0Var));
                        lq9Var.o();
                        clv0 clv0Var = new clv0(this, str2, acnVar2, f2, z, lq9Var);
                        Object obj2 = flv0.a;
                        flv0.i(clv0Var, q7k0Var2.getDuration());
                        lq9Var.r(new blv0(clv0Var));
                        if (lq9Var.n() != coroutineSingletons) {
                            ui50Var2 = ui50Var;
                            ((zak0) wh50Var).setValue(null);
                            s3q0 s3q0Var2 = s3q0.a;
                            ui50Var2.c(null);
                            return s3q0.a;
                        }
                        return coroutineSingletons;
                    }
                }
                alv0Var.L$0 = str2;
                alv0Var.L$1 = q7k0Var2;
                alv0Var.L$2 = acnVar2;
                alv0Var.L$3 = ui50Var;
                alv0Var.L$4 = alv0Var;
                alv0Var.F$0 = f2;
                alv0Var.Z$0 = z;
                alv0Var.label = 2;
                lq9Var = new lq9(1, s7s0.c(alv0Var));
                lq9Var.o();
                clv0 clv0Var2 = new clv0(this, str2, acnVar2, f2, z, lq9Var);
                Object obj22 = flv0.a;
                flv0.i(clv0Var2, q7k0Var2.getDuration());
                lq9Var.r(new blv0(clv0Var2));
                if (lq9Var.n() != coroutineSingletons) {
                }
                return coroutineSingletons;
            } catch (Throwable th2) {
                th = th2;
                ((zak0) wh50Var).setValue(null);
                throw th;
            }
            if (r3 != 0) {
            }
        } catch (Throwable th3) {
            r3.c(null);
            throw th3;
        }
        alv0Var = new alv0(this, spjVar);
        Object obj3 = alv0Var.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        r3 = alv0Var.label;
        wh50Var = this.b;
    }
}
