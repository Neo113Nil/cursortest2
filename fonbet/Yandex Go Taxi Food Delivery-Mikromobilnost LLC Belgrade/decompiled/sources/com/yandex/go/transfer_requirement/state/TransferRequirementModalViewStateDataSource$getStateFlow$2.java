package com.yandex.go.transfer_requirement.state;

import android.text.format.DateUtils;
import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import defpackage.axq0;
import defpackage.evu0;
import defpackage.fh10;
import defpackage.ikl0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o4m;
import defpackage.oyr;
import defpackage.qoh;
import defpackage.qp01;
import defpackage.rp01;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.wh01;
import defpackage.wls;
import defpackage.xh01;
import defpackage.yh01;
import defpackage.yo01;
import defpackage.zh01;
import defpackage.zy11;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lsp01;", "<anonymous>", "(Ltse;)Lsp01;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.state.TransferRequirementModalViewStateDataSource$getStateFlow$2", f = "TransferRequirementModalViewStateDataSource.kt", l = {80, 81, 82, 83}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TransferRequirementModalViewStateDataSource$getStateFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ yo01 $cardState;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferRequirementModalViewStateDataSource$getStateFlow$2(a aVar, yo01 yo01Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$cardState = yo01Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransferRequirementModalViewStateDataSource$getStateFlow$2 transferRequirementModalViewStateDataSource$getStateFlow$2 = new TransferRequirementModalViewStateDataSource$getStateFlow$2(this.this$0, this.$cardState, continuation);
        transferRequirementModalViewStateDataSource$getStateFlow$2.L$0 = obj;
        return transferRequirementModalViewStateDataSource$getStateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferRequirementModalViewStateDataSource$getStateFlow$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0330, code lost:
    
        if (r4 == r2) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0398  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TransferRequirementExperiment transferRequirementExperiment;
        Map map;
        xh01 xh01Var;
        noh h;
        qoh qohVar;
        Object s;
        CharSequence charSequence;
        xh01 xh01Var2;
        noh nohVar;
        noh nohVar2;
        String str;
        TransferRequirementExperiment transferRequirementExperiment2;
        Map map2;
        String q;
        boolean z;
        String str2;
        axq0 axq0Var;
        Object k;
        Object k2;
        axq0 axq0Var2;
        fh10 fh10Var;
        xh01 xh01Var3;
        o4m o4mVar;
        fh10 fh10Var2;
        ikl0 ikl0Var;
        CharSequence charSequence2;
        Object k3;
        fh10 fh10Var3;
        ikl0 ikl0Var2;
        CharSequence charSequence3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 4;
        Long l = null;
        if (i == 0) {
            b.b(obj);
            TransferRequirementExperiment d = this.this$0.f.d();
            TransferRequirementExperiment.Card card = d.i;
            if (card == null) {
                return rp01.a;
            }
            Map map3 = d.c;
            TransferRequirementExperiment.Card.DatePicker datePicker = card.b;
            if (datePicker != null) {
                a aVar = this.this$0;
                Calendar calendar = this.$cardState.a;
                aVar.getClass();
                String str3 = (String) map3.get(datePicker.a);
                zh01 zh01Var = aVar.e;
                TransferRequirementExperiment.Card.FirstSelectableDate firstSelectableDate = datePicker.b;
                Locale c = zh01Var.b.c();
                int i3 = -1;
                int i4 = firstSelectableDate == null ? -1 : yh01.a[firstSelectableDate.ordinal()];
                if (i4 != -1) {
                    if (i4 == 1) {
                        i3 = 0;
                    } else if (i4 != 2) {
                        w511.b();
                        return null;
                    }
                }
                Integer[] numArr = new Integer[4];
                for (int i5 = 0; i5 < 4; i5++) {
                    numArr[i5] = Integer.valueOf(i3 + i5);
                }
                ArrayList arrayList = new ArrayList(4);
                int i6 = 0;
                while (i6 < i2) {
                    int intValue = numArr[i6].intValue();
                    Calendar b = zh01Var.a.b(l);
                    b.add(5, intValue);
                    arrayList.add(b);
                    i6++;
                    i2 = 4;
                    l = null;
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Calendar calendar2 = (Calendar) it.next();
                    Iterator it2 = it;
                    Calendar calendar3 = calendar;
                    if (DateUtils.isToday(calendar2.getTime().getTime())) {
                        str = str3;
                        Date time = calendar2.getTime();
                        if (str == null) {
                            transferRequirementExperiment2 = d;
                            str2 = zh01.a(time, c);
                        } else {
                            transferRequirementExperiment2 = d;
                            str2 = str;
                        }
                        map2 = map3;
                        q = oyr.q(str2, Extension.FIX_SPACE, evu0.Q("0", new SimpleDateFormat("dd", c).format(time)), " ", evu0.S(Extension.DOT_CHAR, new SimpleDateFormat("MMM", c).format(time).toString()));
                    } else {
                        str = str3;
                        transferRequirementExperiment2 = d;
                        map2 = map3;
                        Date time2 = calendar2.getTime();
                        q = oyr.q(zh01.a(time2, c), Extension.FIX_SPACE, evu0.Q("0", new SimpleDateFormat("dd", c).format(time2)), " ", evu0.S(Extension.DOT_CHAR, new SimpleDateFormat("MMM", c).format(time2).toString()));
                    }
                    if (calendar3 != null) {
                        TimeZone timeZone = calendar3.getTimeZone();
                        LocalDate localDate = timeZone == null ? null : LocalDateTime.ofInstant(calendar3.toInstant(), timeZone.toZoneId()).toLocalDate();
                        TimeZone timeZone2 = calendar2.getTimeZone();
                        z = jl40.l(localDate, timeZone2 == null ? null : LocalDateTime.ofInstant(calendar2.toInstant(), timeZone2.toZoneId()).toLocalDate());
                    } else {
                        z = false;
                    }
                    arrayList2.add(new wh01(q, z, calendar2));
                    it = it2;
                    str3 = str;
                    calendar = calendar3;
                    d = transferRequirementExperiment2;
                    map3 = map2;
                }
                transferRequirementExperiment = d;
                map = map3;
                xh01Var = new xh01(arrayList2);
            } else {
                transferRequirementExperiment = d;
                map = map3;
                xh01Var = null;
            }
            Map map4 = map;
            qoh h2 = tje.h(tseVar, null, null, new TransferRequirementModalViewStateDataSource$getStateFlow$2$serviceSection$1(this.this$0, card, this.$cardState, transferRequirementExperiment, map4, null), 3);
            TransferRequirementExperiment.Card card2 = card;
            TransferRequirementModalViewStateDataSource$getStateFlow$2$meetingsSection$1 transferRequirementModalViewStateDataSource$getStateFlow$2$meetingsSection$1 = new TransferRequirementModalViewStateDataSource$getStateFlow$2$meetingsSection$1(card2, this.this$0, this.$cardState, map4, null);
            Map map5 = map4;
            h = tje.h(tseVar, null, null, transferRequirementModalViewStateDataSource$getStateFlow$2$meetingsSection$1, 3);
            qoh h3 = tje.h(tseVar, null, null, new TransferRequirementModalViewStateDataSource$getStateFlow$2$rulesSection$1(this.this$0, card2, map5, null), 3);
            TransferRequirementExperiment.Card.ActionButtonDto actionButtonDto = card2.f;
            if (actionButtonDto != null) {
                TransferRequirementModalViewStateDataSource$getStateFlow$2$doneButtonState$1$1 transferRequirementModalViewStateDataSource$getStateFlow$2$doneButtonState$1$1 = new TransferRequirementModalViewStateDataSource$getStateFlow$2$doneButtonState$1$1(this.this$0, actionButtonDto, this.$cardState, card2, map5, null);
                card2 = card2;
                map5 = map5;
                qohVar = tje.h(tseVar, null, null, transferRequirementModalViewStateDataSource$getStateFlow$2$doneButtonState$1$1, 3);
            } else {
                qohVar = null;
            }
            CharSequence charSequence4 = (CharSequence) map5.get(card2.a);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = h;
            this.L$7 = h3;
            this.L$8 = qohVar;
            this.L$9 = charSequence4;
            this.L$10 = xh01Var;
            this.label = 1;
            s = h2.s(this);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (s != coroutineSingletons) {
                charSequence = charSequence4;
                xh01Var2 = xh01Var;
                nohVar = h3;
                nohVar2 = qohVar;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                axq0Var = (axq0) this.L$11;
                xh01Var2 = (xh01) this.L$10;
                charSequence = (CharSequence) this.L$9;
                nohVar2 = (noh) this.L$8;
                nohVar = (noh) this.L$7;
                b.b(obj);
                k = obj;
                fh10 fh10Var4 = (fh10) k;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = nohVar2;
                this.L$9 = charSequence;
                this.L$10 = xh01Var2;
                this.L$11 = axq0Var;
                this.L$12 = fh10Var4;
                this.label = 3;
                k2 = nohVar.k(this);
                if (k2 != coroutineSingletons) {
                    xh01 xh01Var4 = xh01Var2;
                    axq0Var2 = axq0Var;
                    fh10Var = fh10Var4;
                    xh01Var3 = xh01Var4;
                    ikl0 ikl0Var3 = (ikl0) k2;
                    o4mVar = null;
                    if (nohVar2 != null) {
                    }
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ikl0Var2 = (ikl0) this.L$13;
                fh10Var3 = (fh10) this.L$12;
                axq0Var2 = (axq0) this.L$11;
                xh01Var3 = (xh01) this.L$10;
                charSequence3 = (CharSequence) this.L$9;
                b.b(obj);
                k3 = obj;
                o4mVar = (o4m) k3;
                ikl0Var = ikl0Var2;
                fh10Var2 = fh10Var3;
                charSequence2 = charSequence3;
                return new qp01(charSequence2, xh01Var3, axq0Var2, fh10Var2, ikl0Var, o4mVar);
            }
            fh10Var = (fh10) this.L$12;
            axq0Var2 = (axq0) this.L$11;
            xh01Var3 = (xh01) this.L$10;
            charSequence = (CharSequence) this.L$9;
            nohVar2 = (noh) this.L$8;
            b.b(obj);
            k2 = obj;
            ikl0 ikl0Var32 = (ikl0) k2;
            o4mVar = null;
            if (nohVar2 != null) {
                fh10Var2 = fh10Var;
                ikl0Var = ikl0Var32;
                charSequence2 = charSequence;
                return new qp01(charSequence2, xh01Var3, axq0Var2, fh10Var2, ikl0Var, o4mVar);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.L$9 = charSequence;
            this.L$10 = xh01Var3;
            this.L$11 = axq0Var2;
            this.L$12 = fh10Var;
            this.L$13 = ikl0Var32;
            this.label = 4;
            k3 = nohVar2.k(this);
            if (k3 != coroutineSingletons) {
                fh10Var3 = fh10Var;
                ikl0Var2 = ikl0Var32;
                charSequence3 = charSequence;
                o4mVar = (o4m) k3;
                ikl0Var = ikl0Var2;
                fh10Var2 = fh10Var3;
                charSequence2 = charSequence3;
                return new qp01(charSequence2, xh01Var3, axq0Var2, fh10Var2, ikl0Var, o4mVar);
            }
            return coroutineSingletons;
        }
        xh01 xh01Var5 = (xh01) this.L$10;
        CharSequence charSequence5 = (CharSequence) this.L$9;
        nohVar2 = (noh) this.L$8;
        nohVar = (noh) this.L$7;
        h = (noh) this.L$6;
        b.b(obj);
        s = obj;
        charSequence = charSequence5;
        xh01Var2 = xh01Var5;
        axq0Var = (axq0) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.L$6 = null;
        this.L$7 = nohVar;
        this.L$8 = nohVar2;
        this.L$9 = charSequence;
        this.L$10 = xh01Var2;
        this.L$11 = axq0Var;
        this.label = 2;
        k = h.k(this);
    }
}
