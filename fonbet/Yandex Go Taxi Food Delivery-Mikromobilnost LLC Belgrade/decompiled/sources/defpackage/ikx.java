package defpackage;

import android.view.KeyEvent;

/* loaded from: classes4.dex */
public interface ikx {
    tt5 getBinaryMessenger();

    boolean onTextInputKeyEvent(KeyEvent keyEvent);

    void redispatch(KeyEvent keyEvent);
}
