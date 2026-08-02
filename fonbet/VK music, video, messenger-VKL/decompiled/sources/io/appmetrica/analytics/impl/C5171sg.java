package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import xsna.jx8;

/* renamed from: io.appmetrica.analytics.impl.sg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5171sg implements InterfaceC4701ab {
    public final ICommonExecutor a;
    public final InstallReferrerClient b;

    public C5171sg(Context context, ICommonExecutor iCommonExecutor) {
        this.a = iCommonExecutor;
        this.b = InstallReferrerClient.newBuilder(context).build();
    }

    public static final void b(Cg cg, Throwable th) {
        cg.a(th);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4701ab
    public final void a(Cg cg) throws Throwable {
        this.b.startConnection(new C5145rg(this, cg));
    }

    public final void a(Cg cg, Throwable th) {
        this.a.execute(new jx8(8, cg, th));
    }
}
