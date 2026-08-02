package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: FeedLocationAwareFrameLayout.kt */
/* loaded from: classes18.dex */
public final class w1r extends FrameLayout {
    public final int[] b;
    public final Rect c;

    public w1r(Context context) {
        super(context, null, 0);
        this.b = new int[2];
        this.c = new Rect();
    }

    public int[] getLocation() {
        int[] iArr = this.b;
        getLocationOnScreen(iArr);
        return iArr;
    }
}
