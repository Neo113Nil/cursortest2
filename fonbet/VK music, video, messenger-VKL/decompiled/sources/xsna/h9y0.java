package xsna;

import android.R;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class h9y0 extends LinearLayout {
    public final TextView b;
    public final whz0 c;

    public h9y0(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.b = textView;
        whz0 whz0Var = new whz0(context);
        this.c = whz0Var;
        c1z0 c1z0Var = new c1z0(context);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{-1157627904, -1157627904});
        gradientDrawable.setStroke(c1z0Var.b(1.0f), -1157627904);
        gradientDrawable.setCornerRadius(c1z0Var.b(10.0f));
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{-1157627904, -1157627904});
        gradientDrawable2.setStroke(c1z0Var.b(1.0f), -1157627904);
        gradientDrawable2.setCornerRadius(c1z0Var.b(10.0f));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
        int b = c1z0Var.b(6);
        int b2 = c1z0Var.b(12);
        textView.setTextColor(-1);
        textView.setTextSize(18.0f);
        textView.setMaxLines(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int d = c1z0.d(32, context);
        setPadding(b2, b, b2, b);
        setBackgroundDrawable(stateListDrawable);
        setGravity(16);
        setOrientation(0);
        c1z0.n(whz0Var, "ctc_icon");
        addView(whz0Var, d, d);
        c1z0.n(textView, "ctc_text");
        addView(textView, new LinearLayout.LayoutParams(-2, -2));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
