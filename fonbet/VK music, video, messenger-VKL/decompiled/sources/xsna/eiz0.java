package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashSet;
import xsna.zgz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class eiz0 extends LinearLayout implements View.OnTouchListener, zgz0 {
    public final whz0 b;
    public final TextView c;
    public final TextView d;
    public final Button e;
    public final riz0 f;
    public final HashSet g;
    public final int h;
    public zgz0.a i;
    public kiw j;
    public boolean k;
    public boolean l;

    public eiz0(Context context, oly0 oly0Var, riz0 riz0Var) {
        super(context);
        this.g = new HashSet();
        this.l = false;
        setOrientation(1);
        this.f = riz0Var;
        whz0 whz0Var = new whz0(context);
        this.b = whz0Var;
        TextView textView = new TextView(context);
        this.c = textView;
        TextView textView2 = new TextView(context);
        this.d = textView2;
        Button button = new Button(context);
        this.e = button;
        this.h = riz0Var.a.get(riz0.T);
        int i = riz0.i;
        SparseIntArray sparseIntArray = riz0Var.a;
        int i2 = sparseIntArray.get(i);
        int i3 = sparseIntArray.get(riz0.H);
        button.setTransformationMethod(null);
        button.setSingleLine();
        button.setTextSize(1, sparseIntArray.get(riz0.w));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        button.setEllipsize(truncateAt);
        button.setGravity(17);
        button.setIncludeFontPadding(false);
        button.setPadding(i2, 0, i2, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i4 = riz0.P;
        layoutParams.leftMargin = sparseIntArray.get(i4);
        layoutParams.rightMargin = sparseIntArray.get(i4);
        layoutParams.topMargin = i3;
        layoutParams.gravity = 1;
        button.setLayoutParams(layoutParams);
        c1z0.o(button, oly0Var.a, oly0Var.b, sparseIntArray.get(riz0.o));
        button.setTextColor(oly0Var.c);
        textView.setTextSize(1, sparseIntArray.get(riz0.Q));
        textView.setTextColor(oly0Var.f);
        textView.setIncludeFontPadding(false);
        int i5 = riz0.O;
        textView.setPadding(sparseIntArray.get(i5), 0, sparseIntArray.get(i5), 0);
        textView.setTypeface(null, 1);
        textView.setLines(sparseIntArray.get(riz0.D));
        textView.setEllipsize(truncateAt);
        textView.setGravity(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = i2;
        textView.setLayoutParams(layoutParams2);
        textView2.setTextColor(oly0Var.e);
        textView2.setIncludeFontPadding(false);
        textView2.setLines(sparseIntArray.get(riz0.E));
        textView2.setTextSize(1, sparseIntArray.get(riz0.R));
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(sparseIntArray.get(i5), 0, sparseIntArray.get(i5), 0);
        textView2.setGravity(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView2.setLayoutParams(layoutParams3);
        c1z0.n(this, "card_view");
        c1z0.n(textView, "card_title_text");
        c1z0.n(textView2, "card_description_text");
        c1z0.n(button, "card_cta_button");
        c1z0.n(whz0Var, "card_image");
        addView(whz0Var);
        addView(textView);
        addView(textView2);
        addView(button);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setClickArea(@NonNull k6z0 k6z0Var) {
        setOnTouchListener(this);
        whz0 whz0Var = this.b;
        whz0Var.setOnTouchListener(this);
        TextView textView = this.c;
        textView.setOnTouchListener(this);
        TextView textView2 = this.d;
        textView2.setOnTouchListener(this);
        Button button = this.e;
        button.setOnTouchListener(this);
        HashSet hashSet = this.g;
        hashSet.clear();
        if (k6z0Var.m) {
            this.k = true;
            return;
        }
        if (k6z0Var.g) {
            hashSet.add(button);
        } else {
            button.setEnabled(false);
            hashSet.remove(button);
        }
        if (k6z0Var.l) {
            hashSet.add(this);
        } else {
            hashSet.remove(this);
        }
        if (k6z0Var.a) {
            hashSet.add(textView);
        } else {
            hashSet.remove(textView);
        }
        if (k6z0Var.b) {
            hashSet.add(textView2);
        } else {
            hashSet.remove(textView2);
        }
        if (k6z0Var.d) {
            hashSet.add(whz0Var);
        } else {
            hashSet.remove(whz0Var);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        whz0 whz0Var = this.b;
        whz0Var.measure(i, i2);
        TextView textView = this.c;
        if (textView.getVisibility() == 0) {
            textView.measure(i, i2);
        }
        TextView textView2 = this.d;
        if (textView2.getVisibility() == 0) {
            textView2.measure(i, i2);
        }
        Button button = this.e;
        if (button.getVisibility() == 0) {
            c1z0.i(button, whz0Var.getMeasuredWidth() - (this.f.a.get(riz0.P) * 2), this.h, 1073741824);
        }
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0 && getMeasuredWidth() == size) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        int measuredWidth = whz0Var.getMeasuredWidth();
        int measuredHeight = whz0Var.getMeasuredHeight();
        if (size > size2) {
            setMeasuredDimension(measuredWidth, measuredHeight);
            return;
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            int paddingBottom = childAt.getPaddingBottom() + childAt.getPaddingTop() + childAt.getMeasuredHeight() + paddingTop;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            paddingTop = layoutParams.bottomMargin + paddingBottom + layoutParams.topMargin;
        }
        setMeasuredDimension(measuredWidth, paddingTop);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r11 == r3) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x003c, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x003a, code lost:
    
        if (r11 == r3) goto L21;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean contains;
        boolean contains2;
        int i;
        z9z0 z9z0Var;
        boolean z = this.l;
        Button button = this.e;
        int i2 = 2;
        HashSet hashSet = this.g;
        if (z) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    setBackgroundColor(0);
                    button.setPressed(false);
                    if (this.i != null) {
                        if (this.k) {
                            contains2 = true;
                        } else {
                            contains2 = hashSet.contains(view);
                            if (contains2) {
                            }
                            i = 1;
                        }
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
                        if (view == button) {
                            i2 = 64;
                        } else if (view == this.c) {
                            i2 = 1;
                        } else if (view != this.d) {
                            i2 = view == this.b ? 8 : 2048;
                        }
                        viy0 viy0Var = new viy0(i2, z9z0Var);
                        zgz0.a aVar = this.i;
                        if (aVar != null) {
                            ((vdz0) aVar).c(contains2, i, viy0Var);
                            return true;
                        }
                    }
                } else if (action == 3) {
                    setBackgroundColor(0);
                    button.setPressed(false);
                    return true;
                }
            } else if (this.k || hashSet.contains(view)) {
                if (view == button) {
                    button.setPressed(true);
                    return true;
                }
                setBackgroundColor(-13421773);
                return true;
            }
        } else {
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                if (action2 == 1) {
                    setBackgroundColor(0);
                    button.setPressed(false);
                    if (this.i != null) {
                        if (this.k) {
                            contains = true;
                            if (view != button) {
                                i2 = 1;
                            }
                        } else {
                            contains = hashSet.contains(view);
                            if (!contains || view != button) {
                                i2 = 1;
                            }
                        }
                        ((vdz0) this.i).c(contains, i2, new akz0());
                        return true;
                    }
                } else if (action2 == 3) {
                    setBackgroundColor(0);
                    button.setPressed(false);
                    return true;
                }
            } else if (this.k || hashSet.contains(view)) {
                if (view == button) {
                    button.setPressed(true);
                    return true;
                }
                setBackgroundColor(-13421773);
                return true;
            }
        }
        return true;
    }

    public void setBanner(@Nullable wfy0 wfy0Var) {
        whz0 whz0Var = this.b;
        Button button = this.e;
        TextView textView = this.d;
        TextView textView2 = this.c;
        if (wfy0Var == null) {
            this.g.clear();
            kiw kiwVar = this.j;
            if (kiwVar != null) {
                o2z0.d(kiwVar, whz0Var);
            }
            whz0Var.e = 0;
            whz0Var.d = 0;
            textView2.setVisibility(8);
            textView.setVisibility(8);
            button.setVisibility(8);
            return;
        }
        this.l = wfy0Var.T.c;
        kiw kiwVar2 = wfy0Var.t;
        this.j = kiwVar2;
        if (kiwVar2 != null) {
            int i = kiwVar2.b;
            int i2 = kiwVar2.c;
            whz0Var.e = i;
            whz0Var.d = i2;
            o2z0.e(kiwVar2, whz0Var, null);
        }
        if (wfy0Var.U) {
            textView2.setVisibility(8);
            textView.setVisibility(8);
            button.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView.setVisibility(0);
            button.setVisibility(0);
            textView2.setText(wfy0Var.f);
            textView.setText(wfy0Var.c);
            button.setText(wfy0Var.n());
        }
        setClickArea(wfy0Var.v);
    }

    public void setListener(@Nullable zgz0.a aVar) {
        this.i = aVar;
    }
}
