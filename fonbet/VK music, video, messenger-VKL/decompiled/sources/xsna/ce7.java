package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.feed.blacklist.impl.presentation.blacklist.a;
import com.vk.feed.blacklist.impl.presentation.blacklist.d;
import com.vk.feed.blacklist.impl.presentation.blacklist.f;
import com.vk.feed.settings.impl.presentation.filtered.tab.b;
import com.vk.feed.settings.impl.presentation.filtered.tab.d;
import com.vk.feed.settings.impl.presentation.filtered.tab.f;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ce7 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ km50 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ce7(km50 km50Var, Object obj, Object obj2, int i) {
        this.b = i;
        this.c = km50Var;
        this.d = obj;
        this.e = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ke7 ke7Var = (ke7) this.c;
                a.d dVar = (a.d) this.d;
                com.vk.feed.blacklist.impl.presentation.blacklist.b bVar = (com.vk.feed.blacklist.impl.presentation.blacklist.b) this.e;
                ArrayList arrayList = new ArrayList(ke7Var.d);
                int indexOf = arrayList.indexOf(dVar.b);
                UserId userId = (UserId) j5g.b0(indexOf, arrayList);
                if (userId != null) {
                    arrayList.remove(indexOf);
                    bVar.g.b(new f.b.C1035b(userId, indexOf, ke7Var.e.get(userId)));
                    int i = ke7Var.b - 1;
                    int i2 = i < 0 ? 0 : i;
                    int i3 = ke7Var.c - 1;
                    bVar.T(new d.b(arrayList, ke7Var.e, ke7Var.f, i2, i3 < 0 ? 0 : i3));
                    break;
                }
                break;
            default:
                ti60 ti60Var = (ti60) this.c;
                com.vk.feed.settings.impl.presentation.filtered.tab.c cVar = (com.vk.feed.settings.impl.presentation.filtered.tab.c) this.d;
                b.f fVar = (b.f) this.e;
                ArrayList arrayList2 = new ArrayList(ti60Var.c);
                UserId userId2 = fVar.b;
                Iterator it = arrayList2.iterator();
                int i4 = 0;
                while (true) {
                    if (it.hasNext()) {
                        t230 t230Var = (t230) it.next();
                        if (!(t230Var instanceof UserProfile ? epx.f(((UserProfile) t230Var).c, userId2) : t230Var instanceof Group ? epx.f(((Group) t230Var).c, userId2) : false)) {
                            i4++;
                        }
                    } else {
                        i4 = -1;
                    }
                }
                t230 t230Var2 = (t230) j5g.b0(i4, arrayList2);
                if (t230Var2 != null) {
                    arrayList2.remove(i4);
                    cVar.V(new f.d.b(fVar.b, t230Var2, i4));
                }
                int i5 = ti60Var.b - 1;
                int i6 = i5 >= 0 ? i5 : 0;
                cVar.V(new f.b.a(cVar.g, i6));
                cVar.T(new d.C1063d(arrayList2, i6));
                break;
        }
    }
}
