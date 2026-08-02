package xsna;

import com.vk.dto.music.MusicTrack;

/* compiled from: AudioLongtapQueueImpl.kt */
/* loaded from: classes3.dex */
public final class eq4 implements cq4 {
    public final fq4 a;
    public MusicTrack b;
    public i600 c = i600.f;

    public eq4(fq4 fq4Var) {
        this.a = fq4Var;
    }

    @Override // xsna.cq4
    public final i600 a() {
        i600 i600Var = this.c;
        MusicTrack musicTrack = this.b;
        String str = musicTrack != null ? musicTrack.i : null;
        if (str == null) {
            str = "";
        }
        long j = i600Var.b;
        long j2 = i600Var.c;
        i600Var.getClass();
        i600 i600Var2 = new i600(j, j2, str, true);
        this.c = i600Var2;
        return i600Var2;
    }

    @Override // xsna.cq4
    public final void b(MusicTrack musicTrack, fh1 fh1Var, rx4 rx4Var) {
        this.b = musicTrack;
        uf1 uf1Var = new uf1(6, this, fh1Var);
        fq4 fq4Var = this.a;
        io.reactivex.rxjava3.core.x<i600> b = ((lx4) fq4Var.a).b(musicTrack);
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        ((io.reactivex.rxjava3.disposables.g) fq4Var.b).b(b.q(asu0.r()).m(asu0Var.d()).subscribe(new eu0(uf1Var, 3), new fu0(new fb(rx4Var, 4), 2)));
    }

    @Override // xsna.cq4
    public final i600 c() {
        return this.c;
    }

    @Override // xsna.cq4
    public final MusicTrack d() {
        return this.b;
    }

    @Override // xsna.cq4
    public final void release() {
        this.c = i600.f;
        this.b = null;
        ((io.reactivex.rxjava3.disposables.g) this.a.b).b(null);
    }
}
