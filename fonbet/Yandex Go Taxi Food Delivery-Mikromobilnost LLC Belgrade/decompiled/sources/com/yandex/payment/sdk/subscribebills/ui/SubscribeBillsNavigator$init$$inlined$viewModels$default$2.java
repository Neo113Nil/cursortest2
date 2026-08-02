package com.yandex.payment.sdk.subscribebills.ui;

import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyr31;", "VM", "Lqs31;", "invoke", "()Lqs31;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
/* loaded from: classes2.dex */
public final class SubscribeBillsNavigator$init$$inlined$viewModels$default$2 extends Lambda implements sls {
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribeBillsNavigator$init$$inlined$viewModels$default$2(AppCompatActivity appCompatActivity) {
        super(0);
        this.$this_viewModels = appCompatActivity;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return this.$this_viewModels.getViewModelStore();
    }
}
