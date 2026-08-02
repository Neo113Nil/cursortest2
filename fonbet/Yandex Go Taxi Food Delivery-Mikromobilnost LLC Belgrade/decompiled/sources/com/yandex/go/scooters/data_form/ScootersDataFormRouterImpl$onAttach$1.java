package com.yandex.go.scooters.data_form;

import com.yandex.go.flex.common.api.actions.CloseAction;
import com.yandex.go.flex.common.api.actions.OpenWebAction;
import com.yandex.go.scooters.data_form.data.actions.ScootersSubmitUserPdDataAction;
import defpackage.kr;
import defpackage.mcn0;
import defpackage.ncn0;
import defpackage.ocn0;
import defpackage.qu;
import defpackage.tje;
import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ScootersDataFormRouterImpl$onAttach$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        kr krVar = (kr) obj;
        b bVar = (b) this.receiver;
        bVar.getClass();
        if (krVar instanceof CloseAction) {
            bVar.r(new qu(9));
        } else if (krVar instanceof OpenWebAction) {
            bVar.P(new ncn0(((OpenWebAction) krVar).a));
        } else if (krVar instanceof ScootersSubmitUserPdDataAction) {
            tje.N(bVar.o(), null, null, new ScootersDataFormRouterImpl$handleSubmitAction$1(bVar, null), 3);
        } else if (krVar instanceof ocn0) {
            ocn0 ocn0Var = (ocn0) krVar;
            if (ocn0Var instanceof mcn0) {
                bVar.r(new qu(9));
            } else {
                if (!(ocn0Var instanceof ncn0)) {
                    w511.b();
                    return null;
                }
                bVar.P((ncn0) ocn0Var);
            }
        }
        return zy11.a;
    }
}
