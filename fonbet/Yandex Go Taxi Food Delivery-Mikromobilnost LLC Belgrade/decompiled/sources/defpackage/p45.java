package defpackage;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.core.benchmark.b;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Result;

/* loaded from: classes8.dex */
public abstract class p45 extends yx4 {
    public p45() {
        super(bzf0.class);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|8|(2:10|11)(1:13))(1:17))(1:19)|18|6|7|8|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        r3 = new kotlin.Result.Failure(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.yx4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ll5 ll5Var, pl5 pl5Var, Map map) {
        String str;
        Throwable a;
        bzf0 bzf0Var = (bzf0) pl5Var;
        TimeUnit timeUnit = bzf0Var.b;
        int i = o45.a[timeUnit.ordinal()];
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        if (i == 1) {
            str = " (ns)";
        } else {
            if (i != 2) {
                str = "";
                d(ll5Var, ((b) ll5Var).a + str, bzf0Var, timeUnit);
                Object failure = zy11.a;
                a = Result.a(failure);
                if (a == null) {
                    skd0.h(PlusLogTag.SDK, "Performance histogram sending is failed with exception!", a);
                    return;
                }
                return;
            }
            str = " (us)";
        }
        timeUnit = timeUnit2;
        d(ll5Var, ((b) ll5Var).a + str, bzf0Var, timeUnit);
        Object failure2 = zy11.a;
        a = Result.a(failure2);
        if (a == null) {
        }
    }

    public abstract void d(ll5 ll5Var, String str, bzf0 bzf0Var, TimeUnit timeUnit);
}
