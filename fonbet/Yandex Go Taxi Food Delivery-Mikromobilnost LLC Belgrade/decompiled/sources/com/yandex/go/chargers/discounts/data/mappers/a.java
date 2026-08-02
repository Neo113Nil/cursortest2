package com.yandex.go.chargers.discounts.data.mappers;

import com.yandex.go.chargers.data.model.ChargersAttributeDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountDetailsButtonDto;
import com.yandex.go.chargers.discounts.data.models.ChargersProgressDiscountDetailsDto;
import com.yandex.go.chargers.discounts.data.models.ChargersPromoDetailsDto;
import com.yandex.go.chargers.discounts.data.models.ChargersTaskDiscountDetailsDto;
import com.yandex.go.chargers.discounts.data.models.k0;
import com.yandex.go.chargers.discounts.data.models.m0;
import com.yandex.go.chargers.discounts.data.models.n0;
import com.yandex.go.chargers.discounts.data.models.q0;
import defpackage.avj0;
import defpackage.ir9;
import defpackage.jl40;
import defpackage.jna;
import defpackage.jr9;
import defpackage.kdc;
import defpackage.kna;
import defpackage.kyh0;
import defpackage.lea0;
import defpackage.lna;
import defpackage.lya;
import defpackage.mr9;
import defpackage.mya;
import defpackage.nr9;
import defpackage.ny61;
import defpackage.ona;
import defpackage.ow9;
import defpackage.pna;
import defpackage.shq0;
import defpackage.tcc;
import defpackage.tj9;
import defpackage.tn9;
import defpackage.tr9;
import defpackage.uj9;
import defpackage.uo9;
import defpackage.vr9;
import defpackage.yfa;
import defpackage.yr9;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class a {
    public final zuj0 a;
    public final e b;
    public final c c;
    public final com.yandex.go.chargers.domain.mapper.a d;
    public final yfa e;
    public final com.yandex.go.chargers.payments.data.a f;

    public a(zuj0 zuj0Var, e eVar, c cVar, com.yandex.go.chargers.domain.mapper.a aVar, yfa yfaVar, com.yandex.go.chargers.payments.data.a aVar2) {
        this.a = zuj0Var;
        this.b = eVar;
        this.c = cVar;
        this.d = aVar;
        this.e = yfaVar;
        this.f = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x039a, code lost:
    
        if (r4 == r5) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r15v38, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v43, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v61, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v55, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0567 -> B:53:0x01ce). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ChargersProgressDiscountDetailsDto chargersProgressDiscountDetailsDto, ir9 ir9Var, ow9 ow9Var, ContinuationImpl continuationImpl) {
        ChargersDiscountDetailsMapper$mapProgressDiscountDetails$1 chargersDiscountDetailsMapper$mapProgressDiscountDetails$1;
        int i;
        Object obj;
        int i2;
        ir9 ir9Var2;
        Object e;
        ChargersProgressDiscountDetailsDto chargersProgressDiscountDetailsDto2;
        ir9 ir9Var3;
        int i3;
        CharSequence charSequence;
        ir9 ir9Var4;
        CharSequence charSequence2;
        ChargersAttributeDto chargersAttributeDto;
        tn9 tn9Var;
        Object e2;
        ChargersProgressDiscountDetailsDto chargersProgressDiscountDetailsDto3;
        ir9 ir9Var5;
        ir9 ir9Var6;
        CharSequence charSequence3;
        CharSequence charSequence4;
        lna lnaVar;
        Object e3;
        CharSequence charSequence5;
        CharSequence charSequence6;
        CharSequence charSequence7;
        ir9 ir9Var7;
        tn9 tn9Var2;
        ir9 ir9Var8;
        lna lnaVar2;
        lna lnaVar3;
        ChargersProgressDiscountDetailsDto chargersProgressDiscountDetailsDto4;
        int i4;
        Iterator it;
        int i5;
        ArrayList arrayList;
        CoroutineSingletons coroutineSingletons;
        ir9 ir9Var9;
        String str;
        int i6;
        CharSequence charSequence8;
        ChargersDiscountDetailsMapper$mapProgressDiscountDetails$1 chargersDiscountDetailsMapper$mapProgressDiscountDetails$12;
        ir9 ir9Var10;
        lna lnaVar4;
        tn9 tn9Var3;
        CharSequence charSequence9;
        CharSequence charSequence10;
        lna lnaVar5;
        CharSequence charSequence11;
        lna lnaVar6;
        CharSequence charSequence12;
        ChargersProgressDiscountDetailsDto.ProgressDiscountPerkDto progressDiscountPerkDto;
        int i7;
        CoroutineSingletons coroutineSingletons2;
        ArrayList arrayList2;
        String str2;
        ChargersDiscountDetailsMapper$mapProgressDiscountDetails$1 chargersDiscountDetailsMapper$mapProgressDiscountDetails$13;
        lna lnaVar7;
        CharSequence charSequence13;
        int i8;
        Iterator it2;
        Object obj2;
        CharSequence charSequence14;
        CharSequence charSequence15;
        tn9 tn9Var4;
        String str3;
        int i9;
        ArrayList arrayList3;
        CharSequence charSequence16;
        String str4;
        ChargersDiscountDetailsMapper$mapProgressDiscountDetails$1 chargersDiscountDetailsMapper$mapProgressDiscountDetails$14;
        Object e4;
        CoroutineSingletons coroutineSingletons3;
        ArrayList arrayList4;
        Iterator it3;
        ChargersProgressDiscountDetailsDto chargersProgressDiscountDetailsDto5;
        ir9 ir9Var11;
        Collection collection;
        CharSequence charSequence17;
        CharSequence charSequence18;
        String str5;
        CharSequence charSequence19;
        a aVar;
        ArrayList arrayList5;
        int i10;
        Object obj3;
        lna lnaVar8;
        int i11;
        CharSequence charSequence20;
        String str6;
        CoroutineSingletons coroutineSingletons4;
        CharSequence charSequence21;
        lna lnaVar9;
        int i12;
        ir9 ir9Var12;
        tn9 tn9Var5;
        int i13;
        ChargersDiscountDetailsButtonDto chargersDiscountDetailsButtonDto;
        CharSequence charSequence22;
        CharSequence charSequence23;
        String str7;
        CharSequence charSequence24;
        tn9 tn9Var6;
        uo9 uo9Var;
        int i14;
        lna lnaVar10;
        CharSequence charSequence25;
        lna lnaVar11;
        ir9 ir9Var13;
        Object obj4;
        ir9 ir9Var14;
        ChargersDiscountDetailsButtonDto chargersDiscountDetailsButtonDto2;
        CharSequence charSequence26;
        ArrayList arrayList6;
        CharSequence charSequence27;
        int i15;
        String h;
        CharSequence charSequence28;
        tn9 tn9Var7;
        lna lnaVar12;
        ir9 ir9Var15;
        CharSequence charSequence29;
        ChargersDiscountDetailsButtonDto chargersDiscountDetailsButtonDto3;
        ChargersDiscountDetailsMapper$mapProgressDiscountDetails$1 chargersDiscountDetailsMapper$mapProgressDiscountDetails$15;
        int i16;
        CharSequence charSequence30;
        String str8;
        CharSequence charSequence31;
        tn9 tn9Var8;
        String str9;
        CharSequence charSequence32;
        int i17;
        ChargersDiscountDetailsButtonDto chargersDiscountDetailsButtonDto4;
        tn9 tn9Var9;
        int i18;
        CharSequence charSequence33;
        lna lnaVar13;
        lna lnaVar14;
        String str10;
        String str11;
        CharSequence charSequence34;
        CharSequence charSequence35;
        ir9 ir9Var16;
        ArrayList arrayList7;
        CharSequence charSequence36;
        int i19;
        CharSequence charSequence37;
        ChargersProgressDiscountDetailsDto chargersProgressDiscountDetailsDto6 = chargersProgressDiscountDetailsDto;
        ir9 ir9Var17 = ir9Var;
        if (continuationImpl instanceof ChargersDiscountDetailsMapper$mapProgressDiscountDetails$1) {
            chargersDiscountDetailsMapper$mapProgressDiscountDetails$1 = (ChargersDiscountDetailsMapper$mapProgressDiscountDetails$1) continuationImpl;
            int i20 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$1.label;
            if ((i20 & Integer.MIN_VALUE) != 0) {
                chargersDiscountDetailsMapper$mapProgressDiscountDetails$1.label = i20 - Integer.MIN_VALUE;
                ChargersDiscountDetailsMapper$mapProgressDiscountDetails$1 chargersDiscountDetailsMapper$mapProgressDiscountDetails$16 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$1;
                Object obj5 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.result;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.label;
                yfa yfaVar = this.e;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj5);
                        int i21 = (jl40.l(ir9Var17.b, ow9Var != null ? ow9Var.b : null) && ir9Var17.a == ow9Var.a) ? 1 : 0;
                        FormattedText formattedText = chargersProgressDiscountDetailsDto6.a;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$0 = chargersProgressDiscountDetailsDto6;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$1 = ir9Var17;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$2 = null;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$3 = ir9Var17;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$0 = i21;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.label = 1;
                        Object e5 = c.e(this.c, formattedText, null, false, chargersDiscountDetailsMapper$mapProgressDiscountDetails$16, 30);
                        if (e5 != coroutineSingletons5) {
                            obj = e5;
                            i2 = i21;
                            ir9Var2 = ir9Var17;
                            CharSequence charSequence38 = (CharSequence) obj;
                            FormattedText formattedText2 = chargersProgressDiscountDetailsDto6.b;
                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$0 = chargersProgressDiscountDetailsDto6;
                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$1 = ir9Var2;
                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$2 = null;
                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$3 = ir9Var17;
                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$4 = charSequence38;
                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$0 = i2;
                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.label = 2;
                            e = c.e(this.c, formattedText2, null, false, chargersDiscountDetailsMapper$mapProgressDiscountDetails$16, 30);
                            if (e != coroutineSingletons5) {
                                chargersProgressDiscountDetailsDto2 = chargersProgressDiscountDetailsDto6;
                                ir9Var3 = ir9Var2;
                                i3 = i2;
                                obj5 = e;
                                charSequence = charSequence38;
                                ir9Var4 = ir9Var17;
                                charSequence2 = (CharSequence) obj5;
                                chargersAttributeDto = chargersProgressDiscountDetailsDto2.c;
                                if (chargersAttributeDto == null) {
                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$0 = chargersProgressDiscountDetailsDto2;
                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$1 = ir9Var3;
                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$2 = null;
                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$3 = null;
                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$4 = ir9Var4;
                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$5 = charSequence;
                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$6 = charSequence2;
                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$0 = i3;
                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.label = 3;
                                    obj5 = this.d.a(chargersAttributeDto, chargersDiscountDetailsMapper$mapProgressDiscountDetails$16);
                                    break;
                                } else {
                                    tn9Var = null;
                                    ir9 ir9Var18 = ir9Var4;
                                    ir9 ir9Var19 = ir9Var3;
                                    ChargersProgressDiscountDetailsDto chargersProgressDiscountDetailsDto7 = chargersProgressDiscountDetailsDto2;
                                    lna l = yfaVar.l(chargersProgressDiscountDetailsDto7.e, chargersProgressDiscountDetailsDto7.d);
                                    FormattedText formattedText3 = chargersProgressDiscountDetailsDto7.f;
                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$0 = chargersProgressDiscountDetailsDto7;
                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$1 = ir9Var19;
                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$2 = null;
                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$3 = ir9Var18;
                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$4 = charSequence;
                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$5 = charSequence2;
                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$6 = tn9Var;
                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$7 = l;
                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$0 = i3;
                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.label = 4;
                                    e2 = c.e(this.c, formattedText3, null, false, chargersDiscountDetailsMapper$mapProgressDiscountDetails$16, 30);
                                    if (e2 != coroutineSingletons5) {
                                        chargersProgressDiscountDetailsDto3 = chargersProgressDiscountDetailsDto7;
                                        ir9Var5 = ir9Var18;
                                        obj5 = e2;
                                        ir9Var6 = ir9Var19;
                                        charSequence3 = charSequence;
                                        charSequence4 = charSequence2;
                                        lnaVar = l;
                                        CharSequence charSequence39 = (CharSequence) obj5;
                                        lna l2 = yfaVar.l(chargersProgressDiscountDetailsDto3.h, chargersProgressDiscountDetailsDto3.g);
                                        FormattedText formattedText4 = chargersProgressDiscountDetailsDto3.i;
                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$0 = chargersProgressDiscountDetailsDto3;
                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$1 = ir9Var6;
                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$2 = null;
                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$3 = ir9Var5;
                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$4 = charSequence3;
                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$5 = charSequence4;
                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$6 = tn9Var;
                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$7 = lnaVar;
                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$8 = charSequence39;
                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$9 = l2;
                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$0 = i3;
                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.label = 5;
                                        ir9 ir9Var20 = ir9Var6;
                                        ChargersProgressDiscountDetailsDto chargersProgressDiscountDetailsDto8 = chargersProgressDiscountDetailsDto3;
                                        e3 = c.e(this.c, formattedText4, null, false, chargersDiscountDetailsMapper$mapProgressDiscountDetails$16, 30);
                                        if (e3 != coroutineSingletons5) {
                                            charSequence5 = charSequence4;
                                            charSequence6 = charSequence39;
                                            obj5 = e3;
                                            charSequence7 = charSequence3;
                                            ir9Var7 = ir9Var5;
                                            tn9Var2 = tn9Var;
                                            ir9Var8 = ir9Var20;
                                            lnaVar2 = lnaVar;
                                            lnaVar3 = l2;
                                            chargersProgressDiscountDetailsDto4 = chargersProgressDiscountDetailsDto8;
                                            CharSequence charSequence40 = (CharSequence) obj5;
                                            String str12 = chargersProgressDiscountDetailsDto4.l;
                                            int i22 = chargersProgressDiscountDetailsDto4.j;
                                            int i23 = i3;
                                            i4 = chargersProgressDiscountDetailsDto4.k;
                                            List list = chargersProgressDiscountDetailsDto4.m;
                                            lna lnaVar15 = lnaVar3;
                                            CharSequence charSequence41 = charSequence6;
                                            ArrayList arrayList8 = new ArrayList(tcc.n(list, 10));
                                            it = list.iterator();
                                            i5 = i23;
                                            arrayList = arrayList8;
                                            coroutineSingletons = coroutineSingletons5;
                                            ir9Var9 = ir9Var8;
                                            str = str12;
                                            i6 = i22;
                                            charSequence8 = charSequence7;
                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$12 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16;
                                            ir9Var10 = ir9Var7;
                                            lnaVar4 = lnaVar2;
                                            tn9Var3 = tn9Var2;
                                            charSequence9 = charSequence5;
                                            charSequence10 = charSequence40;
                                            lnaVar5 = lnaVar15;
                                            charSequence11 = charSequence41;
                                            int i24 = i4;
                                            if (!it.hasNext()) {
                                                int i25 = i6;
                                                ChargersProgressDiscountDetailsDto.ProgressDiscountPerkDto progressDiscountPerkDto2 = (ChargersProgressDiscountDetailsDto.ProgressDiscountPerkDto) it.next();
                                                int i26 = i5;
                                                String str13 = progressDiscountPerkDto2.a;
                                                String str14 = str;
                                                FormattedText formattedText5 = progressDiscountPerkDto2.b;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.L$0 = chargersProgressDiscountDetailsDto4;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.L$1 = ir9Var9;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.L$2 = null;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.L$3 = null;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.L$4 = null;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.L$5 = arrayList;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.L$6 = it;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.L$7 = null;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.L$8 = progressDiscountPerkDto2;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.L$9 = str13;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.L$10 = ir9Var10;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.L$11 = charSequence8;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.L$12 = charSequence9;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.L$13 = tn9Var3;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.L$14 = lnaVar4;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.L$15 = charSequence11;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.L$16 = lnaVar5;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.L$17 = charSequence10;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.L$18 = str14;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.L$19 = arrayList;
                                                Iterator it4 = it;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.L$20 = null;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.I$0 = i26;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.I$1 = i25;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.I$2 = i24;
                                                ArrayList arrayList9 = arrayList;
                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$12.label = 6;
                                                ChargersDiscountDetailsMapper$mapProgressDiscountDetails$1 chargersDiscountDetailsMapper$mapProgressDiscountDetails$17 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$12;
                                                Object e6 = c.e(this.c, formattedText5, null, false, chargersDiscountDetailsMapper$mapProgressDiscountDetails$17, 30);
                                                coroutineSingletons3 = coroutineSingletons;
                                                if (e6 != coroutineSingletons3) {
                                                    str3 = str13;
                                                    i9 = i26;
                                                    CharSequence charSequence42 = charSequence8;
                                                    charSequence14 = charSequence10;
                                                    tn9Var4 = tn9Var3;
                                                    charSequence13 = charSequence42;
                                                    i7 = i25;
                                                    i8 = i24;
                                                    str2 = str14;
                                                    charSequence15 = charSequence11;
                                                    lnaVar7 = lnaVar4;
                                                    charSequence12 = charSequence9;
                                                    progressDiscountPerkDto = progressDiscountPerkDto2;
                                                    arrayList2 = arrayList9;
                                                    obj2 = e6;
                                                    lnaVar6 = lnaVar5;
                                                    it2 = it4;
                                                    coroutineSingletons2 = coroutineSingletons3;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$17;
                                                    arrayList3 = arrayList2;
                                                    charSequence16 = (CharSequence) obj2;
                                                    FormattedText formattedText6 = progressDiscountPerkDto.c;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$0 = chargersProgressDiscountDetailsDto4;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$1 = ir9Var9;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$2 = null;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$3 = null;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$4 = null;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$5 = arrayList3;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$6 = it2;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$7 = null;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$8 = null;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$9 = str3;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$10 = charSequence16;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$11 = ir9Var10;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$12 = charSequence13;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$13 = charSequence12;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$14 = tn9Var4;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$15 = lnaVar7;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$16 = charSequence15;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$17 = lnaVar6;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$18 = charSequence14;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$19 = str2;
                                                    ArrayList arrayList10 = arrayList2;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$20 = arrayList10;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.I$0 = i9;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.I$1 = i7;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.I$2 = i8;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.label = 7;
                                                    str4 = str3;
                                                    chargersDiscountDetailsMapper$mapProgressDiscountDetails$14 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$13;
                                                    e4 = c.e(this.c, formattedText6, null, false, chargersDiscountDetailsMapper$mapProgressDiscountDetails$14, 30);
                                                    coroutineSingletons3 = coroutineSingletons2;
                                                    if (e4 != coroutineSingletons3) {
                                                        arrayList4 = arrayList3;
                                                        it3 = it2;
                                                        chargersProgressDiscountDetailsDto5 = chargersProgressDiscountDetailsDto4;
                                                        ir9Var11 = ir9Var10;
                                                        i4 = i8;
                                                        collection = arrayList10;
                                                        i5 = i9;
                                                        charSequence17 = charSequence12;
                                                        charSequence18 = charSequence13;
                                                        lnaVar4 = lnaVar7;
                                                        tn9Var3 = tn9Var4;
                                                        str5 = str2;
                                                        charSequence19 = charSequence15;
                                                        obj5 = e4;
                                                        collection.add(new jna(charSequence16, (CharSequence) obj5, str4));
                                                        coroutineSingletons = coroutineSingletons3;
                                                        str = str5;
                                                        charSequence11 = charSequence19;
                                                        charSequence10 = charSequence14;
                                                        charSequence9 = charSequence17;
                                                        lnaVar5 = lnaVar6;
                                                        charSequence8 = charSequence18;
                                                        it = it3;
                                                        arrayList = arrayList4;
                                                        chargersProgressDiscountDetailsDto4 = chargersProgressDiscountDetailsDto5;
                                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$12 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$14;
                                                        ir9Var10 = ir9Var11;
                                                        i6 = i7;
                                                        int i242 = i4;
                                                        if (!it.hasNext()) {
                                                            CoroutineSingletons coroutineSingletons6 = coroutineSingletons;
                                                            int i27 = i6;
                                                            int i28 = i5;
                                                            ArrayList arrayList11 = arrayList;
                                                            ChargersDiscountDetailsMapper$mapProgressDiscountDetails$1 chargersDiscountDetailsMapper$mapProgressDiscountDetails$18 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$12;
                                                            aVar = this;
                                                            arrayList5 = arrayList11;
                                                            FormattedText formattedText7 = chargersProgressDiscountDetailsDto4.n;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.L$0 = chargersProgressDiscountDetailsDto4;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.L$1 = ir9Var9;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.L$2 = null;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.L$3 = ir9Var10;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.L$4 = charSequence8;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.L$5 = charSequence9;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.L$6 = tn9Var3;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.L$7 = lnaVar4;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.L$8 = charSequence11;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.L$9 = lnaVar5;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.L$10 = charSequence10;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.L$11 = str;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.L$12 = arrayList5;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.L$13 = null;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.L$14 = null;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.L$15 = null;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.L$16 = null;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.L$17 = null;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.L$18 = null;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.L$19 = null;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.L$20 = null;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.I$0 = i28;
                                                            i10 = i27;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.I$1 = i10;
                                                            String str15 = str;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.I$2 = i242;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$18.label = 8;
                                                            Object e7 = c.e(aVar.c, formattedText7, null, false, chargersDiscountDetailsMapper$mapProgressDiscountDetails$18, 30);
                                                            if (e7 == coroutineSingletons6) {
                                                                return coroutineSingletons6;
                                                            }
                                                            obj3 = e7;
                                                            lnaVar8 = lnaVar4;
                                                            i11 = i242;
                                                            charSequence20 = charSequence10;
                                                            str6 = str15;
                                                            coroutineSingletons4 = coroutineSingletons6;
                                                            charSequence21 = charSequence9;
                                                            lnaVar9 = lnaVar5;
                                                            i12 = i28;
                                                            ir9Var12 = ir9Var10;
                                                            tn9Var5 = tn9Var3;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$18;
                                                            i13 = i10;
                                                            CharSequence charSequence43 = (CharSequence) obj3;
                                                            chargersDiscountDetailsButtonDto = chargersProgressDiscountDetailsDto4.o;
                                                            if (chargersDiscountDetailsButtonDto != null) {
                                                                charSequence22 = charSequence43;
                                                                charSequence23 = charSequence11;
                                                                str7 = str6;
                                                                charSequence24 = charSequence20;
                                                                tn9Var6 = tn9Var5;
                                                                uo9Var = null;
                                                                i14 = i13;
                                                                lnaVar10 = lnaVar8;
                                                                return new kna(charSequence8, charSequence21, tn9Var6, lnaVar10, charSequence23, lnaVar9, charSequence24, str7, i14, i11, arrayList5, charSequence22, uo9Var);
                                                            }
                                                            if (i12 != 0) {
                                                                int i29 = i12;
                                                                h = ((avj0) aVar.a).h(kyh0.common_got_it);
                                                                charSequence28 = charSequence21;
                                                                tn9Var7 = tn9Var5;
                                                                lnaVar12 = lnaVar8;
                                                                ir9Var15 = ir9Var12;
                                                                charSequence29 = charSequence8;
                                                                chargersDiscountDetailsButtonDto3 = chargersDiscountDetailsButtonDto;
                                                                charSequence26 = charSequence11;
                                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$15 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16;
                                                                i16 = i29;
                                                                charSequence30 = charSequence20;
                                                                str8 = str6;
                                                                charSequence31 = charSequence43;
                                                                if (i16 != 0) {
                                                                    charSequence8 = charSequence29;
                                                                    tn9Var8 = tn9Var7;
                                                                    charSequence21 = charSequence28;
                                                                    str9 = h;
                                                                    i17 = i13;
                                                                    charSequence32 = null;
                                                                } else {
                                                                    int i30 = i16;
                                                                    FormattedText formattedText8 = chargersDiscountDetailsButtonDto3.b;
                                                                    FormattedText formattedText9 = formattedText8.d() ? formattedText8 : null;
                                                                    if (formattedText9 != null) {
                                                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$15.L$0 = null;
                                                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$15.L$1 = ir9Var9;
                                                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$15.L$2 = null;
                                                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$15.L$3 = chargersDiscountDetailsButtonDto3;
                                                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$15.L$4 = h;
                                                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$15.L$5 = null;
                                                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$15.L$6 = ir9Var15;
                                                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$15.L$7 = charSequence29;
                                                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$15.L$8 = charSequence28;
                                                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$15.L$9 = tn9Var7;
                                                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$15.L$10 = lnaVar12;
                                                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$15.L$11 = charSequence26;
                                                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$15.L$12 = lnaVar9;
                                                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$15.L$13 = charSequence30;
                                                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$15.L$14 = str8;
                                                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$15.L$15 = arrayList5;
                                                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$15.L$16 = charSequence31;
                                                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$15.I$0 = i30;
                                                                        int i31 = i13;
                                                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$15.I$1 = i31;
                                                                        chargersDiscountDetailsButtonDto4 = chargersDiscountDetailsButtonDto3;
                                                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$15.I$2 = i11;
                                                                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$15.label = 10;
                                                                        Object e8 = c.e(this.c, formattedText9, null, false, chargersDiscountDetailsMapper$mapProgressDiscountDetails$15, 30);
                                                                        CoroutineSingletons coroutineSingletons7 = coroutineSingletons4;
                                                                        if (e8 == coroutineSingletons7) {
                                                                            return coroutineSingletons7;
                                                                        }
                                                                        tn9Var9 = tn9Var7;
                                                                        i18 = i30;
                                                                        charSequence33 = charSequence31;
                                                                        lnaVar13 = lnaVar9;
                                                                        lnaVar14 = lnaVar12;
                                                                        str10 = h;
                                                                        str11 = str8;
                                                                        charSequence34 = charSequence26;
                                                                        charSequence35 = charSequence28;
                                                                        obj5 = e8;
                                                                        ir9Var16 = ir9Var9;
                                                                        arrayList7 = arrayList5;
                                                                        charSequence36 = charSequence29;
                                                                        i19 = i31;
                                                                        charSequence37 = charSequence30;
                                                                        charSequence32 = (CharSequence) obj5;
                                                                        charSequence30 = charSequence37;
                                                                        str9 = str10;
                                                                        i16 = i18;
                                                                        lnaVar12 = lnaVar14;
                                                                        i17 = i19;
                                                                        lnaVar9 = lnaVar13;
                                                                        tn9Var8 = tn9Var9;
                                                                        charSequence8 = charSequence36;
                                                                        charSequence31 = charSequence33;
                                                                        arrayList5 = arrayList7;
                                                                        charSequence21 = charSequence35;
                                                                        ir9Var9 = ir9Var16;
                                                                        charSequence26 = charSequence34;
                                                                        chargersDiscountDetailsButtonDto3 = chargersDiscountDetailsButtonDto4;
                                                                        str8 = str11;
                                                                    } else {
                                                                        charSequence8 = charSequence29;
                                                                        tn9Var8 = tn9Var7;
                                                                        str9 = h;
                                                                        charSequence32 = null;
                                                                        i17 = i13;
                                                                        i16 = i30;
                                                                        charSequence21 = charSequence28;
                                                                    }
                                                                }
                                                                boolean z = chargersDiscountDetailsButtonDto3.c;
                                                                uj9 uj9Var = jr9.a;
                                                                if (i16 == 0) {
                                                                    yr9 yr9Var = chargersDiscountDetailsButtonDto3.d;
                                                                    if (yr9Var instanceof vr9) {
                                                                        uj9Var = new mr9(ir9Var9);
                                                                    } else if (!(yr9Var instanceof tr9)) {
                                                                        uj9Var = tj9.a;
                                                                    }
                                                                }
                                                                tn9Var6 = tn9Var8;
                                                                i14 = i17;
                                                                charSequence22 = charSequence31;
                                                                str7 = str8;
                                                                charSequence24 = charSequence30;
                                                                charSequence23 = charSequence26;
                                                                lnaVar10 = lnaVar12;
                                                                uo9Var = new uo9(str9, charSequence32, z, uj9Var, true, null, false, false, 224);
                                                                return new kna(charSequence8, charSequence21, tn9Var6, lnaVar10, charSequence23, lnaVar9, charSequence24, str7, i14, i11, arrayList5, charSequence22, uo9Var);
                                                            }
                                                            int i32 = i12;
                                                            FormattedText formattedText10 = chargersDiscountDetailsButtonDto.a;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$0 = null;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$1 = ir9Var9;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$2 = null;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$3 = chargersDiscountDetailsButtonDto;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$4 = ir9Var12;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$5 = charSequence8;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$6 = charSequence21;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$7 = tn9Var5;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$8 = lnaVar8;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$9 = charSequence11;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$10 = lnaVar9;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$11 = charSequence20;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$12 = str6;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$13 = arrayList5;
                                                            charSequence25 = charSequence43;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$14 = charSequence25;
                                                            lnaVar11 = lnaVar8;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$0 = i32;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$1 = i13;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$2 = i11;
                                                            chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.label = 9;
                                                            ChargersDiscountDetailsMapper$mapProgressDiscountDetails$1 chargersDiscountDetailsMapper$mapProgressDiscountDetails$19 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16;
                                                            Object e9 = c.e(aVar.c, formattedText10, null, false, chargersDiscountDetailsMapper$mapProgressDiscountDetails$19, 30);
                                                            coroutineSingletons3 = coroutineSingletons4;
                                                            if (e9 != coroutineSingletons3) {
                                                                ir9Var13 = ir9Var9;
                                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$16 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$19;
                                                                obj4 = e9;
                                                                ir9Var14 = ir9Var12;
                                                                chargersDiscountDetailsButtonDto2 = chargersDiscountDetailsButtonDto;
                                                                charSequence26 = charSequence11;
                                                                arrayList6 = arrayList5;
                                                                charSequence27 = charSequence21;
                                                                i15 = i32;
                                                                coroutineSingletons4 = coroutineSingletons3;
                                                                charSequence28 = charSequence27;
                                                                tn9Var7 = tn9Var5;
                                                                lnaVar12 = lnaVar11;
                                                                arrayList5 = arrayList6;
                                                                i16 = i15;
                                                                ir9Var15 = ir9Var14;
                                                                chargersDiscountDetailsButtonDto3 = chargersDiscountDetailsButtonDto2;
                                                                charSequence29 = charSequence8;
                                                                chargersDiscountDetailsMapper$mapProgressDiscountDetails$15 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16;
                                                                charSequence30 = charSequence20;
                                                                str8 = str6;
                                                                charSequence31 = charSequence25;
                                                                h = (CharSequence) obj4;
                                                                ir9Var9 = ir9Var13;
                                                                if (i16 != 0) {
                                                                }
                                                                boolean z2 = chargersDiscountDetailsButtonDto3.c;
                                                                uj9 uj9Var2 = jr9.a;
                                                                if (i16 == 0) {
                                                                }
                                                                tn9Var6 = tn9Var8;
                                                                i14 = i17;
                                                                charSequence22 = charSequence31;
                                                                str7 = str8;
                                                                charSequence24 = charSequence30;
                                                                charSequence23 = charSequence26;
                                                                lnaVar10 = lnaVar12;
                                                                uo9Var = new uo9(str9, charSequence32, z2, uj9Var2, true, null, false, false, 224);
                                                                return new kna(charSequence8, charSequence21, tn9Var6, lnaVar10, charSequence23, lnaVar9, charSequence24, str7, i14, i11, arrayList5, charSequence22, uo9Var);
                                                            }
                                                        }
                                                    }
                                                }
                                                return coroutineSingletons3;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return coroutineSingletons5;
                    case 1:
                        int i33 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$0;
                        ir9Var17 = (ir9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$3;
                        ir9Var2 = (ir9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$1;
                        ChargersProgressDiscountDetailsDto chargersProgressDiscountDetailsDto9 = (ChargersProgressDiscountDetailsDto) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$0;
                        kotlin.b.b(obj5);
                        i2 = i33;
                        chargersProgressDiscountDetailsDto6 = chargersProgressDiscountDetailsDto9;
                        obj = obj5;
                        CharSequence charSequence382 = (CharSequence) obj;
                        FormattedText formattedText22 = chargersProgressDiscountDetailsDto6.b;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$0 = chargersProgressDiscountDetailsDto6;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$1 = ir9Var2;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$2 = null;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$3 = ir9Var17;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$4 = charSequence382;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$0 = i2;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.label = 2;
                        e = c.e(this.c, formattedText22, null, false, chargersDiscountDetailsMapper$mapProgressDiscountDetails$16, 30);
                        if (e != coroutineSingletons5) {
                        }
                        return coroutineSingletons5;
                    case 2:
                        i3 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$0;
                        CharSequence charSequence44 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$4;
                        ir9 ir9Var21 = (ir9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$3;
                        ir9 ir9Var22 = (ir9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$1;
                        ChargersProgressDiscountDetailsDto chargersProgressDiscountDetailsDto10 = (ChargersProgressDiscountDetailsDto) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$0;
                        kotlin.b.b(obj5);
                        chargersProgressDiscountDetailsDto2 = chargersProgressDiscountDetailsDto10;
                        ir9Var3 = ir9Var22;
                        ir9Var4 = ir9Var21;
                        charSequence = charSequence44;
                        charSequence2 = (CharSequence) obj5;
                        chargersAttributeDto = chargersProgressDiscountDetailsDto2.c;
                        if (chargersAttributeDto == null) {
                        }
                        break;
                    case 3:
                        i3 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$0;
                        charSequence2 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$6;
                        charSequence = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$5;
                        ir9Var4 = (ir9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$4;
                        ir9Var3 = (ir9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$1;
                        chargersProgressDiscountDetailsDto2 = (ChargersProgressDiscountDetailsDto) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$0;
                        kotlin.b.b(obj5);
                        tn9Var = (tn9) obj5;
                        ir9 ir9Var182 = ir9Var4;
                        ir9 ir9Var192 = ir9Var3;
                        ChargersProgressDiscountDetailsDto chargersProgressDiscountDetailsDto72 = chargersProgressDiscountDetailsDto2;
                        lna l3 = yfaVar.l(chargersProgressDiscountDetailsDto72.e, chargersProgressDiscountDetailsDto72.d);
                        FormattedText formattedText32 = chargersProgressDiscountDetailsDto72.f;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$0 = chargersProgressDiscountDetailsDto72;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$1 = ir9Var192;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$2 = null;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$3 = ir9Var182;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$4 = charSequence;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$5 = charSequence2;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$6 = tn9Var;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$7 = l3;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$0 = i3;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.label = 4;
                        e2 = c.e(this.c, formattedText32, null, false, chargersDiscountDetailsMapper$mapProgressDiscountDetails$16, 30);
                        if (e2 != coroutineSingletons5) {
                        }
                        return coroutineSingletons5;
                    case 4:
                        i3 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$0;
                        lnaVar = (lna) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$7;
                        tn9 tn9Var10 = (tn9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$6;
                        CharSequence charSequence45 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$5;
                        CharSequence charSequence46 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$4;
                        ir9 ir9Var23 = (ir9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$3;
                        ir9 ir9Var24 = (ir9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$1;
                        ChargersProgressDiscountDetailsDto chargersProgressDiscountDetailsDto11 = (ChargersProgressDiscountDetailsDto) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$0;
                        kotlin.b.b(obj5);
                        tn9Var = tn9Var10;
                        charSequence4 = charSequence45;
                        charSequence3 = charSequence46;
                        ir9Var5 = ir9Var23;
                        ir9Var6 = ir9Var24;
                        chargersProgressDiscountDetailsDto3 = chargersProgressDiscountDetailsDto11;
                        CharSequence charSequence392 = (CharSequence) obj5;
                        lna l22 = yfaVar.l(chargersProgressDiscountDetailsDto3.h, chargersProgressDiscountDetailsDto3.g);
                        FormattedText formattedText42 = chargersProgressDiscountDetailsDto3.i;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$0 = chargersProgressDiscountDetailsDto3;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$1 = ir9Var6;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$2 = null;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$3 = ir9Var5;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$4 = charSequence3;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$5 = charSequence4;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$6 = tn9Var;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$7 = lnaVar;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$8 = charSequence392;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$9 = l22;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$0 = i3;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.label = 5;
                        ir9 ir9Var202 = ir9Var6;
                        ChargersProgressDiscountDetailsDto chargersProgressDiscountDetailsDto82 = chargersProgressDiscountDetailsDto3;
                        e3 = c.e(this.c, formattedText42, null, false, chargersDiscountDetailsMapper$mapProgressDiscountDetails$16, 30);
                        if (e3 != coroutineSingletons5) {
                        }
                        return coroutineSingletons5;
                    case 5:
                        i3 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$0;
                        lnaVar3 = (lna) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$9;
                        charSequence6 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$8;
                        lnaVar2 = (lna) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$7;
                        tn9Var2 = (tn9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$6;
                        charSequence5 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$5;
                        charSequence7 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$4;
                        ir9Var7 = (ir9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$3;
                        ir9Var8 = (ir9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$1;
                        chargersProgressDiscountDetailsDto4 = (ChargersProgressDiscountDetailsDto) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$0;
                        kotlin.b.b(obj5);
                        CharSequence charSequence402 = (CharSequence) obj5;
                        String str122 = chargersProgressDiscountDetailsDto4.l;
                        int i222 = chargersProgressDiscountDetailsDto4.j;
                        int i232 = i3;
                        i4 = chargersProgressDiscountDetailsDto4.k;
                        List list2 = chargersProgressDiscountDetailsDto4.m;
                        lna lnaVar152 = lnaVar3;
                        CharSequence charSequence412 = charSequence6;
                        ArrayList arrayList82 = new ArrayList(tcc.n(list2, 10));
                        it = list2.iterator();
                        i5 = i232;
                        arrayList = arrayList82;
                        coroutineSingletons = coroutineSingletons5;
                        ir9Var9 = ir9Var8;
                        str = str122;
                        i6 = i222;
                        charSequence8 = charSequence7;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$12 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16;
                        ir9Var10 = ir9Var7;
                        lnaVar4 = lnaVar2;
                        tn9Var3 = tn9Var2;
                        charSequence9 = charSequence5;
                        charSequence10 = charSequence402;
                        lnaVar5 = lnaVar152;
                        charSequence11 = charSequence412;
                        int i2422 = i4;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 6:
                        int i34 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$2;
                        int i35 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$1;
                        int i36 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$0;
                        ?? r6 = (Collection) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$19;
                        String str16 = (String) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$18;
                        CharSequence charSequence47 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$17;
                        lna lnaVar16 = (lna) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$16;
                        CharSequence charSequence48 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$15;
                        lna lnaVar17 = (lna) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$14;
                        tn9 tn9Var11 = (tn9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$13;
                        CharSequence charSequence49 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$12;
                        CharSequence charSequence50 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$11;
                        ir9 ir9Var25 = (ir9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$10;
                        String str17 = (String) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$9;
                        ChargersProgressDiscountDetailsDto.ProgressDiscountPerkDto progressDiscountPerkDto3 = (ChargersProgressDiscountDetailsDto.ProgressDiscountPerkDto) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$8;
                        Iterator it5 = (Iterator) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$6;
                        ?? r1 = (Collection) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$5;
                        ir9 ir9Var26 = (ir9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$1;
                        ChargersProgressDiscountDetailsDto chargersProgressDiscountDetailsDto12 = (ChargersProgressDiscountDetailsDto) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$0;
                        kotlin.b.b(obj5);
                        lnaVar6 = lnaVar16;
                        charSequence12 = charSequence49;
                        progressDiscountPerkDto = progressDiscountPerkDto3;
                        i7 = i35;
                        coroutineSingletons2 = coroutineSingletons5;
                        arrayList2 = r6;
                        str2 = str16;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16;
                        lnaVar7 = lnaVar17;
                        charSequence13 = charSequence50;
                        i8 = i34;
                        it2 = it5;
                        ir9Var9 = ir9Var26;
                        ir9Var10 = ir9Var25;
                        obj2 = obj5;
                        charSequence14 = charSequence47;
                        charSequence15 = charSequence48;
                        tn9Var4 = tn9Var11;
                        chargersProgressDiscountDetailsDto4 = chargersProgressDiscountDetailsDto12;
                        str3 = str17;
                        i9 = i36;
                        arrayList3 = r1;
                        charSequence16 = (CharSequence) obj2;
                        FormattedText formattedText62 = progressDiscountPerkDto.c;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$0 = chargersProgressDiscountDetailsDto4;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$1 = ir9Var9;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$2 = null;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$3 = null;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$4 = null;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$5 = arrayList3;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$6 = it2;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$7 = null;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$8 = null;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$9 = str3;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$10 = charSequence16;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$11 = ir9Var10;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$12 = charSequence13;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$13 = charSequence12;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$14 = tn9Var4;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$15 = lnaVar7;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$16 = charSequence15;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$17 = lnaVar6;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$18 = charSequence14;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$19 = str2;
                        ArrayList arrayList102 = arrayList2;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.L$20 = arrayList102;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.I$0 = i9;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.I$1 = i7;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.I$2 = i8;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$13.label = 7;
                        str4 = str3;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$14 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$13;
                        e4 = c.e(this.c, formattedText62, null, false, chargersDiscountDetailsMapper$mapProgressDiscountDetails$14, 30);
                        coroutineSingletons3 = coroutineSingletons2;
                        if (e4 != coroutineSingletons3) {
                        }
                        return coroutineSingletons3;
                    case 7:
                        int i37 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$2;
                        int i38 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$1;
                        i5 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$0;
                        collection = (Collection) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$20;
                        str5 = (String) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$19;
                        CharSequence charSequence51 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$18;
                        lna lnaVar18 = (lna) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$17;
                        CharSequence charSequence52 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$16;
                        lna lnaVar19 = (lna) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$15;
                        tn9 tn9Var12 = (tn9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$14;
                        CharSequence charSequence53 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$13;
                        charSequence18 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$12;
                        i4 = i37;
                        ir9 ir9Var27 = (ir9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$11;
                        CharSequence charSequence54 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$10;
                        str4 = (String) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$9;
                        it3 = (Iterator) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$6;
                        arrayList4 = (Collection) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$5;
                        ir9 ir9Var28 = (ir9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$1;
                        ChargersProgressDiscountDetailsDto chargersProgressDiscountDetailsDto13 = (ChargersProgressDiscountDetailsDto) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$0;
                        kotlin.b.b(obj5);
                        ir9Var11 = ir9Var27;
                        i7 = i38;
                        coroutineSingletons3 = coroutineSingletons5;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$14 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16;
                        tn9Var3 = tn9Var12;
                        charSequence17 = charSequence53;
                        ir9Var9 = ir9Var28;
                        chargersProgressDiscountDetailsDto5 = chargersProgressDiscountDetailsDto13;
                        lnaVar6 = lnaVar18;
                        lnaVar4 = lnaVar19;
                        charSequence14 = charSequence51;
                        charSequence19 = charSequence52;
                        charSequence16 = charSequence54;
                        collection.add(new jna(charSequence16, (CharSequence) obj5, str4));
                        coroutineSingletons = coroutineSingletons3;
                        str = str5;
                        charSequence11 = charSequence19;
                        charSequence10 = charSequence14;
                        charSequence9 = charSequence17;
                        lnaVar5 = lnaVar6;
                        charSequence8 = charSequence18;
                        it = it3;
                        arrayList = arrayList4;
                        chargersProgressDiscountDetailsDto4 = chargersProgressDiscountDetailsDto5;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$12 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$14;
                        ir9Var10 = ir9Var11;
                        i6 = i7;
                        int i24222 = i4;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 8:
                        int i39 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$2;
                        i10 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$1;
                        int i40 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$0;
                        ?? r62 = (List) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$12;
                        String str18 = (String) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$11;
                        CharSequence charSequence55 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$10;
                        lna lnaVar20 = (lna) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$9;
                        CharSequence charSequence56 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$8;
                        lna lnaVar21 = (lna) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$7;
                        tn9 tn9Var13 = (tn9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$6;
                        CharSequence charSequence57 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$5;
                        CharSequence charSequence58 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$4;
                        ir9 ir9Var29 = (ir9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$3;
                        ir9 ir9Var30 = (ir9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$1;
                        ChargersProgressDiscountDetailsDto chargersProgressDiscountDetailsDto14 = (ChargersProgressDiscountDetailsDto) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$0;
                        kotlin.b.b(obj5);
                        ir9Var12 = ir9Var29;
                        obj3 = obj5;
                        aVar = this;
                        lnaVar8 = lnaVar21;
                        charSequence8 = charSequence58;
                        tn9Var5 = tn9Var13;
                        chargersProgressDiscountDetailsDto4 = chargersProgressDiscountDetailsDto14;
                        i12 = i40;
                        charSequence21 = charSequence57;
                        arrayList5 = r62;
                        str6 = str18;
                        charSequence11 = charSequence56;
                        lnaVar9 = lnaVar20;
                        charSequence20 = charSequence55;
                        coroutineSingletons4 = coroutineSingletons5;
                        i11 = i39;
                        ir9Var9 = ir9Var30;
                        i13 = i10;
                        CharSequence charSequence432 = (CharSequence) obj3;
                        chargersDiscountDetailsButtonDto = chargersProgressDiscountDetailsDto4.o;
                        if (chargersDiscountDetailsButtonDto != null) {
                        }
                        break;
                    case 9:
                        int i41 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$2;
                        int i42 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$1;
                        i15 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$0;
                        charSequence25 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$14;
                        ?? r7 = (List) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$13;
                        str6 = (String) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$12;
                        charSequence20 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$11;
                        lnaVar9 = (lna) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$10;
                        charSequence26 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$9;
                        lna lnaVar22 = (lna) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$8;
                        tn9 tn9Var14 = (tn9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$7;
                        charSequence27 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$6;
                        CharSequence charSequence59 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$5;
                        ir9 ir9Var31 = (ir9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$4;
                        ChargersDiscountDetailsButtonDto chargersDiscountDetailsButtonDto5 = (ChargersDiscountDetailsButtonDto) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$3;
                        ir9Var13 = (ir9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$1;
                        kotlin.b.b(obj5);
                        i11 = i41;
                        i13 = i42;
                        coroutineSingletons3 = coroutineSingletons5;
                        lnaVar11 = lnaVar22;
                        chargersDiscountDetailsButtonDto2 = chargersDiscountDetailsButtonDto5;
                        obj4 = obj5;
                        tn9Var5 = tn9Var14;
                        charSequence8 = charSequence59;
                        ir9Var14 = ir9Var31;
                        arrayList6 = r7;
                        coroutineSingletons4 = coroutineSingletons3;
                        charSequence28 = charSequence27;
                        tn9Var7 = tn9Var5;
                        lnaVar12 = lnaVar11;
                        arrayList5 = arrayList6;
                        i16 = i15;
                        ir9Var15 = ir9Var14;
                        chargersDiscountDetailsButtonDto3 = chargersDiscountDetailsButtonDto2;
                        charSequence29 = charSequence8;
                        chargersDiscountDetailsMapper$mapProgressDiscountDetails$15 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16;
                        charSequence30 = charSequence20;
                        str8 = str6;
                        charSequence31 = charSequence25;
                        h = (CharSequence) obj4;
                        ir9Var9 = ir9Var13;
                        if (i16 != 0) {
                        }
                        boolean z22 = chargersDiscountDetailsButtonDto3.c;
                        uj9 uj9Var22 = jr9.a;
                        if (i16 == 0) {
                        }
                        tn9Var6 = tn9Var8;
                        i14 = i17;
                        charSequence22 = charSequence31;
                        str7 = str8;
                        charSequence24 = charSequence30;
                        charSequence23 = charSequence26;
                        lnaVar10 = lnaVar12;
                        uo9Var = new uo9(str9, charSequence32, z22, uj9Var22, true, null, false, false, 224);
                        return new kna(charSequence8, charSequence21, tn9Var6, lnaVar10, charSequence23, lnaVar9, charSequence24, str7, i14, i11, arrayList5, charSequence22, uo9Var);
                    case 10:
                        int i43 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$2;
                        i19 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$1;
                        i18 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.I$0;
                        charSequence33 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$16;
                        ?? r5 = (List) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$15;
                        str11 = (String) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$14;
                        charSequence37 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$13;
                        lnaVar13 = (lna) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$12;
                        charSequence34 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$11;
                        lnaVar14 = (lna) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$10;
                        tn9Var9 = (tn9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$9;
                        charSequence35 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$8;
                        charSequence36 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$7;
                        ?? r15 = (CharSequence) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$4;
                        ChargersDiscountDetailsButtonDto chargersDiscountDetailsButtonDto6 = (ChargersDiscountDetailsButtonDto) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$3;
                        ir9Var16 = (ir9) chargersDiscountDetailsMapper$mapProgressDiscountDetails$16.L$1;
                        kotlin.b.b(obj5);
                        i11 = i43;
                        chargersDiscountDetailsButtonDto4 = chargersDiscountDetailsButtonDto6;
                        arrayList7 = r5;
                        str10 = r15;
                        charSequence32 = (CharSequence) obj5;
                        charSequence30 = charSequence37;
                        str9 = str10;
                        i16 = i18;
                        lnaVar12 = lnaVar14;
                        i17 = i19;
                        lnaVar9 = lnaVar13;
                        tn9Var8 = tn9Var9;
                        charSequence8 = charSequence36;
                        charSequence31 = charSequence33;
                        arrayList5 = arrayList7;
                        charSequence21 = charSequence35;
                        ir9Var9 = ir9Var16;
                        charSequence26 = charSequence34;
                        chargersDiscountDetailsButtonDto3 = chargersDiscountDetailsButtonDto4;
                        str8 = str11;
                        boolean z222 = chargersDiscountDetailsButtonDto3.c;
                        uj9 uj9Var222 = jr9.a;
                        if (i16 == 0) {
                        }
                        tn9Var6 = tn9Var8;
                        i14 = i17;
                        charSequence22 = charSequence31;
                        str7 = str8;
                        charSequence24 = charSequence30;
                        charSequence23 = charSequence26;
                        lnaVar10 = lnaVar12;
                        uo9Var = new uo9(str9, charSequence32, z222, uj9Var222, true, null, false, false, 224);
                        return new kna(charSequence8, charSequence21, tn9Var6, lnaVar10, charSequence23, lnaVar9, charSequence24, str7, i14, i11, arrayList5, charSequence22, uo9Var);
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        chargersDiscountDetailsMapper$mapProgressDiscountDetails$1 = new ChargersDiscountDetailsMapper$mapProgressDiscountDetails$1(this, continuationImpl);
        ChargersDiscountDetailsMapper$mapProgressDiscountDetails$1 chargersDiscountDetailsMapper$mapProgressDiscountDetails$162 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$1;
        Object obj52 = chargersDiscountDetailsMapper$mapProgressDiscountDetails$162.result;
        CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDiscountDetailsMapper$mapProgressDiscountDetails$162.label;
        yfa yfaVar2 = this.e;
        switch (i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0193, code lost:
    
        if (r4 == r5) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0320 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ChargersPromoDetailsDto chargersPromoDetailsDto, ir9 ir9Var, ow9 ow9Var, ContinuationImpl continuationImpl) {
        ChargersDiscountDetailsMapper$mapPromoDetails$1 chargersDiscountDetailsMapper$mapPromoDetails$1;
        ChargersDiscountDetailsMapper$mapPromoDetails$1 chargersDiscountDetailsMapper$mapPromoDetails$12;
        int i;
        String str;
        ChargersPromoDetailsDto chargersPromoDetailsDto2;
        CharSequence charSequence;
        ChargersPromoDetailsDto.PromoUsage promoUsage;
        CharSequence charSequence2;
        int i2;
        CharSequence charSequence3;
        ir9 ir9Var2;
        ona onaVar;
        CharSequence charSequence4;
        CharSequence charSequence5;
        ir9 ir9Var3;
        String str2;
        ChargersPromoDetailsDto chargersPromoDetailsDto3;
        int i3;
        int i4;
        FormattedText formattedText;
        CharSequence charSequence6;
        CharSequence charSequence7;
        ir9 ir9Var4;
        String str3;
        ChargersPromoDetailsDto chargersPromoDetailsDto4;
        ona onaVar2;
        Object e;
        ChargersPromoDetailsDto chargersPromoDetailsDto5;
        CharSequence charSequence8;
        String str4;
        ir9 ir9Var5;
        CharSequence charSequence9;
        ChargersPromoDetailsDto.PromoDetailsButtonDto promoDetailsButtonDto;
        String str5;
        uo9 uo9Var;
        CharSequence charSequence10;
        ona onaVar3;
        CharSequence charSequence11;
        String code;
        List list;
        CharSequence charSequence12;
        CharSequence charSequence13;
        ona onaVar4;
        CharSequence charSequence14;
        List list2;
        ChargersPromoDetailsDto.PromoDetailsButtonDto promoDetailsButtonDto2;
        String str6;
        CharSequence charSequence15;
        String str7;
        String h;
        String str8;
        ChargersPromoDetailsDto.PromoDetailsButtonDto promoDetailsButtonDto3;
        CharSequence charSequence16;
        CharSequence charSequence17;
        CharSequence charSequence18;
        CharSequence charSequence19;
        ir9 ir9Var6;
        lea0 lea0Var;
        PaymentMethod$Type c;
        ona onaVar5;
        CharSequence charSequence20;
        CharSequence charSequence21;
        CharSequence charSequence22;
        CharSequence charSequence23;
        int i5;
        CharSequence charSequence24;
        CharSequence charSequence25;
        String str9;
        ona onaVar6;
        ir9 ir9Var7;
        ChargersPromoDetailsDto chargersPromoDetailsDto6 = chargersPromoDetailsDto;
        ir9 ir9Var8 = ir9Var;
        if (continuationImpl instanceof ChargersDiscountDetailsMapper$mapPromoDetails$1) {
            chargersDiscountDetailsMapper$mapPromoDetails$1 = (ChargersDiscountDetailsMapper$mapPromoDetails$1) continuationImpl;
            int i6 = chargersDiscountDetailsMapper$mapPromoDetails$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                chargersDiscountDetailsMapper$mapPromoDetails$1.label = i6 - Integer.MIN_VALUE;
                chargersDiscountDetailsMapper$mapPromoDetails$12 = chargersDiscountDetailsMapper$mapPromoDetails$1;
                Object obj = chargersDiscountDetailsMapper$mapPromoDetails$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (chargersDiscountDetailsMapper$mapPromoDetails$12.label) {
                    case 0:
                        kotlin.b.b(obj);
                        i = (jl40.l(ir9Var8.b, ow9Var != null ? ow9Var.b : null) && ir9Var8.a == ow9Var.a) ? 1 : 0;
                        FormattedText formattedText2 = chargersPromoDetailsDto6.b;
                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$0 = chargersPromoDetailsDto6;
                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$1 = ir9Var8;
                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$2 = null;
                        chargersDiscountDetailsMapper$mapPromoDetails$12.I$0 = i;
                        chargersDiscountDetailsMapper$mapPromoDetails$12.label = 1;
                        obj = c.e(this.c, formattedText2, null, false, chargersDiscountDetailsMapper$mapPromoDetails$12, 30);
                        break;
                    case 1:
                        int i7 = chargersDiscountDetailsMapper$mapPromoDetails$12.I$0;
                        ir9Var8 = (ir9) chargersDiscountDetailsMapper$mapPromoDetails$12.L$1;
                        ChargersPromoDetailsDto chargersPromoDetailsDto7 = (ChargersPromoDetailsDto) chargersDiscountDetailsMapper$mapPromoDetails$12.L$0;
                        kotlin.b.b(obj);
                        i = i7;
                        chargersPromoDetailsDto6 = chargersPromoDetailsDto7;
                        CharSequence charSequence26 = (CharSequence) obj;
                        str = chargersPromoDetailsDto6.a;
                        FormattedText formattedText3 = chargersPromoDetailsDto6.c;
                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$0 = chargersPromoDetailsDto6;
                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$1 = ir9Var8;
                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$2 = null;
                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$3 = charSequence26;
                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$4 = str;
                        chargersDiscountDetailsMapper$mapPromoDetails$12.I$0 = i;
                        chargersDiscountDetailsMapper$mapPromoDetails$12.label = 2;
                        Object e2 = c.e(this.c, formattedText3, null, false, chargersDiscountDetailsMapper$mapPromoDetails$12, 30);
                        if (e2 != coroutineSingletons) {
                            chargersPromoDetailsDto2 = chargersPromoDetailsDto6;
                            charSequence = charSequence26;
                            obj = e2;
                            CharSequence charSequence27 = (CharSequence) obj;
                            promoUsage = chargersPromoDetailsDto2.d;
                            if (promoUsage == null) {
                                int i8 = promoUsage.a;
                                int i9 = promoUsage.b;
                                FormattedText formattedText4 = promoUsage.c;
                                chargersDiscountDetailsMapper$mapPromoDetails$12.L$0 = chargersPromoDetailsDto2;
                                chargersDiscountDetailsMapper$mapPromoDetails$12.L$1 = ir9Var8;
                                chargersDiscountDetailsMapper$mapPromoDetails$12.L$2 = null;
                                chargersDiscountDetailsMapper$mapPromoDetails$12.L$3 = charSequence;
                                chargersDiscountDetailsMapper$mapPromoDetails$12.L$4 = str;
                                chargersDiscountDetailsMapper$mapPromoDetails$12.L$5 = charSequence27;
                                chargersDiscountDetailsMapper$mapPromoDetails$12.L$6 = null;
                                chargersDiscountDetailsMapper$mapPromoDetails$12.I$0 = i;
                                chargersDiscountDetailsMapper$mapPromoDetails$12.I$1 = i9;
                                chargersDiscountDetailsMapper$mapPromoDetails$12.I$2 = i8;
                                chargersDiscountDetailsMapper$mapPromoDetails$12.label = 3;
                                Object e3 = c.e(this.c, formattedText4, null, false, chargersDiscountDetailsMapper$mapPromoDetails$12, 30);
                                if (e3 != coroutineSingletons) {
                                    charSequence4 = charSequence27;
                                    obj = e3;
                                    charSequence5 = charSequence;
                                    ir9Var3 = ir9Var8;
                                    str2 = str;
                                    chargersPromoDetailsDto3 = chargersPromoDetailsDto2;
                                    i3 = i8;
                                    i4 = i9;
                                    ona onaVar7 = new ona(i3, i4, (CharSequence) obj);
                                    i2 = i;
                                    charSequence3 = charSequence4;
                                    charSequence2 = charSequence5;
                                    ir9Var2 = ir9Var3;
                                    chargersPromoDetailsDto2 = chargersPromoDetailsDto3;
                                    onaVar = onaVar7;
                                    str = str2;
                                    formattedText = chargersPromoDetailsDto2.e;
                                    if (formattedText != null) {
                                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$0 = chargersPromoDetailsDto2;
                                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$1 = ir9Var2;
                                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$2 = null;
                                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$3 = charSequence2;
                                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$4 = str;
                                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$5 = charSequence3;
                                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$6 = onaVar;
                                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$7 = null;
                                        chargersDiscountDetailsMapper$mapPromoDetails$12.I$0 = i2;
                                        chargersDiscountDetailsMapper$mapPromoDetails$12.label = 4;
                                        Object e4 = c.e(this.c, formattedText, null, false, chargersDiscountDetailsMapper$mapPromoDetails$12, 30);
                                        if (e4 != coroutineSingletons) {
                                            charSequence7 = charSequence2;
                                            ir9Var4 = ir9Var2;
                                            obj = e4;
                                            str3 = str;
                                            chargersPromoDetailsDto4 = chargersPromoDetailsDto2;
                                            onaVar2 = onaVar;
                                            onaVar = onaVar2;
                                            charSequence6 = (CharSequence) obj;
                                            str = str3;
                                            charSequence2 = charSequence7;
                                            ir9Var2 = ir9Var4;
                                            chargersPromoDetailsDto2 = chargersPromoDetailsDto4;
                                            FormattedText formattedText5 = chargersPromoDetailsDto2.f;
                                            chargersDiscountDetailsMapper$mapPromoDetails$12.L$0 = chargersPromoDetailsDto2;
                                            chargersDiscountDetailsMapper$mapPromoDetails$12.L$1 = ir9Var2;
                                            chargersDiscountDetailsMapper$mapPromoDetails$12.L$2 = null;
                                            chargersDiscountDetailsMapper$mapPromoDetails$12.L$3 = charSequence2;
                                            chargersDiscountDetailsMapper$mapPromoDetails$12.L$4 = str;
                                            chargersDiscountDetailsMapper$mapPromoDetails$12.L$5 = charSequence3;
                                            chargersDiscountDetailsMapper$mapPromoDetails$12.L$6 = onaVar;
                                            chargersDiscountDetailsMapper$mapPromoDetails$12.L$7 = charSequence6;
                                            chargersDiscountDetailsMapper$mapPromoDetails$12.I$0 = i2;
                                            chargersDiscountDetailsMapper$mapPromoDetails$12.label = 5;
                                            e = c.e(this.c, formattedText5, null, false, chargersDiscountDetailsMapper$mapPromoDetails$12, 30);
                                            if (e != coroutineSingletons) {
                                                chargersPromoDetailsDto5 = chargersPromoDetailsDto2;
                                                charSequence8 = charSequence2;
                                                str4 = str;
                                                ir9Var5 = ir9Var2;
                                                obj = e;
                                                charSequence9 = (CharSequence) obj;
                                                promoDetailsButtonDto = chargersPromoDetailsDto5.g;
                                                if (promoDetailsButtonDto != null) {
                                                    str5 = str4;
                                                    uo9Var = null;
                                                    charSequence10 = charSequence8;
                                                    onaVar3 = onaVar;
                                                    charSequence11 = charSequence6;
                                                    return new pna(ir9Var5, str5, charSequence10, charSequence3, onaVar3, charSequence11, charSequence9, uo9Var);
                                                }
                                                shq0 shq0Var = this.f.c().b;
                                                code = (shq0Var == null || (lea0Var = shq0Var.a) == null || (c = lea0Var.c()) == null) ? null : c.getCode();
                                                list = ir9Var5.c;
                                                zuj0 zuj0Var = this.a;
                                                if (i2 != 0) {
                                                    h = ((avj0) zuj0Var).h(kyh0.common_got_it);
                                                } else if (list == null || !kotlin.collections.a.G(list, code)) {
                                                    FormattedText formattedText6 = promoDetailsButtonDto.a;
                                                    chargersDiscountDetailsMapper$mapPromoDetails$12.L$0 = null;
                                                    chargersDiscountDetailsMapper$mapPromoDetails$12.L$1 = ir9Var5;
                                                    chargersDiscountDetailsMapper$mapPromoDetails$12.L$2 = null;
                                                    chargersDiscountDetailsMapper$mapPromoDetails$12.L$3 = charSequence8;
                                                    chargersDiscountDetailsMapper$mapPromoDetails$12.L$4 = str4;
                                                    chargersDiscountDetailsMapper$mapPromoDetails$12.L$5 = charSequence3;
                                                    chargersDiscountDetailsMapper$mapPromoDetails$12.L$6 = onaVar;
                                                    chargersDiscountDetailsMapper$mapPromoDetails$12.L$7 = charSequence6;
                                                    chargersDiscountDetailsMapper$mapPromoDetails$12.L$8 = charSequence9;
                                                    chargersDiscountDetailsMapper$mapPromoDetails$12.L$9 = promoDetailsButtonDto;
                                                    chargersDiscountDetailsMapper$mapPromoDetails$12.L$10 = null;
                                                    chargersDiscountDetailsMapper$mapPromoDetails$12.L$11 = list;
                                                    chargersDiscountDetailsMapper$mapPromoDetails$12.L$12 = code;
                                                    chargersDiscountDetailsMapper$mapPromoDetails$12.I$0 = i2;
                                                    chargersDiscountDetailsMapper$mapPromoDetails$12.label = 6;
                                                    String str10 = code;
                                                    Object e5 = c.e(this.c, formattedText6, null, false, chargersDiscountDetailsMapper$mapPromoDetails$12, 30);
                                                    if (e5 != coroutineSingletons) {
                                                        charSequence12 = charSequence3;
                                                        charSequence13 = charSequence9;
                                                        obj = e5;
                                                        onaVar4 = onaVar;
                                                        charSequence14 = charSequence6;
                                                        list2 = list;
                                                        promoDetailsButtonDto2 = promoDetailsButtonDto;
                                                        str6 = str4;
                                                        charSequence15 = charSequence8;
                                                        str7 = str10;
                                                        charSequence19 = (CharSequence) obj;
                                                        CharSequence charSequence28 = charSequence13;
                                                        code = str7;
                                                        promoDetailsButtonDto3 = promoDetailsButtonDto2;
                                                        charSequence16 = charSequence15;
                                                        charSequence6 = charSequence14;
                                                        list = list2;
                                                        charSequence18 = charSequence28;
                                                        str8 = str6;
                                                        onaVar = onaVar4;
                                                        ir9Var6 = ir9Var5;
                                                        charSequence17 = charSequence12;
                                                        if (i2 != 0 || (list != null && kotlin.collections.a.G(list, code))) {
                                                            onaVar5 = onaVar;
                                                            charSequence20 = charSequence6;
                                                            charSequence22 = null;
                                                            charSequence21 = charSequence19;
                                                            charSequence9 = charSequence18;
                                                            charSequence3 = charSequence17;
                                                            ir9Var5 = ir9Var6;
                                                        } else if (promoDetailsButtonDto3.b.d()) {
                                                            onaVar5 = onaVar;
                                                            charSequence20 = charSequence6;
                                                            charSequence21 = charSequence19;
                                                            charSequence9 = charSequence18;
                                                            charSequence3 = charSequence17;
                                                            ir9Var5 = ir9Var6;
                                                            charSequence22 = null;
                                                        } else {
                                                            FormattedText formattedText7 = promoDetailsButtonDto3.b;
                                                            chargersDiscountDetailsMapper$mapPromoDetails$12.L$0 = null;
                                                            chargersDiscountDetailsMapper$mapPromoDetails$12.L$1 = ir9Var6;
                                                            chargersDiscountDetailsMapper$mapPromoDetails$12.L$2 = null;
                                                            chargersDiscountDetailsMapper$mapPromoDetails$12.L$3 = charSequence16;
                                                            chargersDiscountDetailsMapper$mapPromoDetails$12.L$4 = str8;
                                                            chargersDiscountDetailsMapper$mapPromoDetails$12.L$5 = charSequence17;
                                                            chargersDiscountDetailsMapper$mapPromoDetails$12.L$6 = onaVar;
                                                            chargersDiscountDetailsMapper$mapPromoDetails$12.L$7 = charSequence6;
                                                            chargersDiscountDetailsMapper$mapPromoDetails$12.L$8 = charSequence18;
                                                            chargersDiscountDetailsMapper$mapPromoDetails$12.L$9 = promoDetailsButtonDto3;
                                                            chargersDiscountDetailsMapper$mapPromoDetails$12.L$10 = null;
                                                            chargersDiscountDetailsMapper$mapPromoDetails$12.L$11 = null;
                                                            chargersDiscountDetailsMapper$mapPromoDetails$12.L$12 = charSequence19;
                                                            chargersDiscountDetailsMapper$mapPromoDetails$12.L$13 = null;
                                                            chargersDiscountDetailsMapper$mapPromoDetails$12.I$0 = i2;
                                                            chargersDiscountDetailsMapper$mapPromoDetails$12.label = 7;
                                                            ir9 ir9Var9 = ir9Var6;
                                                            CharSequence charSequence29 = charSequence16;
                                                            Object e6 = c.e(this.c, formattedText7, null, false, chargersDiscountDetailsMapper$mapPromoDetails$12, 30);
                                                            if (e6 != coroutineSingletons) {
                                                                charSequence23 = charSequence29;
                                                                i5 = i2;
                                                                charSequence24 = charSequence19;
                                                                obj = e6;
                                                                charSequence25 = charSequence17;
                                                                str9 = str8;
                                                                onaVar6 = onaVar;
                                                                charSequence20 = charSequence6;
                                                                ir9Var7 = ir9Var9;
                                                                CharSequence charSequence30 = (CharSequence) obj;
                                                                charSequence21 = charSequence24;
                                                                charSequence9 = charSequence18;
                                                                charSequence3 = charSequence25;
                                                                ir9Var5 = ir9Var7;
                                                                charSequence22 = charSequence30;
                                                                i2 = i5;
                                                                onaVar5 = onaVar6;
                                                                str8 = str9;
                                                                charSequence16 = charSequence23;
                                                            }
                                                        }
                                                        boolean z = promoDetailsButtonDto3.c;
                                                        uj9 uj9Var = jr9.a;
                                                        if (i2 == 0) {
                                                            q0 q0Var = promoDetailsButtonDto3.d;
                                                            if (q0Var instanceof n0) {
                                                                uj9Var = new mr9(ir9Var5);
                                                            } else if (q0Var instanceof m0) {
                                                                uj9Var = new nr9(ir9Var5);
                                                            } else if (!(q0Var instanceof k0)) {
                                                                uj9Var = tj9.a;
                                                            }
                                                        }
                                                        onaVar3 = onaVar5;
                                                        charSequence11 = charSequence20;
                                                        charSequence10 = charSequence16;
                                                        str5 = str8;
                                                        uo9Var = new uo9(charSequence21, charSequence22, z, uj9Var, true, null, false, false, 224);
                                                        return new pna(ir9Var5, str5, charSequence10, charSequence3, onaVar3, charSequence11, charSequence9, uo9Var);
                                                    }
                                                } else {
                                                    h = ((avj0) zuj0Var).h(kyh0.chargers_discounts_activate_promocode_button_text);
                                                }
                                                CharSequence charSequence31 = charSequence8;
                                                str8 = str4;
                                                promoDetailsButtonDto3 = promoDetailsButtonDto;
                                                charSequence16 = charSequence31;
                                                ir9 ir9Var10 = ir9Var5;
                                                charSequence17 = charSequence3;
                                                charSequence18 = charSequence9;
                                                charSequence19 = h;
                                                ir9Var6 = ir9Var10;
                                                if (i2 != 0) {
                                                    if (promoDetailsButtonDto3.b.d()) {
                                                    }
                                                }
                                                onaVar5 = onaVar;
                                                charSequence20 = charSequence6;
                                                charSequence22 = null;
                                                charSequence21 = charSequence19;
                                                charSequence9 = charSequence18;
                                                charSequence3 = charSequence17;
                                                ir9Var5 = ir9Var6;
                                                boolean z2 = promoDetailsButtonDto3.c;
                                                uj9 uj9Var2 = jr9.a;
                                                if (i2 == 0) {
                                                }
                                                onaVar3 = onaVar5;
                                                charSequence11 = charSequence20;
                                                charSequence10 = charSequence16;
                                                str5 = str8;
                                                uo9Var = new uo9(charSequence21, charSequence22, z2, uj9Var2, true, null, false, false, 224);
                                                return new pna(ir9Var5, str5, charSequence10, charSequence3, onaVar3, charSequence11, charSequence9, uo9Var);
                                            }
                                        }
                                    } else {
                                        charSequence6 = null;
                                        FormattedText formattedText52 = chargersPromoDetailsDto2.f;
                                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$0 = chargersPromoDetailsDto2;
                                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$1 = ir9Var2;
                                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$2 = null;
                                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$3 = charSequence2;
                                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$4 = str;
                                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$5 = charSequence3;
                                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$6 = onaVar;
                                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$7 = charSequence6;
                                        chargersDiscountDetailsMapper$mapPromoDetails$12.I$0 = i2;
                                        chargersDiscountDetailsMapper$mapPromoDetails$12.label = 5;
                                        e = c.e(this.c, formattedText52, null, false, chargersDiscountDetailsMapper$mapPromoDetails$12, 30);
                                        if (e != coroutineSingletons) {
                                        }
                                    }
                                }
                            } else {
                                ir9 ir9Var11 = ir9Var8;
                                charSequence2 = charSequence;
                                i2 = i;
                                charSequence3 = charSequence27;
                                ir9Var2 = ir9Var11;
                                onaVar = null;
                                formattedText = chargersPromoDetailsDto2.e;
                                if (formattedText != null) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 2:
                        int i10 = chargersDiscountDetailsMapper$mapPromoDetails$12.I$0;
                        String str11 = (String) chargersDiscountDetailsMapper$mapPromoDetails$12.L$4;
                        CharSequence charSequence32 = (CharSequence) chargersDiscountDetailsMapper$mapPromoDetails$12.L$3;
                        ir9 ir9Var12 = (ir9) chargersDiscountDetailsMapper$mapPromoDetails$12.L$1;
                        ChargersPromoDetailsDto chargersPromoDetailsDto8 = (ChargersPromoDetailsDto) chargersDiscountDetailsMapper$mapPromoDetails$12.L$0;
                        kotlin.b.b(obj);
                        i = i10;
                        charSequence = charSequence32;
                        str = str11;
                        ir9Var8 = ir9Var12;
                        chargersPromoDetailsDto2 = chargersPromoDetailsDto8;
                        CharSequence charSequence272 = (CharSequence) obj;
                        promoUsage = chargersPromoDetailsDto2.d;
                        if (promoUsage == null) {
                        }
                        break;
                    case 3:
                        i3 = chargersDiscountDetailsMapper$mapPromoDetails$12.I$2;
                        i4 = chargersDiscountDetailsMapper$mapPromoDetails$12.I$1;
                        i = chargersDiscountDetailsMapper$mapPromoDetails$12.I$0;
                        charSequence4 = (CharSequence) chargersDiscountDetailsMapper$mapPromoDetails$12.L$5;
                        str2 = (String) chargersDiscountDetailsMapper$mapPromoDetails$12.L$4;
                        charSequence5 = (CharSequence) chargersDiscountDetailsMapper$mapPromoDetails$12.L$3;
                        ir9Var3 = (ir9) chargersDiscountDetailsMapper$mapPromoDetails$12.L$1;
                        chargersPromoDetailsDto3 = (ChargersPromoDetailsDto) chargersDiscountDetailsMapper$mapPromoDetails$12.L$0;
                        kotlin.b.b(obj);
                        ona onaVar72 = new ona(i3, i4, (CharSequence) obj);
                        i2 = i;
                        charSequence3 = charSequence4;
                        charSequence2 = charSequence5;
                        ir9Var2 = ir9Var3;
                        chargersPromoDetailsDto2 = chargersPromoDetailsDto3;
                        onaVar = onaVar72;
                        str = str2;
                        formattedText = chargersPromoDetailsDto2.e;
                        if (formattedText != null) {
                        }
                        break;
                    case 4:
                        i2 = chargersDiscountDetailsMapper$mapPromoDetails$12.I$0;
                        onaVar2 = (ona) chargersDiscountDetailsMapper$mapPromoDetails$12.L$6;
                        charSequence3 = (CharSequence) chargersDiscountDetailsMapper$mapPromoDetails$12.L$5;
                        str3 = (String) chargersDiscountDetailsMapper$mapPromoDetails$12.L$4;
                        charSequence7 = (CharSequence) chargersDiscountDetailsMapper$mapPromoDetails$12.L$3;
                        ir9Var4 = (ir9) chargersDiscountDetailsMapper$mapPromoDetails$12.L$1;
                        chargersPromoDetailsDto4 = (ChargersPromoDetailsDto) chargersDiscountDetailsMapper$mapPromoDetails$12.L$0;
                        kotlin.b.b(obj);
                        onaVar = onaVar2;
                        charSequence6 = (CharSequence) obj;
                        str = str3;
                        charSequence2 = charSequence7;
                        ir9Var2 = ir9Var4;
                        chargersPromoDetailsDto2 = chargersPromoDetailsDto4;
                        FormattedText formattedText522 = chargersPromoDetailsDto2.f;
                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$0 = chargersPromoDetailsDto2;
                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$1 = ir9Var2;
                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$2 = null;
                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$3 = charSequence2;
                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$4 = str;
                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$5 = charSequence3;
                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$6 = onaVar;
                        chargersDiscountDetailsMapper$mapPromoDetails$12.L$7 = charSequence6;
                        chargersDiscountDetailsMapper$mapPromoDetails$12.I$0 = i2;
                        chargersDiscountDetailsMapper$mapPromoDetails$12.label = 5;
                        e = c.e(this.c, formattedText522, null, false, chargersDiscountDetailsMapper$mapPromoDetails$12, 30);
                        if (e != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 5:
                        i2 = chargersDiscountDetailsMapper$mapPromoDetails$12.I$0;
                        CharSequence charSequence33 = (CharSequence) chargersDiscountDetailsMapper$mapPromoDetails$12.L$7;
                        ona onaVar8 = (ona) chargersDiscountDetailsMapper$mapPromoDetails$12.L$6;
                        CharSequence charSequence34 = (CharSequence) chargersDiscountDetailsMapper$mapPromoDetails$12.L$5;
                        String str12 = (String) chargersDiscountDetailsMapper$mapPromoDetails$12.L$4;
                        CharSequence charSequence35 = (CharSequence) chargersDiscountDetailsMapper$mapPromoDetails$12.L$3;
                        ir9 ir9Var13 = (ir9) chargersDiscountDetailsMapper$mapPromoDetails$12.L$1;
                        chargersPromoDetailsDto5 = (ChargersPromoDetailsDto) chargersDiscountDetailsMapper$mapPromoDetails$12.L$0;
                        kotlin.b.b(obj);
                        charSequence6 = charSequence33;
                        onaVar = onaVar8;
                        charSequence3 = charSequence34;
                        str4 = str12;
                        charSequence8 = charSequence35;
                        ir9Var5 = ir9Var13;
                        charSequence9 = (CharSequence) obj;
                        promoDetailsButtonDto = chargersPromoDetailsDto5.g;
                        if (promoDetailsButtonDto != null) {
                        }
                        break;
                    case 6:
                        i2 = chargersDiscountDetailsMapper$mapPromoDetails$12.I$0;
                        str7 = (String) chargersDiscountDetailsMapper$mapPromoDetails$12.L$12;
                        list2 = (List) chargersDiscountDetailsMapper$mapPromoDetails$12.L$11;
                        promoDetailsButtonDto2 = (ChargersPromoDetailsDto.PromoDetailsButtonDto) chargersDiscountDetailsMapper$mapPromoDetails$12.L$9;
                        charSequence13 = (CharSequence) chargersDiscountDetailsMapper$mapPromoDetails$12.L$8;
                        charSequence14 = (CharSequence) chargersDiscountDetailsMapper$mapPromoDetails$12.L$7;
                        onaVar4 = (ona) chargersDiscountDetailsMapper$mapPromoDetails$12.L$6;
                        charSequence12 = (CharSequence) chargersDiscountDetailsMapper$mapPromoDetails$12.L$5;
                        str6 = (String) chargersDiscountDetailsMapper$mapPromoDetails$12.L$4;
                        charSequence15 = (CharSequence) chargersDiscountDetailsMapper$mapPromoDetails$12.L$3;
                        ir9Var5 = (ir9) chargersDiscountDetailsMapper$mapPromoDetails$12.L$1;
                        kotlin.b.b(obj);
                        charSequence19 = (CharSequence) obj;
                        CharSequence charSequence282 = charSequence13;
                        code = str7;
                        promoDetailsButtonDto3 = promoDetailsButtonDto2;
                        charSequence16 = charSequence15;
                        charSequence6 = charSequence14;
                        list = list2;
                        charSequence18 = charSequence282;
                        str8 = str6;
                        onaVar = onaVar4;
                        ir9Var6 = ir9Var5;
                        charSequence17 = charSequence12;
                        if (i2 != 0) {
                        }
                        onaVar5 = onaVar;
                        charSequence20 = charSequence6;
                        charSequence22 = null;
                        charSequence21 = charSequence19;
                        charSequence9 = charSequence18;
                        charSequence3 = charSequence17;
                        ir9Var5 = ir9Var6;
                        boolean z22 = promoDetailsButtonDto3.c;
                        uj9 uj9Var22 = jr9.a;
                        if (i2 == 0) {
                        }
                        onaVar3 = onaVar5;
                        charSequence11 = charSequence20;
                        charSequence10 = charSequence16;
                        str5 = str8;
                        uo9Var = new uo9(charSequence21, charSequence22, z22, uj9Var22, true, null, false, false, 224);
                        return new pna(ir9Var5, str5, charSequence10, charSequence3, onaVar3, charSequence11, charSequence9, uo9Var);
                    case 7:
                        i5 = chargersDiscountDetailsMapper$mapPromoDetails$12.I$0;
                        charSequence24 = (CharSequence) chargersDiscountDetailsMapper$mapPromoDetails$12.L$12;
                        promoDetailsButtonDto3 = (ChargersPromoDetailsDto.PromoDetailsButtonDto) chargersDiscountDetailsMapper$mapPromoDetails$12.L$9;
                        charSequence18 = (CharSequence) chargersDiscountDetailsMapper$mapPromoDetails$12.L$8;
                        charSequence20 = (CharSequence) chargersDiscountDetailsMapper$mapPromoDetails$12.L$7;
                        onaVar6 = (ona) chargersDiscountDetailsMapper$mapPromoDetails$12.L$6;
                        charSequence25 = (CharSequence) chargersDiscountDetailsMapper$mapPromoDetails$12.L$5;
                        str9 = (String) chargersDiscountDetailsMapper$mapPromoDetails$12.L$4;
                        charSequence23 = (CharSequence) chargersDiscountDetailsMapper$mapPromoDetails$12.L$3;
                        ir9Var7 = (ir9) chargersDiscountDetailsMapper$mapPromoDetails$12.L$1;
                        kotlin.b.b(obj);
                        CharSequence charSequence302 = (CharSequence) obj;
                        charSequence21 = charSequence24;
                        charSequence9 = charSequence18;
                        charSequence3 = charSequence25;
                        ir9Var5 = ir9Var7;
                        charSequence22 = charSequence302;
                        i2 = i5;
                        onaVar5 = onaVar6;
                        str8 = str9;
                        charSequence16 = charSequence23;
                        boolean z222 = promoDetailsButtonDto3.c;
                        uj9 uj9Var222 = jr9.a;
                        if (i2 == 0) {
                        }
                        onaVar3 = onaVar5;
                        charSequence11 = charSequence20;
                        charSequence10 = charSequence16;
                        str5 = str8;
                        uo9Var = new uo9(charSequence21, charSequence22, z222, uj9Var222, true, null, false, false, 224);
                        return new pna(ir9Var5, str5, charSequence10, charSequence3, onaVar3, charSequence11, charSequence9, uo9Var);
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        chargersDiscountDetailsMapper$mapPromoDetails$1 = new ChargersDiscountDetailsMapper$mapPromoDetails$1(this, continuationImpl);
        chargersDiscountDetailsMapper$mapPromoDetails$12 = chargersDiscountDetailsMapper$mapPromoDetails$1;
        Object obj2 = chargersDiscountDetailsMapper$mapPromoDetails$12.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (chargersDiscountDetailsMapper$mapPromoDetails$12.label) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0314, code lost:
    
        if (r3 != r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02c6, code lost:
    
        if (r3 == r4) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v48, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x04b8 -> B:43:0x04ce). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ChargersTaskDiscountDetailsDto chargersTaskDiscountDetailsDto, ow9 ow9Var, ContinuationImpl continuationImpl) {
        ChargersDiscountDetailsMapper$mapTaskDiscountDetails$1 chargersDiscountDetailsMapper$mapTaskDiscountDetails$1;
        int i;
        ir9 ir9Var;
        int i2;
        CharSequence charSequence;
        ir9 ir9Var2;
        ChargersTaskDiscountDetailsDto chargersTaskDiscountDetailsDto2;
        int i3;
        CharSequence charSequence2;
        int i4;
        int i5;
        String str;
        CharSequence charSequence3;
        String str2;
        CharSequence charSequence4;
        ir9 ir9Var3;
        ChargersTaskDiscountDetailsDto chargersTaskDiscountDetailsDto3;
        int i6;
        CharSequence charSequence5;
        Object e;
        CharSequence charSequence6;
        int i7;
        CharSequence charSequence7;
        String str3;
        CharSequence charSequence8;
        ChargersTaskDiscountDetailsDto chargersTaskDiscountDetailsDto4;
        ir9 ir9Var4;
        CharSequence charSequence9;
        ArrayList arrayList;
        CharSequence charSequence10;
        CoroutineSingletons coroutineSingletons;
        CharSequence charSequence11;
        String str4;
        CharSequence charSequence12;
        kdc kdcVar;
        kdc kdcVar2;
        Iterator it;
        ChargersTaskDiscountDetailsDto chargersTaskDiscountDetailsDto5;
        int i8;
        CharSequence charSequence13;
        int i9;
        int i10;
        ChargersTaskDiscountDetailsDto chargersTaskDiscountDetailsDto6;
        int i11;
        CoroutineSingletons coroutineSingletons2;
        int i12;
        ArrayList arrayList2;
        ArrayList arrayList3;
        kdc kdcVar3;
        CharSequence charSequence14;
        int i13;
        Object obj;
        ChargersProgressDiscountDetailsDto.ProgressDiscountPerkDto progressDiscountPerkDto;
        Iterator it2;
        kdc kdcVar4;
        CharSequence charSequence15;
        String str5;
        ChargersDiscountDetailsMapper$mapTaskDiscountDetails$1 chargersDiscountDetailsMapper$mapTaskDiscountDetails$12;
        CoroutineSingletons coroutineSingletons3;
        String str6;
        Object e2;
        CharSequence charSequence16;
        CharSequence charSequence17;
        CharSequence charSequence18;
        String str7;
        CharSequence charSequence19;
        ChargersTaskDiscountDetailsDto chargersTaskDiscountDetailsDto7;
        kdc kdcVar5;
        Collection collection;
        ArrayList arrayList4;
        int i14;
        ArrayList arrayList5;
        uo9 uo9Var;
        int i15;
        CharSequence charSequence20;
        CharSequence charSequence21;
        kdc kdcVar6;
        CharSequence charSequence22;
        kdc kdcVar7;
        CharSequence charSequence23;
        CharSequence charSequence24;
        String str8;
        int i16;
        String str9;
        int i17;
        ChargersDiscountDetailsButtonDto chargersDiscountDetailsButtonDto;
        int i18;
        CharSequence charSequence25;
        CharSequence charSequence26;
        Object obj2;
        ir9 ir9Var5;
        CharSequence charSequence27;
        ArrayList arrayList6;
        CoroutineSingletons coroutineSingletons4;
        String str10;
        ir9 ir9Var6;
        CharSequence charSequence28;
        kdc kdcVar8;
        kdc kdcVar9;
        CharSequence charSequence29;
        CharSequence charSequence30;
        CharSequence charSequence31;
        CharSequence charSequence32;
        CharSequence h;
        int i19;
        CharSequence charSequence33;
        CharSequence charSequence34;
        CharSequence charSequence35;
        kdc kdcVar10;
        kdc kdcVar11;
        CharSequence charSequence36;
        CharSequence charSequence37;
        ArrayList arrayList7;
        int i20;
        int i21;
        int i22;
        CharSequence charSequence38;
        ChargersTaskDiscountDetailsDto chargersTaskDiscountDetailsDto8 = chargersTaskDiscountDetailsDto;
        if (continuationImpl instanceof ChargersDiscountDetailsMapper$mapTaskDiscountDetails$1) {
            chargersDiscountDetailsMapper$mapTaskDiscountDetails$1 = (ChargersDiscountDetailsMapper$mapTaskDiscountDetails$1) continuationImpl;
            int i23 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$1.label;
            if ((i23 & Integer.MIN_VALUE) != 0) {
                chargersDiscountDetailsMapper$mapTaskDiscountDetails$1.label = i23 - Integer.MIN_VALUE;
                ChargersDiscountDetailsMapper$mapTaskDiscountDetails$1 chargersDiscountDetailsMapper$mapTaskDiscountDetails$13 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$1;
                Object obj3 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.result;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.label;
                e eVar = this.b;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj3);
                        ChargersDiscountDto chargersDiscountDto = chargersTaskDiscountDetailsDto8.a;
                        ir9Var = chargersDiscountDto != null ? new ir9(chargersDiscountDto.a, chargersDiscountDto.b, null) : null;
                        int i24 = 0;
                        if (chargersDiscountDto != null) {
                            if (jl40.l(chargersDiscountDto.b, ow9Var != null ? ow9Var.b : null) && chargersDiscountDto.a == ow9Var.a) {
                                i24 = 1;
                            }
                        }
                        i2 = i24;
                        FormattedText formattedText = chargersTaskDiscountDetailsDto8.b;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$0 = chargersTaskDiscountDetailsDto8;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$1 = null;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$2 = ir9Var;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$0 = i2;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.label = 1;
                        obj3 = c.e(this.c, formattedText, null, false, chargersDiscountDetailsMapper$mapTaskDiscountDetails$13, 30);
                        break;
                    case 1:
                        int i25 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$0;
                        ir9 ir9Var7 = (ir9) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$2;
                        ChargersTaskDiscountDetailsDto chargersTaskDiscountDetailsDto9 = (ChargersTaskDiscountDetailsDto) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$0;
                        kotlin.b.b(obj3);
                        ir9Var = ir9Var7;
                        i2 = i25;
                        chargersTaskDiscountDetailsDto8 = chargersTaskDiscountDetailsDto9;
                        CharSequence charSequence39 = (CharSequence) obj3;
                        FormattedText formattedText2 = chargersTaskDiscountDetailsDto8.c;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$0 = chargersTaskDiscountDetailsDto8;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$1 = null;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$2 = ir9Var;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$3 = charSequence39;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$0 = i2;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.label = 2;
                        Object e3 = c.e(this.c, formattedText2, null, false, chargersDiscountDetailsMapper$mapTaskDiscountDetails$13, 30);
                        if (e3 != coroutineSingletons5) {
                            charSequence = charSequence39;
                            obj3 = e3;
                            ir9Var2 = ir9Var;
                            chargersTaskDiscountDetailsDto2 = chargersTaskDiscountDetailsDto8;
                            i3 = i2;
                            charSequence2 = (CharSequence) obj3;
                            i4 = chargersTaskDiscountDetailsDto2.d;
                            i5 = chargersTaskDiscountDetailsDto2.e;
                            str = chargersTaskDiscountDetailsDto2.f;
                            FormattedText formattedText3 = chargersTaskDiscountDetailsDto2.g;
                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$0 = chargersTaskDiscountDetailsDto2;
                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$1 = null;
                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$2 = ir9Var2;
                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$3 = charSequence;
                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$4 = charSequence2;
                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$5 = str;
                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$0 = i3;
                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$1 = i4;
                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$2 = i5;
                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.label = 3;
                            obj3 = eVar.t(formattedText3, chargersDiscountDetailsMapper$mapTaskDiscountDetails$13);
                            break;
                        }
                        return coroutineSingletons5;
                    case 2:
                        int i26 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$0;
                        CharSequence charSequence40 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$3;
                        ir9 ir9Var8 = (ir9) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$2;
                        ChargersTaskDiscountDetailsDto chargersTaskDiscountDetailsDto10 = (ChargersTaskDiscountDetailsDto) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$0;
                        kotlin.b.b(obj3);
                        charSequence = charSequence40;
                        ir9Var2 = ir9Var8;
                        chargersTaskDiscountDetailsDto2 = chargersTaskDiscountDetailsDto10;
                        i3 = i26;
                        charSequence2 = (CharSequence) obj3;
                        i4 = chargersTaskDiscountDetailsDto2.d;
                        i5 = chargersTaskDiscountDetailsDto2.e;
                        str = chargersTaskDiscountDetailsDto2.f;
                        FormattedText formattedText32 = chargersTaskDiscountDetailsDto2.g;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$0 = chargersTaskDiscountDetailsDto2;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$1 = null;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$2 = ir9Var2;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$3 = charSequence;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$4 = charSequence2;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$5 = str;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$0 = i3;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$1 = i4;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$2 = i5;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.label = 3;
                        obj3 = eVar.t(formattedText32, chargersDiscountDetailsMapper$mapTaskDiscountDetails$13);
                        break;
                    case 3:
                        i5 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$2;
                        i4 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$1;
                        i3 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$0;
                        str = (String) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$5;
                        charSequence2 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$4;
                        charSequence = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$3;
                        ir9Var2 = (ir9) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$2;
                        chargersTaskDiscountDetailsDto2 = (ChargersTaskDiscountDetailsDto) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$0;
                        kotlin.b.b(obj3);
                        CharSequence charSequence41 = (CharSequence) obj3;
                        FormattedText formattedText4 = chargersTaskDiscountDetailsDto2.h;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$0 = chargersTaskDiscountDetailsDto2;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$1 = null;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$2 = ir9Var2;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$3 = charSequence;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$4 = charSequence2;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$5 = str;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$6 = charSequence41;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$0 = i3;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$1 = i4;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$2 = i5;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.label = 4;
                        Object t = eVar.t(formattedText4, chargersDiscountDetailsMapper$mapTaskDiscountDetails$13);
                        if (t != coroutineSingletons5) {
                            charSequence3 = charSequence41;
                            obj3 = t;
                            str2 = str;
                            charSequence4 = charSequence2;
                            ir9Var3 = ir9Var2;
                            chargersTaskDiscountDetailsDto3 = chargersTaskDiscountDetailsDto2;
                            i6 = i3;
                            charSequence5 = charSequence;
                            CharSequence charSequence42 = (CharSequence) obj3;
                            FormattedText formattedText5 = chargersTaskDiscountDetailsDto3.j;
                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$0 = chargersTaskDiscountDetailsDto3;
                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$1 = null;
                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$2 = ir9Var3;
                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$3 = charSequence5;
                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$4 = charSequence4;
                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$5 = str2;
                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$6 = charSequence3;
                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$7 = charSequence42;
                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$0 = i6;
                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$1 = i4;
                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$2 = i5;
                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.label = 5;
                            CharSequence charSequence43 = charSequence5;
                            ChargersTaskDiscountDetailsDto chargersTaskDiscountDetailsDto11 = chargersTaskDiscountDetailsDto3;
                            ir9 ir9Var9 = ir9Var3;
                            e = c.e(this.c, formattedText5, null, false, chargersDiscountDetailsMapper$mapTaskDiscountDetails$13, 30);
                            if (e != coroutineSingletons5) {
                                charSequence6 = charSequence42;
                                obj3 = e;
                                i7 = i6;
                                charSequence7 = charSequence3;
                                str3 = str2;
                                charSequence8 = charSequence4;
                                chargersTaskDiscountDetailsDto4 = chargersTaskDiscountDetailsDto11;
                                ir9Var4 = ir9Var9;
                                charSequence9 = charSequence43;
                                kdc a = eVar.a(chargersTaskDiscountDetailsDto4.l);
                                int i27 = i5;
                                kdc a2 = eVar.a(chargersTaskDiscountDetailsDto4.m);
                                List list = chargersTaskDiscountDetailsDto4.i;
                                int i28 = i4;
                                arrayList = new ArrayList(tcc.n(list, 10));
                                Iterator it3 = list.iterator();
                                charSequence10 = (CharSequence) obj3;
                                coroutineSingletons = coroutineSingletons5;
                                charSequence11 = charSequence7;
                                str4 = str3;
                                charSequence12 = charSequence8;
                                kdcVar = a;
                                kdcVar2 = a2;
                                it = it3;
                                chargersTaskDiscountDetailsDto5 = chargersTaskDiscountDetailsDto4;
                                i8 = i27;
                                charSequence13 = charSequence6;
                                i9 = i7;
                                i10 = i28;
                                if (!it.hasNext()) {
                                    int i29 = i8;
                                    ChargersProgressDiscountDetailsDto.ProgressDiscountPerkDto progressDiscountPerkDto2 = (ChargersProgressDiscountDetailsDto.ProgressDiscountPerkDto) it.next();
                                    int i30 = i10;
                                    String str11 = progressDiscountPerkDto2.a;
                                    int i31 = i9;
                                    FormattedText formattedText6 = progressDiscountPerkDto2.b;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$0 = chargersTaskDiscountDetailsDto5;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$1 = null;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$2 = ir9Var4;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$3 = charSequence9;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$4 = charSequence12;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$5 = str4;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$6 = charSequence11;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$7 = charSequence13;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$8 = charSequence10;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$9 = kdcVar;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$10 = kdcVar2;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$11 = null;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$12 = null;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$13 = arrayList;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$14 = it;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$15 = null;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$16 = progressDiscountPerkDto2;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$17 = str11;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$18 = arrayList;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$19 = null;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$0 = i31;
                                    ArrayList arrayList8 = arrayList;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$1 = i30;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$2 = i29;
                                    Iterator it4 = it;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.label = 6;
                                    CharSequence charSequence44 = charSequence13;
                                    ChargersTaskDiscountDetailsDto chargersTaskDiscountDetailsDto12 = chargersTaskDiscountDetailsDto5;
                                    ChargersDiscountDetailsMapper$mapTaskDiscountDetails$1 chargersDiscountDetailsMapper$mapTaskDiscountDetails$14 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13;
                                    Object e4 = c.e(this.c, formattedText6, null, false, chargersDiscountDetailsMapper$mapTaskDiscountDetails$14, 30);
                                    CoroutineSingletons coroutineSingletons6 = coroutineSingletons;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$14;
                                    if (e4 == coroutineSingletons6) {
                                        return coroutineSingletons6;
                                    }
                                    it2 = it4;
                                    obj = e4;
                                    i12 = i31;
                                    kdcVar4 = kdcVar2;
                                    charSequence15 = charSequence44;
                                    charSequence14 = charSequence10;
                                    arrayList2 = arrayList8;
                                    progressDiscountPerkDto = progressDiscountPerkDto2;
                                    i11 = i30;
                                    chargersTaskDiscountDetailsDto6 = chargersTaskDiscountDetailsDto12;
                                    kdcVar3 = kdcVar;
                                    i13 = i29;
                                    str5 = str11;
                                    coroutineSingletons2 = coroutineSingletons6;
                                    arrayList3 = arrayList2;
                                    CharSequence charSequence45 = (CharSequence) obj;
                                    FormattedText formattedText7 = progressDiscountPerkDto.c;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$0 = chargersTaskDiscountDetailsDto6;
                                    ChargersTaskDiscountDetailsDto chargersTaskDiscountDetailsDto13 = chargersTaskDiscountDetailsDto6;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$1 = null;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$2 = ir9Var4;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$3 = charSequence9;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$4 = charSequence12;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$5 = str4;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$6 = charSequence11;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$7 = charSequence15;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$8 = charSequence14;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$9 = kdcVar3;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$10 = kdcVar4;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$11 = null;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$12 = null;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$13 = arrayList3;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$14 = it2;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$15 = null;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$16 = null;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$17 = str5;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$18 = charSequence45;
                                    ArrayList arrayList9 = arrayList2;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$19 = arrayList9;
                                    str6 = str4;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.I$0 = i12;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.I$1 = i11;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.I$2 = i13;
                                    chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.label = 7;
                                    ChargersDiscountDetailsMapper$mapTaskDiscountDetails$1 chargersDiscountDetailsMapper$mapTaskDiscountDetails$15 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$12;
                                    e2 = c.e(this.c, formattedText7, null, false, chargersDiscountDetailsMapper$mapTaskDiscountDetails$15, 30);
                                    coroutineSingletons3 = coroutineSingletons2;
                                    if (e2 != coroutineSingletons3) {
                                        charSequence16 = charSequence12;
                                        charSequence17 = charSequence15;
                                        charSequence18 = charSequence45;
                                        str7 = str5;
                                        charSequence19 = charSequence9;
                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$15;
                                        chargersTaskDiscountDetailsDto7 = chargersTaskDiscountDetailsDto13;
                                        kdcVar5 = kdcVar4;
                                        kdcVar = kdcVar3;
                                        obj3 = e2;
                                        i10 = i11;
                                        charSequence10 = charSequence14;
                                        collection = arrayList9;
                                        arrayList = arrayList3;
                                        i8 = i13;
                                        collection.add(new lya(charSequence18, (CharSequence) obj3, str7));
                                        kdcVar2 = kdcVar5;
                                        it = it2;
                                        coroutineSingletons = coroutineSingletons3;
                                        charSequence13 = charSequence17;
                                        charSequence12 = charSequence16;
                                        charSequence9 = charSequence19;
                                        chargersTaskDiscountDetailsDto5 = chargersTaskDiscountDetailsDto7;
                                        i9 = i12;
                                        str4 = str6;
                                        if (!it.hasNext()) {
                                            CoroutineSingletons coroutineSingletons7 = coroutineSingletons;
                                            int i32 = i8;
                                            ArrayList arrayList10 = arrayList;
                                            int i33 = i10;
                                            ChargersTaskDiscountDetailsDto chargersTaskDiscountDetailsDto14 = chargersTaskDiscountDetailsDto5;
                                            ChargersDiscountDetailsMapper$mapTaskDiscountDetails$1 chargersDiscountDetailsMapper$mapTaskDiscountDetails$16 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13;
                                            CharSequence charSequence46 = charSequence13;
                                            arrayList4 = arrayList10;
                                            ChargersDiscountDetailsButtonDto chargersDiscountDetailsButtonDto2 = chargersTaskDiscountDetailsDto14.k;
                                            if (chargersDiscountDetailsButtonDto2 == null) {
                                                i14 = i32;
                                                arrayList5 = arrayList4;
                                                uo9Var = null;
                                                i15 = i33;
                                                charSequence20 = charSequence11;
                                                charSequence21 = charSequence12;
                                                kdcVar6 = kdcVar2;
                                                charSequence22 = charSequence46;
                                                kdcVar7 = kdcVar;
                                                charSequence23 = charSequence10;
                                                charSequence24 = charSequence9;
                                                str8 = str4;
                                                return new mya(charSequence24, charSequence21, i15, i14, str8, charSequence20, charSequence22, kdcVar7, kdcVar6, arrayList5, charSequence23, uo9Var);
                                            }
                                            if (i9 != 0) {
                                                coroutineSingletons4 = coroutineSingletons7;
                                                ir9 ir9Var10 = ir9Var4;
                                                str10 = str4;
                                                ir9Var6 = ir9Var10;
                                                int i34 = i9;
                                                chargersDiscountDetailsButtonDto = chargersDiscountDetailsButtonDto2;
                                                i18 = i34;
                                                charSequence28 = charSequence12;
                                                kdcVar8 = kdcVar2;
                                                kdcVar9 = kdcVar;
                                                charSequence29 = charSequence10;
                                                charSequence30 = charSequence46;
                                                chargersDiscountDetailsMapper$mapTaskDiscountDetails$13 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$16;
                                                i16 = i33;
                                                charSequence31 = charSequence9;
                                                charSequence32 = charSequence11;
                                                h = ((avj0) this.a).h(kyh0.common_got_it);
                                                i19 = i32;
                                                if (i18 != 0) {
                                                    charSequence35 = charSequence31;
                                                    kdcVar10 = kdcVar8;
                                                    kdcVar11 = kdcVar9;
                                                    charSequence36 = charSequence29;
                                                    charSequence37 = charSequence30;
                                                    arrayList7 = arrayList4;
                                                    i20 = i16;
                                                    i21 = i19;
                                                    charSequence34 = charSequence32;
                                                    charSequence33 = null;
                                                } else {
                                                    int i35 = i19;
                                                    FormattedText formattedText8 = chargersDiscountDetailsButtonDto.b;
                                                    FormattedText formattedText9 = formattedText8.d() ? formattedText8 : null;
                                                    if (formattedText9 != null) {
                                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$0 = null;
                                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$1 = null;
                                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$2 = ir9Var6;
                                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$3 = charSequence31;
                                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$4 = charSequence28;
                                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$5 = str10;
                                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$6 = charSequence32;
                                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$7 = charSequence30;
                                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$8 = charSequence29;
                                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$9 = kdcVar9;
                                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$10 = kdcVar8;
                                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$11 = arrayList4;
                                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$12 = chargersDiscountDetailsButtonDto;
                                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$13 = h;
                                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$14 = null;
                                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$15 = null;
                                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$16 = null;
                                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$17 = null;
                                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$18 = null;
                                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$19 = null;
                                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$0 = i18;
                                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$1 = i16;
                                                        i22 = i35;
                                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$2 = i22;
                                                        ir9 ir9Var11 = ir9Var6;
                                                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.label = 9;
                                                        Object e5 = c.e(this.c, formattedText9, null, false, chargersDiscountDetailsMapper$mapTaskDiscountDetails$13, 30);
                                                        CoroutineSingletons coroutineSingletons8 = coroutineSingletons4;
                                                        if (e5 == coroutineSingletons8) {
                                                            return coroutineSingletons8;
                                                        }
                                                        charSequence38 = charSequence31;
                                                        obj3 = e5;
                                                        ir9Var6 = ir9Var11;
                                                        kdcVar10 = kdcVar8;
                                                        kdcVar11 = kdcVar9;
                                                        charSequence35 = charSequence38;
                                                        charSequence36 = charSequence29;
                                                        charSequence37 = charSequence30;
                                                        arrayList7 = arrayList4;
                                                        i20 = i16;
                                                        i21 = i22;
                                                        charSequence34 = charSequence32;
                                                        charSequence33 = (CharSequence) obj3;
                                                    } else {
                                                        CharSequence charSequence47 = charSequence32;
                                                        charSequence33 = null;
                                                        charSequence34 = charSequence47;
                                                        charSequence35 = charSequence31;
                                                        kdcVar10 = kdcVar8;
                                                        kdcVar11 = kdcVar9;
                                                        charSequence36 = charSequence29;
                                                        charSequence37 = charSequence30;
                                                        arrayList7 = arrayList4;
                                                        i20 = i16;
                                                        i21 = i35;
                                                        ir9Var6 = ir9Var6;
                                                    }
                                                }
                                                boolean z = chargersDiscountDetailsButtonDto.c;
                                                uj9 uj9Var = jr9.a;
                                                if (i18 == 0) {
                                                    yr9 yr9Var = chargersDiscountDetailsButtonDto.d;
                                                    if ((yr9Var instanceof vr9) && ir9Var6 != null) {
                                                        uj9Var = new mr9(ir9Var6);
                                                    } else if (!(yr9Var instanceof tr9)) {
                                                        uj9Var = tj9.a;
                                                    }
                                                }
                                                charSequence20 = charSequence34;
                                                i14 = i21;
                                                uo9Var = new uo9(h, charSequence33, z, uj9Var, true, null, false, false, 224);
                                                str8 = str10;
                                                i15 = i20;
                                                charSequence21 = charSequence28;
                                                kdcVar6 = kdcVar10;
                                                kdcVar7 = kdcVar11;
                                                charSequence23 = charSequence36;
                                                charSequence24 = charSequence35;
                                                charSequence22 = charSequence37;
                                                arrayList5 = arrayList7;
                                                return new mya(charSequence24, charSequence21, i15, i14, str8, charSequence20, charSequence22, kdcVar7, kdcVar6, arrayList5, charSequence23, uo9Var);
                                            }
                                            FormattedText formattedText10 = chargersDiscountDetailsButtonDto2.a;
                                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$16.L$0 = null;
                                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$16.L$1 = null;
                                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$16.L$2 = ir9Var4;
                                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$16.L$3 = charSequence9;
                                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$16.L$4 = charSequence12;
                                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$16.L$5 = str4;
                                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$16.L$6 = charSequence11;
                                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$16.L$7 = charSequence46;
                                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$16.L$8 = charSequence10;
                                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$16.L$9 = kdcVar;
                                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$16.L$10 = kdcVar2;
                                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$16.L$11 = arrayList4;
                                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$16.L$12 = chargersDiscountDetailsButtonDto2;
                                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$16.L$13 = null;
                                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$16.L$14 = null;
                                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$16.L$15 = null;
                                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$16.L$16 = null;
                                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$16.L$17 = null;
                                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$16.L$18 = null;
                                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$16.L$19 = null;
                                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$16.I$0 = i9;
                                            i16 = i33;
                                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$16.I$1 = i16;
                                            str9 = str4;
                                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$16.I$2 = i32;
                                            i17 = i32;
                                            chargersDiscountDetailsMapper$mapTaskDiscountDetails$16.label = 8;
                                            Object e6 = c.e(this.c, formattedText10, null, false, chargersDiscountDetailsMapper$mapTaskDiscountDetails$16, 30);
                                            coroutineSingletons3 = coroutineSingletons7;
                                            if (e6 != coroutineSingletons3) {
                                                int i36 = i9;
                                                chargersDiscountDetailsButtonDto = chargersDiscountDetailsButtonDto2;
                                                i18 = i36;
                                                charSequence25 = charSequence11;
                                                charSequence26 = charSequence46;
                                                chargersDiscountDetailsMapper$mapTaskDiscountDetails$13 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$16;
                                                obj2 = e6;
                                                ir9Var5 = ir9Var4;
                                                charSequence27 = charSequence12;
                                                arrayList6 = arrayList4;
                                                h = (CharSequence) obj2;
                                                ir9 ir9Var12 = ir9Var5;
                                                i19 = i17;
                                                ir9Var6 = ir9Var12;
                                                CharSequence charSequence48 = charSequence26;
                                                arrayList4 = arrayList6;
                                                kdcVar8 = kdcVar2;
                                                kdcVar9 = kdcVar;
                                                charSequence29 = charSequence10;
                                                charSequence30 = charSequence48;
                                                charSequence31 = charSequence9;
                                                coroutineSingletons4 = coroutineSingletons3;
                                                charSequence32 = charSequence25;
                                                charSequence28 = charSequence27;
                                                str10 = str9;
                                                if (i18 != 0) {
                                                }
                                                boolean z2 = chargersDiscountDetailsButtonDto.c;
                                                uj9 uj9Var2 = jr9.a;
                                                if (i18 == 0) {
                                                }
                                                charSequence20 = charSequence34;
                                                i14 = i21;
                                                uo9Var = new uo9(h, charSequence33, z2, uj9Var2, true, null, false, false, 224);
                                                str8 = str10;
                                                i15 = i20;
                                                charSequence21 = charSequence28;
                                                kdcVar6 = kdcVar10;
                                                kdcVar7 = kdcVar11;
                                                charSequence23 = charSequence36;
                                                charSequence24 = charSequence35;
                                                charSequence22 = charSequence37;
                                                arrayList5 = arrayList7;
                                                return new mya(charSequence24, charSequence21, i15, i14, str8, charSequence20, charSequence22, kdcVar7, kdcVar6, arrayList5, charSequence23, uo9Var);
                                            }
                                        }
                                    }
                                    return coroutineSingletons3;
                                }
                            }
                        }
                        return coroutineSingletons5;
                    case 4:
                        i5 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$2;
                        i4 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$1;
                        int i37 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$0;
                        CharSequence charSequence49 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$6;
                        String str12 = (String) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$5;
                        CharSequence charSequence50 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$4;
                        CharSequence charSequence51 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$3;
                        ir9 ir9Var13 = (ir9) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$2;
                        ChargersTaskDiscountDetailsDto chargersTaskDiscountDetailsDto15 = (ChargersTaskDiscountDetailsDto) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$0;
                        kotlin.b.b(obj3);
                        str2 = str12;
                        charSequence4 = charSequence50;
                        chargersTaskDiscountDetailsDto3 = chargersTaskDiscountDetailsDto15;
                        charSequence3 = charSequence49;
                        ir9Var3 = ir9Var13;
                        i6 = i37;
                        charSequence5 = charSequence51;
                        CharSequence charSequence422 = (CharSequence) obj3;
                        FormattedText formattedText52 = chargersTaskDiscountDetailsDto3.j;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$0 = chargersTaskDiscountDetailsDto3;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$1 = null;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$2 = ir9Var3;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$3 = charSequence5;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$4 = charSequence4;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$5 = str2;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$6 = charSequence3;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$7 = charSequence422;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$0 = i6;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$1 = i4;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$2 = i5;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.label = 5;
                        CharSequence charSequence432 = charSequence5;
                        ChargersTaskDiscountDetailsDto chargersTaskDiscountDetailsDto112 = chargersTaskDiscountDetailsDto3;
                        ir9 ir9Var92 = ir9Var3;
                        e = c.e(this.c, formattedText52, null, false, chargersDiscountDetailsMapper$mapTaskDiscountDetails$13, 30);
                        if (e != coroutineSingletons5) {
                        }
                        return coroutineSingletons5;
                    case 5:
                        i5 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$2;
                        i4 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$1;
                        i7 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$0;
                        charSequence6 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$7;
                        charSequence7 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$6;
                        str3 = (String) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$5;
                        charSequence8 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$4;
                        charSequence9 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$3;
                        ir9Var4 = (ir9) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$2;
                        chargersTaskDiscountDetailsDto4 = (ChargersTaskDiscountDetailsDto) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$0;
                        kotlin.b.b(obj3);
                        kdc a3 = eVar.a(chargersTaskDiscountDetailsDto4.l);
                        int i272 = i5;
                        kdc a22 = eVar.a(chargersTaskDiscountDetailsDto4.m);
                        List list2 = chargersTaskDiscountDetailsDto4.i;
                        int i282 = i4;
                        arrayList = new ArrayList(tcc.n(list2, 10));
                        Iterator it32 = list2.iterator();
                        charSequence10 = (CharSequence) obj3;
                        coroutineSingletons = coroutineSingletons5;
                        charSequence11 = charSequence7;
                        str4 = str3;
                        charSequence12 = charSequence8;
                        kdcVar = a3;
                        kdcVar2 = a22;
                        it = it32;
                        chargersTaskDiscountDetailsDto5 = chargersTaskDiscountDetailsDto4;
                        i8 = i272;
                        charSequence13 = charSequence6;
                        i9 = i7;
                        i10 = i282;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 6:
                        int i38 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$2;
                        int i39 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$1;
                        int i40 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$0;
                        ?? r6 = (Collection) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$18;
                        String str13 = (String) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$17;
                        ChargersProgressDiscountDetailsDto.ProgressDiscountPerkDto progressDiscountPerkDto3 = (ChargersProgressDiscountDetailsDto.ProgressDiscountPerkDto) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$16;
                        Iterator it5 = (Iterator) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$14;
                        ?? r11 = (Collection) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$13;
                        kdc kdcVar12 = (kdc) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$10;
                        kdc kdcVar13 = (kdc) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$9;
                        CharSequence charSequence52 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$8;
                        CharSequence charSequence53 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$7;
                        CharSequence charSequence54 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$6;
                        String str14 = (String) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$5;
                        CharSequence charSequence55 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$4;
                        CharSequence charSequence56 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$3;
                        ir9 ir9Var14 = (ir9) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$2;
                        chargersTaskDiscountDetailsDto6 = (ChargersTaskDiscountDetailsDto) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$0;
                        kotlin.b.b(obj3);
                        str4 = str14;
                        i11 = i39;
                        coroutineSingletons2 = coroutineSingletons5;
                        i12 = i40;
                        arrayList2 = r6;
                        arrayList3 = r11;
                        kdcVar3 = kdcVar13;
                        charSequence14 = charSequence52;
                        i13 = i38;
                        ir9Var4 = ir9Var14;
                        charSequence11 = charSequence54;
                        obj = obj3;
                        progressDiscountPerkDto = progressDiscountPerkDto3;
                        it2 = it5;
                        kdcVar4 = kdcVar12;
                        charSequence15 = charSequence53;
                        charSequence9 = charSequence56;
                        str5 = str13;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13;
                        charSequence12 = charSequence55;
                        CharSequence charSequence452 = (CharSequence) obj;
                        FormattedText formattedText72 = progressDiscountPerkDto.c;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$0 = chargersTaskDiscountDetailsDto6;
                        ChargersTaskDiscountDetailsDto chargersTaskDiscountDetailsDto132 = chargersTaskDiscountDetailsDto6;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$1 = null;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$2 = ir9Var4;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$3 = charSequence9;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$4 = charSequence12;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$5 = str4;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$6 = charSequence11;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$7 = charSequence15;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$8 = charSequence14;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$9 = kdcVar3;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$10 = kdcVar4;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$11 = null;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$12 = null;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$13 = arrayList3;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$14 = it2;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$15 = null;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$16 = null;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$17 = str5;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$18 = charSequence452;
                        ArrayList arrayList92 = arrayList2;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.L$19 = arrayList92;
                        str6 = str4;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.I$0 = i12;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.I$1 = i11;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.I$2 = i13;
                        chargersDiscountDetailsMapper$mapTaskDiscountDetails$12.label = 7;
                        ChargersDiscountDetailsMapper$mapTaskDiscountDetails$1 chargersDiscountDetailsMapper$mapTaskDiscountDetails$152 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$12;
                        e2 = c.e(this.c, formattedText72, null, false, chargersDiscountDetailsMapper$mapTaskDiscountDetails$152, 30);
                        coroutineSingletons3 = coroutineSingletons2;
                        if (e2 != coroutineSingletons3) {
                        }
                        return coroutineSingletons3;
                    case 7:
                        int i41 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$2;
                        int i42 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$1;
                        int i43 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$0;
                        collection = (Collection) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$19;
                        charSequence18 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$18;
                        str7 = (String) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$17;
                        Iterator it6 = (Iterator) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$14;
                        ?? r112 = (Collection) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$13;
                        kdcVar5 = (kdc) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$10;
                        kdc kdcVar14 = (kdc) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$9;
                        CharSequence charSequence57 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$8;
                        CharSequence charSequence58 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$7;
                        CharSequence charSequence59 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$6;
                        String str15 = (String) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$5;
                        charSequence16 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$4;
                        charSequence19 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$3;
                        ir9 ir9Var15 = (ir9) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$2;
                        ChargersTaskDiscountDetailsDto chargersTaskDiscountDetailsDto16 = (ChargersTaskDiscountDetailsDto) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$0;
                        kotlin.b.b(obj3);
                        chargersTaskDiscountDetailsDto7 = chargersTaskDiscountDetailsDto16;
                        arrayList = r112;
                        charSequence10 = charSequence57;
                        it2 = it6;
                        kdcVar = kdcVar14;
                        ir9Var4 = ir9Var15;
                        str6 = str15;
                        i12 = i43;
                        i10 = i42;
                        i8 = i41;
                        charSequence17 = charSequence58;
                        coroutineSingletons3 = coroutineSingletons5;
                        charSequence11 = charSequence59;
                        collection.add(new lya(charSequence18, (CharSequence) obj3, str7));
                        kdcVar2 = kdcVar5;
                        it = it2;
                        coroutineSingletons = coroutineSingletons3;
                        charSequence13 = charSequence17;
                        charSequence12 = charSequence16;
                        charSequence9 = charSequence19;
                        chargersTaskDiscountDetailsDto5 = chargersTaskDiscountDetailsDto7;
                        i9 = i12;
                        str4 = str6;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 8:
                        int i44 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$2;
                        i16 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$1;
                        i18 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$0;
                        chargersDiscountDetailsButtonDto = (ChargersDiscountDetailsButtonDto) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$12;
                        ?? r7 = (List) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$11;
                        kdcVar2 = (kdc) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$10;
                        kdcVar = (kdc) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$9;
                        charSequence10 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$8;
                        CharSequence charSequence60 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$7;
                        CharSequence charSequence61 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$6;
                        String str16 = (String) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$5;
                        CharSequence charSequence62 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$4;
                        i17 = i44;
                        CharSequence charSequence63 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$3;
                        ir9 ir9Var16 = (ir9) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$2;
                        kotlin.b.b(obj3);
                        str9 = str16;
                        ir9Var5 = ir9Var16;
                        coroutineSingletons3 = coroutineSingletons5;
                        charSequence25 = charSequence61;
                        obj2 = obj3;
                        charSequence26 = charSequence60;
                        charSequence27 = charSequence62;
                        charSequence9 = charSequence63;
                        arrayList6 = r7;
                        h = (CharSequence) obj2;
                        ir9 ir9Var122 = ir9Var5;
                        i19 = i17;
                        ir9Var6 = ir9Var122;
                        CharSequence charSequence482 = charSequence26;
                        arrayList4 = arrayList6;
                        kdcVar8 = kdcVar2;
                        kdcVar9 = kdcVar;
                        charSequence29 = charSequence10;
                        charSequence30 = charSequence482;
                        charSequence31 = charSequence9;
                        coroutineSingletons4 = coroutineSingletons3;
                        charSequence32 = charSequence25;
                        charSequence28 = charSequence27;
                        str10 = str9;
                        if (i18 != 0) {
                        }
                        boolean z22 = chargersDiscountDetailsButtonDto.c;
                        uj9 uj9Var22 = jr9.a;
                        if (i18 == 0) {
                        }
                        charSequence20 = charSequence34;
                        i14 = i21;
                        uo9Var = new uo9(h, charSequence33, z22, uj9Var22, true, null, false, false, 224);
                        str8 = str10;
                        i15 = i20;
                        charSequence21 = charSequence28;
                        kdcVar6 = kdcVar10;
                        kdcVar7 = kdcVar11;
                        charSequence23 = charSequence36;
                        charSequence24 = charSequence35;
                        charSequence22 = charSequence37;
                        arrayList5 = arrayList7;
                        return new mya(charSequence24, charSequence21, i15, i14, str8, charSequence20, charSequence22, kdcVar7, kdcVar6, arrayList5, charSequence23, uo9Var);
                    case 9:
                        int i45 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$2;
                        int i46 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$1;
                        int i47 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.I$0;
                        h = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$13;
                        ChargersDiscountDetailsButtonDto chargersDiscountDetailsButtonDto3 = (ChargersDiscountDetailsButtonDto) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$12;
                        ?? r62 = (List) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$11;
                        kdcVar8 = (kdc) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$10;
                        kdcVar9 = (kdc) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$9;
                        charSequence29 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$8;
                        charSequence30 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$7;
                        charSequence32 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$6;
                        str10 = (String) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$5;
                        CharSequence charSequence64 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$4;
                        CharSequence charSequence65 = (CharSequence) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$3;
                        ir9 ir9Var17 = (ir9) chargersDiscountDetailsMapper$mapTaskDiscountDetails$13.L$2;
                        kotlin.b.b(obj3);
                        ir9Var6 = ir9Var17;
                        charSequence38 = charSequence65;
                        charSequence28 = charSequence64;
                        arrayList4 = r62;
                        chargersDiscountDetailsButtonDto = chargersDiscountDetailsButtonDto3;
                        i18 = i47;
                        i16 = i46;
                        i22 = i45;
                        kdcVar10 = kdcVar8;
                        kdcVar11 = kdcVar9;
                        charSequence35 = charSequence38;
                        charSequence36 = charSequence29;
                        charSequence37 = charSequence30;
                        arrayList7 = arrayList4;
                        i20 = i16;
                        i21 = i22;
                        charSequence34 = charSequence32;
                        charSequence33 = (CharSequence) obj3;
                        boolean z222 = chargersDiscountDetailsButtonDto.c;
                        uj9 uj9Var222 = jr9.a;
                        if (i18 == 0) {
                        }
                        charSequence20 = charSequence34;
                        i14 = i21;
                        uo9Var = new uo9(h, charSequence33, z222, uj9Var222, true, null, false, false, 224);
                        str8 = str10;
                        i15 = i20;
                        charSequence21 = charSequence28;
                        kdcVar6 = kdcVar10;
                        kdcVar7 = kdcVar11;
                        charSequence23 = charSequence36;
                        charSequence24 = charSequence35;
                        charSequence22 = charSequence37;
                        arrayList5 = arrayList7;
                        return new mya(charSequence24, charSequence21, i15, i14, str8, charSequence20, charSequence22, kdcVar7, kdcVar6, arrayList5, charSequence23, uo9Var);
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        chargersDiscountDetailsMapper$mapTaskDiscountDetails$1 = new ChargersDiscountDetailsMapper$mapTaskDiscountDetails$1(this, continuationImpl);
        ChargersDiscountDetailsMapper$mapTaskDiscountDetails$1 chargersDiscountDetailsMapper$mapTaskDiscountDetails$132 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$1;
        Object obj32 = chargersDiscountDetailsMapper$mapTaskDiscountDetails$132.result;
        CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDiscountDetailsMapper$mapTaskDiscountDetails$132.label;
        e eVar2 = this.b;
        switch (i) {
        }
    }
}
