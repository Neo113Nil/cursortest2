package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class m0z0 extends FrameLayout {
    public static final int f = View.generateViewId();
    public final whz0 b;
    public final TextView c;
    public final whz0 d;
    public final LinearLayout e;

    public m0z0(Context context) {
        super(context);
        ujz0 ujz0Var = new ujz0(context);
        rvy0 rvy0Var = new rvy0(context);
        whz0 whz0Var = new whz0(context);
        whz0Var.setId(f);
        int i = rvy0.x;
        SparseIntArray sparseIntArray = rvy0Var.a;
        whz0Var.setBackgroundColor(sparseIntArray.get(i));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (context.getResources().getConfiguration().orientation == 2) {
            layoutParams.gravity = 8388627;
        } else {
            layoutParams.gravity = 49;
        }
        whz0Var.setScaleType(ImageView.ScaleType.FIT_XY);
        whz0Var.setLayoutParams(layoutParams);
        this.b = whz0Var;
        c1z0.n(whz0Var, "image_view");
        addView(whz0Var);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388693;
        int i2 = ujz0.g;
        SparseIntArray sparseIntArray2 = ujz0Var.a;
        int i3 = sparseIntArray2.get(i2);
        layoutParams2.setMargins(i3, i3, i3, i3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(sparseIntArray.get(rvy0.d));
        gradientDrawable.setCornerRadius(sparseIntArray2.get(ujz0.v));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setGravity(16);
        int i4 = sparseIntArray2.get(i2);
        linearLayout.setPadding(i4, i4, i4, i4);
        linearLayout.setLayoutParams(layoutParams2);
        this.e = linearLayout;
        whz0 whz0Var2 = new whz0(context);
        int i5 = sparseIntArray2.get(ujz0.n);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i5, i5);
        layoutParams3.setMarginEnd(sparseIntArray2.get(i2));
        whz0Var2.setLayoutParams(layoutParams3);
        this.d = whz0Var2;
        linearLayout.addView(whz0Var2);
        c1z0.n(whz0Var2, "icon_image_view");
        TextView textView = new TextView(context);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 16;
        textView.setTextColor(-1);
        textView.setLayoutParams(layoutParams4);
        textView.setTextSize(sparseIntArray2.get(ujz0.R));
        this.c = textView;
        c1z0.n(textView, "domain_text_view");
        linearLayout.addView(textView);
        c1z0.n(linearLayout, "domain_container");
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.gravity = 80;
        linearLayout2.setLayoutParams(layoutParams5);
        linearLayout2.addView(linearLayout);
        linearLayout.setVisibility(8);
        c1z0.n(linearLayout2, "bottom_layout");
        addView(linearLayout2);
    }

    @NonNull
    public LinearLayout getDomainContainer() {
        return this.e;
    }

    @NonNull
    public TextView getDomainTextView() {
        return this.c;
    }

    @NonNull
    public whz0 getImageView() {
        return this.b;
    }

    @NonNull
    public whz0 getLogoImageView() {
        return this.d;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        whz0 whz0Var = this.b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) whz0Var.getLayoutParams();
        if (configuration.orientation == 2) {
            layoutParams.gravity = 8388627;
        } else {
            layoutParams.gravity = 49;
        }
        whz0Var.setLayoutParams(layoutParams);
    }
}
