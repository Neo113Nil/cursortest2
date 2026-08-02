package ru.rustore.sdk.appupdate;

import android.content.Context;
import android.content.ServiceConnection;
import kotlin.jvm.internal.Lambda;
import xsna.a4z0;
import xsna.izs;
import xsna.s3q0;
import xsna.tey0;
import xsna.vtj0;

/* loaded from: classes9.dex */
public final class r extends Lambda implements izs<vtj0<s3q0>, ServiceConnection> {
    public final /* synthetic */ a4z0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a4z0 a4z0Var) {
        super(1);
        this.a = a4z0Var;
    }

    @Override // xsna.izs
    public final ServiceConnection invoke(vtj0<s3q0> vtj0Var) {
        vtj0<s3q0> vtj0Var2 = vtj0Var;
        Context context = this.a.a;
        return new tey0(context, context.getPackageName(), new C5387p(vtj0Var2), new C5388q(vtj0Var2));
    }
}
