package xsna;

import androidx.media3.datasource.a;
import androidx.media3.datasource.cache.a;
import androidx.media3.datasource.g;

/* compiled from: HackDataSourceFactory.kt */
/* loaded from: classes3.dex */
public final class ssu implements a.InterfaceC0045a {
    public final g.a a;

    public ssu(a.b bVar) {
        this.a = new g.a(bVar, new dn(19));
    }

    @Override // androidx.media3.datasource.a.InterfaceC0045a
    public final androidx.media3.datasource.a createDataSource() {
        return this.a.createDataSource();
    }
}
