package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class tjz0 extends ViewGroup implements qiz0, View.OnClickListener {
    public final whz0 b;
    public final e8z0 c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final Button i;
    public final phz0 j;
    public final s8z0 k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final riz0 r;
    public final int s;
    public final int t;
    public final int u;
    public b v;
    public boolean w;
    public z9z0 x;
    public boolean y;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        private static final /* synthetic */ b[] d;

        static {
            b bVar = new b("PORTRAIT", 0);
            a = bVar;
            b bVar2 = new b("LANDSCAPE", 1);
            b = bVar2;
            b bVar3 = new b("SQUARE", 2);
            c = bVar3;
            d = new b[]{bVar, bVar2, bVar3};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }
    }

    public tjz0(riz0 riz0Var, Context context, phz0 phz0Var) {
        super(context);
        this.k = new s8z0(new did0(this, 19));
        this.v = b.a;
        this.x = new y9z0();
        this.y = false;
        this.j = phz0Var;
        this.r = riz0Var;
        this.l = riz0Var.a.get(riz0.F);
        int i = riz0.G;
        SparseIntArray sparseIntArray = riz0Var.a;
        this.m = sparseIntArray.get(i);
        this.u = sparseIntArray.get(riz0.H);
        this.n = sparseIntArray.get(riz0.I);
        this.o = sparseIntArray.get(riz0.o);
        this.p = sparseIntArray.get(riz0.n);
        int i2 = sparseIntArray.get(riz0.N);
        this.s = i2;
        int i3 = sparseIntArray.get(riz0.U);
        this.q = sparseIntArray.get(riz0.T);
        this.t = c1z0.d(i2, context);
        whz0 whz0Var = new whz0(context);
        this.b = whz0Var;
        e8z0 e8z0Var = new e8z0(context);
        this.c = e8z0Var;
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setMaxLines(1);
        textView.setTextSize(1, sparseIntArray.get(riz0.J));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setIncludeFontPadding(false);
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, sparseIntArray.get(riz0.L));
        textView2.setMaxLines(sparseIntArray.get(riz0.M));
        textView2.setEllipsize(truncateAt);
        textView2.setIncludeFontPadding(false);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        float f = i2;
        textView3.setTextSize(1, f);
        textView3.setEllipsize(truncateAt);
        textView3.setLines(1);
        textView3.setIncludeFontPadding(false);
        TextView textView4 = new TextView(context);
        this.g = textView4;
        textView4.setTextSize(1, f);
        textView4.setIncludeFontPadding(false);
        Button button = new Button(context);
        this.i = button;
        button.setLines(1);
        button.setTextSize(1, sparseIntArray.get(riz0.w));
        button.setEllipsize(truncateAt);
        button.setMinimumWidth(i3);
        button.setIncludeFontPadding(false);
        int i4 = sparseIntArray.get(riz0.x);
        int i5 = i4 * 2;
        button.setPadding(i5, i4, i5, i4);
        TextView textView5 = new TextView(context);
        this.h = textView5;
        textView5.setPadding(sparseIntArray.get(riz0.y), 0, 0, 0);
        textView5.setTextColor(-1);
        textView5.setMaxLines(sparseIntArray.get(riz0.B));
        textView5.setIncludeFontPadding(false);
        textView5.setTextSize(1, sparseIntArray.get(riz0.C));
        whz0Var.setContentDescription("panel_icon");
        c1z0.n(whz0Var, "panel_icon");
        textView.setContentDescription("panel_title");
        c1z0.n(textView, "panel_title");
        textView2.setContentDescription("panel_description");
        c1z0.n(textView2, "panel_description");
        textView3.setContentDescription("panel_domain");
        c1z0.n(textView3, "panel_domain");
        textView4.setContentDescription("panel_rating");
        c1z0.n(textView4, "panel_rating");
        button.setContentDescription("panel_cta");
        c1z0.n(button, "panel_cta");
        textView5.setContentDescription("age_bordering");
        c1z0.n(textView5, "age_bordering");
        addView(whz0Var);
        addView(e8z0Var);
        addView(textView);
        addView(textView2);
        addView(textView3);
        addView(textView4);
        addView(button);
        addView(textView5);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setClickArea(@NonNull k6z0 k6z0Var) {
        s8z0 s8z0Var = this.k;
        setOnTouchListener(s8z0Var);
        Button button = this.i;
        button.setOnTouchListener(s8z0Var);
        TextView textView = this.d;
        textView.setOnTouchListener(s8z0Var);
        whz0 whz0Var = this.b;
        whz0Var.setOnTouchListener(s8z0Var);
        TextView textView2 = this.e;
        textView2.setOnTouchListener(s8z0Var);
        TextView textView3 = this.g;
        textView3.setOnTouchListener(s8z0Var);
        e8z0 e8z0Var = this.c;
        e8z0Var.setOnTouchListener(s8z0Var);
        TextView textView4 = this.f;
        textView4.setOnTouchListener(s8z0Var);
        TextView textView5 = this.h;
        textView5.setOnTouchListener(s8z0Var);
        if (k6z0Var.m) {
            setOnClickListener(this);
            button.setOnClickListener(this);
            textView.setOnClickListener(this);
            whz0Var.setOnClickListener(this);
            textView2.setOnClickListener(this);
            textView3.setOnClickListener(this);
            e8z0Var.setOnClickListener(this);
            textView4.setOnClickListener(this);
            textView5.setOnClickListener(this);
            return;
        }
        if (k6z0Var.g) {
            button.setOnClickListener(this);
        } else {
            button.setEnabled(false);
        }
        if (k6z0Var.l) {
            setOnClickListener(this);
        } else {
            setOnClickListener(null);
        }
        if (k6z0Var.a) {
            textView.setOnClickListener(this);
        } else {
            textView.setOnClickListener(null);
        }
        if (k6z0Var.c) {
            whz0Var.setOnClickListener(this);
        } else {
            whz0Var.setOnClickListener(null);
        }
        if (k6z0Var.b) {
            textView2.setOnClickListener(this);
        } else {
            textView2.setOnClickListener(null);
        }
        if (k6z0Var.e) {
            textView3.setOnClickListener(this);
            e8z0Var.setOnClickListener(this);
        } else {
            textView3.setOnClickListener(null);
            e8z0Var.setOnClickListener(null);
        }
        if (k6z0Var.j) {
            textView4.setOnClickListener(this);
        } else {
            textView4.setOnClickListener(null);
        }
        if (k6z0Var.h) {
            textView5.setOnClickListener(this);
        } else {
            textView5.setOnClickListener(null);
        }
    }

    private void setClickAreaLegacy(@NonNull k6z0 k6z0Var) {
        boolean z = k6z0Var.m;
        Button button = this.i;
        if (z) {
            setOnClickListener(this);
            button.setOnClickListener(this);
            return;
        }
        if (k6z0Var.g) {
            button.setOnClickListener(this);
        } else {
            button.setEnabled(false);
        }
        if (k6z0Var.l) {
            setOnClickListener(this);
        } else {
            setOnClickListener(null);
        }
        boolean z2 = k6z0Var.a;
        TextView textView = this.d;
        if (z2) {
            textView.setOnClickListener(this);
        } else {
            textView.setOnClickListener(null);
        }
        boolean z3 = k6z0Var.c;
        whz0 whz0Var = this.b;
        if (z3) {
            whz0Var.setOnClickListener(this);
        } else {
            whz0Var.setOnClickListener(null);
        }
        boolean z4 = k6z0Var.b;
        TextView textView2 = this.e;
        if (z4) {
            textView2.setOnClickListener(this);
        } else {
            textView2.setOnClickListener(null);
        }
        boolean z5 = k6z0Var.e;
        e8z0 e8z0Var = this.c;
        TextView textView3 = this.g;
        if (z5) {
            textView3.setOnClickListener(this);
            e8z0Var.setOnClickListener(this);
        } else {
            textView3.setOnClickListener(null);
            e8z0Var.setOnClickListener(null);
        }
        boolean z6 = k6z0Var.j;
        TextView textView4 = this.f;
        if (z6) {
            textView4.setOnClickListener(this);
        } else {
            textView4.setOnClickListener(null);
        }
        boolean z7 = k6z0Var.h;
        TextView textView5 = this.h;
        if (z7) {
            textView5.setOnClickListener(this);
        } else {
            textView5.setOnClickListener(null);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z = this.y;
        phz0 phz0Var = this.j;
        if (!z) {
            phz0Var.a(null, 1, new akz0());
            return;
        }
        int i = 2;
        Button button = this.i;
        if (view == button) {
            phz0Var.a(null, 2, new viy0(64, this.x));
            return;
        }
        if (view == button) {
            i = 64;
        } else if (view == this.d) {
            i = 1;
        } else if (view == this.b) {
            i = 4;
        } else if (view != this.e) {
            i = view == this.g ? 32 : view == this.c ? 16 : view == this.f ? 512 : view == this.h ? 128 : 2048;
        }
        phz0Var.a(null, 1, new viy0(i, this.x));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        TextView textView = this.f;
        int measuredHeight = textView.getMeasuredHeight();
        e8z0 e8z0Var = this.c;
        int measuredHeight2 = e8z0Var.getMeasuredHeight();
        int i7 = a.a[this.v.ordinal()];
        Button button = this.i;
        TextView textView2 = this.g;
        int i8 = this.m;
        whz0 whz0Var = this.b;
        TextView textView3 = this.d;
        int i9 = this.n;
        if (i7 != 1) {
            TextView textView4 = this.h;
            if (i7 != 3) {
                c1z0.r(whz0Var, i8, i8);
                int right = (i8 / 2) + whz0Var.getRight();
                int e = c1z0.e(textView2.getMeasuredHeight(), measuredHeight2, measuredHeight);
                int e2 = c1z0.e(i2 + i8, whz0Var.getTop());
                if (whz0Var.getMeasuredHeight() > 0) {
                    e2 += (((whz0Var.getMeasuredHeight() - textView3.getMeasuredHeight()) - i9) - e) / 2;
                }
                textView3.layout(right, e2, textView3.getMeasuredWidth() + right, textView3.getMeasuredHeight() + e2);
                c1z0.g(textView3.getBottom() + i9, right, textView3.getBottom() + i9 + e, i8 / 4, e8z0Var, textView2, textView);
                c1z0.u(textView3.getBottom(), textView3.getRight() + i9, textView4);
                return;
            }
            int i10 = this.u;
            int i11 = (i4 - i2) - i10;
            c1z0.u(i11, i10, whz0Var);
            c1z0.s(i11, (i3 - i) - i10, button);
            int right2 = whz0Var.getRight() + i8;
            int e3 = c1z0.e(textView2.getMeasuredHeight(), measuredHeight2, measuredHeight);
            int measuredHeight3 = ((((whz0Var.getMeasuredHeight() - textView3.getMeasuredHeight()) - i9) - e3) / 2) + c1z0.e(whz0Var.getTop(), i9);
            textView3.layout(right2, measuredHeight3, textView3.getMeasuredWidth() + right2, textView3.getMeasuredHeight() + measuredHeight3);
            c1z0.g(textView3.getBottom() + i9, right2, textView3.getBottom() + i9 + e3, i8 / 4, e8z0Var, textView2, textView);
            c1z0.u(textView3.getBottom(), (i8 / 2) + textView3.getRight(), textView4);
            return;
        }
        int measuredHeight4 = whz0Var.getMeasuredHeight();
        if (measuredHeight4 > 0) {
            i6 = 1;
            i5 = measuredHeight4;
        } else {
            i5 = 0;
            i6 = 0;
        }
        int measuredHeight5 = textView3.getMeasuredHeight();
        if (measuredHeight5 > 0) {
            i6++;
            i5 += measuredHeight5;
        }
        TextView textView5 = this.e;
        int measuredHeight6 = textView5.getMeasuredHeight();
        if (measuredHeight6 > 0) {
            i6++;
            i5 += measuredHeight6;
        }
        int max = Math.max(e8z0Var.getMeasuredHeight(), textView.getMeasuredHeight());
        if (max > 0) {
            i6++;
            i5 += max;
        }
        int measuredHeight7 = button.getMeasuredHeight();
        if (measuredHeight7 > 0) {
            i6++;
            i5 += measuredHeight7;
        }
        int i12 = (i4 - i2) - i5;
        int i13 = i12 / i6;
        if (i13 <= i9) {
            i8 = i9;
        } else if (i13 <= i8) {
            i8 = i13;
        }
        int a2 = jq.a(i8, i6, i12, 2);
        int i14 = i3 - i;
        c1z0.j(whz0Var, 0, a2, i14, measuredHeight4 + a2);
        int e4 = c1z0.e(a2, whz0Var.getBottom() + i8);
        c1z0.j(textView3, 0, e4, i14, measuredHeight5 + e4);
        int e5 = c1z0.e(e4, textView3.getBottom() + i8);
        c1z0.j(textView5, 0, e5, i14, e5 + measuredHeight6);
        int e6 = c1z0.e(e5, textView5.getBottom() + i8);
        c1z0.g(e6, jq.a(i9, 2, ((i14 - textView2.getMeasuredWidth()) - e8z0Var.getMeasuredWidth()) - textView.getMeasuredWidth(), 2), max + e6, i9, e8z0Var, textView2, textView);
        int e7 = c1z0.e(e6, textView.getBottom(), e8z0Var.getBottom()) + i8;
        c1z0.j(button, 0, e7, i14, measuredHeight7 + e7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.m;
        int i4 = i3 * 2;
        int i5 = size - i4;
        int i6 = size2 - i4;
        if (i5 == i6) {
            this.v = b.c;
        } else if (i5 > i6) {
            this.v = b.b;
        } else {
            this.v = b.a;
        }
        int i7 = this.l;
        whz0 whz0Var = this.b;
        c1z0.i(whz0Var, i7, i7, 1073741824);
        TextView textView = this.g;
        int visibility = textView.getVisibility();
        int i8 = this.n;
        if (visibility != 8) {
            c1z0.i(textView, (i5 - whz0Var.getMeasuredWidth()) - i8, i6, Integer.MIN_VALUE);
            e8z0 e8z0Var = this.c;
            int i9 = this.t;
            c1z0.i(e8z0Var, i9, i9, 1073741824);
        }
        TextView textView2 = this.f;
        if (textView2.getVisibility() != 8) {
            c1z0.i(textView2, (i5 - whz0Var.getMeasuredWidth()) - (i3 * 2), i6, Integer.MIN_VALUE);
        }
        b bVar = this.v;
        b bVar2 = b.c;
        int i10 = this.q;
        int i11 = this.u;
        riz0 riz0Var = this.r;
        TextView textView3 = this.h;
        Button button = this.i;
        TextView textView4 = this.e;
        TextView textView5 = this.d;
        if (bVar == bVar2) {
            int i12 = i11 * 2;
            int i13 = size - i12;
            int i14 = i5 - i12;
            textView5.setGravity(1);
            textView4.setGravity(1);
            textView4.setVisibility(0);
            button.setVisibility(0);
            textView3.setVisibility(8);
            textView5.setTypeface(Typeface.defaultFromStyle(0));
            textView5.setTextSize(1, riz0Var.a.get(riz0.K));
            button.measure(View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
            c1z0.i(textView5, i14, i14, Integer.MIN_VALUE);
            c1z0.i(textView4, i14, i14, Integer.MIN_VALUE);
            setMeasuredDimension(i13, i13);
            return;
        }
        if (bVar != b.b) {
            textView5.setGravity(8388611);
            textView4.setVisibility(8);
            button.setVisibility(8);
            textView3.setVisibility(0);
            textView5.setTypeface(textView5.getTypeface(), 1);
            textView5.setTextSize(1, riz0Var.a.get(riz0.J));
            c1z0.i(textView3, i5, i6, Integer.MIN_VALUE);
            int i15 = i3 * 2;
            c1z0.i(textView5, ((i5 - whz0Var.getMeasuredWidth()) - i15) - textView3.getMeasuredWidth(), whz0Var.getMeasuredHeight() - (i8 * 2), Integer.MIN_VALUE);
            setMeasuredDimension(size, c1z0.e(whz0Var.getMeasuredHeight() + i15, c1z0.e(this.s, textView2.getMeasuredHeight()) + textView5.getMeasuredHeight() + i3));
            return;
        }
        textView5.setGravity(8388611);
        textView4.setVisibility(8);
        button.setVisibility(0);
        textView5.setTextSize(riz0Var.a.get(riz0.K));
        textView3.setVisibility(0);
        textView5.setTypeface(textView5.getTypeface(), 1);
        textView5.setTextSize(1, riz0Var.a.get(riz0.J));
        button.measure(View.MeasureSpec.makeMeasureSpec(i5 / 3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        c1z0.i(textView3, i5, i6, Integer.MIN_VALUE);
        int measuredWidth = i5 - ((textView3.getMeasuredWidth() + ((i3 * 2) + (button.getMeasuredWidth() + whz0Var.getMeasuredWidth()))) + i8);
        c1z0.i(textView5, measuredWidth, i6, Integer.MIN_VALUE);
        c1z0.i(textView2, measuredWidth, i6, Integer.MIN_VALUE);
        int measuredHeight = (i11 * 2) + button.getMeasuredHeight();
        if (this.w) {
            measuredHeight += this.p;
        }
        setMeasuredDimension(size, measuredHeight);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        if (r1.equals(com.ironsource.X3.i.U) == false) goto L8;
     */
    @Override // xsna.qiz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setBanner(@NonNull tez0 tez0Var) {
        oly0 oly0Var = tez0Var.a0;
        int i = oly0Var.e;
        int i2 = oly0Var.f;
        TextView textView = this.d;
        textView.setTextColor(i2);
        TextView textView2 = this.e;
        textView2.setTextColor(i);
        TextView textView3 = this.f;
        textView3.setTextColor(i);
        TextView textView4 = this.g;
        textView4.setTextColor(i);
        this.c.setColor(i);
        char c = 1;
        this.w = tez0Var.c0 != null;
        this.b.setImageData(tez0Var.u);
        textView.setText(tez0Var.f);
        textView2.setText(tez0Var.c);
        this.y = tez0Var.T.c;
        String str = tez0Var.p;
        str.getClass();
        switch (str.hashCode()) {
            case 117588:
                if (str.equals("web")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 109770977:
                break;
            case 1223953944:
                if (str.equals("webform")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 2:
                textView4.setVisibility(8);
                textView3.setVisibility(0);
                textView3.setText(tez0Var.o);
                textView3.setTextColor(oly0Var.i);
                break;
            case 1:
                textView3.setVisibility(8);
                if (tez0Var.c() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    textView4.setVisibility(8);
                    break;
                } else {
                    textView4.setVisibility(0);
                    String valueOf = String.valueOf(tez0Var.c());
                    if (valueOf.length() > 3) {
                        valueOf = valueOf.substring(0, 3);
                    }
                    textView4.setText(valueOf);
                    break;
                }
        }
        String n = tez0Var.n();
        Button button = this.i;
        button.setText(n);
        c1z0.o(button, oly0Var.a, oly0Var.b, this.o);
        button.setTextColor(oly0Var.e);
        this.h.setText(tez0Var.h);
        if (this.y) {
            setClickArea(tez0Var.v);
        } else {
            setClickAreaLegacy(tez0Var.v);
        }
    }
}
