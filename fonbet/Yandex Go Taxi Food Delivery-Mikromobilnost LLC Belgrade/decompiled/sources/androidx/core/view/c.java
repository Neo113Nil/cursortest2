package androidx.core.view;

import android.view.View;
import defpackage.h73;
import defpackage.qrq0;

/* loaded from: classes.dex */
public abstract class c {
    public static final h73 a(View view) {
        return new h73(2, new ViewKt$allViews$1(view, null));
    }

    public static final qrq0 b(View view) {
        return kotlin.sequences.a.d(ViewKt$ancestors$1.b, view.getParent());
    }
}
