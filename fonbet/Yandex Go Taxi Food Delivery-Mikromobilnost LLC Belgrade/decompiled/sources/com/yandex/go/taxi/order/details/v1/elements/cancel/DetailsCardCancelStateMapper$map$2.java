package com.yandex.go.taxi.order.details.v1.elements.cancel;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$AccessoryResponse$Chevron;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$CancelElement;
import com.yandex.go.taxi.order.models.api.response.i1;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.a5j;
import defpackage.d9s;
import defpackage.gwk0;
import defpackage.ief;
import defpackage.kdc;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.ufu;
import defpackage.wls;
import defpackage.xdf;
import defpackage.z4j;
import defpackage.zvi;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "La5j;", "<anonymous>", "(Ltse;)La5j;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.cancel.DetailsCardCancelStateMapper$map$2", f = "DetailsCardCancelStateMapper.kt", l = {62, SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE, 65}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardCancelStateMapper$map$2 extends SuspendLambda implements wls {
    final /* synthetic */ OrderDetailsCardResponse$CardElement$CancelElement $cancelElement;
    final /* synthetic */ ief $currencyRules;
    final /* synthetic */ boolean $isCancelDisabled;
    int I$0;
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
    final /* synthetic */ z4j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardCancelStateMapper$map$2(OrderDetailsCardResponse$CardElement$CancelElement orderDetailsCardResponse$CardElement$CancelElement, z4j z4jVar, ief iefVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$cancelElement = orderDetailsCardResponse$CardElement$CancelElement;
        this.this$0 = z4jVar;
        this.$currencyRules = iefVar;
        this.$isCancelDisabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DetailsCardCancelStateMapper$map$2 detailsCardCancelStateMapper$map$2 = new DetailsCardCancelStateMapper$map$2(this.$cancelElement, this.this$0, this.$currencyRules, this.$isCancelDisabled, continuation);
        detailsCardCancelStateMapper$map$2.L$0 = obj;
        return detailsCardCancelStateMapper$map$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCardCancelStateMapper$map$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0142, code lost:
    
        if (r8 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013d, code lost:
    
        if (r8 == r1) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0181  */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.graphics.drawable.BitmapDrawable] */
    /* JADX WARN: Type inference failed for: r7v24, types: [noh] */
    /* JADX WARN: Type inference failed for: r8v25, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh nohVar;
        kdc g;
        Object s;
        qoh qohVar;
        int i;
        CharSequence charSequence;
        Object k;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        kdc kdcVar;
        Object k2;
        kdc kdcVar2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        int i3 = 2;
        Object obj2 = null;
        if (i2 == 0) {
            b.b(obj);
            FormattedText formattedText = this.$cancelElement.d;
            if (formattedText != null) {
                xdf xdfVar = this.this$0.f;
                ief iefVar = this.$currencyRules;
                qoh h = tje.h(tseVar, null, null, new DetailsCardCancelStateMapper$map$2$title$1$1(this.this$0, d9s.c(formattedText, xdfVar, iefVar != null ? gwk0.h(iefVar) : null, true), null), 3);
                FormattedText formattedText2 = this.$cancelElement.e;
                if (formattedText2 != null) {
                    xdf xdfVar2 = this.this$0.f;
                    ief iefVar2 = this.$currencyRules;
                    nohVar = tje.h(tseVar, null, null, new DetailsCardCancelStateMapper$map$2$subtitle$1$1(this.this$0, d9s.c(formattedText2, xdfVar2, iefVar2 != null ? gwk0.h(iefVar2) : null, true), null), 3);
                } else {
                    nohVar = null;
                }
                OrderDetailsCardResponse.CardIcon cardIcon = this.$cancelElement.b;
                qoh h2 = cardIcon != null ? tje.h(tseVar, null, null, new DetailsCardCancelStateMapper$map$2$icon$1$1(this.this$0, cardIcon, null), 3) : null;
                i1 i1Var = this.$cancelElement.c;
                g = i1Var instanceof OrderDetailsCardResponse$AccessoryResponse$Chevron ? ((ufu) this.this$0.b).g(((OrderDetailsCardResponse$AccessoryResponse$Chevron) i1Var).a) : null;
                if (!this.$isCancelDisabled) {
                    this.this$0.e.b("Cancel");
                }
                int i4 = !this.$isCancelDisabled ? 1 : 0;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = nohVar;
                this.L$3 = h2;
                this.L$4 = null;
                this.L$5 = g;
                this.I$0 = i4;
                this.label = 1;
                s = h.s(this);
                if (s != coroutineSingletons) {
                    qohVar = h2;
                    i = i4;
                }
                return coroutineSingletons;
            }
            return obj2;
        }
        if (i2 == 1) {
            i = this.I$0;
            kdc kdcVar3 = (kdc) this.L$5;
            ?? r7 = (noh) this.L$3;
            nohVar = (noh) this.L$2;
            b.b(obj);
            qohVar = r7;
            g = kdcVar3;
            s = obj;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.I$0;
                kdcVar2 = (kdc) this.L$8;
                charSequence4 = (CharSequence) this.L$7;
                CharSequence charSequence5 = (CharSequence) this.L$6;
                b.b(obj);
                charSequence3 = charSequence5;
                k2 = obj;
                obj2 = (BitmapDrawable) k2;
                kdcVar = kdcVar2;
                obj2 = new a5j(i != 0, charSequence3, charSequence4, kdcVar, obj2, new zvi(i3, this.this$0));
                return obj2;
            }
            i = this.I$0;
            charSequence = (CharSequence) this.L$6;
            g = (kdc) this.L$5;
            ?? r8 = (noh) this.L$3;
            b.b(obj);
            qohVar = r8;
            k = obj;
            charSequence2 = (CharSequence) k;
        }
        charSequence = (CharSequence) s;
        if (nohVar != null) {
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = qohVar;
            this.L$4 = null;
            this.L$5 = g;
            this.L$6 = charSequence;
            this.I$0 = i;
            this.label = 2;
            k = nohVar.k(this);
        }
        charSequence2 = "";
        CharSequence charSequence6 = charSequence2;
        charSequence3 = charSequence;
        charSequence4 = charSequence6;
        if (qohVar == null) {
            kdcVar = g;
            obj2 = new a5j(i != 0, charSequence3, charSequence4, kdcVar, obj2, new zvi(i3, this.this$0));
            return obj2;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.L$6 = charSequence3;
        this.L$7 = charSequence4;
        this.L$8 = g;
        this.I$0 = i;
        this.label = 3;
        k2 = qohVar.k(this);
        if (k2 != coroutineSingletons) {
            kdcVar2 = g;
            obj2 = (BitmapDrawable) k2;
            kdcVar = kdcVar2;
            obj2 = new a5j(i != 0, charSequence3, charSequence4, kdcVar, obj2, new zvi(i3, this.this$0));
            return obj2;
        }
        return coroutineSingletons;
    }
}
