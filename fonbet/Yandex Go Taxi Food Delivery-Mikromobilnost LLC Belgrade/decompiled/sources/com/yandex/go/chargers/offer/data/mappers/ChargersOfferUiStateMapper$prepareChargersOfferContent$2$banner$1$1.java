package com.yandex.go.chargers.offer.data.mappers;

import com.yandex.go.chargers.data.model.ChargersAttributeDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersProgressImageParamsDto;
import com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto;
import com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto$ChargersOfferBannerActionDto$OpenDiscountDetails;
import com.yandex.go.chargers.offer.data.api.g;
import com.yandex.go.chargers.offer.data.api.h;
import defpackage.ir9;
import defpackage.jl40;
import defpackage.lna;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tj9;
import defpackage.tn9;
import defpackage.tse;
import defpackage.uj9;
import defpackage.w511;
import defpackage.w6a;
import defpackage.w7a;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lw7a;", "<anonymous>", "(Ltse;)Lw7a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.data.mappers.ChargersOfferUiStateMapper$prepareChargersOfferContent$2$banner$1$1", f = "ChargersOfferUiStateMapper.kt", l = {166, 167, 182}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersOfferUiStateMapper$prepareChargersOfferContent$2$banner$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersOfferResponseDto.Banner $bannerDto;
    final /* synthetic */ String $imageUrl;
    final /* synthetic */ ChargersOfferResponseDto $response;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersOfferUiStateMapper$prepareChargersOfferContent$2$banner$1$1(b bVar, ChargersOfferResponseDto.Banner banner, String str, ChargersOfferResponseDto chargersOfferResponseDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$bannerDto = banner;
        this.$imageUrl = str;
        this.$response = chargersOfferResponseDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersOfferUiStateMapper$prepareChargersOfferContent$2$banner$1$1(this.this$0, this.$bannerDto, this.$imageUrl, this.$response, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersOfferUiStateMapper$prepareChargersOfferContent$2$banner$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0051, code lost:
    
        if (r15 == r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        CharSequence charSequence2;
        ChargersProgressImageParamsDto chargersProgressImageParamsDto;
        lna lnaVar;
        ChargersAttributeDto chargersAttributeDto;
        String str;
        tn9 tn9Var;
        Integer num;
        String str2;
        Integer num2;
        h hVar;
        uj9 uj9Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0.f;
            FormattedText formattedText = this.$bannerDto.b;
            this.label = 1;
            obj = eVar.x(formattedText, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    num2 = (Integer) this.L$5;
                    lnaVar = (lna) this.L$4;
                    str2 = (String) this.L$3;
                    charSequence2 = (CharSequence) this.L$2;
                    charSequence = (CharSequence) this.L$1;
                    kotlin.b.b(obj);
                    tn9Var = (tn9) obj;
                    num = num2;
                    str = str2;
                    lna lnaVar2 = lnaVar;
                    CharSequence charSequence3 = charSequence2;
                    CharSequence charSequence4 = charSequence;
                    hVar = this.$bannerDto.h;
                    if (hVar instanceof ChargersOfferResponseDto$ChargersOfferBannerActionDto$OpenDiscountDetails) {
                        String str3 = this.$response.a;
                        ChargersDiscountDto chargersDiscountDto = ((ChargersOfferResponseDto$ChargersOfferBannerActionDto$OpenDiscountDetails) hVar).a;
                        uj9Var = new w6a(str3, new ir9(chargersDiscountDto.a, chargersDiscountDto.b, null));
                    } else {
                        if (!jl40.l(hVar, g.INSTANCE) && hVar != null) {
                            w511.b();
                            return null;
                        }
                        uj9Var = tj9.a;
                    }
                    return new w7a(charSequence4, charSequence3, str, lnaVar2, num, tn9Var, uj9Var);
                }
                CharSequence charSequence5 = (CharSequence) this.L$0;
                kotlin.b.b(obj);
                charSequence = charSequence5;
                charSequence2 = (CharSequence) obj;
                String str4 = this.$imageUrl;
                chargersProgressImageParamsDto = this.$bannerDto.d;
                if (chargersProgressImageParamsDto == null) {
                    b bVar = this.this$0;
                    String str5 = chargersProgressImageParamsDto.a;
                    String str6 = chargersProgressImageParamsDto.b;
                    Integer num3 = str6 != null ? new Integer(bVar.f.u(xng0.bgTransparent, str6)) : null;
                    String str7 = chargersProgressImageParamsDto.c;
                    lnaVar = new lna(null, num3, str5, str7 != null ? new Integer(bVar.f.b(xng0.bgTransparent, str7)) : null);
                } else {
                    lnaVar = null;
                }
                String str8 = this.$bannerDto.f;
                Integer c = str8 == null ? this.this$0.f.c(str8) : null;
                chargersAttributeDto = this.$bannerDto.g;
                if (chargersAttributeDto != null) {
                    str = str4;
                    tn9Var = null;
                    num = c;
                    lna lnaVar22 = lnaVar;
                    CharSequence charSequence32 = charSequence2;
                    CharSequence charSequence42 = charSequence;
                    hVar = this.$bannerDto.h;
                    if (hVar instanceof ChargersOfferResponseDto$ChargersOfferBannerActionDto$OpenDiscountDetails) {
                    }
                    return new w7a(charSequence42, charSequence32, str, lnaVar22, num, tn9Var, uj9Var);
                }
                com.yandex.go.chargers.domain.mapper.a aVar = this.this$0.k;
                this.L$0 = null;
                this.L$1 = charSequence;
                this.L$2 = charSequence2;
                this.L$3 = str4;
                this.L$4 = lnaVar;
                this.L$5 = c;
                this.label = 3;
                Object a = aVar.a(chargersAttributeDto, this);
                if (a != coroutineSingletons) {
                    str2 = str4;
                    obj = a;
                    num2 = c;
                    tn9Var = (tn9) obj;
                    num = num2;
                    str = str2;
                    lna lnaVar222 = lnaVar;
                    CharSequence charSequence322 = charSequence2;
                    CharSequence charSequence422 = charSequence;
                    hVar = this.$bannerDto.h;
                    if (hVar instanceof ChargersOfferResponseDto$ChargersOfferBannerActionDto$OpenDiscountDetails) {
                    }
                    return new w7a(charSequence422, charSequence322, str, lnaVar222, num, tn9Var, uj9Var);
                }
                return coroutineSingletons;
            }
            kotlin.b.b(obj);
        }
        CharSequence charSequence6 = (CharSequence) obj;
        e eVar2 = this.this$0.f;
        FormattedText formattedText2 = this.$bannerDto.c;
        this.L$0 = charSequence6;
        this.label = 2;
        Object x = eVar2.x(formattedText2, this);
        if (x != coroutineSingletons) {
            charSequence = charSequence6;
            obj = x;
            charSequence2 = (CharSequence) obj;
            String str42 = this.$imageUrl;
            chargersProgressImageParamsDto = this.$bannerDto.d;
            if (chargersProgressImageParamsDto == null) {
            }
            String str82 = this.$bannerDto.f;
            if (str82 == null) {
            }
            chargersAttributeDto = this.$bannerDto.g;
            if (chargersAttributeDto != null) {
            }
        }
        return coroutineSingletons;
    }
}
