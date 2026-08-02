package com.yandex.passport.internal.ui.account_upgrade;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.api.o3;
import com.yandex.passport.api.r;
import com.yandex.passport.internal.util.p;
import defpackage.d6z;
import defpackage.s8o;
import defpackage.x40;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class j extends x40 {
    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        o3 o3Var = (o3) obj;
        AccountUpgraderActivity.Companion.getClass();
        Intent B = d6z.B(context, AccountUpgraderActivity.class, s8o.d(new Pair[0]));
        B.putExtras(new Bundle[]{new UpgraderExtras(p.B(o3Var.a), o3Var.b).toBundle()}[0]);
        return B;
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        return r.d(i, intent);
    }
}
