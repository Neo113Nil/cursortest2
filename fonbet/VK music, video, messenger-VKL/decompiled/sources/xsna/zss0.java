package xsna;

import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;

/* compiled from: VideoMediaSessionCallback.kt */
/* loaded from: classes3.dex */
public class zss0 extends MediaSessionCompat.Callback {
    public yg5 a;

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onFastForward() {
        yg5 yg5Var = this.a;
        if (yg5Var != null) {
            yg5Var.A0(true);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null || keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 126) {
            onPlay();
            return true;
        }
        if (keyCode == 127) {
            onPause();
            return true;
        }
        if (keyCode != 274) {
            if (keyCode != 275) {
                switch (keyCode) {
                    case 87:
                        wjs0.a(new sxr0(1));
                        break;
                    case 88:
                        wjs0.a(new sxr0(-1));
                        break;
                }
                return false;
            }
            onRewind();
            return true;
        }
        onFastForward();
        return true;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onPause() {
        yg5 yg5Var = this.a;
        if (yg5Var != null) {
            yg5Var.c();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onPlay() {
        yg5 yg5Var = this.a;
        if (yg5Var != null) {
            yg5Var.f();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onRewind() {
        yg5 yg5Var = this.a;
        if (yg5Var != null) {
            yg5Var.A0(false);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onSeekTo(long j) {
        yg5 yg5Var = this.a;
        if (yg5Var != null) {
            yg5Var.seek(j);
        }
    }
}
