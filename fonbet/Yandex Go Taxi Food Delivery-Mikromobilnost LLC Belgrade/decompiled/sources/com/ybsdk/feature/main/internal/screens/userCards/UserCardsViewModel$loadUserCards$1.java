package com.ybsdk.feature.main.internal.screens.userCards;

import defpackage.ds31;
import defpackage.g8e;
import defpackage.l0p;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tje;
import defpackage.tk21;
import defpackage.tse;
import defpackage.v7l;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.main.internal.screens.userCards.UserCardsViewModel$loadUserCards$1", f = "UserCardsViewModel.kt", l = {HProv.ALG_SID_KECCAK_224, 90}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class UserCardsViewModel$loadUserCards$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserCardsViewModel$loadUserCards$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserCardsViewModel$loadUserCards$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserCardsViewModel$loadUserCards$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
    
        if (r12 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0076, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004d, code lost:
    
        if (r3 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object a;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.D.T.a.a("product_screen.all_cards.initiated", null);
            b bVar = this.this$0;
            this.label = 1;
            if (bVar.H) {
                bVar.H = false;
                tje.N(ds31.a(bVar), null, null, new UserCardsViewModel$handleLoadingState$2(bVar, null), 3);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                a = ((Result) obj).getValue();
                b bVar2 = this.this$0;
                if (!(a instanceof Result.Failure)) {
                    v7l v7lVar = (v7l) a;
                    pz40 Y = bVar2.Y();
                    do {
                        r0Var3 = (r0) Y;
                        value3 = r0Var3.getValue();
                    } while (!r0Var3.k(value3, tk21.b((tk21) value3, null, v7lVar, null, 29)));
                    bVar2.E.c();
                }
                b bVar3 = this.this$0;
                Throwable a2 = Result.a(a);
                if (a2 != null) {
                    l0p l0pVar = bVar3.D.T;
                    String message = a2.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    l0pVar.a.a("product_screen.all_cards.failure", g8e.w(1, "error", message));
                    x4c.g("Failed to load user cards", a2, null, null, 12);
                    pz40 Y2 = bVar3.Y();
                    do {
                        r0Var2 = (r0) Y2;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, tk21.b((tk21) value2, a2, null, null, 30)));
                    bVar3.E.d();
                }
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        pz40 Y3 = this.this$0.Y();
        do {
            r0Var = (r0) Y3;
            value = r0Var.getValue();
        } while (!r0Var.k(value, tk21.b((tk21) value, null, null, null, 30)));
        com.ybsdk.feature.main.internal.domain.userCards.a aVar = this.this$0.B;
        this.label = 2;
        a = aVar.a(this);
    }
}
