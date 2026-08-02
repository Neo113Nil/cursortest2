package com.yandex.messaging.ui.settings.contacts;

import defpackage.ds31;
import defpackage.tje;
import defpackage.tls;
import defpackage.vde;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class ContactsSettingsScreen$Root$3$1 extends FunctionReferenceImpl implements tls {
    public final void i(boolean z) {
        c cVar = ((vde) this.receiver).a;
        if (z) {
            r0 r0Var = cVar.z;
            if (!((Boolean) r0Var.getValue()).booleanValue()) {
                cVar.y.reportEvent("contacts_settings_delete", c.Z(cVar));
                r0Var.m(null, Boolean.TRUE);
                cVar.x.c(false);
                tje.N(ds31.a(cVar), null, null, new ContactsSettingsViewModel$deleteContacts$1(cVar, tje.N(ds31.a(cVar), null, null, new ContactsSettingsViewModel$deleteContacts$minimalActionProgress$1(2, null), 3), null), 3);
            }
        }
        r0 r0Var2 = cVar.A;
        Boolean bool = Boolean.FALSE;
        r0Var2.getClass();
        r0Var2.m(null, bool);
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i(((Boolean) obj).booleanValue());
        return zy11.a;
    }
}
