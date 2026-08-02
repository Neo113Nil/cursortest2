package yads;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.widget.TextView;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes10.dex */
public final class jg {
    public static final RectF j = new RectF();
    public static final ConcurrentHashMap k = new ConcurrentHashMap();
    public static final ConcurrentHashMap l = new ConcurrentHashMap();
    public int a = 0;
    public boolean b = false;
    public float c = -1.0f;
    public float d = -1.0f;
    public int[] e = new int[0];
    public final TextView g;
    public final Context h;
    public final ig i;

    public jg(TextView textView) {
        this.g = textView;
        this.h = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.i = new hg();
        } else {
            this.i = new gg();
        }
    }
}
