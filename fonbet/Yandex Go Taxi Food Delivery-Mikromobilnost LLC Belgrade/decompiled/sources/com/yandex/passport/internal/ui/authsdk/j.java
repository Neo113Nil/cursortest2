package com.yandex.passport.internal.ui.authsdk;

import android.os.Parcelable;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.network.response.ExternalApplicationPermissionsResult;
import com.yandex.passport.internal.ui.EventError;

/* loaded from: classes2.dex */
public final class j implements h {
    public final /* synthetic */ int a;
    public final ModernAccount b;
    public final Parcelable c;

    public /* synthetic */ j(Parcelable parcelable, ModernAccount modernAccount, int i) {
        this.a = i;
        this.c = parcelable;
        this.b = modernAccount;
    }

    @Override // com.yandex.passport.internal.ui.authsdk.h
    public final void a(TurboAppFragment turboAppFragment) {
        int i = this.a;
        ModernAccount modernAccount = this.b;
        Parcelable parcelable = this.c;
        switch (i) {
            case 0:
                turboAppFragment.showContent((ExternalApplicationPermissionsResult) parcelable, modernAccount);
                break;
            default:
                turboAppFragment.onErrorCode((EventError) parcelable, modernAccount);
                break;
        }
    }
}
