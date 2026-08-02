package xsna;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: NonTouchScrollingLogic.kt */
/* loaded from: classes11.dex */
public abstract class j670 {
    public final zhh0 a;
    public final AdaptedFunctionReference b;
    public azl c;
    public boolean d;
    public final wxm e = new wxm();

    /* JADX WARN: Multi-variable type inference failed */
    public j670(zhh0 zhh0Var, wzs<? super jmr0, ? super spj<? super s3q0>, ? extends Object> wzsVar, azl azlVar) {
        this.a = zhh0Var;
        this.b = (AdaptedFunctionReference) wzsVar;
        this.c = azlVar;
    }

    public static void a(plb0 plb0Var) {
        List<xlb0> list = plb0Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(wzs wzsVar, ContinuationImpl continuationImpl) {
        h670 h670Var;
        int i;
        if (continuationImpl instanceof h670) {
            h670Var = (h670) continuationImpl;
            int i2 = h670Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h670Var.label = i2 - Integer.MIN_VALUE;
                Object obj = h670Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = h670Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    this.d = true;
                    i670 i670Var = new i670(this, wzsVar, null);
                    h670Var.label = 1;
                    if (whn0.c(i670Var, h670Var) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                this.d = false;
                return s3q0.a;
            }
        }
        h670Var = new h670(this, continuationImpl);
        Object obj2 = h670Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = h670Var.label;
        if (i != 0) {
        }
        this.d = false;
        return s3q0.a;
    }
}
