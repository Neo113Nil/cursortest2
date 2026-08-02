package xsna;

/* compiled from: LoadMoreDetector.kt */
/* loaded from: classes2.dex */
public final class upz extends vc80 {
    public final n7w f;
    public long g;
    public final int h;

    public upz(int i, n7w n7wVar) {
        this.f = n7wVar;
        this.h = (int) Math.ceil(i * 0.6d);
    }

    @Override // xsna.vc80
    public final void l(int i, int i2, int i3) {
        if (i3 - i2 > this.h || System.currentTimeMillis() <= this.g + 100) {
            return;
        }
        this.f.invoke();
        this.g = System.currentTimeMillis();
    }
}
