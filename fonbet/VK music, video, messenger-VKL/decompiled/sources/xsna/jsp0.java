package xsna;

import android.content.Context;
import java.io.File;
import kotlin.Result;

/* compiled from: TrustedHashUtils.kt */
/* loaded from: classes6.dex */
public final class jsp0 {
    public static final jsp0 a = new jsp0();

    public static boolean a(Context context) {
        Object failure;
        File file = new File(context.getFilesDir(), "onRestoreFinished2");
        try {
            failure = Boolean.valueOf(file.exists() && file.length() > 0);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object obj = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
        return ((Boolean) failure).booleanValue();
    }
}
