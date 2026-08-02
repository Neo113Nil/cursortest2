package xsna;

import androidx.media3.datasource.a;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.b;
import xsna.kk80;
import xsna.q6g0;

/* compiled from: DashChunkSourceFactoryBuilder.kt */
/* loaded from: classes8.dex */
public final class lsk {
    public Cache a;
    public xw8 b = xw8.f7;
    public qo10 c;
    public boolean d;

    public lsk() {
        int i = wn80.a;
        this.c = new rhh0(8);
    }

    public final b.a a(a.InterfaceC0045a interfaceC0045a) {
        Cache cache = this.a;
        return (cache == null || !this.d) ? cache != null ? new a.C0053a(cache, this.b, interfaceC0045a, this.c) : new q6g0.a(interfaceC0045a, this.c) : new kk80.a(cache, this.b, interfaceC0045a, this.c);
    }
}
