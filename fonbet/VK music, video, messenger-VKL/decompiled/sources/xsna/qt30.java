package xsna;

import android.text.Editable;
import android.text.TextWatcher;
import com.vk.im.ui.views.msg.MsgPartSnippetView;

/* compiled from: MsgPartSnippetView.java */
/* loaded from: classes2.dex */
public final class qt30 implements TextWatcher {
    public final /* synthetic */ MsgPartSnippetView b;

    public qt30(MsgPartSnippetView msgPartSnippetView) {
        this.b = msgPartSnippetView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        MsgPartSnippetView msgPartSnippetView = this.b;
        msgPartSnippetView.t.removeCallbacks(msgPartSnippetView.v);
        msgPartSnippetView.t.postDelayed(msgPartSnippetView.v, 100L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
