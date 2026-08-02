package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vkontakte.android.R;
import xsna.uko;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class sk7 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ sk7(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        AttributeSet attributeSet = null;
        int i2 = 0;
        Context context = this.c;
        switch (i) {
            case 0:
                return Integer.valueOf(e3m.f(R.attr.vk_ui_image_border_alpha, context));
            case 1:
                int i3 = DurationView.r;
                Drawable a = m33.a(R.drawable.vk_icon_play_16, context);
                if (a == null) {
                    return null;
                }
                ColorStateList valueOf = ColorStateList.valueOf(-1);
                uko.a aVar = uko.a;
                Drawable mutate = a.mutate();
                mutate.setTintList(valueOf);
                float f = 16;
                mutate.setBounds(0, 0, iah0.a(f), iah0.a(f));
                return mutate;
            case 2:
                fl4 g = lyd.g();
                int i4 = fl4.a;
                g.x(context, false);
                return s3q0.a;
            default:
                VideoTextureView videoTextureView = new VideoTextureView(context, attributeSet, 6, i2);
                videoTextureView.setId(R.id.fullscreen_video_base_video_texture);
                videoTextureView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                return videoTextureView;
        }
    }
}
