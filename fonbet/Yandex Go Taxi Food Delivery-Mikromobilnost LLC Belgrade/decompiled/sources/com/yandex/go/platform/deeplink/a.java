package com.yandex.go.platform.deeplink;

import android.net.Uri;
import androidx.lifecycle.o;
import com.yandex.go.platform.web_api.data.Payload$Deeplink;
import com.yandex.go.platform.web_api.data.c;
import defpackage.c1h;
import defpackage.frw;
import defpackage.ike;
import defpackage.k791;
import defpackage.o400;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.u691;
import defpackage.uyj;
import defpackage.v3h;
import defpackage.w3h;
import defpackage.w511;
import defpackage.x3h;

/* loaded from: classes13.dex */
public final class a {
    public final tse a;
    public final c1h b;
    public final sls c;
    public final frw d;
    public final sls e;
    public final sls f;
    public pzt0 g;

    public a(ike ikeVar, o oVar, c1h c1hVar, sls slsVar, frw frwVar, sls slsVar2, sls slsVar3) {
        this.a = oVar;
        this.b = c1hVar;
        this.c = slsVar;
        this.d = frwVar;
        this.e = slsVar2;
        this.f = slsVar3;
        if (u691.a != null) {
            return;
        }
        sjh sjhVar = uyj.a;
        u691.a = tje.N(ikeVar, o400.a.x, null, new DeeplinkHandler$ensureDeeplinkEventsObserved$1(this, null), 2);
    }

    public final boolean a(Uri uri, boolean z) {
        x3h x3hVar = (x3h) this.c.invoke();
        boolean G = kotlin.collections.a.G(x3hVar.a, uri.getScheme());
        v3h v3hVar = v3h.b;
        k791 w3hVar = !G ? v3hVar : new w3h(uri);
        x3hVar.b.a(true, uri.toString(), w3hVar);
        c1h c1hVar = this.b;
        if (!z) {
            c1hVar.a(false, uri.toString(), w3hVar);
        }
        if (w3hVar.equals(v3hVar)) {
            return false;
        }
        if (!(w3hVar instanceof w3h)) {
            w511.b();
            return false;
        }
        if (z) {
            c1hVar.a(false, uri.toString(), w3hVar);
        }
        b(new Payload$Deeplink(((w3h) w3hVar).b.toString(), false));
        return true;
    }

    public final void b(c cVar) {
        pzt0 pzt0Var = this.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.g = tje.N(this.a, null, null, new DeeplinkHandler$sendPayloadToFront$1(this, cVar, null), 3);
    }
}
