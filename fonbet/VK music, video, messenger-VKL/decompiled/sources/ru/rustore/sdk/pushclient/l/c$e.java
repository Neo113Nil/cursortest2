package ru.rustore.sdk.pushclient.l;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.niy0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.data.source.ArbiterDataSource", f = "ArbiterDataSource.kt", l = {70, TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER}, m = "isDefaultHostChanged")
/* loaded from: classes9.dex */
public final class c$e extends ContinuationImpl {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ niy0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c$e(niy0 niy0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = niy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
