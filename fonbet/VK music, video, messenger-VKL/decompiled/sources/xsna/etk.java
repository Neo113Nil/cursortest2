package xsna;

import androidx.media3.datasource.a;
import androidx.media3.datasource.g;
import okhttp3.d;
import xsna.ux70;

/* compiled from: DashVKProxySupportDataSourceFactory.kt */
/* loaded from: classes.dex */
public final class etk implements a.InterfaceC0045a {
    public final bpn0 a;

    public etk(final d.a aVar, final mjp0 mjp0Var) {
        this.a = new bpn0(new gzs() { // from class: xsna.dtk
            @Override // xsna.gzs
            public final Object invoke() {
                d.a aVar2 = d.a.this;
                mjp0 mjp0Var2 = mjp0Var;
                ux70.a aVar3 = new ux70.a(aVar2);
                o260 o260Var = d260.a;
                if (o260Var == null) {
                    o260Var = null;
                }
                aVar3.c = o260Var.l.a();
                aVar3.d = mjp0Var2;
                return new g.a(aVar3, new gtk());
            }
        });
    }

    @Override // androidx.media3.datasource.a.InterfaceC0045a
    public final androidx.media3.datasource.a createDataSource() {
        return ((g.a) this.a.getValue()).createDataSource();
    }
}
