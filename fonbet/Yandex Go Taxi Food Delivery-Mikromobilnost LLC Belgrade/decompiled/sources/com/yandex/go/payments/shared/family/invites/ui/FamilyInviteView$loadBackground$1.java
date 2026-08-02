package com.yandex.go.payments.shared.family.invites.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.shared.family.invites.ui.FamilyInviteView", f = "FamilyInviteView.kt", l = {119}, m = "loadBackground", v = 2)
/* loaded from: classes13.dex */
public final class FamilyInviteView$loadBackground$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FamilyInviteView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyInviteView$loadBackground$1(FamilyInviteView familyInviteView, Continuation continuation) {
        super(continuation);
        this.this$0 = familyInviteView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object loadBackground;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        loadBackground = this.this$0.loadBackground(null, this);
        return loadBackground;
    }
}
