package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.a1d;
import defpackage.fse;
import defpackage.g0d;
import defpackage.gwi0;
import defpackage.h5m;
import defpackage.hcr;
import defpackage.hfo;
import defpackage.i211;
import defpackage.ig4;
import defpackage.j0d;
import defpackage.jgg0;
import defpackage.jse;
import defpackage.jx81;
import defpackage.k1g;
import defpackage.m3w;
import defpackage.ocr;
import defpackage.p56;
import defpackage.pcr;
import defpackage.qcr;
import defpackage.qzq0;
import defpackage.rcr;
import defpackage.scc;
import defpackage.tcr;
import defpackage.vwi;
import defpackage.wcr;
import defpackage.wvf0;
import defpackage.xcr;
import defpackage.yhl;
import defpackage.ypr0;
import defpackage.zvf0;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lj0d;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "wcr", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final wcr Companion = new wcr();
    private static final jgg0 appContext = jgg0.a(Context.class);
    private static final jgg0 firebaseApp = jgg0.a(com.google.firebase.a.class);
    private static final jgg0 firebaseInstallationsApi = jgg0.a(hcr.class);
    private static final jgg0 backgroundDispatcher = new jgg0(ig4.class, jse.class);
    private static final jgg0 blockingDispatcher = new jgg0(p56.class, jse.class);
    private static final jgg0 transportFactory = jgg0.a(i211.class);
    private static final jgg0 firebaseSessionsComponent = jgg0.a(ocr.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final a getComponents$lambda$0(a1d a1dVar) {
        return (a) ((k1g) ((ocr) a1dVar.c(firebaseSessionsComponent))).p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ocr getComponents$lambda$1(a1d a1dVar) {
        Context context = (Context) a1dVar.c(appContext);
        fse fseVar = (fse) a1dVar.c(backgroundDispatcher);
        fse fseVar2 = (fse) a1dVar.c(blockingDispatcher);
        com.google.firebase.a aVar = (com.google.firebase.a) a1dVar.c(firebaseApp);
        hcr hcrVar = (hcr) a1dVar.c(firebaseInstallationsApi);
        zvf0 f = a1dVar.f(transportFactory);
        k1g k1gVar = new k1g();
        k1gVar.a = m3w.a(aVar);
        m3w a = m3w.a(context);
        k1gVar.b = a;
        int i = 2;
        k1gVar.c = h5m.a(new hfo(a, i));
        k1gVar.d = h5m.a(rcr.a);
        k1gVar.e = m3w.a(hcrVar);
        int i2 = 1;
        k1gVar.f = h5m.a(new hfo(k1gVar.a, i2));
        m3w a2 = m3w.a(fseVar2);
        k1gVar.g = a2;
        k1gVar.h = h5m.a(new pcr(k1gVar.f, a2));
        k1gVar.i = m3w.a(fseVar);
        int i3 = 0;
        k1gVar.j = h5m.a(new qzq0(k1gVar.c, h5m.a(new gwi0(k1gVar.d, k1gVar.e, k1gVar.f, k1gVar.h, h5m.a(new qcr(k1gVar.i, k1gVar.d, h5m.a(new pcr(k1gVar.b, k1gVar.g, i3)))))), i2));
        wvf0 a3 = h5m.a(tcr.a);
        k1gVar.k = a3;
        k1gVar.l = h5m.a(new qzq0(k1gVar.d, a3, i3));
        k1gVar.m = h5m.a(new gwi0(k1gVar.a, k1gVar.e, k1gVar.j, h5m.a(new hfo(m3w.a(f), i3)), k1gVar.i));
        k1gVar.n = h5m.a(new qcr(k1gVar.b, k1gVar.g, h5m.a(new m3w(i2, k1gVar.l))));
        wvf0 a4 = h5m.a(new ypr0(k1gVar.j, k1gVar.l, k1gVar.m, k1gVar.d, k1gVar.n, h5m.a(new pcr(k1gVar.b, k1gVar.k, i2)), k1gVar.i));
        k1gVar.o = a4;
        k1gVar.p = h5m.a(new xcr(k1gVar.a, k1gVar.j, k1gVar.i, h5m.a(new m3w(i, a4))));
        return k1gVar;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<j0d> getComponents() {
        g0d b = j0d.b(a.class);
        b.c = LIBRARY_NAME;
        b.a(vwi.a(firebaseSessionsComponent));
        b.g = new yhl(28);
        b.e(2);
        j0d c = b.c();
        g0d b2 = j0d.b(ocr.class);
        b2.c = "fire-sessions-component";
        b2.a(vwi.a(appContext));
        b2.a(vwi.a(backgroundDispatcher));
        b2.a(vwi.a(blockingDispatcher));
        b2.a(vwi.a(firebaseApp));
        b2.a(vwi.a(firebaseInstallationsApi));
        b2.a(new vwi(transportFactory, 1, 1));
        b2.g = new yhl(29);
        return scc.g(c, b2.c(), jx81.j(LIBRARY_NAME, "3.0.3"));
    }
}
