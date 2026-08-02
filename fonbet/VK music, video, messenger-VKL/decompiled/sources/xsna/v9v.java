package xsna;

import androidx.media3.datasource.a;
import androidx.media3.datasource.g;
import okhttp3.d;

/* compiled from: HlsVKProxySupportDataSourceFactory.kt */
/* loaded from: classes3.dex */
public final class v9v implements a.InterfaceC0045a {
    public final bpn0 a;

    public v9v(d.a aVar, mjp0 mjp0Var) {
        this.a = new bpn0(new nh3(14, aVar, mjp0Var));
    }

    @Override // androidx.media3.datasource.a.InterfaceC0045a
    public final androidx.media3.datasource.a createDataSource() {
        return ((g.a) this.a.getValue()).createDataSource();
    }
}
