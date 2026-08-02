package xsna;

import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsAuthor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import xsna.wfu;

/* compiled from: FullGrid.kt */
/* loaded from: classes17.dex */
public final class yus extends lt6 {
    public final xde h;
    public final xde i;
    public final wce j;
    public final ClipGridParams k;
    public final int l;
    public final ibr0 m;
    public final Lazy<cpu> n;
    public final zof o;

    /* compiled from: FullGrid.kt */
    public static final class a {
    }

    public yus(mde mdeVar, xde xdeVar, xde xdeVar2, wce wceVar, ClipGridParams clipGridParams, wee weeVar, ibr0 ibr0Var, Lazy lazy, sdq0 sdq0Var, zof zofVar) {
        super(mdeVar, ((ClipGridParams.OnlyId.Profile) clipGridParams.zb()).b, weeVar, new z490(true, o25.a().a(((ClipGridParams.OnlyId.Profile) clipGridParams.zb()).b), o25.a().a(((ClipGridParams.OnlyId.Profile) clipGridParams.zb()).b), true, true), sdq0Var);
        this.h = xdeVar;
        this.i = xdeVar2;
        this.j = wceVar;
        this.k = clipGridParams;
        this.l = 3;
        this.m = ibr0Var;
        this.n = lazy;
        this.o = zofVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    @Override // xsna.wfu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(wfu.a aVar, List<ClipGridParams.Data.Profile> list) {
        boolean z;
        List<ClipVideoFile> list2;
        AbstractClipsGridListFragment abstractClipsGridListFragment;
        mde mdeVar;
        Object obj;
        ClipsAuthor clipsAuthor;
        boolean z2 = aVar instanceof wfu.a.b;
        wee weeVar = this.a;
        if (!z2) {
            weeVar.jm(null);
            return;
        }
        this.g = list;
        ClipGridParams.OnlyId.Profile profile = (ClipGridParams.OnlyId.Profile) this.k.zb();
        wfu.a.b bVar = (wfu.a.b) aVar;
        List<tce> list3 = bVar.d;
        nee neeVar = bVar.a;
        cpu value = this.n.getValue();
        UserId userId = profile.b;
        if (!value.a(userId)) {
            Iterator<T> it = neeVar.l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (epx.f(((ClipGridParams.Data.Profile) obj).b.b.b, userId)) {
                        break;
                    }
                }
            }
            ClipGridParams.Data.Profile profile2 = (ClipGridParams.Data.Profile) obj;
            if (profile2 == null || (clipsAuthor = profile2.b) == null || clipsAuthor.h < 2) {
                weeVar.T1();
                return;
            }
        }
        List<ClipVideoFile> list4 = neeVar.f;
        boolean z3 = !(list4 == null || list4.isEmpty());
        if (neeVar.n.isEmpty()) {
            List<Pair<ClipVideoFile, ceq0>> list5 = bVar.c;
            if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                Iterator<T> it2 = list5.iterator();
                while (it2.hasNext()) {
                    if (epx.f(((ClipVideoFile) ((Pair) it2.next()).i()).b, userId)) {
                    }
                }
            }
            z = false;
            boolean z4 = !list3.isEmpty();
            g620.f().h().getClass();
            boolean d = fkq0.d(userId);
            d(neeVar, z3, z4);
            UserId userId2 = this.b;
            this.h.i(profile, e(bVar, userId2, false));
            this.i.i(profile, e(bVar, userId2, true));
            list2 = neeVar.f;
            if (list2 != null && (mdeVar = this.f) != null) {
                String str = neeVar.g;
                mdeVar.b = null;
                mdeVar.b(str, list2);
            }
            wce wceVar = this.j;
            wceVar.b = list3;
            abstractClipsGridListFragment = wceVar.a;
            if (abstractClipsGridListFragment != null) {
                abstractClipsGridListFragment.po(list3, true);
            }
            weeVar.ql(z, z4, z3, d);
            weeVar.Yi();
        }
        z = true;
        boolean z42 = !list3.isEmpty();
        g620.f().h().getClass();
        boolean d2 = fkq0.d(userId);
        d(neeVar, z3, z42);
        UserId userId22 = this.b;
        this.h.i(profile, e(bVar, userId22, false));
        this.i.i(profile, e(bVar, userId22, true));
        list2 = neeVar.f;
        if (list2 != null) {
            String str2 = neeVar.g;
            mdeVar.b = null;
            mdeVar.b(str2, list2);
        }
        wce wceVar2 = this.j;
        wceVar2.b = list3;
        abstractClipsGridListFragment = wceVar2.a;
        if (abstractClipsGridListFragment != null) {
        }
        weeVar.ql(z, z42, z3, d2);
        weeVar.Yi();
    }

    @Override // xsna.y490
    public final io.reactivex.rxjava3.core.x<nee> c() {
        return new io.reactivex.rxjava3.internal.operators.single.c(new kee(new lee(this.b, PaginationKey.Initial.b, this.l, o25.a().a(this.b), true, this.o)));
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.Map] */
    public final LinkedHashMap e(wfu.a.b bVar, UserId userId, boolean z) {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        nee neeVar = bVar.a;
        List<Pair<ClipVideoFile, ceq0>> list = z ? bVar.c : bVar.b;
        List<ClipGridParams.Data.Profile> list2 = this.g;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ClipGridParams.Data.Profile) it.next()).b.b.b);
        }
        Iterator it2 = arrayList.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                e43.t();
                throw null;
            }
            UserId userId2 = (UserId) next;
            Long l = (Long) neeVar.m.get(userId2);
            long longValue = l != null ? l.longValue() : 0L;
            List<Pair<ClipVideoFile, ceq0>> list3 = list;
            if ((list3 instanceof Collection) && list3.isEmpty()) {
                i = 0;
            } else {
                Iterator<T> it3 = list3.iterator();
                i = 0;
                while (it3.hasNext()) {
                    ceq0 ceq0Var = (ceq0) ((Pair) it3.next()).g();
                    if (epx.f(ceq0Var != null ? ceq0Var.q() : null, userId2) && (i = i + 1) < 0) {
                        e43.s();
                        throw null;
                    }
                }
            }
            eoe eoeVar = new eoe(userId2, longValue, i, this.m);
            boolean equals = userId2.equals(userId);
            ArrayList arrayList2 = new ArrayList(c5g.u(list3, i2));
            Iterator<T> it4 = list3.iterator();
            while (it4.hasNext()) {
                Pair pair = (Pair) it4.next();
                arrayList2.add(new uee((ClipVideoFile) pair.i(), (ceq0) pair.j(), null));
                list = list;
            }
            List<Pair<ClipVideoFile, ceq0>> list4 = list;
            eoeVar.h.onNext(arrayList2);
            if (equals) {
                if (z) {
                    eoeVar.a(neeVar.n, neeVar.o, false);
                } else {
                    eoeVar.a(neeVar.a, neeVar.b, false);
                }
            }
            if (!z) {
                this.g.get(i3).b.c.put("clips", Long.valueOf(eoeVar.b + eoeVar.c));
            }
            linkedHashMap.put(userId2, eoeVar);
            i3 = i4;
            list = list4;
            i2 = 10;
        }
        return linkedHashMap;
    }
}
