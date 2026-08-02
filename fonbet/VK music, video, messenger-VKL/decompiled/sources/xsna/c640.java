package xsna;

import android.graphics.drawable.Drawable;
import com.vkontakte.android.R;

/* compiled from: MultiSelectQuestionViewHolder.kt */
/* loaded from: classes16.dex */
public final class c640 extends bmg<cgz> {
    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        h6(((cgz) hfzVar).b);
    }

    @Override // xsna.bmg
    public final Drawable i6() {
        return enj.e(R.drawable.vk_icon_check_box_off_24, R.attr.vk_ui_icon_tertiary, this.itemView.getContext());
    }

    @Override // xsna.bmg
    public final Drawable j6() {
        return enj.e(R.drawable.vk_icon_check_box_on_24, R.attr.vk_ui_icon_accent, this.itemView.getContext());
    }
}
