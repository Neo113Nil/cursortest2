package ru.rustore.sdk.pushclient.l;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.apy0;
import xsna.b6l;

@b6l(c = "ru.rustore.sdk.pushclient.internal.data.source.ArbiterMasterSelectionDataSource", f = "ArbiterMasterSelectionDataSource.kt", l = {11}, m = "getMasterPackage-gIAlu-s")
/* loaded from: classes9.dex */
public final class d$a extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ apy0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d$a(apy0 apy0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = apy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object a = this.b.a(null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
