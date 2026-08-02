package com.yandex.go.address.position_confirmation;

import com.yandex.go.clarify_address.AddressClarificationReason;
import com.yandex.go.navigation.screen.api.Screen;
import defpackage.ems;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.ryb0;
import defpackage.sls;
import defpackage.syb0;
import defpackage.tje;
import defpackage.tyb0;
import defpackage.vyb0;
import defpackage.w511;
import defpackage.wyb0;
import defpackage.xna1;
import defpackage.xyb0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lpv0;", "addressInfo", "", "clarified", "allowedZoom", "Lcom/yandex/go/navigation/screen/api/Screen;", "currentScreen", "Lzy11;", "<unused var>", "Lxyb0;", "<anonymous>", "(Lcom/yandex/go/preorder/AddressInfo;ZZLcom/yandex/go/navigation/screen/api/Screen;V)Lcom/yandex/go/address/position_confirmation/api/PinPositionConfirmationState;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.position_confirmation.PinPositionConfirmationInteractorImpl$needConfirmationFlow$3", f = "PinPositionConfirmationInteractorImpl.kt", l = {HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class PinPositionConfirmationInteractorImpl$needConfirmationFlow$3 extends SuspendLambda implements ems {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    boolean Z$2;
    boolean Z$3;
    int label;
    final /* synthetic */ j this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.address.position_confirmation.PinPositionConfirmationInteractorImpl$needConfirmationFlow$3$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((j) this.receiver).c();
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinPositionConfirmationInteractorImpl$needConfirmationFlow$3(j jVar, Continuation continuation) {
        super(6, continuation);
        this.this$0 = jVar;
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        PinPositionConfirmationInteractorImpl$needConfirmationFlow$3 pinPositionConfirmationInteractorImpl$needConfirmationFlow$3 = new PinPositionConfirmationInteractorImpl$needConfirmationFlow$3(this.this$0, (Continuation) obj6);
        pinPositionConfirmationInteractorImpl$needConfirmationFlow$3.L$0 = (pv0) obj;
        pinPositionConfirmationInteractorImpl$needConfirmationFlow$3.Z$0 = booleanValue;
        pinPositionConfirmationInteractorImpl$needConfirmationFlow$3.Z$1 = booleanValue2;
        pinPositionConfirmationInteractorImpl$needConfirmationFlow$3.L$1 = (Screen) obj4;
        return pinPositionConfirmationInteractorImpl$needConfirmationFlow$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pv0 pv0Var = (pv0) this.L$0;
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        Screen screen = (Screen) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean b = xna1.b(pv0Var.a);
        xyb0 a = this.this$0.j.a();
        syb0 syb0Var = syb0.a;
        boolean l = jl40.l(a, syb0Var);
        if (!b || z || l) {
            return syb0Var;
        }
        if (!z2 && !jl40.l(this.this$0.j.a(), ryb0.a)) {
            return tyb0.a;
        }
        k kVar = this.this$0.k;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(0, this.this$0, j.class, "onConfirm", "onConfirm()V", 0);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(0, this.this$0, j.class, "onEdit", "onEdit()V", 0);
        this.L$0 = null;
        this.L$1 = null;
        this.Z$0 = z;
        this.Z$1 = z2;
        this.Z$2 = b;
        this.Z$3 = l;
        this.label = 1;
        Object a2 = kVar.a(pv0Var, screen, anonymousClass1, anonymousClass2, this);
        return a2 == coroutineSingletons ? coroutineSingletons : a2;
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.address.position_confirmation.PinPositionConfirmationInteractorImpl$needConfirmationFlow$3$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements sls {
        /* renamed from: invoke, reason: collision with other method in class */
        public final void m181invoke() {
            j jVar = (j) this.receiver;
            xyb0 a = jVar.j.a();
            if (!jl40.l(a, wyb0.a) && !jl40.l(a, tyb0.a) && !jl40.l(a, syb0.a) && !jl40.l(a, ryb0.a)) {
                if (!(a instanceof vyb0)) {
                    w511.b();
                    return;
                } else {
                    ((com.yandex.go.clarify_address.before_order.a) jVar.m).b.d = true;
                    jVar.l.a(false);
                    tje.N(jVar.e.a, null, null, new PinPositionConfirmationInteractorImpl$confirm$1(jVar, (vyb0) a, null), 3);
                }
            }
            ((com.yandex.go.clarify_address.a) jVar.g).c(true, AddressClarificationReason.Map);
        }

        @Override // defpackage.sls
        public final /* bridge */ /* synthetic */ Object invoke() {
            m181invoke();
            return zy11.a;
        }
    }
}
