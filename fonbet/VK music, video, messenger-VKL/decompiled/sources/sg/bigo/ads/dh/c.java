package sg.bigo.ads.dh;

import androidx.annotation.NonNull;
import xsna.h5s;

/* loaded from: classes9.dex */
public final class c extends n implements Comparable<c> {
    public final int a;

    public c(@NonNull String str, int i) {
        super(str);
        this.a = i;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@NonNull c cVar) {
        return this.a - cVar.a;
    }

    @Override // sg.bigo.ads.dh.n
    public final String toString() {
        StringBuilder sb = new StringBuilder("{\"Content\":\"");
        sb.append(this.b);
        sb.append("\",\"pro_ms\":\"");
        return h5s.c(this.a, "\"}", sb);
    }
}
