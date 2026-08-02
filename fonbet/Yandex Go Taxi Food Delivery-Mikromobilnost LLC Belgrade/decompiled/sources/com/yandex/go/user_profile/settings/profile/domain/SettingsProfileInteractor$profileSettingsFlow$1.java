package com.yandex.go.user_profile.settings.profile.domain;

import defpackage.avj0;
import defpackage.dms;
import defpackage.evu0;
import defpackage.gl3;
import defpackage.hl3;
import defpackage.i20;
import defpackage.jcr0;
import defpackage.kcr0;
import defpackage.kj;
import defpackage.kyh0;
import defpackage.lcr0;
import defpackage.mcr0;
import defpackage.ncr0;
import defpackage.ocr0;
import defpackage.pcr0;
import defpackage.qcr0;
import defpackage.qtb1;
import defpackage.rcr0;
import defpackage.tcr0;
import defpackage.tl21;
import defpackage.vvb1;
import defpackage.zuj0;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class SettingsProfileInteractor$profileSettingsFlow$1 extends AdaptedFunctionReference implements dms {
    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        mcr0 mcr0Var;
        String str = (String) obj2;
        tl21 tl21Var = (tl21) obj3;
        i20 i20Var = (i20) obj4;
        tcr0 tcr0Var = (tcr0) this.receiver;
        tcr0Var.getClass();
        if (((hl3) obj) instanceof gl3) {
            return ncr0.a;
        }
        boolean z = i20Var.a;
        kj Ig = tcr0Var.a.a.Ig();
        String str2 = Ig != null ? Ig.b : null;
        pcr0 ocr0Var = (str2 == null || evu0.J(str2)) ? qtb1.Q : new ocr0(str2, z);
        rcr0 qcr0Var = str != null ? new qcr0(str, i20Var.a) : vvb1.P;
        String str3 = tl21Var.a;
        if (evu0.J(str3)) {
            mcr0Var = kcr0.a;
        } else {
            int i = tl21Var.b;
            zuj0 zuj0Var = tcr0Var.b;
            mcr0Var = new lcr0(str3, i == 1 ? ((avj0) zuj0Var).h(kyh0.settings_mail_title) : ((avj0) zuj0Var).h(kyh0.mail_needs_confirmation));
        }
        return new jcr0(ocr0Var, qcr0Var, mcr0Var);
    }
}
