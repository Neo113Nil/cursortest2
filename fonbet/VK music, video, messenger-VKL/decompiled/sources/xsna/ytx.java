package xsna;

import android.annotation.SuppressLint;

/* compiled from: ItemAddButtonPresenter.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class ytx implements wtx {
    public ztx b;
    public gzs<s3q0> c;
    public gzs<s3q0> d;
    public final pxo0 e = new pxo0(1000);

    @Override // xsna.bux
    public final gzs<s3q0> H1() {
        return this.c;
    }

    @Override // xsna.bux
    public final gzs<s3q0> J0() {
        return this.d;
    }

    @Override // xsna.wtx
    public final void b4(int i, gzs gzsVar, gzs gzsVar2, boolean z) {
        ztx ztxVar = this.b;
        if (ztxVar == null) {
            ztxVar = null;
        }
        ztxVar.setTitle(i);
        ztx ztxVar2 = this.b;
        (ztxVar2 != null ? ztxVar2 : null).setDisabled(z);
        this.c = gzsVar;
        this.d = gzsVar2;
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onPause() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onResume() {
        throw null;
    }

    @Override // xsna.bux
    public final pxo0 q3() {
        return this.e;
    }
}
