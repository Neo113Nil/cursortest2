package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.ecomm.design.view.deletedreview.DeletedReviewView;
import com.vkontakte.android.R;

/* compiled from: MarketAllReviewsEmptyListViewHolder.kt */
/* loaded from: classes18.dex */
public final class bs00 extends vfz {
    public final /* synthetic */ int l = 0;
    public final Object m;
    public Object n;

    public bs00(ViewGroup viewGroup) {
        super(R.layout.market_all_reviews_empty_list_view_holder, viewGroup);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.error_image_view);
        this.m = (TextView) this.itemView.findViewById(R.id.error_title_view);
        this.n = (TextView) this.itemView.findViewById(R.id.error_description_view);
        if (dhr0.M()) {
            imageView.setImageResource(R.drawable.vk_icon_illustration_rating_and_review_dark_120h);
        } else {
            imageView.setImageResource(R.drawable.vk_icon_illustration_rating_and_review_light_120h);
        }
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        switch (this.l) {
            case 0:
                as00 as00Var = (as00) hfzVar;
                TextView textView = (TextView) this.n;
                ((TextView) this.m).setText(this.itemView.getContext().getString(as00Var.b));
                Integer num = as00Var.c;
                if (num == null) {
                    bwt0.p0(textView, false);
                    break;
                } else {
                    int intValue = num.intValue();
                    bwt0.p0(textView, true);
                    at.d(this.itemView, intValue, textView);
                    break;
                }
            default:
                g210 g210Var = (g210) hfzVar;
                this.n = g210Var;
                e0n.b(this.itemView, g210Var.f);
                break;
        }
    }

    public bs00(ViewGroup viewGroup, h780 h780Var, boolean z) {
        super(e0n.a(R.layout.market_item_review_delete_item, viewGroup, z));
        this.m = h780Var;
        ((DeletedReviewView) this.itemView).setEventHandler(new m1o(this, 18));
    }
}
