package xsna;

import com.vk.dto.common.clips.ClipAudioTemplate;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;

/* compiled from: ClipsGridDraftEntry.kt */
/* loaded from: classes18.dex */
public final class tce implements nmv {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint e;
    public final ClipAudioTemplate f;

    public tce(String str, String str2, String str3, int i, MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint, ClipAudioTemplate clipAudioTemplate) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = creationEntryPoint;
        this.f = clipAudioTemplate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tce)) {
            return false;
        }
        tce tceVar = (tce) obj;
        return epx.f(this.a, tceVar.a) && epx.f(this.b, tceVar.b) && epx.f(this.c, tceVar.c) && this.d == tceVar.d && this.e == tceVar.e && epx.f(this.f, tceVar.f);
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (this.e.hashCode() + shy.a(this.d, (a + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
        ClipAudioTemplate clipAudioTemplate = this.f;
        return hashCode + (clipAudioTemplate != null ? clipAudioTemplate.b.hashCode() : 0);
    }

    public final String toString() {
        return "ClipsGridDraftEntry(storageId=" + this.a + ", description=" + this.b + ", previewUri=" + this.c + ", time=" + this.d + ", entryPoint=" + this.e + ", template=" + this.f + ')';
    }
}
