package xsna;

import androidx.media3.datasource.a;
import androidx.media3.datasource.e;

/* compiled from: BaseDataSourceFactory.kt */
/* loaded from: classes8.dex */
public final class hc6 implements a.InterfaceC0045a {
    public final mjp0 a;
    public final a.InterfaceC0045a b;

    public hc6(a.InterfaceC0045a interfaceC0045a, String str, mjp0 mjp0Var) {
        this.a = mjp0Var;
        a.InterfaceC0045a interfaceC0045a2 = interfaceC0045a;
        if (interfaceC0045a == null) {
            e.a aVar = new e.a();
            aVar.b = str;
            aVar.c = 8000;
            aVar.d = 8000;
            interfaceC0045a2 = aVar;
        }
        this.b = interfaceC0045a2;
    }

    @Override // androidx.media3.datasource.a.InterfaceC0045a
    public final androidx.media3.datasource.a createDataSource() {
        androidx.media3.datasource.a createDataSource = this.b.createDataSource();
        createDataSource.addTransferListener(this.a);
        return createDataSource;
    }
}
