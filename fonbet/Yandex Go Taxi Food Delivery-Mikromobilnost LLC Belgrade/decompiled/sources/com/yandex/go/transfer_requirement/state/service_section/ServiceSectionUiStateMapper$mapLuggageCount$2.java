package com.yandex.go.transfer_requirement.state.service_section;

import android.graphics.drawable.Drawable;
import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import defpackage.c9s;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tzz;
import defpackage.uzz;
import defpackage.wls;
import defpackage.y6i0;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Luzz;", "<anonymous>", "(Ltse;)Luzz;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.state.service_section.ServiceSectionUiStateMapper$mapLuggageCount$2", f = "ServiceSectionUiStateMapper.kt", l = {182, 183, 184, 187}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ServiceSectionUiStateMapper$mapLuggageCount$2 extends SuspendLambda implements wls {
    final /* synthetic */ int $currentCount;
    final /* synthetic */ Map<String, String> $l10n;
    final /* synthetic */ TransferRequirementExperiment.Card.ServiceSectionDto.LuggageInfoDto $luggageInfoDto;
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    Object L$1;
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
    public ServiceSectionUiStateMapper$mapLuggageCount$2(TransferRequirementExperiment.Card.ServiceSectionDto.LuggageInfoDto luggageInfoDto, Map map, int i, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$luggageInfoDto = luggageInfoDto;
        this.$l10n = map;
        this.$currentCount = i;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ServiceSectionUiStateMapper$mapLuggageCount$2 serviceSectionUiStateMapper$mapLuggageCount$2 = new ServiceSectionUiStateMapper$mapLuggageCount$2(this.$luggageInfoDto, this.$l10n, this.$currentCount, this.this$0, continuation);
        serviceSectionUiStateMapper$mapLuggageCount$2.L$0 = obj;
        return serviceSectionUiStateMapper$mapLuggageCount$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ServiceSectionUiStateMapper$mapLuggageCount$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x019e, code lost:
    
        if (r7 == r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0174, code lost:
    
        if (r5 == r2) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0180  */
    /* JADX WARN: Type inference failed for: r6v12, types: [noh] */
    /* JADX WARN: Type inference failed for: r6v15, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        qoh h2;
        noh nohVar;
        CharSequence charSequence;
        int i;
        Object s;
        CharSequence charSequence2;
        CharSequence charSequence3;
        Object k;
        noh nohVar2;
        CharSequence charSequence4;
        CharSequence charSequence5;
        Drawable drawable;
        Object k2;
        CharSequence charSequence6;
        CharSequence charSequence7;
        int i2;
        Object k3;
        CharSequence charSequence8;
        CharSequence charSequence9;
        int i3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        tzz tzzVar = null;
        if (i4 == 0) {
            b.b(obj);
            FormattedText formattedText = this.$luggageInfoDto.b;
            FormattedText a = formattedText != null ? c9s.a(formattedText, this.$l10n) : null;
            qoh h3 = a != null ? tje.h(tseVar, null, null, new ServiceSectionUiStateMapper$mapLuggageCount$2$title$1$1(this.this$0, a, null), 3) : null;
            FormattedText formattedText2 = this.$luggageInfoDto.c;
            FormattedText a2 = formattedText2 != null ? c9s.a(formattedText2, this.$l10n) : null;
            h = a2 != null ? tje.h(tseVar, null, null, new ServiceSectionUiStateMapper$mapLuggageCount$2$subtitle$1$1(this.this$0, a2, null), 3) : null;
            String str = this.$luggageInfoDto.d;
            h2 = str != null ? tje.h(tseVar, null, null, new ServiceSectionUiStateMapper$mapLuggageCount$2$leadIcon$1$1(this.this$0, str, null), 3) : null;
            Integer num = this.$luggageInfoDto.f;
            int d = y6i0.d(num != null ? num.intValue() : 3, 1, 3);
            TransferRequirementExperiment.Card.ServiceSectionDto.BubbleModalDto bubbleModalDto = this.$luggageInfoDto.g;
            qoh h4 = bubbleModalDto != null ? tje.h(tseVar, null, null, new ServiceSectionUiStateMapper$mapLuggageCount$2$bubble$1$1(bubbleModalDto, this.this$0, this.$l10n, null), 3) : null;
            if (h3 != null) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = h;
                this.L$5 = h2;
                this.L$6 = h4;
                this.I$0 = d;
                this.label = 1;
                s = h3.s(this);
                if (s != coroutineSingletons) {
                    nohVar = h4;
                    i = d;
                }
                return coroutineSingletons;
            }
            nohVar = h4;
            charSequence = null;
            i = d;
            if (h == null) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = h2;
                this.L$6 = nohVar;
                this.L$7 = charSequence;
                this.I$0 = i;
                this.label = 2;
                k = h.k(this);
            } else {
                charSequence2 = charSequence;
                charSequence3 = null;
                if (h2 == null) {
                }
            }
        } else if (i4 == 1) {
            i = this.I$0;
            noh nohVar3 = (noh) this.L$6;
            ?? r6 = (noh) this.L$5;
            h = (noh) this.L$4;
            b.b(obj);
            h2 = r6;
            nohVar = nohVar3;
            s = obj;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = this.I$2;
                    i3 = this.I$1;
                    drawable = (Drawable) this.L$9;
                    charSequence8 = (CharSequence) this.L$8;
                    charSequence9 = (CharSequence) this.L$7;
                    b.b(obj);
                    k3 = obj;
                    tzzVar = (tzz) k3;
                    i2 = i3;
                    charSequence6 = charSequence8;
                    charSequence7 = charSequence9;
                    return new uzz(charSequence7, charSequence6, drawable, i2, i, tzzVar);
                }
                i = this.I$0;
                charSequence3 = (CharSequence) this.L$8;
                charSequence2 = (CharSequence) this.L$7;
                nohVar = (noh) this.L$6;
                b.b(obj);
                k2 = obj;
                CharSequence charSequence10 = charSequence2;
                charSequence5 = charSequence3;
                drawable = (UiStateDrawableWrapper) k2;
                nohVar2 = nohVar;
                charSequence4 = charSequence10;
                int d2 = y6i0.d(this.$currentCount, 0, i);
                if (nohVar2 != null) {
                    charSequence6 = charSequence5;
                    charSequence7 = charSequence4;
                    i2 = d2;
                    return new uzz(charSequence7, charSequence6, drawable, i2, i, tzzVar);
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = charSequence4;
                this.L$8 = charSequence5;
                this.L$9 = drawable;
                this.I$0 = i;
                this.I$1 = d2;
                this.I$2 = i;
                this.label = 4;
                k3 = nohVar2.k(this);
                if (k3 != coroutineSingletons) {
                    charSequence8 = charSequence5;
                    charSequence9 = charSequence4;
                    i3 = d2;
                    tzzVar = (tzz) k3;
                    i2 = i3;
                    charSequence6 = charSequence8;
                    charSequence7 = charSequence9;
                    return new uzz(charSequence7, charSequence6, drawable, i2, i, tzzVar);
                }
                return coroutineSingletons;
            }
            i = this.I$0;
            charSequence = (CharSequence) this.L$7;
            noh nohVar4 = (noh) this.L$6;
            ?? r62 = (noh) this.L$5;
            b.b(obj);
            h2 = r62;
            nohVar = nohVar4;
            k = obj;
            CharSequence charSequence11 = (CharSequence) k;
            charSequence2 = charSequence;
            charSequence3 = charSequence11;
            if (h2 == null) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = nohVar;
                this.L$7 = charSequence2;
                this.L$8 = charSequence3;
                this.I$0 = i;
                this.label = 3;
                k2 = h2.k(this);
            } else {
                nohVar2 = nohVar;
                charSequence4 = charSequence2;
                charSequence5 = charSequence3;
                drawable = null;
                int d22 = y6i0.d(this.$currentCount, 0, i);
                if (nohVar2 != null) {
                }
            }
        }
        charSequence = (CharSequence) s;
        if (h == null) {
        }
    }
}
