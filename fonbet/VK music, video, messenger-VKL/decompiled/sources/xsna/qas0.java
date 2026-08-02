package xsna;

import android.widget.TextView;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.vk.catalog2.common.ui.mvp.holder.video.category.VideoCategoryCoverVh;
import com.vk.catalog2.common.ui.mvp.holder.video.category.VideoCategoryHeaderVh;
import com.vk.imageloader.view.VKImageView;

/* compiled from: VideoCategoryHeaderVh.kt */
/* loaded from: classes16.dex */
public final class qas0 implements NonBouncedAppBarLayout.d {
    public final /* synthetic */ VideoCategoryHeaderVh a;

    public qas0(VideoCategoryHeaderVh videoCategoryHeaderVh) {
        this.a = videoCategoryHeaderVh;
    }

    @Override // com.google.android.material.appbar.NonBouncedAppBarLayout.d
    public final void a(NonBouncedAppBarLayout nonBouncedAppBarLayout, int i) {
        float totalScrollRange = (i / nonBouncedAppBarLayout.getTotalScrollRange()) + 1;
        VideoCategoryCoverVh videoCategoryCoverVh = this.a.f;
        VKImageView vKImageView = videoCategoryCoverVh.g;
        if (vKImageView == null || videoCategoryCoverVh.e == null || videoCategoryCoverVh.f == null) {
            return;
        }
        vKImageView.setAlpha(totalScrollRange);
        TextView textView = videoCategoryCoverVh.e;
        if (textView == null) {
            textView = null;
        }
        textView.setAlpha(totalScrollRange);
        TextView textView2 = videoCategoryCoverVh.f;
        (textView2 != null ? textView2 : null).setAlpha(totalScrollRange);
    }
}
