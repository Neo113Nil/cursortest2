package xsna;

import android.content.Context;
import android.view.ViewConfiguration;

/* compiled from: GestureDetector.java */
/* loaded from: classes12.dex */
public final class eot {
    public final float b;
    public long e;
    public float f;
    public float g;
    public ce a = null;
    public boolean c = false;
    public boolean d = false;

    public eot(Context context) {
        this.b = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
