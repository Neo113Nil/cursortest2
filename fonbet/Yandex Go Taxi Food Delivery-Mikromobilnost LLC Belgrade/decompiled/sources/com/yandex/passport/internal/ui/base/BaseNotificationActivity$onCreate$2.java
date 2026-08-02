package com.yandex.passport.internal.ui.base;

import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class BaseNotificationActivity$onCreate$2 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        ((BaseNotificationActivity) this.receiver).onDismiss();
        return zy11.a;
    }
}
