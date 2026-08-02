package yads;

import android.content.Context;
import android.widget.ImageView;
import android.widget.ProgressBar;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class x72 {
    public final i42 a;
    public final v72 b;
    public final ci3 c;
    public final w62 d;
    public u72 e;
    public h42 f;

    public /* synthetic */ x72(Context context, hl3 hl3Var, ej3 ej3Var, d4 d4Var, ov2 ov2Var, v9 v9Var, zi3 zi3Var, f72 f72Var, i42 i42Var, nj2 nj2Var, qz2 qz2Var) {
        this(i42Var, new v72(hl3Var, ej3Var, d4Var, ov2Var, v9Var, zi3Var, f72Var, nj2Var, qz2Var), new ci3(), new w62(context.getApplicationContext(), d4Var, ov2Var, v9Var));
    }

    public final void a(g82 g82Var, we3 we3Var, dl3 dl3Var) {
        double d;
        x41 x41Var;
        w62 w62Var = this.d;
        nf3 nf3Var = (nf3) j5g.Y(we3Var.a);
        q62 a = w62Var.c.a(nf3Var);
        if (a == null || a.f()) {
            a = w62Var.b.a();
            w62Var.c.a(nf3Var, a);
        }
        q62 q62Var = a;
        Context context = g82Var.getContext();
        v72 v72Var = this.b;
        jg3 jg3Var = new jg3(v72Var.c, v72Var.e);
        v9 v9Var = v72Var.e;
        ov2 ov2Var = v72Var.d;
        ej3 ej3Var = v72Var.b;
        u72 u72Var = new u72(context, v9Var, ov2Var, q62Var, we3Var, ej3Var, v72Var.a, jg3Var, dl3Var, v72Var.f, v72Var.g, v72Var.h, v72Var.i);
        this.e = u72Var;
        r62 r62Var = u72Var.d;
        r62Var.getClass();
        Double d2 = ej3Var.d;
        x62 x62Var = r62Var.b;
        if (d2 != null) {
            x62Var.getClass();
            d = d2.doubleValue();
        } else {
            d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        }
        x62Var.a.setVolume((float) d);
        r62Var.a.a(ej3Var.a);
        u72Var.f.a(g82Var);
        ij3 ij3Var = g82Var.a;
        hk2 hk2Var = u72Var.e;
        hk2Var.getClass();
        ImageView imageView = ij3Var.b;
        ProgressBar progressBar = ij3Var.a;
        if (imageView == null || (x41Var = hk2Var.a.c) == null) {
            progressBar.setVisibility(0);
        } else {
            hk2Var.b.a(x41Var, new gk2(imageView, progressBar));
        }
        u72Var.a(u72Var.h);
        h42 h42Var = new h42(q62Var);
        this.f = h42Var;
        i42 i42Var = this.a;
        i42Var.a.add(h42Var);
        if (i42Var.b) {
            q62Var.g();
        }
        g82Var.setOnAttachStateChangeListener(new c72(q62Var, g82Var));
    }

    public x72(i42 i42Var, v72 v72Var, ci3 ci3Var, w62 w62Var) {
        this.a = i42Var;
        this.b = v72Var;
        this.c = ci3Var;
        this.d = w62Var;
    }
}
