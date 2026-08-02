package com.yandex.passport.internal.ui.authsdk;

/* loaded from: classes2.dex */
public final class i implements h {
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i) {
        this.a = i;
    }

    @Override // com.yandex.passport.internal.ui.authsdk.h
    public final void a(TurboAppFragment turboAppFragment) {
        switch (this.a) {
            case 0:
                turboAppFragment.onCanceled();
                break;
            default:
                turboAppFragment.onDeclined();
                break;
        }
    }
}
