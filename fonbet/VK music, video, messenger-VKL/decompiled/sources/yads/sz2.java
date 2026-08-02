package yads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.UserManager;
import com.vk.core.preference.Preference;
import kotlin.Result;

/* loaded from: classes10.dex */
public final class sz2 {
    public static SharedPreferences a(sz2 sz2Var, Context context, String str) {
        Object failure;
        sz2Var.getClass();
        try {
            failure = Boolean.valueOf(((UserManager) context.getSystemService("user")).isUserUnlocked());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object obj = Boolean.TRUE;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
        return !((Boolean) failure).booleanValue() ? Preference.h(context.createDeviceProtectedStorageContext(), 0, str) : Preference.h(context, 0, str);
    }
}
