package com.yandex.go.scooters.passes.active.v3;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.aum0;
import defpackage.avm0;
import defpackage.bum0;
import defpackage.bvm0;
import defpackage.cum0;
import defpackage.cvm0;
import defpackage.dum0;
import defpackage.dvm0;
import defpackage.eum0;
import defpackage.evm0;
import defpackage.fvm0;
import defpackage.gvm0;
import defpackage.hvm0;
import defpackage.ivm0;
import defpackage.jvm0;
import defpackage.kvm0;
import defpackage.nta1;
import defpackage.ny61;
import defpackage.sco0;
import defpackage.sum0;
import defpackage.tcc;
import defpackage.tum0;
import defpackage.utm0;
import defpackage.w511;
import defpackage.wp2;
import defpackage.wtm0;
import defpackage.xtm0;
import defpackage.yp2;
import defpackage.ytm0;
import defpackage.ztm0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class g {
    public final yp2 a;
    public final ru.yandex.taxi.widget.c b;

    public g(yp2 yp2Var, ru.yandex.taxi.widget.c cVar) {
        this.a = yp2Var;
        this.b = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r12 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g gVar, sum0 sum0Var, ContinuationImpl continuationImpl) {
        ScootersActivePassesV3UiStateMapper$getButton$1 scootersActivePassesV3UiStateMapper$getButton$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object b;
        CharSequence charSequence;
        CharSequence charSequence2;
        gVar.getClass();
        if (continuationImpl instanceof ScootersActivePassesV3UiStateMapper$getButton$1) {
            scootersActivePassesV3UiStateMapper$getButton$1 = (ScootersActivePassesV3UiStateMapper$getButton$1) continuationImpl;
            int i2 = scootersActivePassesV3UiStateMapper$getButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesV3UiStateMapper$getButton$1.label = i2 - Integer.MIN_VALUE;
                ScootersActivePassesV3UiStateMapper$getButton$1 scootersActivePassesV3UiStateMapper$getButton$12 = scootersActivePassesV3UiStateMapper$getButton$1;
                Object obj = scootersActivePassesV3UiStateMapper$getButton$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesV3UiStateMapper$getButton$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.widget.c cVar = gVar.b;
                    FormattedText formattedText = sum0Var.a;
                    scootersActivePassesV3UiStateMapper$getButton$12.L$0 = sum0Var;
                    scootersActivePassesV3UiStateMapper$getButton$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, scootersActivePassesV3UiStateMapper$getButton$12, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence = (CharSequence) scootersActivePassesV3UiStateMapper$getButton$12.L$1;
                        kotlin.b.b(obj);
                        charSequence2 = (CharSequence) obj;
                        if (charSequence2 == null) {
                            charSequence2 = "";
                        }
                        return new utm0(charSequence, charSequence2);
                    }
                    sum0Var = (sum0) scootersActivePassesV3UiStateMapper$getButton$12.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence3 = (CharSequence) obj;
                ru.yandex.taxi.widget.c cVar2 = gVar.b;
                FormattedText formattedText2 = sum0Var.b;
                scootersActivePassesV3UiStateMapper$getButton$12.L$0 = null;
                scootersActivePassesV3UiStateMapper$getButton$12.L$1 = charSequence3;
                scootersActivePassesV3UiStateMapper$getButton$12.label = 2;
                b = nta1.b(cVar2, formattedText2, scootersActivePassesV3UiStateMapper$getButton$12);
                if (b != coroutineSingletons) {
                    obj = b;
                    charSequence = charSequence3;
                    charSequence2 = (CharSequence) obj;
                    if (charSequence2 == null) {
                    }
                    return new utm0(charSequence, charSequence2);
                }
                return coroutineSingletons;
            }
        }
        scootersActivePassesV3UiStateMapper$getButton$1 = new ScootersActivePassesV3UiStateMapper$getButton$1(gVar, continuationImpl);
        ScootersActivePassesV3UiStateMapper$getButton$1 scootersActivePassesV3UiStateMapper$getButton$122 = scootersActivePassesV3UiStateMapper$getButton$1;
        Object obj2 = scootersActivePassesV3UiStateMapper$getButton$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3UiStateMapper$getButton$122.label;
        if (i != 0) {
        }
        CharSequence charSequence32 = (CharSequence) obj2;
        ru.yandex.taxi.widget.c cVar22 = gVar.b;
        FormattedText formattedText22 = sum0Var.b;
        scootersActivePassesV3UiStateMapper$getButton$122.L$0 = null;
        scootersActivePassesV3UiStateMapper$getButton$122.L$1 = charSequence32;
        scootersActivePassesV3UiStateMapper$getButton$122.label = 2;
        b = nta1.b(cVar22, formattedText22, scootersActivePassesV3UiStateMapper$getButton$122);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(g gVar, kvm0 kvm0Var, ContinuationImpl continuationImpl) {
        ScootersActivePassesV3UiStateMapper$getDescription$1 scootersActivePassesV3UiStateMapper$getDescription$1;
        int i;
        gVar.getClass();
        if (continuationImpl instanceof ScootersActivePassesV3UiStateMapper$getDescription$1) {
            scootersActivePassesV3UiStateMapper$getDescription$1 = (ScootersActivePassesV3UiStateMapper$getDescription$1) continuationImpl;
            int i2 = scootersActivePassesV3UiStateMapper$getDescription$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesV3UiStateMapper$getDescription$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersActivePassesV3UiStateMapper$getDescription$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesV3UiStateMapper$getDescription$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.widget.c cVar = gVar.b;
                    FormattedText formattedText = kvm0Var.e;
                    scootersActivePassesV3UiStateMapper$getDescription$1.L$0 = null;
                    scootersActivePassesV3UiStateMapper$getDescription$1.label = 1;
                    obj = nta1.b(cVar, formattedText, scootersActivePassesV3UiStateMapper$getDescription$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                CharSequence charSequence = (CharSequence) obj;
                return charSequence != null ? "" : charSequence;
            }
        }
        scootersActivePassesV3UiStateMapper$getDescription$1 = new ScootersActivePassesV3UiStateMapper$getDescription$1(gVar, continuationImpl);
        Object obj2 = scootersActivePassesV3UiStateMapper$getDescription$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3UiStateMapper$getDescription$1.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        if (charSequence2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d0, code lost:
    
        if (r2 == r4) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x017e -> B:14:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(g gVar, cvm0 cvm0Var, ContinuationImpl continuationImpl) {
        ScootersActivePassesV3UiStateMapper$getRenewGroup$1 scootersActivePassesV3UiStateMapper$getRenewGroup$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object b;
        cvm0 cvm0Var2;
        CharSequence charSequence;
        CharSequence charSequence2;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        bvm0 bvm0Var;
        avm0 avm0Var;
        ArrayList arrayList2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        Collection collection;
        Object b2;
        cvm0 cvm0Var3 = cvm0Var;
        ru.yandex.taxi.widget.c cVar = gVar.b;
        if (continuationImpl instanceof ScootersActivePassesV3UiStateMapper$getRenewGroup$1) {
            scootersActivePassesV3UiStateMapper$getRenewGroup$1 = (ScootersActivePassesV3UiStateMapper$getRenewGroup$1) continuationImpl;
            int i2 = scootersActivePassesV3UiStateMapper$getRenewGroup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesV3UiStateMapper$getRenewGroup$1.label = i2 - Integer.MIN_VALUE;
                ScootersActivePassesV3UiStateMapper$getRenewGroup$1 scootersActivePassesV3UiStateMapper$getRenewGroup$12 = scootersActivePassesV3UiStateMapper$getRenewGroup$1;
                Object obj = scootersActivePassesV3UiStateMapper$getRenewGroup$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesV3UiStateMapper$getRenewGroup$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.widget.c cVar2 = gVar.b;
                    FormattedText formattedText = cvm0Var3.a;
                    scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$0 = cvm0Var3;
                    scootersActivePassesV3UiStateMapper$getRenewGroup$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(cVar2, formattedText, null, false, scootersActivePassesV3UiStateMapper$getRenewGroup$12, 30);
                } else if (i == 1) {
                    cvm0Var3 = (cvm0) scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$0;
                    kotlin.b.b(obj);
                } else if (i == 2) {
                    charSequence = (CharSequence) scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$1;
                    cvm0Var2 = (cvm0) scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$0;
                    kotlin.b.b(obj);
                    charSequence2 = (CharSequence) obj;
                    if (charSequence2 == null) {
                        charSequence2 = "";
                    }
                    ArrayList arrayList3 = cvm0Var2.c;
                    arrayList = new ArrayList(tcc.n(arrayList3, 10));
                    it = arrayList3.iterator();
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i == 3) {
                        collection = (Collection) scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$10;
                        charSequence4 = (CharSequence) scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$9;
                        charSequence3 = (CharSequence) scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$8;
                        avm0 avm0Var2 = (avm0) scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$7;
                        bvm0 bvm0Var2 = (bvm0) scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$6;
                        Iterator it3 = (Iterator) scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$4;
                        ?? r12 = (Collection) scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$3;
                        kotlin.b.b(obj);
                        it2 = it3;
                        bvm0Var = bvm0Var2;
                        avm0Var = avm0Var2;
                        arrayList2 = r12;
                        CharSequence charSequence5 = (CharSequence) obj;
                        FormattedText c = bvm0Var.c();
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$0 = null;
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$1 = null;
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$2 = null;
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$3 = arrayList2;
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$4 = it2;
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$5 = null;
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$6 = bvm0Var;
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$7 = avm0Var;
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$8 = charSequence5;
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$9 = charSequence3;
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$10 = charSequence4;
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$11 = collection;
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.label = 4;
                        b2 = nta1.b(cVar, c, scootersActivePassesV3UiStateMapper$getRenewGroup$12);
                        if (b2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = (Collection) scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$11;
                    charSequence4 = (CharSequence) scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$10;
                    charSequence3 = (CharSequence) scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$9;
                    CharSequence charSequence6 = (CharSequence) scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$8;
                    avm0Var = (avm0) scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$7;
                    bvm0Var = (bvm0) scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$6;
                    it2 = (Iterator) scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$4;
                    ?? r122 = (Collection) scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$3;
                    kotlin.b.b(obj);
                    CharSequence charSequence7 = charSequence6;
                    arrayList2 = r122;
                    CharSequence charSequence8 = (CharSequence) obj;
                    collection.add(new wtm0(avm0Var, charSequence7, charSequence8 != null ? "" : charSequence8, gVar.a.a(bvm0Var.getBackgroundColor(), AppColor$Palette.BgMinor), bvm0Var.a()));
                    charSequence2 = charSequence4;
                    charSequence = charSequence3;
                    arrayList = arrayList2;
                    it = it2;
                    if (!it.hasNext()) {
                        bvm0 bvm0Var3 = (bvm0) it.next();
                        if (bvm0Var3 instanceof avm0) {
                            avm0Var = (avm0) bvm0Var3;
                        } else {
                            if (!(bvm0Var3 instanceof tum0)) {
                                w511.b();
                                return null;
                            }
                            avm0Var = null;
                        }
                        ru.yandex.taxi.widget.c cVar3 = gVar.b;
                        FormattedText b3 = bvm0Var3.b();
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$0 = null;
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$1 = null;
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$2 = null;
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$3 = arrayList;
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$4 = it;
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$5 = null;
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$6 = bvm0Var3;
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$7 = avm0Var;
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$8 = charSequence;
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$9 = charSequence2;
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$10 = arrayList;
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$11 = null;
                        scootersActivePassesV3UiStateMapper$getRenewGroup$12.label = 3;
                        ScootersActivePassesV3UiStateMapper$getRenewGroup$1 scootersActivePassesV3UiStateMapper$getRenewGroup$13 = scootersActivePassesV3UiStateMapper$getRenewGroup$12;
                        Object e = ru.yandex.taxi.widget.c.e(cVar3, b3, null, false, scootersActivePassesV3UiStateMapper$getRenewGroup$13, 30);
                        if (e != coroutineSingletons) {
                            it2 = it;
                            bvm0Var = bvm0Var3;
                            charSequence4 = charSequence2;
                            arrayList2 = arrayList;
                            obj = e;
                            scootersActivePassesV3UiStateMapper$getRenewGroup$12 = scootersActivePassesV3UiStateMapper$getRenewGroup$13;
                            charSequence3 = charSequence;
                            collection = arrayList2;
                            CharSequence charSequence52 = (CharSequence) obj;
                            FormattedText c2 = bvm0Var.c();
                            scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$0 = null;
                            scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$1 = null;
                            scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$2 = null;
                            scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$3 = arrayList2;
                            scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$4 = it2;
                            scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$5 = null;
                            scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$6 = bvm0Var;
                            scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$7 = avm0Var;
                            scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$8 = charSequence52;
                            scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$9 = charSequence3;
                            scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$10 = charSequence4;
                            scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$11 = collection;
                            scootersActivePassesV3UiStateMapper$getRenewGroup$12.label = 4;
                            b2 = nta1.b(cVar, c2, scootersActivePassesV3UiStateMapper$getRenewGroup$12);
                            if (b2 != coroutineSingletons) {
                                charSequence7 = charSequence52;
                                obj = b2;
                                CharSequence charSequence82 = (CharSequence) obj;
                                collection.add(new wtm0(avm0Var, charSequence7, charSequence82 != null ? "" : charSequence82, gVar.a.a(bvm0Var.getBackgroundColor(), AppColor$Palette.BgMinor), bvm0Var.a()));
                                charSequence2 = charSequence4;
                                charSequence = charSequence3;
                                arrayList = arrayList2;
                                it = it2;
                                if (!it.hasNext()) {
                                    return new xtm0(charSequence, charSequence2, arrayList);
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                CharSequence charSequence9 = (CharSequence) obj;
                FormattedText formattedText2 = cvm0Var3.b;
                scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$0 = cvm0Var3;
                scootersActivePassesV3UiStateMapper$getRenewGroup$12.L$1 = charSequence9;
                scootersActivePassesV3UiStateMapper$getRenewGroup$12.label = 2;
                b = nta1.b(cVar, formattedText2, scootersActivePassesV3UiStateMapper$getRenewGroup$12);
                if (b != coroutineSingletons) {
                    cvm0Var2 = cvm0Var3;
                    charSequence = charSequence9;
                    obj = b;
                    charSequence2 = (CharSequence) obj;
                    if (charSequence2 == null) {
                    }
                    ArrayList arrayList32 = cvm0Var2.c;
                    arrayList = new ArrayList(tcc.n(arrayList32, 10));
                    it = arrayList32.iterator();
                    if (!it.hasNext()) {
                    }
                }
                return coroutineSingletons;
            }
        }
        scootersActivePassesV3UiStateMapper$getRenewGroup$1 = new ScootersActivePassesV3UiStateMapper$getRenewGroup$1(gVar, continuationImpl);
        ScootersActivePassesV3UiStateMapper$getRenewGroup$1 scootersActivePassesV3UiStateMapper$getRenewGroup$122 = scootersActivePassesV3UiStateMapper$getRenewGroup$1;
        Object obj2 = scootersActivePassesV3UiStateMapper$getRenewGroup$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3UiStateMapper$getRenewGroup$122.label;
        if (i != 0) {
        }
        CharSequence charSequence92 = (CharSequence) obj2;
        FormattedText formattedText22 = cvm0Var3.b;
        scootersActivePassesV3UiStateMapper$getRenewGroup$122.L$0 = cvm0Var3;
        scootersActivePassesV3UiStateMapper$getRenewGroup$122.L$1 = charSequence92;
        scootersActivePassesV3UiStateMapper$getRenewGroup$122.label = 2;
        b = nta1.b(cVar, formattedText22, scootersActivePassesV3UiStateMapper$getRenewGroup$122);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x017b -> B:12:0x0186). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x019e -> B:13:0x01a8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(g gVar, fvm0 fvm0Var, ContinuationImpl continuationImpl) {
        ScootersActivePassesV3UiStateMapper$getTermsGroup$1 scootersActivePassesV3UiStateMapper$getTermsGroup$1;
        int i;
        Collection arrayList;
        Iterator it;
        ScootersActivePassesV3UiStateMapper$getTermsGroup$1 scootersActivePassesV3UiStateMapper$getTermsGroup$12;
        String str;
        ScootersActivePassesV3UiStateMapper$getTermsGroup$1 scootersActivePassesV3UiStateMapper$getTermsGroup$13;
        evm0 evm0Var;
        Collection collection;
        Iterator it2;
        CharSequence charSequence;
        CharSequence charSequence2;
        dvm0 dvm0Var;
        Collection collection2;
        Iterator it3;
        String str2;
        Object b;
        gVar.getClass();
        if (continuationImpl instanceof ScootersActivePassesV3UiStateMapper$getTermsGroup$1) {
            scootersActivePassesV3UiStateMapper$getTermsGroup$1 = (ScootersActivePassesV3UiStateMapper$getTermsGroup$1) continuationImpl;
            int i2 = scootersActivePassesV3UiStateMapper$getTermsGroup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesV3UiStateMapper$getTermsGroup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersActivePassesV3UiStateMapper$getTermsGroup$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesV3UiStateMapper$getTermsGroup$1.label;
                int i3 = 3;
                int i4 = 2;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = fvm0Var.a;
                    arrayList = new ArrayList(tcc.n(list, 10));
                    it = list.iterator();
                    scootersActivePassesV3UiStateMapper$getTermsGroup$12 = scootersActivePassesV3UiStateMapper$getTermsGroup$1;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i == 1) {
                        arrayList = (Collection) scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$8;
                        str2 = (String) scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$7;
                        evm0 evm0Var2 = (evm0) scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$6;
                        Iterator it4 = (Iterator) scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$4;
                        collection2 = (Collection) scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$3;
                        kotlin.b.b(obj);
                        evm0Var = evm0Var2;
                        it3 = it4;
                        CharSequence charSequence3 = (CharSequence) obj;
                        ru.yandex.taxi.widget.c cVar = gVar.b;
                        FormattedText formattedText = evm0Var.c;
                        scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$0 = null;
                        scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$1 = null;
                        scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$2 = null;
                        scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$3 = collection2;
                        scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$4 = it3;
                        scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$5 = null;
                        scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$6 = evm0Var;
                        scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$7 = str2;
                        scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$8 = charSequence3;
                        scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$9 = arrayList;
                        scootersActivePassesV3UiStateMapper$getTermsGroup$1.label = i4;
                        b = nta1.b(cVar, formattedText, scootersActivePassesV3UiStateMapper$getTermsGroup$1);
                        if (b != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (i == 2) {
                        arrayList = (Collection) scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$9;
                        CharSequence charSequence4 = (CharSequence) scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$8;
                        String str3 = (String) scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$7;
                        evm0Var = (evm0) scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$6;
                        Iterator it5 = (Iterator) scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$4;
                        Collection collection3 = (Collection) scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$3;
                        kotlin.b.b(obj);
                        str = str3;
                        collection = collection3;
                        scootersActivePassesV3UiStateMapper$getTermsGroup$13 = scootersActivePassesV3UiStateMapper$getTermsGroup$1;
                        charSequence = charSequence4;
                        it2 = it5;
                        charSequence2 = (CharSequence) obj;
                        if (charSequence2 == null) {
                        }
                        dvm0Var = evm0Var.d;
                        if (dvm0Var == null) {
                        }
                    } else {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        arrayList = (Collection) scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$11;
                        dvm0 dvm0Var2 = (dvm0) scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$10;
                        CharSequence charSequence5 = (CharSequence) scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$9;
                        CharSequence charSequence6 = (CharSequence) scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$8;
                        String str4 = (String) scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$7;
                        Iterator it6 = (Iterator) scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$4;
                        Collection collection4 = (Collection) scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$3;
                        kotlin.b.b(obj);
                        ytm0 ytm0Var = new ytm0((CharSequence) obj, gVar.a.a(dvm0Var2.c, AppColor$Palette.ControlMinor), dvm0Var2.b);
                        ScootersActivePassesV3UiStateMapper$getTermsGroup$1 scootersActivePassesV3UiStateMapper$getTermsGroup$14 = scootersActivePassesV3UiStateMapper$getTermsGroup$1;
                        charSequence2 = charSequence5;
                        charSequence = charSequence6;
                        str = str4;
                        arrayList.add(new ztm0(str, charSequence, charSequence2, ytm0Var));
                        it = it6;
                        arrayList = collection4;
                        i4 = 2;
                        scootersActivePassesV3UiStateMapper$getTermsGroup$12 = scootersActivePassesV3UiStateMapper$getTermsGroup$14;
                        i3 = 3;
                        if (!it.hasNext()) {
                            evm0 evm0Var3 = (evm0) it.next();
                            String str5 = evm0Var3.a;
                            ru.yandex.taxi.widget.c cVar2 = gVar.b;
                            FormattedText formattedText2 = evm0Var3.b;
                            scootersActivePassesV3UiStateMapper$getTermsGroup$12.L$0 = null;
                            scootersActivePassesV3UiStateMapper$getTermsGroup$12.L$1 = null;
                            scootersActivePassesV3UiStateMapper$getTermsGroup$12.L$2 = null;
                            scootersActivePassesV3UiStateMapper$getTermsGroup$12.L$3 = arrayList;
                            scootersActivePassesV3UiStateMapper$getTermsGroup$12.L$4 = it;
                            scootersActivePassesV3UiStateMapper$getTermsGroup$12.L$5 = null;
                            scootersActivePassesV3UiStateMapper$getTermsGroup$12.L$6 = evm0Var3;
                            scootersActivePassesV3UiStateMapper$getTermsGroup$12.L$7 = str5;
                            scootersActivePassesV3UiStateMapper$getTermsGroup$12.L$8 = arrayList;
                            scootersActivePassesV3UiStateMapper$getTermsGroup$12.L$9 = null;
                            scootersActivePassesV3UiStateMapper$getTermsGroup$12.L$10 = null;
                            scootersActivePassesV3UiStateMapper$getTermsGroup$12.L$11 = null;
                            scootersActivePassesV3UiStateMapper$getTermsGroup$12.label = 1;
                            Object e = ru.yandex.taxi.widget.c.e(cVar2, formattedText2, null, false, scootersActivePassesV3UiStateMapper$getTermsGroup$12, 30);
                            if (e != coroutineSingletons) {
                                it3 = it;
                                evm0Var = evm0Var3;
                                collection2 = arrayList;
                                obj = e;
                                scootersActivePassesV3UiStateMapper$getTermsGroup$1 = scootersActivePassesV3UiStateMapper$getTermsGroup$12;
                                str2 = str5;
                                CharSequence charSequence32 = (CharSequence) obj;
                                ru.yandex.taxi.widget.c cVar3 = gVar.b;
                                FormattedText formattedText3 = evm0Var.c;
                                scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$0 = null;
                                scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$1 = null;
                                scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$2 = null;
                                scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$3 = collection2;
                                scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$4 = it3;
                                scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$5 = null;
                                scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$6 = evm0Var;
                                scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$7 = str2;
                                scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$8 = charSequence32;
                                scootersActivePassesV3UiStateMapper$getTermsGroup$1.L$9 = arrayList;
                                scootersActivePassesV3UiStateMapper$getTermsGroup$1.label = i4;
                                b = nta1.b(cVar3, formattedText3, scootersActivePassesV3UiStateMapper$getTermsGroup$1);
                                if (b != coroutineSingletons) {
                                    ScootersActivePassesV3UiStateMapper$getTermsGroup$1 scootersActivePassesV3UiStateMapper$getTermsGroup$15 = scootersActivePassesV3UiStateMapper$getTermsGroup$1;
                                    charSequence = charSequence32;
                                    obj = b;
                                    scootersActivePassesV3UiStateMapper$getTermsGroup$13 = scootersActivePassesV3UiStateMapper$getTermsGroup$15;
                                    str = str2;
                                    it2 = it3;
                                    collection = collection2;
                                    charSequence2 = (CharSequence) obj;
                                    if (charSequence2 == null) {
                                        charSequence2 = "";
                                    }
                                    dvm0Var = evm0Var.d;
                                    if (dvm0Var == null) {
                                        ru.yandex.taxi.widget.c cVar4 = gVar.b;
                                        FormattedText formattedText4 = dvm0Var.a;
                                        scootersActivePassesV3UiStateMapper$getTermsGroup$13.L$0 = null;
                                        scootersActivePassesV3UiStateMapper$getTermsGroup$13.L$1 = null;
                                        scootersActivePassesV3UiStateMapper$getTermsGroup$13.L$2 = null;
                                        scootersActivePassesV3UiStateMapper$getTermsGroup$13.L$3 = collection;
                                        scootersActivePassesV3UiStateMapper$getTermsGroup$13.L$4 = it2;
                                        scootersActivePassesV3UiStateMapper$getTermsGroup$13.L$5 = null;
                                        scootersActivePassesV3UiStateMapper$getTermsGroup$13.L$6 = null;
                                        scootersActivePassesV3UiStateMapper$getTermsGroup$13.L$7 = str;
                                        scootersActivePassesV3UiStateMapper$getTermsGroup$13.L$8 = charSequence;
                                        scootersActivePassesV3UiStateMapper$getTermsGroup$13.L$9 = charSequence2;
                                        scootersActivePassesV3UiStateMapper$getTermsGroup$13.L$10 = dvm0Var;
                                        scootersActivePassesV3UiStateMapper$getTermsGroup$13.L$11 = arrayList;
                                        scootersActivePassesV3UiStateMapper$getTermsGroup$13.label = i3;
                                        Iterator it7 = it2;
                                        Collection collection5 = collection;
                                        Object e2 = ru.yandex.taxi.widget.c.e(cVar4, formattedText4, null, false, scootersActivePassesV3UiStateMapper$getTermsGroup$13, 30);
                                        if (e2 != coroutineSingletons) {
                                            charSequence5 = charSequence2;
                                            charSequence6 = charSequence;
                                            obj = e2;
                                            scootersActivePassesV3UiStateMapper$getTermsGroup$1 = scootersActivePassesV3UiStateMapper$getTermsGroup$13;
                                            str4 = str;
                                            dvm0Var2 = dvm0Var;
                                            it6 = it7;
                                            collection4 = collection5;
                                            ytm0 ytm0Var2 = new ytm0((CharSequence) obj, gVar.a.a(dvm0Var2.c, AppColor$Palette.ControlMinor), dvm0Var2.b);
                                            ScootersActivePassesV3UiStateMapper$getTermsGroup$1 scootersActivePassesV3UiStateMapper$getTermsGroup$142 = scootersActivePassesV3UiStateMapper$getTermsGroup$1;
                                            charSequence2 = charSequence5;
                                            charSequence = charSequence6;
                                            str = str4;
                                            arrayList.add(new ztm0(str, charSequence, charSequence2, ytm0Var2));
                                            it = it6;
                                            arrayList = collection4;
                                            i4 = 2;
                                            scootersActivePassesV3UiStateMapper$getTermsGroup$12 = scootersActivePassesV3UiStateMapper$getTermsGroup$142;
                                            i3 = 3;
                                            if (!it.hasNext()) {
                                                return new aum0((List) arrayList);
                                            }
                                        }
                                    } else {
                                        Iterator it8 = it2;
                                        ytm0Var2 = null;
                                        scootersActivePassesV3UiStateMapper$getTermsGroup$142 = scootersActivePassesV3UiStateMapper$getTermsGroup$13;
                                        it6 = it8;
                                        collection4 = collection;
                                        arrayList.add(new ztm0(str, charSequence, charSequence2, ytm0Var2));
                                        it = it6;
                                        arrayList = collection4;
                                        i4 = 2;
                                        scootersActivePassesV3UiStateMapper$getTermsGroup$12 = scootersActivePassesV3UiStateMapper$getTermsGroup$142;
                                        i3 = 3;
                                        if (!it.hasNext()) {
                                        }
                                    }
                                }
                            }
                            return coroutineSingletons;
                        }
                    }
                }
            }
        }
        scootersActivePassesV3UiStateMapper$getTermsGroup$1 = new ScootersActivePassesV3UiStateMapper$getTermsGroup$1(gVar, continuationImpl);
        Object obj2 = scootersActivePassesV3UiStateMapper$getTermsGroup$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3UiStateMapper$getTermsGroup$1.label;
        int i32 = 3;
        int i42 = 2;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        if (r13 == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(g gVar, hvm0 hvm0Var, ContinuationImpl continuationImpl) {
        ScootersActivePassesV3UiStateMapper$getTitleGroup$1 scootersActivePassesV3UiStateMapper$getTitleGroup$1;
        Object obj;
        int i;
        Object b;
        hvm0 hvm0Var2;
        CharSequence charSequence;
        CharSequence charSequence2;
        Object g;
        CharSequence charSequence3;
        gVar.getClass();
        if (continuationImpl instanceof ScootersActivePassesV3UiStateMapper$getTitleGroup$1) {
            scootersActivePassesV3UiStateMapper$getTitleGroup$1 = (ScootersActivePassesV3UiStateMapper$getTitleGroup$1) continuationImpl;
            int i2 = scootersActivePassesV3UiStateMapper$getTitleGroup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesV3UiStateMapper$getTitleGroup$1.label = i2 - Integer.MIN_VALUE;
                ScootersActivePassesV3UiStateMapper$getTitleGroup$1 scootersActivePassesV3UiStateMapper$getTitleGroup$12 = scootersActivePassesV3UiStateMapper$getTitleGroup$1;
                Object obj2 = scootersActivePassesV3UiStateMapper$getTitleGroup$12.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesV3UiStateMapper$getTitleGroup$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ru.yandex.taxi.widget.c cVar = gVar.b;
                    FormattedText formattedText = hvm0Var.a;
                    scootersActivePassesV3UiStateMapper$getTitleGroup$12.L$0 = hvm0Var;
                    scootersActivePassesV3UiStateMapper$getTitleGroup$12.label = 1;
                    obj2 = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, scootersActivePassesV3UiStateMapper$getTitleGroup$12, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            charSequence3 = (CharSequence) scootersActivePassesV3UiStateMapper$getTitleGroup$12.L$2;
                            charSequence = (CharSequence) scootersActivePassesV3UiStateMapper$getTitleGroup$12.L$1;
                            kotlin.b.b(obj2);
                            return new cum0(charSequence, charSequence3, (bum0) obj2);
                        }
                        charSequence = (CharSequence) scootersActivePassesV3UiStateMapper$getTitleGroup$12.L$1;
                        hvm0Var2 = (hvm0) scootersActivePassesV3UiStateMapper$getTitleGroup$12.L$0;
                        kotlin.b.b(obj2);
                        charSequence2 = (CharSequence) obj2;
                        if (charSequence2 == null) {
                            charSequence2 = "";
                        }
                        gvm0 gvm0Var = hvm0Var2.c;
                        scootersActivePassesV3UiStateMapper$getTitleGroup$12.L$0 = null;
                        scootersActivePassesV3UiStateMapper$getTitleGroup$12.L$1 = charSequence;
                        scootersActivePassesV3UiStateMapper$getTitleGroup$12.L$2 = charSequence2;
                        scootersActivePassesV3UiStateMapper$getTitleGroup$12.label = 3;
                        g = gVar.g(gvm0Var, scootersActivePassesV3UiStateMapper$getTitleGroup$12);
                        if (g != obj) {
                            CharSequence charSequence4 = charSequence2;
                            obj2 = g;
                            charSequence3 = charSequence4;
                            return new cum0(charSequence, charSequence3, (bum0) obj2);
                        }
                        return obj;
                    }
                    hvm0Var = (hvm0) scootersActivePassesV3UiStateMapper$getTitleGroup$12.L$0;
                    kotlin.b.b(obj2);
                }
                CharSequence charSequence5 = (CharSequence) obj2;
                ru.yandex.taxi.widget.c cVar2 = gVar.b;
                FormattedText formattedText2 = hvm0Var.b;
                scootersActivePassesV3UiStateMapper$getTitleGroup$12.L$0 = hvm0Var;
                scootersActivePassesV3UiStateMapper$getTitleGroup$12.L$1 = charSequence5;
                scootersActivePassesV3UiStateMapper$getTitleGroup$12.label = 2;
                b = nta1.b(cVar2, formattedText2, scootersActivePassesV3UiStateMapper$getTitleGroup$12);
                if (b != obj) {
                    hvm0Var2 = hvm0Var;
                    charSequence = charSequence5;
                    obj2 = b;
                    charSequence2 = (CharSequence) obj2;
                    if (charSequence2 == null) {
                    }
                    gvm0 gvm0Var2 = hvm0Var2.c;
                    scootersActivePassesV3UiStateMapper$getTitleGroup$12.L$0 = null;
                    scootersActivePassesV3UiStateMapper$getTitleGroup$12.L$1 = charSequence;
                    scootersActivePassesV3UiStateMapper$getTitleGroup$12.L$2 = charSequence2;
                    scootersActivePassesV3UiStateMapper$getTitleGroup$12.label = 3;
                    g = gVar.g(gvm0Var2, scootersActivePassesV3UiStateMapper$getTitleGroup$12);
                    if (g != obj) {
                    }
                }
                return obj;
            }
        }
        scootersActivePassesV3UiStateMapper$getTitleGroup$1 = new ScootersActivePassesV3UiStateMapper$getTitleGroup$1(gVar, continuationImpl);
        ScootersActivePassesV3UiStateMapper$getTitleGroup$1 scootersActivePassesV3UiStateMapper$getTitleGroup$122 = scootersActivePassesV3UiStateMapper$getTitleGroup$1;
        Object obj22 = scootersActivePassesV3UiStateMapper$getTitleGroup$122.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3UiStateMapper$getTitleGroup$122.label;
        if (i != 0) {
        }
        CharSequence charSequence52 = (CharSequence) obj22;
        ru.yandex.taxi.widget.c cVar22 = gVar.b;
        FormattedText formattedText22 = hvm0Var.b;
        scootersActivePassesV3UiStateMapper$getTitleGroup$122.L$0 = hvm0Var;
        scootersActivePassesV3UiStateMapper$getTitleGroup$122.L$1 = charSequence52;
        scootersActivePassesV3UiStateMapper$getTitleGroup$122.label = 2;
        b = nta1.b(cVar22, formattedText22, scootersActivePassesV3UiStateMapper$getTitleGroup$122);
        if (b != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(g gVar, sco0 sco0Var, jvm0 jvm0Var, ContinuationImpl continuationImpl) {
        ScootersActivePassesV3UiStateMapper$getUpsaleLongestPass$1 scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        sco0 sco0Var2;
        String str;
        Object b;
        sco0 sco0Var3;
        jvm0 jvm0Var2;
        CharSequence charSequence;
        String str2;
        Object e;
        CharSequence charSequence2;
        CharSequence charSequence3;
        jvm0 jvm0Var3;
        ivm0 ivm0Var;
        CharSequence charSequence4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        String str3;
        sco0 sco0Var4;
        String str4;
        CharSequence charSequence7;
        ivm0 ivm0Var2;
        CharSequence charSequence8;
        String str5;
        sco0 sco0Var5;
        CharSequence charSequence9;
        String str6;
        jvm0 jvm0Var4 = jvm0Var;
        gVar.getClass();
        if (continuationImpl instanceof ScootersActivePassesV3UiStateMapper$getUpsaleLongestPass$1) {
            scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$1 = (ScootersActivePassesV3UiStateMapper$getUpsaleLongestPass$1) continuationImpl;
            int i2 = scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$1.label = i2 - Integer.MIN_VALUE;
                ScootersActivePassesV3UiStateMapper$getUpsaleLongestPass$1 scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12 = scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$1;
                Object obj = scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.label;
                dum0 dum0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jvm0Var4 == null) {
                        return null;
                    }
                    String str7 = jvm0Var4.a;
                    ru.yandex.taxi.widget.c cVar = gVar.b;
                    FormattedText formattedText = jvm0Var4.b;
                    sco0Var2 = sco0Var;
                    scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$0 = sco0Var2;
                    scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$1 = jvm0Var4;
                    scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$2 = str7;
                    scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.label = 1;
                    Object e2 = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12, 30);
                    if (e2 != coroutineSingletons) {
                        str = str7;
                        obj = e2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        charSequence = (CharSequence) scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$3;
                        str = (String) scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$2;
                        jvm0 jvm0Var5 = (jvm0) scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$1;
                        sco0 sco0Var6 = (sco0) scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$0;
                        kotlin.b.b(obj);
                        jvm0Var2 = jvm0Var5;
                        sco0Var3 = sco0Var6;
                        str2 = str;
                        CharSequence charSequence10 = (CharSequence) obj;
                        ru.yandex.taxi.widget.c cVar2 = gVar.b;
                        FormattedText formattedText2 = jvm0Var2.d;
                        scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$0 = sco0Var3;
                        scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$1 = jvm0Var2;
                        scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$2 = str2;
                        scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$3 = charSequence;
                        scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$4 = charSequence10;
                        scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.label = 3;
                        e = ru.yandex.taxi.widget.c.e(cVar2, formattedText2, null, false, scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12, 30);
                        if (e != coroutineSingletons) {
                            charSequence2 = charSequence;
                            charSequence3 = charSequence10;
                            obj = e;
                            jvm0Var3 = jvm0Var2;
                            CharSequence charSequence11 = (CharSequence) obj;
                            String str8 = jvm0Var3.e;
                            ivm0Var = jvm0Var3.f;
                            if (ivm0Var != null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str6 = (String) scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$7;
                        charSequence7 = (CharSequence) scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$6;
                        charSequence9 = (CharSequence) scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$5;
                        charSequence8 = (CharSequence) scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$4;
                        str5 = (String) scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$3;
                        ivm0Var2 = (ivm0) scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$2;
                        sco0Var5 = (sco0) scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$0;
                        kotlin.b.b(obj);
                        dum0Var = new dum0((CharSequence) obj, gVar.a.a(ivm0Var2.b, AppColor$Palette.ControlMinor));
                        str3 = str6;
                        charSequence5 = charSequence7;
                        charSequence4 = charSequence9;
                        charSequence6 = charSequence8;
                        str4 = str5;
                        sco0Var4 = sco0Var5;
                        return new eum0(str4, charSequence6, charSequence4, charSequence5, str3, dum0Var, sco0Var4);
                    }
                    charSequence3 = (CharSequence) scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$4;
                    CharSequence charSequence12 = (CharSequence) scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$3;
                    String str9 = (String) scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$2;
                    jvm0Var3 = (jvm0) scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$1;
                    sco0 sco0Var7 = (sco0) scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$0;
                    kotlin.b.b(obj);
                    charSequence2 = charSequence12;
                    str2 = str9;
                    sco0Var3 = sco0Var7;
                    CharSequence charSequence112 = (CharSequence) obj;
                    String str82 = jvm0Var3.e;
                    ivm0Var = jvm0Var3.f;
                    if (ivm0Var != null) {
                        charSequence4 = charSequence3;
                        charSequence5 = charSequence112;
                        charSequence6 = charSequence2;
                        str3 = str82;
                        sco0Var4 = sco0Var3;
                        str4 = str2;
                        return new eum0(str4, charSequence6, charSequence4, charSequence5, str3, dum0Var, sco0Var4);
                    }
                    ru.yandex.taxi.widget.c cVar3 = gVar.b;
                    FormattedText formattedText3 = ivm0Var.a;
                    scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$0 = sco0Var3;
                    scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$1 = null;
                    scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$2 = ivm0Var;
                    scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$3 = str2;
                    scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$4 = charSequence2;
                    scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$5 = charSequence3;
                    scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$6 = charSequence112;
                    scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$7 = str82;
                    scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.label = 4;
                    Object e3 = ru.yandex.taxi.widget.c.e(cVar3, formattedText3, null, false, scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12, 30);
                    if (e3 != coroutineSingletons) {
                        charSequence7 = charSequence112;
                        obj = e3;
                        ivm0Var2 = ivm0Var;
                        charSequence8 = charSequence2;
                        str5 = str2;
                        sco0Var5 = sco0Var3;
                        charSequence9 = charSequence3;
                        str6 = str82;
                        dum0Var = new dum0((CharSequence) obj, gVar.a.a(ivm0Var2.b, AppColor$Palette.ControlMinor));
                        str3 = str6;
                        charSequence5 = charSequence7;
                        charSequence4 = charSequence9;
                        charSequence6 = charSequence8;
                        str4 = str5;
                        sco0Var4 = sco0Var5;
                        return new eum0(str4, charSequence6, charSequence4, charSequence5, str3, dum0Var, sco0Var4);
                    }
                    return coroutineSingletons;
                }
                String str10 = (String) scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$2;
                jvm0 jvm0Var6 = (jvm0) scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$1;
                sco0 sco0Var8 = (sco0) scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$0;
                kotlin.b.b(obj);
                str = str10;
                jvm0Var4 = jvm0Var6;
                sco0Var2 = sco0Var8;
                CharSequence charSequence13 = (CharSequence) obj;
                ru.yandex.taxi.widget.c cVar4 = gVar.b;
                FormattedText formattedText4 = jvm0Var4.c;
                scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$0 = sco0Var2;
                scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$1 = jvm0Var4;
                scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$2 = str;
                scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$3 = charSequence13;
                scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.label = 2;
                b = nta1.b(cVar4, formattedText4, scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12);
                if (b != coroutineSingletons) {
                    sco0Var3 = sco0Var2;
                    jvm0Var2 = jvm0Var4;
                    charSequence = charSequence13;
                    obj = b;
                    str2 = str;
                    CharSequence charSequence102 = (CharSequence) obj;
                    ru.yandex.taxi.widget.c cVar22 = gVar.b;
                    FormattedText formattedText22 = jvm0Var2.d;
                    scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$0 = sco0Var3;
                    scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$1 = jvm0Var2;
                    scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$2 = str2;
                    scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$3 = charSequence;
                    scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.L$4 = charSequence102;
                    scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12.label = 3;
                    e = ru.yandex.taxi.widget.c.e(cVar22, formattedText22, null, false, scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$12, 30);
                    if (e != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$1 = new ScootersActivePassesV3UiStateMapper$getUpsaleLongestPass$1(gVar, continuationImpl);
        ScootersActivePassesV3UiStateMapper$getUpsaleLongestPass$1 scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$122 = scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$1;
        Object obj2 = scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$122.label;
        dum0 dum0Var2 = null;
        if (i != 0) {
        }
        CharSequence charSequence132 = (CharSequence) obj2;
        ru.yandex.taxi.widget.c cVar42 = gVar.b;
        FormattedText formattedText42 = jvm0Var4.c;
        scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$122.L$0 = sco0Var2;
        scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$122.L$1 = jvm0Var4;
        scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$122.L$2 = str;
        scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$122.L$3 = charSequence132;
        scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$122.label = 2;
        b = nta1.b(cVar42, formattedText42, scootersActivePassesV3UiStateMapper$getUpsaleLongestPass$122);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(gvm0 gvm0Var, ContinuationImpl continuationImpl) {
        ScootersActivePassesV3UiStateMapper$getBadge$1 scootersActivePassesV3UiStateMapper$getBadge$1;
        int i;
        gvm0 gvm0Var2;
        wp2 wp2Var;
        wp2 wp2Var2;
        if (continuationImpl instanceof ScootersActivePassesV3UiStateMapper$getBadge$1) {
            scootersActivePassesV3UiStateMapper$getBadge$1 = (ScootersActivePassesV3UiStateMapper$getBadge$1) continuationImpl;
            int i2 = scootersActivePassesV3UiStateMapper$getBadge$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesV3UiStateMapper$getBadge$1.label = i2 - Integer.MIN_VALUE;
                ScootersActivePassesV3UiStateMapper$getBadge$1 scootersActivePassesV3UiStateMapper$getBadge$12 = scootersActivePassesV3UiStateMapper$getBadge$1;
                Object obj = scootersActivePassesV3UiStateMapper$getBadge$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesV3UiStateMapper$getBadge$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (gvm0Var == null) {
                        return null;
                    }
                    String str = gvm0Var.b;
                    AppColor$Palette appColor$Palette = AppColor$Palette.ControlMinor;
                    yp2 yp2Var = this.a;
                    wp2 a = yp2Var.a(str, appColor$Palette);
                    wp2 a2 = yp2Var.a(gvm0Var.c, a);
                    FormattedText formattedText = gvm0Var.a;
                    scootersActivePassesV3UiStateMapper$getBadge$12.L$0 = gvm0Var;
                    scootersActivePassesV3UiStateMapper$getBadge$12.L$1 = a;
                    scootersActivePassesV3UiStateMapper$getBadge$12.L$2 = a2;
                    scootersActivePassesV3UiStateMapper$getBadge$12.label = 1;
                    Object e = ru.yandex.taxi.widget.c.e(this.b, formattedText, null, false, scootersActivePassesV3UiStateMapper$getBadge$12, 30);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    gvm0Var2 = gvm0Var;
                    wp2Var = a;
                    obj = e;
                    wp2Var2 = a2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wp2Var2 = (wp2) scootersActivePassesV3UiStateMapper$getBadge$12.L$2;
                    wp2Var = (wp2) scootersActivePassesV3UiStateMapper$getBadge$12.L$1;
                    gvm0Var2 = (gvm0) scootersActivePassesV3UiStateMapper$getBadge$12.L$0;
                    kotlin.b.b(obj);
                }
                return new bum0((CharSequence) obj, wp2Var, wp2Var2, gvm0Var2.d);
            }
        }
        scootersActivePassesV3UiStateMapper$getBadge$1 = new ScootersActivePassesV3UiStateMapper$getBadge$1(this, continuationImpl);
        ScootersActivePassesV3UiStateMapper$getBadge$1 scootersActivePassesV3UiStateMapper$getBadge$122 = scootersActivePassesV3UiStateMapper$getBadge$1;
        Object obj2 = scootersActivePassesV3UiStateMapper$getBadge$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3UiStateMapper$getBadge$122.label;
        if (i != 0) {
        }
        return new bum0((CharSequence) obj2, wp2Var, wp2Var2, gvm0Var2.d);
    }
}
