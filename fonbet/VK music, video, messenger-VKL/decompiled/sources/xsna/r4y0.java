package xsna;

import android.content.Context;
import xsna.fo50;
import xsna.fz5;
import xsna.hl20;
import xsna.kyy0;
import xsna.pvp0;
import xsna.q7x0;
import xsna.r3y0;
import xsna.r4y0;
import xsna.r9y0;
import xsna.toy0;
import xsna.vgq;

/* loaded from: classes9.dex */
public final class r4y0 {
    public static volatile r4y0 h;
    public final Context a;
    public final bpn0 b = new bpn0(new gzs<r9y0>() { // from class: ru.rustore.sdk.appupdate.Y$d
        {
            super(0);
        }

        @Override // xsna.gzs
        public final r9y0 invoke() {
            return new r9y0((kyy0) r4y0.this.c.getValue(), (pvp0) r4y0.this.g.getValue(), (vgq) r4y0.this.d.getValue(), r4y0.this.a);
        }
    });
    public final bpn0 c = new bpn0(new gzs<kyy0>() { // from class: ru.rustore.sdk.appupdate.Y$c
        {
            super(0);
        }

        @Override // xsna.gzs
        public final kyy0 invoke() {
            return new kyy0((toy0) r4y0.this.e.getValue(), (hl20) r4y0.this.f.getValue());
        }
    });
    public final bpn0 d = new bpn0(new gzs<vgq>() { // from class: ru.rustore.sdk.appupdate.Y$e
        {
            super(0);
        }

        @Override // xsna.gzs
        public final vgq invoke() {
            return new vgq(new E(r4y0.this.a));
        }
    });
    public final bpn0 e = new bpn0(new gzs<toy0>() { // from class: ru.rustore.sdk.appupdate.Y$b
        @Override // xsna.gzs
        public final toy0 invoke() {
            return new toy0();
        }
    });
    public final bpn0 f = new bpn0(new gzs<hl20>() { // from class: ru.rustore.sdk.appupdate.Y$f
        {
            super(0);
        }

        @Override // xsna.gzs
        public final hl20 invoke() {
            return r3y0.c.a(r4y0.this.a).b;
        }
    });
    public final bpn0 g = new bpn0(new gzs<pvp0>() { // from class: ru.rustore.sdk.appupdate.Y$g
        {
            super(0);
        }

        @Override // xsna.gzs
        public final pvp0 invoke() {
            fz5 fz5Var = new fz5();
            r4y0.this.getClass();
            return new pvp0(fz5Var, new q7x0(), new fo50());
        }
    });

    public static final class a {
    }

    public r4y0(Context context) {
        this.a = context;
    }
}
