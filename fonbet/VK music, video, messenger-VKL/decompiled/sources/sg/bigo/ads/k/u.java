package sg.bigo.ads.k;

import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;

/* loaded from: classes9.dex */
public class u extends v {
    protected int y;

    public u(@NonNull sg.bigo.ads.y.b bVar) {
        super(bVar);
    }

    private int[] C() {
        int i;
        int i2;
        if (x() == 1) {
            i = 16777215;
            i2 = -1;
        } else {
            i = 2105636;
            i2 = -16777216;
        }
        return new int[]{i, i2};
    }

    @Override // sg.bigo.ads.k.v
    public final int A() {
        return this.y;
    }

    public boolean B() {
        return true;
    }

    @Override // sg.bigo.ads.k.v
    public final void a(@NonNull ViewGroup viewGroup, sg.bigo.ads.an.p pVar) {
        View findViewById = viewGroup.findViewById(R.id.bigo_ad_mask_vertical);
        int height = pVar.getHeight() / 2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        marginLayoutParams.height = height + 5;
        marginLayoutParams.topMargin = height;
        findViewById.setLayoutParams(marginLayoutParams);
        ((GradientDrawable) findViewById.getBackground()).setColors(C());
        int i = viewGroup.getContext().getResources().getDisplayMetrics().widthPixels;
        View findViewById2 = viewGroup.findViewById(R.id.bigo_ad_mask_horizontal);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams();
        int i2 = i / 3;
        marginLayoutParams2.width = i2;
        marginLayoutParams2.height = pVar.c;
        marginLayoutParams2.leftMargin = i2;
        findViewById2.setLayoutParams(marginLayoutParams2);
        ((GradientDrawable) findViewById2.getBackground()).setColors(z());
        if (B()) {
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.iv_media_blur_bg);
            View findViewById3 = viewGroup.findViewById(R.id.iv_media_blur_bg_mask);
            if (imageView == null || findViewById3 == null) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) findViewById3.getLayoutParams();
            marginLayoutParams3.leftMargin = i2;
            marginLayoutParams4.leftMargin = i2;
            imageView.setLayoutParams(marginLayoutParams3);
            findViewById3.setLayoutParams(marginLayoutParams4);
        }
    }

    @Override // sg.bigo.ads.k.v
    public final void c(@NonNull ViewGroup viewGroup) {
        sg.bigo.ads.an.p a = sg.bigo.ads.ad.interstitial.s.a(((sg.bigo.ads.ad.interstitial.u) this).c);
        this.y = Math.round(viewGroup.getContext().getResources().getDisplayMetrics().widthPixels * 0.666f);
        sg.bigo.ads.an.p b = sg.bigo.ads.an.p.b(a.getWidth(), a.getHeight(), this.y);
        ViewGroup.LayoutParams layoutParams = ((v) this).z.getLayoutParams();
        layoutParams.width = b.b;
        layoutParams.height = b.c;
        ((v) this).z.setLayoutParams(layoutParams);
        int height = b.getHeight() / 2;
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.bigo_ad_material_container);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams2.topMargin = sg.bigo.ads.common.utils.f.a(viewGroup.getContext(), 16) + height;
        linearLayout.setLayoutParams(layoutParams2);
        a(viewGroup, b);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.inter_star);
        float a2 = (sg.bigo.ads.y.e.a("key", 4) * 0.5f) + 4.5f;
        Bitmap a3 = sg.bigo.ads.common.utils.e.a(viewGroup.getContext(), a2, R.drawable.bigo_ad_ic_star_white, R.drawable.bigo_ad_ic_star_normal_white, R.drawable.bigo_ad_ic_star_half_white);
        if (x() == 1) {
            a3 = sg.bigo.ads.common.utils.e.a(viewGroup.getContext(), a2, R.drawable.bigo_ad_ic_star, R.drawable.bigo_ad_ic_star_normal, R.drawable.bigo_ad_ic_star_half);
        }
        imageView.setImageBitmap(a3);
        int i = this.y;
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_title);
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            layoutParams3.width = i;
            textView.setLayoutParams(layoutParams3);
        }
    }

    public int[] z() {
        int i;
        int i2;
        if (x() == 1) {
            i = -1;
            i2 = 16777215;
        } else {
            i = -16777216;
            i2 = 2105636;
        }
        return new int[]{i, i2};
    }
}
