package xsna;

import androidx.media3.common.a;
import java.util.ArrayList;
import xsna.a1n0;

/* compiled from: DefaultHlsExtractorFactory.java */
/* loaded from: classes12.dex */
public final class rfl implements e9v {
    public static final int[] c = {8, 13, 11, 2, 0, 1, 7};
    public a1n0.a a = new anl();
    public boolean b;

    public static void a(int i, ArrayList arrayList) {
        if (ipx.v(i, 0, 7, c) == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    public final rfl b(boolean z) {
        this.b = z;
        return this;
    }

    public final androidx.media3.common.a c(androidx.media3.common.a aVar) {
        if (!this.b || !this.a.a(aVar)) {
            return aVar;
        }
        a.C0043a a = aVar.a();
        String str = aVar.k;
        a.m = io20.q("application/x-media3-cues");
        a.K = this.a.b(aVar);
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.n);
        sb.append(str != null ? " ".concat(str) : "");
        a.j = sb.toString();
        a.r = Long.MAX_VALUE;
        return new androidx.media3.common.a(a);
    }

    public final rfl d(anl anlVar) {
        this.a = anlVar;
        return this;
    }
}
