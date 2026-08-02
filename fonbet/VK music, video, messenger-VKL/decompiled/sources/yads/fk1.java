package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes10.dex */
public final class fk1 implements jk1 {
    public final View a;
    public final float b;
    public final Context c;
    public final ik1 d;

    public /* synthetic */ fk1(View view, float f, Context context) {
        this(view, f, context, new ik1());
    }

    @Override // yads.jk1
    public final ik1 a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        Context context = this.c;
        an3 an3Var = om3.a;
        int round = Math.round(context.getResources().getDisplayMetrics().widthPixels * this.b);
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            round = (round - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        }
        this.d.a = View.MeasureSpec.makeMeasureSpec((int) Math.max(Math.min(size, round), ConnectivityTracker.DEFAULT_UPLINK_BITRATE), mode);
        ik1 ik1Var = this.d;
        ik1Var.b = i2;
        return ik1Var;
    }

    public fk1(View view, float f, Context context, ik1 ik1Var) {
        this.a = view;
        this.b = f;
        this.c = context;
        this.d = ik1Var;
    }
}
