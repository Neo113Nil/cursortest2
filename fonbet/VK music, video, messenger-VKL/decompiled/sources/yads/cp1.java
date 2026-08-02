package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.X3;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.Pair;
import xsna.pn00;

/* loaded from: classes10.dex */
public final class cp1 {
    public final d4 a;
    public final im3 b;
    public final hm3 c;
    public final Executor d;

    public cp1(Context context, ov2 ov2Var, d4 d4Var) {
        this(d4Var, new im3(context), new hm3(context, ov2Var));
    }

    public final void a(CustomizableMediaView customizableMediaView, String str) {
        d4 d4Var = this.a;
        String str2 = d4Var.c.a;
        if (str2 != null) {
            int i = d4Var.n;
            ViewGroup.LayoutParams layoutParams = customizableMediaView.getLayoutParams();
            Integer valueOf = layoutParams != null ? Integer.valueOf(jb3.a(layoutParams.width)) : null;
            ViewGroup.LayoutParams layoutParams2 = customizableMediaView.getLayoutParams();
            Integer valueOf2 = layoutParams2 != null ? Integer.valueOf(jb3.a(layoutParams2.height)) : null;
            int a = jb3.a(View.MeasureSpec.getSize(customizableMediaView.getWidthMeasureSpec()));
            int a2 = jb3.a(View.MeasureSpec.getSize(customizableMediaView.getHeightMeasureSpec()));
            int mode = View.MeasureSpec.getMode(customizableMediaView.getWidthMeasureSpec());
            mk1 mk1Var = mode != Integer.MIN_VALUE ? mode != 0 ? mode != 1073741824 ? mk1.d : mk1.b : mk1.d : mk1.c;
            int mode2 = View.MeasureSpec.getMode(customizableMediaView.getHeightMeasureSpec());
            final fm3 fm3Var = new fm3(new em3(jb3.a(customizableMediaView.getWidth()), jb3.a(customizableMediaView.getHeight())), new df1(valueOf, valueOf2), new kk1(new lk1(a, mk1Var), new lk1(a2, mode2 != Integer.MIN_VALUE ? mode2 != 0 ? mode2 != 1073741824 ? mk1.d : mk1.b : mk1.d : mk1.c)), pn00.k(new Pair("asset", X3.i.I0), new Pair("media_type", str)));
            final jm3 jm3Var = new jm3(i, str2);
            this.d.execute(new Runnable() { // from class: xsna.wmy0
                @Override // java.lang.Runnable
                public final void run() {
                    yads.cp1.a(yads.cp1.this, jm3Var, fm3Var);
                }
            });
        }
    }

    public /* synthetic */ cp1(d4 d4Var, im3 im3Var, hm3 hm3Var) {
        this(d4Var, im3Var, hm3Var, Executors.newSingleThreadExecutor());
    }

    public cp1(d4 d4Var, im3 im3Var, hm3 hm3Var, Executor executor) {
        this.a = d4Var;
        this.b = im3Var;
        this.c = hm3Var;
        this.d = executor;
    }

    public static final void a(cp1 cp1Var, jm3 jm3Var, fm3 fm3Var) {
        cp1Var.b.a(jm3Var, fm3Var);
        cp1Var.c.a(fm3Var, cp1Var.a);
    }
}
