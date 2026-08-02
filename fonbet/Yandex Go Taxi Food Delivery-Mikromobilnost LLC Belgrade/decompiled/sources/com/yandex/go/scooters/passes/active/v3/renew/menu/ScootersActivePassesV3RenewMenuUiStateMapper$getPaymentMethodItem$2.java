package com.yandex.go.scooters.passes.active.v3.renew.menu;

import android.graphics.Bitmap;
import defpackage.hfa0;
import defpackage.lea0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.sea0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.yum0;
import defpackage.zsm0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzsm0;", "<anonymous>", "(Ltse;)Lzsm0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.active.v3.renew.menu.ScootersActivePassesV3RenewMenuUiStateMapper$getPaymentMethodItem$2", f = "ScootersActivePassesV3RenewMenuUiStateMapper.kt", l = {HProv.ALG_SID_KECCAK_256, 90, HProv.PP_HASHOID, HProv.PP_CIPHEROID, HProv.PP_SIGNATUREOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersActivePassesV3RenewMenuUiStateMapper$getPaymentMethodItem$2 extends SuspendLambda implements wls {
    final /* synthetic */ yum0 $paymentInfo;
    final /* synthetic */ hfa0 $paymentOptions;
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
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActivePassesV3RenewMenuUiStateMapper$getPaymentMethodItem$2(hfa0 hfa0Var, e eVar, yum0 yum0Var, Continuation continuation) {
        super(2, continuation);
        this.$paymentOptions = hfa0Var;
        this.this$0 = eVar;
        this.$paymentInfo = yum0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersActivePassesV3RenewMenuUiStateMapper$getPaymentMethodItem$2 scootersActivePassesV3RenewMenuUiStateMapper$getPaymentMethodItem$2 = new ScootersActivePassesV3RenewMenuUiStateMapper$getPaymentMethodItem$2(this.$paymentOptions, this.this$0, this.$paymentInfo, continuation);
        scootersActivePassesV3RenewMenuUiStateMapper$getPaymentMethodItem$2.L$0 = obj;
        return scootersActivePassesV3RenewMenuUiStateMapper$getPaymentMethodItem$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersActivePassesV3RenewMenuUiStateMapper$getPaymentMethodItem$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        lea0 lea0Var;
        Bitmap bitmap;
        Object e;
        Bitmap bitmap2;
        Bitmap bitmap3;
        CharSequence charSequence;
        CharSequence charSequence2;
        Object e2;
        CharSequence charSequence3;
        Bitmap bitmap4;
        CharSequence charSequence4;
        CharSequence charSequence5;
        Object e3;
        CharSequence charSequence6;
        Bitmap bitmap5;
        Bitmap bitmap6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            lea0 b = this.$paymentOptions.b();
            qoh h2 = tje.h(tseVar, null, null, new ScootersActivePassesV3RenewMenuUiStateMapper$getPaymentMethodItem$2$baseImageAsync$1(b, this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new ScootersActivePassesV3RenewMenuUiStateMapper$getPaymentMethodItem$2$complementImageAsync$1(this.this$0, this.$paymentOptions, null), 3);
            this.L$0 = null;
            this.L$1 = b;
            this.L$2 = null;
            this.L$3 = h;
            this.label = 1;
            Object s = h2.s(this);
            if (s != coroutineSingletons) {
                lea0Var = b;
                obj = s;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                bitmap = (Bitmap) this.L$4;
                lea0Var = (lea0) this.L$1;
                kotlin.b.b(obj);
                Bitmap bitmap7 = (Bitmap) obj;
                e eVar = this.this$0;
                String a = ((sea0) eVar.d).a(eVar.a, lea0Var);
                ru.yandex.taxi.widget.c cVar = this.this$0.b;
                FormattedText formattedText = this.$paymentInfo.b;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = bitmap;
                this.L$5 = bitmap7;
                this.L$6 = a;
                this.label = 3;
                e = e.e(cVar, formattedText, this);
                if (e != coroutineSingletons) {
                    bitmap2 = bitmap7;
                    obj = e;
                    bitmap3 = bitmap;
                    charSequence = a;
                    charSequence2 = (CharSequence) obj;
                    if (charSequence2 == null) {
                    }
                    ru.yandex.taxi.widget.c cVar2 = this.this$0.b;
                    FormattedText formattedText2 = this.$paymentInfo.c;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = bitmap3;
                    this.L$5 = bitmap2;
                    this.L$6 = charSequence;
                    this.L$7 = charSequence2;
                    this.label = 4;
                    e2 = e.e(cVar2, formattedText2, this);
                    if (e2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                charSequence = (CharSequence) this.L$6;
                bitmap2 = (Bitmap) this.L$5;
                bitmap3 = (Bitmap) this.L$4;
                kotlin.b.b(obj);
                charSequence2 = (CharSequence) obj;
                if (charSequence2 == null) {
                    charSequence2 = "";
                }
                ru.yandex.taxi.widget.c cVar22 = this.this$0.b;
                FormattedText formattedText22 = this.$paymentInfo.c;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = bitmap3;
                this.L$5 = bitmap2;
                this.L$6 = charSequence;
                this.L$7 = charSequence2;
                this.label = 4;
                e2 = e.e(cVar22, formattedText22, this);
                if (e2 != coroutineSingletons) {
                    CharSequence charSequence9 = charSequence;
                    charSequence3 = charSequence2;
                    obj = e2;
                    bitmap4 = bitmap2;
                    charSequence4 = charSequence9;
                    charSequence5 = (CharSequence) obj;
                    if (charSequence5 == null) {
                    }
                    ru.yandex.taxi.widget.c cVar3 = this.this$0.b;
                    FormattedText formattedText3 = this.$paymentInfo.d;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = bitmap3;
                    this.L$5 = bitmap4;
                    this.L$6 = charSequence4;
                    this.L$7 = charSequence3;
                    this.L$8 = charSequence5;
                    this.label = 5;
                    e3 = e.e(cVar3, formattedText3, this);
                    if (e3 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i != 4) {
                if (i != 5) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                CharSequence charSequence10 = (CharSequence) this.L$8;
                CharSequence charSequence11 = (CharSequence) this.L$7;
                CharSequence charSequence12 = (CharSequence) this.L$6;
                Bitmap bitmap8 = (Bitmap) this.L$5;
                Bitmap bitmap9 = (Bitmap) this.L$4;
                kotlin.b.b(obj);
                charSequence8 = charSequence11;
                bitmap6 = bitmap9;
                charSequence6 = charSequence12;
                bitmap5 = bitmap8;
                charSequence7 = charSequence10;
                CharSequence charSequence13 = (CharSequence) obj;
                return new zsm0(bitmap6, bitmap5, charSequence6, charSequence8, charSequence7, charSequence13 != null ? "" : charSequence13);
            }
            charSequence3 = (CharSequence) this.L$7;
            charSequence4 = (CharSequence) this.L$6;
            bitmap4 = (Bitmap) this.L$5;
            bitmap3 = (Bitmap) this.L$4;
            kotlin.b.b(obj);
            charSequence5 = (CharSequence) obj;
            if (charSequence5 == null) {
                charSequence5 = "";
            }
            ru.yandex.taxi.widget.c cVar32 = this.this$0.b;
            FormattedText formattedText32 = this.$paymentInfo.d;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = bitmap3;
            this.L$5 = bitmap4;
            this.L$6 = charSequence4;
            this.L$7 = charSequence3;
            this.L$8 = charSequence5;
            this.label = 5;
            e3 = e.e(cVar32, formattedText32, this);
            if (e3 != coroutineSingletons) {
                charSequence6 = charSequence4;
                bitmap5 = bitmap4;
                bitmap6 = bitmap3;
                charSequence7 = charSequence5;
                charSequence8 = charSequence3;
                obj = e3;
                CharSequence charSequence132 = (CharSequence) obj;
                return new zsm0(bitmap6, bitmap5, charSequence6, charSequence8, charSequence7, charSequence132 != null ? "" : charSequence132);
            }
            return coroutineSingletons;
        }
        h = (noh) this.L$3;
        lea0Var = (lea0) this.L$1;
        kotlin.b.b(obj);
        Bitmap bitmap10 = (Bitmap) obj;
        this.L$0 = null;
        this.L$1 = lea0Var;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = bitmap10;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            bitmap = bitmap10;
            obj = k;
            Bitmap bitmap72 = (Bitmap) obj;
            e eVar2 = this.this$0;
            String a2 = ((sea0) eVar2.d).a(eVar2.a, lea0Var);
            ru.yandex.taxi.widget.c cVar4 = this.this$0.b;
            FormattedText formattedText4 = this.$paymentInfo.b;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = bitmap;
            this.L$5 = bitmap72;
            this.L$6 = a2;
            this.label = 3;
            e = e.e(cVar4, formattedText4, this);
            if (e != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
