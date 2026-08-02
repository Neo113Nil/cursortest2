package com.ybsdk.feature.autotopup.internal.data;

import com.ybsdk.core.common.data.network.dto.PaymentMethodInfoDto;
import com.ybsdk.feature.autotopup.internal.network.AutoTopupApi;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.DayOfWeekDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.MonthDayToMoneyDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.OncePerMonthDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.OncePerWeekDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.RegularAutoTopupValidationRequest;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.RegularAutotopupStatusDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.RegularAutotopupTypeDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.SelectedRegularAutotopupOptionDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.TwicePerMonthDto;
import defpackage.a730;
import defpackage.bob1;
import defpackage.ek11;
import defpackage.giq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qb91;
import defpackage.tls;
import defpackage.u170;
import defpackage.w170;
import defpackage.w511;
import defpackage.xri0;
import defpackage.zri0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutoTopupValidationResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.autotopup.internal.data.AutoTopupSetupRepository$validateRegularAutoTopup$2", f = "AutoTopupSetupRepository.kt", l = {563}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupRepository$validateRegularAutoTopup$2 extends SuspendLambda implements tls {
    final /* synthetic */ zri0 $settings;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupRepository$validateRegularAutoTopup$2(zri0 zri0Var, b bVar, Continuation continuation) {
        super(1, continuation);
        this.$settings = zri0Var;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AutoTopupSetupRepository$validateRegularAutoTopup$2(this.$settings, this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((AutoTopupSetupRepository$validateRegularAutoTopup$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RegularAutotopupStatusDto regularAutotopupStatusDto;
        RegularAutotopupTypeDto regularAutotopupTypeDto;
        OncePerWeekDto oncePerWeekDto;
        OncePerMonthDto oncePerMonthDto;
        Object p;
        DayOfWeekDto dayOfWeekDto;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        TwicePerMonthDto twicePerMonthDto = null;
        if (i == 0) {
            kotlin.b.b(obj);
            zri0 zri0Var = this.$settings;
            int i2 = xri0.a[zri0Var.a.ordinal()];
            if (i2 == 1) {
                regularAutotopupStatusDto = RegularAutotopupStatusDto.ENABLED;
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                regularAutotopupStatusDto = RegularAutotopupStatusDto.DISABLED;
            }
            String str = zri0Var.b;
            PaymentMethodInfoDto e = qb91.e(zri0Var.d);
            giq0 giq0Var = zri0Var.e;
            int i3 = xri0.c[giq0Var.a.ordinal()];
            if (i3 == 1) {
                regularAutotopupTypeDto = RegularAutotopupTypeDto.ONCE_PER_WEEK;
            } else if (i3 == 2) {
                regularAutotopupTypeDto = RegularAutotopupTypeDto.ONCE_PER_MONTH;
            } else {
                if (i3 != 3) {
                    w511.b();
                    return null;
                }
                regularAutotopupTypeDto = RegularAutotopupTypeDto.TWICE_PER_MONTH;
            }
            w170 w170Var = giq0Var.b;
            if (w170Var != null) {
                switch (xri0.b[w170Var.a.ordinal()]) {
                    case 1:
                        dayOfWeekDto = DayOfWeekDto.MON;
                        break;
                    case 2:
                        dayOfWeekDto = DayOfWeekDto.TUE;
                        break;
                    case 3:
                        dayOfWeekDto = DayOfWeekDto.WED;
                        break;
                    case 4:
                        dayOfWeekDto = DayOfWeekDto.THU;
                        break;
                    case 5:
                        dayOfWeekDto = DayOfWeekDto.FRI;
                        break;
                    case 6:
                        dayOfWeekDto = DayOfWeekDto.SAT;
                        break;
                    case 7:
                        dayOfWeekDto = DayOfWeekDto.SUN;
                        break;
                    default:
                        w511.b();
                        return null;
                }
                oncePerWeekDto = new OncePerWeekDto(dayOfWeekDto, bob1.f(w170Var.b));
            } else {
                oncePerWeekDto = null;
            }
            u170 u170Var = giq0Var.c;
            if (u170Var != null) {
                oncePerMonthDto = new OncePerMonthDto(bob1.f(u170Var.b), u170Var.a, u170Var.c);
            } else {
                oncePerMonthDto = null;
            }
            ek11 ek11Var = giq0Var.d;
            if (ek11Var != null) {
                a730 a730Var = ek11Var.a;
                MonthDayToMoneyDto monthDayToMoneyDto = new MonthDayToMoneyDto(a730Var.a, bob1.f(a730Var.b));
                a730 a730Var2 = ek11Var.b;
                twicePerMonthDto = new TwicePerMonthDto(monthDayToMoneyDto, new MonthDayToMoneyDto(a730Var2.a, bob1.f(a730Var2.b)));
            }
            RegularAutoTopupValidationRequest regularAutoTopupValidationRequest = new RegularAutoTopupValidationRequest(regularAutotopupStatusDto, new SelectedRegularAutotopupOptionDto(regularAutotopupTypeDto, oncePerWeekDto, oncePerMonthDto, twicePerMonthDto), str, e);
            AutoTopupApi autoTopupApi = this.this$0.a;
            this.label = 1;
            p = autoTopupApi.p(regularAutoTopupValidationRequest, this);
            if (p == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            p = ((Result) obj).getValue();
        }
        return new Result(p);
    }
}
