package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ajz0 extends LinearLayout implements View.OnClickListener {
    public final whz0 b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final Button g;
    public final FrameLayout h;
    public final ujz0 i;
    public rvy0 j;
    public z9z0 k;
    public final s8z0 l;
    public a m;
    public boolean n;
    public k6z0 o;
    public wfy0 p;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface a {
        void a(wfy0 wfy0Var, int i, dhz0 dhz0Var, View view);
    }

    public ajz0(Context context) {
        super(context);
        this.k = new y9z0();
        this.l = new s8z0(new bx80(this, 19));
        this.n = false;
        ujz0 ujz0Var = new ujz0(context);
        this.i = ujz0Var;
        this.j = new rvy0(context);
        setOrientation(1);
        whz0 whz0Var = new whz0(context);
        this.b = whz0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        GradientDrawable a2 = ful0.a(0);
        a2.setColor(this.j.a.get(rvy0.x));
        int i = ujz0.d;
        SparseIntArray sparseIntArray = ujz0Var.a;
        a2.setStroke(sparseIntArray.get(i), this.j.a.get(rvy0.k));
        a2.setCornerRadius(sparseIntArray.get(ujz0.r));
        frameLayout.setBackground(a2);
        frameLayout.setClipToOutline(true);
        this.h = frameLayout;
        frameLayout.addView(whz0Var);
        TextView textView = new TextView(context);
        int i2 = ujz0.g;
        int i3 = sparseIntArray.get(i2);
        textView.setPadding(i3, i3, i3, i3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.j.a.get(rvy0.i));
        gradientDrawable.setCornerRadius(sparseIntArray.get(ujz0.x));
        textView.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i4 = ujz0.i;
        int i5 = sparseIntArray.get(i4);
        layoutParams.setMargins(i5, i5, 0, 0);
        textView.setLayoutParams(layoutParams);
        textView.setTextColor(-1);
        textView.setTypeface(null, 1);
        int i6 = ujz0.R;
        textView.setTextSize(sparseIntArray.get(i6));
        textView.setVisibility(8);
        this.c = textView;
        frameLayout.addView(textView);
        rvy0 rvy0Var = this.j;
        int i7 = rvy0.s;
        TextView a3 = a(rvy0Var.a.get(i7), context, false);
        this.d = a3;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginEnd(sparseIntArray.get(i4));
        a3.setLayoutParams(layoutParams2);
        LinearLayout a4 = io.reactivex.rxjava3.internal.operators.observable.q1.a(0, context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int i8 = sparseIntArray.get(ujz0.k);
        int i9 = sparseIntArray.get(i2);
        layoutParams3.setMargins(i9, i8, i9, 0);
        a4.setLayoutParams(layoutParams3);
        a4.addView(a3);
        TextView a5 = a(this.j.a.get(rvy0.v), context, true);
        this.e = a5;
        a4.addView(a5);
        a5.setVisibility(8);
        addView(frameLayout);
        addView(a4);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(sparseIntArray.get(i6));
        textView2.setTextColor(this.j.a.get(i7));
        textView2.setLines(2);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        int i10 = sparseIntArray.get(i2);
        layoutParams4.setMargins(i10, i10 / 2, i10, i10);
        textView2.setLayoutParams(layoutParams4);
        this.f = textView2;
        addView(textView2);
        Button button = new Button(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        int i11 = sparseIntArray.get(i2);
        layoutParams5.setMargins(i11, i11, i11, i11);
        button.setLayoutParams(layoutParams5);
        int i12 = this.j.a.get(rvy0.w);
        int i13 = this.j.a.get(rvy0.A);
        int i14 = this.j.a.get(rvy0.E);
        int i15 = ujz0.m;
        button.setBackground(rvy0.b(sparseIntArray.get(i15), i12, i13, i14));
        button.setTextColor(this.j.a.get(rvy0.B));
        button.setTextSize(sparseIntArray.get(ujz0.Q));
        int i16 = sparseIntArray.get(i15);
        int i17 = sparseIntArray.get(i2);
        button.setPadding(i16, i17, i16, i17);
        button.setTypeface(null, 1);
        this.g = button;
        addView(button);
    }

    public final TextView a(int i, Context context, boolean z) {
        TextView textView = new TextView(context);
        textView.setTextSize(this.i.a.get(ujz0.Q));
        textView.setTextColor(i);
        textView.setTypeface(null, 1);
        if (z) {
            textView.setPaintFlags(textView.getPaintFlags() | 16);
        }
        return textView;
    }

    public final void b() {
        rvy0 rvy0Var = new rvy0(getContext());
        this.j = rvy0Var;
        int i = rvy0.s;
        this.d.setTextColor(rvy0Var.a.get(i));
        this.e.setTextColor(this.j.a.get(rvy0.v));
        this.f.setTextColor(this.j.a.get(i));
        StateListDrawable b = rvy0.b(this.i.a.get(ujz0.m), this.j.a.get(rvy0.w), this.j.a.get(rvy0.A), this.j.a.get(rvy0.E));
        Button button = this.g;
        button.setBackground(b);
        button.setTextColor(this.j.a.get(rvy0.B));
    }

    @NonNull
    public Button getActionButton() {
        return this.g;
    }

    @NonNull
    public whz0 getAdImage() {
        return this.b;
    }

    @NonNull
    public TextView getDescriptionTextView() {
        return this.f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        wfy0 wfy0Var;
        wfy0 wfy0Var2;
        boolean z = this.n;
        Button button = this.g;
        if (!z) {
            a aVar = this.m;
            if (aVar == null || (wfy0Var = this.p) == null) {
                return;
            }
            if (view == button) {
                aVar.a(wfy0Var, 2, new akz0(), view);
                return;
            } else {
                aVar.a(wfy0Var, 1, new akz0(), view);
                return;
            }
        }
        int i = view == button ? 64 : (view == this.d || view == this.e) ? 1 : view == this.f ? 2 : view == this.b ? 8 : view == this ? 2048 : -1;
        if (i == -1) {
            return;
        }
        viy0 viy0Var = new viy0(i, this.k);
        a aVar2 = this.m;
        if (aVar2 == null || (wfy0Var2 = this.p) == null) {
            return;
        }
        if (view == button) {
            aVar2.a(wfy0Var2, 2, viy0Var, view);
        } else {
            aVar2.a(wfy0Var2, 1, viy0Var, view);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    public void setCard(@NonNull wfy0 wfy0Var) {
        LinearLayout.LayoutParams layoutParams;
        this.p = wfy0Var;
        b();
        this.n = wfy0Var.T.c;
        this.o = wfy0Var.v;
        kiw kiwVar = wfy0Var.t;
        whz0 whz0Var = this.b;
        if (kiwVar != null) {
            whz0Var.setImageBitmap(kiwVar.a());
        } else {
            whz0Var.setImageBitmap(null);
        }
        this.f.setText(wfy0Var.f);
        this.g.setText(wfy0Var.n());
        boolean isEmpty = TextUtils.isEmpty(wfy0Var.Q);
        TextView textView = this.e;
        TextView textView2 = this.d;
        if (isEmpty) {
            textView2.setText(wfy0Var.O);
            textView.setVisibility(8);
        } else {
            textView2.setText(wfy0Var.Q);
            textView.setText(wfy0Var.O);
            textView2.setVisibility(0);
            textView.setVisibility(0);
        }
        boolean isEmpty2 = TextUtils.isEmpty(wfy0Var.N);
        TextView textView3 = this.c;
        if (isEmpty2) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            textView3.setText(wfy0Var.N);
        }
        if (getContext().getResources().getConfiguration().orientation == 2) {
            layoutParams = new LinearLayout.LayoutParams(-2, -1);
            whz0Var.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.weight = 1.0f;
        this.h.setLayoutParams(layoutParams2);
        setLayoutParams(layoutParams);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnClickListeners(@NonNull a aVar) {
        this.m = aVar;
        boolean z = this.n;
        whz0 whz0Var = this.b;
        TextView textView = this.d;
        TextView textView2 = this.e;
        TextView textView3 = this.f;
        Button button = this.g;
        if (!z) {
            k6z0 k6z0Var = this.o;
            if (k6z0Var == null) {
                return;
            }
            if (k6z0Var.m) {
                setOnClickListener(this);
                button.setOnClickListener(this);
                whz0Var.setOnClickListener(this);
                textView3.setOnClickListener(this);
                textView.setOnClickListener(this);
                textView2.setOnClickListener(this);
                return;
            }
            setOnClickListener(k6z0Var.l ? this : null);
            button.setOnClickListener(this.o.g ? this : null);
            whz0Var.setOnClickListener(this.o.d ? this : null);
            textView.setOnClickListener(this.o.a ? this : null);
            textView2.setOnClickListener(this.o.a ? this : null);
            textView3.setOnClickListener(this.o.b ? this : null);
            return;
        }
        if (this.o == null) {
            return;
        }
        s8z0 s8z0Var = this.l;
        setOnTouchListener(s8z0Var);
        whz0Var.setOnTouchListener(s8z0Var);
        textView.setOnTouchListener(s8z0Var);
        textView2.setOnTouchListener(s8z0Var);
        textView3.setOnTouchListener(s8z0Var);
        button.setOnTouchListener(s8z0Var);
        k6z0 k6z0Var2 = this.o;
        if (k6z0Var2.m) {
            setOnClickListener(this);
            button.setOnClickListener(this);
            whz0Var.setOnClickListener(this);
            textView3.setOnClickListener(this);
            textView.setOnClickListener(this);
            textView2.setOnClickListener(this);
            return;
        }
        setOnClickListener(k6z0Var2.l ? this : null);
        button.setOnClickListener(this.o.g ? this : null);
        whz0Var.setOnClickListener(this.o.d ? this : null);
        textView.setOnClickListener(this.o.a ? this : null);
        textView2.setOnClickListener(this.o.a ? this : null);
        textView3.setOnClickListener(this.o.b ? this : null);
    }
}
