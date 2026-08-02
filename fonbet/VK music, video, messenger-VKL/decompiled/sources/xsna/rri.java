package xsna;

import com.vk.channels.api.Channel;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import java.util.Collections;
import java.util.List;

/* compiled from: Composers.kt */
/* loaded from: classes8.dex */
public class rri implements g5q0 {
    public boolean b;
    public final Object c;

    public rri(lhx lhxVar) {
        this.c = lhxVar;
        this.b = true;
    }

    public void a() {
        this.b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.g5q0
    public f5q0 b(Peer peer) {
        if (this.b) {
            return new f5q0(0, Integer.MAX_VALUE);
        }
        Channel channel = (Channel) ((wpp) ((w2w) this.c).L0(this, new gfb((List<? extends Peer>) Collections.singletonList(peer), Source.CACHE, false, (Object) this))).e(Long.valueOf(peer.b)).b;
        if (channel == null) {
            return null;
        }
        return new f5q0(channel.k, channel.i);
    }

    public void c() {
        this.b = false;
    }

    public void d() {
        this.b = false;
    }

    public void e(byte b) {
        ((lhx) this.c).writeLong(b);
    }

    public void f(char c) {
        ((lhx) this.c).a(c);
    }

    public void g(int i) {
        ((lhx) this.c).writeLong(i);
    }

    public void h(long j) {
        ((lhx) this.c).writeLong(j);
    }

    public void i(String str) {
        ((lhx) this.c).c(str);
    }

    public void j(short s) {
        ((lhx) this.c).writeLong(s);
    }

    public void k(String str) {
        ((lhx) this.c).b(str);
    }

    public rri(w2w w2wVar, boolean z) {
        this.c = w2wVar;
        this.b = z;
    }

    public void l() {
    }

    public void m() {
    }
}
