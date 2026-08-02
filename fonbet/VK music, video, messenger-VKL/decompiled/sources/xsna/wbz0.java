package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class wbz0 extends kcz0 {
    public final TextView b;
    public final TextView c;
    public final Button d;

    public wbz0(Context context) {
        super(context);
        ujz0 ujz0Var = new ujz0(context);
        rvy0 rvy0Var = new rvy0(context);
        int i = ujz0.H;
        SparseIntArray sparseIntArray = ujz0Var.a;
        setMinimumHeight(sparseIntArray.get(i));
        setBackgroundColor(0);
        setOrientation(0);
        setGravity(16);
        int i2 = ujz0.n;
        int i3 = sparseIntArray.get(i2);
        int i4 = ujz0.r;
        int i5 = sparseIntArray.get(i4);
        setPadding(i3, i5, i3, i5);
        LinearLayout a = io.reactivex.rxjava3.internal.operators.observable.q1.a(1, context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.rightMargin = sparseIntArray.get(i2);
        a.setLayoutParams(layoutParams);
        float f = sparseIntArray.get(ujz0.T);
        int i6 = rvy0.s;
        SparseIntArray sparseIntArray2 = rvy0Var.a;
        TextView a2 = a(context, f, sparseIntArray2.get(i6), 0, true);
        this.b = a2;
        c1z0.n(a2, "title_text_view");
        a.addView(a2);
        int i7 = ujz0.O;
        TextView a3 = a(context, sparseIntArray.get(i7), sparseIntArray2.get(rvy0.t), sparseIntArray.get(ujz0.g), false);
        this.c = a3;
        c1z0.n(a3, "description_text_view");
        a.addView(a3);
        addView(a);
        Button button = new Button(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388629;
        button.setLayoutParams(layoutParams2);
        int i8 = sparseIntArray.get(i4);
        int i9 = sparseIntArray.get(ujz0.k);
        button.setPadding(i8, i9, i8, i9);
        button.setTextColor(sparseIntArray2.get(rvy0.y));
        button.setTextSize(sparseIntArray.get(i7));
        button.setTypeface(null, 1);
        button.setBackground(rvy0.b(sparseIntArray.get(i2), sparseIntArray2.get(rvy0.B), sparseIntArray2.get(rvy0.A), sparseIntArray2.get(rvy0.C)));
        button.setVisibility(8);
        this.d = button;
        c1z0.n(button, "action_button");
        addView(button);
    }

    public static TextView a(Context context, float f, int i, int i2, boolean z) {
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = i2;
        textView.setLayoutParams(layoutParams);
        textView.setTextSize(f);
        textView.setTextColor(i);
        if (z) {
            textView.setTypeface(null, 1);
        }
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setVisibility(8);
        return textView;
    }

    @Override // xsna.kcz0
    @NonNull
    public Button getCtaButton() {
        return this.d;
    }

    @Override // xsna.kcz0
    @NonNull
    public TextView getDescriptionTextView() {
        return this.c;
    }

    @Override // xsna.kcz0
    @Nullable
    public TextView getDomainTextView() {
        return null;
    }

    @Override // xsna.kcz0
    @Nullable
    public whz0 getLogoImageView() {
        return null;
    }

    @Override // xsna.kcz0
    @NonNull
    public TextView getTitleTextView() {
        return this.b;
    }
}
