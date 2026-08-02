package xsna;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import com.vk.auth.ui.VkAuthPasswordView;

/* compiled from: VkAuthPasswordView.kt */
/* loaded from: classes15.dex */
public final class rcu0 implements TextWatcher {
    public final /* synthetic */ VkAuthPasswordView b;

    public rcu0(VkAuthPasswordView vkAuthPasswordView) {
        this.b = vkAuthPasswordView;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b.d.setChecked(!(r1.c.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
