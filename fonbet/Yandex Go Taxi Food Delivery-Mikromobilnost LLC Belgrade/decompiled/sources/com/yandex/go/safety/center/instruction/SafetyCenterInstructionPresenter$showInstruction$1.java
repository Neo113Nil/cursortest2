package com.yandex.go.safety.center.instruction;

import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.d6z;
import defpackage.g4w;
import defpackage.i4w;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.n48;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p2y0;
import defpackage.q3h0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tse;
import defpackage.vrl0;
import defpackage.wls;
import defpackage.xrl0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.instruction.SafetyCenterInstructionPresenter$showInstruction$1", f = "SafetyCenterInstructionPresenter.kt", l = {HProv.PP_LCD_QUERY}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterInstructionPresenter$showInstruction$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterInstructionPresenter$showInstruction$1(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterInstructionPresenter$showInstruction$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterInstructionPresenter$showInstruction$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2 A[LOOP:0: B:17:0x009c->B:19:0x00a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0080  */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Throwable] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object p;
        h hVar;
        Iterator it;
        Iterator it2;
        Iterator it3;
        String Lg;
        String Lg2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str2 = null;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar2 = this.this$0;
            if ((hVar2.J instanceof n48) && (str = hVar2.B.d.b) != null) {
                p2y0 p2y0Var = hVar2.z;
                this.L$0 = str;
                this.L$1 = hVar2;
                this.L$2 = null;
                this.label = 1;
                p = ((e0) p2y0Var).p(str, this);
                if (p == coroutineSingletons) {
                    return coroutineSingletons;
                }
                hVar = hVar2;
            }
            h hVar3 = this.this$0;
            TaxiOrder taxiOrder = hVar3.N;
            SafetyCenterExperiment safetyCenterExperiment = hVar3.A;
            boolean z = taxiOrder == null && safetyCenterExperiment.f.a;
            String Y = d6z.Y(safetyCenterExperiment, hVar3.J.e);
            h hVar4 = this.this$0;
            String str3 = hVar4.J.c;
            String a = str3 == null ? ((m7x0) hVar4.G).a(str3) : null;
            h hVar5 = this.this$0;
            SafetyCenterExperiment.Instruction instruction = hVar5.J;
            boolean z2 = instruction.d;
            List list = instruction.f;
            SafetyCenterExperiment safetyCenterExperiment2 = hVar5.A;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(d6z.Y(safetyCenterExperiment2, (String) it.next()));
            }
            ArrayList arrayList2 = new ArrayList();
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((String) next).length() > 0) {
                    arrayList2.add(next);
                }
            }
            h hVar6 = this.this$0;
            List list2 = hVar6.J.g;
            ArrayList arrayList3 = new ArrayList(tcc.n(list2, 10));
            int i2 = 0;
            for (Object obj2 : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    ?? r16 = str2;
                    scc.m();
                    throw r16;
                }
                SafetyCenterExperiment.Button button = (SafetyCenterExperiment.Button) obj2;
                String str4 = str2;
                String Y2 = d6z.Y(hVar6.A, button.a);
                SafetyCenterExperiment.ButtonStyle buttonStyle = button.b;
                SafetyCenterExperiment.Action action = button.c;
                ArrayList arrayList4 = arrayList2;
                if (action == null || button.a.length() <= 0 || ((action == SafetyCenterExperiment.Action.CONTACT_SUPPORT && ((Lg2 = hVar6.Lg(button.d)) == null || Lg2.length() == 0)) || (action == SafetyCenterExperiment.Action.CALL_ANY_NUMBER && ((Lg = hVar6.Lg(button.e)) == null || Lg.length() == 0)))) {
                    i2 = -1;
                }
                int i4 = action == null ? -1 : xrl0.a[action.ordinal()];
                arrayList3.add(new g4w(Y2, buttonStyle, i2, i4 != 1 ? i4 != 2 ? i4 != 3 ? 0 : q3h0.ic_support_chat : q3h0.ic_phone : q3h0.ic_emergency_call));
                i2 = i3;
                str2 = str4;
                arrayList2 = arrayList4;
            }
            ArrayList arrayList5 = arrayList2;
            String str5 = str2;
            ArrayList arrayList6 = new ArrayList();
            it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                g4w g4wVar = (g4w) next2;
                if (g4wVar.c != -1 && g4wVar.a.length() > 0) {
                    arrayList6.add(next2);
                }
            }
            ((vrl0) this.this$0.Dg()).renderInstruction(new i4w(arrayList5, Y, a, arrayList6, z2, !z ? this.this$0.A.a(SafetyCenterExperiment.L10nKey.CRASH_DETECTION_REQUEST_NEW_RIDE_LINK_TITLE) : str5));
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hVar = (h) this.L$1;
        kotlin.b.b(obj);
        p = obj;
        o2y0 o2y0Var = (o2y0) p;
        if (o2y0Var != null) {
            hVar.N = o2y0Var.b();
        }
        h hVar32 = this.this$0;
        TaxiOrder taxiOrder2 = hVar32.N;
        SafetyCenterExperiment safetyCenterExperiment3 = hVar32.A;
        if (taxiOrder2 == null) {
        }
        String Y3 = d6z.Y(safetyCenterExperiment3, hVar32.J.e);
        h hVar42 = this.this$0;
        String str32 = hVar42.J.c;
        if (str32 == null) {
        }
        h hVar52 = this.this$0;
        SafetyCenterExperiment.Instruction instruction2 = hVar52.J;
        boolean z22 = instruction2.d;
        List list3 = instruction2.f;
        SafetyCenterExperiment safetyCenterExperiment22 = hVar52.A;
        ArrayList arrayList7 = new ArrayList(tcc.n(list3, 10));
        it = list3.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList22 = new ArrayList();
        it2 = arrayList7.iterator();
        while (it2.hasNext()) {
        }
        h hVar62 = this.this$0;
        List list22 = hVar62.J.g;
        ArrayList arrayList32 = new ArrayList(tcc.n(list22, 10));
        int i22 = 0;
        while (r7.hasNext()) {
        }
        ArrayList arrayList52 = arrayList22;
        String str52 = str2;
        ArrayList arrayList62 = new ArrayList();
        it3 = arrayList32.iterator();
        while (it3.hasNext()) {
        }
        ((vrl0) this.this$0.Dg()).renderInstruction(new i4w(arrayList52, Y3, a, arrayList62, z22, !z ? this.this$0.A.a(SafetyCenterExperiment.L10nKey.CRASH_DETECTION_REQUEST_NEW_RIDE_LINK_TITLE) : str52));
        return zy11.a;
    }
}
