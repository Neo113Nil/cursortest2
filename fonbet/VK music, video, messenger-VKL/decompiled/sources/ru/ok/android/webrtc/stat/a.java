package ru.ok.android.webrtc.stat;

import android.os.SystemClock;
import ru.ok.android.webrtc.stat.utils.BitrateCalc;
import ru.ok.android.webrtc.stat.utils.Ema;

/* loaded from: classes9.dex */
public final class a {
    public final Ema a = new Ema(0.3d);
    public final BitrateCalc b = new BitrateCalc();
    public long c;
    public final /* synthetic */ b d;

    public a(b bVar) {
        this.d = bVar;
    }

    public final void a(long j) {
        if (this.c != j) {
            this.c = j;
            this.d.c = SystemClock.elapsedRealtime();
            this.a.submit(this.b.update(j, this.d.c));
        }
    }
}
