package xsna;

import xsna.jkp0;

/* compiled from: ProgressSender.kt */
/* loaded from: classes3.dex */
public class k3e0 {
    public final jkp0.a a;
    public int b = Integer.MIN_VALUE;
    public long c = Long.MIN_VALUE;

    public k3e0(jkp0.a aVar) {
        this.a = aVar;
    }

    public final void a(int i, long j) {
        int i2;
        long j2 = this.c;
        if (j == j2 && i == this.b) {
            return;
        }
        if (j != j2) {
            this.c = j;
            i2 = (int) j;
        } else {
            i2 = Integer.MIN_VALUE;
        }
        if (i != this.b) {
            this.b = i;
        } else {
            i = Integer.MIN_VALUE;
        }
        jkp0.a aVar = this.a;
        if (i2 != Integer.MIN_VALUE) {
            aVar.b(i2);
        }
        if (i != Integer.MIN_VALUE) {
            aVar.a(i);
        }
    }
}
