package com.yandex.go.taxi.order.communications;

import defpackage.akz0;
import defpackage.ckz0;
import defpackage.dpf0;
import defpackage.epf0;
import defpackage.kpf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tcc;
import defpackage.tls;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.communications.ToggleCommunicationsViewHolder$reactOnToggle$2", f = "ToggleCommunicationsViewHolder.kt", l = {105}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ToggleCommunicationsViewHolder$reactOnToggle$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isChecked;
    final /* synthetic */ kpf0 $item;
    final /* synthetic */ akz0 $this_reactOnToggle;
    Object L$0;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleCommunicationsViewHolder$reactOnToggle$2(boolean z, akz0 akz0Var, k kVar, kpf0 kpf0Var, Continuation continuation) {
        super(2, continuation);
        this.$isChecked = z;
        this.$this_reactOnToggle = akz0Var;
        this.this$0 = kVar;
        this.$item = kpf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ToggleCommunicationsViewHolder$reactOnToggle$2(this.$isChecked, this.$this_reactOnToggle, this.this$0, this.$item, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ToggleCommunicationsViewHolder$reactOnToggle$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d0;
        DriveState c;
        String name;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean z = this.$isChecked;
            akz0 akz0Var = this.$this_reactOnToggle;
            List list = (z ? akz0Var.b : akz0Var.c).a;
            k kVar = this.this$0;
            tls tlsVar = kVar.i0;
            String str = this.$item.a.a;
            o2y0 o2y0Var = kVar.f0;
            String str2 = o2y0Var != null ? o2y0Var.b().a : null;
            o2y0 o2y0Var2 = this.this$0.f0;
            String lowerCase = (o2y0Var2 == null || (c = o2y0Var2.c()) == null || (name = c.name()) == null) ? null : name.toLowerCase(Locale.ROOT);
            int G = this.this$0.G();
            List list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((ckz0) it.next()).a().name().toLowerCase(Locale.ROOT));
            }
            tlsVar.invoke(new epf0(new dpf0(str, str2, lowerCase, G, arrayList, this.$item.a.k), list, this.this$0.h0));
            k kVar2 = this.this$0;
            akz0 akz0Var2 = this.$this_reactOnToggle;
            boolean z2 = this.$isChecked;
            this.L$0 = null;
            this.label = 1;
            kVar2.getClass();
            if (z2) {
                d0 = kVar2.d0(akz0Var2.b, null, null, this);
            } else {
                if (z2) {
                    w511.b();
                    return null;
                }
                d0 = kVar2.d0(akz0Var2.c, null, null, this);
            }
            if (d0 == coroutineSingletons) {
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
