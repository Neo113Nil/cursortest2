package xsna;

import com.vk.dto.music.MusicTrack;

/* compiled from: MusicDownloadManagerControllerImpl.kt */
/* loaded from: classes3.dex */
public final class yh40 implements jb50 {
    public final /* synthetic */ xh40 a;
    public final /* synthetic */ MusicTrack b;
    public final /* synthetic */ String c;

    public yh40(xh40 xh40Var, MusicTrack musicTrack, String str) {
        this.a = xh40Var;
        this.b = musicTrack;
        this.c = str;
        if (((Boolean) xh40Var.j.getValue()).booleanValue()) {
            i0q0.f(new ss3(15, musicTrack, kq40.b(musicTrack)));
        }
    }

    @Override // xsna.jb50
    public final void a(float f) {
        r8b0 r8b0Var = this.a.i.get(this.c);
        if (r8b0Var != null) {
            r8b0Var.b(this.b, f);
        }
    }

    @Override // xsna.jb50
    public final void b() {
        r8b0 r8b0Var = this.a.i.get(this.c);
        if (r8b0Var != null) {
            r8b0Var.a(this.b);
        }
    }

    @Override // xsna.jb50
    public final void c() {
        r8b0 r8b0Var = this.a.i.get(this.c);
        if (r8b0Var != null) {
            r8b0Var.e(this.b);
        }
    }

    @Override // xsna.jb50
    public final void d() {
        r8b0 r8b0Var = this.a.i.get(this.c);
        if (r8b0Var != null) {
            r8b0Var.a(this.b);
        }
    }

    @Override // xsna.jb50
    public final void e(Exception exc) {
        r8b0 r8b0Var = this.a.i.get(this.c);
        if (r8b0Var != null) {
            r8b0Var.d(this.b, exc);
        }
    }
}
