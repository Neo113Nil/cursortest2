package com.yandex.go.places.impl.navigation.common.navigator.internal;

import com.yandex.go.places.impl.navigation.common.stack.PlacesNavigationEntry$Source;
import defpackage.bcc0;
import defpackage.cm80;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class PlacesInternalNavigatorImpl$truncateInternalSearchIfNeeded$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        bcc0 bcc0Var = (bcc0) obj;
        ((b) this.receiver).getClass();
        return Boolean.valueOf(bcc0Var.b == PlacesNavigationEntry$Source.INTERNAL && (bcc0Var.a instanceof cm80));
    }
}
