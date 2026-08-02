package com.ybsdk.screens.registration.applicationstatus.presentation;

import com.ybsdk.core.utils.text.Text;
import defpackage.aqi0;
import defpackage.bqi0;
import defpackage.dqi0;
import defpackage.ds31;
import defpackage.fqi0;
import defpackage.gqi0;
import defpackage.h791;
import defpackage.lao;
import defpackage.pqi0;
import defpackage.pz40;
import defpackage.sls;
import defpackage.tje;
import defpackage.uc5;
import defpackage.w511;
import defpackage.ypi0;
import defpackage.zpi0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class RegistrationApplicationStatusFragment$getViewBinding$1$1 extends FunctionReferenceImpl implements sls {
    public RegistrationApplicationStatusFragment$getViewBinding$1$1(uc5 uc5Var) {
        super(0, uc5Var, c.class, "onErrorPrimaryButtonClick", "onErrorPrimaryButtonClick()V", 0);
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m475invoke() {
        r0 r0Var;
        Object value;
        String str;
        c cVar = (c) this.receiver;
        gqi0 gqi0Var = (gqi0) cVar.X();
        if (gqi0Var instanceof zpi0) {
            zpi0 zpi0Var = (zpi0) gqi0Var;
            List list = zpi0Var.h;
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                cVar.f0(zpi0Var.e);
                return;
            }
            lao laoVar = (lao) kotlin.collections.a.R(list);
            if (laoVar == null || (str = laoVar.b) == null) {
                return;
            }
            h791.f(cVar.J, str, ((com.ybsdk.feature.webview.internal.a) cVar.G).f(str));
            return;
        }
        if (gqi0Var instanceof dqi0) {
            tje.N(ds31.a(cVar), null, null, new RegistrationApplicationStatusViewModel$onErrorPrimaryButtonClick$2(cVar, gqi0Var, null), 3);
            return;
        }
        if (gqi0Var instanceof ypi0) {
            ypi0 ypi0Var = (ypi0) gqi0Var;
            switch (pqi0.a[ypi0Var.d.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    cVar.f0(ypi0Var.e);
                    break;
                case 6:
                    cVar.E.j(com.ybsdk.screens.initial.a.c(cVar.L));
                    break;
                default:
                    w511.b();
                    break;
            }
            return;
        }
        if (gqi0Var instanceof bqi0) {
            cVar.f0(((bqi0) gqi0Var).c);
            return;
        }
        if (gqi0Var instanceof fqi0) {
            return;
        }
        if (!(gqi0Var instanceof aqi0)) {
            w511.b();
            return;
        }
        pz40 Y = cVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new fqi0((Text.Resource) null, 3)));
        tje.N(ds31.a(cVar), null, null, new RegistrationApplicationStatusViewModel$onErrorPrimaryButtonClick$4(cVar, gqi0Var, null), 3);
    }

    @Override // defpackage.sls
    public final /* bridge */ /* synthetic */ Object invoke() {
        m475invoke();
        return zy11.a;
    }
}
