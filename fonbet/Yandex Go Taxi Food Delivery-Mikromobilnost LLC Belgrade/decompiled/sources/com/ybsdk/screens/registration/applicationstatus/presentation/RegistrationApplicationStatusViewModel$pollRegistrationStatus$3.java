package com.ybsdk.screens.registration.applicationstatus.presentation;

import com.ybsdk.core.utils.text.Text;
import defpackage.dzh0;
import defpackage.fqi0;
import defpackage.gqi0;
import defpackage.pz40;
import defpackage.sls;
import defpackage.unr0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class RegistrationApplicationStatusViewModel$pollRegistrationStatus$3 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        r0 r0Var;
        Object value;
        gqi0 gqi0Var;
        pz40 Y = ((c) this.receiver).Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            gqi0Var = (gqi0) value;
            fqi0 fqi0Var = gqi0Var instanceof fqi0 ? (fqi0) gqi0Var : null;
            if (fqi0Var != null) {
                gqi0Var = new fqi0(fqi0Var.a, unr0.h(Text.Companion, dzh0.ybsdk_authorization_taking_too_much_time));
            }
        } while (!r0Var.k(value, gqi0Var));
        return zy11.a;
    }
}
