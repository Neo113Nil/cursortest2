package com.yandex.passport.sloth.ui;

import android.app.Activity;
import android.content.Context;
import defpackage.ny61;

/* loaded from: classes2.dex */
public final class h {
    public final l a;
    public final com.yandex.passport.sloth.ui.string.a b;
    public final com.yandex.passport.sloth.ui.dependencies.d c;
    public final Activity d;

    public h(Context context, l lVar, com.yandex.passport.sloth.ui.string.a aVar, com.yandex.passport.sloth.ui.dependencies.d dVar) {
        this.a = lVar;
        this.b = aVar;
        this.c = dVar;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            this.d = activity;
        } else {
            ny61.r("Trying to use Sloth without Activity UI");
            throw null;
        }
    }
}
