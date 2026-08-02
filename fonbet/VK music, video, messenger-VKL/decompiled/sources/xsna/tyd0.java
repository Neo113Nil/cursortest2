package xsna;

import xsna.lyd0;

/* compiled from: ProfileOnBoardingAnalytics.kt */
/* loaded from: classes5.dex */
public final class tyd0 implements v180 {
    public final lyd0.a b;

    public tyd0(lyd0.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.v180
    public final void a(int i) {
        this.b.b(i);
    }

    @Override // xsna.v180
    public final void d(int i, boolean z) {
        lyd0.a aVar = this.b;
        if (z) {
            aVar.c(i);
        } else {
            aVar.a();
        }
    }

    @Override // xsna.v180
    public final void c() {
    }
}
