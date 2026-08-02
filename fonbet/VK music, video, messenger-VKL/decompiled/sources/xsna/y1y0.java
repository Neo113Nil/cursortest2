package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.dto.common.id.UserId;
import com.vk.stickers.ContextUser;
import com.vk.stickers.keyboard.StickersView;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.HashSet;

/* compiled from: WriteBarStickersHolder.kt */
/* loaded from: classes7.dex */
public final class y1y0 {
    public final WriteBar a;
    public final WriteBar b;
    public final b2y0 c;
    public z1y0 d;
    public final bpn0 f;
    public ViewGroup i;
    public StickersView.c j;
    public lk5 k;
    public final kcl0 l;
    public final dk5 m;
    public ContextUser n;
    public final HashSet<UserId> o;
    public k6n0 p;
    public final x1y0 q;
    public final bpn0 r;
    public final bpn0 s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final bpn0 w;
    public final io.reactivex.rxjava3.disposables.b e = new io.reactivex.rxjava3.disposables.b();
    public final bpn0 g = new bpn0(new clt0(this, 10));
    public final bpn0 h = new bpn0(new dbj0(this, 23));

    public y1y0(WriteBar writeBar, WriteBar writeBar2, b2y0 b2y0Var) {
        this.a = writeBar;
        this.b = writeBar2;
        this.c = b2y0Var;
        int i = 25;
        this.f = new bpn0(new dck0(this, i));
        t6g0 t6g0Var = t6g0.b;
        kcl0 d = t6g0.d();
        this.l = d;
        this.m = new dk5(d);
        this.o = new HashSet<>();
        this.p = new k6n0(false, false, false);
        this.q = new x1y0(this);
        this.r = new bpn0(new vpj0(this, i));
        this.s = new bpn0(new v1y0(this, 0));
        this.u = true;
        this.v = true;
        this.w = new bpn0(new tvs0(this, 8));
    }

    public final amv a() {
        return (amv) this.s.getValue();
    }

    public final ImageView b() {
        return (ImageView) this.g.getValue();
    }

    public final ImageView c() {
        return (ImageView) this.h.getValue();
    }

    public final void d() {
        if (a().c()) {
            a().s(this.t);
            this.a.postDelayed(new bi5(this, 14), 100L);
        }
    }

    public final void e() {
        this.c.d(R.attr.vk_ui_icon_secondary);
        ImageView b = b();
        boolean z = this.v;
        kcl0 kcl0Var = this.l;
        boolean z2 = false;
        awt0.v(b, z && kcl0Var.O0() > 0);
        ImageView c = c();
        if (this.v && kcl0Var.W()) {
            z2 = true;
        }
        awt0.v(c, z2);
        this.u = true;
    }
}
