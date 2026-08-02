package com.ybsdk.screens.upgrade.presentation.edit;

import com.ybsdk.rconfig.YbCommonUrlsImpl;
import defpackage.h791;
import defpackage.j3h;
import defpackage.np41;
import defpackage.tls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class UpgradeEditFragment$render$2$3$1 extends FunctionReferenceImpl implements tls {
    public UpgradeEditFragment$render$2$3$1(uc5 uc5Var) {
        super(1, uc5Var, b.class, "onUrlClicked", "onUrlClicked(Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = (String) obj;
        b bVar = (b) this.receiver;
        j3h j3hVar = bVar.H;
        np41 np41Var = bVar.F;
        com.ybsdk.rconfig.b bVar2 = bVar.E;
        bVar2.getClass();
        com.ybsdk.rconfig.a aVar = bVar2.i;
        YbCommonUrlsImpl ybCommonUrlsImpl = (YbCommonUrlsImpl) bVar2.d(aVar.e).getData();
        YbCommonUrlsImpl ybCommonUrlsImpl2 = (YbCommonUrlsImpl) aVar.e.c.getData();
        String taxServiceUrl = ybCommonUrlsImpl.getTaxServiceUrl();
        if (taxServiceUrl.length() == 0) {
            taxServiceUrl = ybCommonUrlsImpl2.getTaxServiceUrl();
        }
        h791.f(j3hVar, str, com.ybsdk.feature.webview.api.a.c(np41Var, str, taxServiceUrl));
        return zy11.a;
    }
}
