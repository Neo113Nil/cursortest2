package xsna;

import android.content.res.Resources;
import xsna.b4p;

/* compiled from: EditorImageLinkExt.kt */
/* loaded from: classes4.dex */
public final class f4p {
    public static final b4p.a a(e4p e4pVar, boolean z) {
        int i;
        int i2;
        float width = e4pVar.getWidth() / e4pVar.getHeight();
        if (width > 1.0f) {
            i2 = an10.b(Resources.getSystem().getDisplayMetrics().widthPixels * 0.7f);
            i = an10.b(i2 / width);
        } else {
            int b = an10.b(Resources.getSystem().getDisplayMetrics().heightPixels * 0.7f);
            int b2 = an10.b(b * width);
            i = b;
            i2 = b2;
        }
        return new b4p.a(i2, i, z);
    }
}
