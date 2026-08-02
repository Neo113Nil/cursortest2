package xsna;

import android.media.AudioFocusRequest;
import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: AudioFocusRequestCompat.java */
/* loaded from: classes12.dex */
public final class no4 {
    public final int a;
    public final bo4 b;
    public final Handler c;
    public final nc4 d;
    public final boolean e;

    @Nullable
    public final AudioFocusRequest f;

    /* compiled from: AudioFocusRequestCompat.java */
    public static final class a {
        public int a;
        public nc4 b;
        public boolean c;
    }

    public no4(int i, bo4 bo4Var, Handler handler, nc4 nc4Var, boolean z) {
        this.a = i;
        this.c = handler;
        this.d = nc4Var;
        this.e = z;
        this.b = bo4Var;
        this.f = new AudioFocusRequest.Builder(i).setAudioAttributes(nc4Var.a()).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(bo4Var, handler).build();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no4)) {
            return false;
        }
        no4 no4Var = (no4) obj;
        return this.a == no4Var.a && this.e == no4Var.e && equals(no4Var.b) && Objects.equals(this.c, no4Var.c) && Objects.equals(this.d, no4Var.d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e));
    }
}
