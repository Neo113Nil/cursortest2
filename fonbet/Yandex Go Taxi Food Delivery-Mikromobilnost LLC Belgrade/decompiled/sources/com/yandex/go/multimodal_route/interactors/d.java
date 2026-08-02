package com.yandex.go.multimodal_route.interactors;

import android.graphics.drawable.BitmapDrawable;
import defpackage.a0c0;
import defpackage.b8r;
import defpackage.bvu0;
import defpackage.fay0;
import defpackage.g8e;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.obm;
import defpackage.pex0;
import defpackage.u611;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class d {
    public final ru.yandex.taxi.widget.utils.e a;
    public final com.yandex.go.multimodal_route.experiement.c b;
    public final b8r c;

    public d(ru.yandex.taxi.widget.utils.e eVar, com.yandex.go.multimodal_route.experiement.c cVar, b8r b8rVar) {
        this.a = eVar;
        this.b = cVar;
        this.c = b8rVar;
    }

    public static /* synthetic */ Object b(d dVar, String str, String str2, CharSequence charSequence, CharSequence charSequence2, u611 u611Var, String str3, String str4, ContinuationImpl continuationImpl, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            charSequence = null;
        }
        if ((i & 8) != 0) {
            charSequence2 = null;
        }
        if ((i & 16) != 0) {
            u611Var = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        if ((i & 64) != 0) {
            str4 = null;
        }
        return dVar.a(str, str2, charSequence, charSequence2, u611Var, str3, str4, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, CharSequence charSequence, CharSequence charSequence2, u611 u611Var, String str3, String str4, ContinuationImpl continuationImpl) {
        MultimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1 multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1;
        Object obj;
        int i;
        String str5;
        CharSequence charSequence3;
        String str6;
        String str7;
        u611 u611Var2;
        CharSequence charSequence4;
        Object obj2;
        String str8;
        String p;
        pex0 pex0Var;
        Object b;
        u611 u611Var3;
        String str9;
        String str10;
        String str11;
        Object obj3;
        CharSequence charSequence5;
        String str12;
        Object f;
        String str13;
        String str14;
        Object obj4;
        BitmapDrawable bitmapDrawable;
        obm obmVar;
        String str15;
        String str16 = str3;
        if (continuationImpl instanceof MultimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1) {
            multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1 = (MultimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1) continuationImpl;
            int i2 = multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.label = i2 - Integer.MIN_VALUE;
                Object obj5 = multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.label;
                com.yandex.go.multimodal_route.experiement.c cVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj5);
                    mi31 d = b8r.d(this.c, str, null, 6);
                    str5 = (d == null || (pex0Var = d.a) == null) ? null : pex0Var.l;
                    if (str5 == null || str5.length() == 0 || str16 == null || str16.length() == 0) {
                        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$0 = str;
                        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$1 = str2;
                        charSequence3 = charSequence;
                        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$2 = charSequence3;
                        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$3 = charSequence2;
                        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$4 = u611Var;
                        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$5 = str16;
                        str6 = str4;
                        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$6 = str6;
                        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$7 = str5;
                        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.label = 1;
                        Object d2 = cVar.d(multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1);
                        if (d2 != obj) {
                            str7 = str;
                            u611Var2 = u611Var;
                            charSequence4 = charSequence2;
                            obj2 = d2;
                            str8 = str2;
                        }
                        return obj;
                    }
                    p = g8e.p(str5, " ", str16);
                    str8 = str2;
                    charSequence3 = charSequence;
                    charSequence4 = charSequence2;
                    str6 = str4;
                    str7 = str;
                    u611Var2 = u611Var;
                    if (p == null) {
                        p = "";
                    }
                    multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$0 = null;
                    multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$1 = str8;
                    multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$2 = charSequence3;
                    multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$3 = charSequence4;
                    multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$4 = u611Var2;
                    multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$5 = str16;
                    multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$6 = str6;
                    multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$7 = str5;
                    multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$8 = p;
                    multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.label = 2;
                    b = cVar.b(str7, multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1);
                    if (b != obj) {
                        u611Var3 = u611Var2;
                        str9 = p;
                        str10 = str16;
                        str11 = str5;
                        obj3 = b;
                        charSequence5 = charSequence4;
                        str12 = str8;
                        String str17 = (String) obj3;
                        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$0 = null;
                        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$1 = str12;
                        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$2 = charSequence3;
                        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$3 = charSequence5;
                        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$4 = u611Var3;
                        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$5 = str10;
                        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$6 = str6;
                        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$7 = str11;
                        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$8 = str9;
                        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$9 = str17;
                        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.label = 3;
                        f = ru.yandex.taxi.widget.utils.e.f(this.a, str17, null, multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1, 6);
                        if (f != obj) {
                        }
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        String str18 = (String) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$9;
                        str9 = (String) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$8;
                        str11 = (String) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$7;
                        str14 = (String) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$6;
                        str10 = (String) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$5;
                        u611Var3 = (u611) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$4;
                        charSequence5 = (CharSequence) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$3;
                        charSequence3 = (CharSequence) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$2;
                        str12 = (String) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$1;
                        kotlin.b.b(obj5);
                        str13 = str18;
                        obj4 = obj5;
                        u611 u611Var4 = u611Var3;
                        CharSequence charSequence6 = charSequence5;
                        bitmapDrawable = (BitmapDrawable) obj4;
                        CharSequence charSequence7 = charSequence3 != null ? str9 : charSequence3;
                        if (bitmapDrawable == null) {
                            obmVar = new obm(str13 != null ? str13 : "", bitmapDrawable);
                        } else {
                            obmVar = null;
                        }
                        if (str12 == null) {
                            if (str12.length() > 0) {
                                str12 = ((Object) String.valueOf(str12.charAt(0)).toUpperCase(Locale.ROOT)) + str12.substring(1);
                            }
                            str15 = str12;
                        } else {
                            str15 = null;
                        }
                        return new fay0(charSequence7, charSequence6, obmVar, str13, str15, str14 == null ? new a0c0(str14, bvu0.l(10, str14)) : null, u611Var4, (str11 != null || str11.length() <= 0) ? null : str11, (str10 != null || str10.length() <= 0) ? null : str10);
                    }
                    str9 = (String) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$8;
                    str11 = (String) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$7;
                    String str19 = (String) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$6;
                    String str20 = (String) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$5;
                    u611 u611Var5 = (u611) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$4;
                    CharSequence charSequence8 = (CharSequence) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$3;
                    CharSequence charSequence9 = (CharSequence) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$2;
                    String str21 = (String) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$1;
                    kotlin.b.b(obj5);
                    str6 = str19;
                    str10 = str20;
                    charSequence5 = charSequence8;
                    u611Var3 = u611Var5;
                    str12 = str21;
                    charSequence3 = charSequence9;
                    obj3 = obj5;
                    String str172 = (String) obj3;
                    multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$0 = null;
                    multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$1 = str12;
                    multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$2 = charSequence3;
                    multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$3 = charSequence5;
                    multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$4 = u611Var3;
                    multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$5 = str10;
                    multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$6 = str6;
                    multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$7 = str11;
                    multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$8 = str9;
                    multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$9 = str172;
                    multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.label = 3;
                    f = ru.yandex.taxi.widget.utils.e.f(this.a, str172, null, multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1, 6);
                    if (f != obj) {
                        str13 = str172;
                        str14 = str6;
                        obj4 = f;
                        u611 u611Var42 = u611Var3;
                        CharSequence charSequence62 = charSequence5;
                        bitmapDrawable = (BitmapDrawable) obj4;
                        if (charSequence3 != null) {
                        }
                        if (bitmapDrawable == null) {
                        }
                        if (str12 == null) {
                        }
                        return new fay0(charSequence7, charSequence62, obmVar, str13, str15, str14 == null ? new a0c0(str14, bvu0.l(10, str14)) : null, u611Var42, (str11 != null || str11.length() <= 0) ? null : str11, (str10 != null || str10.length() <= 0) ? null : str10);
                    }
                    return obj;
                }
                String str22 = (String) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$7;
                String str23 = (String) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$6;
                String str24 = (String) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$5;
                u611 u611Var6 = (u611) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$4;
                charSequence4 = (CharSequence) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$3;
                CharSequence charSequence10 = (CharSequence) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$2;
                str8 = (String) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$1;
                str7 = (String) multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$0;
                kotlin.b.b(obj5);
                obj2 = obj5;
                str5 = str22;
                u611Var2 = u611Var6;
                charSequence3 = charSequence10;
                str6 = str23;
                str16 = str24;
                p = (String) obj2;
                if (p == null) {
                }
                multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$0 = null;
                multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$1 = str8;
                multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$2 = charSequence3;
                multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$3 = charSequence4;
                multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$4 = u611Var2;
                multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$5 = str16;
                multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$6 = str6;
                multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$7 = str5;
                multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$8 = p;
                multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.label = 2;
                b = cVar.b(str7, multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1);
                if (b != obj) {
                }
                return obj;
            }
        }
        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1 = new MultimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1(this, continuationImpl);
        Object obj52 = multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.label;
        com.yandex.go.multimodal_route.experiement.c cVar2 = this.b;
        if (i != 0) {
        }
        p = (String) obj2;
        if (p == null) {
        }
        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$0 = null;
        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$1 = str8;
        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$2 = charSequence3;
        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$3 = charSequence4;
        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$4 = u611Var2;
        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$5 = str16;
        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$6 = str6;
        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$7 = str5;
        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.L$8 = p;
        multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1.label = 2;
        b = cVar2.b(str7, multimodalRoutesGetTaxiSectionDataInteractorImpl$getTaxiSectionData$1);
        if (b != obj) {
        }
        return obj;
    }
}
