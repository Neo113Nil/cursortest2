package xsna;

import android.content.res.ColorStateList;
import android.view.View;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.clips.morphing.AudioEffectType;
import com.vkontakte.android.R;

/* compiled from: AudioEffectHolder.kt */
/* loaded from: classes16.dex */
public final class bn4 extends hf6<cn4> {
    public final izs<Integer, s3q0> m;
    public final VkImageSimple n;
    public final VkText o;

    public bn4(View view, q8 q8Var) {
        super(view);
        this.m = q8Var;
        VkImageSimple vkImageSimple = (VkImageSimple) this.itemView.findViewById(R.id.photo);
        this.n = vkImageSimple;
        this.o = (VkText) this.itemView.findViewById(R.id.subtitle);
        vkImageSimple.setClipToOutline(true);
        jjc.g(this.itemView, new com.vk.movika.sdk.base.observable.e(this, 9));
    }

    @Override // xsna.hf6
    public final void W5(cn4 cn4Var) {
        cn4 cn4Var2 = cn4Var;
        int i = cn4Var2.d;
        VkImageSimple vkImageSimple = this.n;
        vkImageSimple.setImageResource(i);
        if (cn4Var2.a == AudioEffectType.DEFAULT) {
            vkImageSimple.setImageTintList(ColorStateList.valueOf(-1));
        } else {
            vkImageSimple.setImageTintList(null);
        }
        this.o.setText(cn4Var2.c);
        if (cn4Var2.b) {
            vkImageSimple.setSelected(true);
            vkImageSimple.setForeground(m33.a(R.drawable.clips_morphing_effect_foreground, this.itemView.getContext()));
        } else {
            vkImageSimple.setSelected(false);
            vkImageSimple.setForeground(null);
        }
    }
}
