package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vkontakte.android.R;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class srd implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ srd(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                ikv0.a aVar = new ikv0.a(context);
                aVar.u = new ikv0.d(new ikv0.d.c(context.getString(R.string.clip_save_download_deepfake_restriction_title)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                aVar.d = true;
                aVar.n();
                return s3q0.a;
            default:
                int i2 = ImAvatarView.z;
                taj tajVar = new taj(new Drawable[0]);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_background_positive, context)));
                gradientDrawable.setShape(1);
                tajVar.addLayer(gradientDrawable);
                Drawable a = m33.a(R.drawable.vk_icon_user_square_outline_28, context);
                if (a != null) {
                    a.setTint(-1);
                }
                tajVar.addLayer(a);
                tajVar.setLayerGravity(1, 17);
                return tajVar;
        }
    }
}
