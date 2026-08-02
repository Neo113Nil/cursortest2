package ru.rustore.sdk.appupdate;

import android.content.Context;
import android.content.ServiceConnection;
import kotlin.jvm.internal.Lambda;
import xsna.a4z0;
import xsna.esu;
import xsna.izs;
import xsna.s3q0;
import xsna.vtj0;

/* renamed from: ru.rustore.sdk.appupdate.o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5386o extends Lambda implements izs<vtj0<s3q0>, ServiceConnection> {
    public final /* synthetic */ a4z0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5386o(a4z0 a4z0Var) {
        super(1);
        this.a = a4z0Var;
    }

    @Override // xsna.izs
    public final ServiceConnection invoke(vtj0<s3q0> vtj0Var) {
        vtj0<s3q0> vtj0Var2 = vtj0Var;
        Context context = this.a.a;
        return new esu(context, context.getPackageName(), new C5384m(vtj0Var2), new C5385n(vtj0Var2));
    }
}
