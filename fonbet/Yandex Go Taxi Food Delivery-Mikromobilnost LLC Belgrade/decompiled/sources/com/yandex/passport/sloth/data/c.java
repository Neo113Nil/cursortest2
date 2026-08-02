package com.yandex.passport.sloth.data;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import defpackage.ny61;
import defpackage.vng;

/* loaded from: classes2.dex */
public final class c {
    public static SlothParams a(Bundle bundle) {
        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vng.u(bundle, SlothParams.class, SlothParams.KEY_SLOTH_PARAMS) : bundle.getParcelable(SlothParams.KEY_SLOTH_PARAMS);
        if (parcelable != null) {
            return (SlothParams) parcelable;
        }
        ny61.r("can't get required parcelable SlothParams");
        return null;
    }
}
