package com.yandex.passport.internal.ui.authsdk;

import android.os.Parcelable;
import com.yandex.passport.internal.ModernAccount;

/* loaded from: classes2.dex */
public final class k implements h {
    public final /* synthetic */ int a;
    public final Parcelable b;

    public /* synthetic */ k(Parcelable parcelable, int i) {
        this.a = i;
        this.b = parcelable;
    }

    @Override // com.yandex.passport.internal.ui.authsdk.h
    public final void a(TurboAppFragment turboAppFragment) {
        int i = this.a;
        Parcelable parcelable = this.b;
        switch (i) {
            case 0:
                turboAppFragment.showProgress((ModernAccount) parcelable);
                break;
            default:
                turboAppFragment.onResultReceived((AuthSdkResultContainer) parcelable);
                break;
        }
    }
}
