package xsna;

import android.content.Context;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import java.util.Collections;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rustore.sdk.pushclient.l.d$a;

/* loaded from: classes9.dex */
public final class apy0 {
    public final q5o a;

    public apy0(q5o q5oVar) {
        this.a = q5oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AppInfo appInfo, ContinuationImpl continuationImpl) {
        d$a d_a;
        int i;
        if (continuationImpl instanceof d$a) {
            d_a = (d$a) continuationImpl;
            int i2 = d_a.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d_a.c = i2 - Integer.MIN_VALUE;
                Object obj = d_a.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = d_a.c;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                q5o q5oVar = this.a;
                aay0 aay0Var = new aay0((Context) q5oVar.c, Collections.singletonList(appInfo), (Logger) q5oVar.b);
                d_a.c = 1;
                Object a = aay0Var.a(d_a);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        d_a = new d$a(this, continuationImpl);
        Object obj2 = d_a.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = d_a.c;
        if (i == 0) {
        }
    }
}
