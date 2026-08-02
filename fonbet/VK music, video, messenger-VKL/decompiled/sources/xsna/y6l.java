package xsna;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import kotlin.Result;

/* compiled from: DebugStrings.kt */
/* loaded from: classes11.dex */
public final class y6l {
    public static final y6l a = new y6l();
    public static bpn0 b;

    public static final String a(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static void b(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof zsx0) {
                editorInfo.hintText = ((zsx0) parent).a();
                return;
            }
        }
    }

    public static final String c(spj spjVar) {
        Object failure;
        if (spjVar instanceof mcn) {
            return ((mcn) spjVar).toString();
        }
        try {
            failure = spjVar + '@' + a(spjVar);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            failure = spjVar.getClass().getName() + '@' + a(spjVar);
        }
        return (String) failure;
    }
}
