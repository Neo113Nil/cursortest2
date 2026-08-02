package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class zrz0 extends kcz0 {
    public final whz0 b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final Button f;

    public zrz0(Context context) {
        super(context);
        ujz0 ujz0Var = new ujz0(context);
        rvy0 rvy0Var = new rvy0(context);
        int i = ujz0.L;
        SparseIntArray sparseIntArray = ujz0Var.a;
        setMinimumWidth(sparseIntArray.get(i));
        setBackgroundColor(0);
        setOrientation(1);
        setGravity(16);
        int i2 = ujz0.r;
        int i3 = sparseIntArray.get(i2);
        setPadding(i3, i3, i3, i3);
        whz0 whz0Var = new whz0(context);
        int i4 = sparseIntArray.get(ujz0.u);
        int i5 = ujz0.k;
        int i6 = sparseIntArray.get(i5);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i4, i4);
        layoutParams.rightMargin = i6;
        whz0Var.setLayoutParams(layoutParams);
        int i7 = sparseIntArray.get(ujz0.d);
        whz0Var.setPadding(i7, i7, i7, i7);
        whz0Var.setBackground(rvy0Var.a(sparseIntArray.get(r2) / 2.0f));
        whz0Var.setVisibility(8);
        this.b = whz0Var;
        c1z0.n(whz0Var, "icon_image_view");
        float f = sparseIntArray.get(ujz0.O);
        int i8 = rvy0.z;
        SparseIntArray sparseIntArray2 = rvy0Var.a;
        TextView a = a(context, f, sparseIntArray2.get(i8), 0, false, 1, TextUtils.TruncateAt.MARQUEE);
        this.c = a;
        c1z0.n(a, "domain_text_view");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(whz0Var);
        linearLayout.addView(a);
        c1z0.n(linearLayout, "domain_container");
        addView(linearLayout);
        float f2 = sparseIntArray.get(ujz0.X);
        int i9 = sparseIntArray2.get(rvy0.s);
        int i10 = sparseIntArray.get(ujz0.n);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextView a2 = a(context, f2, i9, i10, true, 2, truncateAt);
        this.d = a2;
        c1z0.n(a2, "title_text_view");
        addView(a2);
        TextView a3 = a(context, sparseIntArray.get(r2), sparseIntArray2.get(rvy0.t), sparseIntArray.get(i5), false, 5, truncateAt);
        this.e = a3;
        c1z0.n(a3, "description_text_view");
        addView(a3);
        Button button = new Button(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = sparseIntArray.get(i2);
        button.setLayoutParams(layoutParams2);
        int i11 = sparseIntArray.get(i2);
        int i12 = sparseIntArray.get(i5);
        button.setPadding(i11, i12, i11, i12);
        button.setTextColor(sparseIntArray2.get(rvy0.y));
        button.setTextSize(sparseIntArray.get(r2));
        button.setTypeface(null, 1);
        button.setBackground(rvy0.b(sparseIntArray.get(r11), sparseIntArray2.get(rvy0.B), sparseIntArray2.get(rvy0.A), sparseIntArray2.get(rvy0.C)));
        button.setVisibility(8);
        this.f = button;
        c1z0.n(button, "action_button");
        addView(button);
    }

    public static TextView a(Context context, float f, int i, int i2, boolean z, int i3, TextUtils.TruncateAt truncateAt) {
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = i2;
        textView.setLayoutParams(layoutParams);
        textView.setTextSize(f);
        textView.setTextColor(i);
        if (z) {
            textView.setTypeface(null, 1);
        }
        if (i3 > 0) {
            textView.setMaxLines(i3);
            if (truncateAt != null) {
                textView.setEllipsize(truncateAt);
            }
        }
        textView.setVisibility(8);
        return textView;
    }

    @Override // xsna.kcz0
    @NonNull
    public Button getCtaButton() {
        return this.f;
    }

    @Override // xsna.kcz0
    @NonNull
    public TextView getDescriptionTextView() {
        return this.e;
    }

    @Override // xsna.kcz0
    @NonNull
    public TextView getDomainTextView() {
        return this.c;
    }

    @Override // xsna.kcz0
    @NonNull
    public whz0 getLogoImageView() {
        return this.b;
    }

    @Override // xsna.kcz0
    @NonNull
    public TextView getTitleTextView() {
        return this.d;
    }
}
