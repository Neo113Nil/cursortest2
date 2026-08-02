package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.material.tabs.TabLayout;
import com.vk.core.view.components.tabs.d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class wam0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ wam0(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                int i2 = com.vk.core.view.components.tabs.d.G;
                nxv0 a = d.a.a(context);
                Drawable drawable = ((TabLayout.g) obj).b;
                if (drawable != null) {
                    com.vk.core.view.components.tabs.d.U4(a, drawable, false, 4);
                }
                return a;
            default:
                ((l2v0) obj).f(context, null);
                return s3q0.a;
        }
    }
}
