package com.ybsdk.core.design.spoiler;

import com.ybsdk.core.design.spoiler.Spoiler;
import defpackage.ovt0;
import defpackage.vvb1;

/* loaded from: classes2.dex */
public abstract class a {
    public static ovt0 a(float f, int i) {
        Spoiler.Gravity gravity;
        if (f == 0.0f) {
            return vvb1.Q;
        }
        int i2 = (int) f;
        Spoiler.Gravity[] values = Spoiler.Gravity.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                gravity = null;
                break;
            }
            gravity = values[i3];
            if (gravity.getValue() == i) {
                break;
            }
            i3++;
        }
        if (gravity == null) {
            gravity = Spoiler.Gravity.START;
        }
        return new b(i2, gravity);
    }
}
