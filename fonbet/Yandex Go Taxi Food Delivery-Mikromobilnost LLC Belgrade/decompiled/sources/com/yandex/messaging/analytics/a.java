package com.yandex.messaging.analytics;

import android.content.Context;
import android.view.View;
import defpackage.dzz0;
import defpackage.ma30;
import defpackage.x22;

/* loaded from: classes15.dex */
public final class a implements dzz0 {
    public final Context a;
    public final x22 b;

    public a(Context context, x22 x22Var) {
        this.a = context;
        this.b = x22Var;
    }

    public final ma30 a(View view) {
        return new TouchHelper(view, this);
    }
}
