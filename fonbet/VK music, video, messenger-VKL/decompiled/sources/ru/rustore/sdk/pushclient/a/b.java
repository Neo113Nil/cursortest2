package ru.rustore.sdk.pushclient.a;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.izs;
import xsna.uoy0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.ValidationComponent", f = "ValidationComponent.kt", l = {25, 30, 38, 45, 50, 55}, m = "validate")
/* loaded from: classes9.dex */
public final class b extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public izs d;
    public /* synthetic */ Object e;
    public final /* synthetic */ uoy0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(uoy0 uoy0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = uoy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, null, null, this);
    }
}
