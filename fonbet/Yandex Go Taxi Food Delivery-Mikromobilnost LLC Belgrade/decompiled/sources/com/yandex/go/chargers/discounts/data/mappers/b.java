package com.yandex.go.chargers.discounts.data.mappers;

import com.yandex.go.chargers.data.model.ChargersAttributeDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountTypeDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersProgressImageParamsDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsItemDto$PartnerPromoItemDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsItemDto$ProgressDiscountItemDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsItemDto$RentalPromoItemDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsItemDto$TaskDiscountItemDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsToggleDto;
import com.yandex.go.chargers.discounts.data.models.a0;
import com.yandex.go.chargers.discounts.data.models.z;
import defpackage.ir9;
import defpackage.jl40;
import defpackage.kdc;
import defpackage.lna;
import defpackage.nu9;
import defpackage.ny61;
import defpackage.ou9;
import defpackage.ow9;
import defpackage.pu9;
import defpackage.qu9;
import defpackage.ru9;
import defpackage.su9;
import defpackage.tn9;
import defpackage.w511;
import defpackage.yfa;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class b {
    public final e a;
    public final c b;
    public final com.yandex.go.chargers.domain.mapper.a c;
    public final yfa d;

    public b(e eVar, c cVar, com.yandex.go.chargers.domain.mapper.a aVar, yfa yfaVar) {
        this.a = eVar;
        this.b = cVar;
        this.c = aVar;
        this.d = yfaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x03e1, code lost:
    
        if (r3 == r4) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x048f, code lost:
    
        if (r3 == r4) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x04bb, code lost:
    
        if (r3 == r4) goto L179;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(a0 a0Var, ow9 ow9Var, ContinuationImpl continuationImpl) {
        ChargersDiscountsItemMapper$map$1 chargersDiscountsItemMapper$map$1;
        int i;
        ir9 ir9Var;
        int i2;
        ir9 ir9Var2;
        ir9 ir9Var3;
        int i3;
        ir9 ir9Var4;
        String str;
        Object e;
        a0 a0Var2;
        int i4;
        CharSequence charSequence;
        Object e2;
        CharSequence charSequence2;
        CharSequence charSequence3;
        ir9 ir9Var5;
        String str2;
        a0 a0Var3;
        CharSequence charSequence4;
        ir9 ir9Var6;
        a0 a0Var4;
        qu9 qu9Var;
        CharSequence charSequence5;
        String str3;
        CharSequence charSequence6;
        CharSequence charSequence7;
        Object e3;
        a0 a0Var5;
        CharSequence charSequence8;
        ir9 ir9Var7;
        String str4;
        CharSequence charSequence9;
        int i5;
        CharSequence charSequence10;
        ir9 ir9Var8;
        a0 a0Var6;
        CharSequence charSequence11;
        CharSequence charSequence12;
        CharSequence charSequence13;
        ir9 ir9Var9;
        a0 a0Var7;
        int i6;
        lna l;
        lna l2;
        int i7;
        ChargersAttributeDto chargersAttributeDto;
        lna lnaVar;
        a0 a0Var8;
        int i8;
        tn9 tn9Var;
        CharSequence charSequence14;
        ir9 ir9Var10;
        lna lnaVar2;
        CharSequence charSequence15;
        kdc a;
        CharSequence charSequence16;
        ir9 ir9Var11;
        a0 a0Var9;
        int i9;
        int i10;
        tn9 tn9Var2;
        lna lnaVar3;
        lna lnaVar4;
        kdc kdcVar;
        CharSequence charSequence17;
        ou9 ou9Var;
        ChargersDiscountsItemDto$ProgressDiscountItemDto.DiscountAttentionDto discountAttentionDto;
        a0 a0Var10;
        int i11;
        int i12;
        tn9 tn9Var3;
        lna lnaVar5;
        lna lnaVar6;
        kdc kdcVar2;
        CharSequence charSequence18;
        CharSequence charSequence19;
        ir9 ir9Var12;
        ir9 ir9Var13;
        CharSequence charSequence20;
        a0 a0Var11;
        Object t;
        CharSequence charSequence21;
        ir9 ir9Var14;
        CharSequence charSequence22;
        CharSequence charSequence23;
        Object t2;
        String str5;
        a0 a0Var12;
        int i13;
        int i14;
        kdc kdcVar3;
        a0 a0Var13 = a0Var;
        if (continuationImpl instanceof ChargersDiscountsItemMapper$map$1) {
            chargersDiscountsItemMapper$map$1 = (ChargersDiscountsItemMapper$map$1) continuationImpl;
            int i15 = chargersDiscountsItemMapper$map$1.label;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                chargersDiscountsItemMapper$map$1.label = i15 - Integer.MIN_VALUE;
                ChargersDiscountsItemMapper$map$1 chargersDiscountsItemMapper$map$12 = chargersDiscountsItemMapper$map$1;
                Object obj = chargersDiscountsItemMapper$map$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDiscountsItemMapper$map$12.label;
                e eVar = this.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        if (a0Var13 instanceof ChargersDiscountsItemDto$RentalPromoItemDto) {
                            String str6 = ow9Var != null ? ow9Var.b : null;
                            ChargersDiscountsItemDto$RentalPromoItemDto chargersDiscountsItemDto$RentalPromoItemDto = (ChargersDiscountsItemDto$RentalPromoItemDto) a0Var13;
                            ChargersDiscountDto chargersDiscountDto = chargersDiscountsItemDto$RentalPromoItemDto.a;
                            String str7 = chargersDiscountDto.b;
                            ChargersDiscountTypeDto chargersDiscountTypeDto = chargersDiscountDto.a;
                            i3 = (jl40.l(str6, str7) && ow9Var.a == chargersDiscountTypeDto) ? 1 : 0;
                            ChargersDiscountsToggleDto chargersDiscountsToggleDto = chargersDiscountsItemDto$RentalPromoItemDto.f;
                            ir9 ir9Var15 = new ir9(chargersDiscountTypeDto, chargersDiscountDto.b, chargersDiscountsToggleDto != null ? chargersDiscountsToggleDto.c : null);
                            String str8 = chargersDiscountsItemDto$RentalPromoItemDto.b;
                            FormattedText formattedText = chargersDiscountsItemDto$RentalPromoItemDto.c;
                            chargersDiscountsItemMapper$map$12.L$0 = a0Var13;
                            chargersDiscountsItemMapper$map$12.L$1 = null;
                            chargersDiscountsItemMapper$map$12.L$2 = ir9Var15;
                            chargersDiscountsItemMapper$map$12.L$3 = str8;
                            chargersDiscountsItemMapper$map$12.I$0 = i3;
                            chargersDiscountsItemMapper$map$12.label = 1;
                            Object e4 = c.e(this.b, formattedText, null, false, chargersDiscountsItemMapper$map$12, 30);
                            if (e4 != coroutineSingletons) {
                                ir9Var4 = ir9Var15;
                                str = str8;
                                obj = e4;
                                CharSequence charSequence24 = (CharSequence) obj;
                                FormattedText formattedText2 = ((ChargersDiscountsItemDto$RentalPromoItemDto) a0Var13).d;
                                chargersDiscountsItemMapper$map$12.L$0 = a0Var13;
                                chargersDiscountsItemMapper$map$12.L$1 = null;
                                chargersDiscountsItemMapper$map$12.L$2 = ir9Var4;
                                chargersDiscountsItemMapper$map$12.L$3 = str;
                                chargersDiscountsItemMapper$map$12.L$4 = charSequence24;
                                chargersDiscountsItemMapper$map$12.I$0 = i3;
                                chargersDiscountsItemMapper$map$12.label = 2;
                                e = c.e(this.b, formattedText2, null, false, chargersDiscountsItemMapper$map$12, 30);
                                if (e != coroutineSingletons) {
                                    a0Var2 = a0Var13;
                                    i4 = i3;
                                    charSequence = charSequence24;
                                    obj = e;
                                    CharSequence charSequence25 = (CharSequence) obj;
                                    FormattedText formattedText3 = ((ChargersDiscountsItemDto$RentalPromoItemDto) a0Var2).e;
                                    chargersDiscountsItemMapper$map$12.L$0 = a0Var2;
                                    chargersDiscountsItemMapper$map$12.L$1 = null;
                                    chargersDiscountsItemMapper$map$12.L$2 = ir9Var4;
                                    chargersDiscountsItemMapper$map$12.L$3 = str;
                                    chargersDiscountsItemMapper$map$12.L$4 = charSequence;
                                    chargersDiscountsItemMapper$map$12.L$5 = charSequence25;
                                    chargersDiscountsItemMapper$map$12.I$0 = i4;
                                    chargersDiscountsItemMapper$map$12.label = 3;
                                    a0 a0Var14 = a0Var2;
                                    e2 = c.e(this.b, formattedText3, null, false, chargersDiscountsItemMapper$map$12, 30);
                                    if (e2 != coroutineSingletons) {
                                        String str9 = str;
                                        charSequence2 = charSequence;
                                        charSequence3 = charSequence25;
                                        obj = e2;
                                        ir9Var5 = ir9Var4;
                                        str2 = str9;
                                        a0Var3 = a0Var14;
                                        CharSequence charSequence26 = (CharSequence) obj;
                                        ChargersDiscountsItemDto$RentalPromoItemDto chargersDiscountsItemDto$RentalPromoItemDto2 = (ChargersDiscountsItemDto$RentalPromoItemDto) a0Var3;
                                        ChargersDiscountsToggleDto chargersDiscountsToggleDto2 = chargersDiscountsItemDto$RentalPromoItemDto2.f;
                                        qu9 qu9Var2 = new qu9(chargersDiscountsToggleDto2 == null ? chargersDiscountsToggleDto2.a : false, i4 != 0, chargersDiscountsToggleDto2 == null ? chargersDiscountsToggleDto2.c : null);
                                        c cVar = this.b;
                                        if (i4 == 0) {
                                            FormattedText formattedText4 = chargersDiscountsItemDto$RentalPromoItemDto2.h;
                                            chargersDiscountsItemMapper$map$12.L$0 = a0Var3;
                                            chargersDiscountsItemMapper$map$12.L$1 = null;
                                            chargersDiscountsItemMapper$map$12.L$2 = ir9Var5;
                                            chargersDiscountsItemMapper$map$12.L$3 = str2;
                                            chargersDiscountsItemMapper$map$12.L$4 = charSequence2;
                                            chargersDiscountsItemMapper$map$12.L$5 = charSequence3;
                                            chargersDiscountsItemMapper$map$12.L$6 = charSequence26;
                                            chargersDiscountsItemMapper$map$12.L$7 = qu9Var2;
                                            chargersDiscountsItemMapper$map$12.I$0 = i4;
                                            chargersDiscountsItemMapper$map$12.label = 4;
                                            a0 a0Var15 = a0Var3;
                                            ir9 ir9Var16 = ir9Var5;
                                            Object e5 = c.e(cVar, formattedText4, null, false, chargersDiscountsItemMapper$map$12, 30);
                                            if (e5 != coroutineSingletons) {
                                                obj = e5;
                                                charSequence4 = charSequence26;
                                                ir9Var6 = ir9Var16;
                                                a0Var4 = a0Var15;
                                                qu9Var = qu9Var2;
                                                charSequence5 = charSequence2;
                                                str3 = str2;
                                                charSequence6 = (CharSequence) obj;
                                                return new ru9(ir9Var6, str3, charSequence5, charSequence3, charSequence4, qu9Var, charSequence6, ((ChargersDiscountsItemDto$RentalPromoItemDto) a0Var4).i);
                                            }
                                        } else {
                                            ir9 ir9Var17 = ir9Var5;
                                            a0 a0Var16 = a0Var3;
                                            FormattedText formattedText5 = chargersDiscountsItemDto$RentalPromoItemDto2.g;
                                            chargersDiscountsItemMapper$map$12.L$0 = a0Var16;
                                            chargersDiscountsItemMapper$map$12.L$1 = null;
                                            chargersDiscountsItemMapper$map$12.L$2 = ir9Var17;
                                            chargersDiscountsItemMapper$map$12.L$3 = str2;
                                            chargersDiscountsItemMapper$map$12.L$4 = charSequence2;
                                            chargersDiscountsItemMapper$map$12.L$5 = charSequence3;
                                            chargersDiscountsItemMapper$map$12.L$6 = charSequence26;
                                            chargersDiscountsItemMapper$map$12.L$7 = qu9Var2;
                                            chargersDiscountsItemMapper$map$12.I$0 = i4;
                                            chargersDiscountsItemMapper$map$12.label = 5;
                                            Object e6 = c.e(cVar, formattedText5, null, false, chargersDiscountsItemMapper$map$12, 30);
                                            if (e6 != coroutineSingletons) {
                                                obj = e6;
                                                charSequence4 = charSequence26;
                                                ir9Var6 = ir9Var17;
                                                a0Var4 = a0Var16;
                                                qu9Var = qu9Var2;
                                                charSequence5 = charSequence2;
                                                str3 = str2;
                                                charSequence6 = (CharSequence) obj;
                                                return new ru9(ir9Var6, str3, charSequence5, charSequence3, charSequence4, qu9Var, charSequence6, ((ChargersDiscountsItemDto$RentalPromoItemDto) a0Var4).i);
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (a0Var13 instanceof ChargersDiscountsItemDto$PartnerPromoItemDto) {
                            ChargersDiscountsItemDto$PartnerPromoItemDto chargersDiscountsItemDto$PartnerPromoItemDto = (ChargersDiscountsItemDto$PartnerPromoItemDto) a0Var13;
                            ChargersDiscountDto chargersDiscountDto2 = chargersDiscountsItemDto$PartnerPromoItemDto.a;
                            ir9Var3 = new ir9(chargersDiscountDto2.a, chargersDiscountDto2.b, null);
                            FormattedText formattedText6 = chargersDiscountsItemDto$PartnerPromoItemDto.c;
                            chargersDiscountsItemMapper$map$12.L$0 = a0Var13;
                            chargersDiscountsItemMapper$map$12.L$1 = null;
                            chargersDiscountsItemMapper$map$12.L$2 = ir9Var3;
                            chargersDiscountsItemMapper$map$12.label = 6;
                            obj = c.e(this.b, formattedText6, null, false, chargersDiscountsItemMapper$map$12, 30);
                            break;
                        } else if (a0Var13 instanceof ChargersDiscountsItemDto$ProgressDiscountItemDto) {
                            String str10 = ow9Var != null ? ow9Var.b : null;
                            ChargersDiscountsItemDto$ProgressDiscountItemDto chargersDiscountsItemDto$ProgressDiscountItemDto = (ChargersDiscountsItemDto$ProgressDiscountItemDto) a0Var13;
                            ChargersDiscountDto chargersDiscountDto3 = chargersDiscountsItemDto$ProgressDiscountItemDto.a;
                            String str11 = chargersDiscountDto3.b;
                            ChargersDiscountTypeDto chargersDiscountTypeDto2 = chargersDiscountDto3.a;
                            i2 = (jl40.l(str10, str11) && ow9Var.a == chargersDiscountTypeDto2) ? 1 : 0;
                            ir9Var2 = new ir9(chargersDiscountTypeDto2, chargersDiscountDto3.b, null);
                            c cVar2 = this.b;
                            if (i2 == 0) {
                                FormattedText formattedText7 = chargersDiscountsItemDto$ProgressDiscountItemDto.c.a;
                                chargersDiscountsItemMapper$map$12.L$0 = a0Var13;
                                chargersDiscountsItemMapper$map$12.L$1 = null;
                                chargersDiscountsItemMapper$map$12.L$2 = null;
                                chargersDiscountsItemMapper$map$12.L$3 = ir9Var2;
                                chargersDiscountsItemMapper$map$12.I$0 = i2;
                                chargersDiscountsItemMapper$map$12.label = 10;
                                obj = c.e(cVar2, formattedText7, null, false, chargersDiscountsItemMapper$map$12, 30);
                                break;
                            } else {
                                FormattedText formattedText8 = chargersDiscountsItemDto$ProgressDiscountItemDto.b.a;
                                chargersDiscountsItemMapper$map$12.L$0 = a0Var13;
                                chargersDiscountsItemMapper$map$12.L$1 = null;
                                chargersDiscountsItemMapper$map$12.L$2 = null;
                                chargersDiscountsItemMapper$map$12.L$3 = ir9Var2;
                                chargersDiscountsItemMapper$map$12.I$0 = i2;
                                chargersDiscountsItemMapper$map$12.label = 9;
                                obj = c.e(cVar2, formattedText8, null, false, chargersDiscountsItemMapper$map$12, 30);
                                break;
                            }
                        } else {
                            if (!(a0Var13 instanceof ChargersDiscountsItemDto$TaskDiscountItemDto)) {
                                if (a0Var13 instanceof z) {
                                    return null;
                                }
                                w511.b();
                                return null;
                            }
                            ChargersDiscountsItemDto$TaskDiscountItemDto chargersDiscountsItemDto$TaskDiscountItemDto = (ChargersDiscountsItemDto$TaskDiscountItemDto) a0Var13;
                            ChargersDiscountDto chargersDiscountDto4 = chargersDiscountsItemDto$TaskDiscountItemDto.a;
                            ir9 ir9Var18 = new ir9(chargersDiscountDto4.a, chargersDiscountDto4.b, null);
                            FormattedText formattedText9 = chargersDiscountsItemDto$TaskDiscountItemDto.d;
                            chargersDiscountsItemMapper$map$12.L$0 = a0Var13;
                            chargersDiscountsItemMapper$map$12.L$1 = null;
                            chargersDiscountsItemMapper$map$12.L$2 = ir9Var18;
                            chargersDiscountsItemMapper$map$12.label = 15;
                            Object t3 = eVar.t(formattedText9, chargersDiscountsItemMapper$map$12);
                            if (t3 != coroutineSingletons) {
                                obj = t3;
                                ir9Var = ir9Var18;
                                CharSequence charSequence27 = (CharSequence) obj;
                                FormattedText formattedText10 = ((ChargersDiscountsItemDto$TaskDiscountItemDto) a0Var13).e;
                                chargersDiscountsItemMapper$map$12.L$0 = a0Var13;
                                chargersDiscountsItemMapper$map$12.L$1 = null;
                                chargersDiscountsItemMapper$map$12.L$2 = ir9Var;
                                chargersDiscountsItemMapper$map$12.L$3 = charSequence27;
                                chargersDiscountsItemMapper$map$12.label = 16;
                                obj = eVar.t(formattedText10, chargersDiscountsItemMapper$map$12);
                                if (obj != coroutineSingletons) {
                                    a0 a0Var17 = a0Var13;
                                    ir9Var13 = ir9Var;
                                    charSequence20 = charSequence27;
                                    a0Var11 = a0Var17;
                                    CharSequence charSequence28 = (CharSequence) obj;
                                    FormattedText formattedText11 = ((ChargersDiscountsItemDto$TaskDiscountItemDto) a0Var11).f;
                                    chargersDiscountsItemMapper$map$12.L$0 = a0Var11;
                                    chargersDiscountsItemMapper$map$12.L$1 = null;
                                    chargersDiscountsItemMapper$map$12.L$2 = ir9Var13;
                                    chargersDiscountsItemMapper$map$12.L$3 = charSequence20;
                                    chargersDiscountsItemMapper$map$12.L$4 = charSequence28;
                                    chargersDiscountsItemMapper$map$12.label = 17;
                                    t = eVar.t(formattedText11, chargersDiscountsItemMapper$map$12);
                                    if (t != coroutineSingletons) {
                                        charSequence21 = charSequence20;
                                        ir9Var14 = ir9Var13;
                                        charSequence22 = charSequence28;
                                        obj = t;
                                        charSequence23 = (CharSequence) obj;
                                        ChargersDiscountsItemDto$TaskDiscountItemDto chargersDiscountsItemDto$TaskDiscountItemDto2 = (ChargersDiscountsItemDto$TaskDiscountItemDto) a0Var11;
                                        String str12 = chargersDiscountsItemDto$TaskDiscountItemDto2.c;
                                        int i16 = chargersDiscountsItemDto$TaskDiscountItemDto2.g;
                                        int i17 = chargersDiscountsItemDto$TaskDiscountItemDto2.h;
                                        kdc a2 = eVar.a(chargersDiscountsItemDto$TaskDiscountItemDto2.b);
                                        FormattedText formattedText12 = chargersDiscountsItemDto$TaskDiscountItemDto2.i;
                                        chargersDiscountsItemMapper$map$12.L$0 = a0Var11;
                                        chargersDiscountsItemMapper$map$12.L$1 = null;
                                        chargersDiscountsItemMapper$map$12.L$2 = ir9Var14;
                                        chargersDiscountsItemMapper$map$12.L$3 = charSequence21;
                                        chargersDiscountsItemMapper$map$12.L$4 = charSequence22;
                                        chargersDiscountsItemMapper$map$12.L$5 = charSequence23;
                                        chargersDiscountsItemMapper$map$12.L$6 = str12;
                                        chargersDiscountsItemMapper$map$12.L$7 = a2;
                                        chargersDiscountsItemMapper$map$12.I$0 = i16;
                                        chargersDiscountsItemMapper$map$12.I$1 = i17;
                                        chargersDiscountsItemMapper$map$12.label = 18;
                                        t2 = eVar.t(formattedText12, chargersDiscountsItemMapper$map$12);
                                        if (t2 != coroutineSingletons) {
                                            str5 = str12;
                                            a0Var12 = a0Var11;
                                            i13 = i16;
                                            i14 = i17;
                                            kdcVar3 = a2;
                                            obj = t2;
                                            ChargersDiscountsItemDto$TaskDiscountItemDto chargersDiscountsItemDto$TaskDiscountItemDto3 = (ChargersDiscountsItemDto$TaskDiscountItemDto) a0Var12;
                                            return new su9(ir9Var14, charSequence21, charSequence22, i13, str5, i14, kdcVar3, charSequence23, (CharSequence) obj, eVar.a(chargersDiscountsItemDto$TaskDiscountItemDto3.j), eVar.a(chargersDiscountsItemDto$TaskDiscountItemDto3.k), chargersDiscountsItemDto$TaskDiscountItemDto3.l);
                                        }
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        int i18 = chargersDiscountsItemMapper$map$12.I$0;
                        String str13 = (String) chargersDiscountsItemMapper$map$12.L$3;
                        ir9 ir9Var19 = (ir9) chargersDiscountsItemMapper$map$12.L$2;
                        a0 a0Var18 = (a0) chargersDiscountsItemMapper$map$12.L$0;
                        kotlin.b.b(obj);
                        str = str13;
                        ir9Var4 = ir9Var19;
                        i3 = i18;
                        a0Var13 = a0Var18;
                        CharSequence charSequence242 = (CharSequence) obj;
                        FormattedText formattedText22 = ((ChargersDiscountsItemDto$RentalPromoItemDto) a0Var13).d;
                        chargersDiscountsItemMapper$map$12.L$0 = a0Var13;
                        chargersDiscountsItemMapper$map$12.L$1 = null;
                        chargersDiscountsItemMapper$map$12.L$2 = ir9Var4;
                        chargersDiscountsItemMapper$map$12.L$3 = str;
                        chargersDiscountsItemMapper$map$12.L$4 = charSequence242;
                        chargersDiscountsItemMapper$map$12.I$0 = i3;
                        chargersDiscountsItemMapper$map$12.label = 2;
                        e = c.e(this.b, formattedText22, null, false, chargersDiscountsItemMapper$map$12, 30);
                        if (e != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 2:
                        i4 = chargersDiscountsItemMapper$map$12.I$0;
                        charSequence = (CharSequence) chargersDiscountsItemMapper$map$12.L$4;
                        String str14 = (String) chargersDiscountsItemMapper$map$12.L$3;
                        ir9 ir9Var20 = (ir9) chargersDiscountsItemMapper$map$12.L$2;
                        a0 a0Var19 = (a0) chargersDiscountsItemMapper$map$12.L$0;
                        kotlin.b.b(obj);
                        str = str14;
                        ir9Var4 = ir9Var20;
                        a0Var2 = a0Var19;
                        CharSequence charSequence252 = (CharSequence) obj;
                        FormattedText formattedText32 = ((ChargersDiscountsItemDto$RentalPromoItemDto) a0Var2).e;
                        chargersDiscountsItemMapper$map$12.L$0 = a0Var2;
                        chargersDiscountsItemMapper$map$12.L$1 = null;
                        chargersDiscountsItemMapper$map$12.L$2 = ir9Var4;
                        chargersDiscountsItemMapper$map$12.L$3 = str;
                        chargersDiscountsItemMapper$map$12.L$4 = charSequence;
                        chargersDiscountsItemMapper$map$12.L$5 = charSequence252;
                        chargersDiscountsItemMapper$map$12.I$0 = i4;
                        chargersDiscountsItemMapper$map$12.label = 3;
                        a0 a0Var142 = a0Var2;
                        e2 = c.e(this.b, formattedText32, null, false, chargersDiscountsItemMapper$map$12, 30);
                        if (e2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 3:
                        i4 = chargersDiscountsItemMapper$map$12.I$0;
                        charSequence3 = (CharSequence) chargersDiscountsItemMapper$map$12.L$5;
                        CharSequence charSequence29 = (CharSequence) chargersDiscountsItemMapper$map$12.L$4;
                        String str15 = (String) chargersDiscountsItemMapper$map$12.L$3;
                        ir9 ir9Var21 = (ir9) chargersDiscountsItemMapper$map$12.L$2;
                        a0 a0Var20 = (a0) chargersDiscountsItemMapper$map$12.L$0;
                        kotlin.b.b(obj);
                        charSequence2 = charSequence29;
                        str2 = str15;
                        ir9Var5 = ir9Var21;
                        a0Var3 = a0Var20;
                        CharSequence charSequence262 = (CharSequence) obj;
                        ChargersDiscountsItemDto$RentalPromoItemDto chargersDiscountsItemDto$RentalPromoItemDto22 = (ChargersDiscountsItemDto$RentalPromoItemDto) a0Var3;
                        ChargersDiscountsToggleDto chargersDiscountsToggleDto22 = chargersDiscountsItemDto$RentalPromoItemDto22.f;
                        qu9 qu9Var22 = new qu9(chargersDiscountsToggleDto22 == null ? chargersDiscountsToggleDto22.a : false, i4 != 0, chargersDiscountsToggleDto22 == null ? chargersDiscountsToggleDto22.c : null);
                        c cVar3 = this.b;
                        if (i4 == 0) {
                        }
                        return coroutineSingletons;
                    case 4:
                        qu9Var = (qu9) chargersDiscountsItemMapper$map$12.L$7;
                        charSequence4 = (CharSequence) chargersDiscountsItemMapper$map$12.L$6;
                        charSequence3 = (CharSequence) chargersDiscountsItemMapper$map$12.L$5;
                        charSequence5 = (CharSequence) chargersDiscountsItemMapper$map$12.L$4;
                        str3 = (String) chargersDiscountsItemMapper$map$12.L$3;
                        ir9Var6 = (ir9) chargersDiscountsItemMapper$map$12.L$2;
                        a0Var4 = (a0) chargersDiscountsItemMapper$map$12.L$0;
                        kotlin.b.b(obj);
                        charSequence6 = (CharSequence) obj;
                        return new ru9(ir9Var6, str3, charSequence5, charSequence3, charSequence4, qu9Var, charSequence6, ((ChargersDiscountsItemDto$RentalPromoItemDto) a0Var4).i);
                    case 5:
                        qu9Var = (qu9) chargersDiscountsItemMapper$map$12.L$7;
                        charSequence4 = (CharSequence) chargersDiscountsItemMapper$map$12.L$6;
                        charSequence3 = (CharSequence) chargersDiscountsItemMapper$map$12.L$5;
                        charSequence5 = (CharSequence) chargersDiscountsItemMapper$map$12.L$4;
                        str3 = (String) chargersDiscountsItemMapper$map$12.L$3;
                        ir9Var6 = (ir9) chargersDiscountsItemMapper$map$12.L$2;
                        a0Var4 = (a0) chargersDiscountsItemMapper$map$12.L$0;
                        kotlin.b.b(obj);
                        charSequence6 = (CharSequence) obj;
                        return new ru9(ir9Var6, str3, charSequence5, charSequence3, charSequence4, qu9Var, charSequence6, ((ChargersDiscountsItemDto$RentalPromoItemDto) a0Var4).i);
                    case 6:
                        ir9 ir9Var22 = (ir9) chargersDiscountsItemMapper$map$12.L$2;
                        a0 a0Var21 = (a0) chargersDiscountsItemMapper$map$12.L$0;
                        kotlin.b.b(obj);
                        ir9Var3 = ir9Var22;
                        a0Var13 = a0Var21;
                        CharSequence charSequence30 = (CharSequence) obj;
                        FormattedText formattedText13 = ((ChargersDiscountsItemDto$PartnerPromoItemDto) a0Var13).d;
                        chargersDiscountsItemMapper$map$12.L$0 = a0Var13;
                        chargersDiscountsItemMapper$map$12.L$1 = null;
                        chargersDiscountsItemMapper$map$12.L$2 = ir9Var3;
                        chargersDiscountsItemMapper$map$12.L$3 = charSequence30;
                        chargersDiscountsItemMapper$map$12.label = 7;
                        Object e7 = c.e(this.b, formattedText13, null, false, chargersDiscountsItemMapper$map$12, 30);
                        if (e7 != coroutineSingletons) {
                            obj = e7;
                            charSequence7 = charSequence30;
                            CharSequence charSequence31 = (CharSequence) obj;
                            ChargersDiscountsItemDto$PartnerPromoItemDto chargersDiscountsItemDto$PartnerPromoItemDto2 = (ChargersDiscountsItemDto$PartnerPromoItemDto) a0Var13;
                            String str16 = chargersDiscountsItemDto$PartnerPromoItemDto2.b;
                            FormattedText formattedText14 = chargersDiscountsItemDto$PartnerPromoItemDto2.e;
                            chargersDiscountsItemMapper$map$12.L$0 = a0Var13;
                            chargersDiscountsItemMapper$map$12.L$1 = null;
                            chargersDiscountsItemMapper$map$12.L$2 = ir9Var3;
                            chargersDiscountsItemMapper$map$12.L$3 = charSequence7;
                            chargersDiscountsItemMapper$map$12.L$4 = charSequence31;
                            chargersDiscountsItemMapper$map$12.L$5 = str16;
                            chargersDiscountsItemMapper$map$12.label = 8;
                            e3 = c.e(this.b, formattedText14, null, false, chargersDiscountsItemMapper$map$12, 30);
                            if (e3 != coroutineSingletons) {
                                a0Var5 = a0Var13;
                                charSequence8 = charSequence31;
                                ir9Var7 = ir9Var3;
                                str4 = str16;
                                obj = e3;
                                return new nu9(ir9Var7, str4, charSequence7, charSequence8, (CharSequence) obj, ((ChargersDiscountsItemDto$PartnerPromoItemDto) a0Var5).f);
                            }
                        }
                        return coroutineSingletons;
                    case 7:
                        CharSequence charSequence32 = (CharSequence) chargersDiscountsItemMapper$map$12.L$3;
                        ir9 ir9Var23 = (ir9) chargersDiscountsItemMapper$map$12.L$2;
                        a0 a0Var22 = (a0) chargersDiscountsItemMapper$map$12.L$0;
                        kotlin.b.b(obj);
                        ir9Var3 = ir9Var23;
                        charSequence7 = charSequence32;
                        a0Var13 = a0Var22;
                        CharSequence charSequence312 = (CharSequence) obj;
                        ChargersDiscountsItemDto$PartnerPromoItemDto chargersDiscountsItemDto$PartnerPromoItemDto22 = (ChargersDiscountsItemDto$PartnerPromoItemDto) a0Var13;
                        String str162 = chargersDiscountsItemDto$PartnerPromoItemDto22.b;
                        FormattedText formattedText142 = chargersDiscountsItemDto$PartnerPromoItemDto22.e;
                        chargersDiscountsItemMapper$map$12.L$0 = a0Var13;
                        chargersDiscountsItemMapper$map$12.L$1 = null;
                        chargersDiscountsItemMapper$map$12.L$2 = ir9Var3;
                        chargersDiscountsItemMapper$map$12.L$3 = charSequence7;
                        chargersDiscountsItemMapper$map$12.L$4 = charSequence312;
                        chargersDiscountsItemMapper$map$12.L$5 = str162;
                        chargersDiscountsItemMapper$map$12.label = 8;
                        e3 = c.e(this.b, formattedText142, null, false, chargersDiscountsItemMapper$map$12, 30);
                        if (e3 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 8:
                        String str17 = (String) chargersDiscountsItemMapper$map$12.L$5;
                        CharSequence charSequence33 = (CharSequence) chargersDiscountsItemMapper$map$12.L$4;
                        charSequence7 = (CharSequence) chargersDiscountsItemMapper$map$12.L$3;
                        ir9 ir9Var24 = (ir9) chargersDiscountsItemMapper$map$12.L$2;
                        a0Var5 = (a0) chargersDiscountsItemMapper$map$12.L$0;
                        kotlin.b.b(obj);
                        str4 = str17;
                        charSequence8 = charSequence33;
                        ir9Var7 = ir9Var24;
                        return new nu9(ir9Var7, str4, charSequence7, charSequence8, (CharSequence) obj, ((ChargersDiscountsItemDto$PartnerPromoItemDto) a0Var5).f);
                    case 9:
                        int i19 = chargersDiscountsItemMapper$map$12.I$0;
                        ir9Var2 = (ir9) chargersDiscountsItemMapper$map$12.L$3;
                        a0 a0Var23 = (a0) chargersDiscountsItemMapper$map$12.L$0;
                        kotlin.b.b(obj);
                        i2 = i19;
                        a0Var13 = a0Var23;
                        charSequence9 = (CharSequence) obj;
                        int i20 = i2;
                        a0 a0Var24 = a0Var13;
                        i5 = i20;
                        CharSequence charSequence34 = charSequence9;
                        ir9 ir9Var25 = ir9Var2;
                        charSequence10 = charSequence34;
                        c cVar4 = this.b;
                        if (i5 == 0) {
                            FormattedText formattedText15 = ((ChargersDiscountsItemDto$ProgressDiscountItemDto) a0Var24).b.b;
                            chargersDiscountsItemMapper$map$12.L$0 = a0Var24;
                            chargersDiscountsItemMapper$map$12.L$1 = null;
                            chargersDiscountsItemMapper$map$12.L$2 = null;
                            chargersDiscountsItemMapper$map$12.L$3 = ir9Var25;
                            chargersDiscountsItemMapper$map$12.L$4 = charSequence10;
                            chargersDiscountsItemMapper$map$12.I$0 = i5;
                            chargersDiscountsItemMapper$map$12.label = 11;
                            Object e8 = c.e(cVar4, formattedText15, null, false, chargersDiscountsItemMapper$map$12, 30);
                            if (e8 != coroutineSingletons) {
                                ir9Var8 = ir9Var25;
                                obj = e8;
                                a0Var6 = a0Var24;
                                charSequence11 = (CharSequence) obj;
                                charSequence12 = charSequence10;
                                charSequence13 = charSequence11;
                                ir9Var9 = ir9Var8;
                                a0Var7 = a0Var6;
                                i6 = i5;
                                ChargersDiscountsItemDto$ProgressDiscountItemDto chargersDiscountsItemDto$ProgressDiscountItemDto2 = (ChargersDiscountsItemDto$ProgressDiscountItemDto) a0Var7;
                                ChargersProgressImageParamsDto chargersProgressImageParamsDto = chargersDiscountsItemDto$ProgressDiscountItemDto2.e;
                                String str18 = chargersDiscountsItemDto$ProgressDiscountItemDto2.d;
                                yfa yfaVar = this.d;
                                l = yfaVar.l(chargersProgressImageParamsDto, str18);
                                l2 = yfaVar.l(chargersDiscountsItemDto$ProgressDiscountItemDto2.g, chargersDiscountsItemDto$ProgressDiscountItemDto2.f);
                                i7 = chargersDiscountsItemDto$ProgressDiscountItemDto2.h;
                                int i21 = chargersDiscountsItemDto$ProgressDiscountItemDto2.i;
                                chargersAttributeDto = chargersDiscountsItemDto$ProgressDiscountItemDto2.j;
                                if (chargersAttributeDto != null) {
                                    lnaVar = l;
                                    a0Var8 = a0Var7;
                                    i8 = i21;
                                    tn9Var = null;
                                    charSequence14 = charSequence13;
                                    ir9Var10 = ir9Var9;
                                    lnaVar2 = l2;
                                    charSequence15 = charSequence12;
                                    ChargersDiscountsItemDto$ProgressDiscountItemDto chargersDiscountsItemDto$ProgressDiscountItemDto3 = (ChargersDiscountsItemDto$ProgressDiscountItemDto) a0Var8;
                                    String str19 = chargersDiscountsItemDto$ProgressDiscountItemDto3.k;
                                    if (str19 != null) {
                                    }
                                    if (i6 == 0) {
                                    }
                                    charSequence16 = charSequence15;
                                    ir9Var11 = ir9Var10;
                                    a0Var9 = a0Var8;
                                    i9 = i8;
                                    i10 = i7;
                                    tn9Var2 = tn9Var;
                                    lnaVar3 = lnaVar2;
                                    lnaVar4 = lnaVar;
                                    kdcVar = a;
                                    charSequence17 = charSequence14;
                                    ou9Var = null;
                                    return new pu9(ir9Var11, charSequence16, charSequence17, lnaVar4, lnaVar3, i10, i9, tn9Var2, kdcVar, ou9Var, ((ChargersDiscountsItemDto$ProgressDiscountItemDto) a0Var9).m);
                                }
                                chargersDiscountsItemMapper$map$12.L$0 = a0Var7;
                                chargersDiscountsItemMapper$map$12.L$1 = null;
                                chargersDiscountsItemMapper$map$12.L$2 = null;
                                chargersDiscountsItemMapper$map$12.L$3 = null;
                                chargersDiscountsItemMapper$map$12.L$4 = ir9Var9;
                                chargersDiscountsItemMapper$map$12.L$5 = charSequence12;
                                chargersDiscountsItemMapper$map$12.L$6 = charSequence13;
                                chargersDiscountsItemMapper$map$12.L$7 = l;
                                chargersDiscountsItemMapper$map$12.L$8 = l2;
                                chargersDiscountsItemMapper$map$12.I$0 = i6;
                                chargersDiscountsItemMapper$map$12.I$1 = i7;
                                chargersDiscountsItemMapper$map$12.I$2 = i21;
                                chargersDiscountsItemMapper$map$12.label = 13;
                                Object a3 = this.c.a(chargersAttributeDto, chargersDiscountsItemMapper$map$12);
                                if (a3 != coroutineSingletons) {
                                    obj = a3;
                                    i8 = i21;
                                    tn9Var = (tn9) obj;
                                    a0 a0Var25 = a0Var7;
                                    lnaVar = l;
                                    a0Var8 = a0Var25;
                                    charSequence14 = charSequence13;
                                    ir9Var10 = ir9Var9;
                                    lnaVar2 = l2;
                                    charSequence15 = charSequence12;
                                    ChargersDiscountsItemDto$ProgressDiscountItemDto chargersDiscountsItemDto$ProgressDiscountItemDto32 = (ChargersDiscountsItemDto$ProgressDiscountItemDto) a0Var8;
                                    String str192 = chargersDiscountsItemDto$ProgressDiscountItemDto32.k;
                                    a = str192 != null ? eVar.a(str192) : null;
                                    if (i6 == 0 || (discountAttentionDto = chargersDiscountsItemDto$ProgressDiscountItemDto32.l) == null) {
                                        charSequence16 = charSequence15;
                                        ir9Var11 = ir9Var10;
                                        a0Var9 = a0Var8;
                                        i9 = i8;
                                        i10 = i7;
                                        tn9Var2 = tn9Var;
                                        lnaVar3 = lnaVar2;
                                        lnaVar4 = lnaVar;
                                        kdcVar = a;
                                        charSequence17 = charSequence14;
                                        ou9Var = null;
                                        return new pu9(ir9Var11, charSequence16, charSequence17, lnaVar4, lnaVar3, i10, i9, tn9Var2, kdcVar, ou9Var, ((ChargersDiscountsItemDto$ProgressDiscountItemDto) a0Var9).m);
                                    }
                                    FormattedText formattedText16 = discountAttentionDto.a;
                                    chargersDiscountsItemMapper$map$12.L$0 = a0Var8;
                                    a0 a0Var26 = a0Var8;
                                    chargersDiscountsItemMapper$map$12.L$1 = null;
                                    chargersDiscountsItemMapper$map$12.L$2 = null;
                                    chargersDiscountsItemMapper$map$12.L$3 = ir9Var10;
                                    chargersDiscountsItemMapper$map$12.L$4 = charSequence15;
                                    chargersDiscountsItemMapper$map$12.L$5 = charSequence14;
                                    chargersDiscountsItemMapper$map$12.L$6 = lnaVar;
                                    chargersDiscountsItemMapper$map$12.L$7 = lnaVar2;
                                    chargersDiscountsItemMapper$map$12.L$8 = tn9Var;
                                    chargersDiscountsItemMapper$map$12.L$9 = a;
                                    chargersDiscountsItemMapper$map$12.I$0 = i6;
                                    chargersDiscountsItemMapper$map$12.I$1 = i7;
                                    chargersDiscountsItemMapper$map$12.I$2 = i8;
                                    chargersDiscountsItemMapper$map$12.label = 14;
                                    Object e9 = c.e(this.b, formattedText16, null, false, chargersDiscountsItemMapper$map$12, 30);
                                    if (e9 != coroutineSingletons) {
                                        a0Var10 = a0Var26;
                                        i11 = i8;
                                        i12 = i7;
                                        tn9Var3 = tn9Var;
                                        obj = e9;
                                        lnaVar5 = lnaVar2;
                                        lnaVar6 = lnaVar;
                                        kdcVar2 = a;
                                        charSequence18 = charSequence14;
                                        charSequence19 = charSequence15;
                                        ir9Var12 = ir9Var10;
                                        CharSequence charSequence35 = (CharSequence) obj;
                                        String str20 = ((ChargersDiscountsItemDto$ProgressDiscountItemDto) a0Var10).l.b;
                                        i9 = i11;
                                        i10 = i12;
                                        kdcVar = kdcVar2;
                                        tn9Var2 = tn9Var3;
                                        lnaVar3 = lnaVar5;
                                        lnaVar4 = lnaVar6;
                                        charSequence17 = charSequence18;
                                        charSequence16 = charSequence19;
                                        a0Var9 = a0Var10;
                                        ir9Var11 = ir9Var12;
                                        ou9Var = new ou9(charSequence35, str20 == null ? eVar.a(str20) : null);
                                        return new pu9(ir9Var11, charSequence16, charSequence17, lnaVar4, lnaVar3, i10, i9, tn9Var2, kdcVar, ou9Var, ((ChargersDiscountsItemDto$ProgressDiscountItemDto) a0Var9).m);
                                    }
                                }
                            }
                        } else {
                            FormattedText formattedText17 = ((ChargersDiscountsItemDto$ProgressDiscountItemDto) a0Var24).c.b;
                            chargersDiscountsItemMapper$map$12.L$0 = a0Var24;
                            chargersDiscountsItemMapper$map$12.L$1 = null;
                            chargersDiscountsItemMapper$map$12.L$2 = null;
                            chargersDiscountsItemMapper$map$12.L$3 = ir9Var25;
                            chargersDiscountsItemMapper$map$12.L$4 = charSequence10;
                            chargersDiscountsItemMapper$map$12.I$0 = i5;
                            chargersDiscountsItemMapper$map$12.label = 12;
                            Object e10 = c.e(cVar4, formattedText17, null, false, chargersDiscountsItemMapper$map$12, 30);
                            if (e10 != coroutineSingletons) {
                                ir9Var8 = ir9Var25;
                                obj = e10;
                                a0Var6 = a0Var24;
                                charSequence11 = (CharSequence) obj;
                                charSequence12 = charSequence10;
                                charSequence13 = charSequence11;
                                ir9Var9 = ir9Var8;
                                a0Var7 = a0Var6;
                                i6 = i5;
                                ChargersDiscountsItemDto$ProgressDiscountItemDto chargersDiscountsItemDto$ProgressDiscountItemDto22 = (ChargersDiscountsItemDto$ProgressDiscountItemDto) a0Var7;
                                ChargersProgressImageParamsDto chargersProgressImageParamsDto2 = chargersDiscountsItemDto$ProgressDiscountItemDto22.e;
                                String str182 = chargersDiscountsItemDto$ProgressDiscountItemDto22.d;
                                yfa yfaVar2 = this.d;
                                l = yfaVar2.l(chargersProgressImageParamsDto2, str182);
                                l2 = yfaVar2.l(chargersDiscountsItemDto$ProgressDiscountItemDto22.g, chargersDiscountsItemDto$ProgressDiscountItemDto22.f);
                                i7 = chargersDiscountsItemDto$ProgressDiscountItemDto22.h;
                                int i212 = chargersDiscountsItemDto$ProgressDiscountItemDto22.i;
                                chargersAttributeDto = chargersDiscountsItemDto$ProgressDiscountItemDto22.j;
                                if (chargersAttributeDto != null) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 10:
                        int i22 = chargersDiscountsItemMapper$map$12.I$0;
                        ir9Var2 = (ir9) chargersDiscountsItemMapper$map$12.L$3;
                        a0 a0Var27 = (a0) chargersDiscountsItemMapper$map$12.L$0;
                        kotlin.b.b(obj);
                        i2 = i22;
                        a0Var13 = a0Var27;
                        charSequence9 = (CharSequence) obj;
                        int i202 = i2;
                        a0 a0Var242 = a0Var13;
                        i5 = i202;
                        CharSequence charSequence342 = charSequence9;
                        ir9 ir9Var252 = ir9Var2;
                        charSequence10 = charSequence342;
                        c cVar42 = this.b;
                        if (i5 == 0) {
                        }
                        return coroutineSingletons;
                    case 11:
                        i5 = chargersDiscountsItemMapper$map$12.I$0;
                        charSequence10 = (CharSequence) chargersDiscountsItemMapper$map$12.L$4;
                        ir9Var8 = (ir9) chargersDiscountsItemMapper$map$12.L$3;
                        a0Var6 = (a0) chargersDiscountsItemMapper$map$12.L$0;
                        kotlin.b.b(obj);
                        charSequence11 = (CharSequence) obj;
                        charSequence12 = charSequence10;
                        charSequence13 = charSequence11;
                        ir9Var9 = ir9Var8;
                        a0Var7 = a0Var6;
                        i6 = i5;
                        ChargersDiscountsItemDto$ProgressDiscountItemDto chargersDiscountsItemDto$ProgressDiscountItemDto222 = (ChargersDiscountsItemDto$ProgressDiscountItemDto) a0Var7;
                        ChargersProgressImageParamsDto chargersProgressImageParamsDto22 = chargersDiscountsItemDto$ProgressDiscountItemDto222.e;
                        String str1822 = chargersDiscountsItemDto$ProgressDiscountItemDto222.d;
                        yfa yfaVar22 = this.d;
                        l = yfaVar22.l(chargersProgressImageParamsDto22, str1822);
                        l2 = yfaVar22.l(chargersDiscountsItemDto$ProgressDiscountItemDto222.g, chargersDiscountsItemDto$ProgressDiscountItemDto222.f);
                        i7 = chargersDiscountsItemDto$ProgressDiscountItemDto222.h;
                        int i2122 = chargersDiscountsItemDto$ProgressDiscountItemDto222.i;
                        chargersAttributeDto = chargersDiscountsItemDto$ProgressDiscountItemDto222.j;
                        if (chargersAttributeDto != null) {
                        }
                        break;
                    case 12:
                        i5 = chargersDiscountsItemMapper$map$12.I$0;
                        charSequence10 = (CharSequence) chargersDiscountsItemMapper$map$12.L$4;
                        ir9Var8 = (ir9) chargersDiscountsItemMapper$map$12.L$3;
                        a0Var6 = (a0) chargersDiscountsItemMapper$map$12.L$0;
                        kotlin.b.b(obj);
                        charSequence11 = (CharSequence) obj;
                        charSequence12 = charSequence10;
                        charSequence13 = charSequence11;
                        ir9Var9 = ir9Var8;
                        a0Var7 = a0Var6;
                        i6 = i5;
                        ChargersDiscountsItemDto$ProgressDiscountItemDto chargersDiscountsItemDto$ProgressDiscountItemDto2222 = (ChargersDiscountsItemDto$ProgressDiscountItemDto) a0Var7;
                        ChargersProgressImageParamsDto chargersProgressImageParamsDto222 = chargersDiscountsItemDto$ProgressDiscountItemDto2222.e;
                        String str18222 = chargersDiscountsItemDto$ProgressDiscountItemDto2222.d;
                        yfa yfaVar222 = this.d;
                        l = yfaVar222.l(chargersProgressImageParamsDto222, str18222);
                        l2 = yfaVar222.l(chargersDiscountsItemDto$ProgressDiscountItemDto2222.g, chargersDiscountsItemDto$ProgressDiscountItemDto2222.f);
                        i7 = chargersDiscountsItemDto$ProgressDiscountItemDto2222.h;
                        int i21222 = chargersDiscountsItemDto$ProgressDiscountItemDto2222.i;
                        chargersAttributeDto = chargersDiscountsItemDto$ProgressDiscountItemDto2222.j;
                        if (chargersAttributeDto != null) {
                        }
                        break;
                    case 13:
                        i8 = chargersDiscountsItemMapper$map$12.I$2;
                        i7 = chargersDiscountsItemMapper$map$12.I$1;
                        i6 = chargersDiscountsItemMapper$map$12.I$0;
                        l2 = (lna) chargersDiscountsItemMapper$map$12.L$8;
                        l = (lna) chargersDiscountsItemMapper$map$12.L$7;
                        charSequence13 = (CharSequence) chargersDiscountsItemMapper$map$12.L$6;
                        charSequence12 = (CharSequence) chargersDiscountsItemMapper$map$12.L$5;
                        ir9Var9 = (ir9) chargersDiscountsItemMapper$map$12.L$4;
                        a0Var7 = (a0) chargersDiscountsItemMapper$map$12.L$0;
                        kotlin.b.b(obj);
                        tn9Var = (tn9) obj;
                        a0 a0Var252 = a0Var7;
                        lnaVar = l;
                        a0Var8 = a0Var252;
                        charSequence14 = charSequence13;
                        ir9Var10 = ir9Var9;
                        lnaVar2 = l2;
                        charSequence15 = charSequence12;
                        ChargersDiscountsItemDto$ProgressDiscountItemDto chargersDiscountsItemDto$ProgressDiscountItemDto322 = (ChargersDiscountsItemDto$ProgressDiscountItemDto) a0Var8;
                        String str1922 = chargersDiscountsItemDto$ProgressDiscountItemDto322.k;
                        if (str1922 != null) {
                        }
                        if (i6 == 0) {
                        }
                        charSequence16 = charSequence15;
                        ir9Var11 = ir9Var10;
                        a0Var9 = a0Var8;
                        i9 = i8;
                        i10 = i7;
                        tn9Var2 = tn9Var;
                        lnaVar3 = lnaVar2;
                        lnaVar4 = lnaVar;
                        kdcVar = a;
                        charSequence17 = charSequence14;
                        ou9Var = null;
                        return new pu9(ir9Var11, charSequence16, charSequence17, lnaVar4, lnaVar3, i10, i9, tn9Var2, kdcVar, ou9Var, ((ChargersDiscountsItemDto$ProgressDiscountItemDto) a0Var9).m);
                    case 14:
                        i11 = chargersDiscountsItemMapper$map$12.I$2;
                        i12 = chargersDiscountsItemMapper$map$12.I$1;
                        kdcVar2 = (kdc) chargersDiscountsItemMapper$map$12.L$9;
                        tn9Var3 = (tn9) chargersDiscountsItemMapper$map$12.L$8;
                        lnaVar5 = (lna) chargersDiscountsItemMapper$map$12.L$7;
                        lnaVar6 = (lna) chargersDiscountsItemMapper$map$12.L$6;
                        charSequence18 = (CharSequence) chargersDiscountsItemMapper$map$12.L$5;
                        charSequence19 = (CharSequence) chargersDiscountsItemMapper$map$12.L$4;
                        ir9Var12 = (ir9) chargersDiscountsItemMapper$map$12.L$3;
                        a0Var10 = (a0) chargersDiscountsItemMapper$map$12.L$0;
                        kotlin.b.b(obj);
                        CharSequence charSequence352 = (CharSequence) obj;
                        String str202 = ((ChargersDiscountsItemDto$ProgressDiscountItemDto) a0Var10).l.b;
                        i9 = i11;
                        i10 = i12;
                        kdcVar = kdcVar2;
                        tn9Var2 = tn9Var3;
                        lnaVar3 = lnaVar5;
                        lnaVar4 = lnaVar6;
                        charSequence17 = charSequence18;
                        charSequence16 = charSequence19;
                        a0Var9 = a0Var10;
                        ir9Var11 = ir9Var12;
                        ou9Var = new ou9(charSequence352, str202 == null ? eVar.a(str202) : null);
                        return new pu9(ir9Var11, charSequence16, charSequence17, lnaVar4, lnaVar3, i10, i9, tn9Var2, kdcVar, ou9Var, ((ChargersDiscountsItemDto$ProgressDiscountItemDto) a0Var9).m);
                    case 15:
                        ir9Var = (ir9) chargersDiscountsItemMapper$map$12.L$2;
                        a0Var13 = (a0) chargersDiscountsItemMapper$map$12.L$0;
                        kotlin.b.b(obj);
                        CharSequence charSequence272 = (CharSequence) obj;
                        FormattedText formattedText102 = ((ChargersDiscountsItemDto$TaskDiscountItemDto) a0Var13).e;
                        chargersDiscountsItemMapper$map$12.L$0 = a0Var13;
                        chargersDiscountsItemMapper$map$12.L$1 = null;
                        chargersDiscountsItemMapper$map$12.L$2 = ir9Var;
                        chargersDiscountsItemMapper$map$12.L$3 = charSequence272;
                        chargersDiscountsItemMapper$map$12.label = 16;
                        obj = eVar.t(formattedText102, chargersDiscountsItemMapper$map$12);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 16:
                        charSequence20 = (CharSequence) chargersDiscountsItemMapper$map$12.L$3;
                        ir9Var13 = (ir9) chargersDiscountsItemMapper$map$12.L$2;
                        a0Var11 = (a0) chargersDiscountsItemMapper$map$12.L$0;
                        kotlin.b.b(obj);
                        CharSequence charSequence282 = (CharSequence) obj;
                        FormattedText formattedText112 = ((ChargersDiscountsItemDto$TaskDiscountItemDto) a0Var11).f;
                        chargersDiscountsItemMapper$map$12.L$0 = a0Var11;
                        chargersDiscountsItemMapper$map$12.L$1 = null;
                        chargersDiscountsItemMapper$map$12.L$2 = ir9Var13;
                        chargersDiscountsItemMapper$map$12.L$3 = charSequence20;
                        chargersDiscountsItemMapper$map$12.L$4 = charSequence282;
                        chargersDiscountsItemMapper$map$12.label = 17;
                        t = eVar.t(formattedText112, chargersDiscountsItemMapper$map$12);
                        if (t != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 17:
                        CharSequence charSequence36 = (CharSequence) chargersDiscountsItemMapper$map$12.L$4;
                        CharSequence charSequence37 = (CharSequence) chargersDiscountsItemMapper$map$12.L$3;
                        ir9 ir9Var26 = (ir9) chargersDiscountsItemMapper$map$12.L$2;
                        a0 a0Var28 = (a0) chargersDiscountsItemMapper$map$12.L$0;
                        kotlin.b.b(obj);
                        charSequence22 = charSequence36;
                        charSequence21 = charSequence37;
                        ir9Var14 = ir9Var26;
                        a0Var11 = a0Var28;
                        charSequence23 = (CharSequence) obj;
                        ChargersDiscountsItemDto$TaskDiscountItemDto chargersDiscountsItemDto$TaskDiscountItemDto22 = (ChargersDiscountsItemDto$TaskDiscountItemDto) a0Var11;
                        String str122 = chargersDiscountsItemDto$TaskDiscountItemDto22.c;
                        int i162 = chargersDiscountsItemDto$TaskDiscountItemDto22.g;
                        int i172 = chargersDiscountsItemDto$TaskDiscountItemDto22.h;
                        kdc a22 = eVar.a(chargersDiscountsItemDto$TaskDiscountItemDto22.b);
                        FormattedText formattedText122 = chargersDiscountsItemDto$TaskDiscountItemDto22.i;
                        chargersDiscountsItemMapper$map$12.L$0 = a0Var11;
                        chargersDiscountsItemMapper$map$12.L$1 = null;
                        chargersDiscountsItemMapper$map$12.L$2 = ir9Var14;
                        chargersDiscountsItemMapper$map$12.L$3 = charSequence21;
                        chargersDiscountsItemMapper$map$12.L$4 = charSequence22;
                        chargersDiscountsItemMapper$map$12.L$5 = charSequence23;
                        chargersDiscountsItemMapper$map$12.L$6 = str122;
                        chargersDiscountsItemMapper$map$12.L$7 = a22;
                        chargersDiscountsItemMapper$map$12.I$0 = i162;
                        chargersDiscountsItemMapper$map$12.I$1 = i172;
                        chargersDiscountsItemMapper$map$12.label = 18;
                        t2 = eVar.t(formattedText122, chargersDiscountsItemMapper$map$12);
                        if (t2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 18:
                        int i23 = chargersDiscountsItemMapper$map$12.I$1;
                        int i24 = chargersDiscountsItemMapper$map$12.I$0;
                        kdc kdcVar4 = (kdc) chargersDiscountsItemMapper$map$12.L$7;
                        String str21 = (String) chargersDiscountsItemMapper$map$12.L$6;
                        charSequence23 = (CharSequence) chargersDiscountsItemMapper$map$12.L$5;
                        charSequence22 = (CharSequence) chargersDiscountsItemMapper$map$12.L$4;
                        charSequence21 = (CharSequence) chargersDiscountsItemMapper$map$12.L$3;
                        ir9Var14 = (ir9) chargersDiscountsItemMapper$map$12.L$2;
                        a0Var12 = (a0) chargersDiscountsItemMapper$map$12.L$0;
                        kotlin.b.b(obj);
                        i14 = i23;
                        i13 = i24;
                        kdcVar3 = kdcVar4;
                        str5 = str21;
                        ChargersDiscountsItemDto$TaskDiscountItemDto chargersDiscountsItemDto$TaskDiscountItemDto32 = (ChargersDiscountsItemDto$TaskDiscountItemDto) a0Var12;
                        return new su9(ir9Var14, charSequence21, charSequence22, i13, str5, i14, kdcVar3, charSequence23, (CharSequence) obj, eVar.a(chargersDiscountsItemDto$TaskDiscountItemDto32.j), eVar.a(chargersDiscountsItemDto$TaskDiscountItemDto32.k), chargersDiscountsItemDto$TaskDiscountItemDto32.l);
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        chargersDiscountsItemMapper$map$1 = new ChargersDiscountsItemMapper$map$1(this, continuationImpl);
        ChargersDiscountsItemMapper$map$1 chargersDiscountsItemMapper$map$122 = chargersDiscountsItemMapper$map$1;
        Object obj2 = chargersDiscountsItemMapper$map$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDiscountsItemMapper$map$122.label;
        e eVar2 = this.a;
        switch (i) {
        }
    }
}
