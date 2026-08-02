package xsna;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.ironsource.X3;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class hn01 extends MediaSessionCompat.Callback {
    public final /* synthetic */ hp01 a;

    public hn01(hp01 hp01Var) {
        Objects.requireNonNull(hp01Var);
        this.a = hp01Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        char c;
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle2;
        hp01.v.a("onCustomAction with action = %s", str);
        switch (str.hashCode()) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        hp01 hp01Var = this.a;
        if (c == 0) {
            long j = hp01Var.e.d;
            lvf0 lvf0Var = hp01Var.n;
            if (lvf0Var == null) {
                return;
            }
            long min = Math.min(lvf0Var.j(), Math.max(0L, lvf0Var.d() + j));
            lvf0 lvf0Var2 = hp01Var.n;
            if (lvf0Var2 == null) {
                return;
            }
            lvf0Var2.v(new ay10(min, false));
            return;
        }
        if (c == 1) {
            long j2 = -hp01Var.e.d;
            lvf0 lvf0Var3 = hp01Var.n;
            if (lvf0Var3 == null) {
                return;
            }
            long min2 = Math.min(lvf0Var3.j(), Math.max(0L, lvf0Var3.d() + j2));
            lvf0 lvf0Var4 = hp01Var.n;
            if (lvf0Var4 == null) {
                return;
            }
            lvf0Var4.v(new ay10(min2, false));
            return;
        }
        if (c == 2) {
            hui0 hui0Var = hp01Var.d;
            if (hui0Var != null) {
                hui0Var.b(true);
                return;
            }
            return;
        }
        if (c == 3) {
            hui0 hui0Var2 = hp01Var.d;
            if (hui0Var2 != null) {
                hui0Var2.b(false);
                return;
            }
            return;
        }
        Intent intent = new Intent(str);
        intent.setComponent(hp01Var.g);
        int i = Build.VERSION.SDK_INT;
        Context context = hp01Var.a;
        if (i < 34) {
            context.sendBroadcast(intent);
            return;
        }
        makeBasic = BroadcastOptions.makeBasic();
        shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
        bundle2 = shareIdentityEnabled.toBundle();
        context.sendBroadcast(intent, null, bundle2);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        lvf0 lvf0Var;
        hp01.v.a("onMediaButtonEvent", new Object[0]);
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return true;
        }
        if ((keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) || (lvf0Var = this.a.n) == null) {
            return true;
        }
        lvf0Var.x();
        return true;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPause() {
        hp01.v.a(X3.i.t0, new Object[0]);
        lvf0 lvf0Var = this.a.n;
        if (lvf0Var != null) {
            lvf0Var.x();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlay() {
        hp01.v.a("onPlay", new Object[0]);
        lvf0 lvf0Var = this.a.n;
        if (lvf0Var != null) {
            lvf0Var.x();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSeekTo(long j) {
        o100 o100Var = hp01.v;
        hp01.v.a("onSeekTo %d", Long.valueOf(j));
        lvf0 lvf0Var = this.a.n;
        if (lvf0Var == null) {
            return;
        }
        lvf0Var.v(new ay10(j, false));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSkipToNext() {
        hp01.v.a("onSkipToNext", new Object[0]);
        lvf0 lvf0Var = this.a.n;
        if (lvf0Var != null) {
            lvf0Var.r();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSkipToPrevious() {
        hp01.v.a("onSkipToPrevious", new Object[0]);
        lvf0 lvf0Var = this.a.n;
        if (lvf0Var != null) {
            lvf0Var.s();
        }
    }
}
