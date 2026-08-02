package com.yandex.go.taxi.order.details.v2.state.elements.buttons;

import com.yandex.go.slot.api.ui.SlotItemUiState$Size;
import com.yandex.go.slot.dto.BadgeItemDto;
import com.yandex.go.slot.dto.SlotButtonDto;
import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.slot.dto.b2;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.adk0;
import defpackage.avj0;
import defpackage.bvf0;
import defpackage.css0;
import defpackage.ess0;
import defpackage.gdc;
import defpackage.gss0;
import defpackage.h1b;
import defpackage.ibk0;
import defpackage.irs0;
import defpackage.jl40;
import defpackage.kdc;
import defpackage.krs0;
import defpackage.kyh0;
import defpackage.lbk0;
import defpackage.mqg0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.qk4;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tss0;
import defpackage.wls;
import defpackage.wqs0;
import defpackage.xqs0;
import defpackage.xss0;
import defpackage.yck0;
import defpackage.zck0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.superapp.orders.models.ActionAccessibilityType;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzck0;", "<anonymous>", "(Ljava/lang/Object;)Lzck0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.buttons.RideCardButtonMapper$map$1", f = "RideCardButtonMapper.kt", l = {HProv.PP_HASHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardButtonMapper$map$1 extends SuspendLambda implements wls {
    final /* synthetic */ kdc $backgroundColor;
    final /* synthetic */ SlotButtonDto $buttonDto;
    final /* synthetic */ String $buttonType;
    final /* synthetic */ String $id;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ SlotItemDto $slot;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lyck0;", "<anonymous>", "(Ltse;)Lyck0;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.buttons.RideCardButtonMapper$map$1$1", f = "RideCardButtonMapper.kt", l = {HProv.PP_REBOOT, 103, 105}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.details.v2.state.elements.buttons.RideCardButtonMapper$map$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ kdc $backgroundColor;
        final /* synthetic */ SlotButtonDto $buttonDto;
        final /* synthetic */ String $buttonType;
        final /* synthetic */ String $id;
        final /* synthetic */ boolean $isEnabled;
        final /* synthetic */ boolean $isLoading;
        final /* synthetic */ SlotItemDto $slot;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kdc kdcVar, SlotButtonDto slotButtonDto, SlotItemDto slotItemDto, f fVar, String str, String str2, Continuation continuation, boolean z, boolean z2) {
            super(2, continuation);
            this.this$0 = fVar;
            this.$slot = slotItemDto;
            this.$buttonDto = slotButtonDto;
            this.$id = str;
            this.$backgroundColor = kdcVar;
            this.$isLoading = z;
            this.$isEnabled = z2;
            this.$buttonType = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            f fVar = this.this$0;
            SlotItemDto slotItemDto = this.$slot;
            SlotButtonDto slotButtonDto = this.$buttonDto;
            String str = this.$id;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$backgroundColor, slotButtonDto, slotItemDto, fVar, str, this.$buttonType, continuation, this.$isLoading, this.$isEnabled);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0217, code lost:
        
            if (r2.V().H == false) goto L84;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x022e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0205  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x01bc  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x019d  */
        /* JADX WARN: Type inference failed for: r0v19, types: [gss0] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object b;
            noh nohVar;
            ibk0 b2;
            SlotItemUiState$Size slotItemUiState$Size;
            Object a;
            tss0 tss0Var;
            wqs0 wqs0Var;
            Object k;
            ibk0 ibk0Var;
            qk4 qk4Var;
            tss0 tss0Var2;
            ess0 ess0Var;
            wqs0 wqs0Var2;
            String str;
            boolean z;
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                qoh h = tje.h(tseVar, null, null, new RideCardButtonMapper$map$1$1$body$1(this.this$0, this.$buttonType, this.$slot, this.$isEnabled, null), 3);
                f fVar = this.this$0;
                irs0 irs0Var = fVar.e;
                List list = this.$slot.e;
                lbk0 lbk0Var = fVar.f;
                this.L$0 = null;
                this.L$1 = h;
                this.label = 1;
                b = irs0.b(irs0Var, list, lbk0Var, false, this, 12);
                if (b != coroutineSingletons) {
                    nohVar = h;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r0 = (gss0) this.L$7;
                    qk4 qk4Var2 = (qk4) this.L$6;
                    wqs0Var2 = (wqs0) this.L$5;
                    slotItemUiState$Size = (SlotItemUiState$Size) this.L$4;
                    ibk0 ibk0Var2 = (ibk0) this.L$3;
                    tss0 tss0Var3 = (tss0) this.L$2;
                    kotlin.b.b(obj);
                    ess0Var = r0;
                    qk4Var = qk4Var2;
                    ibk0Var = ibk0Var2;
                    tss0Var2 = tss0Var3;
                    k = obj;
                    xqs0 xqs0Var = new xqs0(new xss0(ess0Var, (css0) k, tss0Var2, ibk0Var, slotItemUiState$Size), wqs0Var2);
                    String str2 = this.$id;
                    SlotButtonDto slotButtonDto = this.$buttonDto;
                    String str3 = slotButtonDto.c;
                    kdc kdcVar = this.$backgroundColor;
                    boolean z2 = this.$isLoading;
                    boolean z3 = this.$isEnabled;
                    f fVar2 = this.this$0;
                    str = slotButtonDto.b;
                    o2y0 o2y0Var = fVar2.a;
                    if (jl40.l(str, "already_coming_button") || !o2y0Var.b().H()) {
                        if (jl40.l(str, "save_ride_button")) {
                            TaxiOrder b3 = o2y0Var.b();
                            if (!b3.l.getC()) {
                            }
                        }
                        z = false;
                        f fVar3 = this.this$0;
                        String str4 = this.$buttonDto.b;
                        fVar3.getClass();
                        return new yck0(str2, str3, xqs0Var, kdcVar, z2, z3, z, qk4Var, (!jl40.l(str4, "already_coming_button") || jl40.l(str4, "save_ride_button")) ? ActionAccessibilityType.CHECKBOX : null);
                    }
                    z = true;
                    f fVar32 = this.this$0;
                    String str42 = this.$buttonDto.b;
                    fVar32.getClass();
                    return new yck0(str2, str3, xqs0Var, kdcVar, z2, z3, z, qk4Var, (!jl40.l(str42, "already_coming_button") || jl40.l(str42, "save_ride_button")) ? ActionAccessibilityType.CHECKBOX : null);
                }
                wqs0Var = (wqs0) this.L$5;
                SlotItemUiState$Size slotItemUiState$Size2 = (SlotItemUiState$Size) this.L$4;
                ibk0 ibk0Var3 = (ibk0) this.L$3;
                tss0 tss0Var4 = (tss0) this.L$2;
                nohVar = (noh) this.L$1;
                kotlin.b.b(obj);
                tss0Var = tss0Var4;
                slotItemUiState$Size = slotItemUiState$Size2;
                b2 = ibk0Var3;
                a = obj;
                qk4 qk4Var3 = (qk4) a;
                ess0 ess0Var2 = ess0.a;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = tss0Var;
                this.L$3 = b2;
                this.L$4 = slotItemUiState$Size;
                this.L$5 = wqs0Var;
                this.L$6 = qk4Var3;
                this.L$7 = ess0Var2;
                this.label = 3;
                k = nohVar.k(this);
                if (k != coroutineSingletons) {
                    ibk0Var = b2;
                    qk4Var = qk4Var3;
                    tss0Var2 = tss0Var;
                    ess0Var = ess0Var2;
                    wqs0Var2 = wqs0Var;
                    xqs0 xqs0Var2 = new xqs0(new xss0(ess0Var, (css0) k, tss0Var2, ibk0Var, slotItemUiState$Size), wqs0Var2);
                    String str22 = this.$id;
                    SlotButtonDto slotButtonDto2 = this.$buttonDto;
                    String str32 = slotButtonDto2.c;
                    kdc kdcVar2 = this.$backgroundColor;
                    boolean z22 = this.$isLoading;
                    boolean z32 = this.$isEnabled;
                    f fVar22 = this.this$0;
                    str = slotButtonDto2.b;
                    o2y0 o2y0Var2 = fVar22.a;
                    if (jl40.l(str, "already_coming_button")) {
                    }
                    if (jl40.l(str, "save_ride_button")) {
                    }
                    z = false;
                    f fVar322 = this.this$0;
                    String str422 = this.$buttonDto.b;
                    fVar322.getClass();
                    return new yck0(str22, str32, xqs0Var2, kdcVar2, z22, z32, z, qk4Var, (!jl40.l(str422, "already_coming_button") || jl40.l(str422, "save_ride_button")) ? ActionAccessibilityType.CHECKBOX : null);
                }
                return coroutineSingletons;
            }
            noh nohVar2 = (noh) this.L$1;
            kotlin.b.b(obj);
            nohVar = nohVar2;
            b = obj;
            tss0 tss0Var5 = (tss0) b;
            f fVar4 = this.this$0;
            irs0 irs0Var2 = fVar4.e;
            lbk0 lbk0Var2 = fVar4.f;
            b2 b2Var = this.$slot.a;
            irs0Var2.getClass();
            lbk0Var2.getClass();
            b2 = lbk0.b(b2Var);
            irs0 irs0Var3 = this.this$0.e;
            SlotButtonDto.Properties.Size size = this.$buttonDto.f.a;
            ((com.yandex.go.slot.mapper.a) irs0Var3).getClass();
            int i2 = size == null ? -1 : krs0.b[size.ordinal()];
            slotItemUiState$Size = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? SlotItemUiState$Size.M : SlotItemUiState$Size.L : SlotItemUiState$Size.M : SlotItemUiState$Size.S : SlotItemUiState$Size.XS;
            wqs0 n = ((com.yandex.go.slot.mapper.a) this.this$0.e).n(this.$buttonDto.f);
            com.yandex.go.taxi.order.util.slot.a aVar = this.this$0.d;
            BadgeItemDto badgeItemDto = this.$buttonDto.h;
            this.L$0 = null;
            this.L$1 = nohVar;
            this.L$2 = tss0Var5;
            this.L$3 = b2;
            this.L$4 = slotItemUiState$Size;
            this.L$5 = n;
            this.label = 2;
            aVar.getClass();
            if (badgeItemDto != null && !(badgeItemDto instanceof com.yandex.go.slot.dto.e)) {
                if (badgeItemDto instanceof BadgeItemDto.Chat) {
                    BadgeItemDto.Chat chat = (BadgeItemDto.Chat) badgeItemDto;
                    int i3 = ((h1b) kotlinx.coroutines.flow.e.d(aVar.b.b).a.getValue()).b;
                    String valueOf = i3 == 0 ? "" : i3 == -1 ? "!" : i3 > 10 ? "*" : String.valueOf(i3);
                    ru.yandex.taxi.widget.utils.e eVar = aVar.a;
                    BadgeItemDto.Properties properties = chat.a;
                    kdc v = eVar.v(properties != null ? properties.a : null);
                    if (v == null) {
                        v = new gdc(mqg0.white);
                    }
                    String i4 = ((avj0) aVar.c).i(kyh0.content_description_unread_messages, valueOf);
                    ru.yandex.taxi.widget.utils.e eVar2 = aVar.a;
                    BadgeItemDto.Properties properties2 = chat.a;
                    a = new qk4(valueOf, v, eVar2.a(properties2 != null ? properties2.b : null), i4);
                } else if (badgeItemDto instanceof BadgeItemDto.Text) {
                    a = aVar.a((BadgeItemDto.Text) badgeItemDto, this);
                    if (a != coroutineSingletons) {
                        a = (qk4) a;
                    }
                }
                if (a != coroutineSingletons) {
                    tss0Var = tss0Var5;
                    wqs0Var = n;
                    qk4 qk4Var32 = (qk4) a;
                    ess0 ess0Var22 = ess0.a;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = tss0Var;
                    this.L$3 = b2;
                    this.L$4 = slotItemUiState$Size;
                    this.L$5 = wqs0Var;
                    this.L$6 = qk4Var32;
                    this.L$7 = ess0Var22;
                    this.label = 3;
                    k = nohVar.k(this);
                    if (k != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            a = null;
            if (a != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardButtonMapper$map$1(kdc kdcVar, SlotButtonDto slotButtonDto, SlotItemDto slotItemDto, f fVar, String str, String str2, Continuation continuation, boolean z, boolean z2) {
        super(2, continuation);
        this.$buttonType = str;
        this.this$0 = fVar;
        this.$slot = slotItemDto;
        this.$buttonDto = slotButtonDto;
        this.$id = str2;
        this.$backgroundColor = kdcVar;
        this.$isLoading = z;
        this.$isEnabled = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        String str = this.$buttonType;
        f fVar = this.this$0;
        SlotItemDto slotItemDto = this.$slot;
        RideCardButtonMapper$map$1 rideCardButtonMapper$map$1 = new RideCardButtonMapper$map$1(this.$backgroundColor, this.$buttonDto, slotItemDto, fVar, str, this.$id, continuation, this.$isLoading, this.$isEnabled);
        rideCardButtonMapper$map$1.L$0 = obj;
        return rideCardButtonMapper$map$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardButtonMapper$map$1) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object n;
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean l = jl40.l(this.$buttonType, "create_order_button");
            adk0 adk0Var = adk0.a;
            if (l && !this.this$0.b.a()) {
                return adk0Var;
            }
            if (jl40.l(this.$buttonType, "safety_button")) {
                if (jl40.l(obj2 instanceof Boolean ? (Boolean) obj2 : null, Boolean.FALSE)) {
                    return adk0Var;
                }
            }
            f fVar = this.this$0;
            SlotItemDto slotItemDto = this.$slot;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$backgroundColor, this.$buttonDto, slotItemDto, fVar, this.$id, this.$buttonType, null, this.$isLoading, this.$isEnabled);
            this.L$0 = null;
            this.label = 1;
            n = bvf0.n(anonymousClass1, this);
            if (n == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            n = obj;
        }
        return (zck0) n;
    }
}
