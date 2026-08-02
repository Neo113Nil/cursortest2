package defpackage;

import androidx.media3.common.a;

/* loaded from: classes10.dex */
public final class mmh implements Comparable {
    public final boolean a;
    public final boolean b;

    public mmh(int i, a aVar) {
        this.a = (aVar.e & 1) != 0;
        this.b = iyi0.e(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        mmh mmhVar = (mmh) obj;
        return jvc.a.c(this.b, mmhVar.b).c(this.a, mmhVar.a).e();
    }
}
