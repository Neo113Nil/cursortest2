package xsna;

import xsna.wyx;

/* compiled from: BgServiceDetector.kt */
/* loaded from: classes.dex */
public final class my6 {
    public final mal a;

    /* compiled from: BgServiceDetector.kt */
    public final class a implements wyx.a {
        public a() {
        }

        @Override // xsna.wyx.a
        public final void a(boolean z) {
            my6.this.a.invoke(Boolean.valueOf(z));
        }
    }

    public my6(mal malVar) {
        this.a = malVar;
        a aVar = new a();
        wyx wyxVar = wyx.a;
        wyx.d.add(aVar);
    }
}
