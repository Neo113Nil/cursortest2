package xsna;

import android.annotation.SuppressLint;

/* compiled from: ItemTipPresenter.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class fvx implements dvx {
    public evx b;
    public gzs<s3q0> c;
    public final pxo0 d = new pxo0(1000);

    @Override // xsna.bux
    public final gzs<s3q0> H1() {
        return null;
    }

    @Override // xsna.bux
    public final gzs<s3q0> J0() {
        return this.c;
    }

    @Override // xsna.dvx
    public final void f6(Integer num, Integer num2, Integer num3, gzs gzsVar) {
        if (num != null) {
            evx evxVar = this.b;
            if (evxVar == null) {
                evxVar = null;
            }
            evxVar.setImage(num.intValue());
        }
        if (num2 != null) {
            evx evxVar2 = this.b;
            if (evxVar2 == null) {
                evxVar2 = null;
            }
            evxVar2.setHintText(num2.intValue());
        }
        evx evxVar3 = this.b;
        if (evxVar3 == null) {
            evxVar3 = null;
        }
        evxVar3.setHintVisibility(num2 != null);
        if (num3 != null) {
            evx evxVar4 = this.b;
            if (evxVar4 == null) {
                evxVar4 = null;
            }
            evxVar4.setActionText(num3.intValue());
        }
        evx evxVar5 = this.b;
        (evxVar5 != null ? evxVar5 : null).setActionVisibility(num3 != null);
        this.c = gzsVar;
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
        return this.d;
    }
}
