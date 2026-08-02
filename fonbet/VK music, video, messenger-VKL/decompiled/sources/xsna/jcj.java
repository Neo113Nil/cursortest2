package xsna;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: ContactsModel.kt */
/* loaded from: classes2.dex */
public final class jcj implements gzs<s3q0> {
    public final /* synthetic */ com.vk.im.ui.components.contacts.b b;
    public final /* synthetic */ List c;
    public final /* synthetic */ com.vk.im.ui.components.contacts.b d;

    public jcj(com.vk.im.ui.components.contacts.b bVar, List list, com.vk.im.ui.components.contacts.b bVar2) {
        this.b = bVar;
        this.c = list;
        this.d = bVar2;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        com.vk.im.ui.components.contacts.b bVar = this.b;
        io.reactivex.rxjava3.subjects.d<gdj> dVar = bVar.o;
        gdj d = bVar.d();
        sbj sbjVar = bVar.d().e;
        List list = this.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            qtd0 qtd0Var = (qtd0) obj;
            List<qtd0> list2 = this.d.d().g;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (qtd0Var.getId().equals(((qtd0) it.next()).getId())) {
                        break;
                    }
                }
            }
            arrayList.add(obj);
        }
        dVar.onNext(gdj.a(d, null, sbj.a(sbjVar, null, null, null, null, arrayList, false, null, 65279), null, null, null, false, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS));
        return s3q0.a;
    }
}
