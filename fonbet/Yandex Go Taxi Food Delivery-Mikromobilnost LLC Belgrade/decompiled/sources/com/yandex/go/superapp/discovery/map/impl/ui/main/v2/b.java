package com.yandex.go.superapp.discovery.map.impl.ui.main.v2;

import defpackage.gh00;
import defpackage.zl00;

/* loaded from: classes14.dex */
public final class b implements Runnable {
    public final /* synthetic */ zl00 a;

    public b(zl00 zl00Var) {
        this.a = zl00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zl00 zl00Var = this.a;
        if (zl00Var.f) {
            if (((gh00) zl00Var.a).n()) {
                zl00Var.e.postDelayed(this, 16L);
            } else {
                zl00Var.f = false;
                ((SuperAppDiscoveryMapV2ModalView$longPressDetector$2) zl00Var.d).invoke();
            }
        }
    }
}
