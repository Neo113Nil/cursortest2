package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BringIntoViewRequester.kt */
/* loaded from: classes11.dex */
public final class bd8 implements yc8 {
    public final ci50<cd8> a = new ci50<>(new cd8[16]);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0067 -> B:10:0x006a). Please report as a decompilation issue!!! */
    @Override // xsna.yc8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zhf0 zhf0Var, ContinuationImpl continuationImpl) {
        ad8 ad8Var;
        int i;
        zhf0 zhf0Var2;
        int i2;
        Object[] objArr;
        int i3;
        if (continuationImpl instanceof ad8) {
            ad8Var = (ad8) continuationImpl;
            int i4 = ad8Var.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ad8Var.label = i4 - Integer.MIN_VALUE;
                Object obj = ad8Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ad8Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ci50<cd8> ci50Var = this.a;
                    cd8[] cd8VarArr = ci50Var.b;
                    int i5 = ci50Var.d;
                    zhf0Var2 = zhf0Var;
                    i2 = i5;
                    objArr = cd8VarArr;
                    i3 = 0;
                    if (i3 < i2) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = ad8Var.I$1;
                    i3 = ad8Var.I$0;
                    objArr = (Object[]) ad8Var.L$1;
                    zhf0 zhf0Var3 = (zhf0) ad8Var.L$0;
                    kotlin.a.a(obj);
                    zhf0Var2 = zhf0Var3;
                    i3++;
                    if (i3 < i2) {
                        cd8 cd8Var = (cd8) objArr[i3];
                        com.vk.movika.sdk.android.defaultplayer.view.timeline.a aVar = new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(zhf0Var2, 10);
                        ad8Var.L$0 = zhf0Var2;
                        ad8Var.L$1 = objArr;
                        ad8Var.I$0 = i3;
                        ad8Var.I$1 = i2;
                        ad8Var.label = 1;
                        if (mc8.a(cd8Var, aVar, ad8Var) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        i3++;
                        if (i3 < i2) {
                            return s3q0.a;
                        }
                    }
                }
            }
        }
        ad8Var = new ad8(this, continuationImpl);
        Object obj2 = ad8Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ad8Var.label;
        if (i != 0) {
        }
    }
}
