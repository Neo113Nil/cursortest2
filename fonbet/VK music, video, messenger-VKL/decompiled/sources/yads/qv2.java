package yads;

import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes10.dex */
public final class qv2 implements o30 {
    public final String a;
    public final SSLSocketFactory b;

    public qv2(String str, SSLSocketFactory sSLSocketFactory) {
        this.a = str;
        this.b = sSLSocketFactory;
    }

    @Override // yads.o30
    public final p30 createDataSource() {
        return new nv2(this.a, 8000, 8000, false, new v11(), this.b);
    }
}
