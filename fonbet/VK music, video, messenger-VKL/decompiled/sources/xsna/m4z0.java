package xsna;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.j7z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class m4z0 extends LinearLayout implements j7z0.a, e0z0, View.OnClickListener {
    public WeakReference b;
    public final ujz0 c;
    public final Button d;
    public final RadioGroup e;
    public final TextView f;
    public final auy0 g;
    public FrameLayout h;
    public b520 i;
    public final rvy0 j;
    public final wx40 k;
    public final kpy0 l;

    public m4z0(Context context, kpy0 kpy0Var) {
        super(context);
        this.l = kpy0Var;
        setOrientation(1);
        this.k = new wx40(kpy0Var, 20);
        ujz0 ujz0Var = new ujz0(context);
        this.c = ujz0Var;
        rvy0 rvy0Var = new rvy0(context);
        this.j = rvy0Var;
        GradientDrawable a = ful0.a(0);
        int i = rvy0.r;
        SparseIntArray sparseIntArray = rvy0Var.a;
        a.setColor(sparseIntArray.get(i));
        int i2 = ujz0.n;
        SparseIntArray sparseIntArray2 = ujz0Var.a;
        float f = sparseIntArray2.get(i2);
        a.setCornerRadii(new float[]{f, f, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT});
        setBackground(a);
        auy0 auy0Var = new auy0(context);
        int i3 = ujz0.D;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(sparseIntArray2.get(i3), sparseIntArray2.get(ujz0.E));
        int i4 = ujz0.k;
        int i5 = sparseIntArray2.get(i4);
        int i6 = sparseIntArray2.get(ujz0.g);
        layoutParams.setMargins(i5, i6, 0, i6);
        auy0Var.setLayoutParams(layoutParams);
        int i7 = sparseIntArray2.get(i4);
        int i8 = ujz0.m;
        int i9 = sparseIntArray2.get(i8);
        auy0Var.f = i9;
        auy0Var.i = i9;
        auy0Var.g = i7;
        auy0Var.h = i7;
        auy0Var.a(hpy0.a(context, "M 0.263 0.264 C 0.615 -0.088 1.185 -0.088 1.536 0.264 L 7 5.727 L 12.463 0.264 C 12.815 -0.088 13.385 -0.088 13.736 0.264 C 14.088 0.615 14.088 1.185 13.736 1.536 L 8.272 7 L 13.736 12.464 C 14.088 12.815 14.088 13.385 13.736 13.736 C 13.385 14.088 12.815 14.088 12.463 13.736 L 7 8.273 L 1.536 13.736 C 1.185 14.088 0.615 14.088 0.263 13.736 C -0.088 13.385 -0.088 12.815 0.263 12.464 L 5.727 7 L 0.263 1.536 C -0.088 1.185 -0.088 0.615 0.263 0.264 Z", sparseIntArray2.get(ujz0.w), sparseIntArray.get(rvy0.G)), false);
        auy0Var.setOnClickListener(new pc3(this, 11));
        this.g = auy0Var;
        addView(f(context));
        View view = new View(context);
        view.setLayoutParams(d());
        view.setBackgroundColor(sparseIntArray.get(rvy0.F));
        addView(view);
        TextView textView = new TextView(context);
        this.f = textView;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int i10 = ujz0.r;
        int i11 = sparseIntArray2.get(i10);
        layoutParams2.setMargins(i11, sparseIntArray2.get(i2), i11, 0);
        textView.setLayoutParams(layoutParams2);
        textView.setTextColor(sparseIntArray.get(rvy0.s));
        int i12 = ujz0.S;
        textView.setTextSize(sparseIntArray2.get(i12));
        textView.setTypeface(null, 1);
        addView(textView);
        ScrollView scrollView = new ScrollView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.weight = 1.0f;
        scrollView.setLayoutParams(layoutParams3);
        RadioGroup radioGroup = new RadioGroup(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        int i13 = sparseIntArray2.get(i8);
        int i14 = sparseIntArray2.get(i10);
        layoutParams4.setMargins(0, i13, 0, 0);
        radioGroup.setLayoutParams(layoutParams4);
        radioGroup.setPadding(i14, 0, i14, 0);
        this.e = radioGroup;
        scrollView.addView(radioGroup);
        addView(scrollView);
        Button button = new Button(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, sparseIntArray2.get(i3));
        int i15 = sparseIntArray2.get(i2);
        int i16 = sparseIntArray2.get(i10);
        layoutParams5.setMargins(i16, i15, i16, i15);
        button.setLayoutParams(layoutParams5);
        button.setTextColor(sparseIntArray.get(rvy0.y));
        button.setTextSize(sparseIntArray2.get(i12));
        button.setBackground(rvy0.b(sparseIntArray2.get(i2), sparseIntArray.get(rvy0.B), sparseIntArray.get(rvy0.A), sparseIntArray.get(rvy0.C)));
        button.setTextAlignment(4);
        button.setEnabled(false);
        this.d = button;
        button.setText(getActionText());
        addView(button);
        auy0Var.setOnClickListener(this);
    }

    @Override // xsna.j7z0.a
    public final void b(boolean z) {
    }

    @Override // xsna.j7z0.a
    public final void c(j7z0 j7z0Var, FrameLayout frameLayout) {
        this.h = frameLayout;
        frameLayout.addView(this, -1, -1);
    }

    public abstract LinearLayout.LayoutParams d();

    public final TextView e(Context context) {
        TextView textView = new TextView(context);
        textView.setTextAlignment(4);
        textView.setTextColor(this.j.a.get(rvy0.s));
        int i = ujz0.X;
        ujz0 ujz0Var = this.c;
        textView.setTextSize(ujz0Var.a.get(i));
        textView.setTypeface(textView.getTypeface(), 1);
        textView.setPadding(ujz0Var.a.get(ujz0.k), 0, 0, 0);
        return textView;
    }

    public abstract LinearLayout f(Context context);

    @NonNull
    public abstract String getActionText();

    @Override // xsna.j7z0.a
    public final void m() {
        FrameLayout frameLayout = this.h;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
            this.b = null;
        }
    }

    public void onClick(View view) {
        if (view == this.g) {
            dismiss();
        }
    }

    public final void b(ArrayList arrayList) {
        int i = ujz0.m;
        ujz0 ujz0Var = this.c;
        int i2 = ujz0Var.a.get(i);
        int i3 = ujz0.r;
        SparseIntArray sparseIntArray = ujz0Var.a;
        int i4 = sparseIntArray.get(i3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final b520 b520Var = (b520) it.next();
            RadioButton radioButton = new RadioButton(getContext());
            radioButton.setPaddingRelative(i4, i2, i4, i2);
            radioButton.setText(b520Var.a);
            int i5 = rvy0.s;
            rvy0 rvy0Var = this.j;
            radioButton.setTextColor(rvy0Var.a.get(i5));
            radioButton.setTextSize(sparseIntArray.get(ujz0.S));
            StateListDrawable stateListDrawable = new StateListDrawable();
            int i6 = sparseIntArray.get(ujz0.v);
            int[] iArr = {R.attr.state_checked};
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(0);
            int i7 = ujz0.f;
            int i8 = sparseIntArray.get(i7);
            int i9 = rvy0.G;
            SparseIntArray sparseIntArray2 = rvy0Var.a;
            gradientDrawable.setStroke(i8, sparseIntArray2.get(i9));
            gradientDrawable.setSize(i6, i6);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(1);
            gradientDrawable2.setColor(sparseIntArray2.get(i9));
            int i10 = sparseIntArray.get(ujz0.i);
            int i11 = i6 / 2;
            gradientDrawable2.setSize(i11, i11);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
            layerDrawable.setLayerInset(1, i10, i10, i10, i10);
            stateListDrawable.addState(iArr, layerDrawable);
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setShape(1);
            gradientDrawable3.setColor(-1);
            gradientDrawable3.setStroke(sparseIntArray.get(i7), sparseIntArray2.get(rvy0.H));
            gradientDrawable3.setSize(i6, i6);
            stateListDrawable.addState(new int[0], gradientDrawable3);
            radioButton.setButtonDrawable(stateListDrawable);
            radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.i4z0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    m4z0 m4z0Var = m4z0.this;
                    if (!z) {
                        m4z0Var.getClass();
                    } else {
                        m4z0Var.i = b520Var;
                        m4z0Var.d.setEnabled(true);
                    }
                }
            });
            this.e.addView(radioButton);
        }
    }
}
