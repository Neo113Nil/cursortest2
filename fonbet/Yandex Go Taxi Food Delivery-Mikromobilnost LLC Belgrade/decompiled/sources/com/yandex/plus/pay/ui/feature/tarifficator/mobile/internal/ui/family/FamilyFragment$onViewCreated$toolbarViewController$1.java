package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family;

import defpackage.PayUIEvgenAnalytics$FamilyInviteCloseSource;
import defpackage.ind0;
import defpackage.obp;
import defpackage.sls;
import defpackage.wap;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class FamilyFragment$onViewCreated$toolbarViewController$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = (b) this.receiver;
        wap wapVar = bVar.z;
        if (wapVar != null) {
            ind0 a = bVar.b.a.a();
            obp obpVar = bVar.x;
            obpVar.b.b(a.a.toString(), wapVar.a, wapVar.c, PayUIEvgenAnalytics$FamilyInviteCloseSource.CloseButton);
        }
        bVar.W();
        return zy11.a;
    }
}
