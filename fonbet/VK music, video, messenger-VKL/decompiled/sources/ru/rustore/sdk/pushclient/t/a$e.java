package ru.rustore.sdk.pushclient.t;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.hay0;
import xsna.ui50;

@b6l(c = "ru.rustore.sdk.pushclient.internal.external.ExternalAppsRepository", f = "ExternalAppsRepository.kt", l = {87, 44}, m = "requireConfig")
/* loaded from: classes9.dex */
public final class a$e extends ContinuationImpl {
    public hay0 a;
    public ui50 b;
    public hay0.a.C2982a c;
    public /* synthetic */ Object d;
    public final /* synthetic */ hay0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a$e(hay0 hay0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = hay0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(this);
    }
}
