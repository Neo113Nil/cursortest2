package com.ybsdk.feature.autotopup.internal.data;

import defpackage.mvg;
import defpackage.tls;
import defpackage.zri0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/TwoFactorAuthResponse;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutoTopupSaveResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.autotopup.internal.data.AutoTopupSetupRepository$saveRegularAutoTopup$2", f = "AutoTopupSetupRepository.kt", l = {547}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupRepository$saveRegularAutoTopup$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ zri0 $settings;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupRepository$saveRegularAutoTopup$2(b bVar, zri0 zri0Var, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$settings = zri0Var;
        this.$idempotencyToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AutoTopupSetupRepository$saveRegularAutoTopup$2(this.this$0, this.$settings, this.$idempotencyToken, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((AutoTopupSetupRepository$saveRegularAutoTopup$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ybsdk.feature.autotopup.internal.data.AutoTopupSetupRepository$saveRegularAutoTopup$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
