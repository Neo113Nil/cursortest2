package com.yandex.go.address_confirmation.modal;

import com.yandex.go.address.models.Address;
import defpackage.hbt0;
import defpackage.ny61;
import defpackage.pbt0;
import defpackage.q5z;
import defpackage.rbt0;
import defpackage.tbt0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.map_object.i;

/* loaded from: classes12.dex */
public final class a {
    public final ru.yandex.taxi.widget.c a;

    public a(ru.yandex.taxi.widget.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        if (r2 == r4) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(hbt0 hbt0Var, rbt0 rbt0Var, ContinuationImpl continuationImpl) {
        SourceAddressConfirmationMapper$mapToUiState$1 sourceAddressConfirmationMapper$mapToUiState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        rbt0 rbt0Var2;
        Object i2;
        hbt0 hbt0Var2;
        CharSequence charSequence;
        Object i3;
        CharSequence charSequence2;
        CharSequence charSequence3;
        rbt0 rbt0Var3;
        CharSequence charSequence4;
        rbt0 rbt0Var4;
        hbt0 hbt0Var3;
        pbt0 pbt0Var;
        hbt0 hbt0Var4 = hbt0Var;
        if (continuationImpl instanceof SourceAddressConfirmationMapper$mapToUiState$1) {
            sourceAddressConfirmationMapper$mapToUiState$1 = (SourceAddressConfirmationMapper$mapToUiState$1) continuationImpl;
            int i4 = sourceAddressConfirmationMapper$mapToUiState$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                sourceAddressConfirmationMapper$mapToUiState$1.label = i4 - Integer.MIN_VALUE;
                Object obj = sourceAddressConfirmationMapper$mapToUiState$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourceAddressConfirmationMapper$mapToUiState$1.label;
                ru.yandex.taxi.widget.c cVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = hbt0Var4.b.a;
                    sourceAddressConfirmationMapper$mapToUiState$1.L$0 = hbt0Var4;
                    rbt0Var2 = rbt0Var;
                    sourceAddressConfirmationMapper$mapToUiState$1.L$1 = rbt0Var2;
                    sourceAddressConfirmationMapper$mapToUiState$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, sourceAddressConfirmationMapper$mapToUiState$1, 30);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            charSequence = (CharSequence) sourceAddressConfirmationMapper$mapToUiState$1.L$2;
                            rbt0Var2 = (rbt0) sourceAddressConfirmationMapper$mapToUiState$1.L$1;
                            hbt0Var2 = (hbt0) sourceAddressConfirmationMapper$mapToUiState$1.L$0;
                            kotlin.b.b(obj);
                            CharSequence charSequence5 = (CharSequence) obj;
                            FormattedText formattedText2 = hbt0Var2.b.d.a;
                            sourceAddressConfirmationMapper$mapToUiState$1.L$0 = hbt0Var2;
                            sourceAddressConfirmationMapper$mapToUiState$1.L$1 = rbt0Var2;
                            sourceAddressConfirmationMapper$mapToUiState$1.L$2 = charSequence;
                            sourceAddressConfirmationMapper$mapToUiState$1.L$3 = charSequence5;
                            sourceAddressConfirmationMapper$mapToUiState$1.label = 3;
                            i3 = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, sourceAddressConfirmationMapper$mapToUiState$1, 30);
                            if (i3 != coroutineSingletons) {
                                rbt0 rbt0Var5 = rbt0Var2;
                                charSequence2 = charSequence;
                                charSequence3 = charSequence5;
                                obj = i3;
                                rbt0Var3 = rbt0Var5;
                                i iVar = hbt0Var2.b;
                                pbt0 pbt0Var2 = new pbt0((CharSequence) obj, iVar.d.b);
                                FormattedText formattedText3 = iVar.e.a;
                                sourceAddressConfirmationMapper$mapToUiState$1.L$0 = hbt0Var2;
                                sourceAddressConfirmationMapper$mapToUiState$1.L$1 = rbt0Var3;
                                sourceAddressConfirmationMapper$mapToUiState$1.L$2 = charSequence2;
                                sourceAddressConfirmationMapper$mapToUiState$1.L$3 = charSequence3;
                                sourceAddressConfirmationMapper$mapToUiState$1.L$4 = pbt0Var2;
                                sourceAddressConfirmationMapper$mapToUiState$1.label = 4;
                                obj = ru.yandex.taxi.widget.c.i(cVar, formattedText3, null, sourceAddressConfirmationMapper$mapToUiState$1, 30);
                                if (obj != coroutineSingletons) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            pbt0 pbt0Var3 = (pbt0) sourceAddressConfirmationMapper$mapToUiState$1.L$4;
                            charSequence3 = (CharSequence) sourceAddressConfirmationMapper$mapToUiState$1.L$3;
                            CharSequence charSequence6 = (CharSequence) sourceAddressConfirmationMapper$mapToUiState$1.L$2;
                            rbt0 rbt0Var6 = (rbt0) sourceAddressConfirmationMapper$mapToUiState$1.L$1;
                            hbt0Var3 = (hbt0) sourceAddressConfirmationMapper$mapToUiState$1.L$0;
                            kotlin.b.b(obj);
                            pbt0Var = pbt0Var3;
                            charSequence4 = charSequence6;
                            rbt0Var4 = rbt0Var6;
                            CharSequence charSequence7 = charSequence3;
                            i iVar2 = hbt0Var3.b;
                            Address address = hbt0Var3.a.a;
                            return new tbt0(charSequence4, charSequence7, pbt0Var, new pbt0((CharSequence) obj, iVar2.e.b), q5z.F(address), q5z.D(address), rbt0Var4);
                        }
                        charSequence3 = (CharSequence) sourceAddressConfirmationMapper$mapToUiState$1.L$3;
                        charSequence2 = (CharSequence) sourceAddressConfirmationMapper$mapToUiState$1.L$2;
                        rbt0Var3 = (rbt0) sourceAddressConfirmationMapper$mapToUiState$1.L$1;
                        hbt0Var2 = (hbt0) sourceAddressConfirmationMapper$mapToUiState$1.L$0;
                        kotlin.b.b(obj);
                        i iVar3 = hbt0Var2.b;
                        pbt0 pbt0Var22 = new pbt0((CharSequence) obj, iVar3.d.b);
                        FormattedText formattedText32 = iVar3.e.a;
                        sourceAddressConfirmationMapper$mapToUiState$1.L$0 = hbt0Var2;
                        sourceAddressConfirmationMapper$mapToUiState$1.L$1 = rbt0Var3;
                        sourceAddressConfirmationMapper$mapToUiState$1.L$2 = charSequence2;
                        sourceAddressConfirmationMapper$mapToUiState$1.L$3 = charSequence3;
                        sourceAddressConfirmationMapper$mapToUiState$1.L$4 = pbt0Var22;
                        sourceAddressConfirmationMapper$mapToUiState$1.label = 4;
                        obj = ru.yandex.taxi.widget.c.i(cVar, formattedText32, null, sourceAddressConfirmationMapper$mapToUiState$1, 30);
                        if (obj != coroutineSingletons) {
                            charSequence4 = charSequence2;
                            rbt0Var4 = rbt0Var3;
                            hbt0Var3 = hbt0Var2;
                            pbt0Var = pbt0Var22;
                            CharSequence charSequence72 = charSequence3;
                            i iVar22 = hbt0Var3.b;
                            Address address2 = hbt0Var3.a.a;
                            return new tbt0(charSequence4, charSequence72, pbt0Var, new pbt0((CharSequence) obj, iVar22.e.b), q5z.F(address2), q5z.D(address2), rbt0Var4);
                        }
                        return coroutineSingletons;
                    }
                    rbt0 rbt0Var7 = (rbt0) sourceAddressConfirmationMapper$mapToUiState$1.L$1;
                    hbt0 hbt0Var5 = (hbt0) sourceAddressConfirmationMapper$mapToUiState$1.L$0;
                    kotlin.b.b(obj);
                    rbt0Var2 = rbt0Var7;
                    hbt0Var4 = hbt0Var5;
                }
                CharSequence charSequence8 = (CharSequence) obj;
                FormattedText formattedText4 = hbt0Var4.b.b;
                sourceAddressConfirmationMapper$mapToUiState$1.L$0 = hbt0Var4;
                sourceAddressConfirmationMapper$mapToUiState$1.L$1 = rbt0Var2;
                sourceAddressConfirmationMapper$mapToUiState$1.L$2 = charSequence8;
                sourceAddressConfirmationMapper$mapToUiState$1.label = 2;
                i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText4, null, sourceAddressConfirmationMapper$mapToUiState$1, 30);
                if (i2 != coroutineSingletons) {
                    hbt0Var2 = hbt0Var4;
                    charSequence = charSequence8;
                    obj = i2;
                    CharSequence charSequence52 = (CharSequence) obj;
                    FormattedText formattedText22 = hbt0Var2.b.d.a;
                    sourceAddressConfirmationMapper$mapToUiState$1.L$0 = hbt0Var2;
                    sourceAddressConfirmationMapper$mapToUiState$1.L$1 = rbt0Var2;
                    sourceAddressConfirmationMapper$mapToUiState$1.L$2 = charSequence;
                    sourceAddressConfirmationMapper$mapToUiState$1.L$3 = charSequence52;
                    sourceAddressConfirmationMapper$mapToUiState$1.label = 3;
                    i3 = ru.yandex.taxi.widget.c.i(cVar, formattedText22, null, sourceAddressConfirmationMapper$mapToUiState$1, 30);
                    if (i3 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        sourceAddressConfirmationMapper$mapToUiState$1 = new SourceAddressConfirmationMapper$mapToUiState$1(this, continuationImpl);
        Object obj2 = sourceAddressConfirmationMapper$mapToUiState$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourceAddressConfirmationMapper$mapToUiState$1.label;
        ru.yandex.taxi.widget.c cVar2 = this.a;
        if (i != 0) {
        }
        CharSequence charSequence82 = (CharSequence) obj2;
        FormattedText formattedText42 = hbt0Var4.b.b;
        sourceAddressConfirmationMapper$mapToUiState$1.L$0 = hbt0Var4;
        sourceAddressConfirmationMapper$mapToUiState$1.L$1 = rbt0Var2;
        sourceAddressConfirmationMapper$mapToUiState$1.L$2 = charSequence82;
        sourceAddressConfirmationMapper$mapToUiState$1.label = 2;
        i2 = ru.yandex.taxi.widget.c.i(cVar2, formattedText42, null, sourceAddressConfirmationMapper$mapToUiState$1, 30);
        if (i2 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
