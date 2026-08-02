package com.yandex.go.settings.email;

import defpackage.kyh0;
import defpackage.tls;
import defpackage.xrn;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class EmailModalView$mailValueTextChangeListener$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        a aVar = (a) this.receiver;
        aVar.getClass();
        if (((CharSequence) obj).length() > 0) {
            ((xrn) aVar.Dg()).N1(kyh0.favorites_summary_add, true);
            aVar.A = true;
        } else {
            ((xrn) aVar.Dg()).N1(kyh0.favorites_summary_add, false);
        }
        return zy11.a;
    }
}
