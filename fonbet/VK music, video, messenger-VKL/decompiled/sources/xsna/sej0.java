package xsna;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: ShopsBadge.kt */
/* loaded from: classes18.dex */
public final class sej0 extends FrameLayout {
    public final TextView b;
    public boolean c;
    public String d;

    public sej0(Context context) {
        super(context, null, 0);
        this.c = true;
        LayoutInflater.from(context).inflate(R.layout.pds_shops_badge, this);
        setBackground(getBackgroundDrawable());
        this.b = (TextView) findViewById(R.id.shops_badge_title);
    }

    private final GradientDrawable getBackgroundDrawable() {
        GradientDrawable a = ful0.a(0);
        a.setCornerRadius(cn70.c(6));
        a.setAlpha(178);
        a.setColor(getContext().getColor(R.color.vk_gray_800));
        return a;
    }

    public final boolean getHasProduct() {
        return this.c;
    }

    public final String getProductName() {
        return this.d;
    }

    public final void setHasProduct(boolean z) {
        String str;
        if (this.c == z) {
            return;
        }
        this.c = z;
        setVisibility((!z || (str = this.d) == null || str.length() == 0) ? 8 : 0);
    }

    public final void setProductName(String str) {
        String str2;
        if (epx.f(this.d, str)) {
            return;
        }
        this.d = str;
        int i = 8;
        int i2 = str != null ? 0 : 8;
        TextView textView = this.b;
        textView.setVisibility(i2);
        textView.setText(this.d);
        if (this.c && (str2 = this.d) != null && str2.length() != 0) {
            i = 0;
        }
        setVisibility(i);
    }
}
