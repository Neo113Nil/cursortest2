package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.model.CommunityRepliesArgs;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.a7f0;
import xsna.h2g0;
import xsna.i2g0;
import xsna.pwh;
import xsna.w1g0;

/* compiled from: CommunityRepliesFeature.kt */
/* loaded from: classes18.dex */
public final class jwh extends wk50<wwh, vwh, w1g0, pwh> {
    public final CommunityRepliesArgs f;
    public final zxh g;
    public final mzp0 h;
    public final b25 i;
    public final f4z j;
    public final f4z k;
    public final up2 l;

    public jwh(CommunityRepliesArgs communityRepliesArgs, uwh uwhVar, zxh zxhVar, mzp0 mzp0Var, b25 b25Var) {
        super(w1g0.a.b, uwhVar);
        this.f = communityRepliesArgs;
        this.g = zxhVar;
        this.h = mzp0Var;
        this.i = b25Var;
        this.j = new f4z();
        this.k = new f4z();
        this.l = new up2();
    }

    @Override // xsna.wk50
    public final void N(vwh vwhVar, w1g0 w1g0Var) {
        CharSequence charSequence;
        String obj;
        UserId userId;
        UserId userId2;
        vwh vwhVar2 = vwhVar;
        w1g0 w1g0Var2 = w1g0Var;
        txh txhVar = vwhVar2.h;
        Throwable th = vwhVar2.m;
        int i = vwhVar2.g;
        Integer num = vwhVar2.r;
        boolean z = vwhVar2.e;
        boolean z2 = vwhVar2.n;
        boolean z3 = vwhVar2.p;
        boolean z4 = vwhVar2.o;
        int i2 = vwhVar2.b;
        UserId userId3 = vwhVar2.d;
        yig0 yig0Var = vwhVar2.j;
        Map<Integer, k4g0> map = vwhVar2.i;
        boolean equals = w1g0Var2.equals(w1g0.a.b);
        zxh zxhVar = this.g;
        if (equals) {
            W(vwhVar2);
            CommunityRepliesArgs communityRepliesArgs = this.f;
            if (communityRepliesArgs != null) {
                a7f0.a.e(this, zxhVar.c.i(communityRepliesArgs.b), null, new pz(this, 23), new qm(13), null, 9);
                return;
            }
            return;
        }
        boolean equals2 = w1g0Var2.equals(w1g0.b.b);
        f4z f4zVar = this.k;
        if (equals2) {
            f4zVar.b(new h2g0.b(vwhVar2.s));
            return;
        }
        if (w1g0Var2.equals(w1g0.m.b)) {
            T(pwh.h.b);
            W(vwhVar2);
            return;
        }
        if (w1g0Var2.equals(w1g0.d.b)) {
            if (z4 || z3 || z2 || i <= 0 || th == null) {
                return;
            }
            X(vwhVar2);
            return;
        }
        if (w1g0Var2.equals(w1g0.l.b)) {
            if (map.size() >= i || z2 || z3 || vwhVar2.l || z4) {
                return;
            }
            if (i <= 0 || th == null) {
                X(vwhVar2);
                return;
            }
            return;
        }
        if (w1g0Var2.equals(w1g0.c.b)) {
            W(vwhVar2);
            return;
        }
        boolean equals3 = w1g0Var2.equals(w1g0.f.b);
        f4z f4zVar2 = this.j;
        if (equals3) {
            UserId userId4 = yig0Var.d;
            if (userId4 == null) {
                userId4 = UserId.d;
            }
            f4zVar2.b(new i2g0.c(userId3, userId4));
            return;
        }
        if (w1g0Var2.equals(w1g0.i.b)) {
            T(qwh.b);
            return;
        }
        if (w1g0Var2.equals(w1g0.h.b)) {
            if (num != null) {
                f4zVar.b(new h2g0.e("", EmptyList.b));
                T(qwh.b);
                return;
            }
            Integer num2 = yig0Var.b;
            if (num2 == null) {
                f4zVar.b(h2g0.d.a);
                return;
            } else {
                Y(num2, vwhVar2);
                return;
            }
        }
        if (w1g0Var2 instanceof w1g0.p) {
            Z(((w1g0.p) w1g0Var2).b, vwhVar2);
            return;
        }
        int i3 = 2;
        int i4 = 1;
        if (w1g0Var2 instanceof w1g0.j) {
            w1g0.j jVar = (w1g0.j) w1g0Var2;
            String str = jVar.b;
            List<Attachment> list = jVar.c;
            if (num == null) {
                Z(true, vwhVar2);
                int i5 = vwhVar2.b;
                Integer num3 = yig0Var.b;
                UserId userId5 = yig0Var.d;
                if (userId5 == null) {
                    return;
                }
                a7f0.a.f(this, zxhVar.b.c(i5, userId5, num3, str, pq20.c(zxhVar.f, list)).l(new q7(yxh.b, 13)), new wje(this, 6), new defpackage.m(11, this, vwhVar2), 1);
                return;
            }
            Z(true, vwhVar2);
            k4g0 k4g0Var = map.get(num);
            if (k4g0Var == null) {
                return;
            }
            CharSequence charSequence2 = k4g0Var.f;
            List<Attachment> list2 = k4g0Var.j;
            if (str.equals(charSequence2) && epx.f(list, list2)) {
                T(qwh.b);
                f4zVar.b(new h2g0.e("", EmptyList.b));
                return;
            } else {
                if (num != null) {
                    a7f0.a.f(this, zxhVar.b.e(i2, num.intValue(), str, pq20.c(zxhVar.f, list)), new igh(this, i3), new qd1(9, this, vwhVar2), 1);
                    return;
                }
                return;
            }
        }
        if (w1g0Var2 instanceof w1g0.e) {
            UserId userId6 = yig0Var.d;
            if (userId6 == null) {
                userId6 = vwhVar2.c;
            }
            if (!z) {
                userId3 = userId6;
            }
            w1g0.e eVar = (w1g0.e) w1g0Var2;
            Integer num4 = eVar.b;
            Integer num5 = eVar.c;
            T(new rwh(num4, num5, eVar.d, userId3));
            if (num5 != null) {
                f4zVar.b(h2g0.d.a);
                return;
            } else {
                Y(num4, vwhVar2);
                return;
            }
        }
        if (w1g0Var2 instanceof w1g0.g) {
            T(new twh(((w1g0.g) w1g0Var2).b));
            return;
        }
        if (w1g0Var2 instanceof w1g0.k) {
            f4zVar2.b(new i2g0.d(((w1g0.k) w1g0Var2).b));
            return;
        }
        int i6 = 10;
        if (w1g0Var2 instanceof w1g0.o) {
            w1g0.o oVar = (w1g0.o) w1g0Var2;
            if (oVar instanceof w1g0.o.a) {
                if (txhVar == null) {
                    return;
                }
                T(new pwh.m(txh.a(txhVar, 0, false, !txhVar.h, false, null, false, 2097023)));
                return;
            }
            if (!(oVar instanceof w1g0.o.c) || txhVar == null) {
                return;
            }
            int i7 = ((w1g0.o.c) oVar).b;
            List<List<jxh>> list3 = txhVar.i;
            ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                List<jxh> list4 = (List) it.next();
                ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
                String str2 = null;
                for (jxh jxhVar : list4) {
                    if (str2 == null) {
                        str2 = jxhVar.d;
                    }
                    arrayList2.add(new ImageSize(jxhVar.a, jxhVar.b, jxhVar.c, null, (char) 0, false, 56, null));
                }
                arrayList.add(new y2u0(arrayList2, str2 != null ? arm0.m(10, str2) : null));
            }
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new Image(((y2u0) it2.next()).b));
            }
            if (((Image) j5g.b0(i7, arrayList3)) != null) {
                f4zVar2.b(new i2g0.b(arrayList3, i7));
                return;
            }
            return;
        }
        if (w1g0Var2 instanceof w1g0.n) {
            w1g0.n nVar = (w1g0.n) w1g0Var2;
            if (nVar instanceof w1g0.n.a) {
                int i8 = ((w1g0.n.a) nVar).b;
                k4g0 k4g0Var2 = map.get(Integer.valueOf(i8));
                if (k4g0Var2 == null) {
                    return;
                }
                String obj2 = k4g0Var2.f.toString();
                boolean z5 = k4g0Var2.g;
                boolean z6 = k4g0Var2.i;
                boolean z7 = k4g0Var2.e;
                this.l.getClass();
                ListBuilder k = up2.k(obj2, z5, z6, z7);
                if (k == null) {
                    return;
                }
                f4zVar2.b(new i2g0.a(i8, k));
                return;
            }
            if (nVar instanceof w1g0.n.c) {
                int i9 = ((w1g0.n.c) nVar).b;
                k4g0 k4g0Var3 = map.get(Integer.valueOf(i9));
                if (k4g0Var3 == null) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put(Integer.valueOf(i9), k4g0.a(k4g0Var3, false, true, 2047));
                T(new pwh.l(linkedHashMap));
                return;
            }
            if (nVar instanceof w1g0.n.b) {
                Z(true, vwhVar2);
                a7f0.a.d(this, zxhVar.b.d(i2, ((w1g0.n.b) nVar).b), null, new ku1(11, this, vwhVar2), new j2b(this, vwhVar2, nVar, i3), 1);
                return;
            }
            if (nVar instanceof a2g0) {
                int i10 = ((a2g0) nVar).b;
                k4g0 k4g0Var4 = map.get(Integer.valueOf(i10));
                if (k4g0Var4 == null) {
                    return;
                }
                big0 big0Var = k4g0Var4.c;
                if (!z) {
                    if (big0Var == null || (userId = big0Var.a) == null) {
                        userId = UserId.d;
                    }
                    C(new w1g0.e(userId, Integer.valueOf(i10), null));
                    return;
                }
                if (big0Var == null || (userId2 = big0Var.a) == null) {
                    userId2 = UserId.d;
                }
                T(new rwh(Integer.valueOf(i10), null, userId2, userId3));
                Y(Integer.valueOf(i10), vwhVar2);
                return;
            }
            if (nVar instanceof x1g0) {
                k4g0 k4g0Var5 = map.get(Integer.valueOf(((x1g0) nVar).b));
                if (k4g0Var5 == null || (charSequence = k4g0Var5.f) == null || (obj = charSequence.toString()) == null) {
                    return;
                }
                f4zVar.b(new h2g0.a(obj));
                f4zVar.b(new h2g0.f(tq.h(tlo0.Companion, R.string.text_copied)));
                return;
            }
            if (nVar instanceof y1g0) {
                Z(true, vwhVar2);
                a7f0.a.d(this, zxhVar.b.a(i2, ((y1g0) nVar).b), null, new ri0(i6, this, vwhVar2), new wy0(this, vwhVar2, nVar, i4), 1);
            } else {
                if (!(nVar instanceof z1g0)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i11 = ((z1g0) nVar).b;
                k4g0 k4g0Var6 = map.get(Integer.valueOf(i11));
                if (k4g0Var6 == null) {
                    return;
                }
                T(new swh(k4g0Var6.a));
                f4zVar.b(new h2g0.e(k4g0Var6.f.toString(), k4g0Var6.j));
                Y(Integer.valueOf(i11), vwhVar2);
            }
        }
    }

    public final wj50<i2g0> U() {
        return this.j;
    }

    public final wj50<h2g0> V() {
        return this.k;
    }

    public final void W(vwh vwhVar) {
        CommunityRepliesArgs communityRepliesArgs = this.f;
        if (communityRepliesArgs == null) {
            T(pwh.c.b);
            return;
        }
        int i = communityRepliesArgs.c;
        T(pwh.f.b);
        T(new pwh.j(i, communityRepliesArgs.b, this.i.c()));
        mzp0 mzp0Var = this.h;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        Map<UserId, big0> map = vwhVar.k;
        zxh zxhVar = this.g;
        a7f0.a.f(this, zxhVar.a.e(i, zxhVar.h).l(new s7(new ya(13, zxhVar, map), 11)), new yad(this, 13), new sz(this, 27), 1);
    }

    public final void X(vwh vwhVar) {
        T(pwh.k.b);
        int i = vwhVar.b;
        int i2 = vwhVar.f;
        zxh zxhVar = this.g;
        a7f0.a.f(this, zxhVar.b.b(i, Integer.valueOf(i2), zxhVar.h).l(new bl(new z2e(zxhVar, i, 2), 20)), new sh3(15, this, vwhVar), new wcg(this, 2), 1);
    }

    public final void Y(Integer num, vwh vwhVar) {
        k4g0 k4g0Var = vwhVar.i.get(num);
        if (k4g0Var != null) {
            this.k.b(new h2g0.c(k4g0Var.k));
        }
    }

    public final void Z(boolean z, vwh vwhVar) {
        if (z && !vwhVar.q) {
            T(new pwh.i(true));
        } else {
            if (z || !vwhVar.q) {
                return;
            }
            T(new pwh.i(false));
        }
    }
}
