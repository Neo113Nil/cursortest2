package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.api.SessionSubscriber$Name;
import com.google.firebase.sessions.api.a;
import defpackage.c32;
import defpackage.g0d;
import defpackage.hcr;
import defpackage.ig4;
import defpackage.j0d;
import defpackage.jfy;
import defpackage.jgg0;
import defpackage.jx81;
import defpackage.ncr;
import defpackage.p56;
import defpackage.s59;
import defpackage.vcr;
import defpackage.vwi;
import defpackage.y2f;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int d = 0;
    public final jgg0 a = new jgg0(ig4.class, ExecutorService.class);
    public final jgg0 b = new jgg0(p56.class, ExecutorService.class);
    public final jgg0 c = new jgg0(jfy.class, ExecutorService.class);

    static {
        SessionSubscriber$Name sessionSubscriber$Name = SessionSubscriber$Name.CRASHLYTICS;
        Map map = a.b;
        if (map.containsKey(sessionSubscriber$Name)) {
            sessionSubscriber$Name.toString();
        } else {
            map.put(sessionSubscriber$Name, new vcr(new kotlinx.coroutines.sync.a(true)));
            sessionSubscriber$Name.toString();
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        g0d b = j0d.b(FirebaseCrashlytics.class);
        b.c = "fire-cls";
        b.a(vwi.b(com.google.firebase.a.class));
        b.a(vwi.b(hcr.class));
        b.a(new vwi(this.a, 1, 0));
        b.a(new vwi(this.b, 1, 0));
        b.a(new vwi(this.c, 1, 0));
        b.a(new vwi(0, 2, y2f.class));
        b.a(new vwi(0, 2, c32.class));
        b.a(new vwi(0, 2, ncr.class));
        b.g = new s59(this);
        b.e(2);
        return Arrays.asList(b.c(), jx81.j("fire-cls", "20.0.3"));
    }
}
