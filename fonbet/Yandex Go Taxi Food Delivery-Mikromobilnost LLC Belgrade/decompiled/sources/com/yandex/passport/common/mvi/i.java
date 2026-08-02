package com.yandex.passport.common.mvi;

import defpackage.cms;
import defpackage.jl40;
import defpackage.jms;
import defpackage.lz40;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes15.dex */
public final /* synthetic */ class i implements vpr, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((f) obj2).render(obj);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return zy11Var;
            default:
                Object emit = ((lz40) obj2).emit(obj, continuation);
                return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11Var;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new AdaptedFunctionReference(2, (f) this.b, f.class, "render", "render(Ljava/lang/Object;)V", 4);
            default:
                return new FunctionReferenceImpl(2, (lz40) this.b, lz40.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
