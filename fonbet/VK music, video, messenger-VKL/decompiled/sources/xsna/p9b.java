package xsna;

import com.vk.channels.api.Channel;

/* compiled from: ChannelProfileInfoModelDataSource.kt */
/* loaded from: classes16.dex */
public final class p9b implements o9b {
    public final ixa a;
    public final v8b b;

    public p9b(ixa ixaVar, v8b v8bVar) {
        this.a = ixaVar;
        this.b = v8bVar;
    }

    @Override // xsna.o9b
    public final io.reactivex.rxjava3.core.q<Channel> a() {
        return this.a.a();
    }

    @Override // xsna.o9b
    public final String b() {
        g2v.c().getClass();
        Channel b = this.a.b();
        if (b == null) {
            return null;
        }
        String str = "https://" + a0a.d + "/im/channels/" + b.b;
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str;
    }
}
