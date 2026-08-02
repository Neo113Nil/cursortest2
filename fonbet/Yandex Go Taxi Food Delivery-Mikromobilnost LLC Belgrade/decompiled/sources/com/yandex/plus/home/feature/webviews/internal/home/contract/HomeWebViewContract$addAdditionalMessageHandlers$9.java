package com.yandex.plus.home.feature.webviews.internal.home.contract;

import com.yandex.plus.home.feature.webviews.internal.container.b;
import com.yandex.plus.log.api.LogPriority;
import defpackage.du80;
import defpackage.eu80;
import defpackage.nw70;
import defpackage.pgz;
import defpackage.szg;
import defpackage.tls;
import defpackage.wk41;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class HomeWebViewContract$addAdditionalMessageHandlers$9 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        eu80 eu80Var = (eu80) obj;
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.B;
        String str = aVar.C;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, str, "handleOpenStoriesListMessage() outMessage=" + eu80Var);
        }
        b bVar = aVar.z;
        List<du80> list = eu80Var.b;
        ArrayList arrayList = new ArrayList();
        for (du80 du80Var : list) {
            aVar.f.getClass();
            Object F = nw70.F(du80Var);
            if (!(F instanceof Result.Failure)) {
                F = new wk41((szg) F, du80Var.b, du80Var.c);
            }
            Throwable a = Result.a(F);
            if (a != null) {
                LogPriority logPriority2 = LogPriority.ERROR;
                if (pgzVar.e(logPriority2)) {
                    pgzVar.b(logPriority2, str, "handleOpenStoriesListMessage() outMessage=" + eu80Var, a);
                }
                aVar.A.c(du80Var.a);
                F = null;
            }
            wk41 wk41Var = (wk41) F;
            if (wk41Var != null) {
                arrayList.add(wk41Var);
            }
        }
        b.a(bVar, arrayList);
        return zy11.a;
    }
}
