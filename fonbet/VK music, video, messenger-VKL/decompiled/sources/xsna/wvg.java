package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: CommunityCheckListCategoryTitleViewHolder.kt */
/* loaded from: classes18.dex */
public final class wvg extends vfz<vvg> {
    public final TextView l;
    public final TextView m;

    public wvg(ViewGroup viewGroup) {
        super(R.layout.community_check_list_category_title_item, viewGroup);
        this.l = (TextView) this.itemView.findViewById(R.id.title);
        this.m = (TextView) this.itemView.findViewById(R.id.progress);
    }

    @Override // xsna.vfz
    public final void W5(vvg vvgVar) {
        vvg vvgVar2 = vvgVar;
        this.l.setText(vvgVar2.b);
        ey2.h(this.m, vvgVar2.c);
    }
}
