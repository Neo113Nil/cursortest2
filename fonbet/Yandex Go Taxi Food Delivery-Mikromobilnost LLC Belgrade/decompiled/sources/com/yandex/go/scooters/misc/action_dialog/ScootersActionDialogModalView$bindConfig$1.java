package com.yandex.go.scooters.misc.action_dialog;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.misc.action_dialog.ScootersActionDialogModalView", f = "ScootersActionDialogModalView.kt", l = {61, 62, SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE, 64, 66, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE, 70}, m = "bindConfig", v = 2)
/* loaded from: classes13.dex */
public final class ScootersActionDialogModalView$bindConfig$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScootersActionDialogModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActionDialogModalView$bindConfig$1(ScootersActionDialogModalView scootersActionDialogModalView, Continuation continuation) {
        super(continuation);
        this.this$0 = scootersActionDialogModalView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object bindConfig;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        bindConfig = this.this$0.bindConfig(this);
        return bindConfig;
    }
}
