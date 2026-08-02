package com.yandex.passport.internal.ui.sloth.plusdevices;

import android.content.Context;
import android.content.Intent;
import com.yandex.passport.api.exception.PassportAccountNotAuthorizedException;
import com.yandex.passport.api.exception.PassportDeviceValidationException;
import com.yandex.passport.api.exception.PassportRuntimeUnknownException;
import com.yandex.passport.api.l1;
import com.yandex.passport.api.m1;
import com.yandex.passport.api.n1;
import defpackage.x40;

/* loaded from: classes8.dex */
public final class c extends x40 {
    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        Intent intent = new Intent(context, (Class<?>) ManagingPlusDevicesHelperActivity.class);
        intent.putExtras(com.yandex.passport.internal.a0.c0((l1) obj).toBundle());
        return intent;
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        return i != -1 ? i != 0 ? i != 401 ? i != 1111 ? new n1(new PassportRuntimeUnknownException("Unexpected error")) : new n1(new PassportDeviceValidationException()) : new n1(new PassportAccountNotAuthorizedException()) : m1.a : m1.b;
    }
}
