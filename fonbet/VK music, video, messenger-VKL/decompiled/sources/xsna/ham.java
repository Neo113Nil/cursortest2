package xsna;

import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.View;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.common.im.Image;
import com.vkontakte.android.R;

/* compiled from: DialogBackgroundDelegate.kt */
/* loaded from: classes2.dex */
public final class ham {
    public final kkm a;
    public final eam b;
    public VKEnhancedImageView c;
    public boolean d;

    public ham(kkm kkmVar, eam eamVar) {
        this.a = kkmVar;
        this.b = eamVar;
    }

    public final void a(kkm kkmVar) {
        Uri g = jeq0.g(dhr0.M() ? kkmVar.a.c.d : kkmVar.a.c.c);
        Uri uri = !epx.f(g, Uri.EMPTY) ? g : null;
        Image image = uri != null ? new Image(uri.toString()) : null;
        ColorDrawable colorDrawable = image == null ? new ColorDrawable(kkmVar.f(R.attr.im_bg_chat)) : null;
        Object obj = fx5.a;
        VKEnhancedImageView vKEnhancedImageView = this.c;
        if (vKEnhancedImageView == null) {
            vKEnhancedImageView = null;
        }
        x9g0 a = fx5.a(vKEnhancedImageView.getContext());
        if (hpo0.g(g)) {
            skw e = wkw.f().e();
            if (!e.c(g)) {
                e.g(fx5.b(g, a).a());
            }
        }
        boolean z = image != null;
        this.b.Dd(z);
        this.d = z;
        VKEnhancedImageView vKEnhancedImageView2 = this.c;
        if (vKEnhancedImageView2 == null) {
            vKEnhancedImageView2 = null;
        }
        vKEnhancedImageView2.setBackgroundImage(colorDrawable);
        VKEnhancedImageView vKEnhancedImageView3 = this.c;
        VKEnhancedImageView vKEnhancedImageView4 = vKEnhancedImageView3 != null ? vKEnhancedImageView3 : null;
        fx5.b(g, a);
        vKEnhancedImageView4.setLocalImage(image);
    }

    public final boolean b() {
        return this.d;
    }

    public final void c() {
        VKEnhancedImageView vKEnhancedImageView = this.c;
        if (vKEnhancedImageView == null) {
            return;
        }
        this.a.e(vKEnhancedImageView, new aza(this, 4));
    }

    public final void d(View view) {
        VKEnhancedImageView vKEnhancedImageView = (VKEnhancedImageView) view.findViewById(R.id.dialog_background);
        this.c = vKEnhancedImageView;
        vKEnhancedImageView.setVisible(true);
        VKEnhancedImageView vKEnhancedImageView2 = this.c;
        if (vKEnhancedImageView2 == null) {
            vKEnhancedImageView2 = null;
        }
        vKEnhancedImageView2.setFadeDuration(0);
        VKEnhancedImageView vKEnhancedImageView3 = this.c;
        this.a.e(vKEnhancedImageView3 != null ? vKEnhancedImageView3 : null, new fne(this, 2));
    }

    public final void e() {
        VKEnhancedImageView vKEnhancedImageView = this.c;
        if (vKEnhancedImageView == null) {
            vKEnhancedImageView = null;
        }
        this.a.h(vKEnhancedImageView);
    }
}
