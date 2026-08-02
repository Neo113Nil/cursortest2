package xsna;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.feed.core.models.news.LatestNewsItem;
import com.vk.imageloader.view.VKImageView;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import kotlin.Lazy;
import xsna.c9x0;

/* compiled from: LatestNewsItemHolder.kt */
/* loaded from: classes4.dex */
public final class lmy extends qi6<LatestNewsItem> implements View.OnClickListener {
    public static final /* synthetic */ int G = 0;
    public final Lazy C;
    public final TextView D;
    public final TextView E;
    public final VKImageView F;

    public lmy(ViewGroup viewGroup, bpn0 bpn0Var) {
        super(R.layout.news_latest_list_item, viewGroup);
        this.C = bpn0Var;
        this.D = (TextView) this.itemView.findViewById(R.id.flist_item_text);
        this.E = (TextView) this.itemView.findViewById(R.id.flist_item_subtext);
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.flist_item_photo);
        this.F = vKImageView;
        int a2 = gbg0.a(this.itemView.getResources(), 18.0f);
        if (vKImageView != null) {
            vKImageView.setPlaceholderImage(new InsetDrawable((Drawable) new baf0(m33.a(R.drawable.vk_icon_article_36, this.itemView.getContext()), ColorStateList.valueOf(dhr0.t.c(R.attr.vk_ui_icon_medium))), a2, a2, a2, a2));
        }
        this.itemView.setOnClickListener(this);
        if (vKImageView != null) {
            dek0.b(vKImageView, null, null, 6);
        }
    }

    @Override // xsna.qi6
    public final void E6(LatestNewsItem latestNewsItem) {
        LatestNewsItem latestNewsItem2 = latestNewsItem;
        TextView textView = this.D;
        if (textView != null) {
            textView.setText(latestNewsItem2.k);
        }
        Image image = latestNewsItem2.i;
        VKImageView vKImageView = this.F;
        if (vKImageView != null) {
            if (image == null) {
                vKImageView.load(null);
            } else {
                ImageSize Cb = image.Cb(gbg0.a(this.itemView.getResources(), 64.0f), true, false);
                if (Cb != null) {
                    vKImageView.load(Cb.d.d);
                }
            }
        }
        TextView textView2 = this.E;
        if (textView2 != null) {
            textView2.setText(latestNewsItem2.n + " · " + pvo0.k(latestNewsItem2.l, this.itemView.getResources(), false));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LatestNewsItem q6 = q6();
        if (q6 == null) {
            return;
        }
        NewsfeedRouter.w((NewsfeedRouter) this.C.getValue(), this.itemView.getContext(), q6.Bb(), null, c9x0.c.b, new a(q6), 32);
    }

    /* compiled from: LatestNewsItemHolder.kt */
    public static final class a implements yp80 {
        public final /* synthetic */ LatestNewsItem b;

        public a(LatestNewsItem latestNewsItem) {
            this.b = latestNewsItem;
        }

        @Override // xsna.yp80
        public final void onSuccess() {
            int i = lmy.G;
            b.d dVar = new b.d("grouped_news_action");
            LatestNewsItem latestNewsItem = this.b;
            dVar.b(Integer.valueOf(latestNewsItem.o), "type");
            dVar.b(latestNewsItem.Bb(), "post_id");
            dVar.b("opened", "action");
            dVar.b(latestNewsItem.q, "track_code");
            dVar.e();
        }

        @Override // xsna.yp80
        public final void I() {
        }

        @Override // xsna.yp80
        public final void U() {
        }

        @Override // xsna.yp80
        public final void B0(boolean z) {
        }

        @Override // xsna.yp80
        public final void onError(Throwable th) {
        }
    }
}
