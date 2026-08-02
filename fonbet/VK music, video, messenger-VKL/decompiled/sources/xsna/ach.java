package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: CommunityPartnerBannerHeaderViewHolder.kt */
/* loaded from: classes18.dex */
public final class ach extends vfz<zbh> {
    public final TextView l;
    public final TextView m;

    public ach(ViewGroup viewGroup) {
        super(R.layout.community_check_list_category_title_item, viewGroup);
        this.l = (TextView) this.itemView.findViewById(R.id.title);
        this.m = (TextView) this.itemView.findViewById(R.id.progress);
    }

    @Override // xsna.vfz
    public final void W5(zbh zbhVar) {
        ey2.h(this.l, zbhVar.b);
        this.m.setVisibility(4);
    }
}
