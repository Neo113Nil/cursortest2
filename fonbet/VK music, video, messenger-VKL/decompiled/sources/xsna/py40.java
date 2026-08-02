package xsna;

/* compiled from: MusicPlayerServiceStateImpl.kt */
/* loaded from: classes3.dex */
public final class py40 implements com.vk.music.api.a {
    public final io.reactivex.rxjava3.subjects.d<Boolean> b = io.reactivex.rxjava3.subjects.d.O0(Boolean.FALSE);

    @Override // com.vk.music.api.a
    public final void a(boolean z) {
        this.b.onNext(Boolean.valueOf(z));
        k840.c = z;
    }

    @Override // com.vk.music.api.a
    public final io.reactivex.rxjava3.core.q b() {
        return this.b;
    }
}
