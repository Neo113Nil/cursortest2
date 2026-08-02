package ru.rustore.sdk.appupdate;

import android.content.ServiceConnection;
import kotlin.jvm.internal.Lambda;
import xsna.a4z0;
import xsna.gzs;
import xsna.inj;
import xsna.s3q0;

/* loaded from: classes9.dex */
public final class j extends Lambda implements gzs<s3q0> {
    public final /* synthetic */ a4z0 a;
    public final /* synthetic */ ServiceConnection b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a4z0 a4z0Var, ServiceConnection serviceConnection) {
        super(0);
        this.a = a4z0Var;
        this.b = serviceConnection;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        inj.b(this.a.a, this.b);
        return s3q0.a;
    }
}
