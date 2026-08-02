package xsna;

import android.content.Context;
import xsna.aqw;
import xsna.djz0;
import xsna.e4z0;
import xsna.fo50;
import xsna.g;
import xsna.hl20;
import xsna.oyy0;
import xsna.r3y0;
import xsna.su8;

/* loaded from: classes9.dex */
public final class su8 {
    public static volatile su8 g;
    public final Context a;
    public final bpn0 b = new bpn0(new gzs<ru.rustore.sdk.review.f>() { // from class: ru.rustore.sdk.review.C$c
        {
            super(0);
        }

        @Override // xsna.gzs
        public final f invoke() {
            return new f((e4z0) su8.this.c.getValue(), (djz0) su8.this.f.getValue());
        }
    });
    public final bpn0 c = new bpn0(new gzs<e4z0>() { // from class: ru.rustore.sdk.review.C$e
        {
            super(0);
        }

        @Override // xsna.gzs
        public final e4z0 invoke() {
            return new e4z0((oyy0) su8.this.d.getValue(), (hl20) su8.this.e.getValue());
        }
    });
    public final bpn0 d = new bpn0(new gzs<oyy0>() { // from class: ru.rustore.sdk.review.C$d
        @Override // xsna.gzs
        public final oyy0 invoke() {
            return new oyy0();
        }
    });
    public final bpn0 e = new bpn0(new gzs<hl20>() { // from class: ru.rustore.sdk.review.C$b
        {
            super(0);
        }

        @Override // xsna.gzs
        public final hl20 invoke() {
            return r3y0.c.a(su8.this.a).b;
        }
    });
    public final bpn0 f = new bpn0(new gzs<djz0>() { // from class: ru.rustore.sdk.review.C$f
        {
            super(0);
        }

        @Override // xsna.gzs
        public final djz0 invoke() {
            fo50 fo50Var = new fo50();
            su8.this.getClass();
            return new djz0(fo50Var, new g(), new aqw());
        }
    });

    public static final class a {
    }

    public su8(Context context) {
        this.a = context;
    }
}
