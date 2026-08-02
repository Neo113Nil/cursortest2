package com.yandex.passport.internal.ui.bouncer.fallback;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.yandex.passport.internal.ui.bouncer.model.w1;
import com.yandex.passport.internal.ui.domik.DomikActivity;
import defpackage.x40;

/* loaded from: classes2.dex */
public final class b extends x40 {
    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        w1 w1Var = (w1) obj;
        return DomikActivity.createIntent(context, w1Var.a, w1Var.c, w1Var.w, w1Var.x, w1Var.y, w1Var.z);
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
