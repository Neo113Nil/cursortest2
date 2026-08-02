package com.yandex.go.chargers.multiorder.ui;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersActiveMultiOrderCardButtonName;
import defpackage.h0;
import defpackage.j4a;
import defpackage.p5a;
import defpackage.q5a;
import defpackage.r4a;
import defpackage.r5a;
import defpackage.s5a;
import defpackage.t5a;
import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* synthetic */ class ChargersMultiOrderModalView$adapter$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        t5a t5aVar = (t5a) obj;
        r4a r4aVar = (r4a) this.receiver;
        r4aVar.getClass();
        if (t5aVar instanceof p5a) {
            r4aVar.Kg(((p5a) t5aVar).c);
        } else {
            if (!(t5aVar instanceof q5a) && !(t5aVar instanceof r5a)) {
                w511.b();
                return null;
            }
            ((j4a) r4aVar.C.b).r(new h0(((s5a) t5aVar).a(), 27));
            r4aVar.x.a(ChargersAnalytics$ChargersActiveMultiOrderCardButtonName.OrderCard, null);
        }
        return zy11.a;
    }
}
