package com.yandex.passport.internal.smsretriever;

import android.content.Context;
import android.content.Intent;
import com.yandex.passport.internal.storage.i;
import defpackage.kgx;
import defpackage.uo2;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class a {
    public static final Pattern c = Pattern.compile("(\\d+)");
    public final Context a;
    public final i b;

    public a(Context context, i iVar) {
        this.a = context;
        this.b = iVar;
    }

    public final void a(String str, SmsFromType smsFromType) {
        com.yandex.passport.legacy.a.a("Sms code received: " + str);
        i iVar = this.b;
        uo2 uo2Var = iVar.f;
        kgx[] kgxVarArr = i.m;
        uo2Var.setValue(iVar, kgxVarArr[4], str);
        iVar.g.setValue(iVar, kgxVarArr[5], smsFromType.getFrom());
        androidx.localbroadcastmanager.content.a.a(this.a).c(new Intent("com.yandex.passport.internal.SMS_CODE_RECEIVED"));
    }
}
