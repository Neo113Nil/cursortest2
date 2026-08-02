package xsna;

import android.media.MediaPlayer;

/* compiled from: PagerVideoPlayer.java */
/* loaded from: classes15.dex */
public final class uc90 implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ com.vk.attachpicker.widget.c b;

    public uc90(com.vk.attachpicker.widget.c cVar) {
        this.b = cVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        com.vk.attachpicker.widget.c cVar = this.b;
        cVar.e.setVisibility(0);
        p870.f().e(5, Integer.valueOf(cVar.d));
    }
}
