package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.a1d;
import defpackage.c011;
import defpackage.d87;
import defpackage.g0d;
import defpackage.i211;
import defpackage.j0d;
import defpackage.jgg0;
import defpackage.jx81;
import defpackage.qay;
import defpackage.vwi;
import defpackage.w511;
import defpackage.z811;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i211 lambda$getComponents$0(a1d a1dVar) {
        z811.b((Context) a1dVar.a(Context.class));
        return z811.a().c(d87.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i211 lambda$getComponents$1(a1d a1dVar) {
        z811.b((Context) a1dVar.a(Context.class));
        return z811.a().c(d87.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i211 lambda$getComponents$2(a1d a1dVar) {
        z811.b((Context) a1dVar.a(Context.class));
        return z811.a().c(d87.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<j0d> getComponents() {
        g0d b = j0d.b(i211.class);
        b.c = LIBRARY_NAME;
        b.a(vwi.b(Context.class));
        b.g = new w511(0);
        j0d c = b.c();
        g0d a = j0d.a(new jgg0(qay.class, i211.class));
        a.a(vwi.b(Context.class));
        a.g = new w511(1);
        j0d c2 = a.c();
        g0d a2 = j0d.a(new jgg0(c011.class, i211.class));
        a2.a(vwi.b(Context.class));
        a2.g = new w511(2);
        return Arrays.asList(c, c2, a2.c(), jx81.j(LIBRARY_NAME, "19.0.0"));
    }
}
