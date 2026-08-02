package xsna;

import android.os.Build;
import com.vk.music.player.api.helper.AudioPlayer;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: MusicNormalizationStat.kt */
/* loaded from: classes3.dex */
public final class ip40 extends l5m {
    public final Throwable h;
    public final int i;
    public final float j;
    public final boolean k;
    public final String l;
    public final AudioPlayer.State m;
    public final int n;

    public ip40(Throwable th, int i, float f, boolean z, String str, AudioPlayer.State state, int i2) {
        super(null, null, 3);
        this.h = th;
        this.i = i;
        this.j = f;
        this.k = z;
        this.l = str;
        this.m = state;
        this.n = i2;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        String h = DevNullEventKey.MUSIC_NORMALIZATION.h();
        String message = this.h.getMessage();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        String valueOf = String.valueOf(this.j);
        AudioPlayer.State state = this.m;
        this.g = new SchemeStat$TypeDevNullItem(h, null, message, Integer.valueOf(this.i), str, Integer.valueOf(this.k ? 1 : 0), str2, Integer.valueOf(this.n), valueOf, null, this.l, null, state != null ? state.toString() : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -5630, 3, null);
        return super.p();
    }
}
