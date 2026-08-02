package com.yandex.go.cartech.navigation;

import android.content.Intent;
import android.net.Uri;
import defpackage.m5u;
import defpackage.n5u;
import defpackage.tje;
import defpackage.tse;
import defpackage.vje;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class a implements vje {
    public final /* synthetic */ b a;
    public final /* synthetic */ tse b;

    public a(b bVar, tse tseVar) {
        this.a = bVar;
        this.b = tseVar;
    }

    @Override // defpackage.vje
    public final Object a(Intent intent, Continuation continuation) {
        Uri data = intent.getData();
        b bVar = this.a;
        bVar.getClass();
        if (data == null || !"cartech".equalsIgnoreCase(data.getAuthority())) {
            return n5u.a;
        }
        String queryParameter = data.getQueryParameter("deeplink_url");
        if (queryParameter != null) {
            tje.N(this.b, null, null, new CartechModalViewRouter$handleDeeplink$1$1(bVar, queryParameter, null), 3);
        }
        return new m5u(false, false);
    }
}
