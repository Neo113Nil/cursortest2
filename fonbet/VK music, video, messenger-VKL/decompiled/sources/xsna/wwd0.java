package xsna;

import android.text.Editable;
import android.widget.ImageButton;
import com.vk.core.view.components.button.VkButton;

/* compiled from: ProfileFriendsFragment.kt */
/* loaded from: classes4.dex */
public final class wwd0 extends rno0 {
    public final /* synthetic */ VkButton b;
    public final /* synthetic */ ImageButton c;

    public wwd0(VkButton vkButton, ImageButton imageButton) {
        this.b = vkButton;
        this.c = imageButton;
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ucp ucpVar = ucp.a;
        ucp.i(editable);
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z = drm0.p0(charSequence).length() > 0;
        this.b.setEnabled(z);
        bwt0.p0(this.c, z);
    }
}
