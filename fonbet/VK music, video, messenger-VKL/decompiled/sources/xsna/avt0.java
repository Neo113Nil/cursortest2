package xsna;

import android.graphics.RenderNode;
import android.view.View;

/* compiled from: ViewDrawCacher.kt */
/* loaded from: classes8.dex */
public final class avt0 {
    public final a a;

    /* compiled from: ViewDrawCacher.kt */
    public static final class a {
        public final RenderNode a;
        public final int[] b;

        public a(RenderNode renderNode, int[] iArr) {
            this.a = renderNode;
            this.b = iArr;
        }
    }

    public avt0(View view) {
        int[] iArr = {0, 0};
        this.a = new a(e42.b(), iArr);
        view.getLocationOnScreen(iArr);
        view.addOnLayoutChangeListener(new g38(this, 1));
    }
}
