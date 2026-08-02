package com.yandex.go.loyalty.impl.selector.ui;

import com.yandex.go.loyalty.api.data.model.common.ColorDto;
import com.yandex.go.loyalty.api.data.model.common.ColorSettings;
import com.yandex.go.loyalty.api.data.model.common.LinearColorSettings;
import com.yandex.go.loyalty.impl.selector.domain.LoyaltySelectorLoadingState;
import defpackage.avj0;
import defpackage.ciq0;
import defpackage.cwz;
import defpackage.diq0;
import defpackage.dvz;
import defpackage.dwz;
import defpackage.dxz;
import defpackage.eiq0;
import defpackage.evu0;
import defpackage.exz;
import defpackage.fiq0;
import defpackage.fxz;
import defpackage.gxz;
import defpackage.hxz;
import defpackage.i4u;
import defpackage.iwz;
import defpackage.ixz;
import defpackage.jl40;
import defpackage.kxz;
import defpackage.kyh0;
import defpackage.ldc;
import defpackage.lxz;
import defpackage.ly3;
import defpackage.mxz;
import defpackage.nxz;
import defpackage.ny61;
import defpackage.ovz;
import defpackage.pvz;
import defpackage.qvz;
import defpackage.rcc;
import defpackage.rol0;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.twz;
import defpackage.uiy;
import defpackage.up2;
import defpackage.w511;
import defpackage.wp2;
import defpackage.yp2;
import defpackage.yt11;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class b implements yt11 {
    public final zuj0 a;
    public final nxz b;
    public final c c;
    public final dwz d;
    public final iwz e;
    public final i4u f;
    public final twz g;
    public final rol0 h = new rol0(new LoyaltySelectorUiStateInteractor$uiStateFlow$1(this, null));

    public b(zuj0 zuj0Var, nxz nxzVar, c cVar, dwz dwzVar, iwz iwzVar, i4u i4uVar, twz twzVar) {
        this.a = zuj0Var;
        this.b = nxzVar;
        this.c = cVar;
        this.d = dwzVar;
        this.e = iwzVar;
        this.f = i4uVar;
        this.g = twzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00bc -> B:10:0x00c0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, lxz lxzVar, LoyaltySelectorLoadingState loyaltySelectorLoadingState, fiq0 fiq0Var, Continuation continuation) {
        LoyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1 loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1;
        int i;
        Collection arrayList;
        LoyaltySelectorLoadingState loyaltySelectorLoadingState2;
        fiq0 fiq0Var2;
        String str;
        LoyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1 loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$12;
        Iterator it;
        lxz lxzVar2;
        zuj0 zuj0Var = bVar.a;
        if (continuation instanceof LoyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1) {
            loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1 = (LoyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1) continuation;
            int i2 = loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1.label = i2 - Integer.MIN_VALUE;
                Object obj = loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (loyaltySelectorLoadingState == LoyaltySelectorLoadingState.FIRST_LOADING) {
                        return bVar.c();
                    }
                    String h = ((avj0) zuj0Var).h(kyh0.loyalty_program_headline);
                    ArrayList arrayList2 = lxzVar.a.b;
                    arrayList = new ArrayList(tcc.n(arrayList2, 10));
                    loyaltySelectorLoadingState2 = loyaltySelectorLoadingState;
                    fiq0Var2 = fiq0Var;
                    str = h;
                    loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$12 = loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1;
                    it = arrayList2.iterator();
                    lxzVar2 = lxzVar;
                    r14 = arrayList;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Collection collection = (Collection) loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1.L$10;
                    str = (String) loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1.L$9;
                    Iterator it2 = (Iterator) loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1.L$6;
                    arrayList = (Collection) loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1.L$5;
                    fiq0 fiq0Var3 = (fiq0) loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1.L$2;
                    loyaltySelectorLoadingState2 = (LoyaltySelectorLoadingState) loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1.L$1;
                    lxz lxzVar3 = (lxz) loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1.L$0;
                    kotlin.b.b(obj);
                    loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$12 = loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1;
                    it = it2;
                    collection.add((ixz) obj);
                    lxzVar2 = lxzVar3;
                    fiq0Var2 = fiq0Var3;
                    collection = arrayList;
                    if (it.hasNext()) {
                        dvz dvzVar = (dvz) it.next();
                        ArrayList arrayList3 = lxzVar2.c;
                        loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$12.L$0 = lxzVar2;
                        loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$12.L$1 = loyaltySelectorLoadingState2;
                        loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$12.L$2 = fiq0Var2;
                        loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$12.L$3 = null;
                        loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$12.L$4 = null;
                        loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$12.L$5 = collection;
                        loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$12.L$6 = it;
                        loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$12.L$7 = null;
                        loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$12.L$8 = null;
                        loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$12.L$9 = str;
                        loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$12.L$10 = collection;
                        loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$12.label = 1;
                        Object d = bVar.d(dvzVar, arrayList3, loyaltySelectorLoadingState2, fiq0Var2, loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$12);
                        if (d == obj2) {
                            return obj2;
                        }
                        fiq0Var3 = fiq0Var2;
                        lxzVar3 = lxzVar2;
                        obj = d;
                        arrayList = collection;
                        collection.add((ixz) obj);
                        lxzVar2 = lxzVar3;
                        fiq0Var2 = fiq0Var3;
                        collection = arrayList;
                        if (it.hasNext()) {
                            return new kxz(str, (List) collection, new dxz(((avj0) zuj0Var).h(kyh0.common_done), loyaltySelectorLoadingState2 == LoyaltySelectorLoadingState.ACCEPT_PROGRAM_LOADING));
                        }
                    }
                }
            }
        }
        loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1 = new LoyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1(bVar, continuation);
        Object obj3 = loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1.label;
        if (i != 0) {
        }
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.h;
    }

    public final kxz c() {
        int i = kyh0.loyalty_program_headline;
        avj0 avj0Var = (avj0) this.a;
        String h = avj0Var.h(i);
        ListBuilder a = rcc.a();
        hxz hxzVar = hxz.a;
        a.add(hxzVar);
        a.add(hxzVar);
        return new kxz(h, a.j(), new dxz(avj0Var.h(kyh0.common_done), false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(dvz dvzVar, ArrayList arrayList, LoyaltySelectorLoadingState loyaltySelectorLoadingState, fiq0 fiq0Var, ContinuationImpl continuationImpl) {
        LoyaltySelectorUiStateInteractor$mapLoyaltyProgram$1 loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1;
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        int i3;
        if (continuationImpl instanceof LoyaltySelectorUiStateInteractor$mapLoyaltyProgram$1) {
            loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1 = (LoyaltySelectorUiStateInteractor$mapLoyaltyProgram$1) continuationImpl;
            int i4 = loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1.label = i4 - Integer.MIN_VALUE;
                Object obj = loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (fiq0Var instanceof eiq0) {
                        i2 = jl40.l(((eiq0) fiq0Var).a, dvzVar.a);
                    } else if (fiq0Var instanceof ciq0) {
                        i2 = jl40.l(((ciq0) fiq0Var).a, dvzVar.a);
                    } else {
                        if (!(fiq0Var instanceof diq0)) {
                            w511.b();
                            return null;
                        }
                        i2 = 0;
                    }
                    str = dvzVar.a;
                    String str5 = dvzVar.b;
                    String str6 = dvzVar.e;
                    String str7 = dvzVar.c;
                    loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1.L$0 = null;
                    loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1.L$1 = null;
                    loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1.L$2 = null;
                    loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1.L$3 = null;
                    loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1.L$4 = str;
                    loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1.L$5 = str5;
                    loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1.L$6 = str6;
                    loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1.L$7 = str7;
                    loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1.I$0 = i2;
                    loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1.I$1 = i2;
                    loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1.label = 1;
                    Object e = e(dvzVar, arrayList, loyaltySelectorLoadingState, loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1);
                    if (e == obj2) {
                        return obj2;
                    }
                    str2 = str6;
                    str3 = str7;
                    str4 = str5;
                    obj = e;
                    i3 = i2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1.I$1;
                    String str8 = (String) loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1.L$7;
                    String str9 = (String) loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1.L$6;
                    String str10 = (String) loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1.L$5;
                    str = (String) loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1.L$4;
                    kotlin.b.b(obj);
                    str3 = str8;
                    str2 = str9;
                    str4 = str10;
                }
                return new ixz(str, str4, str2, str3, i3 == 0, (gxz) obj);
            }
        }
        loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1 = new LoyaltySelectorUiStateInteractor$mapLoyaltyProgram$1(this, continuationImpl);
        Object obj3 = loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loyaltySelectorUiStateInteractor$mapLoyaltyProgram$1.label;
        if (i != 0) {
        }
        return new ixz(str, str4, str2, str3, i3 == 0, (gxz) obj3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0159, code lost:
    
        if (r4 != r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ad, code lost:
    
        if (r2 == r3) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(dvz dvzVar, List list, LoyaltySelectorLoadingState loyaltySelectorLoadingState, ContinuationImpl continuationImpl) {
        LoyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$1 loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$1;
        int i;
        Object obj;
        mxz mxzVar;
        uiy uiyVar;
        LoyaltySelectorLoadingState loyaltySelectorLoadingState2;
        boolean z;
        Object e;
        if (continuationImpl instanceof LoyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$1) {
            loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$1 = (LoyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$1) continuationImpl;
            int i2 = loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$1.label = i2 - Integer.MIN_VALUE;
                LoyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$1 loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12 = loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$1;
                Object obj2 = loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12.label;
                if (i == 0) {
                    if (i == 1) {
                        uiyVar = (uiy) loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12.L$4;
                        LoyaltySelectorLoadingState loyaltySelectorLoadingState3 = (LoyaltySelectorLoadingState) loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12.L$2;
                        kotlin.b.b(obj2);
                        e = obj2;
                        loyaltySelectorLoadingState2 = loyaltySelectorLoadingState3;
                        z = true;
                        return new fxz((CharSequence) e, loyaltySelectorLoadingState2 == LoyaltySelectorLoadingState.GET_DATA_FOR_AUTH ? z : false, uiyVar);
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mxzVar = (mxz) loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12.L$4;
                    kotlin.b.b(obj2);
                    CharSequence charSequence = (CharSequence) obj2;
                    String str = mxzVar != null ? mxzVar.d : null;
                    String str2 = (str == null || evu0.J(str)) ? null : str;
                    if (str2 == null) {
                        str2 = charSequence.toString();
                    }
                    return new exz(charSequence, str2);
                }
                kotlin.b.b(obj2);
                ovz ovzVar = dvzVar.f;
                boolean z2 = ovzVar instanceof qvz;
                c cVar = this.c;
                if (z2) {
                    qvz qvzVar = (qvz) ovzVar;
                    ColorSettings colorSettings = qvzVar.c;
                    int i3 = cwz.a[colorSettings.a.ordinal()];
                    if (i3 == 1) {
                        LinearColorSettings linearColorSettings = colorSettings.b;
                        if (linearColorSettings != null) {
                            List list2 = linearColorSettings.a;
                            List list3 = linearColorSettings.c;
                            List list4 = linearColorSettings.b;
                            List<ColorDto> list5 = list2;
                            ArrayList arrayList = new ArrayList(tcc.n(list5, 10));
                            for (ColorDto colorDto : list5) {
                                yp2 yp2Var = this.d.a;
                                String str3 = colorDto.a;
                                long j = ldc.l;
                                wp2 g = ly3.g(j, yp2Var, str3);
                                if (g instanceof up2) {
                                    j = ((up2) g).a;
                                }
                                arrayList.add(new ldc(j));
                            }
                            ArrayList arrayList2 = new ArrayList(tcc.n(list5, 10));
                            Iterator it = list5.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(Float.valueOf(((ColorDto) it.next()).b));
                            }
                            uiyVar = new uiy(arrayList, arrayList2, (Float.floatToRawIntBits(LinearColorSettings.e(list4).x) << 32) | (Float.floatToRawIntBits(LinearColorSettings.e(list4).y) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(LinearColorSettings.e(list3).x) << 32) | (Float.floatToRawIntBits(LinearColorSettings.e(list3).y) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                            FormattedText formattedText = qvzVar.a;
                            loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12.L$0 = null;
                            loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12.L$1 = null;
                            loyaltySelectorLoadingState2 = loyaltySelectorLoadingState;
                            loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12.L$2 = loyaltySelectorLoadingState2;
                            loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12.L$3 = null;
                            loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12.L$4 = uiyVar;
                            z = true;
                            loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12.label = 1;
                            e = c.e(cVar, formattedText, null, false, loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12, 30);
                        }
                    } else if (i3 != 2 && i3 != 3) {
                        w511.b();
                        return null;
                    }
                    uiyVar = null;
                    FormattedText formattedText2 = qvzVar.a;
                    loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12.L$0 = null;
                    loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12.L$1 = null;
                    loyaltySelectorLoadingState2 = loyaltySelectorLoadingState;
                    loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12.L$2 = loyaltySelectorLoadingState2;
                    loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12.L$3 = null;
                    loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12.L$4 = uiyVar;
                    z = true;
                    loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12.label = 1;
                    e = c.e(cVar, formattedText2, null, false, loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12, 30);
                } else {
                    if (!(ovzVar instanceof pvz)) {
                        w511.b();
                        return null;
                    }
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (jl40.l(((mxz) obj).a, dvzVar.a)) {
                            break;
                        }
                    }
                    mxzVar = (mxz) obj;
                    FormattedText formattedText3 = ((pvz) ovzVar).a;
                    loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12.L$0 = null;
                    loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12.L$1 = null;
                    loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12.L$2 = null;
                    loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12.L$3 = null;
                    loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12.L$4 = mxzVar;
                    loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12.label = 2;
                    obj2 = c.e(cVar, formattedText3, null, false, loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$12, 30);
                }
                return coroutineSingletons;
            }
        }
        loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$1 = new LoyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$1(this, continuationImpl);
        LoyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$1 loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$122 = loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$1;
        Object obj22 = loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loyaltySelectorUiStateInteractor$mapLoyaltyProgramSelectorState$122.label;
        if (i == 0) {
        }
    }
}
