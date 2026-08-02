package com.yandex.go.places.impl.ui.organizations;

import defpackage.bdc;
import defpackage.cp80;
import defpackage.d760;
import defpackage.di80;
import defpackage.dp80;
import defpackage.ei80;
import defpackage.ep80;
import defpackage.f760;
import defpackage.fi80;
import defpackage.fp80;
import defpackage.gp80;
import defpackage.hp80;
import defpackage.hvp0;
import defpackage.ip80;
import defpackage.ivp0;
import defpackage.jl40;
import defpackage.jp80;
import defpackage.jvp0;
import defpackage.k7v;
import defpackage.kdc;
import defpackage.kp80;
import defpackage.lp80;
import defpackage.lqb;
import defpackage.mvg;
import defpackage.np80;
import defpackage.ny61;
import defpackage.op80;
import defpackage.pp80;
import defpackage.tcc;
import defpackage.w511;
import defpackage.wm80;
import defpackage.xlb1;
import defpackage.xm80;
import defpackage.xng0;
import defpackage.ym80;
import defpackage.ypb;
import defpackage.zls;
import defpackage.zpb;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lip80;", "screenInfo", "Lpp80;", "searchOptions", "Lmp80;", "<anonymous>", "(Lip80;Lpp80;)Lmp80;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.organizations.OrganizationsUiStateInteractor$screenUiStateFlow$1", f = "OrganizationsUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsUiStateInteractor$screenUiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsUiStateInteractor$screenUiStateFlow$1(e eVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OrganizationsUiStateInteractor$screenUiStateFlow$1 organizationsUiStateInteractor$screenUiStateFlow$1 = new OrganizationsUiStateInteractor$screenUiStateFlow$1(this.this$0, (Continuation) obj3);
        organizationsUiStateInteractor$screenUiStateFlow$1.L$0 = (ip80) obj;
        organizationsUiStateInteractor$screenUiStateFlow$1.L$1 = (pp80) obj2;
        return organizationsUiStateInteractor$screenUiStateFlow$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x014b, code lost:
    
        if (r0 != null) goto L92;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        fi80 di80Var;
        List list2;
        ym80 ym80Var;
        ArrayList o0;
        ip80 ip80Var = (ip80) this.L$0;
        pp80 pp80Var = (pp80) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        if (pp80Var instanceof op80) {
            list = (List) eVar.k.getValue();
        } else {
            eVar.getClass();
            if (!(pp80Var instanceof np80)) {
                w511.b();
                return null;
            }
            List<jvp0> list3 = ((np80) pp80Var).a;
            ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
            for (jvp0 jvp0Var : list3) {
                if (jvp0Var instanceof ivp0) {
                    String str = jvp0Var.a;
                    ivp0 ivp0Var = (ivp0) jvp0Var;
                    ypb ypbVar = ivp0Var.c;
                    di80Var = new ei80(str, xlb1.c(ypbVar), ypbVar.b, ypbVar.c, ivp0Var.b, ivp0Var.d);
                } else {
                    if (!(jvp0Var instanceof hvp0)) {
                        w511.b();
                        return null;
                    }
                    String str2 = jvp0Var.a;
                    hvp0 hvp0Var = (hvp0) jvp0Var;
                    ypb ypbVar2 = hvp0Var.b;
                    lqb c = xlb1.c(ypbVar2);
                    kdc kdcVar = ypbVar2.e;
                    if (kdcVar == null) {
                        kdcVar = new bdc(xng0.bgInvert);
                    }
                    zpb zpbVar = new zpb(ypbVar2.b, kdcVar);
                    boolean z = hvp0Var.d;
                    String str3 = hvp0Var.c;
                    k7v k7vVar = ypbVar2.f;
                    di80Var = new di80(str2, c, zpbVar, z, str3, k7vVar != null ? k7vVar.a : null);
                }
                arrayList.add(di80Var);
            }
            list = arrayList;
        }
        if (ip80Var instanceof cp80) {
            ym80 ym80Var2 = ((cp80) ip80Var).a;
            if (ym80Var2 instanceof xm80) {
                return new kp80(((xm80) ym80Var2).d, list);
            }
            if (ym80Var2 instanceof wm80) {
                wm80 wm80Var = (wm80) ym80Var2;
                return new jp80(wm80Var.d, list, false, wm80Var.a == 0);
            }
            w511.b();
            return null;
        }
        if (ip80Var instanceof gp80) {
            gp80 gp80Var = (gp80) ip80Var;
            ym80 ym80Var3 = gp80Var.a;
            wm80 wm80Var2 = ym80Var3 instanceof wm80 ? (wm80) ym80Var3 : null;
            List list4 = wm80Var2 != null ? wm80Var2.d : null;
            if (list4 == null) {
                list4 = EmptyList.a;
            }
            int i = fp80.a[gp80Var.b.ordinal()];
            if (i == 1) {
                o0 = kotlin.collections.a.o0(list4, d760.a);
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                o0 = kotlin.collections.a.o0(list4, f760.a);
            }
            return new jp80(o0, list, false, false);
        }
        if (jl40.l(ip80Var, ep80.a)) {
            return lp80.a;
        }
        if (!jl40.l(ip80Var, dp80.a) && !(ip80Var instanceof hp80)) {
            w511.b();
            return null;
        }
        hp80 hp80Var = ip80Var instanceof hp80 ? (hp80) ip80Var : null;
        if (hp80Var != null && (ym80Var = hp80Var.a) != null) {
            wm80 wm80Var3 = ym80Var instanceof wm80 ? (wm80) ym80Var : null;
            if (wm80Var3 != null) {
                list2 = wm80Var3.d;
            }
        }
        list2 = (List) eVar.j.getValue();
        return new jp80(list2, list, true, false);
    }
}
