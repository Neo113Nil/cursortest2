package xsna;

import one.video.calls.sdk_private.aF;

/* compiled from: EarlyDataStream.java */
/* loaded from: classes8.dex */
public final class pjy0 extends zjy0 {
    public boolean k;
    public volatile boolean l;
    public volatile boolean m;

    /* compiled from: EarlyDataStream.java */
    public class a extends rky0 {
        public a(vjy0 vjy0Var) {
            super(pjy0.this, vjy0Var, pjy0.this.e);
        }

        @Override // xsna.rky0
        public final aF s() {
            return pjy0.this.k ? aF.b : aF.d;
        }

        @Override // xsna.rky0
        public final void t() {
            pjy0.this.m = true;
            if (pjy0.this.l) {
                n();
            }
        }
    }

    @Override // xsna.zjy0
    public final rky0 b(vjy0 vjy0Var) {
        return new a(vjy0Var);
    }
}
