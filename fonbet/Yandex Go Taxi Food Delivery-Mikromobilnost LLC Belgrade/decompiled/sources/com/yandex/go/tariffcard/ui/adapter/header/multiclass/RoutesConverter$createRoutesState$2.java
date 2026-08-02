package com.yandex.go.tariffcard.ui.adapter.header.multiclass;

import android.graphics.drawable.Drawable;
import defpackage.eel0;
import defpackage.l5l0;
import defpackage.lt00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Llt00;", "<anonymous>", "(Ltse;)Llt00;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tariffcard.ui.adapter.header.multiclass.RoutesConverter$createRoutesState$2", f = "RoutesConverter.kt", l = {HProv.PP_PASSWD_TERM}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RoutesConverter$createRoutesState$2 extends SuspendLambda implements wls {
    final /* synthetic */ wls $getCarDrawable;
    final /* synthetic */ List<String> $selectedTariffClass;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutesConverter$createRoutesState$2(List list, c cVar, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$selectedTariffClass = list;
        this.this$0 = cVar;
        this.$getCarDrawable = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RoutesConverter$createRoutesState$2 routesConverter$createRoutesState$2 = new RoutesConverter$createRoutesState$2(this.$selectedTariffClass, this.this$0, this.$getCarDrawable, continuation);
        routesConverter$createRoutesState$2.L$0 = obj;
        return routesConverter$createRoutesState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RoutesConverter$createRoutesState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        List list;
        Drawable drawable;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            List list2 = eel0.a;
            List<String> list3 = this.$selectedTariffClass;
            ListIterator<String> listIterator = list3.listIterator(list3.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i = -1;
                    break;
                }
                if (listIterator.previous() != null) {
                    i = listIterator.nextIndex();
                    break;
                }
            }
            List A0 = kotlin.collections.a.A0(this.$selectedTariffClass, list2.size());
            c cVar = this.this$0;
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            int i4 = 0;
            for (Object obj2 : A0) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    scc.m();
                    throw null;
                }
                if (((String) obj2) != null) {
                    e eVar = cVar.a;
                    l5l0 l5l0Var = (l5l0) list2.get(i4);
                    drawable = tje.y(i4 == i ? l5l0Var.b() : l5l0Var.c(), eVar.a);
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    arrayList.add(drawable);
                }
                i4 = i5;
            }
            List A02 = kotlin.collections.a.A0(this.$selectedTariffClass, list2.size());
            wls wlsVar = this.$getCarDrawable;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : A02) {
                int i6 = i3 + 1;
                if (i3 < 0) {
                    scc.m();
                    throw null;
                }
                String str = (String) obj3;
                qoh h = str != null ? tje.h(tseVar, null, null, new RoutesConverter$createRoutesState$2$cars$1$1$1(list2, i3, wlsVar, str, null), 3) : null;
                if (h != null) {
                    arrayList2.add(h);
                }
                i3 = i6;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = arrayList;
            this.I$0 = i;
            this.label = 1;
            obj = kotlinx.coroutines.a.b(arrayList2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            list = arrayList;
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = (List) this.L$2;
            kotlin.b.b(obj);
        }
        return new lt00(list, EmptyList.a, tcc.o((Iterable) obj));
    }
}
