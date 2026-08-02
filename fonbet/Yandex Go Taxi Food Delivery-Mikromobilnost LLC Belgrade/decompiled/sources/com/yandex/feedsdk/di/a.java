package com.yandex.feedsdk.di;

import com.yandex.div.core.Div2Context;
import com.yandex.feedsdk.di.Yatagan$FeedSdkComponent;
import defpackage.f3r0;
import defpackage.gqq;
import defpackage.sls;
import defpackage.tcc;
import defpackage.yvf0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ yvf0 b;

    public /* synthetic */ a(yvf0 yvf0Var, int i) {
        this.a = i;
        this.b = yvf0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        yvf0 yvf0Var = this.b;
        switch (i) {
            case 0:
                return new f3r0(new a(yvf0Var, 1), (gqq) ((Yatagan$FeedSdkComponent.ProviderImpl) yvf0Var).get());
            case 1:
                Collection values = ((gqq) ((Yatagan$FeedSdkComponent.ProviderImpl) yvf0Var).get()).c.values();
                ArrayList arrayList = new ArrayList(tcc.n(values, 10));
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Div2Context) it.next()).getDivVariableController());
                }
                return arrayList;
            case 2:
                Collection values2 = ((gqq) ((Yatagan$FeedSdkComponent.ProviderImpl) yvf0Var).get()).c.values();
                ArrayList arrayList2 = new ArrayList(tcc.n(values2, 10));
                Iterator it2 = values2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Div2Context) it2.next()).getDivVariableController());
                }
                return arrayList2;
            default:
                return (flex.engine.a) ((Yatagan$FeedSdkComponent.ProviderImpl) yvf0Var).get();
        }
    }
}
