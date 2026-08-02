package yads;

import android.app.Activity;
import android.os.Build;
import kotlin.Result;

/* loaded from: classes10.dex */
public abstract class jb2 {
    public static gb2 a(Activity activity, w1 w1Var) {
        Object failure;
        try {
            failure = Build.VERSION.SDK_INT >= 33 ? new ib2(activity, w1Var) : new hb2();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            failure = new hb2();
        }
        return (gb2) failure;
    }
}
