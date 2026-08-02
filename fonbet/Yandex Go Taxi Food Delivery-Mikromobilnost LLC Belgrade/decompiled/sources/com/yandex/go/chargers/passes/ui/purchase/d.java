package com.yandex.go.chargers.passes.ui.purchase;

import defpackage.aja;
import defpackage.bia;
import defpackage.ny61;
import defpackage.yia;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class d {
    public final ru.yandex.taxi.widget.c a;

    public d(ru.yandex.taxi.widget.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r11 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(bia biaVar, ContinuationImpl continuationImpl) {
        ChargersPassesPurchaseUiStateMapper$mapFail$1 chargersPassesPurchaseUiStateMapper$mapFail$1;
        int i;
        FormattedText formattedText;
        bia biaVar2;
        CharSequence charSequence;
        CharSequence charSequence2;
        Object i2;
        CharSequence charSequence3;
        if (continuationImpl instanceof ChargersPassesPurchaseUiStateMapper$mapFail$1) {
            chargersPassesPurchaseUiStateMapper$mapFail$1 = (ChargersPassesPurchaseUiStateMapper$mapFail$1) continuationImpl;
            int i3 = chargersPassesPurchaseUiStateMapper$mapFail$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                chargersPassesPurchaseUiStateMapper$mapFail$1.label = i3 - Integer.MIN_VALUE;
                Object obj = chargersPassesPurchaseUiStateMapper$mapFail$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesPurchaseUiStateMapper$mapFail$1.label;
                ru.yandex.taxi.widget.c cVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText2 = biaVar.a;
                    chargersPassesPurchaseUiStateMapper$mapFail$1.L$0 = biaVar;
                    chargersPassesPurchaseUiStateMapper$mapFail$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, chargersPassesPurchaseUiStateMapper$mapFail$1, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            charSequence3 = (CharSequence) chargersPassesPurchaseUiStateMapper$mapFail$1.L$2;
                            charSequence = (CharSequence) chargersPassesPurchaseUiStateMapper$mapFail$1.L$1;
                            kotlin.b.b(obj);
                            return new yia(charSequence, charSequence3, (CharSequence) obj);
                        }
                        charSequence = (CharSequence) chargersPassesPurchaseUiStateMapper$mapFail$1.L$2;
                        biaVar2 = (bia) chargersPassesPurchaseUiStateMapper$mapFail$1.L$0;
                        kotlin.b.b(obj);
                        charSequence2 = (CharSequence) obj;
                        FormattedText formattedText3 = biaVar2.c;
                        chargersPassesPurchaseUiStateMapper$mapFail$1.L$0 = null;
                        chargersPassesPurchaseUiStateMapper$mapFail$1.L$1 = charSequence;
                        chargersPassesPurchaseUiStateMapper$mapFail$1.L$2 = charSequence2;
                        chargersPassesPurchaseUiStateMapper$mapFail$1.label = 3;
                        i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText3, null, chargersPassesPurchaseUiStateMapper$mapFail$1, 30);
                        if (i2 != coroutineSingletons) {
                            CharSequence charSequence4 = charSequence2;
                            obj = i2;
                            charSequence3 = charSequence4;
                            return new yia(charSequence, charSequence3, (CharSequence) obj);
                        }
                        return coroutineSingletons;
                    }
                    biaVar = (bia) chargersPassesPurchaseUiStateMapper$mapFail$1.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence5 = (CharSequence) obj;
                formattedText = biaVar.b;
                if (formattedText != null) {
                    biaVar2 = biaVar;
                    charSequence = charSequence5;
                    charSequence2 = null;
                    FormattedText formattedText32 = biaVar2.c;
                    chargersPassesPurchaseUiStateMapper$mapFail$1.L$0 = null;
                    chargersPassesPurchaseUiStateMapper$mapFail$1.L$1 = charSequence;
                    chargersPassesPurchaseUiStateMapper$mapFail$1.L$2 = charSequence2;
                    chargersPassesPurchaseUiStateMapper$mapFail$1.label = 3;
                    i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText32, null, chargersPassesPurchaseUiStateMapper$mapFail$1, 30);
                    if (i2 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                chargersPassesPurchaseUiStateMapper$mapFail$1.L$0 = biaVar;
                chargersPassesPurchaseUiStateMapper$mapFail$1.L$1 = null;
                chargersPassesPurchaseUiStateMapper$mapFail$1.L$2 = charSequence5;
                chargersPassesPurchaseUiStateMapper$mapFail$1.label = 2;
                Object i4 = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, chargersPassesPurchaseUiStateMapper$mapFail$1, 30);
                if (i4 != coroutineSingletons) {
                    biaVar2 = biaVar;
                    charSequence = charSequence5;
                    obj = i4;
                    charSequence2 = (CharSequence) obj;
                    FormattedText formattedText322 = biaVar2.c;
                    chargersPassesPurchaseUiStateMapper$mapFail$1.L$0 = null;
                    chargersPassesPurchaseUiStateMapper$mapFail$1.L$1 = charSequence;
                    chargersPassesPurchaseUiStateMapper$mapFail$1.L$2 = charSequence2;
                    chargersPassesPurchaseUiStateMapper$mapFail$1.label = 3;
                    i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText322, null, chargersPassesPurchaseUiStateMapper$mapFail$1, 30);
                    if (i2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        chargersPassesPurchaseUiStateMapper$mapFail$1 = new ChargersPassesPurchaseUiStateMapper$mapFail$1(this, continuationImpl);
        Object obj2 = chargersPassesPurchaseUiStateMapper$mapFail$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesPurchaseUiStateMapper$mapFail$1.label;
        ru.yandex.taxi.widget.c cVar2 = this.a;
        if (i != 0) {
        }
        CharSequence charSequence52 = (CharSequence) obj2;
        formattedText = biaVar.b;
        if (formattedText != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r11 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(bia biaVar, ContinuationImpl continuationImpl) {
        ChargersPassesPurchaseUiStateMapper$mapSuccess$1 chargersPassesPurchaseUiStateMapper$mapSuccess$1;
        int i;
        FormattedText formattedText;
        bia biaVar2;
        CharSequence charSequence;
        CharSequence charSequence2;
        Object i2;
        CharSequence charSequence3;
        if (continuationImpl instanceof ChargersPassesPurchaseUiStateMapper$mapSuccess$1) {
            chargersPassesPurchaseUiStateMapper$mapSuccess$1 = (ChargersPassesPurchaseUiStateMapper$mapSuccess$1) continuationImpl;
            int i3 = chargersPassesPurchaseUiStateMapper$mapSuccess$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                chargersPassesPurchaseUiStateMapper$mapSuccess$1.label = i3 - Integer.MIN_VALUE;
                Object obj = chargersPassesPurchaseUiStateMapper$mapSuccess$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesPurchaseUiStateMapper$mapSuccess$1.label;
                ru.yandex.taxi.widget.c cVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText2 = biaVar.a;
                    chargersPassesPurchaseUiStateMapper$mapSuccess$1.L$0 = biaVar;
                    chargersPassesPurchaseUiStateMapper$mapSuccess$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, chargersPassesPurchaseUiStateMapper$mapSuccess$1, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            charSequence3 = (CharSequence) chargersPassesPurchaseUiStateMapper$mapSuccess$1.L$2;
                            charSequence = (CharSequence) chargersPassesPurchaseUiStateMapper$mapSuccess$1.L$1;
                            kotlin.b.b(obj);
                            return new aja(charSequence, charSequence3, (CharSequence) obj);
                        }
                        charSequence = (CharSequence) chargersPassesPurchaseUiStateMapper$mapSuccess$1.L$2;
                        biaVar2 = (bia) chargersPassesPurchaseUiStateMapper$mapSuccess$1.L$0;
                        kotlin.b.b(obj);
                        charSequence2 = (CharSequence) obj;
                        FormattedText formattedText3 = biaVar2.c;
                        chargersPassesPurchaseUiStateMapper$mapSuccess$1.L$0 = null;
                        chargersPassesPurchaseUiStateMapper$mapSuccess$1.L$1 = charSequence;
                        chargersPassesPurchaseUiStateMapper$mapSuccess$1.L$2 = charSequence2;
                        chargersPassesPurchaseUiStateMapper$mapSuccess$1.label = 3;
                        i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText3, null, chargersPassesPurchaseUiStateMapper$mapSuccess$1, 30);
                        if (i2 != coroutineSingletons) {
                            CharSequence charSequence4 = charSequence2;
                            obj = i2;
                            charSequence3 = charSequence4;
                            return new aja(charSequence, charSequence3, (CharSequence) obj);
                        }
                        return coroutineSingletons;
                    }
                    biaVar = (bia) chargersPassesPurchaseUiStateMapper$mapSuccess$1.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence5 = (CharSequence) obj;
                formattedText = biaVar.b;
                if (formattedText != null) {
                    biaVar2 = biaVar;
                    charSequence = charSequence5;
                    charSequence2 = null;
                    FormattedText formattedText32 = biaVar2.c;
                    chargersPassesPurchaseUiStateMapper$mapSuccess$1.L$0 = null;
                    chargersPassesPurchaseUiStateMapper$mapSuccess$1.L$1 = charSequence;
                    chargersPassesPurchaseUiStateMapper$mapSuccess$1.L$2 = charSequence2;
                    chargersPassesPurchaseUiStateMapper$mapSuccess$1.label = 3;
                    i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText32, null, chargersPassesPurchaseUiStateMapper$mapSuccess$1, 30);
                    if (i2 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                chargersPassesPurchaseUiStateMapper$mapSuccess$1.L$0 = biaVar;
                chargersPassesPurchaseUiStateMapper$mapSuccess$1.L$1 = null;
                chargersPassesPurchaseUiStateMapper$mapSuccess$1.L$2 = charSequence5;
                chargersPassesPurchaseUiStateMapper$mapSuccess$1.label = 2;
                Object i4 = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, chargersPassesPurchaseUiStateMapper$mapSuccess$1, 30);
                if (i4 != coroutineSingletons) {
                    biaVar2 = biaVar;
                    charSequence = charSequence5;
                    obj = i4;
                    charSequence2 = (CharSequence) obj;
                    FormattedText formattedText322 = biaVar2.c;
                    chargersPassesPurchaseUiStateMapper$mapSuccess$1.L$0 = null;
                    chargersPassesPurchaseUiStateMapper$mapSuccess$1.L$1 = charSequence;
                    chargersPassesPurchaseUiStateMapper$mapSuccess$1.L$2 = charSequence2;
                    chargersPassesPurchaseUiStateMapper$mapSuccess$1.label = 3;
                    i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText322, null, chargersPassesPurchaseUiStateMapper$mapSuccess$1, 30);
                    if (i2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        chargersPassesPurchaseUiStateMapper$mapSuccess$1 = new ChargersPassesPurchaseUiStateMapper$mapSuccess$1(this, continuationImpl);
        Object obj2 = chargersPassesPurchaseUiStateMapper$mapSuccess$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesPurchaseUiStateMapper$mapSuccess$1.label;
        ru.yandex.taxi.widget.c cVar2 = this.a;
        if (i != 0) {
        }
        CharSequence charSequence52 = (CharSequence) obj2;
        formattedText = biaVar.b;
        if (formattedText != null) {
        }
    }
}
