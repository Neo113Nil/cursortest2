package xsna;

import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: AndroidIndirectPointerEvent.android.kt */
/* loaded from: classes11.dex */
public final class fa2 {
    public final ArrayList a;
    public final int b;
    public final MotionEvent c;

    public fa2(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.a = arrayList;
        this.b = i;
        this.c = motionEvent;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("changes cannot be empty");
        }
    }
}
