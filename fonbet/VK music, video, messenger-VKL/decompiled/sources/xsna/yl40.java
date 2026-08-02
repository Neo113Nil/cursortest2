package xsna;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.vk.common.links.LaunchContext;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.ui.video2.skippablepart.VideoSkippablePartView;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class yl40 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ yl40(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                maz.c(xwk.d().e(), this.c, i5s.a(new StringBuilder("https://"), a0a.d, "/support?act=faqs_music&c=29&from=right"), LaunchContext.A, null, null, 24);
                return s3q0.a;
            case 1:
                Context context = this.c;
                int i = VideoSkippablePartView.C;
                VKImageView vKImageView = new VKImageView(context, null, 6, 0);
                vKImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(iah0.a(10));
                vKImageView.setBackground(gradientDrawable);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iah0.a(160), iah0.a(90));
                layoutParams.gravity = 8388613;
                vKImageView.setLayoutParams(layoutParams);
                vKImageView.setClipToOutline(true);
                vKImageView.setVisibility(8);
                return vKImageView;
            default:
                Toast.makeText(this.c, R.string.vk_rich_content_expired, 0).show();
                return s3q0.a;
        }
    }
}
