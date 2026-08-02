package xsna;

import android.content.Context;
import android.util.SparseIntArray;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class cry0 extends LinearLayout {
    public final ujz0 b;
    public final rvy0 c;
    public final whz0 d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final whz0 h;
    public final fbz0 i;

    public cry0(Context context) {
        super(context);
        ujz0 ujz0Var = new ujz0(context);
        this.b = ujz0Var;
        rvy0 rvy0Var = new rvy0(context);
        this.c = rvy0Var;
        setOrientation(0);
        setGravity(16);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        whz0 whz0Var = new whz0(context);
        int i = ujz0.y;
        SparseIntArray sparseIntArray = ujz0Var.a;
        int i2 = sparseIntArray.get(i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        int i3 = sparseIntArray.get(ujz0.m);
        int i4 = sparseIntArray.get(ujz0.n);
        layoutParams.setMargins(i4, i4, i3, i4);
        whz0Var.setLayoutParams(layoutParams);
        whz0Var.setBackground(rvy0Var.a(sparseIntArray.get(ujz0.d) / 2.0f));
        this.d = whz0Var;
        c1z0.n(whz0Var, "logo_icon");
        addView(whz0Var);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.weight = 1.0f;
        linearLayout.setLayoutParams(layoutParams2);
        TextView textView = new TextView(context);
        textView.setTextSize(sparseIntArray.get(ujz0.O));
        int i5 = rvy0.s;
        SparseIntArray sparseIntArray2 = rvy0Var.a;
        textView.setTextColor(sparseIntArray2.get(i5));
        textView.setTypeface(textView.getTypeface(), 1);
        this.e = textView;
        c1z0.n(textView, "title_text_view");
        linearLayout.addView(textView);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setGravity(16);
        linearLayout2.setOrientation(0);
        TextView a = a(context);
        this.f = a;
        linearLayout2.addView(a);
        TextView a2 = a(context);
        a2.setText("·");
        linearLayout2.addView(a2);
        TextView a3 = a(context);
        this.g = a3;
        linearLayout2.addView(a3);
        whz0 whz0Var2 = new whz0(context);
        int i6 = sparseIntArray.get(ujz0.l);
        whz0Var2.setLayoutParams(new LinearLayout.LayoutParams(i6, i6));
        whz0Var2.setColorFilter(sparseIntArray2.get(rvy0.z));
        this.h = whz0Var2;
        linearLayout2.addView(whz0Var2);
        linearLayout.addView(linearLayout2);
        addView(linearLayout);
        fbz0 fbz0Var = new fbz0(context);
        this.i = fbz0Var;
        fbz0Var.getAdChoicesButton().a(ywy0.b(sparseIntArray.get(ujz0.w), context, false), false);
        fbz0Var.getAdChoicesButton().setBackgroundColor(0);
        addView(fbz0Var);
    }

    public final TextView a(Context context) {
        TextView textView = new TextView(context);
        int i = ujz0.Y;
        ujz0 ujz0Var = this.b;
        textView.setTextSize(ujz0Var.a.get(i));
        textView.setTextColor(this.c.a.get(rvy0.z));
        textView.setAllCaps(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(ujz0Var.a.get(ujz0.g));
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    @NonNull
    public whz0 getAdsIcon() {
        return this.h;
    }

    @NonNull
    public TextView getAgeRestrictionTextView() {
        return this.g;
    }

    @NonNull
    public fbz0 getButtonsView() {
        return this.i;
    }

    @NonNull
    public TextView getDomainTextView() {
        return this.f;
    }

    @NonNull
    public whz0 getLogoIcon() {
        return this.d;
    }

    @NonNull
    public TextView getTitleTextView() {
        return this.e;
    }
}
