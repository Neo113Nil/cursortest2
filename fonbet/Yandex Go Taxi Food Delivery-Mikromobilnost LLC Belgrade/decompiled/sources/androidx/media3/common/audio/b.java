package androidx.media3.common.audio;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import defpackage.tw21;
import defpackage.ue3;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class b {
    public final int a;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final ue3 d;
    public final boolean e;
    public final AudioFocusRequest f;

    public b(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, ue3 ue3Var, boolean z) {
        this.a = i;
        this.c = handler;
        this.d = ue3Var;
        this.e = z;
        int i2 = tw21.a;
        if (i2 < 26) {
            this.b = new AudioFocusRequestCompat$OnAudioFocusChangeListenerHandlerCompat(onAudioFocusChangeListener, handler);
        } else {
            this.b = onAudioFocusChangeListener;
        }
        if (i2 >= 26) {
            this.f = new AudioFocusRequest.Builder(i).setAudioAttributes(ue3Var.a().a).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.e == bVar.e && Objects.equals(this.b, bVar.b) && Objects.equals(this.c, bVar.c) && Objects.equals(this.d, bVar.d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e));
    }
}
