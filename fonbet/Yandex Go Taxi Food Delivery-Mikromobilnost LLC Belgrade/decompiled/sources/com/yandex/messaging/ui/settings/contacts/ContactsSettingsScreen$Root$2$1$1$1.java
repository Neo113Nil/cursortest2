package com.yandex.messaging.ui.settings.contacts;

import com.yandex.messaging.internal.authorized.sync.d;
import defpackage.ds31;
import defpackage.tje;
import defpackage.tls;
import defpackage.vde;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class ContactsSettingsScreen$Root$2$1$1$1 extends FunctionReferenceImpl implements tls {
    public final void i(boolean z) {
        c cVar = ((vde) this.receiver).a;
        cVar.y.reportEvent("contacts_settings_changed", cVar.Y(z));
        d dVar = cVar.x;
        dVar.c(z);
        if (!z || ((Boolean) dVar.j.a.getValue()).booleanValue()) {
            return;
        }
        tje.N(ds31.a(cVar), null, null, new ContactsSettingsViewModel$onSyncContactsChanged$1(cVar, null), 3);
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i(((Boolean) obj).booleanValue());
        return zy11.a;
    }
}
