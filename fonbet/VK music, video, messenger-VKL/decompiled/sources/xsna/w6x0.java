package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VolumeButton.kt */
/* loaded from: classes16.dex */
public final class w6x0 implements vbp0 {
    public final Context a;
    public final a7x0 b;
    public final VkButton c;

    public w6x0(Context context, a7x0 a7x0Var) {
        int i;
        this.a = context;
        this.b = a7x0Var;
        VkButton vkButton = new VkButton(context, null, 6, 0);
        boolean b = a7x0Var.b();
        if (b) {
            i = R.drawable.vk_icon_volume_24;
        } else {
            if (b) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.vk_icon_mute_cross_16;
        }
        vkButton.a5(true, Integer.valueOf(i));
        vkButton.setAppearance(VkButton.Appearance.Overlay);
        vkButton.setMode(VkButton.Mode.Secondary);
        vkButton.setSize(VkButton.Size.Medium);
        vkButton.setBackgroundTintList(ColorStateList.valueOf(dhr0.t.c(R.attr.vk_ui_transparent)));
        vkButton.setOnClickListener(new kn9(this, 15));
        ConstraintLayout.b bVar = new ConstraintLayout.b(e3m.a(R.dimen.vk_ui_cell_height, vkButton.getContext()), e3m.a(R.dimen.vk_ui_cell_height, vkButton.getContext()));
        bVar.i = 0;
        bVar.v = 0;
        vkButton.setLayoutParams(bVar);
        a(vkButton, a7x0Var.b());
        this.c = vkButton;
    }

    public final void a(VkButton vkButton, boolean z) {
        int i;
        String string;
        if (z) {
            i = R.drawable.vk_icon_volume_24;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.vk_icon_mute_cross_16;
        }
        Integer valueOf = Integer.valueOf(i);
        int[] iArr = VkButton.W;
        vkButton.a5(true, valueOf);
        Context context = this.a;
        if (z) {
            string = context.getString(R.string.topshelf_talkback_mute);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            string = context.getString(R.string.topshelf_talkback_unmute);
        }
        vkButton.setContentDescription(string);
    }

    @Override // xsna.vbp0
    public final View getView() {
        return this.c;
    }

    @Override // xsna.vbp0
    public final void destroy() {
    }
}
