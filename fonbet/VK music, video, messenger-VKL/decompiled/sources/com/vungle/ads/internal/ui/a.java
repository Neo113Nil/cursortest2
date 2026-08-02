package com.vungle.ads.internal.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vungle.ads.internal.y0;

/* loaded from: classes7.dex */
public final class a {
    public static final String a(Intent intent) {
        y0 y0Var = l.h;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return extras.getString("request_eventId");
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final String b(Intent intent) {
        y0 y0Var = l.h;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return extras.getString("request");
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(com.vungle.ads.internal.presenter.a aVar) {
        l.i = aVar;
    }

    public static void a(y0 y0Var) {
        l.h = y0Var;
    }

    public static Intent a(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) VungleActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        Bundle bundle = new Bundle();
        bundle.putString("request", str);
        bundle.putString("request_eventId", str2);
        intent.putExtras(bundle);
        return intent;
    }
}
