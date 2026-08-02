package xsna;

import com.vk.dto.music.MusicTrack;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PlaylistEvents.kt */
/* loaded from: classes3.dex */
public final class gc50 implements yj40 {
    public final LinkedHashMap a;
    public final String b;

    public gc50(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
        this.b = "tracksSize=" + linkedHashMap.size();
    }

    @Override // xsna.yj40
    public final String a() {
        return this.b;
    }

    public final Map<String, MusicTrack> b() {
        return this.a;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "MusicTrackListDownloadEvent";
    }
}
