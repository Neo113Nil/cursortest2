package xsna;

import android.view.ViewGroup;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;

/* compiled from: DividerHolder.kt */
/* loaded from: classes4.dex */
public final class vrn extends qi6<NewsEntry> {
    public Integer C;
    public final int D;

    public vrn(ViewGroup viewGroup) {
        super(R.layout.holder_divider, viewGroup);
        this.D = e3m.a(R.dimen.vk_post_side_padding, this.itemView.getContext());
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        Integer num = this.C;
        int intValue = num != null ? num.intValue() : this.D;
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if ((marginLayoutParams != null ? marginLayoutParams.leftMargin : 0) == intValue) {
            ViewGroup.LayoutParams layoutParams2 = this.itemView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if ((marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0) == intValue) {
                return;
            }
        }
        bwt0.f0(this.itemView, intValue, 0, intValue, 0, 10);
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        Object obj = u1c0Var.g;
        this.C = obj instanceof Integer ? (Integer) obj : null;
        super.a6(u1c0Var);
    }
}
