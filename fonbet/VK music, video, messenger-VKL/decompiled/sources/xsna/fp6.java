package xsna;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.ui.components.theme_chooser.themeadapter.GradientBubblesView;
import com.vkontakte.android.R;
import xsna.jpo0;

/* compiled from: BaseThemeViewHolder.kt */
/* loaded from: classes2.dex */
public abstract class fp6<T extends jpo0> extends RecyclerView.e0 {
    public static final int r = iah0.a(94);
    public final a l;
    public final ImageView m;
    public final SimpleDraweeView n;
    public final GradientBubblesView o;
    public final TextView p;
    public T q;

    /* compiled from: BaseThemeViewHolder.kt */
    public interface a {
        void c(jpo0 jpo0Var);
    }

    public fp6(View view, a aVar) {
        super(view);
        this.l = aVar;
        ImageView imageView = (ImageView) view.findViewById(R.id.vkim_icon_check_view);
        this.m = imageView;
        this.n = (SimpleDraweeView) view.findViewById(R.id.vkim_background_image);
        this.o = (GradientBubblesView) this.itemView.findViewById(R.id.vkim_themed_bubbles_preview);
        this.p = (TextView) view.findViewById(R.id.vkim_item_text);
        occ occVar = new occ(enj.c(R.drawable.vk_icon_check_circle_shadow_36, -1, this.itemView.getContext()), e3m.a(R.dimen.theme_chooser_borders_width, this.itemView.getContext()), e3m.f(R.attr.vk_legacy_image_border, this.itemView.getContext()), iah0.a(6));
        this.itemView.setOnClickListener(new ep6(this, 0));
        imageView.setImageDrawable(occVar);
        W5(e3m.f(R.attr.vk_legacy_background_content, this.itemView.getContext()));
    }

    public abstract void V5(T t);

    public final void W5(int i) {
        a6(null);
        qog0 qog0Var = new qog0(e3m.a(R.dimen.theme_chooser_corners_radius, this.itemView.getContext()), i);
        qog0Var.a(e3m.a(R.dimen.theme_chooser_borders_width, this.itemView.getContext()), e3m.f(R.attr.vk_legacy_image_border, this.itemView.getContext()));
        this.n.setBackground(qog0Var);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [REQUEST, com.facebook.imagepipeline.request.ImageRequest] */
    public final void a6(Uri uri) {
        SimpleDraweeView simpleDraweeView = this.n;
        if (uri == null) {
            simpleDraweeView.e(uri, null);
            return;
        }
        lpa0 lpa0Var = rhs.a().get();
        lpa0Var.d();
        lpa0Var.l = simpleDraweeView.getController();
        ImageRequestBuilder h = ImageRequestBuilder.h(uri);
        int i = r;
        h.d = i > 0 ? new x9g0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i, 12) : null;
        lpa0Var.c = h.a();
        simpleDraweeView.setController(lpa0Var.b());
    }
}
