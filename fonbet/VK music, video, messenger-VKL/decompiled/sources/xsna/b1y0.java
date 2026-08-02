package xsna;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: WriteBarController.kt */
/* loaded from: classes16.dex */
public final class b1y0 implements TextWatcher {
    public final /* synthetic */ com.vk.channels.impl.comments.h b;

    public b1y0(com.vk.channels.impl.comments.h hVar) {
        this.b = hVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.b.g.afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b.g.getClass();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b.g.onTextChanged(charSequence, i, i2, i3);
    }
}
