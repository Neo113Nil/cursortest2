package androidx.compose.foundation.relocation;

import defpackage.ny61;
import defpackage.pk6;
import defpackage.rk6;
import defpackage.sk6;
import defpackage.wz40;
import defpackage.zii0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class a implements pk6 {
    public final wz40 a = new wz40(new sk6[16]);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0061 -> B:10:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zii0 zii0Var, ContinuationImpl continuationImpl) {
        BringIntoViewRequesterImpl$bringIntoView$1 bringIntoViewRequesterImpl$bringIntoView$1;
        int i;
        int i2;
        Object[] objArr;
        zii0 zii0Var2;
        int i3;
        if (continuationImpl instanceof BringIntoViewRequesterImpl$bringIntoView$1) {
            bringIntoViewRequesterImpl$bringIntoView$1 = (BringIntoViewRequesterImpl$bringIntoView$1) continuationImpl;
            int i4 = bringIntoViewRequesterImpl$bringIntoView$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bringIntoViewRequesterImpl$bringIntoView$1.label = i4 - Integer.MIN_VALUE;
                Object obj = bringIntoViewRequesterImpl$bringIntoView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bringIntoViewRequesterImpl$bringIntoView$1.label;
                int i5 = 0;
                if (i != 0) {
                    kotlin.b.b(obj);
                    wz40 wz40Var = this.a;
                    Object[] objArr2 = wz40Var.a;
                    i2 = wz40Var.c;
                    objArr = objArr2;
                    zii0Var2 = zii0Var;
                    i3 = 0;
                    if (i3 < i2) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = bringIntoViewRequesterImpl$bringIntoView$1.I$1;
                    i3 = bringIntoViewRequesterImpl$bringIntoView$1.I$0;
                    objArr = (Object[]) bringIntoViewRequesterImpl$bringIntoView$1.L$1;
                    zii0 zii0Var3 = (zii0) bringIntoViewRequesterImpl$bringIntoView$1.L$0;
                    kotlin.b.b(obj);
                    zii0Var2 = zii0Var3;
                    i3++;
                    if (i3 < i2) {
                        sk6 sk6Var = (sk6) objArr[i3];
                        rk6 rk6Var = new rk6(i5, zii0Var2);
                        bringIntoViewRequesterImpl$bringIntoView$1.L$0 = zii0Var2;
                        bringIntoViewRequesterImpl$bringIntoView$1.L$1 = objArr;
                        bringIntoViewRequesterImpl$bringIntoView$1.I$0 = i3;
                        bringIntoViewRequesterImpl$bringIntoView$1.I$1 = i2;
                        bringIntoViewRequesterImpl$bringIntoView$1.label = 1;
                        if (androidx.compose.ui.relocation.a.a(sk6Var, rk6Var, bringIntoViewRequesterImpl$bringIntoView$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        i3++;
                        if (i3 < i2) {
                            return zy11.a;
                        }
                    }
                }
            }
        }
        bringIntoViewRequesterImpl$bringIntoView$1 = new BringIntoViewRequesterImpl$bringIntoView$1(this, continuationImpl);
        Object obj2 = bringIntoViewRequesterImpl$bringIntoView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bringIntoViewRequesterImpl$bringIntoView$1.label;
        int i52 = 0;
        if (i != 0) {
        }
    }
}
