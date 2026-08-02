package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.b;
import defpackage.a1d;
import defpackage.e0d;
import defpackage.g0d;
import defpackage.hcr;
import defpackage.ig4;
import defpackage.j0d;
import defpackage.jgg0;
import defpackage.jx81;
import defpackage.p56;
import defpackage.seu;
import defpackage.teu;
import defpackage.vwi;
import defpackage.yhl;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static hcr lambda$getComponents$0(a1d a1dVar) {
        return new a((com.google.firebase.a) a1dVar.a(com.google.firebase.a.class), a1dVar.d(teu.class), (ExecutorService) a1dVar.c(new jgg0(ig4.class, ExecutorService.class)), new b((Executor) a1dVar.c(new jgg0(p56.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<j0d> getComponents() {
        g0d b = j0d.b(hcr.class);
        b.c = LIBRARY_NAME;
        b.a(vwi.b(com.google.firebase.a.class));
        int i = 0;
        b.a(new vwi(0, 1, teu.class));
        b.a(new vwi(new jgg0(ig4.class, ExecutorService.class), 1, 0));
        b.a(new vwi(new jgg0(p56.class, Executor.class), 1, 0));
        b.g = new yhl(25);
        j0d c = b.c();
        seu seuVar = new seu(i);
        g0d b2 = j0d.b(seu.class);
        b2.b = 1;
        b2.g = new e0d(i, seuVar);
        return Arrays.asList(c, b2.c(), jx81.j(LIBRARY_NAME, "19.0.1"));
    }
}
