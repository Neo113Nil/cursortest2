package com.yandex.go.taxi.order.queue.mapper;

import com.yandex.go.zone.dto.objects.QueueScreen;
import defpackage.ikg0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qjg0;
import defpackage.qoh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Likg0;", "<anonymous>", "(Ltse;)Likg0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.queue.mapper.QueueInfoToModelMapper$mapScreen$2", f = "QueueInfoToModelMapper.kt", l = {69, 70, 71, HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class QueueInfoToModelMapper$mapScreen$2 extends SuspendLambda implements wls {
    final /* synthetic */ qjg0 $centerContent;
    final /* synthetic */ QueueScreen $screen;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueueInfoToModelMapper$mapScreen$2(QueueScreen queueScreen, qjg0 qjg0Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$screen = queueScreen;
        this.$centerContent = qjg0Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        QueueInfoToModelMapper$mapScreen$2 queueInfoToModelMapper$mapScreen$2 = new QueueInfoToModelMapper$mapScreen$2(this.$screen, this.$centerContent, this.this$0, continuation);
        queueInfoToModelMapper$mapScreen$2.L$0 = obj;
        return queueInfoToModelMapper$mapScreen$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QueueInfoToModelMapper$mapScreen$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0143  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        Object s;
        noh nohVar;
        noh nohVar2;
        CharSequence charSequence;
        Object k;
        noh nohVar3;
        List list;
        Object b;
        CharSequence charSequence2;
        CharSequence charSequence3;
        Object k2;
        List list2;
        CharSequence charSequence4;
        qjg0 qjg0Var;
        CharSequence charSequence5;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            qoh h = tje.h(tseVar, null, null, new QueueInfoToModelMapper$mapScreen$2$title$1(this.this$0, this.$screen, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new QueueInfoToModelMapper$mapScreen$2$subtitle$1(this.this$0, this.$screen, null), 3);
            qoh h3 = tje.h(tseVar, null, null, new QueueInfoToModelMapper$mapScreen$2$caption$1(this.this$0, this.$screen, null), 3);
            List list3 = this.$screen.c;
            a aVar = this.this$0;
            arrayList = new ArrayList(tcc.n(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(tje.h(tseVar, null, null, new QueueInfoToModelMapper$mapScreen$2$buttons$1$1(aVar, (QueueScreen.QueueButton) it.next(), null), 3));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h2;
            this.L$3 = h3;
            this.L$4 = arrayList;
            this.label = 1;
            s = h.s(this);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (s != coroutineSingletons) {
                nohVar = h2;
                nohVar2 = h3;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                charSequence = (CharSequence) this.L$5;
                list = (List) this.L$4;
                noh nohVar4 = (noh) this.L$3;
                b.b(obj);
                nohVar3 = nohVar4;
                k = obj;
                CharSequence charSequence6 = (CharSequence) k;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = nohVar3;
                this.L$4 = null;
                this.L$5 = charSequence;
                this.L$6 = charSequence6;
                this.label = 3;
                b = kotlinx.coroutines.a.b(list, this);
                if (b != coroutineSingletons) {
                    charSequence2 = charSequence;
                    charSequence3 = charSequence6;
                    List list4 = (List) b;
                    qjg0 qjg0Var2 = this.$centerContent;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = charSequence2;
                    this.L$6 = charSequence3;
                    this.L$7 = list4;
                    this.L$8 = qjg0Var2;
                    this.label = 4;
                    k2 = nohVar3.k(this);
                    if (k2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qjg0 qjg0Var3 = (qjg0) this.L$8;
                List list5 = (List) this.L$7;
                charSequence5 = (CharSequence) this.L$6;
                CharSequence charSequence7 = (CharSequence) this.L$5;
                b.b(obj);
                list2 = list5;
                charSequence4 = charSequence7;
                k2 = obj;
                qjg0Var = qjg0Var3;
                return new ikg0(charSequence4, charSequence5, list2, qjg0Var, (CharSequence) k2);
            }
            charSequence3 = (CharSequence) this.L$6;
            CharSequence charSequence8 = (CharSequence) this.L$5;
            noh nohVar5 = (noh) this.L$3;
            b.b(obj);
            nohVar3 = nohVar5;
            charSequence2 = charSequence8;
            b = obj;
            List list42 = (List) b;
            qjg0 qjg0Var22 = this.$centerContent;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = charSequence2;
            this.L$6 = charSequence3;
            this.L$7 = list42;
            this.L$8 = qjg0Var22;
            this.label = 4;
            k2 = nohVar3.k(this);
            if (k2 != coroutineSingletons) {
                list2 = list42;
                charSequence4 = charSequence2;
                qjg0Var = qjg0Var22;
                charSequence5 = charSequence3;
                return new ikg0(charSequence4, charSequence5, list2, qjg0Var, (CharSequence) k2);
            }
            return coroutineSingletons;
        }
        ?? r1 = (List) this.L$4;
        nohVar2 = (noh) this.L$3;
        nohVar = (noh) this.L$2;
        b.b(obj);
        arrayList = r1;
        s = obj;
        charSequence = (CharSequence) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = nohVar2;
        this.L$4 = arrayList;
        this.L$5 = charSequence;
        this.label = 2;
        k = nohVar.k(this);
        if (k != coroutineSingletons) {
            nohVar3 = nohVar2;
            list = arrayList;
            CharSequence charSequence62 = (CharSequence) k;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = nohVar3;
            this.L$4 = null;
            this.L$5 = charSequence;
            this.L$6 = charSequence62;
            this.label = 3;
            b = kotlinx.coroutines.a.b(list, this);
            if (b != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
