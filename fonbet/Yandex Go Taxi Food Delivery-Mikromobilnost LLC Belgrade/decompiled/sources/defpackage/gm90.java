package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.widget.FrameLayout;
import com.ybsdk.core.utils.ui.core.CoreOutlineProvider;
import defpackage.wls;

/* loaded from: classes2.dex */
public abstract class gm90 {
    public static final float a = kp50.t(32);
    public static final int b = kp50.r(32);

    public static void a(FrameLayout frameLayout) {
        fqe fqeVar = CoreOutlineProvider.Companion;
        final g990 g990Var = new g990(2);
        fqeVar.getClass();
        final float[] d = xrb1.d(a);
        frameLayout.setOutlineProvider(new CoreOutlineProvider(d) { // from class: com.ybsdk.core.utils.ui.core.CoreOutlineProvider$Companion$build$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                wls.this.invoke(view, outline);
            }
        });
    }
}
