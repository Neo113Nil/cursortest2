package yads;

import android.content.Context;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes10.dex */
public final class xo1 {
    public final no1 a;
    public final mx1 b;

    public /* synthetic */ xo1() {
        this(new no1(), new mx1());
    }

    public final jw2 a(CustomizableMediaView customizableMediaView, pk1 pk1Var, a61 a61Var, q82 q82Var, bp1 bp1Var) {
        Context context = customizableMediaView.getContext();
        mx1 mx1Var = this.b;
        mx1Var.getClass();
        ix1 ix1Var = (ix1) tx1.c.a(context).b.remove(pk1Var);
        if (ix1Var == null) {
            gt2 gt2Var = mx1Var.a;
            xo3 xo3Var = new xo3(zo3.e);
            gt2Var.getClass();
            ix1Var = null;
            try {
                ix1Var = new ix1(context, xo3Var, null);
            } catch (Throwable unused) {
            }
            if (ix1Var == null) {
                throw new bp3();
            }
        }
        yw1 yw1Var = ix1Var.l;
        yw1Var.a.add(a61Var);
        yw1Var.b.add(q82Var);
        yw1Var.c.add(q82Var);
        this.a.getClass();
        if (!qr0.a(customizableMediaView.getContext(), pr0.e)) {
            customizableMediaView.removeAllViews();
        }
        customizableMediaView.addView(ix1Var, new FrameLayout.LayoutParams(-1, -1));
        return new jw2(customizableMediaView, bp1Var, new ml3(new kx1(ix1Var)));
    }

    public xo1(no1 no1Var, mx1 mx1Var) {
        this.a = no1Var;
        this.b = mx1Var;
    }
}
