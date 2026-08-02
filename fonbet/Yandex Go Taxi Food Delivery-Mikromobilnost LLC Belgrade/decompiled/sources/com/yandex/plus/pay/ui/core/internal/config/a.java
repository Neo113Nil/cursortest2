package com.yandex.plus.pay.ui.core.internal.config;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.internal.model.PlusPayUserAvatarInfo;
import defpackage.add0;
import defpackage.mdd0;
import defpackage.ndd0;
import defpackage.ny61;
import defpackage.oyr;
import java.io.Serializable;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final add0 a;
    public final mdd0 b;

    public a(add0 add0Var, mdd0 mdd0Var) {
        this.a = add0Var;
        this.b = mdd0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:23|24))(3:25|26|(1:28))|12|13|(1:15)|16|(1:18)|19|20))|36|6|7|(0)(0)|12|13|(0)|16|(0)|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0036, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        r0 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0034, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        r0 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(ContinuationImpl continuationImpl) {
        PlusPayAvatarProvider$getUserAvatarUrl$1 plusPayAvatarProvider$getUserAvatarUrl$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof PlusPayAvatarProvider$getUserAvatarUrl$1) {
            plusPayAvatarProvider$getUserAvatarUrl$1 = (PlusPayAvatarProvider$getUserAvatarUrl$1) continuationImpl;
            int i2 = plusPayAvatarProvider$getUserAvatarUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusPayAvatarProvider$getUserAvatarUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusPayAvatarProvider$getUserAvatarUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusPayAvatarProvider$getUserAvatarUrl$1.label;
                if (i != 0) {
                    b.b(obj);
                    com.yandex.plus.pay.internal.feature.user.b bVar = (com.yandex.plus.pay.internal.feature.user.b) ((com.yandex.plus.pay.internal.b) this.a).i.getValue();
                    plusPayAvatarProvider$getUserAvatarUrl$1.L$0 = null;
                    plusPayAvatarProvider$getUserAvatarUrl$1.L$1 = null;
                    plusPayAvatarProvider$getUserAvatarUrl$1.L$2 = null;
                    plusPayAvatarProvider$getUserAvatarUrl$1.I$0 = 0;
                    plusPayAvatarProvider$getUserAvatarUrl$1.I$1 = 0;
                    plusPayAvatarProvider$getUserAvatarUrl$1.label = 1;
                    obj = bVar.a(plusPayAvatarProvider$getUserAvatarUrl$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                Serializable serializable = ((PlusPayUserAvatarInfo) obj).getAvatarUrl();
                a = Result.a(serializable);
                if (a != null) {
                    mdd0 mdd0Var = this.b;
                    mdd0Var.getClass();
                    ((ndd0) mdd0Var).b(LogPriority.DEBUG, oyr.f('.', "PAY", "COMMON"), "Could't get user avatar", a);
                }
                return serializable instanceof Result.Failure ? null : serializable;
            }
        }
        plusPayAvatarProvider$getUserAvatarUrl$1 = new PlusPayAvatarProvider$getUserAvatarUrl$1(this, continuationImpl);
        Object obj2 = plusPayAvatarProvider$getUserAvatarUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPayAvatarProvider$getUserAvatarUrl$1.label;
        if (i != 0) {
        }
        Serializable serializable2 = ((PlusPayUserAvatarInfo) obj2).getAvatarUrl();
        a = Result.a(serializable2);
        if (a != null) {
        }
        return serializable2 instanceof Result.Failure ? null : serializable2;
    }
}
