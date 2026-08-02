package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.vk.core.view.links.LinkedTextView;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.p250;

/* compiled from: PromoRenderExtension.kt */
/* loaded from: classes3.dex */
public final class y5e0 implements gm50 {
    public final p250 b;
    public final p250.b c;
    public final int d;
    public final View e;
    public final VKImageView f;
    public final VKImageView g;
    public final VKCircleImageView h;
    public final TextView i;
    public final LinkedTextView j;
    public final View k;
    public final Button l;

    public y5e0(Context context, p250 p250Var, p250.b bVar, int i) {
        this.b = p250Var;
        this.c = bVar;
        this.d = i;
        View inflate = LayoutInflater.from(context).inflate(R.layout.modal_bottom_sheet_promo, (ViewGroup) null, false);
        this.e = inflate;
        this.f = (VKImageView) inflate.findViewById(R.id.image_single);
        this.g = (VKImageView) inflate.findViewById(R.id.image_background);
        this.h = (VKCircleImageView) inflate.findViewById(R.id.image_avatar);
        this.i = (TextView) inflate.findViewById(R.id.text_title);
        this.j = (LinkedTextView) inflate.findViewById(R.id.text_description);
        CardView cardView = (CardView) inflate.findViewById(R.id.card_root);
        this.k = inflate.findViewById(R.id.image_btn_hide);
        this.l = (Button) inflate.findViewById(R.id.button_action);
        cardView.setBackground(gu9.c(R.attr.vk_ui_background_contrast_themed, context));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
