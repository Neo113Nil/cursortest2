package xsna;

import com.vk.clips.sdk.drafts.models.ClipsDraftAudioEffectType;

/* compiled from: ClipsDraftAudioItem.kt */
/* loaded from: classes17.dex */
public final class vrd {
    public final dtd a;
    public final float b;
    public final ClipsDraftAudioEffectType c;
    public final float d;

    public vrd(dtd dtdVar, float f, ClipsDraftAudioEffectType clipsDraftAudioEffectType, float f2) {
        this.a = dtdVar;
        this.b = f;
        this.c = clipsDraftAudioEffectType;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrd)) {
            return false;
        }
        vrd vrdVar = (vrd) obj;
        return epx.f(this.a, vrdVar.a) && Float.compare(this.b, vrdVar.b) == 0 && this.c == vrdVar.c && Float.compare(this.d, vrdVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ((this.c.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsDraftAudioItem(audio=");
        sb.append(this.a);
        sb.append(", volume=");
        sb.append(this.b);
        sb.append(", audioEffect=");
        sb.append(this.c);
        sb.append(", speed=");
        return xq.c(')', this.d, sb);
    }
}
