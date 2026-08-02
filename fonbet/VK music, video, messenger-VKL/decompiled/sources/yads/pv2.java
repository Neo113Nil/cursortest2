package yads;

import androidx.media3.datasource.a;
import javax.net.ssl.SSLSocketFactory;
import xsna.xiv;

/* loaded from: classes10.dex */
public final class pv2 implements a.InterfaceC0045a {
    public final String a;
    public final SSLSocketFactory b;

    public pv2(String str, SSLSocketFactory sSLSocketFactory) {
        this.a = str;
        this.b = sSLSocketFactory;
    }

    @Override // androidx.media3.datasource.a.InterfaceC0045a
    public final androidx.media3.datasource.a createDataSource() {
        return new mv2(this.a, 8000, 8000, false, new xiv(), this.b);
    }
}
