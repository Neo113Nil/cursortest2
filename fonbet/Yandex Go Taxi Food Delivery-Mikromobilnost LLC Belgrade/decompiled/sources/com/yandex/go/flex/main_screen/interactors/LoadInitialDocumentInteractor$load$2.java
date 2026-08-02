package com.yandex.go.flex.main_screen.interactors;

import com.yandex.feedsdk.di.FeedSdkComponent;
import com.yandex.go.flex.main_screen.api.domain.SuperappTopPlaqueType;
import com.yandex.go.flex.main_screen.shared_data.SuperAppMainScreenFeatures;
import defpackage.cot;
import defpackage.cvl;
import defpackage.cvw;
import defpackage.dzp0;
import defpackage.h2m;
import defpackage.hp50;
import defpackage.jg90;
import defpackage.jl40;
import defpackage.jpr;
import defpackage.jst;
import defpackage.kc7;
import defpackage.kr;
import defpackage.mvg;
import defpackage.n9p;
import defpackage.ny61;
import defpackage.p0u;
import defpackage.p7j0;
import defpackage.qoi0;
import defpackage.qyy0;
import defpackage.see;
import defpackage.tcc;
import defpackage.tse;
import defpackage.u1m;
import defpackage.uwl;
import defpackage.weu;
import defpackage.wls;
import defpackage.ywl;
import defpackage.zwy;
import defpackage.zy11;
import flex.section.divkit.DivkitSnippet;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lywl;", "<anonymous>", "(Ltse;)Lywl;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.interactors.LoadInitialDocumentInteractor$load$2", f = "LoadInitialDocumentInteractor.kt", l = {30, 35}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class LoadInitialDocumentInteractor$load$2 extends SuspendLambda implements wls {
    final /* synthetic */ u1m $query;
    Object L$0;
    int label;
    final /* synthetic */ zwy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadInitialDocumentInteractor$load$2(zwy zwyVar, u1m u1mVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = zwyVar;
        this.$query = u1mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoadInitialDocumentInteractor$load$2(this.this$0, this.$query, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LoadInitialDocumentInteractor$load$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x007b, code lost:
    
        if (r14 != r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0164  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        n9p n9pVar;
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            cot cotVar = this.this$0.b;
            u1m u1mVar = this.$query;
            this.label = 1;
            cotVar.getClass();
            if (qyy0.a()) {
                jst.e.q("Loading document from cache on main thread");
            }
            hp50 a = ((FeedSdkComponent) cotVar.b).a();
            kc7 load = a.a.load(new p7j0(4, u1mVar.a, u1mVar.b), new weu(15, a.b.b(u1mVar, null, null)));
            if (load != null) {
                Object obj2 = load.a;
                jg90 jg90Var = obj2 instanceof jg90 ? (jg90) obj2 : null;
                h2m h2mVar = jg90Var != null ? (h2m) jg90Var.a : null;
                obj = h2mVar != null ? h2mVar.a : null;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                n9pVar = (n9p) this.L$0;
                kotlin.b.b(obj);
                return n9pVar.a(obj == SuperappTopPlaqueType.DOCUMENT_SECTION);
            }
            kotlin.b.b(obj);
        }
        ywl ywlVar = (ywl) obj;
        if (ywlVar != null) {
            jpr jprVar = this.this$0.c;
            jprVar.getClass();
            SuperAppMainScreenFeatures superAppMainScreenFeatures = (SuperAppMainScreenFeatures) ywlVar.c.b(qoi0.a(SuperAppMainScreenFeatures.class));
            if (superAppMainScreenFeatures == null) {
                z = true;
            } else {
                boolean z2 = superAppMainScreenFeatures.a;
                jprVar.a.getClass();
                z = !z2;
            }
            ywl ywlVar2 = z ? ywlVar : null;
            if (ywlVar2 != null) {
                this.this$0.getClass();
                uwl uwlVar = ywlVar2.d;
                kr krVar = uwlVar != null ? uwlVar.b : null;
                if (krVar != null) {
                    ywlVar2 = ywl.a(ywlVar2, null, null, null, uwl.a(uwlVar, cvw.Y(krVar, new p0u(16)), null, null, 61), 55);
                }
                ywl ywlVar3 = ywlVar2;
                this.this$0.getClass();
                see seeVar = ywlVar3.a;
                if (!(seeVar instanceof dzp0)) {
                    return ywlVar3;
                }
                dzp0 dzp0Var = (dzp0) seeVar;
                List<Object> list = dzp0Var.b;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (Object obj3 : list) {
                    if (obj3 instanceof cvl) {
                        cvl cvlVar = (cvl) obj3;
                        List list2 = cvlVar.c;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : list2) {
                            if (!jl40.l(((DivkitSnippet) obj4).h, "hiddenInCache")) {
                                arrayList2.add(obj4);
                            }
                        }
                        obj3 = cvl.f(cvlVar, arrayList2, null, null, null, 507);
                    }
                    arrayList.add(obj3);
                }
                return ywl.a(ywlVar3, dzp0.b(dzp0Var, arrayList), null, null, null, 62);
            }
        }
        zwy zwyVar = this.this$0;
        n9p n9pVar2 = zwyVar.e;
        com.yandex.go.flex.main_screen.domain.h hVar = zwyVar.d;
        this.L$0 = n9pVar2;
        this.label = 2;
        obj = hVar.a(this);
        if (obj != coroutineSingletons) {
            n9pVar = n9pVar2;
            return n9pVar.a(obj == SuperappTopPlaqueType.DOCUMENT_SECTION);
        }
        return coroutineSingletons;
    }
}
