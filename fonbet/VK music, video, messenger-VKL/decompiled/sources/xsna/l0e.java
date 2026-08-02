package xsna;

import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import java.util.List;

/* compiled from: ClipsEditorTimelineBlock.kt */
/* loaded from: classes16.dex */
public final class l0e {
    public final List<com.vk.clips.editor.state.model.c> a;
    public final ClipsEditorAudioItem b;
    public final List<List<ClipsEditorAudioItem>> c;
    public final List<List<com.vk.clips.editor.state.model.b>> d;

    /* JADX WARN: Multi-variable type inference failed */
    public l0e(List<com.vk.clips.editor.state.model.c> list, ClipsEditorAudioItem clipsEditorAudioItem, List<? extends List<ClipsEditorAudioItem>> list2, List<? extends List<com.vk.clips.editor.state.model.b>> list3) {
        this.a = list;
        this.b = clipsEditorAudioItem;
        this.c = list2;
        this.d = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0e)) {
            return false;
        }
        l0e l0eVar = (l0e) obj;
        return epx.f(this.a, l0eVar.a) && epx.f(this.b, l0eVar.b) && epx.f(this.c, l0eVar.c) && epx.f(this.d, l0eVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ClipsEditorAudioItem clipsEditorAudioItem = this.b;
        return this.d.hashCode() + fw3.a((hashCode + (clipsEditorAudioItem == null ? 0 : clipsEditorAudioItem.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsEditorTimelineBlock(videoDataList=");
        sb.append(this.a);
        sb.append(", licensedMusic=");
        sb.append(this.b);
        sb.append(", audioItems=");
        sb.append(this.c);
        sb.append(", stickerItems=");
        return ms9.a(')', sb, this.d);
    }
}
