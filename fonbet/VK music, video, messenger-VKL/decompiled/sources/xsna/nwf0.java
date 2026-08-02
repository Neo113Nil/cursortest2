package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vkontakte.android.R;

/* compiled from: PostingHolders.kt */
/* loaded from: classes4.dex */
public final class nwf0 {
    public final ImageView a;

    public nwf0(ViewGroup viewGroup, View.OnClickListener onClickListener) {
        ImageView imageView = new ImageView(viewGroup.getContext());
        this.a = imageView;
        imageView.setId(R.id.posting_attachment_holder_remove);
        imageView.setImageResource(R.drawable.vk_icon_deprecated_ic_close_attach_36);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388613;
        imageView.setLayoutParams(layoutParams);
        bwt0.p0(imageView, false);
        imageView.setOnClickListener(onClickListener);
        imageView.setContentDescription(imageView.getContext().getString(R.string.delete));
        viewGroup.addView(imageView);
    }

    public final void a(boolean z) {
        bwt0.p0(this.a, z);
    }
}
