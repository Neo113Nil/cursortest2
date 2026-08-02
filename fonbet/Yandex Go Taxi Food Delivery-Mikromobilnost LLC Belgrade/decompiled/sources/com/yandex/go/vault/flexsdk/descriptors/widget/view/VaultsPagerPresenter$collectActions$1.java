package com.yandex.go.vault.flexsdk.descriptors.widget.view;

import com.yandex.go.vault.flexsdk.shared.VaultPaletteDto;
import defpackage.i331;
import defpackage.m99;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sf11;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wgr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.vault.flexsdk.descriptors.widget.view.VaultsPagerPresenter$collectActions$1", f = "VaultsPagerPresenter.kt", l = {232, 235}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VaultsPagerPresenter$collectActions$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VaultsPagerPresenter$collectActions$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VaultsPagerPresenter$collectActions$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VaultsPagerPresenter$collectActions$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        if (r9.collect(r1, r8) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r1.a(r5, r8) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            wgr wgrVar = bVar.y;
            i331 i331Var = bVar.E;
            if (i331Var.c == null) {
                i331Var.b.edit().clear().apply();
            }
            VaultPaletteDto vaultPaletteDto = i331Var.c;
            m99 m99Var = new m99(i331.a(i331Var.a, vaultPaletteDto != null ? vaultPaletteDto.c : null, vaultPaletteDto != null ? vaultPaletteDto.d : null));
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        tpr b = this.this$0.y.b();
        sf11 sf11Var = new sf11(18, this.this$0);
        this.label = 2;
    }
}
