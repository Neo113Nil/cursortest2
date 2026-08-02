package com.yandex.go.quark.dynamic;

import android.content.Context;
import com.yandex.go.quark.api.router.QuarkDynamicFeatureRouter$Payload$DisplayMode;
import com.yandex.quark.webchat.params.WebChatParams;
import defpackage.b2b;
import defpackage.bd41;
import defpackage.bst;
import defpackage.c2b;
import defpackage.dd41;
import defpackage.ed41;
import defpackage.fe00;
import defpackage.g8e;
import defpackage.hst;
import defpackage.je00;
import defpackage.jhg0;
import defpackage.jst;
import defpackage.jyj0;
import defpackage.ke00;
import defpackage.kxj0;
import defpackage.lkf;
import defpackage.lyj0;
import defpackage.mkf;
import defpackage.mvg;
import defpackage.n1d;
import defpackage.nig0;
import defpackage.nkf;
import defpackage.nxj0;
import defpackage.ny61;
import defpackage.pig0;
import defpackage.pnh;
import defpackage.qd41;
import defpackage.syj0;
import defpackage.tse;
import defpackage.uig0;
import defpackage.vnh;
import defpackage.w511;
import defpackage.wd41;
import defpackage.wls;
import defpackage.wly0;
import defpackage.xa20;
import defpackage.yig0;
import defpackage.z3x0;
import defpackage.zc41;
import defpackage.zq6;
import defpackage.zwf0;
import defpackage.zy11;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Luig0;", "<anonymous>", "(Ltse;)Luig0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.quark.dynamic.QuarkServiceImpl$quarkFeaturesDeferred$1", f = "QuarkServiceImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class QuarkServiceImpl$quarkFeaturesDeferred$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuarkServiceImpl$quarkFeaturesDeferred$1(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QuarkServiceImpl$quarkFeaturesDeferred$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QuarkServiceImpl$quarkFeaturesDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ed41 ed41Var;
        nkf lkfVar;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        hst hstVar = jst.e;
        je00 je00Var = hstVar.b;
        je00 je00Var2 = hstVar.b;
        fe00 fe00Var = hstVar.a;
        ke00 a = je00Var.a();
        if (a != null && a.b(10)) {
            a.a(10, "QuarkService", null, "Preparing Quark...", fe00Var);
        }
        syj0 syj0Var = (syj0) h.d(this.this$0).c().get();
        jyj0 jyj0Var = syj0Var instanceof jyj0 ? (jyj0) syj0Var : null;
        if (jyj0Var != null && (obj2 = jyj0Var.a) != null) {
            String str = ((jhg0) obj2).b;
            ke00 a2 = je00Var2.a();
            if (a2 != null && a2.b(15)) {
                a2.a(15, "QuarkService", null, g8e.o("Can't prepare Quark: ", str), fe00Var);
            }
            throw new ExceptionInInitializerError(str);
        }
        ke00 a3 = je00Var2.a();
        if (a3 != null && a3.b(10)) {
            a3.a(10, "QuarkService", null, "Starting Quark...", fe00Var);
        }
        syj0 syj0Var2 = (syj0) h.d(this.this$0).f().get();
        if (!(syj0Var2 instanceof lyj0)) {
            if (!(syj0Var2 instanceof jyj0)) {
                w511.b();
                return null;
            }
            jhg0 jhg0Var = (jhg0) ((jyj0) syj0Var2).a;
            ke00 a4 = je00Var2.a();
            if (a4 != null && a4.b(15)) {
                a4.a(15, "QuarkService", null, g8e.o("Can't start Quark: ", jhg0Var.b), fe00Var);
            }
            throw new ExceptionInInitializerError(jhg0Var.b);
        }
        nig0 nig0Var = (nig0) ((lyj0) syj0Var2).a;
        h hVar = this.this$0;
        Context context = hVar.a;
        bst bstVar = hVar.e;
        c2b c2bVar = hVar.k;
        xa20 xa20Var = nig0Var.d;
        com.yandex.go.quark.dynamic.chat.b bVar = c2bVar.g;
        com.yandex.go.quark.dynamic.chat.c cVar = c2bVar.d;
        nxj0 nxj0Var = new nxj0(new vnh(pig0.a, c2bVar.a, xa20Var, false, false));
        kxj0 kxj0Var = new kxj0(new z3x0(0));
        Locale locale = Locale.getDefault();
        yig0 yig0Var = c2bVar.b;
        QuarkDynamicFeatureRouter$Payload$DisplayMode quarkDynamicFeatureRouter$Payload$DisplayMode = yig0Var.b;
        int[] iArr = b2b.a;
        int i = iArr[quarkDynamicFeatureRouter$Payload$DisplayMode.ordinal()];
        if (i == 1) {
            ed41Var = bd41.a;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            ed41Var = dd41.a;
        }
        qd41 qd41Var = new qd41(locale, ed41Var, 64);
        int i2 = iArr[yig0Var.b.ordinal()];
        if (i2 == 1) {
            lkfVar = new lkf(c2bVar.f.get());
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            lkfVar = mkf.a;
        }
        nkf nkfVar = lkfVar;
        c2bVar.e.getClass();
        wd41 wd41Var = new wd41(new n1d(context, this.this$0.b, new wly0(), bstVar, new zc41(bVar, cVar, qd41Var, nxj0Var, kxj0Var, new WebChatParams(4194299), new pnh(c2bVar.c.a), nkfVar), new zq6(0), new zwf0()));
        h.d(this.this$0).a(wd41Var);
        h hVar2 = this.this$0;
        ke00 a5 = je00Var2.a();
        if (a5 != null && a5.b(10)) {
            a5.a(10, "QuarkService", null, "Quark " + h.d(hVar2) + " created", fe00Var);
        }
        this.this$0.n.start();
        this.this$0.o.start();
        this.this$0.p.start();
        return new uig0(nig0Var.a, nig0Var.c, wd41Var.a, nig0Var.b);
    }
}
