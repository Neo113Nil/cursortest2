package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MarketOzonBadge.kt */
/* loaded from: classes18.dex */
public final class l910 extends LinearLayout {
    public final Object b;
    public final Object c;
    public String d;

    public l910(Context context) {
        super(context, null, 0);
        l500 l500Var = new l500(this, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, l500Var);
        this.c = msy.a(lazyThreadSafetyMode, new jrh(this, 26));
        this.d = context.getString(R.string.product_tile_ozon_badge_order_by_title);
        View.inflate(context, R.layout.market_ozon_new_badge, this);
        setOrientation(0);
        setGravity(16);
        setBackgroundResource(R.drawable.ecomm_market_discount_badge_shape);
        TypedValue typedValue = krv0.a;
        setBackgroundTintList(ColorStateList.valueOf(epx.f(krv0.i(context), Boolean.TRUE) ? context.getColor(R.color.ecomm_design_ozon_badge_dark) : context.getColor(R.color.ecomm_design_ozon_badge_light)));
        int a = iah0.a(5);
        f4m.l(a, a, this);
        int a2 = e3m.a(R.dimen.vk_ui_spacing_size2_xs, context);
        f4m.B(a2, a2, this);
    }

    public static s3q0 a(l910 l910Var) {
        l910Var.getIconImage().setImageResource(R.drawable.vk_icon_logo_ozon_14h);
        return s3q0.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkImage getIconImage() {
        return (VkImage) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkText getPrefixText() {
        return (VkText) this.b.getValue();
    }

    public final void b() {
        iwt0.a(getIconImage(), new e810(this, 1));
        gpo0.f(getIconImage(), Integer.valueOf(R.attr.vk_ui_icon_contrast));
        f4m.z(iah0.a(37), iah0.a(14), getIconImage());
    }

    public final String getPrefix() {
        return this.d;
    }

    public final void setPrefix(String str) {
        this.d = str;
        getPrefixText().setText(str);
    }
}
