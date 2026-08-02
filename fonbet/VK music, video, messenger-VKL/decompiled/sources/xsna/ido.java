package xsna;

import com.vk.dto.common.clips.ClipAudioTemplate;

/* compiled from: DraftItem.kt */
/* loaded from: classes16.dex */
public final class ido {
    public final String a;
    public final String b;
    public final int c;
    public final ClipAudioTemplate d;

    public ido(String str, String str2, int i, ClipAudioTemplate clipAudioTemplate) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = clipAudioTemplate;
    }

    public final boolean equals(Object obj) {
        ido idoVar = obj instanceof ido ? (ido) obj : null;
        return idoVar != null && this.c == idoVar.c;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return "DraftItem(draftId=" + this.a + ", previewUri=" + this.b + ", time=" + this.c + ", template=" + this.d + ')';
    }
}
