package xsna;

import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.stickers.VmojiAvatarModel;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: VmojiSwitcherHolder.kt */
/* loaded from: classes6.dex */
public final class obw0 extends yr6<pbw0> {
    public final g3l0 l;
    public final VKImageView m;
    public final SwitchCompat n;

    public obw0(g3l0 g3l0Var, ViewGroup viewGroup) {
        super(R.layout.sticker_vmoji_switch_item, viewGroup);
        this.l = g3l0Var;
        this.m = (VKImageView) this.itemView.findViewById(R.id.vmoji_view);
        this.n = (SwitchCompat) this.itemView.findViewById(R.id.switch_view);
    }

    @Override // xsna.yr6
    /* renamed from: i6, reason: merged with bridge method [inline-methods] */
    public final void i6(pbw0 pbw0Var) {
        ImageSize Cb;
        ImageSize Cb2;
        VmojiAvatarModel vmojiAvatarModel = pbw0Var.b;
        boolean z = pbw0Var.c;
        SwitchCompat switchCompat = this.n;
        switchCompat.setChecked(z);
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.nbw0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                obw0.this.l.k0(z2);
            }
        });
        String str = null;
        if (dhr0.M()) {
            Image image = vmojiAvatarModel.d;
            if (image != null && (Cb2 = image.Cb(cn70.b(40), false, false)) != null) {
                str = Cb2.d.d;
            }
        } else {
            Image image2 = vmojiAvatarModel.c;
            if (image2 != null && (Cb = image2.Cb(cn70.b(40), false, false)) != null) {
                str = Cb.d.d;
            }
        }
        this.m.s0(str);
    }
}
