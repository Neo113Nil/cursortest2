package xsna;

import com.vk.dto.common.ClipVideoFile;

/* compiled from: ClipsTemplateEditorFragmentInputData.kt */
/* loaded from: classes16.dex */
public final class m7f {
    public final ClipVideoFile a;
    public final String b;
    public final String c;

    public m7f(ClipVideoFile clipVideoFile, String str, String str2) {
        this.a = clipVideoFile;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7f)) {
            return false;
        }
        m7f m7fVar = (m7f) obj;
        return epx.f(this.a, m7fVar.a) && epx.f(this.b, m7fVar.b) && epx.f(this.c, m7fVar.c);
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsTemplateEditorFragmentInputData(clip=");
        sb.append(this.a);
        sb.append(", requestTemplateId=");
        sb.append(this.b);
        sb.append(", hashTag=");
        return ho8.a(sb, this.c, ')');
    }
}
