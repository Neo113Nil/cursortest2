package com.yandex.passport.sloth.ui;

import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.net.Uri;
import defpackage.ai91;
import defpackage.dvw;
import defpackage.j18;
import defpackage.m50;
import defpackage.mfu;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v40;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.sloth.ui.SlothSlab$openExternalBrowser$1", f = "SlothSlab.kt", l = {479}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SlothSlab$openExternalBrowser$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $url;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlothSlab$openExternalBrowser$1(d0 d0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = d0Var;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SlothSlab$openExternalBrowser$1(this.this$0, this.$url, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SlothSlab$openExternalBrowser$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            ComponentCallbacks2 componentCallbacks2 = this.this$0.E;
            v40 v40Var = componentCallbacks2 instanceof v40 ? (v40) componentCallbacks2 : null;
            if (v40Var != null) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.$url));
                this.L$0 = v40Var;
                this.L$1 = intent;
                this.label = 1;
                j18 j18Var = new j18(1, dvw.b(this));
                j18Var.u();
                m50 a = ai91.a(v40Var, new mfu(0, intent), new c0(j18Var));
                a.a(zy11Var);
                j18Var.w(new com.yandex.passport.internal.ui.bouncer.challenge.e(3, a));
                obj = j18Var.s();
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11Var;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return zy11Var;
    }
}
