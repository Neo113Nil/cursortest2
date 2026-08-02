package xsna;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.List;

/* compiled from: ContactsModel.kt */
/* loaded from: classes2.dex */
public final class kcj implements gzs<s3q0> {
    public final /* synthetic */ com.vk.im.ui.components.contacts.b b;
    public final /* synthetic */ List c;

    public kcj(com.vk.im.ui.components.contacts.b bVar, List list) {
        this.b = bVar;
        this.c = list;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        com.vk.im.ui.components.contacts.b bVar = this.b;
        bVar.o.onNext(gdj.a(bVar.d(), null, sbj.a(bVar.d().e, null, null, null, this.c, null, false, null, 65407), null, null, null, false, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS));
        return s3q0.a;
    }
}
