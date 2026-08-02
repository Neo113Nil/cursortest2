package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import defpackage.z2a1;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class c {
    public static Integer e;
    public final View a;
    public final ArrayList b = new ArrayList();
    public boolean c;
    public ViewTarget$SizeDeterminer$SizeDeterminerLayoutListener d;

    public c(View view) {
        this.a = view;
    }

    public final int a(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        boolean z = this.c;
        View view = this.a;
        if (z && view.isLayoutRequested()) {
            return 0;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        if (view.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        if (Log.isLoggable("ViewTarget", 4)) {
            Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = view.getContext();
        if (e == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            z2a1.e(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            e = Integer.valueOf(Math.max(point.x, point.y));
        }
        return e.intValue();
    }
}
