package sg.bigo.ads.dh;

import androidx.annotation.NonNull;
import xsna.shy;

/* loaded from: classes9.dex */
public final class l extends n implements Comparable<l> {
    public final float a;

    public l(@NonNull String str, float f) {
        super(str);
        this.a = f;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(@NonNull l lVar) {
        return Double.compare(this.a, lVar.a);
    }

    @Override // sg.bigo.ads.dh.n
    public final String toString() {
        StringBuilder sb = new StringBuilder("{\"Content\":\"");
        sb.append(this.b);
        sb.append("\",\"progress\":\"");
        return shy.c(this.a, "\"}", sb);
    }
}
