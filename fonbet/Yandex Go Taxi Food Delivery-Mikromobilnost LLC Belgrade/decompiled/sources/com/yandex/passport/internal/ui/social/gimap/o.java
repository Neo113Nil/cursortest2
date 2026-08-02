package com.yandex.passport.internal.ui.social.gimap;

import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.passport.common.core.Environment;
import defpackage.ny61;

/* loaded from: classes2.dex */
public final class o extends com.yandex.passport.internal.ui.base.h {
    public final Environment A;
    public final com.yandex.passport.internal.core.accounts.g B;
    public final com.yandex.passport.internal.ui.util.l C = new com.yandex.passport.internal.ui.util.l();
    public final com.yandex.passport.internal.ui.util.l D = new com.yandex.passport.internal.ui.util.l();
    public GimapTrack E;

    public o(GimapTrack gimapTrack, Environment environment, com.yandex.passport.internal.core.accounts.g gVar) {
        this.A = environment;
        this.B = gVar;
        this.E = gimapTrack;
    }

    @Override // com.yandex.passport.internal.ui.base.h
    public final void X(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable(GimapTrack.GIMAP_TRACK_EXTRAS);
            if (parcelable != null) {
                this.E = (GimapTrack) parcelable;
            } else {
                ny61.r("Required value was null.");
            }
        }
    }

    @Override // com.yandex.passport.internal.ui.base.h
    public final void Y(Bundle bundle) {
        bundle.putParcelable(GimapTrack.GIMAP_TRACK_EXTRAS, this.E);
    }
}
