package com.yandex.passport.internal.social.esia;

import com.yandex.passport.internal.ui.sloth.ebs.a1;
import com.yandex.passport.internal.ui.sloth.ebs.b1;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class h0 implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.arkivanov.mvikotlin.extensions.coroutines.a b;
    public final /* synthetic */ com.arkivanov.mvikotlin.extensions.coroutines.a c;
    public final /* synthetic */ yr31 w;

    public /* synthetic */ h0(com.arkivanov.mvikotlin.extensions.coroutines.a aVar, com.arkivanov.mvikotlin.extensions.coroutines.a aVar2, yr31 yr31Var, int i) {
        this.a = i;
        this.b = aVar;
        this.c = aVar2;
        this.w = yr31Var;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        yr31 yr31Var = this.w;
        com.arkivanov.mvikotlin.extensions.coroutines.a aVar = this.c;
        com.arkivanov.mvikotlin.extensions.coroutines.a aVar2 = this.b;
        switch (i) {
            case 0:
                Object collect = aVar2.collect(new g0(vprVar, aVar, (i0) yr31Var), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            default:
                Object collect2 = aVar2.collect(new a1(vprVar, aVar, (b1) yr31Var), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
        }
    }
}
