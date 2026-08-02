package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts;

import defpackage.PayUIEvgenAnalytics$CollectingContactsCloseSource;
import defpackage.ind0;
import defpackage.lde;
import defpackage.nce;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class ContactsFragment$onViewCreated$toolbarController$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        a aVar = (a) this.receiver;
        nce nceVar = aVar.y;
        if (nceVar != null) {
            ind0 a = aVar.b.a.a();
            lde ldeVar = aVar.x;
            ldeVar.a.a(a.a.toString(), nceVar.a, nceVar.b, PayUIEvgenAnalytics$CollectingContactsCloseSource.CloseButton);
        }
        aVar.W();
        return zy11.a;
    }
}
