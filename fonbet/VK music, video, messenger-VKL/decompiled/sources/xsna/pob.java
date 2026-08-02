package xsna;

import android.view.ViewTreeObserver;
import com.vk.im.ui.views.RichEditText;

/* compiled from: ChatClipsMsgSendVc.kt */
/* loaded from: classes2.dex */
public final class pob implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ RichEditText b;

    public pob(RichEditText richEditText) {
        this.b = richEditText;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            RichEditText richEditText = this.b;
            if (richEditText.isFocused()) {
                richEditText.post(new qd0(richEditText, 4));
            }
            richEditText.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
    }
}
