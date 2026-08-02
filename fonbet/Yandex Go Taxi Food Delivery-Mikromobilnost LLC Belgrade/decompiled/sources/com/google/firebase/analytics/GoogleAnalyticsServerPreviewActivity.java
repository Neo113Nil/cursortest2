package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.e;
import defpackage.ji91;

/* loaded from: classes11.dex */
public class GoogleAnalyticsServerPreviewActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e c = e.c(this, null);
        Intent intent = getIntent();
        c.getClass();
        c.a(new ji91(c, intent, 2));
        finish();
    }
}
