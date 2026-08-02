package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: SimilarVideoItem.kt */
/* loaded from: classes18.dex */
public final class joj0 implements hfz {
    public final VideoFile b;
    public final String c;
    public final String d;

    public joj0(VideoFile videoFile, String str, String str2) {
        this.b = videoFile;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof joj0)) {
            return false;
        }
        joj0 joj0Var = (joj0) obj;
        return epx.f(this.b, joj0Var.b) && epx.f(this.c, joj0Var.c) && epx.f(this.d, joj0Var.d);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.o0());
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimilarVideoItem(videoFile=");
        sb.append(this.b);
        sb.append(", videoReferrer=");
        sb.append(this.c);
        sb.append(", videoContext=");
        return ho8.a(sb, this.d, ')');
    }
}
