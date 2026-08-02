package com.yandex.passport.internal.ui.bouncer.challenge;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import defpackage.m50;
import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final class e implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((s) obj2).b.a(new r(((com.yandex.passport.common.url.b) obj).a));
                break;
            case 1:
                ((com.yandex.passport.internal.ui.challenge.logout.r) obj2).b.a(new com.yandex.passport.internal.ui.challenge.logout.q(((com.yandex.passport.common.url.b) obj).a));
                break;
            case 2:
                String str = ((com.yandex.passport.common.url.b) obj).a;
                com.yandex.passport.sloth.ui.h hVar = (com.yandex.passport.sloth.ui.h) obj2;
                hVar.getClass();
                try {
                    hVar.d.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    break;
                } catch (ActivityNotFoundException unused) {
                    break;
                }
            default:
                ((m50) obj2).b();
                break;
        }
        return zy11Var;
        return zy11Var;
    }
}
