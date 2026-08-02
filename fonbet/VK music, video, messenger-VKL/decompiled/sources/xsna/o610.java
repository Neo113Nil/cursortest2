package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: MarketLamodaBadge.kt */
/* loaded from: classes18.dex */
public final class o610 extends FrameLayout {
    public final VkText b;
    public final VkImage c;

    public o610(Context context) {
        super(context, null, 0);
        View.inflate(context, R.layout.market_lamoda_badge, this);
        this.b = (VkText) findViewById(R.id.info_badge_text);
        VkImage vkImage = (VkImage) findViewById(R.id.info_badge_icon);
        this.c = vkImage;
        vkImage.setImageResource(R.drawable.vk_icon_logo_lamoda_14h);
        TypedValue typedValue = krv0.a;
        boolean f = epx.f(krv0.i(getContext()), Boolean.TRUE);
        setUpBackground(f);
        setUpBadgeIconTint(f);
    }

    private final void setUpBackground(boolean z) {
        setBackground(krv0.e(R.drawable.ecomm_market_discount_badge_shape, getContext()));
        setBackgroundTintList(ColorStateList.valueOf(getContext().getColor(z ? R.color.ecomm_design_lamoda_badge_background_dark : R.color.ecomm_design_lamoda_badge_background_light)));
    }

    private final void setUpBadgeIconTint(boolean z) {
        this.c.setImageTintList(ColorStateList.valueOf(getContext().getColor(z ? R.color.ecomm_design_lamoda_badge_icon_dark : R.color.ecomm_design_lamoda_badge_icon_light)));
    }

    public final void setPrefix(String str) {
        if (str == null) {
            str = getContext().getString(R.string.product_tile_ozon_badge_order_by_title);
        }
        this.b.setText(str);
    }
}
