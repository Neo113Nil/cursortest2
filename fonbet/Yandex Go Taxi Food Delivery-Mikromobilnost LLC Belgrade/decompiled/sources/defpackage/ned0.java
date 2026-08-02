package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import com.yandex.plus.pay.common.api.model.PlusPayPlatform;
import java.util.Locale;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class ned0 {
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static PlusPayPlatform a(Context context, boolean z) {
        Object failure;
        Integer valueOf;
        String string = context.getString(xyh0.pay_sdk_platform_header_value);
        Locale locale = Locale.ROOT;
        String lowerCase = string.toLowerCase(locale);
        if (lowerCase.equals("Android".toLowerCase(locale))) {
            return PlusPayPlatform.ANDROID;
        }
        if (lowerCase.equals("AndroidTV".toLowerCase(locale))) {
            return PlusPayPlatform.ANDROID_TV;
        }
        if (z) {
            return PlusPayPlatform.ANDROID;
        }
        try {
            UiModeManager uiModeManager = (UiModeManager) context.getSystemService(UiModeManager.class);
            valueOf = uiModeManager != null ? Integer.valueOf(uiModeManager.getCurrentModeType()) : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (valueOf != null && valueOf.intValue() == 1) {
            failure = PlusPayPlatform.ANDROID;
            if (Result.a(failure) != null) {
                failure = PlusPayPlatform.ANDROID;
            }
            return (PlusPayPlatform) failure;
        }
        if (valueOf.intValue() == 4) {
            failure = PlusPayPlatform.ANDROID_TV;
            if (Result.a(failure) != null) {
            }
            return (PlusPayPlatform) failure;
        }
        failure = PlusPayPlatform.ANDROID;
        if (Result.a(failure) != null) {
        }
        return (PlusPayPlatform) failure;
    }

    public static /* synthetic */ PlusPayPlatform b(ned0 ned0Var, Context context) {
        ned0Var.getClass();
        return a(context, false);
    }
}
