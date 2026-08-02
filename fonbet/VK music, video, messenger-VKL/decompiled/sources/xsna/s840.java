package xsna;

import android.text.TextUtils;
import android.util.Size;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.f0p;
import xsna.l840;

/* compiled from: MusicActionVkCellViewHolder.kt */
/* loaded from: classes3.dex */
public final class s840 extends se50<l840.a> {
    public final int n;
    public final fsv<?> o;

    /* compiled from: MusicActionVkCellViewHolder.kt */
    public static final class a implements VkCell.f {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(R.drawable.vk_icon_add_outline_28);
        }

        public final String toString() {
            return "ActionIconParams(iconDrawableRes=2131236283)";
        }
    }

    public s840(ViewGroup viewGroup, f0p.a aVar) {
        super(new VkCell(viewGroup.getContext(), null, 6, 0));
        this.n = R.id.music_action_btn;
        this.o = aVar;
        VkCell vkCell = (VkCell) this.itemView;
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vkCell.setMinimumHeight(iah0.a(60));
        vkCell.c(new hs00(this, 8), new f07((byte) 0, 6));
        float f = 48;
        vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.e(new a(), new Size(iah0.a(f), iah0.a(f)))));
        vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(tq.h(tlo0.Companion, R.string.music_button_add_music), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), null, null, 14));
        TextView textView = (TextView) vkCell.findViewById(R.id.ds_internal_cell_middle_title);
        if (textView != null) {
            textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_accent));
        }
        jjc.g(vkCell, new ugm(this, 25));
    }

    @Override // xsna.se50
    public final void b6(l840.a aVar) {
        this.itemView.setAlpha(!aVar.a ? 1.0f : 0.64f);
    }
}
