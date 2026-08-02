package com.yandex.go.taxi.order.support.data.mappers;

import com.yandex.go.taxi.order.models.api.cancel.ActionButtonDto;
import com.yandex.go.taxi.order.models.api.cancel.n;
import defpackage.bdc;
import defpackage.miw0;
import defpackage.mvg;
import defpackage.niw0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.ufu;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lniw0;", "<anonymous>", "(Ltse;)Lniw0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.support.data.mappers.SupportItemMapper$convertActionButton$2", f = "SupportItemMapper.kt", l = {HProv.PP_BIO_STATISTICA_LEN, HProv.PP_REBOOT}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SupportItemMapper$convertActionButton$2 extends SuspendLambda implements wls {
    final /* synthetic */ ActionButtonDto $actionButtonDto;
    final /* synthetic */ String $id;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportItemMapper$convertActionButton$2(a aVar, ActionButtonDto actionButtonDto, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$actionButtonDto = actionButtonDto;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SupportItemMapper$convertActionButton$2 supportItemMapper$convertActionButton$2 = new SupportItemMapper$convertActionButton$2(this.this$0, this.$actionButtonDto, this.$id, continuation);
        supportItemMapper$convertActionButton$2.L$0 = obj;
        return supportItemMapper$convertActionButton$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SupportItemMapper$convertActionButton$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String lowerCase;
        noh nohVar;
        String str;
        miw0 miw0Var;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            n nVar = this.$actionButtonDto.c;
            String str2 = this.$id;
            aVar.getClass();
            qoh h = tje.h(tseVar, null, null, new SupportItemMapper$convertAction$1(nVar, aVar, str2, null), 3);
            a aVar2 = this.this$0;
            FormattedText formattedText = this.$actionButtonDto.b;
            aVar2.getClass();
            qoh h2 = tje.h(tseVar, null, null, new SupportItemMapper$convertText$1(aVar2, formattedText, null), 3);
            lowerCase = this.$actionButtonDto.c.a().name().toLowerCase(Locale.ROOT);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h2;
            this.L$3 = lowerCase;
            this.label = 1;
            Object s = h.s(this);
            if (s != coroutineSingletons) {
                nohVar = h2;
                obj = s;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            miw0Var = (miw0) this.L$4;
            str = (String) this.L$3;
            kotlin.b.b(obj);
            pdc pdcVar = this.this$0.c;
            ufu ufuVar = (ufu) pdcVar;
            return new niw0(str, ufuVar.f(new bdc(xng0.controlMinor), this.$actionButtonDto.a), (CharSequence) obj, miw0Var);
        }
        lowerCase = (String) this.L$3;
        nohVar = (noh) this.L$2;
        kotlin.b.b(obj);
        miw0 miw0Var2 = (miw0) obj;
        if (miw0Var2 == null) {
            return null;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = lowerCase;
        this.L$4 = miw0Var2;
        this.label = 2;
        Object k = nohVar.k(this);
        if (k != coroutineSingletons) {
            str = lowerCase;
            miw0Var = miw0Var2;
            obj = k;
            pdc pdcVar2 = this.this$0.c;
            ufu ufuVar2 = (ufu) pdcVar2;
            return new niw0(str, ufuVar2.f(new bdc(xng0.controlMinor), this.$actionButtonDto.a), (CharSequence) obj, miw0Var);
        }
        return coroutineSingletons;
    }
}
