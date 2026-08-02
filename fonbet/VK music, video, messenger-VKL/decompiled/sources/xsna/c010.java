package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.components.picture.VkImage;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MarketIntegrationBadge.kt */
/* loaded from: classes18.dex */
public final class c010 extends FrameLayout {
    public final Object b;

    public c010(Context context) {
        super(context, null, 0);
        this.b = msy.a(LazyThreadSafetyMode.NONE, new b010(this, 0));
        View.inflate(context, R.layout.market_integration_new_badge, this);
        setBackgroundResource(R.drawable.ecomm_market_discount_badge_shape);
    }

    public static s3q0 a(c010 c010Var, String str) {
        c010Var.getIconImage().o0(str, null);
        return s3q0.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkImage getIconImage() {
        return (VkImage) this.b.getValue();
    }

    public final void b(Integer num, Integer num2, String str) {
        iwt0.a(getIconImage(), new ya(24, this, str));
        getIconImage().setCornerRadius(iah0.b(6.0f));
        f4m.z(num != null ? iah0.a(num.intValue()) : 0, num2 != null ? iah0.a(num2.intValue()) : 0, getIconImage());
    }
}
