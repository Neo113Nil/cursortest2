package com.yandex.go.transfer_requirement.state.rules;

import android.graphics.drawable.Drawable;
import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import defpackage.bvf0;
import defpackage.c9s;
import defpackage.hkl0;
import defpackage.ny61;
import defpackage.pkf;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class a {
    public final c a;
    public final e b;

    public a(c cVar, e eVar) {
        this.a = cVar;
        this.b = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if (r13 == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, TransferRequirementExperiment.Card.RulesSectionDto.RulesItem rulesItem, Map map, ContinuationImpl continuationImpl) {
        RulesSectionUiStateMapper$mapRulesItem$1 rulesSectionUiStateMapper$mapRulesItem$1;
        int i;
        CharSequence charSequence;
        String str;
        CharSequence charSequence2;
        aVar.getClass();
        if (continuationImpl instanceof RulesSectionUiStateMapper$mapRulesItem$1) {
            rulesSectionUiStateMapper$mapRulesItem$1 = (RulesSectionUiStateMapper$mapRulesItem$1) continuationImpl;
            int i2 = rulesSectionUiStateMapper$mapRulesItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rulesSectionUiStateMapper$mapRulesItem$1.label = i2 - Integer.MIN_VALUE;
                RulesSectionUiStateMapper$mapRulesItem$1 rulesSectionUiStateMapper$mapRulesItem$12 = rulesSectionUiStateMapper$mapRulesItem$1;
                Object obj = rulesSectionUiStateMapper$mapRulesItem$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rulesSectionUiStateMapper$mapRulesItem$12.label;
                UiStateDrawableWrapper uiStateDrawableWrapper = null;
                if (i != 0) {
                    b.b(obj);
                    FormattedText formattedText = rulesItem.a;
                    FormattedText a = formattedText != null ? c9s.a(formattedText, map) : null;
                    if (a == null) {
                        charSequence = null;
                        str = rulesItem.b;
                        if (str != null) {
                            rulesSectionUiStateMapper$mapRulesItem$12.L$0 = null;
                            rulesSectionUiStateMapper$mapRulesItem$12.L$1 = null;
                            rulesSectionUiStateMapper$mapRulesItem$12.L$2 = null;
                            rulesSectionUiStateMapper$mapRulesItem$12.L$3 = charSequence;
                            rulesSectionUiStateMapper$mapRulesItem$12.L$4 = null;
                            rulesSectionUiStateMapper$mapRulesItem$12.label = 2;
                            Object b = aVar.b(str, rulesSectionUiStateMapper$mapRulesItem$12);
                            if (b != obj2) {
                                CharSequence charSequence3 = charSequence;
                                obj = b;
                                charSequence2 = charSequence3;
                                uiStateDrawableWrapper = (UiStateDrawableWrapper) obj;
                                charSequence = charSequence2;
                            }
                            return obj2;
                        }
                        return new hkl0(uiStateDrawableWrapper, charSequence);
                    }
                    c cVar = aVar.a;
                    rulesSectionUiStateMapper$mapRulesItem$12.L$0 = rulesItem;
                    rulesSectionUiStateMapper$mapRulesItem$12.L$1 = null;
                    rulesSectionUiStateMapper$mapRulesItem$12.L$2 = null;
                    rulesSectionUiStateMapper$mapRulesItem$12.L$3 = null;
                    rulesSectionUiStateMapper$mapRulesItem$12.label = 1;
                    obj = c.e(cVar, a, null, false, rulesSectionUiStateMapper$mapRulesItem$12, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence2 = (CharSequence) rulesSectionUiStateMapper$mapRulesItem$12.L$3;
                        b.b(obj);
                        uiStateDrawableWrapper = (UiStateDrawableWrapper) obj;
                        charSequence = charSequence2;
                        return new hkl0(uiStateDrawableWrapper, charSequence);
                    }
                    rulesItem = (TransferRequirementExperiment.Card.RulesSectionDto.RulesItem) rulesSectionUiStateMapper$mapRulesItem$12.L$0;
                    b.b(obj);
                }
                charSequence = (CharSequence) obj;
                str = rulesItem.b;
                if (str != null) {
                }
                return new hkl0(uiStateDrawableWrapper, charSequence);
            }
        }
        rulesSectionUiStateMapper$mapRulesItem$1 = new RulesSectionUiStateMapper$mapRulesItem$1(aVar, continuationImpl);
        RulesSectionUiStateMapper$mapRulesItem$1 rulesSectionUiStateMapper$mapRulesItem$122 = rulesSectionUiStateMapper$mapRulesItem$1;
        Object obj3 = rulesSectionUiStateMapper$mapRulesItem$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rulesSectionUiStateMapper$mapRulesItem$122.label;
        UiStateDrawableWrapper uiStateDrawableWrapper2 = null;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj3;
        str = rulesItem.b;
        if (str != null) {
        }
        return new hkl0(uiStateDrawableWrapper2, charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        RulesSectionUiStateMapper$loadIcon$1 rulesSectionUiStateMapper$loadIcon$1;
        int i;
        if (continuationImpl instanceof RulesSectionUiStateMapper$loadIcon$1) {
            rulesSectionUiStateMapper$loadIcon$1 = (RulesSectionUiStateMapper$loadIcon$1) continuationImpl;
            int i2 = rulesSectionUiStateMapper$loadIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rulesSectionUiStateMapper$loadIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rulesSectionUiStateMapper$loadIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rulesSectionUiStateMapper$loadIcon$1.label;
                if (i != 0) {
                    b.b(obj);
                    rulesSectionUiStateMapper$loadIcon$1.L$0 = str;
                    rulesSectionUiStateMapper$loadIcon$1.label = 1;
                    obj = e.f(this.b, str, null, rulesSectionUiStateMapper$loadIcon$1, 6);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) rulesSectionUiStateMapper$loadIcon$1.L$0;
                    b.b(obj);
                }
                return pkf.g((Drawable) obj, str, null);
            }
        }
        rulesSectionUiStateMapper$loadIcon$1 = new RulesSectionUiStateMapper$loadIcon$1(this, continuationImpl);
        Object obj2 = rulesSectionUiStateMapper$loadIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rulesSectionUiStateMapper$loadIcon$1.label;
        if (i != 0) {
        }
        return pkf.g((Drawable) obj2, str, null);
    }

    public final Object c(TransferRequirementExperiment.Card.RulesSectionDto rulesSectionDto, Map map, Continuation continuation) {
        return bvf0.n(new RulesSectionUiStateMapper$map$2(rulesSectionDto, map, this, null), continuation);
    }
}
