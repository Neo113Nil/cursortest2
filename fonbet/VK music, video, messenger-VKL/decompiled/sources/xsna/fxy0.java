package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import xsna.jgz0;
import xsna.kkz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class fxy0 extends ViewGroup implements View.OnTouchListener, kkz0 {
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final wvy0 e;
    public final c1z0 f;
    public final whz0 g;
    public final ovy0 h;
    public final HashMap i;
    public final r5z0 j;
    public final Button k;
    public final int l;
    public final int m;
    public final int n;
    public final boolean o;
    public final double p;
    public boolean q;
    public kkz0.a r;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface a {
    }

    public fxy0(Context context) {
        super(context);
        this.q = false;
        c1z0.h(this, -1, -3806472);
        boolean z = (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        this.o = z;
        this.p = z ? 0.5d : 0.7d;
        wvy0 wvy0Var = new wvy0(context);
        this.e = wvy0Var;
        c1z0 c1z0Var = new c1z0(context);
        this.f = c1z0Var;
        TextView textView = new TextView(context);
        this.b = textView;
        TextView textView2 = new TextView(context);
        this.c = textView2;
        TextView textView3 = new TextView(context);
        this.d = textView3;
        whz0 whz0Var = new whz0(context);
        this.g = whz0Var;
        Button button = new Button(context);
        this.k = button;
        ovy0 ovy0Var = new ovy0(context);
        this.h = ovy0Var;
        wvy0Var.setContentDescription(CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
        wvy0Var.setVisibility(4);
        whz0Var.setContentDescription("icon");
        textView.setLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView2.setLines(1);
        textView2.setEllipsize(truncateAt);
        textView3.setTextColor(-16777216);
        float f = 15;
        float f2 = 10;
        boolean z2 = z;
        button.setPadding(c1z0Var.b(f), c1z0Var.b(f2), c1z0Var.b(f), c1z0Var.b(f2));
        button.setMinimumWidth(c1z0Var.b(100));
        button.setMaxEms(12);
        button.setTransformationMethod(null);
        button.setSingleLine();
        button.setTextSize(18.0f);
        button.setEllipsize(truncateAt);
        button.setElevation(c1z0Var.b(r15));
        c1z0.o(button, -16733198, -16746839, c1z0Var.b(2));
        button.setTextColor(-1);
        ovy0Var.setPadding(0, 0, 0, c1z0Var.b(8));
        ovy0Var.setSideSlidesMargins(c1z0Var.b(f2));
        if (z2) {
            int b = c1z0Var.b(18);
            this.m = b;
            this.l = b;
            textView.setTextSize((int) TypedValue.applyDimension(2, 24, context.getResources().getDisplayMetrics()));
            float f3 = 20;
            textView3.setTextSize((int) TypedValue.applyDimension(2, f3, context.getResources().getDisplayMetrics()));
            textView2.setTextSize((int) TypedValue.applyDimension(2, f3, context.getResources().getDisplayMetrics()));
            this.n = c1z0Var.b(96);
            textView.setTypeface(null, 1);
        } else {
            this.l = c1z0Var.b(12);
            this.m = c1z0Var.b(f2);
            textView.setTextSize(22.0f);
            textView3.setTextSize(18.0f);
            textView2.setTextSize(18.0f);
            this.n = c1z0Var.b(64);
        }
        r5z0 r5z0Var = new r5z0(context, null);
        this.j = r5z0Var;
        c1z0.n(this, "ad_view");
        c1z0.n(textView, "title_text");
        c1z0.n(textView3, "description_text");
        c1z0.n(whz0Var, "icon_image");
        c1z0.n(wvy0Var, "close_button");
        c1z0.n(textView2, "category_text");
        addView(ovy0Var);
        addView(whz0Var);
        addView(textView);
        addView(textView2);
        addView(r5z0Var);
        addView(textView3);
        addView(wvy0Var);
        addView(button);
        this.i = new HashMap();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setClickAreaActual(@NonNull k6z0 k6z0Var) {
        boolean z = k6z0Var.m;
        boolean z2 = k6z0Var.l;
        boolean z3 = k6z0Var.m;
        if (z) {
            c1z0.h(this, -1, -3806472);
        }
        boolean z4 = true;
        Boolean valueOf = Boolean.valueOf(k6z0Var.a || z3);
        HashMap hashMap = this.i;
        TextView textView = this.b;
        hashMap.put(textView, valueOf);
        Boolean valueOf2 = Boolean.valueOf(k6z0Var.k || z3);
        TextView textView2 = this.c;
        hashMap.put(textView2, valueOf2);
        Boolean valueOf3 = Boolean.valueOf(k6z0Var.c || z3);
        whz0 whz0Var = this.g;
        hashMap.put(whz0Var, valueOf3);
        Boolean valueOf4 = Boolean.valueOf(k6z0Var.b || z3);
        TextView textView3 = this.d;
        hashMap.put(textView3, valueOf4);
        Boolean valueOf5 = Boolean.valueOf(z2 || k6z0Var.g || z3);
        Button button = this.k;
        hashMap.put(button, valueOf5);
        if (!z2 && !z3) {
            z4 = false;
        }
        hashMap.put(this, Boolean.valueOf(z4));
        textView.setOnTouchListener(this);
        textView2.setOnTouchListener(this);
        whz0Var.setOnTouchListener(this);
        textView3.setOnTouchListener(this);
        button.setOnTouchListener(this);
        setOnTouchListener(this);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setClickAreaLegacy(@NonNull k6z0 k6z0Var) {
        boolean z = k6z0Var.m;
        boolean z2 = k6z0Var.l;
        boolean z3 = true;
        Button button = this.k;
        if (z) {
            setOnClickListener(new p01(this, 19));
            c1z0.h(this, -1, -3806472);
            setClickable(true);
            button.setOnClickListener(new q01(this, 18));
            return;
        }
        TextView textView = this.b;
        textView.setOnTouchListener(this);
        TextView textView2 = this.c;
        textView2.setOnTouchListener(this);
        whz0 whz0Var = this.g;
        whz0Var.setOnTouchListener(this);
        TextView textView3 = this.d;
        textView3.setOnTouchListener(this);
        button.setOnTouchListener(this);
        setOnTouchListener(this);
        Boolean valueOf = Boolean.valueOf(k6z0Var.a);
        HashMap hashMap = this.i;
        hashMap.put(textView, valueOf);
        hashMap.put(textView2, Boolean.valueOf(k6z0Var.k));
        hashMap.put(whz0Var, Boolean.valueOf(k6z0Var.c));
        hashMap.put(textView3, Boolean.valueOf(k6z0Var.b));
        if (!z2 && !k6z0Var.g) {
            z3 = false;
        }
        hashMap.put(button, Boolean.valueOf(z3));
        hashMap.put(this, Boolean.valueOf(z2));
    }

    @Override // xsna.kkz0
    public final void c() {
        this.e.setVisibility(0);
    }

    @Override // xsna.kkz0
    @NonNull
    public View getCloseButton() {
        return this.e;
    }

    @NonNull
    public int[] getNumbersOfCurrentShowingCards() {
        ovy0 ovy0Var = this.h;
        int v = ovy0Var.getCardLayoutManager().v();
        int w = ovy0Var.getCardLayoutManager().w();
        int i = 0;
        if (v == -1 || w == -1) {
            return new int[0];
        }
        int i2 = (w - v) + 1;
        int[] iArr = new int[i2];
        while (i < i2) {
            iArr[i] = v;
            i++;
            v++;
        }
        return iArr;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3 - i;
        int i7 = i4 - i2;
        wvy0 wvy0Var = this.e;
        wvy0Var.layout(i3 - wvy0Var.getMeasuredWidth(), i2, i3, wvy0Var.getMeasuredHeight() + i2);
        int left = wvy0Var.getLeft();
        r5z0 r5z0Var = this.j;
        c1z0.j(r5z0Var, left - r5z0Var.getMeasuredWidth(), wvy0Var.getTop(), wvy0Var.getLeft(), wvy0Var.getBottom());
        boolean z2 = this.o;
        TextView textView = this.d;
        ovy0 ovy0Var = this.h;
        TextView textView2 = this.c;
        TextView textView3 = this.b;
        int i8 = this.m;
        whz0 whz0Var = this.g;
        if (i7 > i6 || z2) {
            int bottom = wvy0Var.getBottom();
            int measuredHeight = (i8 * 2) + textView.getMeasuredHeight() + Math.max(textView2.getMeasuredHeight() + textView3.getMeasuredHeight(), whz0Var.getMeasuredHeight()) + ovy0Var.getMeasuredHeight();
            if (measuredHeight < i7 && (i5 = (i7 - measuredHeight) / 2) > bottom) {
                bottom = i5;
            }
            int i9 = i + i8;
            whz0Var.layout(i9, bottom, whz0Var.getMeasuredWidth() + i + i8, whz0Var.getMeasuredHeight() + i2 + bottom);
            textView3.layout(whz0Var.getRight(), bottom, textView3.getMeasuredWidth() + whz0Var.getRight(), textView3.getMeasuredHeight() + bottom);
            textView2.layout(whz0Var.getRight(), textView3.getBottom(), textView2.getMeasuredWidth() + whz0Var.getRight(), textView2.getMeasuredHeight() + textView3.getBottom());
            int max = Math.max(Math.max(whz0Var.getBottom(), textView2.getBottom()), textView3.getBottom());
            textView.layout(i9, max, textView.getMeasuredWidth() + i9, textView.getMeasuredHeight() + max);
            int max2 = Math.max(max, textView.getBottom()) + i8;
            ovy0Var.layout(i9, max2, i3, ovy0Var.getMeasuredHeight() + max2);
            androidx.recyclerview.widget.w wVar = ovy0Var.c;
            if (z2) {
                wVar.attachToRecyclerView(null);
                return;
            } else {
                wVar.attachToRecyclerView(ovy0Var);
                return;
            }
        }
        ovy0Var.c.attachToRecyclerView(null);
        int i10 = i4 - i8;
        whz0Var.layout(i8, i10 - whz0Var.getMeasuredHeight(), whz0Var.getMeasuredWidth() + i8, i10);
        int measuredHeight2 = whz0Var.getMeasuredHeight();
        Button button = this.k;
        int max3 = ((Math.max(measuredHeight2, button.getMeasuredHeight()) - textView3.getMeasuredHeight()) - textView2.getMeasuredHeight()) / 2;
        if (max3 < 0) {
            max3 = 0;
        }
        int i11 = i10 - max3;
        textView2.layout(whz0Var.getRight(), i11 - textView2.getMeasuredHeight(), textView2.getMeasuredWidth() + whz0Var.getRight(), i11);
        textView3.layout(whz0Var.getRight(), textView2.getTop() - textView3.getMeasuredHeight(), textView3.getMeasuredWidth() + whz0Var.getRight(), textView2.getTop());
        int max4 = (Math.max(whz0Var.getMeasuredHeight(), textView2.getMeasuredHeight() + textView3.getMeasuredHeight()) - button.getMeasuredHeight()) / 2;
        if (max4 < 0) {
            max4 = 0;
        }
        int i12 = i3 - i8;
        int i13 = i10 - max4;
        button.layout(i12 - button.getMeasuredWidth(), i13 - button.getMeasuredHeight(), i12, i13);
        ovy0Var.layout(i8, i8, i3, ovy0Var.getMeasuredHeight() + i8);
        textView.layout(0, 0, 0, 0);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        wvy0 wvy0Var = this.e;
        wvy0Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int i3 = this.n;
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        whz0 whz0Var = this.g;
        whz0Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        this.j.measure(i, i2);
        boolean z = this.o;
        TextView textView = this.c;
        TextView textView2 = this.b;
        ovy0 ovy0Var = this.h;
        Button button = this.k;
        int i4 = this.m;
        if (size2 > size || z) {
            button.setVisibility(8);
            int measuredHeight = wvy0Var.getMeasuredHeight();
            if (z) {
                measuredHeight = i4;
            }
            textView2.measure(View.MeasureSpec.makeMeasureSpec((size - (i4 * 2)) - whz0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            textView.measure(View.MeasureSpec.makeMeasureSpec((size - (i4 * 2)) - whz0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(size - (i4 * 2), Integer.MIN_VALUE);
            int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
            TextView textView3 = this.d;
            textView3.measure(makeMeasureSpec5, makeMeasureSpec6);
            int max = ((size2 - measuredHeight) - Math.max(textView.getMeasuredHeight() + textView2.getMeasuredHeight(), whz0Var.getMeasuredHeight() - (i4 * 2))) - textView3.getMeasuredHeight();
            int i5 = size - i4;
            if (size2 > size) {
                double d = max / size2;
                double d2 = this.p;
                if (d > d2) {
                    max = (int) (size2 * d2);
                }
            }
            if (z) {
                ovy0Var.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(max - (i4 * 2), Integer.MIN_VALUE));
            } else {
                ovy0Var.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(max - (i4 * 2), 1073741824));
            }
        } else {
            button.setVisibility(0);
            button.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            int measuredWidth = button.getMeasuredWidth();
            int i6 = (size / 2) - (i4 * 2);
            if (measuredWidth > i6) {
                button.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            }
            int measuredWidth2 = (size - whz0Var.getMeasuredWidth()) - measuredWidth;
            int i7 = this.l;
            textView2.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth2 - i7) - i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            textView.measure(View.MeasureSpec.makeMeasureSpec((((size - whz0Var.getMeasuredWidth()) - measuredWidth) - i7) - i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            ovy0Var.measure(View.MeasureSpec.makeMeasureSpec(size - i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec((((size2 - Math.max(whz0Var.getMeasuredHeight(), Math.max(button.getMeasuredHeight(), textView.getMeasuredHeight() + textView2.getMeasuredHeight()))) - (i4 * 2)) - ovy0Var.getPaddingBottom()) - ovy0Var.getPaddingTop(), Integer.MIN_VALUE));
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        z9z0 z9z0Var;
        boolean z = this.q;
        HashMap hashMap = this.i;
        Button button = this.k;
        if (!z) {
            if (!hashMap.containsKey(view)) {
                return false;
            }
            if (((Boolean) hashMap.get(view)).booleanValue()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setBackgroundColor(-3806472);
                    return true;
                }
                if (action == 1) {
                    setBackgroundColor(-1);
                    if (this.r != null) {
                        ((jgz0.b) this.r).a((view == button && Boolean.TRUE.equals(hashMap.get(button))) ? 2 : 1, new akz0());
                    }
                } else if (action == 3) {
                    setBackgroundColor(-1);
                    return true;
                }
            }
            return true;
        }
        if (!hashMap.containsKey(view)) {
            return false;
        }
        if (((Boolean) hashMap.get(view)).booleanValue()) {
            int action2 = motionEvent.getAction();
            if (action2 == 0) {
                setBackgroundColor(-3806472);
                return true;
            }
            if (action2 == 1) {
                setBackgroundColor(-1);
                if (this.r != null) {
                    int i = (view == button && Boolean.TRUE.equals(hashMap.get(button))) ? 2 : 1;
                    if (motionEvent.getAction() == 1) {
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        float f = sqe0.b(view).widthPixels;
                        float f2 = sqe0.b(view).heightPixels;
                        view.getLocationOnScreen(new int[2]);
                        z9z0Var = new c7z0((r9[0] + x) / f, (r9[1] + y) / f2);
                    } else {
                        z9z0Var = null;
                    }
                    if (z9z0Var == null) {
                        z9z0Var = new y9z0();
                    }
                    if (view == button && Boolean.TRUE.equals(hashMap.get(button))) {
                        r5 = 64;
                    } else if (view == this.b) {
                        r5 = 1;
                    } else if (view == this.c) {
                        r5 = 1024;
                    } else if (view == this.g) {
                        r5 = 4;
                    } else if (view != this.d) {
                        r5 = 2048;
                    }
                    ((jgz0.b) this.r).a(i, new viy0(r5, z9z0Var));
                }
            } else if (action2 == 3) {
                setBackgroundColor(-1);
                return true;
            }
        }
        return true;
    }

    @Override // xsna.kkz0
    public void setBanner(@NonNull tez0 tez0Var) {
        this.q = tez0Var.T.c;
        kiw kiwVar = tez0Var.U;
        wvy0 wvy0Var = this.e;
        if (kiwVar == null || kiwVar.a() == null) {
            Bitmap a2 = ywy0.a(this.f.b(28));
            if (a2 != null) {
                wvy0Var.a(a2, false);
            }
        } else {
            wvy0Var.a(kiwVar.a(), true);
        }
        this.k.setText(tez0Var.n());
        kiw kiwVar2 = tez0Var.u;
        if (kiwVar2 != null) {
            int i = kiwVar2.b;
            int i2 = kiwVar2.c;
            whz0 whz0Var = this.g;
            whz0Var.e = i;
            whz0Var.d = i2;
            o2z0.e(kiwVar2, whz0Var, null);
        }
        TextView textView = this.b;
        textView.setTextColor(-16777216);
        textView.setText(tez0Var.f);
        String str = tez0Var.l;
        String str2 = tez0Var.n;
        String b = TextUtils.isEmpty(str) ? "" : go9.b("", str);
        if (!TextUtils.isEmpty(b) && !TextUtils.isEmpty(str2)) {
            b = fo8.a(b, ", ");
        }
        if (!TextUtils.isEmpty(str2)) {
            b = fo8.a(b, str2);
        }
        boolean isEmpty = TextUtils.isEmpty(b);
        TextView textView2 = this.c;
        if (isEmpty) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(b);
            textView2.setVisibility(0);
        }
        this.d.setText(tez0Var.c);
        this.h.a(tez0Var.b0);
        wty0 wty0Var = tez0Var.L;
        r5z0 r5z0Var = this.j;
        if (wty0Var == null) {
            r5z0Var.setVisibility(8);
        } else {
            r5z0Var.setImageBitmap(wty0Var.a.a());
            r5z0Var.setOnClickListener(new dxy0(this));
        }
    }

    public void setCarouselListener(@Nullable a aVar) {
        this.h.setCarouselListener(aVar);
    }

    @Override // xsna.kkz0
    @SuppressLint({"ClickableViewAccessibility"})
    public void setClickArea(@NonNull k6z0 k6z0Var) {
        if (this.q) {
            setClickAreaActual(k6z0Var);
        } else {
            setClickAreaLegacy(k6z0Var);
        }
    }

    @Override // xsna.kkz0
    public void setInterstitialPromoViewListener(@Nullable kkz0.a aVar) {
        this.r = aVar;
    }

    @Override // xsna.kkz0
    @NonNull
    public View getView() {
        return this;
    }
}
