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
import defpackage.vzz;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lvzz;", "<anonymous>", "(Ltse;)Lvzz;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.state.service_section.ServiceSectionUiStateMapper$mapLuggageToggle$2", f = "ServiceSectionUiStateMapper.kt", l = {161, 162, HProv.PP_HANDLE_COUNT, 165}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ServiceSectionUiStateMapper$mapLuggageToggle$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $currentLuggageSelected;
    final /* synthetic */ Map<String, String> $l10n;
    final /* synthetic */ TransferRequirementExperiment.Card.ServiceSectionDto.LuggageInfoDto $luggageInfoDto;
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
    boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceSectionUiStateMapper$mapLuggageToggle$2(TransferRequirementExperiment.Card.ServiceSectionDto.LuggageInfoDto luggageInfoDto, Map map, boolean z, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$luggageInfoDto = luggageInfoDto;
        this.$l10n = map;
        this.$currentLuggageSelected = z;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ServiceSectionUiStateMapper$mapLuggageToggle$2 serviceSectionUiStateMapper$mapLuggageToggle$2 = new ServiceSectionUiStateMapper$mapLuggageToggle$2(this.$luggageInfoDto, this.$l10n, this.$currentLuggageSelected, this.this$0, continuation);
        serviceSectionUiStateMapper$mapLuggageToggle$2.L$0 = obj;
        return serviceSectionUiStateMapper$mapLuggageToggle$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ServiceSectionUiStateMapper$mapLuggageToggle$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0180, code lost:
    
        if (r5 == r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0159, code lost:
    
        if (r6 == r2) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0163  */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r3v26, types: [noh] */
    /* JADX WARN: Type inference failed for: r6v10, types: [noh] */
    /* JADX WARN: Type inference failed for: r7v5, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qoh h;
        qoh h2;
        noh h3;
        noh nohVar;
        CharSequence charSequence;
        Object s;
        qoh qohVar;
        noh nohVar2;
        CharSequence charSequence2;
        CharSequence charSequence3;
        Object k;
        CharSequence charSequence4;
        CharSequence charSequence5;
        UiStateDrawableWrapper uiStateDrawableWrapper;
        Object k2;
        CharSequence charSequence6;
        UiStateDrawableWrapper uiStateDrawableWrapper2;
        boolean z;
        Object k3;
        CharSequence charSequence7;
        UiStateDrawableWrapper uiStateDrawableWrapper3;
        boolean z2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        tzz tzzVar = null;
        if (i == 0) {
            b.b(obj);
            FormattedText formattedText = this.$luggageInfoDto.b;
            FormattedText a = formattedText != null ? c9s.a(formattedText, this.$l10n) : null;
            qoh h4 = a != null ? tje.h(tseVar, null, null, new ServiceSectionUiStateMapper$mapLuggageToggle$2$title$1$1(this.this$0, a, null), 3) : null;
            FormattedText formattedText2 = this.$luggageInfoDto.c;
            FormattedText a2 = formattedText2 != null ? c9s.a(formattedText2, this.$l10n) : null;
            h = a2 != null ? tje.h(tseVar, null, null, new ServiceSectionUiStateMapper$mapLuggageToggle$2$subtitle$1$1(this.this$0, a2, null), 3) : null;
            String str = this.$luggageInfoDto.d;
            h2 = str != null ? tje.h(tseVar, null, null, new ServiceSectionUiStateMapper$mapLuggageToggle$2$leadIcon$1$1(this.this$0, str, null), 3) : null;
            TransferRequirementExperiment.Card.ServiceSectionDto.BubbleModalDto bubbleModalDto = this.$luggageInfoDto.g;
            h3 = bubbleModalDto != null ? tje.h(tseVar, null, null, new ServiceSectionUiStateMapper$mapLuggageToggle$2$bubble$1$1(bubbleModalDto, this.this$0, this.$l10n, null), 3) : null;
            if (h4 != null) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = h;
                this.L$5 = h2;
                this.L$6 = h3;
                this.label = 1;
                s = h4.s(this);
                if (s != coroutineSingletons) {
                    qohVar = h;
                }
                return coroutineSingletons;
            }
            nohVar = h3;
            charSequence = null;
            if (h == null) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = h2;
                this.L$6 = nohVar;
                this.L$7 = charSequence;
                this.label = 2;
                k = h.k(this);
            } else {
                nohVar2 = nohVar;
                charSequence2 = charSequence;
                charSequence3 = null;
                if (h2 == null) {
                }
            }
        } else if (i == 1) {
            h3 = (noh) this.L$6;
            ?? r3 = (noh) this.L$5;
            ?? r7 = (noh) this.L$4;
            b.b(obj);
            h2 = r3;
            s = obj;
            qohVar = r7;
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = this.Z$0;
                    ?? r2 = (Drawable) this.L$9;
                    charSequence4 = (CharSequence) this.L$8;
                    charSequence7 = (CharSequence) this.L$7;
                    b.b(obj);
                    k3 = obj;
                    uiStateDrawableWrapper3 = r2;
                    tzzVar = (tzz) k3;
                    z = z2;
                    uiStateDrawableWrapper2 = uiStateDrawableWrapper3;
                    charSequence6 = charSequence7;
                    return new vzz(charSequence6, charSequence4, uiStateDrawableWrapper2, z, tzzVar);
                }
                charSequence3 = (CharSequence) this.L$8;
                charSequence2 = (CharSequence) this.L$7;
                noh nohVar3 = (noh) this.L$6;
                b.b(obj);
                nohVar2 = nohVar3;
                k2 = obj;
                uiStateDrawableWrapper = (UiStateDrawableWrapper) k2;
                CharSequence charSequence8 = charSequence2;
                charSequence4 = charSequence3;
                charSequence5 = charSequence8;
                boolean z3 = this.$currentLuggageSelected;
                if (nohVar2 != null) {
                    charSequence6 = charSequence5;
                    uiStateDrawableWrapper2 = uiStateDrawableWrapper;
                    z = z3;
                    return new vzz(charSequence6, charSequence4, uiStateDrawableWrapper2, z, tzzVar);
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = charSequence5;
                this.L$8 = charSequence4;
                this.L$9 = uiStateDrawableWrapper;
                this.Z$0 = z3;
                this.label = 4;
                k3 = nohVar2.k(this);
                if (k3 != coroutineSingletons) {
                    charSequence7 = charSequence5;
                    uiStateDrawableWrapper3 = uiStateDrawableWrapper;
                    z2 = z3;
                    tzzVar = (tzz) k3;
                    z = z2;
                    uiStateDrawableWrapper2 = uiStateDrawableWrapper3;
                    charSequence6 = charSequence7;
                    return new vzz(charSequence6, charSequence4, uiStateDrawableWrapper2, z, tzzVar);
                }
                return coroutineSingletons;
            }
            charSequence = (CharSequence) this.L$7;
            nohVar = (noh) this.L$6;
            ?? r6 = (noh) this.L$5;
            b.b(obj);
            h2 = r6;
            k = obj;
            noh nohVar4 = nohVar;
            charSequence2 = charSequence;
            charSequence3 = (CharSequence) k;
            nohVar2 = nohVar4;
            if (h2 == null) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = nohVar2;
                this.L$7 = charSequence2;
                this.L$8 = charSequence3;
                this.label = 3;
                k2 = h2.k(this);
            } else {
                CharSequence charSequence9 = charSequence2;
                charSequence4 = charSequence3;
                charSequence5 = charSequence9;
                uiStateDrawableWrapper = null;
                boolean z32 = this.$currentLuggageSelected;
                if (nohVar2 != null) {
                }
            }
        }
        CharSequence charSequence10 = (CharSequence) s;
        nohVar = h3;
        charSequence = charSequence10;
        h = qohVar;
        if (h == null) {
        }
    }
}
