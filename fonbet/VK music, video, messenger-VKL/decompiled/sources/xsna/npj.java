package xsna;

import android.content.ContextWrapper;
import kotlin.Result;

/* compiled from: ContextWrapperExt.kt */
/* loaded from: classes.dex */
public final class npj {
    public static final int a(ContextWrapper contextWrapper) {
        Object failure;
        try {
            failure = Integer.valueOf(contextWrapper.getThemeResId());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            failure = -1;
        }
        return ((Number) failure).intValue();
    }
}
