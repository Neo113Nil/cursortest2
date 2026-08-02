package xsna;

import com.vk.music.playlist.display.domain.a;

/* compiled from: MusicPlaylistScreenActionProcessor.kt */
/* loaded from: classes3.dex */
public final class b250 implements icb0 {
    public final izs<com.vk.music.playlist.display.domain.a, s3q0> a;
    public final izs<Float, s3q0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public b250(izs<? super com.vk.music.playlist.display.domain.a, s3q0> izsVar, izs<? super Float, s3q0> izsVar2) {
        this.a = izsVar;
        this.b = izsVar2;
    }

    @Override // xsna.icb0
    public final void a(float f) {
        this.b.invoke(Float.valueOf(f));
    }

    @Override // xsna.icb0
    public final void h() {
        this.a.invoke(a.c.C1343c.b);
    }
}
