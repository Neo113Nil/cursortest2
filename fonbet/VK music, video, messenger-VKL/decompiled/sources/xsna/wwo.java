package xsna;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* compiled from: EclairGestureDetector.java */
@TargetApi(5)
/* loaded from: classes17.dex */
public class wwo {
    public com.vk.crop.f a;
    public float b;
    public float c;
    public final float e;
    public VelocityTracker f;
    public boolean g;
    public final float d = iah0.a(1);
    public int h = -1;
    public int i = 0;

    public wwo(Context context) {
        this.e = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
    }
}
