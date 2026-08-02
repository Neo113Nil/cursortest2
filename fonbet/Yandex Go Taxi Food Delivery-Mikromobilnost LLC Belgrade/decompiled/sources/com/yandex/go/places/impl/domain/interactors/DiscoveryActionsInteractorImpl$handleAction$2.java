package com.yandex.go.places.impl.domain.interactors;

import android.net.Uri;
import defpackage.bei;
import defpackage.bgb0;
import defpackage.c5c0;
import defpackage.dab1;
import defpackage.f3h;
import defpackage.fr;
import defpackage.h2b1;
import defpackage.huj;
import defpackage.iuj;
import defpackage.jl40;
import defpackage.jp;
import defpackage.jvj;
import defpackage.l76;
import defpackage.lvj;
import defpackage.msb1;
import defpackage.muj;
import defpackage.mvg;
import defpackage.nuj;
import defpackage.nvj;
import defpackage.ny61;
import defpackage.ouj;
import defpackage.puj;
import defpackage.pvj;
import defpackage.qtb1;
import defpackage.ruj;
import defpackage.svj;
import defpackage.tse;
import defpackage.vvb1;
import defpackage.w511;
import defpackage.wfz;
import defpackage.wls;
import defpackage.xpb1;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.domain.interactors.DiscoveryActionsInteractorImpl$handleAction$2", f = "DiscoveryActionsInteractorImpl.kt", l = {HProv.PP_DELETE_KEYSET}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DiscoveryActionsInteractorImpl$handleAction$2 extends SuspendLambda implements wls {
    final /* synthetic */ fr $action;
    final /* synthetic */ c5c0 $placesAnalyticsEntryPoint;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoveryActionsInteractorImpl$handleAction$2(fr frVar, c5c0 c5c0Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$action = frVar;
        this.$placesAnalyticsEntryPoint = c5c0Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiscoveryActionsInteractorImpl$handleAction$2(this.$action, this.$placesAnalyticsEntryPoint, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DiscoveryActionsInteractorImpl$handleAction$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Uri uri;
        svj svjVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            Uri parse = Uri.parse(((jp) this.$action).a);
            c5c0 c5c0Var = this.$placesAnalyticsEntryPoint;
            if (c5c0Var != null && jl40.l(parse.getHost(), "discovery") && parse.getQueryParameter("metrica_source") == null && jl40.l(parse.getQueryParameter("action"), "card")) {
                if (c5c0Var.equals(xpb1.N)) {
                    svjVar = puj.b;
                } else if (c5c0Var.equals(msb1.O)) {
                    svjVar = ruj.b;
                } else if (c5c0Var.equals(h2b1.M)) {
                    svjVar = ouj.b;
                } else if (c5c0Var.equals(wfz.M)) {
                    svjVar = nuj.b;
                } else if (c5c0Var.equals(dab1.M)) {
                    svjVar = muj.b;
                } else if (c5c0Var.equals(bei.L)) {
                    svjVar = iuj.b;
                } else if (c5c0Var.equals(l76.L)) {
                    svjVar = huj.b;
                } else if (c5c0Var.equals(bei.M)) {
                    svjVar = pvj.b;
                } else if (c5c0Var.equals(l76.M)) {
                    svjVar = nvj.b;
                } else if (c5c0Var.equals(qtb1.L)) {
                    svjVar = jvj.b;
                } else {
                    if (!c5c0Var.equals(vvb1.L)) {
                        w511.b();
                        return null;
                    }
                    svjVar = lvj.b;
                }
                parse = parse.buildUpon().appendQueryParameter("metrica_source", svjVar.a()).build();
            }
            this.this$0.getClass();
            boolean equalsIgnoreCase = "tel".equalsIgnoreCase(parse.getScheme());
            a aVar = this.this$0;
            if (equalsIgnoreCase) {
                bgb0.i(aVar.a, parse);
                return zy11Var;
            }
            f3h f3hVar = (f3h) aVar.m.getValue();
            this.L$0 = parse;
            this.label = 1;
            Boolean b = f3hVar.b(parse);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            uri = parse;
            obj = b;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uri = (Uri) this.L$0;
            kotlin.b.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return zy11Var;
        }
        this.this$0.c.f.a(uri, DeeplinkSource.PLACES);
        return zy11Var;
    }
}
