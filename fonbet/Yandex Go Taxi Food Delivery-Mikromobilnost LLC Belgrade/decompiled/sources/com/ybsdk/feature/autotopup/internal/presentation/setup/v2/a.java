package com.ybsdk.feature.autotopup.internal.presentation.setup.v2;

import com.ybsdk.feature.deeplink.api.actions.AutoTopupApiVersion;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupSaveSettings;
import defpackage.ds31;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements tls {
    public final /* synthetic */ b a;

    public /* synthetic */ a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        AutoTopupApiVersion apiVersion = ((AutoTopupSaveSettings) obj).getApiVersion();
        b bVar = this.a;
        pzt0 pzt0Var = bVar.N;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        bVar.N = tje.N(ds31.a(bVar), null, null, new AutoTopupSetupV2ViewModel$saveSettings$1(bVar, null, apiVersion, null), 3);
        return zy11.a;
    }
}
