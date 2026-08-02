package xsna;

import android.os.Handler;
import com.vk.audio.AudioMessageSource;
import com.vk.log.L;
import xsna.xq4;

/* compiled from: AudioMessageUtils.java */
/* loaded from: classes15.dex */
public final class vq4 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ AudioMessageSource c;
    public final /* synthetic */ xq4 d;

    public vq4(xq4 xq4Var, int i, AudioMessageSource audioMessageSource) {
        this.d = xq4Var;
        this.b = i;
        this.c = audioMessageSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.t == null) {
            return;
        }
        xq4 xq4Var = this.d;
        m3a m3aVar = xq4Var.e;
        xq4.d dVar = xq4Var.g;
        m3aVar.getClass();
        try {
            ((Handler) m3aVar.b).removeCallbacks(dVar);
        } catch (Exception e) {
            L.g("cancel task failure", e);
        }
        xq4 xq4Var2 = this.d;
        m3a m3aVar2 = xq4Var2.e;
        xq4.c cVar = xq4Var2.h;
        m3aVar2.getClass();
        try {
            ((Handler) m3aVar2.b).removeCallbacks(cVar);
        } catch (Exception e2) {
            L.g("cancel task failure", e2);
        }
        try {
            L.e("AudioMessageUtils", "Audio record stop");
            this.d.t.stop();
        } catch (Exception e3) {
            L.f("AudioMessageUtils", "Audio record stop failure", e3);
            this.d.b();
        }
        xq4.a(this.d, this.b, this.c, false, 0);
        xq4 xq4Var3 = this.d;
        fo4 fo4Var = xq4Var3.l;
        fo4Var.a.g.remove(xq4Var3.b);
        fo4Var.b();
    }
}
