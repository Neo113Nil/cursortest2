package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.voip.userid.CallsUserId;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.g1e0;
import xsna.j1x0;
import xsna.kr5;
import xsna.tlo0;
import xsna.w1x0;
import xsna.whg;
import xsna.x1x0;
import xsna.z1x0;

/* compiled from: VoipShareLinkPagerFeature.kt */
/* loaded from: classes7.dex */
public final class n1x0 extends wk50<a2x0, z1x0, w1x0, y1x0> {
    public final Peer f;
    public final a1w g;
    public final kdw0<mdw0> h;
    public final fow0 i;
    public final boolean j;
    public final h1x0 k;
    public final f4z<whg> l;
    public final f4z<x1x0> m;

    public n1x0(Peer peer, a1w a1wVar, kdw0<mdw0> kdw0Var, fow0 fow0Var, boolean z) {
        super(w1x0.b.b, new p1x0());
        this.f = peer;
        this.g = a1wVar;
        this.h = kdw0Var;
        this.i = fow0Var;
        this.j = z;
        h1x0 h1x0Var = new h1x0(new bpn0(new qpt0(4)));
        this.k = h1x0Var;
        h1x0Var.c();
        this.l = new f4z<>();
        this.m = new f4z<>();
    }

    public static tlo0.g U(qtd0 qtd0Var) {
        String d6 = qtd0Var.d6(UserNameCase.NOM);
        if (qtd0Var.B2() == UserSex.FEMALE) {
            tlo0.Companion.getClass();
            return tlo0.a.c(R.string.voip_share_link_pager_bottom_sheet_user_female_privacy_title, d6);
        }
        tlo0.Companion.getClass();
        return tlo0.a.c(R.string.voip_share_link_pager_bottom_sheet_user_privacy_title, d6);
    }

    @Override // xsna.wk50
    public final void N(z1x0 z1x0Var, w1x0 w1x0Var) {
        z1x0 z1x0Var2 = z1x0Var;
        w1x0 w1x0Var2 = w1x0Var;
        boolean equals = w1x0Var2.equals(w1x0.b.b);
        a1w a1wVar = this.g;
        if (equals) {
            g1e0.a aVar = new g1e0.a();
            aVar.b = Source.NETWORK;
            aVar.a.c(this.f);
            io.reactivex.rxjava3.internal.operators.single.c C = a1wVar.C(this, new d1e0(new g1e0(aVar)));
            o6k o6kVar = (o6k) p6k.a.getValue();
            a7f0.a.f(this, io.reactivex.rxjava3.core.x.B(C, o6kVar.a(o6kVar.b()), new f0j0(new z2(14), 15)), new ixu0(this, 6), new m0m0(11), 1);
            return;
        }
        boolean z = w1x0Var2 instanceof w1x0.c;
        kdw0<mdw0> kdw0Var = this.h;
        f4z<x1x0> f4zVar = this.m;
        if (z) {
            w1x0.c cVar = (w1x0.c) w1x0Var2;
            String str = cVar.d;
            if ((z1x0Var2 instanceof z1x0.a) && str.length() != 0) {
                if (cVar.b) {
                    a7f0.a.f(this, a1wVar.C(this, new pz30(((z1x0.a) z1x0Var2).e.B7(), str, null, null, null, null, null, null, null, null, null, null, null, 16380)), new puo0(3, this, z1x0Var2), new o7j0(19), 1);
                    return;
                }
                kdw0Var.b(new j1x0.b.e(((z1x0.a) z1x0Var2).d));
                f4zVar.b(new x1x0.b(str, cVar.c));
                f4zVar.b(x1x0.a.a);
                return;
            }
            return;
        }
        if (!(w1x0Var2 instanceof w1x0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (z1x0Var2 instanceof z1x0.a) {
            qtd0 qtd0Var = ((z1x0.a) z1x0Var2).e;
            boolean z2 = qtd0Var instanceof Contact;
            kdw0Var.b(new j1x0.b.a(z2));
            boolean z3 = this.j;
            f4z<whg> f4zVar2 = this.l;
            fow0 fow0Var = this.i;
            if (z2) {
                Serializer.c<? extends Serializer.StreamParcelable> cVar2 = CallsUserId.CREATOR;
                Contact contact = (Contact) qtd0Var;
                String str2 = contact.p;
                if (str2 == null) {
                    str2 = "";
                }
                Long n = arm0.n(str2);
                CallsUserId contactId = n == null ? new CallsUserId.ContactId(str2) : new CallsUserId.VkUserId(new UserId(n.longValue()));
                fow0Var.a(contactId, false);
                int i = (int) contact.b;
                String str3 = contact.c;
                ImageList imageList = contact.h;
                kr5.a aVar2 = new kr5.a(new com.vk.ecomm.catalog.impl.geo.a(qtd0Var));
                s3q0 s3q0Var = s3q0.a;
                f4zVar2.b(new whg.q(new t49(contactId, i, str3, imageList, aVar2.a()), z3, null));
            } else {
                UserId userId = new UserId(qtd0Var.G3());
                Serializer.c<? extends Serializer.StreamParcelable> cVar3 = CallsUserId.CREATOR;
                fow0Var.a(new CallsUserId.VkUserId(userId), false);
                f4zVar2.b(new whg.p(null, userId, z3));
            }
            f4zVar.b(x1x0.a.a);
        }
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.k.e();
    }
}
