package com.yandex.passport.internal.analytics;

import android.util.Log;
import androidx.lifecycle.Lifecycle;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.domik.RegTrack;
import defpackage.oey;
import defpackage.w53;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class b0 implements oey {
    public final a0 A;
    public final t a;
    public boolean b;
    public RegTrack.RegOrigin c;
    public String w;
    public DomikStatefulReporter$Screen x;
    public String y;
    public boolean z;

    public b0(t tVar) {
        this.a = tVar;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen = DomikStatefulReporter$Screen.NONE;
        this.A = new a0(0, this);
        this.x = domikStatefulReporter$Screen;
        this.b = false;
        this.c = null;
        this.w = UUID.randomUUID().toString();
    }

    public final HashMap a(Map map) {
        HashMap hashMap = new HashMap(map);
        hashMap.put("session_hash", this.w);
        hashMap.put("from", this.b ? "sdk" : "app");
        hashMap.put("conditions_met", "true");
        if (this.z) {
            hashMap.put("prefer_phonish_auth", "true");
        }
        RegTrack.RegOrigin regOrigin = this.c;
        if (regOrigin != null) {
            hashMap.put("reg_origin", regOrigin.toString().toLowerCase(Locale.ROOT));
        }
        hashMap.put("source", this.y);
        return hashMap;
    }

    public final void b(EventError eventError) {
        w53 w53Var = new w53();
        w53Var.put("error_code", eventError.getErrorCode());
        w53Var.put(Constants.KEY_MESSAGE, eventError.getException().getMessage());
        if (!(eventError.getException() instanceof IOException)) {
            w53Var.put("error", Log.getStackTraceString(eventError.getException()));
        }
        this.a.a(l.n, w53Var);
    }

    public final void c(DomikStatefulReporter$Screen domikStatefulReporter$Screen, DomikStatefulReporter$Event domikStatefulReporter$Event) {
        d(domikStatefulReporter$Screen, domikStatefulReporter$Event, kotlin.collections.b.f());
    }

    public final void d(DomikStatefulReporter$Screen domikStatefulReporter$Screen, DomikStatefulReporter$Event domikStatefulReporter$Event, Map map) {
        this.a.b(String.format(Locale.US, "domik.reportWebAmEvent%s.%s", Arrays.copyOf(new Object[]{domikStatefulReporter$Screen.getScreenId(), domikStatefulReporter$Event.getEventId()}, 2)), a(map));
    }

    public final void f() {
        d(this.x, DomikStatefulReporter$Event.NEXT_PRESSED, kotlin.collections.b.f());
    }

    public final void g(z zVar) {
        HashMap hashMap = new HashMap();
        if (zVar != null) {
            hashMap.put(Constants.KEY_MESSAGE, zVar.toString());
        }
        d(this.x, DomikStatefulReporter$Event.SCREEN_SUCCESS, hashMap);
    }

    @androidx.lifecycle.w(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        this.a.b.add(this.A);
    }

    @androidx.lifecycle.w(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.a.b.remove(this.A);
    }
}
