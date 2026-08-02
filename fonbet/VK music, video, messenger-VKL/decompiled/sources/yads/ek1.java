package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes10.dex */
public final class ek1 implements jk1 {
    public final View a;
    public final float b;
    public final Context c;
    public final ik1 d;

    public /* synthetic */ ek1(View view, float f, Context context) {
        this(view, f, context, new ik1());
    }

    @Override // yads.jk1
    public final ik1 a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int round = Math.round(om3.c(this.c) * this.b);
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            round = (round - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
        }
        int max = (int) Math.max(Math.min(size, round), ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        ik1 ik1Var = this.d;
        ik1Var.a = i;
        ik1Var.b = View.MeasureSpec.makeMeasureSpec(max, mode);
        return this.d;
    }

    public ek1(View view, float f, Context context, ik1 ik1Var) {
        this.a = view;
        this.b = f;
        this.c = context;
        this.d = ik1Var;
    }
}
