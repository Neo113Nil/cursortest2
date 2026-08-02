package xsna;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.SparseIntArray;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class mzy0 extends LinearLayout {
    public final ImageView b;
    public final TextView c;

    public mzy0(Context context) {
        super(context);
        ujz0 ujz0Var = new ujz0(context);
        rvy0 rvy0Var = new rvy0(context);
        int i = ujz0.i;
        SparseIntArray sparseIntArray = ujz0Var.a;
        int i2 = sparseIntArray.get(i);
        int i3 = ujz0.g;
        int i4 = sparseIntArray.get(i3);
        setPadding(i2, i4, i2, i4);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i5 = sparseIntArray.get(ujz0.k);
        layoutParams.setMargins(i5, i5, i5, i5);
        setLayoutParams(layoutParams);
        setOrientation(0);
        setGravity(16);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(rvy0Var.a.get(rvy0.d));
        gradientDrawable.setCornerRadius(sparseIntArray.get(ujz0.y));
        setBackground(gradientDrawable);
        ImageView imageView = new ImageView(context);
        int i6 = sparseIntArray.get(ujz0.m);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i6, i6);
        layoutParams2.setMarginEnd(sparseIntArray.get(i3));
        imageView.setLayoutParams(layoutParams2);
        imageView.setColorFilter(-1);
        this.b = imageView;
        c1z0.n(imageView, "ads_icon");
        addView(imageView);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextSize(sparseIntArray.get(ujz0.Y));
        textView.setTextColor(-1);
        textView.setAllCaps(true);
        this.c = textView;
        c1z0.n(textView, "age_restrictions_text_view");
        addView(textView);
    }

    @NonNull
    public ImageView getAdsIcon() {
        return this.b;
    }

    @NonNull
    public TextView getAgeRestrictionsTextView() {
        return this.c;
    }
}
