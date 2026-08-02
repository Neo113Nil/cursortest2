package xsna;

import com.vk.stat.scheme.CommonAudioStat$TypeAudioListeningItem;

/* compiled from: MusicPlaybackAnalyticsCollectorEvent.kt */
/* loaded from: classes3.dex */
public final class cv40 implements ax1 {
    public final long a;
    public final CommonAudioStat$TypeAudioListeningItem b;

    public cv40(long j, CommonAudioStat$TypeAudioListeningItem commonAudioStat$TypeAudioListeningItem) {
        this.a = j;
        this.b = commonAudioStat$TypeAudioListeningItem;
        String.valueOf(j);
    }

    @Override // xsna.ax1
    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cv40) {
            cv40 cv40Var = (cv40) obj;
            if (this.a == cv40Var.a && this.b.equals(cv40Var.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.ax1
    public final String getId() {
        throw null;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MusicPlaybackAnalyticsCollectorEvent(timestamp=" + ((Object) my1.b(this.a)) + ", playbackEvent=" + this.b + ')';
    }
}
