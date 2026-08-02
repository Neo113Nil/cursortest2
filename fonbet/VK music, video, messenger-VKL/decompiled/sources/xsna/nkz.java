package xsna;

import one.video.player.live.media.audio.AudioPlayerNative;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class nkz implements Runnable {
    public final /* synthetic */ qkz b;
    public final /* synthetic */ float c;

    public /* synthetic */ nkz(qkz qkzVar, float f) {
        this.b = qkzVar;
        this.c = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioPlayerNative audioPlayerNative = this.b.f;
        if (audioPlayerNative != null) {
            audioPlayerNative.setVolume(this.c);
        }
    }
}
