package xsna;

import com.vk.dto.common.id.UserId;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AuthorsChannelRepository.kt */
/* loaded from: classes16.dex */
public final class ie5 {
    public final zqu a;

    public ie5(zqu zquVar) {
        this.a = zquVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(UserId userId, String str, String str2, ContinuationImpl continuationImpl) {
        ee5 ee5Var;
        int i;
        if (continuationImpl instanceof ee5) {
            ee5Var = (ee5) continuationImpl;
            int i2 = ee5Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ee5Var.label = i2 - Integer.MIN_VALUE;
                Object obj = ee5Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ee5Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    fe5 fe5Var = new fe5(this, userId, str2, str, null);
                    ee5Var.L$0 = null;
                    ee5Var.L$1 = null;
                    ee5Var.L$2 = null;
                    ee5Var.label = 1;
                    obj = myc0.k(b, fe5Var, ee5Var);
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
        ee5Var = new ee5(this, continuationImpl);
        Object obj2 = ee5Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ee5Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(UserId userId, String str, String str2, ContinuationImpl continuationImpl) {
        ge5 ge5Var;
        int i;
        if (continuationImpl instanceof ge5) {
            ge5Var = (ge5) continuationImpl;
            int i2 = ge5Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ge5Var.label = i2 - Integer.MIN_VALUE;
                Object obj = ge5Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ge5Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    he5 he5Var = new he5(this, userId, str2, str, null);
                    ge5Var.L$0 = null;
                    ge5Var.L$1 = null;
                    ge5Var.L$2 = null;
                    ge5Var.label = 1;
                    obj = myc0.k(b, he5Var, ge5Var);
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
        ge5Var = new ge5(this, continuationImpl);
        Object obj2 = ge5Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ge5Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }
}
