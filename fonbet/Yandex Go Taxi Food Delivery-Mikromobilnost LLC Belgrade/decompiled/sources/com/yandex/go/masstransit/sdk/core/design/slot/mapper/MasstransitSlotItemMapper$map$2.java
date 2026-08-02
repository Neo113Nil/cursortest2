package com.yandex.go.masstransit.sdk.core.design.slot.mapper;

import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemSizeDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.k;
import com.yandex.go.masstransit.sdk.core.design.slot.ui.MasstransitSlotItemUiState$Size;
import com.yandex.go.masstransit.sdk.core.dto.CurrencyRulesDto;
import com.yandex.go.masstransit.sdk.core.image.MtSdkImage;
import defpackage.h510;
import defpackage.i510;
import defpackage.j510;
import defpackage.k510;
import defpackage.mvg;
import defpackage.n410;
import defpackage.nvi0;
import defpackage.ny61;
import defpackage.s510;
import defpackage.t510;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.y410;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lt510;", "<anonymous>", "(Ltse;)Lt510;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.core.design.slot.mapper.MasstransitSlotItemMapper$map$2", f = "MasstransitSlotItemMapper.kt", l = {38, 39}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MasstransitSlotItemMapper$map$2 extends SuspendLambda implements wls {
    final /* synthetic */ CurrencyRulesDto $currencyRules;
    final /* synthetic */ MasstransitSlotItemDto $slotItem;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasstransitSlotItemMapper$map$2(a aVar, MasstransitSlotItemDto masstransitSlotItemDto, CurrencyRulesDto currencyRulesDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$slotItem = masstransitSlotItemDto;
        this.$currencyRules = currencyRulesDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MasstransitSlotItemMapper$map$2(this.this$0, this.$slotItem, this.$currencyRules, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MasstransitSlotItemMapper$map$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x005c, code lost:
    
        if (r12 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0088  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        k510 j510Var;
        MtSdkImage a;
        nvi0 g;
        h510 h510Var;
        int i;
        MasstransitSlotItemUiState$Size masstransitSlotItemUiState$Size;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            a aVar = this.this$0;
            k kVar = this.$slotItem.c;
            aVar.getClass();
            j510Var = (kVar == null || (a = kVar.getA()) == null || (g = a.g(a)) == null) ? i510.a : new j510(g);
            a aVar2 = this.this$0;
            List list = this.$slotItem.d;
            CurrencyRulesDto currencyRulesDto = this.$currencyRules;
            this.L$0 = j510Var;
            this.label = 1;
            obj = a.a(aVar2, list, currencyRulesDto, this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                h510 h510Var2 = (h510) this.L$1;
                j510Var = (k510) this.L$0;
                b.b(obj);
                h510Var = h510Var2;
                k510 k510Var = j510Var;
                s510 s510Var = (s510) obj;
                MasstransitSlotItemDto masstransitSlotItemDto = this.$slotItem;
                n410 n410Var = masstransitSlotItemDto.a;
                a aVar3 = this.this$0;
                MasstransitSlotItemSizeDto masstransitSlotItemSizeDto = masstransitSlotItemDto.b;
                aVar3.getClass();
                i = masstransitSlotItemSizeDto != null ? -1 : y410.b[masstransitSlotItemSizeDto.ordinal()];
                if (i != -1) {
                    masstransitSlotItemUiState$Size = MasstransitSlotItemUiState$Size.L;
                } else if (i == 1) {
                    masstransitSlotItemUiState$Size = MasstransitSlotItemUiState$Size.XS;
                } else if (i == 2) {
                    masstransitSlotItemUiState$Size = MasstransitSlotItemUiState$Size.S;
                } else if (i == 3) {
                    masstransitSlotItemUiState$Size = MasstransitSlotItemUiState$Size.M;
                } else {
                    if (i != 4) {
                        w511.b();
                        return null;
                    }
                    masstransitSlotItemUiState$Size = MasstransitSlotItemUiState$Size.L;
                }
                return new t510(k510Var, h510Var, s510Var, n410Var, masstransitSlotItemUiState$Size);
            }
            j510Var = (k510) this.L$0;
            b.b(obj);
        }
        h510 h510Var3 = (h510) obj;
        a aVar4 = this.this$0;
        List list2 = this.$slotItem.e;
        this.L$0 = j510Var;
        this.L$1 = h510Var3;
        this.label = 2;
        Object b = a.b(aVar4, list2, this);
        if (b != coroutineSingletons) {
            h510Var = h510Var3;
            obj = b;
            k510 k510Var2 = j510Var;
            s510 s510Var2 = (s510) obj;
            MasstransitSlotItemDto masstransitSlotItemDto2 = this.$slotItem;
            n410 n410Var2 = masstransitSlotItemDto2.a;
            a aVar32 = this.this$0;
            MasstransitSlotItemSizeDto masstransitSlotItemSizeDto2 = masstransitSlotItemDto2.b;
            aVar32.getClass();
            if (masstransitSlotItemSizeDto2 != null) {
            }
            if (i != -1) {
            }
            return new t510(k510Var2, h510Var, s510Var2, n410Var2, masstransitSlotItemUiState$Size);
        }
        return coroutineSingletons;
    }
}
