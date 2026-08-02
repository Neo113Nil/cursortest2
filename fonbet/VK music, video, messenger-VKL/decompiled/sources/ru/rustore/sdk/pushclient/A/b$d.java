package ru.rustore.sdk.pushclient.A;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.cfy0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.push.storage.PushTokenDataSource", f = "PushTokenDataSource.kt", l = {TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER}, m = "getLastDeliveredToClientToken")
/* loaded from: classes9.dex */
public final class b$d extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ cfy0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b$d(cfy0 cfy0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = cfy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(this);
    }
}
