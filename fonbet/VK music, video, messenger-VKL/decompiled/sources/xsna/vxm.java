package xsna;

import android.content.Context;
import android.view.VelocityTracker;
import androidx.core.widget.NestedScrollView;

/* compiled from: DifferentialMotionFlingController.java */
/* loaded from: classes.dex */
public final class vxm {
    public final Context a;
    public final NestedScrollView.c b;
    public VelocityTracker c;
    public float d;
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public final int[] h = {Integer.MAX_VALUE, 0};

    public vxm(Context context, NestedScrollView.c cVar) {
        this.a = context;
        this.b = cVar;
    }
}
