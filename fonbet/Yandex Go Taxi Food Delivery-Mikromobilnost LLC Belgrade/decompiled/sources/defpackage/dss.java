package defpackage;

import android.view.View;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.internal.view.custom.ProgressIndicator;
import com.yandex.messaging.internal.view.timeline.MessageImageLoader$GifLoadingStrategy;
import com.yandex.messaging.views.GalleryRoundImageView;

/* loaded from: classes15.dex */
public final class dss extends x0 {
    public final View N;
    public final GalleryRoundImageView O;
    public final mt10 P;
    public css Q;
    public final int R;

    public dss(View view, h3y h3yVar, x22 x22Var) {
        super(view);
        this.N = view;
        GalleryRoundImageView galleryRoundImageView = (GalleryRoundImageView) view.findViewById(e9h0.gallery_item_view);
        this.O = galleryRoundImageView;
        this.P = new mt10(galleryRoundImageView, (ProgressIndicator) view.findViewById(e9h0.progress_indicator), (xav) h3yVar.get(), x22Var, new dnr(16, this), MessageImageLoader$GifLoadingStrategy.NEVER, null, 1984);
        this.R = fxa1.c(jng0.messagingCommonBackgroundColor, view.getContext()).data;
    }
}
