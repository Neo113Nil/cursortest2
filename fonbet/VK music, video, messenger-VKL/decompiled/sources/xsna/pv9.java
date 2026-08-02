package xsna;

import android.content.res.ColorStateList;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: CarouselSwitcherView.kt */
/* loaded from: classes4.dex */
public final class pv9 extends FrameLayout {
    public gzs<s3q0> b;

    private final void setButtonColor(TextView textView) {
        textView.setTextColor(0);
        textView.setCompoundDrawableTintList(ColorStateList.valueOf(0));
    }

    public final void a(boolean z) {
        his0.v(null, z ? R.drawable.vk_icon_square_split_4_outline_20 : R.drawable.vk_icon_carousel_outline_20, 0);
        throw null;
    }

    public final gzs<s3q0> getOnClickSwitcher() {
        return this.b;
    }

    public final void setOnClickSwitcher(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }

    public final void setVisibleSwitcherGridCarousel(boolean z) {
        bwt0.p0(this, z);
    }
}
