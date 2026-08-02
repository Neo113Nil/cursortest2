package xsna;

import com.vk.dto.hints.HintId;
import io.jsonwebtoken.JwtParser;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PublishSharedPrefsImpl.kt */
/* loaded from: classes7.dex */
public final class pee0 implements kee0 {
    public final k7b a;

    public pee0(k7b k7bVar) {
        this.a = k7bVar;
    }

    public static final int c(pee0 pee0Var, String str) {
        k7b k7bVar = pee0Var.a;
        return k7bVar.a().getInt(k7bVar.b() + JwtParser.SEPARATOR_CHAR + str, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.kee0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(HintId hintId, ContinuationImpl continuationImpl) {
        lee0 lee0Var;
        int i;
        if (continuationImpl instanceof lee0) {
            lee0Var = (lee0) continuationImpl;
            int i2 = lee0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lee0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = lee0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lee0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    mee0 mee0Var = new mee0(this, hintId, null);
                    lee0Var.L$0 = null;
                    lee0Var.label = 1;
                    obj = myc0.k(b, mee0Var, lee0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        lee0Var = new lee0(this, continuationImpl);
        Object obj2 = lee0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lee0Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.kee0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(HintId hintId, ContinuationImpl continuationImpl) {
        nee0 nee0Var;
        int i;
        if (continuationImpl instanceof nee0) {
            nee0Var = (nee0) continuationImpl;
            int i2 = nee0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nee0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = nee0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nee0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    oee0 oee0Var = new oee0(this, hintId, null);
                    nee0Var.L$0 = null;
                    nee0Var.label = 1;
                    obj = myc0.k(b, oee0Var, nee0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        nee0Var = new nee0(this, continuationImpl);
        Object obj2 = nee0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nee0Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }
}
