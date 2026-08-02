package com.yandex.messaging.internal;

import android.os.Bundle;
import defpackage.kg60;
import defpackage.lg60;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class NotificationActionHandler$onAction$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        lg60 lg60Var = (lg60) this.receiver;
        lg60Var.a.post(new kg60(lg60Var, (Bundle) obj, 1));
        return zy11.a;
    }
}
