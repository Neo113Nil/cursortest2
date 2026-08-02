package com.vungle.ads.internal.util;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public abstract class a {
    public static void a(b bVar) {
        d.a(d.f, bVar);
    }

    public static void b(b bVar) {
        d.f.a(bVar);
    }

    public static void a(Context context) {
        d.a(d.f, context);
    }

    public static boolean a() {
        return d.a(d.f);
    }

    public static boolean a(Context context, Intent intent, Intent intent2, com.vungle.ads.internal.ui.m mVar) {
        d dVar = d.f;
        if (!d.a(dVar)) {
            dVar.d = new c(new WeakReference(context), intent, intent2, mVar);
            return false;
        }
        return d.a(dVar, context, intent, intent2, mVar);
    }
}
