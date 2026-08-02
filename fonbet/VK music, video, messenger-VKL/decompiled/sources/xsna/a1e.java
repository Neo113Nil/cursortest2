package xsna;

import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import java.io.File;

/* compiled from: ClipsEditorVoiceOverRecordState.kt */
/* loaded from: classes16.dex */
public final class a1e {
    public final boolean a;
    public final ClipsEditorMusicTrack b;
    public final File c;
    public final ClipsEditorAudioItem d;
    public final Long e;
    public final boolean f;

    public a1e(boolean z, ClipsEditorMusicTrack clipsEditorMusicTrack, File file, ClipsEditorAudioItem clipsEditorAudioItem, Long l, boolean z2) {
        this.a = z;
        this.b = clipsEditorMusicTrack;
        this.c = file;
        this.d = clipsEditorAudioItem;
        this.e = l;
        this.f = z2;
    }

    public static a1e a(a1e a1eVar, boolean z, Long l, int i) {
        ClipsEditorMusicTrack clipsEditorMusicTrack = a1eVar.b;
        File file = a1eVar.c;
        ClipsEditorAudioItem clipsEditorAudioItem = a1eVar.d;
        if ((i & 16) != 0) {
            l = a1eVar.e;
        }
        Long l2 = l;
        boolean z2 = (i & 32) != 0 ? a1eVar.f : true;
        a1eVar.getClass();
        return new a1e(z, clipsEditorMusicTrack, file, clipsEditorAudioItem, l2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1e)) {
            return false;
        }
        a1e a1eVar = (a1e) obj;
        return this.a == a1eVar.a && this.b.equals(a1eVar.b) && this.c.equals(a1eVar.c) && epx.f(this.d, a1eVar.d) && epx.f(this.e, a1eVar.e) && this.f == a1eVar.f;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31;
        ClipsEditorAudioItem clipsEditorAudioItem = this.d;
        int hashCode2 = (hashCode + (clipsEditorAudioItem == null ? 0 : clipsEditorAudioItem.hashCode())) * 31;
        Long l = this.e;
        return Boolean.hashCode(this.f) + ((hashCode2 + (l != null ? l.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsEditorVoiceOverRecordState(isRecording=");
        sb.append(this.a);
        sb.append(", stubVoiceOverTrack=");
        sb.append(this.b);
        sb.append(", recordDestinationFile=");
        sb.append(this.c);
        sb.append(", restoreMusicTrack=");
        sb.append(this.d);
        sb.append(", maxRecordDurationMs=");
        sb.append(this.e);
        sb.append(", isFinishing=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
