package xsna;

import android.text.Editable;
import android.text.TextWatcher;
import com.vk.core.view.search.ModernSearchView;

/* compiled from: ModernSearchView.kt */
/* loaded from: classes17.dex */
public final class m630 implements TextWatcher {
    public String b = "";
    public final /* synthetic */ ModernSearchView c;

    public m630(ModernSearchView modernSearchView) {
        this.c = modernSearchView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable != null) {
            String obj = editable.toString();
            if ((this.b.length() != 0 || obj.length() != 0) && (this.b.length() <= 0 || obj.length() <= 0)) {
                h94 h94Var = ModernSearchView.y;
                this.c.k();
            }
            this.b = obj;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
