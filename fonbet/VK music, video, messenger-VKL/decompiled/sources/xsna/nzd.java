package xsna;

import com.vk.dto.clips.external.ClipsDuetInfo;

/* compiled from: ClipsEditorProperties.kt */
/* loaded from: classes16.dex */
public final class nzd {
    public static final nzd d = new nzd(0);
    public final ClipsDuetInfo a;
    public final int b;
    public final String c;

    public nzd() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzd)) {
            return false;
        }
        nzd nzdVar = (nzd) obj;
        return epx.f(this.a, nzdVar.a) && this.b == nzdVar.b && epx.f(this.c, nzdVar.c);
    }

    public final int hashCode() {
        ClipsDuetInfo clipsDuetInfo = this.a;
        int a = shy.a(this.b, (clipsDuetInfo == null ? 0 : clipsDuetInfo.hashCode()) * 31, 31);
        String str = this.c;
        return a + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsEditorProperties(duetInfo=");
        sb.append(this.a);
        sb.append(", maxDurationMs=");
        sb.append(this.b);
        sb.append(", description=");
        return ho8.a(sb, this.c, ')');
    }

    public /* synthetic */ nzd(int i) {
        this(null, Integer.MAX_VALUE, null);
    }

    public nzd(ClipsDuetInfo clipsDuetInfo, int i, String str) {
        this.a = clipsDuetInfo;
        this.b = i;
        this.c = str;
    }
}
