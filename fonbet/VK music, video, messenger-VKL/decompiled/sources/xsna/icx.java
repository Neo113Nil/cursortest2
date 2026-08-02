package xsna;

import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import xsna.acx;

/* compiled from: InteractiveVideoMediaSessionCallback.kt */
/* loaded from: classes3.dex */
public final class icx extends MediaSessionCompat.Callback {
    public ef6 a;

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onFastForward() {
        ef6 ef6Var = this.a;
        if (ef6Var != null) {
            ef6Var.a(acx.d.a);
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
    public final void onPause() {
        ef6 ef6Var = this.a;
        if (ef6Var != null) {
            ef6Var.a(new acx.g(false, true, false));
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlay() {
        ef6 ef6Var = this.a;
        if (ef6Var != null) {
            ef6Var.a(new acx.g(true, true, false));
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onRewind() {
        ef6 ef6Var = this.a;
        if (ef6Var != null) {
            ef6Var.a(acx.c.a);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSeekTo(long j) {
        ef6 ef6Var = this.a;
        if (ef6Var != null) {
            ef6Var.a(new acx.h(j));
        }
    }
}
