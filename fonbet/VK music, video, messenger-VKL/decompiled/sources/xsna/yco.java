package xsna;

import com.vk.dto.clips.morphing.AudioEffectType;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;

/* compiled from: DraftAudioItem.kt */
/* loaded from: classes16.dex */
public final class yco {
    public final ClipsEditorMusicInfo a;
    public final float b;
    public final AudioEffectType c;
    public final float d;

    public yco(ClipsEditorMusicInfo clipsEditorMusicInfo, float f, AudioEffectType audioEffectType, float f2) {
        this.a = clipsEditorMusicInfo;
        this.b = f;
        this.c = audioEffectType;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yco)) {
            return false;
        }
        yco ycoVar = (yco) obj;
        return epx.f(this.a, ycoVar.a) && Float.compare(this.b, ycoVar.b) == 0 && this.c == ycoVar.c && Float.compare(this.d, ycoVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ((this.c.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftAudioItem(info=");
        sb.append(this.a);
        sb.append(", volume=");
        sb.append(this.b);
        sb.append(", audioEffect=");
        sb.append(this.c);
        sb.append(", speed=");
        return xq.c(')', this.d, sb);
    }
}
