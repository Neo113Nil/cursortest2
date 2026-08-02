package defpackage;

import com.yandex.xplat.common.NetworkMethod;

/* loaded from: classes2.dex */
public final class ns20 implements vv50 {
    public final boolean a;
    public final String b;
    public final mum c;
    public final od51 d;
    public final String e;

    public ns20(boolean z, String str, mum mumVar, od51 od51Var, String str2) {
        this.a = z;
        this.b = str;
        this.c = mumVar;
        this.d = od51Var;
        this.e = str2;
    }

    public final tsp0 c(hz50 hz50Var, Boolean bool) {
        String str;
        NetworkMethod method = hz50Var.method();
        String c = hz50Var.c();
        wj00 a = hz50Var.a();
        wj00 b = hz50Var.b();
        wj00 d = hz50Var.d();
        if (this.a) {
            d.j(1, "X-SDK-Force-CVV");
        }
        String str2 = this.b;
        if (str2 != null) {
            d.k("X-SDK-Integration-Profile-Id", str2);
        } else {
            d.getClass();
        }
        if (jl40.l(bool, Boolean.TRUE)) {
            d.k("X-DEBRANDING", "true");
        }
        int i = zvy0.a[this.d.getTheme().ordinal()];
        if (i == 1) {
            str = "light";
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            str = "dark";
        }
        d.k("X-SDK-THEME", str);
        d.k("X-SDK-Locale", this.e);
        return new tsp0(method, c, a, b, d, hz50Var.encoding());
    }

    @Override // defpackage.vv50
    public final md51 d(final hz50 hz50Var) {
        final int i = 0;
        final int i2 = 1;
        return ymx.l(zmx.b(new ota(25, this.c)), new tls(this) { // from class: ms20
            public final /* synthetic */ ns20 b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i;
                hz50 hz50Var2 = hz50Var;
                ns20 ns20Var = this.b;
                switch (i3) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        return ns20Var.c(hz50Var2, bool);
                    default:
                        return ns20Var.c(hz50Var2, null);
                }
            }
        }, new tls(this) { // from class: ms20
            public final /* synthetic */ ns20 b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i2;
                hz50 hz50Var2 = hz50Var;
                ns20 ns20Var = this.b;
                switch (i3) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        return ns20Var.c(hz50Var2, bool);
                    default:
                        return ns20Var.c(hz50Var2, null);
                }
            }
        }, 1);
    }
}
