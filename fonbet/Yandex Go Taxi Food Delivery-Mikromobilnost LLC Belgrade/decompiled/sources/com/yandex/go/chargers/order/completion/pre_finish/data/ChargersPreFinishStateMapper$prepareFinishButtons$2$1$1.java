package com.yandex.go.chargers.order.completion.pre_finish.data;

import com.yandex.go.chargers.data.model.ChargersOfferButtonDto;
import defpackage.gna;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.u0a;
import defpackage.uo9;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Luo9;", "<anonymous>", "(Ltse;)Luo9;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.completion.pre_finish.data.ChargersPreFinishStateMapper$prepareFinishButtons$2$1$1", f = "ChargersPreFinishStateMapper.kt", l = {58, 59}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersPreFinishStateMapper$prepareFinishButtons$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersOfferButtonDto $button;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPreFinishStateMapper$prepareFinishButtons$2$1$1(a aVar, ChargersOfferButtonDto chargersOfferButtonDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$button = chargersOfferButtonDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersPreFinishStateMapper$prepareFinishButtons$2$1$1(this.this$0, this.$button, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersPreFinishStateMapper$prepareFinishButtons$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x003c, code lost:
    
        if (r2 == r1) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0066  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object w;
        CharSequence charSequence;
        CharSequence charSequence2;
        Object t;
        CharSequence charSequence3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            e eVar = this.this$0.b;
            FormattedText formattedText = this.$button.a;
            int i2 = kyh0.common_continue;
            this.label = 1;
            w = eVar.w(formattedText, i2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                charSequence3 = (CharSequence) this.L$0;
                b.b(obj);
                t = obj;
                charSequence = charSequence3;
                charSequence2 = (CharSequence) t;
                Boolean bool = this.$button.c;
                boolean booleanValue = bool != null ? bool.booleanValue() : true;
                ChargersOfferButtonDto.Action action = this.$button.e;
                return new uo9(charSequence, charSequence2, booleanValue, (action == null ? -1 : gna.a[action.ordinal()]) == 1 ? new u0a(this.$button.d) : null, true, null, false, false, 224);
            }
            b.b(obj);
            w = obj;
        }
        CharSequence charSequence4 = (CharSequence) w;
        FormattedText formattedText2 = this.$button.b;
        if (formattedText2 == null) {
            charSequence = charSequence4;
            charSequence2 = null;
            Boolean bool2 = this.$button.c;
            if (bool2 != null) {
            }
            ChargersOfferButtonDto.Action action2 = this.$button.e;
            return new uo9(charSequence, charSequence2, booleanValue, (action2 == null ? -1 : gna.a[action2.ordinal()]) == 1 ? new u0a(this.$button.d) : null, true, null, false, false, 224);
        }
        e eVar2 = this.this$0.b;
        this.L$0 = charSequence4;
        this.L$1 = null;
        this.label = 2;
        t = eVar2.t(formattedText2, this);
        if (t != coroutineSingletons) {
            charSequence3 = charSequence4;
            charSequence = charSequence3;
            charSequence2 = (CharSequence) t;
            Boolean bool22 = this.$button.c;
            if (bool22 != null) {
            }
            ChargersOfferButtonDto.Action action22 = this.$button.e;
            return new uo9(charSequence, charSequence2, booleanValue, (action22 == null ? -1 : gna.a[action22.ordinal()]) == 1 ? new u0a(this.$button.d) : null, true, null, false, false, 224);
        }
        return coroutineSingletons;
    }
}
