package com.yandex.go.vault.di;

import com.yandex.go.vault.flexsdk.descriptors.widget.VaultsPagerWidgetSection;
import defpackage.cjw0;
import defpackage.e331;
import defpackage.g0p;
import defpackage.g331;
import defpackage.h3y;
import defpackage.i4q0;
import defpackage.i5m;
import defpackage.kcz0;
import defpackage.kzo;
import defpackage.ljr;
import defpackage.m431;
import defpackage.n3w;
import defpackage.nqq;
import defpackage.nu;
import defpackage.q331;
import defpackage.qoi0;
import defpackage.s421;
import defpackage.sk21;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.v7p;
import defpackage.vlr;
import defpackage.wgr;
import defpackage.xvf0;
import defpackage.z231;
import defpackage.z6x0;
import defpackage.zm5;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class c implements v7p {
    public final sk21 a;
    public final z6x0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final n3w f;
    public final nqq g;
    public final xvf0 h;
    public final n3w i;

    public c(sk21 sk21Var, z6x0 z6x0Var, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, n3w n3wVar, nqq nqqVar, xvf0 xvf0Var4, n3w n3wVar2) {
        this.a = sk21Var;
        this.b = z6x0Var;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = n3wVar;
        this.g = nqqVar;
        this.h = xvf0Var4;
        this.i = n3wVar2;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [com.yandex.go.vault.di.b] */
    @Override // defpackage.yvf0
    public final Object get() {
        cjw0 cjw0Var = (cjw0) this.a.get();
        s421 s421Var = (s421) this.b.get();
        com.yandex.div.core.expression.variables.a aVar = (com.yandex.div.core.expression.variables.a) this.c.get();
        ljr ljrVar = (ljr) this.d.get();
        final wgr wgrVar = (wgr) this.e.get();
        q331 q331Var = (q331) this.f.a;
        h3y a = i5m.a(this.g);
        z231 z231Var = (z231) this.h.get();
        final tse tseVar = (tse) this.i.a;
        g331 g331Var = new g331(new kzo(ljrVar.a.a, new a(tseVar, a, q331Var), (b) new sls() { // from class: com.yandex.go.vault.di.b
            @Override // defpackage.sls
            public final Object invoke() {
                tje.N(tse.this, null, null, new VaultModule$Companion$provideSdkConfig$errorControllerFactory$2$1(wgrVar, null), 3);
                return zy11.a;
            }
        }, new VaultModule$Companion$provideSdkConfig$errorControllerFactory$3(0, z231Var, z231.class, "loadingError", "loadingError()V", 0)));
        zm5 zm5Var = new zm5(aVar, 8);
        String str = q331Var.a;
        Set set = (Set) cjw0Var.b;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((nu) it.next()).create());
        }
        kcz0 kcz0Var = (kcz0) cjw0Var.a;
        kcz0Var.getClass();
        KSerializer serializer = VaultsPagerWidgetSection.Companion.serializer();
        List singletonList = Collections.singletonList("vaults_pager");
        return new vlr("VaultMain", zm5Var, g331Var, new g0p(null, Collections.singletonList(new i4q0("vaults_pager", qoi0.a(VaultsPagerWidgetSection.class), serializer, (m431) kcz0Var.b, new e331(2, kcz0Var, str), singletonList)), arrayList, null, kotlin.collections.a.J0((Set) cjw0Var.c), null, null, null, 981), s421Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048514);
    }
}
