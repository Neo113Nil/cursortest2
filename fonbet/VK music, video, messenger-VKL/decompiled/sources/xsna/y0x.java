package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.tool.view.AspectRatioFrameLayout;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: InnerLikeableView.kt */
/* loaded from: classes16.dex */
public final class y0x extends com.vk.catalog2.common.ui.holders.video.info_overlays.a {
    public ImageView d;
    public boolean e;

    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final void a(VideoFile videoFile, UIBlock uIBlock, gqs0 gqs0Var) {
        f(videoFile.O9());
    }

    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final void b(LayoutInflater layoutInflater, LinearLayout linearLayout, AspectRatioFrameLayout aspectRatioFrameLayout, View.OnClickListener onClickListener, izs izsVar) {
        this.b = aspectRatioFrameLayout;
        f4m.q(cn70.b(16), linearLayout);
        ImageView imageView = new ImageView(linearLayout.getContext());
        int b = cn70.b(8);
        imageView.setPadding(b, b, b, b);
        imageView.setId(R.id.like);
        bwt0.i0(imageView, new defpackage.o(22, onClickListener, this));
        izsVar.invoke(imageView);
        this.d = imageView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388693;
        layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, iah0.a(4), iah0.a(2));
        s3q0 s3q0Var = s3q0.a;
        aspectRatioFrameLayout.addView(imageView, layoutParams);
    }

    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final boolean d() {
        return false;
    }

    public final void f(boolean z) {
        Context context;
        ImageView imageView;
        baf0 baf0Var;
        this.e = z;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        if (aspectRatioFrameLayout == null || (context = aspectRatioFrameLayout.getContext()) == null || (imageView = this.d) == null) {
            return;
        }
        if (z) {
            e3m.a aVar = e3m.a;
            baf0Var = new baf0(m33.a(R.drawable.vk_icon_like_24, context), context.getColor(R.color.vk_red_nice));
        } else {
            e3m.a aVar2 = e3m.a;
            baf0Var = new baf0(m33.a(R.drawable.vk_icon_like_outline_24, context), context.getColor(R.color.vk_white));
        }
        imageView.setImageDrawable(baf0Var);
    }
}
