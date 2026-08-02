package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.a1d;
import defpackage.c011;
import defpackage.g0d;
import defpackage.gch;
import defpackage.gnh;
import defpackage.hcr;
import defpackage.i211;
import defpackage.icr;
import defpackage.j0d;
import defpackage.jgg0;
import defpackage.jx81;
import defpackage.ny61;
import defpackage.ueu;
import defpackage.vwi;
import defpackage.vzu0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(jgg0 jgg0Var, a1d a1dVar) {
        com.google.firebase.a aVar = (com.google.firebase.a) a1dVar.a(com.google.firebase.a.class);
        if (a1dVar.a(icr.class) == null) {
            return new FirebaseMessaging(aVar, a1dVar.d(gnh.class), a1dVar.d(ueu.class), (hcr) a1dVar.a(hcr.class), a1dVar.f(jgg0Var), (vzu0) a1dVar.a(vzu0.class));
        }
        ny61.u();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<j0d> getComponents() {
        jgg0 jgg0Var = new jgg0(c011.class, i211.class);
        g0d b = j0d.b(FirebaseMessaging.class);
        b.c = LIBRARY_NAME;
        b.a(vwi.b(com.google.firebase.a.class));
        b.a(new vwi(0, 0, icr.class));
        b.a(new vwi(0, 1, gnh.class));
        b.a(new vwi(0, 1, ueu.class));
        b.a(vwi.b(hcr.class));
        b.a(new vwi(jgg0Var, 0, 1));
        b.a(vwi.b(vzu0.class));
        b.g = new gch(jgg0Var, 1);
        b.e(1);
        return Arrays.asList(b.c(), jx81.j(LIBRARY_NAME, "25.0.1"));
    }
}
