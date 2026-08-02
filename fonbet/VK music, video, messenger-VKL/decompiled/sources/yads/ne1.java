package yads;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes10.dex */
public final class ne1 {
    public static void a(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
