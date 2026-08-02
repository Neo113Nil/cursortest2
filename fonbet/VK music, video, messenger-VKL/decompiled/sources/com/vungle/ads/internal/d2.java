package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.internal.util.PathProvider;

/* loaded from: classes7.dex */
public final class d2 extends w1 {
    public final /* synthetic */ ServiceLocator b;

    public d2(ServiceLocator serviceLocator) {
        this.b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.w1
    public final Object a() {
        Object a;
        ServiceLocator serviceLocator = this.b;
        Context context = serviceLocator.a;
        a = serviceLocator.a(PathProvider.class);
        return new com.vungle.ads.internal.task.p(context, (PathProvider) a);
    }
}
