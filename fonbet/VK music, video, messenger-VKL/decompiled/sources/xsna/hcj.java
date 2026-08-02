package xsna;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.contacts.ContactSyncState;

/* compiled from: ContactsModel.kt */
/* loaded from: classes2.dex */
public final class hcj implements gzs<s3q0> {
    public final /* synthetic */ com.vk.im.ui.components.contacts.b b;
    public final /* synthetic */ ContactSyncState c;

    public hcj(com.vk.im.ui.components.contacts.b bVar, ContactSyncState contactSyncState) {
        this.b = bVar;
        this.c = contactSyncState;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        com.vk.im.ui.components.contacts.b bVar = this.b;
        bVar.o.onNext(gdj.a(bVar.d(), null, sbj.a(bVar.d().e, this.c, null, null, null, null, false, null, 65534), null, null, null, false, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS));
        return s3q0.a;
    }
}
