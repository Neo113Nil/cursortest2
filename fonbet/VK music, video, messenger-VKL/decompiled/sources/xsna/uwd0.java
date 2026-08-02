package xsna;

import android.text.Editable;
import android.widget.ImageButton;
import com.google.android.material.chip.Chip;
import com.vk.core.view.components.button.VkButton;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: ProfileFriendsFragment.kt */
/* loaded from: classes4.dex */
public final class uwd0 extends rno0 {
    public final /* synthetic */ VkButton b;
    public final /* synthetic */ ImageButton c;
    public final /* synthetic */ LinkedHashMap d;

    public uwd0(VkButton vkButton, ImageButton imageButton, LinkedHashMap linkedHashMap) {
        this.b = vkButton;
        this.c = imageButton;
        this.d = linkedHashMap;
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
        Iterator it = this.d.entrySet().iterator();
        while (it.hasNext()) {
            ((Chip) ((Map.Entry) it.next()).getValue()).setChecked(false);
        }
    }
}
