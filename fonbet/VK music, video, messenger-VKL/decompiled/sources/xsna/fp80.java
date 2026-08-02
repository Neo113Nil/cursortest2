package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.vk.dto.user.Platform;
import com.vk.dto.user.VisibleStatus;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: OnlineExt.kt */
/* loaded from: classes2.dex */
public final class fp80 {
    public static final void a(ImageView imageView, qtd0 qtd0Var) {
        Drawable drawable;
        if (imageView == null || qtd0Var == null) {
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        if (qtd0Var.mb().Ab()) {
            imageView.setVisibility(8);
            return;
        }
        VisibleStatus zb = qtd0Var.mb().zb();
        if (zb == null) {
            return;
        }
        Platform platform = zb.e;
        if (platform == Platform.MOBILE) {
            Context context = imageView.getContext();
            e3m.a aVar = e3m.a;
            drawable = m33.a(R.drawable.ic_online_mobile_vkapp_composite_16, context);
        } else if (platform == Platform.WEB) {
            Context context2 = imageView.getContext();
            e3m.a aVar2 = e3m.a;
            drawable = m33.a(R.drawable.ic_online_web_composite_16, context2);
        } else {
            drawable = null;
        }
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
    }
}
