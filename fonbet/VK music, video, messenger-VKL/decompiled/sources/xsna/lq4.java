package xsna;

import com.vk.im.external.AudioTrack;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.kq4;

/* compiled from: AudioMediator.kt */
/* loaded from: classes2.dex */
public final class lq4 implements kq4 {
    public AudioTrack b;
    public final ArrayList a = new ArrayList();
    public hr4 c = new hr4(0);

    @Override // xsna.kq4
    public final hr4 a() {
        return this.c;
    }

    @Override // xsna.kq4
    public final void b(hr30 hr30Var) {
        this.a.remove(hr30Var);
    }

    @Override // xsna.kq4
    public final void c(hr30 hr30Var) {
        this.a.add(hr30Var);
    }

    @Override // xsna.kq4
    public final AudioTrack d() {
        return this.b;
    }

    public final void e(AudioTrack audioTrack) {
        bpn0 bpn0Var = i0q0.a;
        this.b = audioTrack;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((kq4.a) it.next()).a(audioTrack);
        }
    }
}
