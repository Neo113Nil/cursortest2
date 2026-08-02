package xsna;

import android.annotation.SuppressLint;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;

/* compiled from: InputConnectionCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes12.dex */
public final class m1x {
    public static l1x a(AppCompatEditText appCompatEditText, InputConnection inputConnection, EditorInfo editorInfo) {
        return new l1x(inputConnection, new vj0(appCompatEditText, 24));
    }
}
