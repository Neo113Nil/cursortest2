package com.yandex.passport.internal.impl;

import android.content.Context;
import android.content.Intent;
import com.yandex.passport.internal.sloth.credentialmanager.RequestCredentialManagerActivity;
import defpackage.x40;

/* loaded from: classes8.dex */
public final class v extends x40 {
    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        RequestCredentialManagerActivity.Companion.getClass();
        return com.yandex.passport.internal.sloth.credentialmanager.f.a(context);
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        if (i != -1) {
            return null;
        }
        com.yandex.passport.internal.sloth.credentialmanager.c o = com.yandex.passport.internal.properties.u.o(intent);
        if (o instanceof com.yandex.passport.internal.sloth.credentialmanager.a) {
            return (com.yandex.passport.internal.sloth.credentialmanager.a) o;
        }
        return null;
    }
}
