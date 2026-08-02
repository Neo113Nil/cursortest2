package xsna;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.List;

/* compiled from: ContactsModel.kt */
/* loaded from: classes2.dex */
public final class icj implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ icj(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                com.vk.im.ui.components.contacts.b bVar = (com.vk.im.ui.components.contacts.b) this.c;
                io.reactivex.rxjava3.subjects.d<gdj> dVar = bVar.o;
                gdj d = bVar.d();
                sbj sbjVar = bVar.d().e;
                List list = (List) this.d;
                dVar.onNext(gdj.a(d, null, sbj.a(sbjVar, null, list.subList(0, Math.min(list.size(), 5)), null, null, null, false, null, 65527), null, null, null, false, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS));
                break;
            default:
                ((hjs0) this.c).c.invoke((atp) this.d);
                break;
        }
        return s3q0.a;
    }
}
