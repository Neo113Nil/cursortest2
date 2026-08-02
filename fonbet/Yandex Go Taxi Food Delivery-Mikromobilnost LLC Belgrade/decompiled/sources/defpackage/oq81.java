package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.UserManager;
import kotlin.Result;

/* loaded from: classes7.dex */
public final class oq81 {
    public static SharedPreferences a(Context context, String str) {
        Object failure;
        try {
            failure = Boolean.valueOf(((UserManager) context.getSystemService("user")).isUserUnlocked());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object obj = Boolean.TRUE;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
        return !((Boolean) failure).booleanValue() ? context.createDeviceProtectedStorageContext().getSharedPreferences(str, 0) : context.getSharedPreferences(str, 0);
    }
}
