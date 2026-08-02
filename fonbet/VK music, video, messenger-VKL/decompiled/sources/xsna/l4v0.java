package xsna;

import com.vk.music.view.vkmix.models.MusicMixMood;

/* compiled from: VkMixListenerImpl.kt */
/* loaded from: classes16.dex */
public final class l4v0 {
    public final r80 a;
    public final io.reactivex.rxjava3.subjects.f<MusicMixMood> b;
    public final io.reactivex.rxjava3.subjects.f<Boolean> c;
    public final io.reactivex.rxjava3.subjects.f<Boolean> d;
    public final io.reactivex.rxjava3.subjects.f<s3q0> e;
    public final io.reactivex.rxjava3.subjects.f<w4v0> f;
    public final io.reactivex.rxjava3.subjects.d<Integer> g;

    public l4v0() {
        r80 r80Var = new r80();
        r80Var.a = "";
        r80Var.b = "";
        r80Var.c = null;
        this.a = r80Var;
        this.b = new io.reactivex.rxjava3.subjects.f<>();
        this.c = new io.reactivex.rxjava3.subjects.f<>();
        this.d = new io.reactivex.rxjava3.subjects.f<>();
        this.e = new io.reactivex.rxjava3.subjects.f<>();
        this.f = new io.reactivex.rxjava3.subjects.f<>();
        this.g = io.reactivex.rxjava3.subjects.d.O0(0);
    }

    public final r80 a() {
        return this.a;
    }

    public final io.reactivex.rxjava3.subjects.f b() {
        return this.e;
    }

    public final void c(MusicMixMood musicMixMood) {
        this.b.onNext(musicMixMood);
    }

    public final void d(w4v0 w4v0Var) {
        this.f.onNext(w4v0Var);
    }

    public final void e() {
        this.e.onNext(s3q0.a);
    }
}
