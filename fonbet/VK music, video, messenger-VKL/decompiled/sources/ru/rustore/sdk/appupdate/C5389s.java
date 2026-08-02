package ru.rustore.sdk.appupdate;

import kotlin.jvm.internal.Lambda;
import xsna.a4z0;
import xsna.ctj0;
import xsna.izs;
import xsna.ntj0;
import xsna.s3q0;

/* renamed from: ru.rustore.sdk.appupdate.s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5389s extends Lambda implements izs<s3q0, ctj0<s3q0>> {
    public final /* synthetic */ a4z0 a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5389s(a4z0 a4z0Var, int i) {
        super(1);
        this.a = a4z0Var;
        this.b = i;
    }

    @Override // xsna.izs
    public final ctj0<s3q0> invoke(s3q0 s3q0Var) {
        a4z0 a4z0Var = this.a;
        int i = this.b;
        a4z0Var.getClass();
        return new ntj0(new x(a4z0Var, i));
    }
}
