package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import defpackage.bvf0;
import defpackage.fse;
import defpackage.tje;

/* loaded from: classes.dex */
public final class a {
    public final com.google.firebase.a a;
    public final com.google.firebase.sessions.settings.b b;

    public a(com.google.firebase.a aVar, com.google.firebase.sessions.settings.b bVar, fse fseVar, SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks) {
        this.a = aVar;
        this.b = bVar;
        aVar.a();
        Context applicationContext = aVar.a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(sessionsActivityLifecycleCallbacks);
            tje.N(bvf0.a(fseVar), null, null, new FirebaseSessions$1(this, sessionsActivityLifecycleCallbacks, null), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
