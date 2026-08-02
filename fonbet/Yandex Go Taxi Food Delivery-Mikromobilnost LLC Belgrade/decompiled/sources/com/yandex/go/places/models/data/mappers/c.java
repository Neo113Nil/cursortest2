package com.yandex.go.places.models.data.mappers;

import com.yandex.go.places.impl.data.entities.network.ButtonDto;
import com.yandex.go.places.models.data.entities.network.s;
import defpackage.fr;
import defpackage.il6;
import defpackage.kdc;
import defpackage.ky6;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.ufu;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class c {
    public final pdc a;
    public final a b;
    public final ru.yandex.taxi.widget.c c;

    public c(pdc pdcVar, a aVar, ru.yandex.taxi.widget.c cVar) {
        this.a = pdcVar;
        this.b = aVar;
        this.c = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        if (r2 != null) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ButtonDto buttonDto, ContinuationImpl continuationImpl) {
        ButtonMapper$mapModel$1 buttonMapper$mapModel$1;
        int i;
        il6 il6Var;
        Object obj;
        CharSequence charSequence;
        ButtonDto buttonDto2;
        CharSequence charSequence2;
        il6 il6Var2;
        il6 il6Var3;
        CharSequence charSequence3;
        CharSequence charSequence4;
        ButtonDto buttonDto3;
        CharSequence charSequence5;
        kdc kdcVar;
        if (continuationImpl instanceof ButtonMapper$mapModel$1) {
            buttonMapper$mapModel$1 = (ButtonMapper$mapModel$1) continuationImpl;
            int i2 = buttonMapper$mapModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                buttonMapper$mapModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = buttonMapper$mapModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = buttonMapper$mapModel$1.label;
                ru.yandex.taxi.widget.c cVar = this.c;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    FormattedText formattedText = buttonDto.a;
                    if (formattedText != null) {
                        buttonMapper$mapModel$1.L$0 = buttonDto;
                        buttonMapper$mapModel$1.L$1 = null;
                        buttonMapper$mapModel$1.L$2 = null;
                        buttonMapper$mapModel$1.label = 1;
                        Object i3 = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, buttonMapper$mapModel$1, 30);
                        if (i3 != coroutineSingletons) {
                            obj = i3;
                            il6Var = null;
                        }
                        return coroutineSingletons;
                    }
                    il6Var = null;
                    charSequence = "";
                    il6 il6Var4 = il6Var;
                    buttonDto2 = buttonDto;
                    charSequence2 = charSequence;
                    il6Var2 = il6Var4;
                    FormattedText formattedText2 = buttonDto2.b;
                    if (formattedText2 == null) {
                        il6Var3 = il6Var2;
                        charSequence3 = charSequence2;
                        charSequence4 = null;
                        String str = buttonDto2.c;
                        if (str != null) {
                        }
                        s sVar = buttonDto2.d;
                        buttonMapper$mapModel$1.L$0 = null;
                        buttonMapper$mapModel$1.L$1 = null;
                        buttonMapper$mapModel$1.L$2 = charSequence3;
                        buttonMapper$mapModel$1.L$3 = charSequence4;
                        buttonMapper$mapModel$1.L$4 = r4;
                        buttonMapper$mapModel$1.label = 3;
                        obj2 = this.b.a(sVar, il6Var3, buttonMapper$mapModel$1);
                        if (obj2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    buttonMapper$mapModel$1.L$0 = buttonDto2;
                    buttonMapper$mapModel$1.L$1 = il6Var2;
                    buttonMapper$mapModel$1.L$2 = null;
                    buttonMapper$mapModel$1.L$3 = charSequence2;
                    buttonMapper$mapModel$1.label = 2;
                    Object i4 = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, buttonMapper$mapModel$1, 30);
                    if (i4 != coroutineSingletons) {
                        buttonDto3 = buttonDto2;
                        obj2 = i4;
                        il6 il6Var5 = il6Var2;
                        charSequence3 = charSequence2;
                        charSequence4 = (CharSequence) obj2;
                        buttonDto2 = buttonDto3;
                        il6Var3 = il6Var5;
                        String str2 = buttonDto2.c;
                        if (str2 != null) {
                        }
                        s sVar2 = buttonDto2.d;
                        buttonMapper$mapModel$1.L$0 = null;
                        buttonMapper$mapModel$1.L$1 = null;
                        buttonMapper$mapModel$1.L$2 = charSequence3;
                        buttonMapper$mapModel$1.L$3 = charSequence4;
                        buttonMapper$mapModel$1.L$4 = r4;
                        buttonMapper$mapModel$1.label = 3;
                        obj2 = this.b.a(sVar2, il6Var3, buttonMapper$mapModel$1);
                        if (obj2 != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kdcVar = (kdc) buttonMapper$mapModel$1.L$4;
                        charSequence4 = (CharSequence) buttonMapper$mapModel$1.L$3;
                        charSequence5 = (CharSequence) buttonMapper$mapModel$1.L$2;
                        kotlin.b.b(obj2);
                        return new ky6(charSequence5, charSequence4, kdcVar, (fr) obj2);
                    }
                    charSequence2 = (CharSequence) buttonMapper$mapModel$1.L$3;
                    il6Var2 = (il6) buttonMapper$mapModel$1.L$1;
                    buttonDto3 = (ButtonDto) buttonMapper$mapModel$1.L$0;
                    kotlin.b.b(obj2);
                    il6 il6Var52 = il6Var2;
                    charSequence3 = charSequence2;
                    charSequence4 = (CharSequence) obj2;
                    buttonDto2 = buttonDto3;
                    il6Var3 = il6Var52;
                    String str22 = buttonDto2.c;
                    kdc b = str22 != null ? ((ufu) this.a).b(str22) : null;
                    s sVar22 = buttonDto2.d;
                    buttonMapper$mapModel$1.L$0 = null;
                    buttonMapper$mapModel$1.L$1 = null;
                    buttonMapper$mapModel$1.L$2 = charSequence3;
                    buttonMapper$mapModel$1.L$3 = charSequence4;
                    buttonMapper$mapModel$1.L$4 = b;
                    buttonMapper$mapModel$1.label = 3;
                    obj2 = this.b.a(sVar22, il6Var3, buttonMapper$mapModel$1);
                    if (obj2 != coroutineSingletons) {
                        charSequence5 = charSequence3;
                        kdcVar = b;
                        return new ky6(charSequence5, charSequence4, kdcVar, (fr) obj2);
                    }
                    return coroutineSingletons;
                }
                il6 il6Var6 = (il6) buttonMapper$mapModel$1.L$1;
                ButtonDto buttonDto4 = (ButtonDto) buttonMapper$mapModel$1.L$0;
                kotlin.b.b(obj2);
                il6Var = il6Var6;
                buttonDto = buttonDto4;
                obj = obj2;
                charSequence = (CharSequence) obj;
            }
        }
        buttonMapper$mapModel$1 = new ButtonMapper$mapModel$1(this, continuationImpl);
        Object obj22 = buttonMapper$mapModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = buttonMapper$mapModel$1.label;
        ru.yandex.taxi.widget.c cVar2 = this.c;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj;
    }
}
