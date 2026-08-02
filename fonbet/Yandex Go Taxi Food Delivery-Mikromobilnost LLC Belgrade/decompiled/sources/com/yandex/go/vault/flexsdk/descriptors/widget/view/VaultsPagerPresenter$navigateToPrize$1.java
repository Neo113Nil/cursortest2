package com.yandex.go.vault.flexsdk.descriptors.widget.view;

import com.yandex.go.vault.data.ActionButtonTypeResponse;
import com.yandex.go.vault.flexsdk.descriptors.widget.actions.OpenPrizeAction;
import com.yandex.go.vault.flexsdk.descriptors.widget.actions.OpenPrizeActionVaultActionButton;
import com.yandex.go.vault.flexsdk.descriptors.widget.actions.OpenPrizePayload;
import defpackage.l331;
import defpackage.m331;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.w511;
import defpackage.wgr;
import defpackage.wls;
import defpackage.x231;
import defpackage.xxn;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.vault.flexsdk.descriptors.widget.view.VaultsPagerPresenter$navigateToPrize$1", f = "VaultsPagerPresenter.kt", l = {219, 221}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VaultsPagerPresenter$navigateToPrize$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VaultsPagerPresenter$navigateToPrize$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VaultsPagerPresenter$navigateToPrize$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VaultsPagerPresenter$navigateToPrize$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c0, code lost:
    
        if (r2.a(r7, r23) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0034, code lost:
    
        if (r2.a(r6, r23) == r1) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ActionButtonTypeResponse actionButtonTypeResponse;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj2 = null;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            wgr wgrVar = this.this$0.y;
            xxn xxnVar = new xxn();
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        b bVar = this.this$0;
        l331 l331Var = bVar.H;
        if (l331Var != null) {
            wgr wgrVar2 = bVar.y;
            String str = l331Var.a;
            String str2 = l331Var.b;
            String str3 = l331Var.c;
            String str4 = l331Var.d;
            String str5 = l331Var.e;
            ArrayList<x231> arrayList = l331Var.f;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            for (x231 x231Var : arrayList) {
                String str6 = x231Var.b;
                Object obj3 = obj2;
                int i4 = m331.a[x231Var.a.ordinal()];
                if (i4 == i3) {
                    actionButtonTypeResponse = ActionButtonTypeResponse.CLIPBOARD_COPY;
                } else if (i4 == i2) {
                    actionButtonTypeResponse = ActionButtonTypeResponse.DEEPLINK;
                } else {
                    if (i4 != 3) {
                        w511.b();
                        return obj3;
                    }
                    actionButtonTypeResponse = ActionButtonTypeResponse.CLOSE;
                }
                arrayList2.add(new OpenPrizeActionVaultActionButton(actionButtonTypeResponse, str6, x231Var.c, x231Var.d, x231Var.e, x231Var.f));
                obj2 = obj3;
                i2 = 2;
                i3 = 1;
            }
            OpenPrizeAction openPrizeAction = new OpenPrizeAction(new OpenPrizePayload(str, str2, str3, str4, str5, arrayList2, true));
            this.L$0 = obj2;
            this.label = 2;
        }
        return zy11.a;
    }
}
