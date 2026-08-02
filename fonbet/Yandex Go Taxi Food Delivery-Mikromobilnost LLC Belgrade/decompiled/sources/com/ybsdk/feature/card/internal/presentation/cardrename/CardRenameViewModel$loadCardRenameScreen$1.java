package com.ybsdk.feature.card.internal.presentation.cardrename;

import com.ybsdk.feature.card.internal.interactors.k;
import defpackage.ds31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tje;
import defpackage.tse;
import defpackage.v7l;
import defpackage.wls;
import defpackage.x4c;
import defpackage.ym8;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.presentation.cardrename.CardRenameViewModel$loadCardRenameScreen$1", f = "CardRenameViewModel.kt", l = {40, 42}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardRenameViewModel$loadCardRenameScreen$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRenameViewModel$loadCardRenameScreen$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardRenameViewModel$loadCardRenameScreen$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardRenameViewModel$loadCardRenameScreen$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (r11 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x005c, code lost:
    
        if (r4 == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        Object a;
        r0 r0Var3;
        Object value3;
        r0 r0Var4;
        Object value4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            this.label = 1;
            if (((ym8) aVar.X()).d) {
                pz40 Y = aVar.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, ym8.b((ym8) value, null, null, null, 7)));
                tje.N(ds31.a(aVar), null, null, new CardRenameViewModel$handleLoadingState$3(aVar, null), 3);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                a = ((Result) obj).getValue();
                a aVar2 = this.this$0;
                if (!(a instanceof Result.Failure)) {
                    v7l v7lVar = (v7l) a;
                    pz40 Y2 = aVar2.Y();
                    do {
                        r0Var4 = (r0) Y2;
                        value4 = r0Var4.getValue();
                    } while (!r0Var4.k(value4, ym8.b((ym8) value4, null, v7lVar, null, 13)));
                    aVar2.E.c();
                }
                a aVar3 = this.this$0;
                Throwable a2 = Result.a(a);
                if (a2 != null) {
                    x4c.g("Failed to load card rename screen", a2, null, null, 12);
                    pz40 Y3 = aVar3.Y();
                    do {
                        r0Var3 = (r0) Y3;
                        value3 = r0Var3.getValue();
                    } while (!r0Var3.k(value3, ym8.b((ym8) value3, a2, null, null, 14)));
                    aVar3.E.d();
                }
                return zy11Var;
            }
            b.b(obj);
        }
        pz40 Y4 = this.this$0.Y();
        do {
            r0Var2 = (r0) Y4;
            value2 = r0Var2.getValue();
        } while (!r0Var2.k(value2, ym8.b((ym8) value2, null, null, null, 14)));
        a aVar4 = this.this$0;
        k kVar = aVar4.C;
        String trustCardId = aVar4.B.getTrustCardId();
        this.label = 2;
        a = kVar.a(trustCardId, this);
    }
}
