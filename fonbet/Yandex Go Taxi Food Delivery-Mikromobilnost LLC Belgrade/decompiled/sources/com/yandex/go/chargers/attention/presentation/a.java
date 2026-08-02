package com.yandex.go.chargers.attention.presentation;

import android.graphics.drawable.BitmapDrawable;
import defpackage.gdc;
import defpackage.gn9;
import defpackage.hn9;
import defpackage.kdc;
import defpackage.km9;
import defpackage.lm9;
import defpackage.mm9;
import defpackage.mqg0;
import defpackage.nm9;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.ufu;
import defpackage.w511;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class a {
    public final pdc a;
    public final e b;

    public a(pdc pdcVar, e eVar) {
        this.a = pdcVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(nm9 nm9Var, ContinuationImpl continuationImpl) {
        ChargersAttentionUiStateMapper$mapToUiState$1 chargersAttentionUiStateMapper$mapToUiState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kdc kdcVar;
        CharSequence charSequence;
        Object f;
        CharSequence charSequence2;
        BitmapDrawable bitmapDrawable;
        km9 km9Var;
        String str;
        nm9 nm9Var2 = nm9Var;
        if (continuationImpl instanceof ChargersAttentionUiStateMapper$mapToUiState$1) {
            chargersAttentionUiStateMapper$mapToUiState$1 = (ChargersAttentionUiStateMapper$mapToUiState$1) continuationImpl;
            int i2 = chargersAttentionUiStateMapper$mapToUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersAttentionUiStateMapper$mapToUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersAttentionUiStateMapper$mapToUiState$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersAttentionUiStateMapper$mapToUiState$1.label;
                e eVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(nm9Var2 instanceof lm9)) {
                        if (nm9Var2 instanceof mm9) {
                            return hn9.a;
                        }
                        w511.b();
                        return null;
                    }
                    lm9 lm9Var = (lm9) nm9Var2;
                    CharSequence charSequence3 = lm9Var.a;
                    String str2 = lm9Var.c;
                    kdc a = ((ufu) this.a).a(new gdc(mqg0.component_green_normal), str2);
                    String str3 = lm9Var.b;
                    chargersAttentionUiStateMapper$mapToUiState$1.L$0 = nm9Var2;
                    chargersAttentionUiStateMapper$mapToUiState$1.L$1 = charSequence3;
                    chargersAttentionUiStateMapper$mapToUiState$1.L$2 = a;
                    chargersAttentionUiStateMapper$mapToUiState$1.label = 1;
                    obj = e.f(eVar, str3, null, chargersAttentionUiStateMapper$mapToUiState$1, 6);
                    if (obj != coroutineSingletons) {
                        kdcVar = a;
                        charSequence = charSequence3;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str4 = (String) chargersAttentionUiStateMapper$mapToUiState$1.L$5;
                    km9 km9Var2 = (km9) chargersAttentionUiStateMapper$mapToUiState$1.L$4;
                    BitmapDrawable bitmapDrawable2 = (BitmapDrawable) chargersAttentionUiStateMapper$mapToUiState$1.L$3;
                    kdcVar = (kdc) chargersAttentionUiStateMapper$mapToUiState$1.L$2;
                    CharSequence charSequence4 = (CharSequence) chargersAttentionUiStateMapper$mapToUiState$1.L$1;
                    kotlin.b.b(obj);
                    str = str4;
                    km9Var = km9Var2;
                    bitmapDrawable = bitmapDrawable2;
                    charSequence2 = charSequence4;
                    return new gn9(charSequence2, kdcVar, bitmapDrawable, km9Var, str, (BitmapDrawable) obj);
                }
                kdc kdcVar2 = (kdc) chargersAttentionUiStateMapper$mapToUiState$1.L$2;
                CharSequence charSequence5 = (CharSequence) chargersAttentionUiStateMapper$mapToUiState$1.L$1;
                nm9 nm9Var3 = (nm9) chargersAttentionUiStateMapper$mapToUiState$1.L$0;
                kotlin.b.b(obj);
                kdcVar = kdcVar2;
                charSequence = charSequence5;
                nm9Var2 = nm9Var3;
                BitmapDrawable bitmapDrawable3 = (BitmapDrawable) obj;
                lm9 lm9Var2 = (lm9) nm9Var2;
                km9 km9Var3 = lm9Var2.d;
                String str5 = lm9Var2.e;
                String str6 = lm9Var2.f;
                chargersAttentionUiStateMapper$mapToUiState$1.L$0 = null;
                chargersAttentionUiStateMapper$mapToUiState$1.L$1 = charSequence;
                chargersAttentionUiStateMapper$mapToUiState$1.L$2 = kdcVar;
                chargersAttentionUiStateMapper$mapToUiState$1.L$3 = bitmapDrawable3;
                chargersAttentionUiStateMapper$mapToUiState$1.L$4 = km9Var3;
                chargersAttentionUiStateMapper$mapToUiState$1.L$5 = str5;
                chargersAttentionUiStateMapper$mapToUiState$1.label = 2;
                f = e.f(eVar, str6, null, chargersAttentionUiStateMapper$mapToUiState$1, 6);
                if (f != coroutineSingletons) {
                    charSequence2 = charSequence;
                    bitmapDrawable = bitmapDrawable3;
                    km9Var = km9Var3;
                    str = str5;
                    obj = f;
                    return new gn9(charSequence2, kdcVar, bitmapDrawable, km9Var, str, (BitmapDrawable) obj);
                }
                return coroutineSingletons;
            }
        }
        chargersAttentionUiStateMapper$mapToUiState$1 = new ChargersAttentionUiStateMapper$mapToUiState$1(this, continuationImpl);
        Object obj2 = chargersAttentionUiStateMapper$mapToUiState$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersAttentionUiStateMapper$mapToUiState$1.label;
        e eVar2 = this.b;
        if (i != 0) {
        }
        BitmapDrawable bitmapDrawable32 = (BitmapDrawable) obj2;
        lm9 lm9Var22 = (lm9) nm9Var2;
        km9 km9Var32 = lm9Var22.d;
        String str52 = lm9Var22.e;
        String str62 = lm9Var22.f;
        chargersAttentionUiStateMapper$mapToUiState$1.L$0 = null;
        chargersAttentionUiStateMapper$mapToUiState$1.L$1 = charSequence;
        chargersAttentionUiStateMapper$mapToUiState$1.L$2 = kdcVar;
        chargersAttentionUiStateMapper$mapToUiState$1.L$3 = bitmapDrawable32;
        chargersAttentionUiStateMapper$mapToUiState$1.L$4 = km9Var32;
        chargersAttentionUiStateMapper$mapToUiState$1.L$5 = str52;
        chargersAttentionUiStateMapper$mapToUiState$1.label = 2;
        f = e.f(eVar2, str62, null, chargersAttentionUiStateMapper$mapToUiState$1, 6);
        if (f != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
