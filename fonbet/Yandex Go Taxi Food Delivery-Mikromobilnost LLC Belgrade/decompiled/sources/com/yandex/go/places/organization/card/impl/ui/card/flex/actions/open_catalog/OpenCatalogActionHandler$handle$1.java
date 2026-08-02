package com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_catalog;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.yandex.go.places.models.data.entities.network.actions.OpenCatalogFlexAction;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.g;
import defpackage.c9c0;
import defpackage.dac0;
import defpackage.e470;
import defpackage.f470;
import defpackage.ht10;
import defpackage.jsj;
import defpackage.mvg;
import defpackage.nh80;
import defpackage.ny61;
import defpackage.oe80;
import defpackage.p9c0;
import defpackage.qje;
import defpackage.rg80;
import defpackage.s7c0;
import defpackage.tse;
import defpackage.u3m;
import defpackage.wls;
import defpackage.xng0;
import defpackage.yg80;
import defpackage.zg80;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_catalog.OpenCatalogActionHandler$handle$1", f = "OpenCatalogActionHandler.kt", l = {49}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OpenCatalogActionHandler$handle$1 extends SuspendLambda implements wls {
    final /* synthetic */ OpenCatalogFlexAction $action;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenCatalogActionHandler$handle$1(c cVar, OpenCatalogFlexAction openCatalogFlexAction, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$action = openCatalogFlexAction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(Ref$BooleanRef ref$BooleanRef, c cVar, Ref$ObjectRef ref$ObjectRef, ViewGroup viewGroup, ViewGroup viewGroup2, boolean z) {
        if (ref$BooleanRef.element) {
            return;
        }
        ref$BooleanRef.element = true;
        g gVar = (g) cVar.A.c;
        ((nh80) gVar.Dg()).gb(null);
        c9c0 c9c0Var = (c9c0) ref$ObjectRef.element;
        if (c9c0Var != null) {
            c9c0Var.i();
        }
        viewGroup.removeView(viewGroup2);
        ((nh80) gVar.Dg()).setDraggable(true);
        ((nh80) gVar.Dg()).Tf(z);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OpenCatalogActionHandler$handle$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OpenCatalogActionHandler$handle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, c9c0, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.places.experiments.flex.b bVar = this.this$0.b;
            this.label = 1;
            b = bVar.b(p9c0.b, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = obj;
        }
        u3m u3mVar = (u3m) b;
        zy11 zy11Var = zy11.a;
        if (u3mVar != null) {
            c cVar = this.this$0;
            OpenCatalogFlexAction openCatalogFlexAction = this.$action;
            jsj jsjVar = cVar.y;
            ViewGroup viewGroup = jsjVar.a;
            ht10 ht10Var = cVar.A;
            g gVar = (g) ht10Var.c;
            ViewParent parent = jsjVar.a.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                boolean ka = ((nh80) gVar.Dg()).ka();
                jsj jsjVar2 = new jsj(viewGroup.getContext());
                ViewGroup viewGroup3 = jsjVar2.a;
                ViewParent parent2 = viewGroup3.getParent();
                ViewGroup viewGroup4 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                viewGroup3.setBackgroundColor(qje.t(xng0.bgMain, viewGroup.getContext()));
                if (viewGroup4 != null) {
                    viewGroup4.removeView(viewGroup3);
                }
                viewGroup2.addView(viewGroup3, new ViewGroup.LayoutParams(-1, -1));
                b bVar2 = new b(ref$BooleanRef, cVar, ref$ObjectRef, viewGroup2, viewGroup3, ka);
                f470 f470Var = new f470(0, openCatalogFlexAction);
                dac0 dac0Var = cVar.a;
                s7c0 s7c0Var = new s7c0(u3mVar.b, u3mVar.d, 0);
                e470 e470Var = new e470();
                zg80 zg80Var = cVar.c;
                oe80 oe80Var = cVar.z;
                zg80Var.a.getClass();
                yg80 yg80Var = new yg80(oe80Var);
                String a = cVar.x.a().a();
                EmptySet emptySet = EmptySet.a;
                ?? a2 = dac0.a(dac0Var, s7c0Var, f470Var, jsjVar2, emptySet, bVar2, e470Var, yg80Var, emptySet, a, null, HProv.ALG_TYPE_GR3410);
                ref$ObjectRef.element = a2;
                ((nh80) gVar.Dg()).Tf(true);
                ((nh80) gVar.Dg()).setDraggable(false);
                ((nh80) gVar.Dg()).gb(new OpenCatalogActionHandler$handle$1$1$1(ref$BooleanRef, cVar, ref$ObjectRef, viewGroup2, viewGroup3, ka));
                ((rg80) ht10Var.b).e.invoke(a2);
            }
        }
        return zy11Var;
    }
}
