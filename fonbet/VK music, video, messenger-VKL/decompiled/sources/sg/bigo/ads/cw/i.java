package sg.bigo.ads.cw;

import android.support.v4.media.session.PlaybackStateCompat;
import xsna.tgw;

/* loaded from: classes9.dex */
public class i {
    a b;
    volatile boolean d;
    public sg.bigo.ads.ay.a e;
    private final Object a = new Object();
    final Object c = new Object();

    public final int a(byte[] bArr, long j) {
        if (j < 0) {
            sg.bigo.ads.bn.a.a(0, "ProxyCache", "buffer or offset or length is wrong");
            return 0;
        }
        int i = 0;
        while (!this.b.c() && this.b.a() < PlaybackStateCompat.ACTION_PLAY_FROM_URI + j && !this.d) {
            i++;
            synchronized (this.a) {
                try {
                    Thread.currentThread().getName();
                    String str = this.e.b;
                    this.a.wait(1000L);
                } catch (InterruptedException e) {
                    sg.bigo.ads.bn.a.a(0, "ProxyCache", "Waiting source data is interrupted!" + e.toString());
                }
            }
            if (i >= 15) {
                sg.bigo.ads.bn.a.a(0, "ProxyCache", "wait for downloading more than 15s.");
                throw new j(tgw.b(i, "Error reading source ", " times"));
            }
        }
        return this.b.a(bArr, j);
    }
}
