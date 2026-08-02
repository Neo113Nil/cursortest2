package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.ironsource.X3;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class n7z0 extends LinearLayout implements View.OnClickListener {
    public final ujz0 b;
    public final TextView c;
    public final TextView d;
    public final Button e;
    public final whz0 f;
    public final TextView g;
    public final FrameLayout h;
    public final mzy0 i;
    public final auy0 j;
    public boolean k;
    public m6z0 l;
    public z9z0 m;
    public final s8z0 n;
    public final baz0 o;

    public n7z0(Context context, baz0 baz0Var) {
        super(context);
        this.m = new y9z0();
        this.n = new s8z0(new fhb0(this, 18));
        this.o = baz0Var;
        ujz0 ujz0Var = new ujz0(context);
        this.b = ujz0Var;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        frameLayout.setLayoutParams(layoutParams);
        mzy0 mzy0Var = new mzy0(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        int i = ujz0.k;
        SparseIntArray sparseIntArray = ujz0Var.a;
        int i2 = sparseIntArray.get(i);
        layoutParams2.setMargins(i2, i2, 0, 0);
        layoutParams2.gravity = 8388659;
        mzy0Var.setLayoutParams(layoutParams2);
        this.i = mzy0Var;
        frameLayout.addView(mzy0Var);
        auy0 auy0Var = new auy0(context);
        auy0Var.setOnClickListener(this);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(sparseIntArray.get(ujz0.C), sparseIntArray.get(ujz0.D));
        layoutParams3.gravity = 8388661;
        auy0Var.setLayoutParams(layoutParams3);
        int i3 = sparseIntArray.get(i);
        auy0Var.setPadding(i3, i3, i3 / 2, i3);
        auy0Var.a(ywy0.b(sparseIntArray.get(ujz0.w), getContext(), true), false);
        this.j = auy0Var;
        frameLayout.addView(auy0Var);
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        int i4 = ujz0.r;
        int i5 = sparseIntArray.get(i4);
        linearLayout.setPadding(0, i5, 0, i5);
        linearLayout.setLayoutParams(layoutParams4);
        addView(linearLayout);
        TextView textView = new TextView(context);
        textView.setTypeface(null, 1);
        textView.setMaxLines(2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextSize(sparseIntArray.get(ujz0.N));
        this.c = textView;
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        int i6 = ujz0.O;
        textView2.setTextSize(sparseIntArray.get(i6));
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(0, sparseIntArray.get(ujz0.g), 0, 0);
        textView2.setLayoutParams(layoutParams5);
        this.d = textView2;
        linearLayout.addView(textView2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams6.weight = 1.0f;
        layoutParams6.setMargins(0, sparseIntArray.get(ujz0.n), 0, 0);
        linearLayout2.setLayoutParams(layoutParams6);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        Button button = new Button(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams7.setMarginEnd(sparseIntArray.get(i4));
        button.setLayoutParams(layoutParams7);
        int i7 = sparseIntArray.get(i4);
        int i8 = sparseIntArray.get(ujz0.m);
        button.setPadding(i7, i8, i7, i8);
        button.setTextSize(sparseIntArray.get(i6));
        button.setTypeface(null, 1);
        this.e = button;
        linearLayout2.addView(button);
        whz0 whz0Var = new whz0(context);
        int i9 = sparseIntArray.get(ujz0.u);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(i9, i9);
        layoutParams8.setMarginEnd(sparseIntArray.get(i));
        whz0Var.setLayoutParams(layoutParams8);
        int i10 = sparseIntArray.get(ujz0.d);
        whz0Var.setPadding(i10, i10, i10, i10);
        this.f = whz0Var;
        linearLayout2.addView(whz0Var);
        TextView textView3 = new TextView(context);
        textView3.setTextSize(sparseIntArray.get(i6));
        this.g = textView3;
        linearLayout2.addView(textView3);
        linearLayout.addView(linearLayout2);
    }

    public int a(View view) {
        if (view == this.e) {
            return 64;
        }
        if (view == this.d) {
            return 2;
        }
        return view == this ? 2048 : -1;
    }

    public final GradientDrawable b(rvy0 rvy0Var) {
        GradientDrawable a = ful0.a(0);
        a.setColor(rvy0Var.a.get(rvy0.x));
        a.setCornerRadius(this.b.a.get(ujz0.r));
        return a;
    }

    public final Size c(int i, int i2) {
        float f;
        FrameLayout frameLayout = this.h;
        int height = frameLayout.getHeight();
        int width = frameLayout.getWidth();
        float f2 = i / i2;
        if (f2 == 1.0f) {
            if (width < height) {
                height = (int) (width / f2);
            } else {
                f = height / f2;
                width = (int) f;
            }
        } else if (f2 > 1.0f) {
            int i3 = (int) (width / f2);
            if (i3 > height) {
                f = height * f2;
                width = (int) f;
            } else {
                height = i3;
            }
        } else {
            int i4 = (int) (height * f2);
            if (i4 > width) {
                height = i4;
            } else {
                width = i4;
            }
        }
        return new Size(width, height);
    }

    public final void d() {
        rvy0 rvy0Var = new rvy0(getContext());
        this.h.setBackground(b(rvy0Var));
        int i = rvy0.s;
        SparseIntArray sparseIntArray = rvy0Var.a;
        this.c.setTextColor(sparseIntArray.get(i));
        this.d.setTextColor(sparseIntArray.get(rvy0.t));
        int i2 = sparseIntArray.get(rvy0.B);
        int i3 = rvy0.y;
        int i4 = sparseIntArray.get(i3);
        int i5 = sparseIntArray.get(rvy0.C);
        int i6 = ujz0.n;
        ujz0 ujz0Var = this.b;
        StateListDrawable b = rvy0.b(ujz0Var.a.get(i6), i2, i4, i5);
        Button button = this.e;
        button.setBackground(b);
        button.setTextColor(sparseIntArray.get(i3));
        this.f.setBackground(rvy0Var.a(ujz0Var.a.get(ujz0.d) / 2.0f));
        this.g.setTextColor(sparseIntArray.get(rvy0.z));
    }

    public abstract void e(m6z0 m6z0Var);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m6z0 m6z0Var = this.l;
        if (m6z0Var == null) {
            return;
        }
        boolean z = this.k;
        Button button = this.e;
        auy0 auy0Var = this.j;
        baz0 baz0Var = this.o;
        if (!z) {
            tez0 tez0Var = m6z0Var.a;
            if (view != auy0Var) {
                if (view == button) {
                    baz0Var.b(tez0Var, 2, new akz0(), this);
                    return;
                } else {
                    baz0Var.b(tez0Var, 1, new akz0(), this);
                    return;
                }
            }
            Context context = getContext();
            baz0Var.getClass();
            wty0 wty0Var = tez0Var.L;
            if (wty0Var == null) {
                return;
            }
            kpy0 kpy0Var = baz0Var.j;
            if (kpy0Var == null) {
                de.L(wty0Var.b, null, null, null, context);
                return;
            } else {
                kpy0Var.b();
                return;
            }
        }
        int a = a(view);
        if (a == -1) {
            return;
        }
        viy0 viy0Var = new viy0(a, this.m);
        m6z0 m6z0Var2 = this.l;
        if (m6z0Var2 == null) {
            return;
        }
        tez0 tez0Var2 = m6z0Var2.a;
        if (view != auy0Var) {
            if (view == button) {
                baz0Var.b(tez0Var2, 2, viy0Var, this);
                return;
            } else {
                baz0Var.b(tez0Var2, 1, viy0Var, this);
                return;
            }
        }
        Context context2 = getContext();
        baz0Var.getClass();
        wty0 wty0Var2 = tez0Var2.L;
        if (wty0Var2 == null) {
            return;
        }
        kpy0 kpy0Var2 = baz0Var.j;
        if (kpy0Var2 == null) {
            de.L(wty0Var2.b, null, null, null, context2);
        } else {
            kpy0Var2.b();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    public void setBannerData(@NonNull m6z0 m6z0Var) {
        LinearLayout.LayoutParams layoutParams;
        d();
        this.l = m6z0Var;
        tez0 tez0Var = m6z0Var.a;
        giy0 giy0Var = tez0Var.T;
        Context context = getContext();
        baz0 baz0Var = this.o;
        baz0Var.getClass();
        wty0 wty0Var = tez0Var.L;
        if (wty0Var != null && wty0Var.c != null) {
            kpy0 kpy0Var = new kpy0(wty0Var, tez0Var.i(), context);
            baz0Var.j = kpy0Var;
            kpy0Var.e = new qu50(baz0Var, 24);
        }
        this.k = giy0Var.c;
        e(m6z0Var);
        int i = getContext().getResources().getConfiguration().orientation;
        ujz0 ujz0Var = this.b;
        if (i == 2) {
            int i2 = (c1z0.l(getContext()).x - (ujz0Var.a.get(ujz0.r) * 3)) / 2;
            layoutParams = new LinearLayout.LayoutParams(i2, -1);
            setMinimumWidth(i2);
        } else {
            int i3 = (c1z0.l(getContext()).y - (ujz0Var.a.get(ujz0.D) + (ujz0Var.a.get(ujz0.r) * 2))) / 2;
            layoutParams = new LinearLayout.LayoutParams(-1, i3);
            setMinimumHeight(i3);
        }
        setLayoutParams(layoutParams);
        this.c.setText(tez0Var.f);
        this.d.setText(tez0Var.c);
        this.e.setText(tez0Var.n());
        kiw kiwVar = tez0Var.u;
        if (kiwVar != null) {
            this.f.setImageBitmap(j6z0.a(kiwVar.a()));
        }
        this.g.setText(tez0Var.p.equals(X3.i.U) ? tez0Var.l : tez0Var.o);
        kiw kiwVar2 = tez0Var.e0;
        String i4 = tez0Var.i();
        mzy0 mzy0Var = this.i;
        if (kiwVar2 == null && TextUtils.isEmpty(i4)) {
            mzy0Var.setVisibility(4);
        } else {
            if (kiwVar2 != null) {
                mzy0Var.getAdsIcon().setImageBitmap(kiwVar2.a());
            }
            mzy0Var.getAgeRestrictionsTextView().setText(i4);
            mzy0Var.setVisibility(0);
        }
        boolean z = giy0Var.c;
        k6z0 k6z0Var = tez0Var.v;
        this.k = z;
        if (z) {
            setClickAreaActual(k6z0Var);
        } else {
            setClickAreaLegacy(k6z0Var);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setClickAreaActual(@NonNull k6z0 k6z0Var) {
        s8z0 s8z0Var = this.n;
        setOnTouchListener(s8z0Var);
        TextView textView = this.d;
        textView.setOnTouchListener(s8z0Var);
        Button button = this.e;
        button.setOnTouchListener(s8z0Var);
        if (k6z0Var.m) {
            setOnClickListener(this);
            button.setOnClickListener(this);
            textView.setOnClickListener(this);
        } else {
            setOnClickListener(k6z0Var.l ? this : null);
            button.setOnClickListener(k6z0Var.g ? this : null);
            textView.setOnClickListener(k6z0Var.b ? this : null);
        }
    }

    public void setClickAreaLegacy(@NonNull k6z0 k6z0Var) {
        boolean z = k6z0Var.m;
        Button button = this.e;
        if (z) {
            setOnClickListener(this);
            button.setOnClickListener(this);
        } else {
            setOnClickListener(k6z0Var.l ? this : null);
            button.setOnClickListener(k6z0Var.g ? this : null);
            this.d.setOnClickListener(k6z0Var.b ? this : null);
        }
    }
}
