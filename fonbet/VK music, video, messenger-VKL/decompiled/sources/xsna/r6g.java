package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.TextView;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class r6g implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ r6g(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                View view = (View) obj;
                ImAvatarView imAvatarView = (ImAvatarView) view.findViewById(R.id.voip_caller_image);
                Context context = view.getContext();
                Drawable a = m33.a(R.drawable.bg_anonym_avatar, context);
                LayerDrawable layerDrawable = (LayerDrawable) (a != null ? a.mutate() : null);
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.voip_anonym_icon_incognito_layer);
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.voip_anonym_background_layer);
                int color = context.getColor(R.color.vk_steel_gray_150);
                int color2 = context.getColor(R.color.vk_white);
                findDrawableByLayerId.setTint(color);
                findDrawableByLayerId2.setTint(color2);
                imAvatarView.o1(null, layerDrawable);
                ((TextView) view.findViewById(R.id.voip_title)).setText(this.c);
                at.d(view, R.string.voip_change_name_anonym_title, (TextView) view.findViewById(R.id.voip_description));
                break;
            default:
                qgi0.h((tgi0) obj, this.c);
                break;
        }
        return s3q0.a;
    }
}
