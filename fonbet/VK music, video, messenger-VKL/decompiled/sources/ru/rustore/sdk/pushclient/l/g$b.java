package ru.rustore.sdk.pushclient.l;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.axy0;
import xsna.b6l;

@b6l(c = "ru.rustore.sdk.pushclient.internal.data.source.ClientSdkModeDataStore", f = "ClientSdkModeDataStore.kt", l = {25, 26}, m = "isTestModeChanged")
/* loaded from: classes9.dex */
public final class g$b extends ContinuationImpl {
    public axy0 a;
    public boolean b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ axy0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g$b(axy0 axy0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = axy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(this);
    }
}
