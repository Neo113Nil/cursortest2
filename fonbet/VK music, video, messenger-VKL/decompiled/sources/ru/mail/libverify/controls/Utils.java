package ru.mail.libverify.controls;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import ru.mail.libverify.InternalApi;
import xsna.anj;

@InternalApi
/* loaded from: classes9.dex */
public class Utils {
    public static Handler uiHandler = new Handler(Looper.getMainLooper());

    public static boolean checkAllowedPermission(@NonNull String[] strArr, @NonNull String str) {
        for (String str2 : strArr) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasSelfPermission(@NonNull Context context, @NonNull String str) {
        try {
            return anj.a(context, str) == 0;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static void hideKeyboard(View view) {
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    private static boolean safeRequestFocus(View view) {
        if (view == null) {
            return false;
        }
        try {
            return view.requestFocus();
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public static void showKeyboard(boolean z, View view) {
        if (!z) {
            hideKeyboard(view);
        } else {
            safeRequestFocus(view);
            showKeyboardReliable(view);
        }
    }

    private static void showKeyboardDelayed(final View view, int i) {
        if (view != null) {
            uiHandler.postDelayed(new Runnable() { // from class: ru.mail.libverify.controls.Utils.1
                @Override // java.lang.Runnable
                public void run() {
                    Utils.showKeyboardSync(view);
                }
            }, i);
        }
    }

    private static void showKeyboardReliable(View view) {
        showKeyboardDelayed(view, 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void showKeyboardSync(View view) {
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
        }
    }

    private static void showKeyboard(View view) {
        showKeyboardDelayed(view, 10);
    }
}
