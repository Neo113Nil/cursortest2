package com.yandex.go.shortcuts.impl.ui.interactors;

import com.yandex.go.shortcuts.ui.interactors.ShortcutViewSourceType;
import defpackage.bkt0;
import defpackage.d4s0;
import defpackage.j73;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t2k0;
import defpackage.u1l;
import defpackage.vpr;
import defpackage.ycc;
import defpackage.zjt0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.ui.interactors.SourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$3", f = "SourcesHandler.kt", l = {288}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class SourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ bkt0 receiver$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$3(Continuation continuation, bkt0 bkt0Var) {
        super(3, continuation);
        this.receiver$inlined = bkt0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$3 sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$3 = new SourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$3((Continuation) obj3, this.receiver$inlined);
        sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$3.L$0 = (vpr) obj;
        sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return sourcesHandler$startObserveViewModelChanges$lambda$1$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d4s0 b;
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            zjt0[] zjt0VarArr = (zjt0[]) objArr;
            bkt0 bkt0Var = this.receiver$inlined;
            Object[] copyOf = Arrays.copyOf(zjt0VarArr, zjt0VarArr.length);
            bkt0Var.getClass();
            List A = j73.A(new zjt0[]{bkt0.a(ShortcutViewSourceType.PRODUCTS, copyOf), bkt0.a(ShortcutViewSourceType.ORDER, copyOf), bkt0.a(ShortcutViewSourceType.SHORTCUT_SCREEN, copyOf), bkt0.a(ShortcutViewSourceType.WIDGETS, copyOf), bkt0.a(ShortcutViewSourceType.CITY_MODE, copyOf), bkt0.a(ShortcutViewSourceType.SCOOTERS_DISCOVERY, copyOf), bkt0.a(ShortcutViewSourceType.SCOOTERS_FINISH_INFO_RIDE_FINISH, copyOf), bkt0.a(ShortcutViewSourceType.INTERCITY, copyOf), bkt0.a(ShortcutViewSourceType.MASSTRANSIT, copyOf), bkt0.a(ShortcutViewSourceType.CHARGERS_DISCOVERY, copyOf), bkt0.a(ShortcutViewSourceType.RIDA_LOCAL_SOURCE, copyOf)});
            ArrayList arrayList = (ArrayList) A;
            if (arrayList.isEmpty()) {
                jst.e.s(new IllegalStateException("sources not found"));
                b = d4s0.m;
            } else if (arrayList.size() == 1) {
                b = ((zjt0) kotlin.collections.a.P(A)).b;
            } else {
                u1l u1lVar = new u1l(2, A);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = u1lVar.iterator();
                while (true) {
                    ListIterator listIterator = ((t2k0) it).a;
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    ycc.r(((zjt0) listIterator.previous()).b.d, arrayList2);
                }
                b = ((zjt0) kotlin.collections.a.P(A)).b.b(arrayList2);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(b, this) == coroutineSingletons) {
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
