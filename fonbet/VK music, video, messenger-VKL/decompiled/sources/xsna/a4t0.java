package xsna;

/* compiled from: VideoPlayerAudioFocusListener.kt */
/* loaded from: classes3.dex */
public final class a4t0 extends hs6 {
    public final a c;
    public final j0 d = new j0(this, 15);

    /* compiled from: VideoPlayerAudioFocusListener.kt */
    public interface a {
        void a();

        void b();
    }

    public a4t0(a aVar) {
        this.c = aVar;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        if (i == -2 || i == -1) {
            this.c.a();
        } else if (i == 1 || i == 2) {
            this.b.postDelayed(this.d, 1500L);
        }
    }
}
