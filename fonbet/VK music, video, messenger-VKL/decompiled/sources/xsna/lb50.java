package xsna;

import android.content.Context;
import com.vk.dto.music.MusicTrack;
import xsna.tlo0;

/* compiled from: ErrorEvents.kt */
/* loaded from: classes3.dex */
public final class lb50 implements lvp {
    public final tlo0.f a;
    public final MusicTrack b;

    public lb50(int i, MusicTrack musicTrack) {
        this.a = tq.h(tlo0.Companion, i);
        this.b = musicTrack;
    }

    @Override // xsna.yj40
    public final String a() {
        StringBuilder sb = new StringBuilder("track ");
        sb.append(this.b.Fb());
        sb.append(": ");
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        tlo0.f fVar = this.a;
        fVar.getClass();
        sb.append((Object) tlo0.b.a(fVar, context));
        return sb.toString();
    }

    @Override // xsna.lvp
    public final tlo0 getMessage() {
        return this.a;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "MusicTrackErrorEvent";
    }
}
