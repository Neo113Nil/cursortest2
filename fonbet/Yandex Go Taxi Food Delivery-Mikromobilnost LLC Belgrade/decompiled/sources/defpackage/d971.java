package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.GestureDetector;
import yads.f53;

/* loaded from: classes7.dex */
public final class d971 {
    public Point a;
    public final GestureDetector b;

    public d971(Context context) {
        this.b = new GestureDetector(context, new f53(this));
    }
}
