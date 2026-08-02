package ru.rustore.sdk.pushclient.l;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.nyy0;
import xsna.ui50;

@b6l(c = "ru.rustore.sdk.pushclient.internal.data.source.IPCClientsDataSource", f = "IPCClientsDataSource.kt", l = {TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER, 50}, m = "clear")
/* loaded from: classes9.dex */
public final class h$a extends ContinuationImpl {
    public nyy0 a;
    public ui50 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ nyy0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h$a(nyy0 nyy0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = nyy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
