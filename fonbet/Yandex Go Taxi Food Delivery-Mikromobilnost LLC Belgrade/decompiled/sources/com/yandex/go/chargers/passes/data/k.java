package com.yandex.go.chargers.passes.data;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.ala;
import defpackage.bla;
import defpackage.ela;
import defpackage.gla;
import defpackage.hla;
import defpackage.iga;
import defpackage.ila;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.uka;
import defpackage.vka;
import defpackage.wj90;
import defpackage.wp2;
import defpackage.yp2;
import defpackage.z3w;
import defpackage.zka;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class k {
    public final yp2 a;
    public final ru.yandex.taxi.widget.c b;

    public k(yp2 yp2Var, ru.yandex.taxi.widget.c cVar) {
        this.a = yp2Var;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(i iVar, ContinuationImpl continuationImpl) {
        ChargersPassButtonMapper$mapAction$1 chargersPassButtonMapper$mapAction$1;
        int i;
        String str;
        if (continuationImpl instanceof ChargersPassButtonMapper$mapAction$1) {
            chargersPassButtonMapper$mapAction$1 = (ChargersPassButtonMapper$mapAction$1) continuationImpl;
            int i2 = chargersPassButtonMapper$mapAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassButtonMapper$mapAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPassButtonMapper$mapAction$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassButtonMapper$mapAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (iVar instanceof ChargersPassButtonActionDto$OpenOffer) {
                        return new ala(((ChargersPassButtonActionDto$OpenOffer) iVar).b);
                    }
                    if (iVar instanceof ChargersPassButtonActionDto$Buy) {
                        return new gla(((ChargersPassButtonActionDto$Buy) iVar).b);
                    }
                    if (iVar instanceof ChargersPassButtonActionDto$Cancel) {
                        return new uka(((ChargersPassButtonActionDto$Cancel) iVar).b);
                    }
                    if (iVar instanceof ChargersPassButtonActionDto$Resume) {
                        return new ela(((ChargersPassButtonActionDto$Resume) iVar).b);
                    }
                    if (iVar instanceof ChargersPassButtonActionDto$Close) {
                        return vka.a;
                    }
                    if (iVar instanceof ChargersPassButtonActionDto$OpenPaymentSettings) {
                        return new bla(((ChargersPassButtonActionDto$OpenPaymentSettings) iVar).b);
                    }
                    if (!(iVar instanceof ChargersPassButtonActionDto$OpenCancelConfirmation)) {
                        return hla.a;
                    }
                    ChargersPassButtonActionDto$OpenCancelConfirmation chargersPassButtonActionDto$OpenCancelConfirmation = (ChargersPassButtonActionDto$OpenCancelConfirmation) iVar;
                    String str2 = chargersPassButtonActionDto$OpenCancelConfirmation.b;
                    ChargersPassCancelConfirmationDetailsDto chargersPassCancelConfirmationDetailsDto = chargersPassButtonActionDto$OpenCancelConfirmation.c;
                    chargersPassButtonMapper$mapAction$1.L$0 = null;
                    chargersPassButtonMapper$mapAction$1.L$1 = str2;
                    chargersPassButtonMapper$mapAction$1.label = 1;
                    Object c = c(chargersPassCancelConfirmationDetailsDto, chargersPassButtonMapper$mapAction$1);
                    if (c == obj2) {
                        return obj2;
                    }
                    obj = c;
                    str = str2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) chargersPassButtonMapper$mapAction$1.L$1;
                    kotlin.b.b(obj);
                }
                return new zka(str, (iga) obj);
            }
        }
        chargersPassButtonMapper$mapAction$1 = new ChargersPassButtonMapper$mapAction$1(this, continuationImpl);
        Object obj3 = chargersPassButtonMapper$mapAction$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassButtonMapper$mapAction$1.label;
        if (i != 0) {
        }
        return new zka(str, (iga) obj3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ChargersPassButtonDto chargersPassButtonDto, ContinuationImpl continuationImpl) {
        ChargersPassButtonMapper$mapButton$1 chargersPassButtonMapper$mapButton$1;
        Object obj;
        int i;
        Object a;
        CharSequence charSequence;
        wp2 wp2Var;
        if (continuationImpl instanceof ChargersPassButtonMapper$mapButton$1) {
            chargersPassButtonMapper$mapButton$1 = (ChargersPassButtonMapper$mapButton$1) continuationImpl;
            int i2 = chargersPassButtonMapper$mapButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassButtonMapper$mapButton$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersPassButtonMapper$mapButton$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassButtonMapper$mapButton$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    FormattedText formattedText = chargersPassButtonDto.a;
                    chargersPassButtonMapper$mapButton$1.L$0 = chargersPassButtonDto;
                    chargersPassButtonMapper$mapButton$1.label = 1;
                    obj2 = ru.yandex.taxi.widget.c.i(this.b, formattedText, null, chargersPassButtonMapper$mapButton$1, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        wp2Var = (wp2) chargersPassButtonMapper$mapButton$1.L$2;
                        charSequence = (CharSequence) chargersPassButtonMapper$mapButton$1.L$1;
                        kotlin.b.b(obj2);
                        return new wj90(charSequence, wp2Var, (ila) obj2);
                    }
                    chargersPassButtonDto = (ChargersPassButtonDto) chargersPassButtonMapper$mapButton$1.L$0;
                    kotlin.b.b(obj2);
                }
                CharSequence charSequence2 = (CharSequence) obj2;
                wp2 a2 = this.a.a(chargersPassButtonDto.b, AppColor$Palette.ControlMinor);
                i iVar = chargersPassButtonDto.c;
                chargersPassButtonMapper$mapButton$1.L$0 = null;
                chargersPassButtonMapper$mapButton$1.L$1 = charSequence2;
                chargersPassButtonMapper$mapButton$1.L$2 = a2;
                chargersPassButtonMapper$mapButton$1.label = 2;
                a = a(iVar, chargersPassButtonMapper$mapButton$1);
                if (a != obj) {
                    charSequence = charSequence2;
                    obj2 = a;
                    wp2Var = a2;
                    return new wj90(charSequence, wp2Var, (ila) obj2);
                }
                return obj;
            }
        }
        chargersPassButtonMapper$mapButton$1 = new ChargersPassButtonMapper$mapButton$1(this, continuationImpl);
        Object obj22 = chargersPassButtonMapper$mapButton$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassButtonMapper$mapButton$1.label;
        if (i != 0) {
        }
        CharSequence charSequence22 = (CharSequence) obj22;
        wp2 a22 = this.a.a(chargersPassButtonDto.b, AppColor$Palette.ControlMinor);
        i iVar2 = chargersPassButtonDto.c;
        chargersPassButtonMapper$mapButton$1.L$0 = null;
        chargersPassButtonMapper$mapButton$1.L$1 = charSequence22;
        chargersPassButtonMapper$mapButton$1.L$2 = a22;
        chargersPassButtonMapper$mapButton$1.label = 2;
        a = a(iVar2, chargersPassButtonMapper$mapButton$1);
        if (a != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        if (r2 == r4) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x012b -> B:12:0x012c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e0 -> B:32:0x00e1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ChargersPassCancelConfirmationDetailsDto chargersPassCancelConfirmationDetailsDto, ContinuationImpl continuationImpl) {
        ChargersPassButtonMapper$mapConfirmationDetails$1 chargersPassButtonMapper$mapConfirmationDetails$1;
        int i;
        ChargersPassCancelConfirmationDetailsDto chargersPassCancelConfirmationDetailsDto2;
        Collection arrayList;
        Iterator it;
        CharSequence charSequence;
        Iterator it2;
        CharSequence charSequence2;
        List list;
        Collection collection;
        ChargersPassCancelConfirmationDetailsDto chargersPassCancelConfirmationDetailsDto3 = chargersPassCancelConfirmationDetailsDto;
        if (continuationImpl instanceof ChargersPassButtonMapper$mapConfirmationDetails$1) {
            chargersPassButtonMapper$mapConfirmationDetails$1 = (ChargersPassButtonMapper$mapConfirmationDetails$1) continuationImpl;
            int i2 = chargersPassButtonMapper$mapConfirmationDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassButtonMapper$mapConfirmationDetails$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPassButtonMapper$mapConfirmationDetails$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassButtonMapper$mapConfirmationDetails$1.label;
                int i3 = 30;
                ru.yandex.taxi.widget.c cVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = chargersPassCancelConfirmationDetailsDto3.a;
                    chargersPassButtonMapper$mapConfirmationDetails$1.L$0 = chargersPassCancelConfirmationDetailsDto3;
                    chargersPassButtonMapper$mapConfirmationDetails$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, chargersPassButtonMapper$mapConfirmationDetails$1, 30);
                } else if (i == 1) {
                    chargersPassCancelConfirmationDetailsDto3 = (ChargersPassCancelConfirmationDetailsDto) chargersPassButtonMapper$mapConfirmationDetails$1.L$0;
                    kotlin.b.b(obj);
                } else if (i == 2) {
                    arrayList = (Collection) chargersPassButtonMapper$mapConfirmationDetails$1.L$8;
                    charSequence = (CharSequence) chargersPassButtonMapper$mapConfirmationDetails$1.L$7;
                    it = (Iterator) chargersPassButtonMapper$mapConfirmationDetails$1.L$4;
                    Collection collection2 = (Collection) chargersPassButtonMapper$mapConfirmationDetails$1.L$3;
                    chargersPassCancelConfirmationDetailsDto2 = (ChargersPassCancelConfirmationDetailsDto) chargersPassButtonMapper$mapConfirmationDetails$1.L$0;
                    kotlin.b.b(obj);
                    arrayList.add((z3w) obj);
                    arrayList = collection2;
                    if (!it.hasNext()) {
                        ChargersPassCancelInstructionItemDto chargersPassCancelInstructionItemDto = (ChargersPassCancelInstructionItemDto) it.next();
                        chargersPassButtonMapper$mapConfirmationDetails$1.L$0 = chargersPassCancelConfirmationDetailsDto2;
                        chargersPassButtonMapper$mapConfirmationDetails$1.L$1 = null;
                        chargersPassButtonMapper$mapConfirmationDetails$1.L$2 = null;
                        chargersPassButtonMapper$mapConfirmationDetails$1.L$3 = arrayList;
                        chargersPassButtonMapper$mapConfirmationDetails$1.L$4 = it;
                        chargersPassButtonMapper$mapConfirmationDetails$1.L$5 = null;
                        chargersPassButtonMapper$mapConfirmationDetails$1.L$6 = null;
                        chargersPassButtonMapper$mapConfirmationDetails$1.L$7 = charSequence;
                        chargersPassButtonMapper$mapConfirmationDetails$1.L$8 = arrayList;
                        chargersPassButtonMapper$mapConfirmationDetails$1.label = 2;
                        obj = d(chargersPassCancelInstructionItemDto, chargersPassButtonMapper$mapConfirmationDetails$1);
                        if (obj != obj2) {
                            collection2 = arrayList;
                            arrayList.add((z3w) obj);
                            arrayList = collection2;
                            if (!it.hasNext()) {
                                List list2 = chargersPassCancelConfirmationDetailsDto2.c;
                                ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                                it2 = list2.iterator();
                                charSequence2 = charSequence;
                                list = (List) arrayList;
                                collection = arrayList2;
                                if (it2.hasNext()) {
                                }
                            }
                        }
                        return obj2;
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = (Collection) chargersPassButtonMapper$mapConfirmationDetails$1.L$9;
                    list = (List) chargersPassButtonMapper$mapConfirmationDetails$1.L$8;
                    charSequence2 = (CharSequence) chargersPassButtonMapper$mapConfirmationDetails$1.L$7;
                    ChargersPassButtonDto chargersPassButtonDto = (ChargersPassButtonDto) chargersPassButtonMapper$mapConfirmationDetails$1.L$6;
                    it2 = (Iterator) chargersPassButtonMapper$mapConfirmationDetails$1.L$4;
                    Collection collection3 = (Collection) chargersPassButtonMapper$mapConfirmationDetails$1.L$3;
                    kotlin.b.b(obj);
                    CharSequence charSequence3 = (CharSequence) obj;
                    wp2 a = this.a.a(chargersPassButtonDto.b, AppColor$Palette.ControlMinor);
                    i iVar = chargersPassButtonDto.c;
                    collection.add(new wj90(charSequence3, a, !(iVar instanceof ChargersPassButtonActionDto$Cancel) ? iVar instanceof ChargersPassButtonActionDto$Close ? vka.a : hla.a : new uka(((ChargersPassButtonActionDto$Cancel) iVar).b)));
                    collection = collection3;
                    i3 = 30;
                    if (it2.hasNext()) {
                        chargersPassButtonDto = (ChargersPassButtonDto) it2.next();
                        FormattedText formattedText2 = chargersPassButtonDto.a;
                        chargersPassButtonMapper$mapConfirmationDetails$1.L$0 = null;
                        chargersPassButtonMapper$mapConfirmationDetails$1.L$1 = null;
                        chargersPassButtonMapper$mapConfirmationDetails$1.L$2 = null;
                        chargersPassButtonMapper$mapConfirmationDetails$1.L$3 = collection;
                        chargersPassButtonMapper$mapConfirmationDetails$1.L$4 = it2;
                        chargersPassButtonMapper$mapConfirmationDetails$1.L$5 = null;
                        chargersPassButtonMapper$mapConfirmationDetails$1.L$6 = chargersPassButtonDto;
                        chargersPassButtonMapper$mapConfirmationDetails$1.L$7 = charSequence2;
                        chargersPassButtonMapper$mapConfirmationDetails$1.L$8 = list;
                        chargersPassButtonMapper$mapConfirmationDetails$1.L$9 = collection;
                        chargersPassButtonMapper$mapConfirmationDetails$1.label = 3;
                        obj = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, chargersPassButtonMapper$mapConfirmationDetails$1, i3);
                        if (obj != obj2) {
                            collection3 = collection;
                            CharSequence charSequence32 = (CharSequence) obj;
                            wp2 a2 = this.a.a(chargersPassButtonDto.b, AppColor$Palette.ControlMinor);
                            i iVar2 = chargersPassButtonDto.c;
                            collection.add(new wj90(charSequence32, a2, !(iVar2 instanceof ChargersPassButtonActionDto$Cancel) ? iVar2 instanceof ChargersPassButtonActionDto$Close ? vka.a : hla.a : new uka(((ChargersPassButtonActionDto$Cancel) iVar2).b)));
                            collection = collection3;
                            i3 = 30;
                            if (it2.hasNext()) {
                                return new iga(charSequence2, list, (List) collection);
                            }
                        }
                        return obj2;
                    }
                }
                List list3 = chargersPassCancelConfirmationDetailsDto3.b;
                chargersPassCancelConfirmationDetailsDto2 = chargersPassCancelConfirmationDetailsDto3;
                arrayList = new ArrayList(tcc.n(list3, 10));
                it = list3.iterator();
                charSequence = (CharSequence) obj;
                if (!it.hasNext()) {
                }
            }
        }
        chargersPassButtonMapper$mapConfirmationDetails$1 = new ChargersPassButtonMapper$mapConfirmationDetails$1(this, continuationImpl);
        Object obj3 = chargersPassButtonMapper$mapConfirmationDetails$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassButtonMapper$mapConfirmationDetails$1.label;
        int i32 = 30;
        ru.yandex.taxi.widget.c cVar2 = this.b;
        if (i != 0) {
        }
        List list32 = chargersPassCancelConfirmationDetailsDto3.b;
        chargersPassCancelConfirmationDetailsDto2 = chargersPassCancelConfirmationDetailsDto3;
        arrayList = new ArrayList(tcc.n(list32, 10));
        it = list32.iterator();
        charSequence = (CharSequence) obj3;
        if (!it.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ChargersPassCancelInstructionItemDto chargersPassCancelInstructionItemDto, ContinuationImpl continuationImpl) {
        ChargersPassButtonMapper$mapInstruction$1 chargersPassButtonMapper$mapInstruction$1;
        int i;
        String str;
        if (continuationImpl instanceof ChargersPassButtonMapper$mapInstruction$1) {
            chargersPassButtonMapper$mapInstruction$1 = (ChargersPassButtonMapper$mapInstruction$1) continuationImpl;
            int i2 = chargersPassButtonMapper$mapInstruction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassButtonMapper$mapInstruction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPassButtonMapper$mapInstruction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassButtonMapper$mapInstruction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str2 = chargersPassCancelInstructionItemDto.a;
                    FormattedText formattedText = chargersPassCancelInstructionItemDto.b;
                    chargersPassButtonMapper$mapInstruction$1.L$0 = null;
                    chargersPassButtonMapper$mapInstruction$1.L$1 = str2;
                    chargersPassButtonMapper$mapInstruction$1.label = 1;
                    Object i3 = ru.yandex.taxi.widget.c.i(this.b, formattedText, null, chargersPassButtonMapper$mapInstruction$1, 30);
                    if (i3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = i3;
                    str = str2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) chargersPassButtonMapper$mapInstruction$1.L$1;
                    kotlin.b.b(obj);
                }
                return new z3w((CharSequence) obj, str);
            }
        }
        chargersPassButtonMapper$mapInstruction$1 = new ChargersPassButtonMapper$mapInstruction$1(this, continuationImpl);
        Object obj2 = chargersPassButtonMapper$mapInstruction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassButtonMapper$mapInstruction$1.label;
        if (i != 0) {
        }
        return new z3w((CharSequence) obj2, str);
    }
}
