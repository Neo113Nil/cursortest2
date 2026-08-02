package com.yandex.go.places.impl.ui.organizations;

import defpackage.a65;
import defpackage.bn80;
import defpackage.c65;
import defpackage.cn80;
import defpackage.cp80;
import defpackage.dp80;
import defpackage.ep80;
import defpackage.gp80;
import defpackage.hp80;
import defpackage.hsj;
import defpackage.ip80;
import defpackage.jdj;
import defpackage.jio;
import defpackage.k65;
import defpackage.lwj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.tse0;
import defpackage.uc4;
import defpackage.w511;
import defpackage.wls;
import defpackage.wm80;
import defpackage.xm80;
import defpackage.ym80;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.organizations.OrganizationsPresenter$loadStartPage$1", f = "OrganizationsPresenter.kt", l = {297}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsPresenter$loadStartPage$1 extends SuspendLambda implements wls {
    final /* synthetic */ uc4 $bbox;
    final /* synthetic */ Float $zoom;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsPresenter$loadStartPage$1(d dVar, uc4 uc4Var, Float f, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$bbox = uc4Var;
        this.$zoom = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationsPresenter$loadStartPage$1(this.this$0, this.$bbox, this.$zoom, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationsPresenter$loadStartPage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0.L;
            uc4 uc4Var = this.$bbox;
            Float f = this.$zoom;
            this.label = 1;
            obj = eVar.b(uc4Var, f, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ip80 ip80Var = (ip80) obj;
        d dVar = this.this$0;
        cn80 cn80Var = dVar.Q;
        jdj jdjVar = dVar.P;
        if (ip80Var instanceof cp80) {
            cp80 cp80Var = (cp80) ip80Var;
            bn80 bn80Var = (bn80) cn80Var.a.getValue();
            String str = bn80Var != null ? bn80Var.a : null;
            jdjVar.getClass();
            ym80 ym80Var = cp80Var.a;
            if (ym80Var instanceof wm80) {
                List<k65> list = ((wm80) ym80Var).d;
                ArrayList arrayList = new ArrayList();
                for (k65 k65Var : list) {
                    ((c65) jdjVar.w).getClass();
                    lwj lwjVar = k65Var instanceof a65 ? new lwj(((a65) k65Var).a) : null;
                    if (lwjVar != null) {
                        arrayList.add(lwjVar);
                    }
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    lwj lwjVar2 = (lwj) it.next();
                    MapBuilder mapBuilder = new MapBuilder();
                    lwjVar2.getClass();
                    mapBuilder.put("type", "organization_card");
                    String str2 = lwjVar2.a;
                    if (str2 != null) {
                    }
                    arrayList2.add(mapBuilder.j());
                }
                jio jioVar = (jio) jdjVar.c;
                hsj hsjVar = jioVar.b;
                String i2 = jioVar.i();
                hsjVar.getClass();
                HashMap hashMap = new HashMap();
                if (str != null) {
                    hashMap.put("geosearch_context", str);
                }
                hashMap.put("items_list", arrayList2);
                hashMap.put("source", i2);
                hsjVar.a.a("Discovery.OrganisationList.Shown", hashMap, 2, new HashMap());
            } else if (!(ym80Var instanceof xm80)) {
                w511.b();
                return null;
            }
        } else if ((ip80Var instanceof dp80) || (ip80Var instanceof ep80)) {
            bn80 bn80Var2 = (bn80) cn80Var.a.getValue();
            String str3 = bn80Var2 != null ? bn80Var2.a : null;
            jio jioVar2 = (jio) jdjVar.c;
            hsj hsjVar2 = jioVar2.b;
            String i3 = jioVar2.i();
            hsjVar2.getClass();
            HashMap hashMap2 = new HashMap();
            if (str3 != null) {
                hashMap2.put("geosearch_context", str3);
            }
            hsjVar2.a.a("Discovery.OrganisationList.LoadingFailed", hashMap2, 2, tse0.r("source", hashMap2, i3));
        } else if (!(ip80Var instanceof gp80) && !(ip80Var instanceof hp80)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
