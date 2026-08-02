package xsna;

import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.users.User;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class adj implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ adj(ArrayList arrayList, int i) {
        this.b = i;
        this.c = arrayList;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Long l;
        switch (this.b) {
            case 0:
                t8j t8jVar = (t8j) obj;
                qtd0 qtd0Var = t8jVar.b;
                User user = qtd0Var instanceof User ? (User) qtd0Var : null;
                ArrayList<t8j> arrayList = this.c;
                boolean z = true;
                if (user != null && (l = user.c) != null) {
                    final long longValue = l.longValue();
                    g5g.D(arrayList, true, new izs() { // from class: xsna.bdj
                        @Override // xsna.izs
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(((t8j) obj2).j == longValue);
                        }
                    });
                }
                if (!arrayList.isEmpty()) {
                    for (t8j t8jVar2 : arrayList) {
                        int i = t8jVar.c;
                        int i2 = t8jVar2.c;
                        qtd0 qtd0Var2 = t8jVar2.b;
                        if (i != i2 || qtd0Var.G3() != qtd0Var2.G3()) {
                            Contact contact = qtd0Var instanceof Contact ? (Contact) qtd0Var : null;
                            if (epx.f(contact != null ? contact.j : null, qtd0Var2.getId())) {
                            }
                        }
                        return Boolean.valueOf(z);
                        break;
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(this.c.contains(((jis) obj).a));
        }
    }
}
