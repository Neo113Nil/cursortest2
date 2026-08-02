package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.item.clips_grid_block.presentation.ClipsGridBlockAction;
import java.util.List;

/* compiled from: ClipsGridBlockAction.kt */
/* loaded from: classes17.dex */
public final class lae implements ClipsGridBlockAction {
    public final String b;
    public final List<SdkClipVideoFile> c;
    public final String d;
    public final String e;

    /* JADX WARN: Multi-variable type inference failed */
    public lae(String str, List<? extends SdkClipVideoFile> list, String str2, String str3) {
        this.b = str;
        this.c = list;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lae)) {
            return false;
        }
        lae laeVar = (lae) obj;
        return epx.f(this.b, laeVar.b) && epx.f(this.c, laeVar.c) && epx.f(this.d, laeVar.d) && epx.f(this.e, laeVar.e);
    }

    public final int hashCode() {
        int a = fw3.a(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bind(id=");
        sb.append(this.b);
        sb.append(", items=");
        sb.append(this.c);
        sb.append(", trackCode=");
        sb.append(this.d);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.e, ')');
    }
}
