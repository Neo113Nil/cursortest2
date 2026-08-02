package com.yandex.go.explorer.impl.ui.map;

import defpackage.guo;
import defpackage.i3y;
import defpackage.ito;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.xto;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.explorer.impl.ui.map.ExplorerPresenter$subscribeToUnviewedCellsPreload$1", f = "ExplorerPresenter.kt", l = {159}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ExplorerPresenter$subscribeToUnviewedCellsPreload$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ l this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "count", "Lzy11;", "<anonymous>", "(I)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.explorer.impl.ui.map.ExplorerPresenter$subscribeToUnviewedCellsPreload$1$1", f = "ExplorerPresenter.kt", l = {162}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.explorer.impl.ui.map.ExplorerPresenter$subscribeToUnviewedCellsPreload$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ int I$0;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.I$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            zy11 zy11Var = zy11.a;
            if (i2 == 0) {
                kotlin.b.b(obj);
                l lVar = this.this$0;
                if (lVar.B.a) {
                    return zy11Var;
                }
                if (i <= 0) {
                    lVar.F = EmptyList.a;
                    lVar.G = -1;
                    return zy11Var;
                }
                com.yandex.go.explorer.impl.data.repositories.a aVar = lVar.x;
                this.I$0 = i;
                this.label = 1;
                obj = aVar.c(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Long(((ito) it.next()).a));
            }
            i3y i3yVar = xto.a;
            List J0 = kotlin.collections.a.J0(xto.b(this.this$0.B.d, kotlin.collections.a.N0(arrayList)));
            l lVar2 = this.this$0;
            lVar2.F = J0;
            lVar2.G = lVar2.B.d;
            ((guo) lVar2.Dg()).F9(J0);
            return zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorerPresenter$subscribeToUnviewedCellsPreload$1(l lVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExplorerPresenter$subscribeToUnviewedCellsPreload$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExplorerPresenter$subscribeToUnviewedCellsPreload$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = kotlinx.coroutines.flow.e.t(this.this$0.x.e());
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(t, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
