package androidx.core.view.inputmethod;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.appcompat.widget.AppCompatEditText;
import defpackage.h2t;
import defpackage.i4u;
import defpackage.jyv;
import defpackage.xen;
import defpackage.y5e;

/* loaded from: classes10.dex */
public final class a {
    @Deprecated
    public a() {
    }

    public static InputConnection a(final InputConnection inputConnection, EditorInfo editorInfo, final jyv jyvVar) {
        y5e.H(editorInfo, "editorInfo must be non-null");
        final boolean z = false;
        return new InputConnectionWrapper(inputConnection, z) { // from class: androidx.core.view.inputmethod.InputConnectionCompat$1
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
                if (jyvVar.e(inputContentInfo == null ? null : new i4u(new h2t(inputContentInfo)), i, bundle)) {
                    return true;
                }
                return super.commitContent(inputContentInfo, i, bundle);
            }
        };
    }

    public static InputConnection b(AppCompatEditText appCompatEditText, InputConnection inputConnection, EditorInfo editorInfo) {
        return a(inputConnection, editorInfo, new xen(22, appCompatEditText));
    }
}
