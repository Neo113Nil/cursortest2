package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import kotlin.collections.EmptyList;

/* compiled from: VmojiSelectorView.kt */
/* loaded from: classes6.dex */
public final class dbw0 extends FrameLayout {
    public final View b;
    public final View c;
    public final LinearLayout d;
    public ebw0 e;
    public final int f;
    public float g;
    public ValueAnimator h;
    public b9w0 i;
    public final LinkedHashMap<String, VKImageView> j;
    public Object k;

    public dbw0(Context context) {
        super(context, null, 0);
        this.e = new ebw0(0);
        this.f = iah0.a(4);
        this.j = new LinkedHashMap<>();
        this.k = EmptyList.b;
        View.inflate(context, R.layout.vmoji_selector_view, this);
        this.c = findViewById(R.id.vmoji_selector);
        this.d = (LinearLayout) findViewById(R.id.packs_container);
        this.b = findViewById(R.id.vmoji_selector_background);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i2);
        setMeasuredDimension((int) ((((this.e.a.size() * size) - size) * this.g) + size), size);
    }

    public final void setChooserListener(b9w0 b9w0Var) {
        this.i = b9w0Var;
    }

    public final void setSelected(int i) {
        StickerStockItem stickerStockItem = (StickerStockItem) j5g.b0(i, this.e.a);
        boolean z = stickerStockItem != null;
        this.e = new ebw0(this.e.a, stickerStockItem, z);
        float f = z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f2 = this.g;
        View view = this.c;
        if (f2 != f) {
            if (z) {
                bwt0.p0(view, true);
                bwt0.p0(this.b, true);
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.g, f);
            ofFloat.setDuration(220L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new vnb(this, 3));
            ofFloat.addListener(new cbw0(z, this));
            ofFloat.start();
            this.h = ofFloat;
        }
        view.post(new z27(this, 18));
    }

    public final void setSelectionViewSize(int i) {
        View view = this.c;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }
}
