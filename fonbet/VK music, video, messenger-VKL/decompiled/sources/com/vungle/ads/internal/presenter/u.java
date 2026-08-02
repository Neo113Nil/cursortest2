package com.vungle.ads.internal.presenter;

import com.vungle.ads.LinkError;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class u implements com.vungle.ads.internal.ui.m {
    public final /* synthetic */ String a;
    public final /* synthetic */ w b;

    public u(String str, w wVar) {
        this.a = str;
        this.b = wVar;
    }

    @Override // com.vungle.ads.internal.ui.m
    public final void a(boolean z) {
        if (!z) {
            Sdk.SDKError.Reason reason = Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED;
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Fail to open ");
            a.append(this.a);
            new LinkError(reason, a.toString()).setLogEntry$vungle_ads_release(this.b.a()).logErrorNoReturnValue$vungle_ads_release();
        }
        List b = this.b.c.b("deeplink.click", String.valueOf(z), null);
        if (b != null) {
            w wVar = this.b;
            Iterator it = b.iterator();
            while (it.hasNext()) {
                com.vungle.ads.internal.network.p pVar = new com.vungle.ads.internal.network.p((String) it.next());
                pVar.i = "deeplink.click";
                pVar.j = wVar.a();
                wVar.b().a(pVar.a(), false);
            }
        }
    }
}
