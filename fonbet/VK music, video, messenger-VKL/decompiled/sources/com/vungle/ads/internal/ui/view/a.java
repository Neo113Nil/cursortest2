package com.vungle.ads.internal.ui.view;

import android.media.MediaPlayer;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class a implements Runnable {
    public final WeakReference a;

    public a(d dVar) {
        this.a = new WeakReference(dVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaPlayer mediaPlayer;
        d dVar = (d) this.a.get();
        if (dVar == null) {
            return;
        }
        dVar.b();
        if (!dVar.i.get() || (mediaPlayer = dVar.g) == null || !mediaPlayer.isPlaying() || dVar.q) {
            return;
        }
        dVar.w.postDelayed(this, 1000L);
    }
}
