package com.yandex.go.scooters.data.mapper;

import defpackage.er;
import defpackage.fef;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.qp;
import defpackage.s7n0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.x8j;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lx8j;", "<anonymous>", "(Ltse;)Lx8j;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersDetailsMapper$toDetailsItem$3", f = "ScootersDetailsMapper.kt", l = {HProv.PP_CONTAINER_EXTENSION_DEL, HProv.PP_CONTAINER_DEFAULT, HProv.PP_LCD_QUERY}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersDetailsMapper$toDetailsItem$3 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ FormattedText $modalViewButtonText;
    final /* synthetic */ FormattedText $modalViewSubtitle;
    final /* synthetic */ FormattedText $modalViewTitle;
    final /* synthetic */ FormattedText $subtitle;
    final /* synthetic */ er $this_toDetailsItem;
    final /* synthetic */ FormattedText $title;
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
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDetailsMapper$toDetailsItem$3(FormattedText formattedText, FormattedText formattedText2, er erVar, c cVar, FormattedText formattedText3, fef fefVar, FormattedText formattedText4, FormattedText formattedText5, Continuation continuation) {
        super(2, continuation);
        this.$title = formattedText;
        this.$subtitle = formattedText2;
        this.$this_toDetailsItem = erVar;
        this.this$0 = cVar;
        this.$modalViewTitle = formattedText3;
        this.$currencyRules = fefVar;
        this.$modalViewSubtitle = formattedText4;
        this.$modalViewButtonText = formattedText5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersDetailsMapper$toDetailsItem$3 scootersDetailsMapper$toDetailsItem$3 = new ScootersDetailsMapper$toDetailsItem$3(this.$title, this.$subtitle, this.$this_toDetailsItem, this.this$0, this.$modalViewTitle, this.$currencyRules, this.$modalViewSubtitle, this.$modalViewButtonText, continuation);
        scootersDetailsMapper$toDetailsItem$3.L$0 = obj;
        return scootersDetailsMapper$toDetailsItem$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDetailsMapper$toDetailsItem$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x011e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        FormattedText formattedText;
        noh nohVar;
        FormattedText formattedText2;
        String str;
        CharSequence charSequence;
        Object k;
        CharSequence charSequence2;
        CharSequence charSequence3;
        FormattedText formattedText3;
        String str2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new ScootersDetailsMapper$toDetailsItem$3$modalViewTitleAsync$1(this.$currencyRules, this.this$0, null, this.$modalViewTitle), 3);
            h = tje.h(tseVar, null, null, new ScootersDetailsMapper$toDetailsItem$3$modalViewSubtitleAsync$1(this.$currencyRules, this.this$0, null, this.$modalViewSubtitle), 3);
            qoh h3 = tje.h(tseVar, null, null, new ScootersDetailsMapper$toDetailsItem$3$modalViewButtonTextAsync$1(this.$currencyRules, this.this$0, null, this.$modalViewButtonText), 3);
            formattedText = this.$title;
            FormattedText formattedText4 = this.$subtitle;
            String str3 = ((qp) this.$this_toDetailsItem).a.a;
            String a = str3 != null ? ((m7x0) this.this$0.a).a(str3) : null;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = h3;
            this.L$4 = a;
            this.L$5 = formattedText;
            this.L$6 = formattedText4;
            this.label = 1;
            obj = h2.s(this);
            if (obj != coroutineSingletons) {
                nohVar = h3;
                formattedText2 = formattedText4;
                str = a;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                formattedText2 = (FormattedText) this.L$8;
                formattedText3 = (FormattedText) this.L$7;
                CharSequence charSequence4 = (CharSequence) this.L$6;
                charSequence3 = (CharSequence) this.L$5;
                String str4 = (String) this.L$4;
                kotlin.b.b(obj);
                str2 = str4;
                charSequence2 = charSequence4;
                return new x8j(formattedText3, formattedText2, new s7n0(charSequence3, charSequence2, (CharSequence) obj, ((qp) this.$this_toDetailsItem).a.e, str2, "ScootersDetailsItemDialogCard"));
            }
            formattedText2 = (FormattedText) this.L$7;
            formattedText = (FormattedText) this.L$6;
            charSequence = (CharSequence) this.L$5;
            str = (String) this.L$4;
            nohVar = (noh) this.L$3;
            kotlin.b.b(obj);
            CharSequence charSequence5 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = str;
            this.L$5 = charSequence;
            this.L$6 = charSequence5;
            this.L$7 = formattedText;
            this.L$8 = formattedText2;
            this.label = 3;
            k = nohVar.k(this);
            if (k != coroutineSingletons) {
                CharSequence charSequence6 = charSequence;
                charSequence2 = charSequence5;
                obj = k;
                charSequence3 = charSequence6;
                formattedText3 = formattedText;
                str2 = str;
                return new x8j(formattedText3, formattedText2, new s7n0(charSequence3, charSequence2, (CharSequence) obj, ((qp) this.$this_toDetailsItem).a.e, str2, "ScootersDetailsItemDialogCard"));
            }
            return coroutineSingletons;
        }
        formattedText2 = (FormattedText) this.L$6;
        formattedText = (FormattedText) this.L$5;
        str = (String) this.L$4;
        nohVar = (noh) this.L$3;
        h = (noh) this.L$2;
        kotlin.b.b(obj);
        CharSequence charSequence7 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = nohVar;
        this.L$4 = str;
        this.L$5 = charSequence7;
        this.L$6 = formattedText;
        this.L$7 = formattedText2;
        this.label = 2;
        Object k2 = h.k(this);
        if (k2 != coroutineSingletons) {
            charSequence = charSequence7;
            obj = k2;
            CharSequence charSequence52 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = str;
            this.L$5 = charSequence;
            this.L$6 = charSequence52;
            this.L$7 = formattedText;
            this.L$8 = formattedText2;
            this.label = 3;
            k = nohVar.k(this);
            if (k != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
