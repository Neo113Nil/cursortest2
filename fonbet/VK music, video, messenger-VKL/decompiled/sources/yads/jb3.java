package yads;

import android.content.res.Resources;
import xsna.an10;

/* loaded from: classes10.dex */
public abstract class jb3 {
    public static final int a(int i) {
        return i >= 0 ? an10.b(i / Resources.getSystem().getDisplayMetrics().density) : i;
    }
}
