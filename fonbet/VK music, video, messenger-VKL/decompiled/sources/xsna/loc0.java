package xsna;

import android.text.Editable;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final class loc0 extends rno0 {
    public final /* synthetic */ enc0 b;

    public loc0(enc0 enc0Var) {
        this.b = enc0Var;
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ucp ucpVar = ucp.a;
        ucp.i(editable);
        enc0 enc0Var = this.b;
        dhc0 dhc0Var = enc0Var.h0;
        dhc0Var.afterTextChanged(editable);
        enc0Var.U.invoke(new PostingAction.Editing.Text.Changed(dhc0Var.d.b(), true));
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b.h0.getClass();
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b.h0.onTextChanged(charSequence, i, i2, i3);
    }
}
