package com.yandex.payment.sdk.ui.payment.sbp;

import com.yandex.payment.sdk.core.data.PaymentKitError;
import defpackage.dy40;
import defpackage.fjm0;
import defpackage.g8e;
import defpackage.hjm0;
import defpackage.ogb1;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.sls;
import defpackage.sv90;
import defpackage.wj00;
import defpackage.y22;
import defpackage.y891;
import defpackage.zdz;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class SbpFragment$initBankListLayout$1$2$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        d dVar = (d) this.receiver;
        dy40 dy40Var = dVar.B;
        rwo rwoVar = dVar.A;
        sv90 sv90Var = qv90.a;
        ArrayList c0 = d.c0(dVar.D);
        String str = dVar.G;
        if (str == null) {
            str = "";
        }
        sv90Var.getClass();
        String p = g8e.p("Пользователь нажал на кнопку Выбрать другой: ".concat(kotlin.collections.a.X(c0, Extension.FIX_SPACE, null, null, null, 62)), "; выбранный банк: ", str);
        wj00 wj00Var = new wj00(0);
        wj00Var.b.put("bank_list", sv90.y0(c0));
        wj00Var.k("selected_bank", str);
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, p);
        ((y22) rwoVar).a(y891.c("sbp_installed_bank_list-select_other-tapped", wj00Var));
        Object d = dy40Var.d();
        fjm0 fjm0Var = d instanceof fjm0 ? (fjm0) d : null;
        if (fjm0Var == null || !fjm0Var.c) {
            LinkedHashMap linkedHashMap = zdz.a;
            ogb1.b("Show full nspk list in wrong state");
            PaymentKitError.Companion.getClass();
            dy40Var.l(new hjm0(com.yandex.payment.sdk.core.data.a.d("Show full nspk list in wrong state")));
        } else {
            dVar.b0();
        }
        return zy11.a;
    }
}
