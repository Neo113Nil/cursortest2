package com.yandex.messaging.ui.chatthreadscontainer;

import android.view.View;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.rwi;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final class a implements wls {
    public final /* synthetic */ ChatThreadsContainerFragment a;
    public final /* synthetic */ rwi b;
    public final /* synthetic */ View c;

    public a(ChatThreadsContainerFragment chatThreadsContainerFragment, rwi rwiVar, View view) {
        this.a = chatThreadsContainerFragment;
        this.b = rwiVar;
        this.c = view;
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
        rwi rwiVar = this.b;
        View view = this.c;
        ChatThreadsContainerFragment chatThreadsContainerFragment = this.a;
        ChatThreadsContainerFragment.access$getRouter(chatThreadsContainerFragment, rwiVar, view);
        bts btsVar2 = (bts) fidVar;
        btsVar2.e0(-197814755);
        boolean e = btsVar2.e(chatThreadsContainerFragment);
        Object Q = btsVar2.Q();
        if (e || Q == did.a) {
            ChatThreadsContainerFragment$setupTabsBar$1$1$3$2$1$1 chatThreadsContainerFragment$setupTabsBar$1$1$3$2$1$1 = new ChatThreadsContainerFragment$setupTabsBar$1$1$3$2$1$1(0, chatThreadsContainerFragment, ChatThreadsContainerFragment.class, "scrollCurrentChildToTop", "scrollCurrentChildToTop()V", 0);
            btsVar2.o0(chatThreadsContainerFragment$setupTabsBar$1$1$3$2$1$1);
            Q = chatThreadsContainerFragment$setupTabsBar$1$1$3$2$1$1;
        }
        btsVar2.t(false);
        throw null;
    }
}
