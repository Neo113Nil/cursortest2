package xsna;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import xsna.qr9;

/* compiled from: SoundCaptchaPresenter.kt */
/* loaded from: classes15.dex */
public final class ofk0 extends r96 implements jfk0 {
    public final AudioManager e;
    public final String f;
    public final String g;
    public io.reactivex.rxjava3.disposables.c h;
    public final MediaPlayer i;
    public final AudioFocusRequest j;

    public ofk0(AudioManager audioManager, String str, String str2) {
        this.e = audioManager;
        this.f = str;
        this.g = str2;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(1).setUsage(1).build());
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: xsna.kfk0
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                ofk0 ofk0Var = ofk0.this;
                ofk0Var.b(new qr9.d(ofk0Var.b));
                return true;
            }
        });
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: xsna.lfk0
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                ofk0 ofk0Var = ofk0.this;
                ofk0Var.b(new qr9.e(false, ofk0Var.b));
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: xsna.mfk0
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                ofk0 ofk0Var = ofk0.this;
                ofk0Var.b(new qr9.e(false, ofk0Var.b));
            }
        });
        this.i = mediaPlayer;
        this.j = new AudioFocusRequest.Builder(3).build();
        new AudioManager.OnAudioFocusChangeListener() { // from class: xsna.nfk0
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                ofk0 ofk0Var = ofk0.this;
                if (i == -3 || i == -2 || i == -1) {
                    ofk0Var.i.pause();
                    ofk0Var.b(new qr9.e(false, ofk0Var.b));
                } else {
                    if (i != 1) {
                        return;
                    }
                    ofk0Var.i.setVolume(1.0f, 1.0f);
                }
            }
        };
    }

    public final void c(Uri uri, boolean z) {
        b(new qr9.c(this.b));
        this.i.reset();
        io.reactivex.rxjava3.disposables.c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
        }
        String uri2 = uri.toString();
        String str = this.g;
        mgn0 mgn0Var = dgn0.a;
        if (str == null || str.length() == 0) {
            l6r0 l6r0Var = (l6r0) dgn0.d.getValue();
            str = l6r0Var != null ? l6r0Var.getToken() : null;
        }
        lg6 lg6Var = (lg6) dgn0.g.getValue();
        String valueOf = String.valueOf(str);
        lg6Var.getClass();
        int i = 23;
        this.h = new io.reactivex.rxjava3.internal.operators.observable.s0(new jg6(valueOf, uri2, lg6Var, 0)).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).U(new ac20(new q8w(20), 16)).subscribe(new l8w(new fda0(this, 9), i), new fs00(new wg8(1, this, ofk0.class, "loadingError", "loadingError(Ljava/lang/Throwable;)V", 0, 6), i));
        if (z) {
            this.d.start();
        }
    }

    @Override // xsna.pr9
    public final void deactivate() {
        MediaPlayer mediaPlayer = this.i;
        mediaPlayer.stop();
        mediaPlayer.reset();
        io.reactivex.rxjava3.disposables.c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
        }
        this.d.cancel();
        AudioFocusRequest audioFocusRequest = this.j;
        if (audioFocusRequest != null) {
            this.e.abandonAudioFocusRequest(audioFocusRequest);
        }
        b(new qr9.b(this.b));
    }

    @Override // xsna.jfk0
    public final void play() {
        AudioFocusRequest audioFocusRequest = this.j;
        if (audioFocusRequest != null) {
            this.e.requestAudioFocus(audioFocusRequest);
        }
        b(new qr9.e(true, this.b));
        this.i.start();
    }

    @Override // xsna.pr9
    public final void refresh() {
        Uri.Builder buildUpon = jeq0.g(this.f).buildUpon();
        buildUpon.appendQueryParameter(ToolBar.REFRESH, "1");
        c(buildUpon.build(), true);
    }
}
