package com.google.android.play.core.splitcompat;

import android.app.Application;
import android.content.Context;
import defpackage.kst0;

/* loaded from: classes4.dex */
public class SplitCompatApplication extends Application {
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        kst0.d(this, false);
    }
}
