package com.yandex.go.platform.navigation.impl;

import defpackage.e6q;
import defpackage.evu0;
import defpackage.hz40;
import defpackage.ly40;
import defpackage.mvg;
import defpackage.n650;
import defpackage.ny61;
import defpackage.t850;
import defpackage.tse;
import defpackage.v4r0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.navigation.impl.NavigatorViewHolderImpl$onViewStateChanged$2", f = "NavigatorViewHolderImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class NavigatorViewHolderImpl$onViewStateChanged$2 extends SuspendLambda implements wls {
    final /* synthetic */ t850 $viewState;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigatorViewHolderImpl$onViewStateChanged$2(t850 t850Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$viewState = t850Var;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavigatorViewHolderImpl$onViewStateChanged$2(this.$viewState, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        NavigatorViewHolderImpl$onViewStateChanged$2 navigatorViewHolderImpl$onViewStateChanged$2 = (NavigatorViewHolderImpl$onViewStateChanged$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        navigatorViewHolderImpl$onViewStateChanged$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        n650 n650Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Set N0 = kotlin.collections.a.N0(this.$viewState.a);
        hz40 hz40Var = this.this$0.k;
        ly40 ly40Var = hz40Var.h;
        if (ly40Var == null) {
            ly40Var = new ly40(hz40Var);
            hz40Var.h = ly40Var;
        }
        LinkedHashSet f = v4r0.f(ly40Var.b(), this.this$0.d());
        Set set = N0;
        Set g = v4r0.g(f, set);
        Set g2 = v4r0.g(N0, f);
        LinkedHashSet U = kotlin.collections.a.U(set, f);
        if (!g.isEmpty() || !g2.isEmpty()) {
            d dVar = this.this$0;
            Iterator it = g.iterator();
            while (it.hasNext()) {
                n650 n650Var2 = (n650) dVar.k.m((com.yandex.go.platform.navigation.model.a) it.next());
                if (n650Var2 != null) {
                    dVar.c().removeView(n650Var2.a);
                }
                dVar.h.a.m("main_screen");
            }
            d dVar2 = this.this$0;
            Iterator it2 = U.iterator();
            while (it2.hasNext()) {
                n650 n650Var3 = (n650) dVar2.k.m((com.yandex.go.platform.navigation.model.a) it2.next());
                if (n650Var3 != null) {
                    dVar2.c().removeView(n650Var3.a);
                }
            }
            List list = this.$viewState.a;
            d dVar3 = this.this$0;
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                dVar3.b((com.yandex.go.platform.navigation.model.a) it3.next());
            }
            d dVar4 = this.this$0;
            com.yandex.go.platform.navigation.model.a aVar = dVar4.j;
            if (aVar != null && (n650Var = (n650) dVar4.k.d(aVar)) != null) {
                this.this$0.getClass();
                n650Var.d.setAlpha(1.0f);
                n650Var.c.setAlpha(1.0f);
            }
            e6q e6qVar = this.this$0.h;
            Iterator it4 = g2.iterator();
            while (it4.hasNext()) {
                e6qVar.a.o("main_screen", (com.yandex.go.platform.navigation.model.a) it4.next());
            }
        }
        hz40 hz40Var2 = this.this$0.k;
        t850 t850Var = this.$viewState;
        Object[] objArr = hz40Var2.b;
        Object[] objArr2 = hz40Var2.c;
        long[] jArr = hz40Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            n650 n650Var4 = (n650) objArr2[i4];
                            String str = (String) t850Var.b.get((com.yandex.go.platform.navigation.model.a) obj2);
                            n650Var4.b.setText(str);
                            n650Var4.b.setVisibility((str == null || evu0.J(str)) ? 8 : 0);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return zy11.a;
    }
}
