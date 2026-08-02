package xsna;

import com.vk.channels.impl.comments.g;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.users.UserNameCase;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import xsna.oem0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class xva implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xva(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        String d6;
        switch (this.b) {
            case 0:
                com.vk.channels.impl.comments.b bVar = (com.vk.channels.impl.comments.b) this.d;
                LinkedHashSet linkedHashSet = bVar.n;
                hag hagVar = (hag) this.e;
                com.vk.channels.impl.comments.g gVar = (com.vk.channels.impl.comments.g) obj;
                g.b bVar2 = gVar.c;
                Integer b = bVar2 != null ? bVar2.b() : null;
                mwa mwaVar = bVar.k;
                ttp0.a(linkedHashSet).remove(b);
                int i = hagVar.a;
                UserId userId = hagVar.b;
                linkedHashSet.add(Integer.valueOf(i));
                List s = com.vk.channels.impl.comments.b.s(bVar, mwaVar.a(), false, 3);
                qtd0 zb = mwaVar.a().c.zb(com.vk.dto.common.a.a(userId));
                String str2 = "";
                if (zb == null || (str = zb.d6(UserNameCase.DAT)) == null) {
                    str = "";
                }
                if (zb != null && (d6 = zb.d6(UserNameCase.NOM)) != null) {
                    str2 = d6;
                }
                return bVar2 == null ? com.vk.channels.impl.comments.g.a(gVar, null, null, null, false, 15) : com.vk.channels.impl.comments.g.a(gVar, s, null, new g.b(new g.b.a.c(this.c, userId, str, str2)), false, 10);
            case 1:
                return new io.reactivex.rxjava3.internal.operators.observable.t(new leh((neh) this.d, this.c, (ExtendedUserProfile) this.e));
            default:
                final zgm0 zgm0Var = (zgm0) this.d;
                UserId userId2 = (UserId) this.e;
                c3m0 c3m0Var = (c3m0) obj;
                cfm0 cfm0Var = (cfm0) zgm0Var.b.c.b;
                String str3 = c3m0Var.a;
                String str4 = c3m0Var.b;
                String str5 = c3m0Var.c;
                List<vdm0> list = c3m0Var.d;
                int i2 = 10;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    vdm0 vdm0Var = (vdm0) it.next();
                    String str6 = vdm0Var.a;
                    ArrayList<wdm0> arrayList2 = vdm0Var.b;
                    ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, i2));
                    for (wdm0 wdm0Var : arrayList2) {
                        arrayList3.add(new nem0(wdm0Var.a, wdm0Var.b, wdm0Var.c));
                        it = it;
                    }
                    arrayList.add(new lem0(str6, arrayList3));
                    it = it;
                    i2 = 10;
                }
                efm0 efm0Var = new efm0(str3, str4, str5, arrayList);
                final int i3 = this.c;
                cfm0Var.c(new ffm0(userId2, i3, efm0Var)).g(new io.reactivex.rxjava3.functions.a() { // from class: xsna.tgm0
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        zgm0.this.d.a(new oem0.a.C3452a(i3));
                    }
                }).subscribe();
                return s3q0.a;
        }
    }
}
