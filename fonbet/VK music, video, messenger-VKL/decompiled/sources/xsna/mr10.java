package xsna;

import android.net.Uri;

/* compiled from: MediaItemAudioData.kt */
/* loaded from: classes3.dex */
public final class mr10 {
    public final String a;
    public final Uri b;

    public mr10(String str, Uri uri) {
        this.a = str;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr10)) {
            return false;
        }
        mr10 mr10Var = (mr10) obj;
        return epx.f(this.a, mr10Var.a) && epx.f(this.b, mr10Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Uri uri = this.b;
        return hashCode + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaItemAudioData(mediaItemId=");
        sb.append(this.a);
        sb.append(", mediaItemLocalUri=");
        return alb0.b(sb, this.b, ')');
    }
}
