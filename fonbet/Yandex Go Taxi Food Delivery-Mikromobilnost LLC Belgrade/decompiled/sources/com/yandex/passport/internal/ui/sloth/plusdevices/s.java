package com.yandex.passport.internal.ui.sloth.plusdevices;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.d6z;
import defpackage.x40;

/* loaded from: classes2.dex */
public final class s extends x40 {
    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        Bundle[] bundleArr = {((SlothParams) obj).toBundle()};
        Bundle bundle = new Bundle();
        bundle.putAll(bundleArr[0]);
        return d6z.B(context, ManagingPlusDevicesSlothActivity.class, bundle);
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        return Integer.valueOf(i);
    }
}
