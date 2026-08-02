package xsna;

/* compiled from: LoadMoreCommentsDetector.kt */
/* loaded from: classes16.dex */
public final class tpz extends vc80 {
    public final wdg f;
    public final com.vk.movika.sdk.base.logic.processor.actions.h g;
    public long h;

    public tpz(wdg wdgVar, com.vk.movika.sdk.base.logic.processor.actions.h hVar) {
        this.f = wdgVar;
        this.g = hVar;
    }

    @Override // xsna.vc80
    public final void l(int i, int i2, int i3) {
        if (i2 < i3 - 11 || System.currentTimeMillis() <= this.h + 500 || !(j5g.i0(this.f.h) instanceof itz)) {
            return;
        }
        this.g.invoke();
        this.h = System.currentTimeMillis();
    }
}
