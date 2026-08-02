package com.yandex.go.trusted_contacts.ui;

import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactDto;
import com.yandex.go.trusted_contacts.domain.entities.ShareSettingsMode;
import defpackage.o7r0;
import defpackage.sh11;
import defpackage.tls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* synthetic */ class TrustedContactsModalView$onAttachedToWindow$4 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = (String) obj;
        sh11 sh11Var = (sh11) this.receiver;
        TrustedContactDto d = sh11Var.y.a.d(str);
        o7r0 o7r0Var = (o7r0) sh11Var.z.c;
        o7r0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", str);
        o7r0Var.a.a("TrustedContacts.EditContactButtonTapped", hashMap, 1, new HashMap());
        sh11Var.x.a(d, ShareSettingsMode.EDIT);
        return zy11.a;
    }
}
