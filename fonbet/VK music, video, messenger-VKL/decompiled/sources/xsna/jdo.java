package xsna;

import com.vk.dto.common.clips.ClipAudioTemplate;

/* compiled from: DraftListItem.kt */
/* loaded from: classes17.dex */
public final class jdo {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final ClipAudioTemplate e;

    public jdo(String str, String str2, String str3, int i, ClipAudioTemplate clipAudioTemplate) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = clipAudioTemplate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdo)) {
            return false;
        }
        jdo jdoVar = (jdo) obj;
        return epx.f(this.a, jdoVar.a) && epx.f(this.b, jdoVar.b) && epx.f(this.c, jdoVar.c) && this.d == jdoVar.d && epx.f(this.e, jdoVar.e);
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int a2 = shy.a(this.d, (a + (str == null ? 0 : str.hashCode())) * 31, 31);
        ClipAudioTemplate clipAudioTemplate = this.e;
        return a2 + (clipAudioTemplate != null ? clipAudioTemplate.b.hashCode() : 0);
    }

    public final String toString() {
        return "DraftListItem(storageId=" + this.a + ", description=" + this.b + ", previewUri=" + this.c + ", time=" + this.d + ", template=" + this.e + ')';
    }
}
