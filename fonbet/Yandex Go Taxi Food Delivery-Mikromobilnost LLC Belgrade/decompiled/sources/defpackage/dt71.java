package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.CustomizableMediaView;
import yads.am3;
import yads.eq0;
import yads.lv1;

/* loaded from: classes7.dex */
public final class dt71 {
    public final qm61 a;
    public final p381 b;
    public final iw71 c;

    public dt71() {
        qm61 qm61Var = new qm61();
        p381 p381Var = new p381();
        iw71 iw71Var = new iw71();
        this.a = qm61Var;
        this.b = p381Var;
        this.c = iw71Var;
    }

    public final xz71 a(CustomizableMediaView customizableMediaView, lg71 lg71Var, bl61 bl61Var, sz61 sz61Var, j981 j981Var) {
        Context context = customizableMediaView.getContext();
        this.b.getClass();
        lv1 lv1Var = (lv1) lq81.c.a(context).b.remove(lg71Var);
        if (lv1Var == null) {
            try {
                lv1Var = new lv1(context, new rp81(), null);
            } catch (Throwable unused) {
                lv1Var = null;
            }
            if (lv1Var == null) {
                throw new am3();
            }
        }
        nn61 nn61Var = lv1Var.k;
        nn61Var.a.add(bl61Var);
        nn61Var.b.add(sz61Var);
        nn61Var.c.add(sz61Var);
        this.a.getClass();
        if (!b9a1.a(customizableMediaView.getContext(), eq0.e)) {
            customizableMediaView.removeAllViews();
        }
        customizableMediaView.addView(lv1Var, new FrameLayout.LayoutParams(-1, -1));
        this.c.getClass();
        return new xz71(customizableMediaView, new dx71(lv1Var), j981Var);
    }
}
