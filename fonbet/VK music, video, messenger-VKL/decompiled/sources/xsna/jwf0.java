package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;

/* compiled from: RemoveArea.java */
/* loaded from: classes6.dex */
public final class jwf0 {
    public final int a;
    public final int b;
    public int c;

    public jwf0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void a(Rect rect, Rect rect2, Context context) {
        Gravity.apply(81, this.a, this.b, rect, rect2);
        rect2.offset(0, -this.c);
    }
}
