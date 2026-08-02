package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.HashMap;
import xsna.ovy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class xfz0 extends ViewGroup implements View.OnTouchListener {
    public final whz0 b;
    public final TextView c;
    public final TextView d;
    public final Button e;
    public final c1z0 f;
    public final qpk0 g;
    public final TextView h;
    public final HashMap i;
    public final boolean j;
    public ovy0.c k;
    public ovy0.c l;
    public final int m;
    public final int n;
    public final int o;
    public boolean p;

    public xfz0(Context context, boolean z) {
        super(context);
        this.i = new HashMap();
        this.p = false;
        this.j = z;
        c1z0 c1z0Var = new c1z0(context);
        this.f = c1z0Var;
        whz0 whz0Var = new whz0(context);
        this.b = whz0Var;
        TextView textView = new TextView(context);
        this.c = textView;
        TextView textView2 = new TextView(context);
        this.d = textView2;
        Button button = new Button(context);
        this.e = button;
        qpk0 qpk0Var = new qpk0(context);
        this.g = qpk0Var;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        c1z0.k(this, 0, 0, -3355444, c1z0Var.b(1), 0);
        float f = 2;
        this.n = c1z0Var.b(f);
        float f2 = 12;
        this.o = c1z0Var.b(f2);
        float f3 = 15;
        float f4 = 10;
        button.setPadding(c1z0Var.b(f3), c1z0Var.b(f4), c1z0Var.b(f3), c1z0Var.b(f4));
        button.setMinimumWidth(c1z0Var.b(100));
        button.setTransformationMethod(null);
        button.setSingleLine();
        if (z) {
            button.setTextSize(20.0f);
        } else {
            button.setTextSize(18.0f);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        button.setEllipsize(truncateAt);
        button.setElevation(c1z0Var.b(f));
        this.m = c1z0Var.b(f2);
        c1z0.o(button, -16733198, -16746839, c1z0Var.b(f));
        button.setTextColor(-1);
        if (z) {
            textView.setTextSize(20.0f);
        } else {
            textView.setTextSize(18.0f);
        }
        textView.setTextColor(-16777216);
        textView.setTypeface(null, 1);
        textView.setLines(1);
        textView.setEllipsize(truncateAt);
        textView2.setTextColor(-7829368);
        textView2.setLines(2);
        if (z) {
            textView2.setTextSize(20.0f);
        } else {
            textView2.setTextSize(18.0f);
        }
        textView2.setEllipsize(truncateAt);
        if (z) {
            qpk0Var.setStarSize(c1z0Var.b(24));
        } else {
            qpk0Var.setStarSize(c1z0Var.b(18));
        }
        qpk0Var.setStarsPadding(c1z0Var.b(4));
        c1z0.n(this, "card_view");
        c1z0.n(textView, "card_title_text");
        c1z0.n(textView2, "card_description_text");
        c1z0.n(textView3, "card_domain_text");
        c1z0.n(button, "card_cta_button");
        c1z0.n(qpk0Var, "card_stars_view");
        c1z0.n(whz0Var, "card_image");
        addView(whz0Var);
        addView(textView2);
        addView(textView);
        addView(button);
        addView(qpk0Var);
        addView(textView3);
    }

    public final void a(ovy0.b bVar, k6z0 k6z0Var, ovy0.a aVar) {
        this.k = bVar;
        this.l = aVar;
        Button button = this.e;
        if (bVar == null || k6z0Var == null) {
            setOnClickListener(null);
            button.setOnClickListener(null);
            return;
        }
        boolean z = k6z0Var.m;
        setOnTouchListener(this);
        whz0 whz0Var = this.b;
        whz0Var.setOnTouchListener(this);
        TextView textView = this.c;
        textView.setOnTouchListener(this);
        TextView textView2 = this.d;
        textView2.setOnTouchListener(this);
        qpk0 qpk0Var = this.g;
        qpk0Var.setOnTouchListener(this);
        TextView textView3 = this.h;
        textView3.setOnTouchListener(this);
        button.setOnTouchListener(this);
        boolean z2 = true;
        Boolean valueOf = Boolean.valueOf(k6z0Var.d || z);
        HashMap hashMap = this.i;
        hashMap.put(whz0Var, valueOf);
        hashMap.put(this, Boolean.valueOf(k6z0Var.l || z));
        hashMap.put(textView, Boolean.valueOf(k6z0Var.a || z));
        hashMap.put(textView2, Boolean.valueOf(k6z0Var.b || z));
        hashMap.put(qpk0Var, Boolean.valueOf(k6z0Var.e || z));
        hashMap.put(textView3, Boolean.valueOf(k6z0Var.j || z));
        if (!k6z0Var.g && !z) {
            z2 = false;
        }
        hashMap.put(button, Boolean.valueOf(z2));
    }

    @NonNull
    public Button getCtaButtonView() {
        return this.e;
    }

    @NonNull
    public TextView getDescriptionTextView() {
        return this.d;
    }

    @NonNull
    public TextView getDomainTextView() {
        return this.h;
    }

    @NonNull
    public qpk0 getRatingView() {
        return this.g;
    }

    @NonNull
    public whz0 getSmartImageView() {
        return this.b;
    }

    @NonNull
    public TextView getTitleTextView() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = (i3 - i) - (this.n * 2);
        boolean z2 = !this.j && getResources().getConfiguration().orientation == 2;
        whz0 whz0Var = this.b;
        whz0Var.layout(0, 0, whz0Var.getMeasuredWidth(), whz0Var.getMeasuredHeight());
        TextView textView = this.d;
        TextView textView2 = this.h;
        qpk0 qpk0Var = this.g;
        Button button = this.e;
        TextView textView3 = this.c;
        if (z2) {
            textView3.setTypeface(null, 1);
            textView3.layout(0, whz0Var.getBottom(), i5, textView3.getMeasuredHeight() + whz0Var.getBottom());
            c1z0.h(this, 0, 0);
            textView.layout(0, 0, 0, 0);
            button.layout(0, 0, 0, 0);
            qpk0Var.layout(0, 0, 0, 0);
            textView2.layout(0, 0, 0, 0);
            return;
        }
        textView3.setTypeface(null, 0);
        c1z0.k(this, 0, 0, -3355444, this.f.b(1), 0);
        textView3.layout(this.n + this.o, whz0Var.getBottom(), textView3.getMeasuredWidth() + this.n + this.o, textView3.getMeasuredHeight() + whz0Var.getBottom());
        textView.layout(this.n + this.o, textView3.getBottom(), textView.getMeasuredWidth() + this.n + this.o, textView.getMeasuredHeight() + textView3.getBottom());
        int measuredWidth = (i5 - button.getMeasuredWidth()) / 2;
        button.layout(measuredWidth, (i4 - button.getMeasuredHeight()) - this.o, button.getMeasuredWidth() + measuredWidth, i4 - this.o);
        int measuredWidth2 = (i5 - qpk0Var.getMeasuredWidth()) / 2;
        qpk0Var.layout(measuredWidth2, (button.getTop() - this.o) - qpk0Var.getMeasuredHeight(), qpk0Var.getMeasuredWidth() + measuredWidth2, button.getTop() - this.o);
        int measuredWidth3 = (i5 - textView2.getMeasuredWidth()) / 2;
        textView2.layout(measuredWidth3, (button.getTop() - textView2.getMeasuredHeight()) - this.o, textView2.getMeasuredWidth() + measuredWidth3, button.getTop() - this.o);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int measuredHeight2;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z = !this.j && getResources().getConfiguration().orientation == 2;
        int i3 = size == 0 ? 0 : Integer.MIN_VALUE;
        int i4 = this.n * 2;
        int i5 = size2 - i4;
        int i6 = size - i4;
        TextView textView = this.d;
        qpk0 qpk0Var = this.g;
        TextView textView2 = this.h;
        Button button = this.e;
        TextView textView3 = this.c;
        if (z) {
            textView3.measure(View.MeasureSpec.makeMeasureSpec(size, i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
            textView.measure(0, 0);
            qpk0Var.measure(0, 0);
            textView2.measure(0, 0);
            button.measure(0, 0);
        } else {
            textView3.measure(View.MeasureSpec.makeMeasureSpec(i6 - (this.o * 2), i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
            textView.measure(View.MeasureSpec.makeMeasureSpec(i6 - (this.o * 2), i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
            qpk0Var.measure(View.MeasureSpec.makeMeasureSpec(i6, i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
            textView2.measure(View.MeasureSpec.makeMeasureSpec(i6, i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
            button.measure(View.MeasureSpec.makeMeasureSpec(i6 - (this.o * 2), i3), View.MeasureSpec.makeMeasureSpec(i5 - (this.o * 2), Integer.MIN_VALUE));
        }
        if (z) {
            measuredHeight = size2 - textView3.getMeasuredHeight();
            measuredHeight2 = this.n;
        } else {
            measuredHeight = (((size2 - button.getMeasuredHeight()) - (this.m * 2)) - Math.max(qpk0Var.getMeasuredHeight(), textView2.getMeasuredHeight())) - textView.getMeasuredHeight();
            measuredHeight2 = textView3.getMeasuredHeight();
        }
        int i7 = measuredHeight - measuredHeight2;
        if (i7 <= size) {
            size = i7;
        }
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        z9z0 z9z0Var;
        boolean z = this.p;
        HashMap hashMap = this.i;
        Button button = this.e;
        c1z0 c1z0Var = this.f;
        if (!z) {
            if (!hashMap.containsKey(view)) {
                return false;
            }
            boolean booleanValue = ((Boolean) hashMap.get(view)).booleanValue();
            view.setClickable(booleanValue);
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    if (this.k != null) {
                        boolean equals = Boolean.TRUE.equals(hashMap.get(button));
                        ovy0.c cVar = this.l;
                        if (cVar != null && view == button && equals) {
                            cVar.a(view, new akz0());
                        } else {
                            this.k.a(view, new akz0());
                        }
                    }
                    if (booleanValue) {
                        if (view == button) {
                            button.setPressed(false);
                            return true;
                        }
                        c1z0.k(this, 0, 0, -3355444, c1z0Var.b(1), 0);
                        return true;
                    }
                } else if (action == 3 && booleanValue) {
                    if (view == button) {
                        button.setPressed(false);
                        return true;
                    }
                    c1z0.k(this, 0, 0, -3355444, c1z0Var.b(1), 0);
                    return true;
                }
            } else if (booleanValue) {
                if (view == button) {
                    button.setPressed(true);
                    return true;
                }
                setBackgroundColor(-3806472);
            }
            return true;
        }
        if (!hashMap.containsKey(view)) {
            return false;
        }
        boolean booleanValue2 = ((Boolean) hashMap.get(view)).booleanValue();
        view.setClickable(booleanValue2);
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            if (action2 == 1) {
                if (this.k != null) {
                    boolean equals2 = Boolean.TRUE.equals(hashMap.get(button));
                    int i = 2;
                    if (motionEvent.getAction() == 1) {
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        float f = sqe0.b(view).widthPixels;
                        float f2 = sqe0.b(view).heightPixels;
                        view.getLocationOnScreen(new int[2]);
                        z9z0Var = new c7z0((r13[0] + x) / f, (r13[1] + y) / f2);
                    } else {
                        z9z0Var = null;
                    }
                    if (z9z0Var == null) {
                        z9z0Var = new y9z0();
                    }
                    if (view == button) {
                        i = 64;
                    } else if (view == this.b) {
                        i = 8;
                    } else if (view == this.c) {
                        i = 1;
                    } else if (view != this.d) {
                        i = view == this.g ? 16 : view == this.h ? 512 : 2048;
                    }
                    viy0 viy0Var = new viy0(i, z9z0Var);
                    ovy0.c cVar2 = this.l;
                    if (cVar2 != null && view == button && equals2) {
                        cVar2.a(view, viy0Var);
                    } else {
                        ovy0.c cVar3 = this.k;
                        if (cVar3 != null) {
                            cVar3.a(view, viy0Var);
                        }
                    }
                }
                if (booleanValue2) {
                    if (view == button) {
                        button.setPressed(false);
                        return true;
                    }
                    c1z0.k(this, 0, 0, -3355444, c1z0Var.b(1), 0);
                    return true;
                }
            } else if (action2 == 3 && booleanValue2) {
                if (view == button) {
                    button.setPressed(false);
                    return true;
                }
                c1z0.k(this, 0, 0, -3355444, c1z0Var.b(1), 0);
                return true;
            }
        } else if (booleanValue2) {
            if (view == button) {
                button.setPressed(true);
                return true;
            }
            setBackgroundColor(-3806472);
        }
        return true;
    }

    public void setIsHitMapEnabled(boolean z) {
        this.p = z;
    }
}
