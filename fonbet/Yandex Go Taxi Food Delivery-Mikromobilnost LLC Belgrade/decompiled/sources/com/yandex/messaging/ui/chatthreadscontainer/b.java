package com.yandex.messaging.ui.chatthreadscontainer;

import android.view.View;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.o430;
import defpackage.tls;
import defpackage.wls;
import defpackage.wwg;
import defpackage.z9b;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final class b implements wls {
    public final /* synthetic */ ChatThreadsContainerFragment a;
    public final /* synthetic */ View b;

    public b(ChatThreadsContainerFragment chatThreadsContainerFragment, View view) {
        this.a = chatThreadsContainerFragment;
        this.b = view;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        fid fidVar = (fid) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        bts btsVar2 = (bts) fidVar;
        btsVar2.e0(569586919);
        ChatThreadsContainerFragment chatThreadsContainerFragment = this.a;
        boolean e = btsVar2.e(chatThreadsContainerFragment);
        Object Q = btsVar2.Q();
        o430 o430Var = did.a;
        if (e || Q == o430Var) {
            Q = new ChatThreadsContainerFragment$setupTabsBar$1$1$1$1(chatThreadsContainerFragment, null);
            btsVar2.o0(Q);
        }
        tls tlsVar = (tls) Q;
        int i = 0;
        btsVar2.t(false);
        btsVar2.e0(569589576);
        boolean e2 = btsVar2.e(chatThreadsContainerFragment);
        Object Q2 = btsVar2.Q();
        if (e2 || Q2 == o430Var) {
            Q2 = new ChatThreadsContainerFragment$setupTabsBar$1$1$2$1(chatThreadsContainerFragment, null);
            btsVar2.o0(Q2);
        }
        btsVar2.t(false);
        com.yandex.messaging.ui.di.a.a(tlsVar, (tls) Q2, wwg.S(1158824530, true, new z9b(i, chatThreadsContainerFragment, this.b), btsVar2), btsVar2, 384);
        return zy11.a;
    }
}
