package xsna;

import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsAuthor;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import xsna.wfu;

/* compiled from: ReloadGrid.kt */
/* loaded from: classes17.dex */
public final class itf0 extends lt6 {
    public final xde h;
    public final xde i;
    public final wce j;
    public final ClipGridParams k;
    public final Lazy<cpu> l;

    /* JADX WARN: Multi-variable type inference failed */
    public itf0(mde mdeVar, xde xdeVar, xde xdeVar2, wce wceVar, ClipGridParams clipGridParams, UserId userId, int i, wee weeVar, Lazy<? extends cpu> lazy, sdq0 sdq0Var) {
        super(mdeVar, userId, weeVar, new z490(true, o25.a().a(userId), userId.equals(o25.a().c()) || (i == 3), true, true), sdq0Var);
        this.h = xdeVar;
        this.i = xdeVar2;
        this.j = wceVar;
        this.k = clipGridParams;
        this.l = lazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.wfu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(wfu.a aVar, List<ClipGridParams.Data.Profile> list) {
        boolean z;
        List<VideoFile> list2;
        Iterator<T> it;
        Object obj;
        ClipGridParams.Data.Profile profile;
        List<ClipVideoFile> list3;
        AbstractClipsGridListFragment abstractClipsGridListFragment;
        mde mdeVar;
        Object obj2;
        ClipsAuthor clipsAuthor;
        xde xdeVar = this.h;
        wee weeVar = this.a;
        if (!(aVar instanceof wfu.a.b)) {
            weeVar.jm(null);
            return;
        }
        this.g = list;
        wfu.a.b bVar = (wfu.a.b) aVar;
        List<tce> list4 = bVar.d;
        nee neeVar = bVar.a;
        ClipGridParams.OnlyId.Profile profile2 = (ClipGridParams.OnlyId.Profile) this.k.zb();
        cpu value = this.l.getValue();
        UserId userId = profile2.b;
        if (!value.a(userId)) {
            Iterator<T> it2 = neeVar.l.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it2.next();
                    if (epx.f(((ClipGridParams.Data.Profile) obj2).b.b.b, userId)) {
                        break;
                    }
                }
            }
            ClipGridParams.Data.Profile profile3 = (ClipGridParams.Data.Profile) obj2;
            if (profile3 == null || (clipsAuthor = profile3.b) == null || clipsAuthor.h < 2) {
                weeVar.T1();
                return;
            }
        }
        if (neeVar.n.isEmpty()) {
            List<Pair<ClipVideoFile, ceq0>> list5 = bVar.c;
            if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                Iterator<T> it3 = list5.iterator();
                while (it3.hasNext()) {
                    if (epx.f(((ClipVideoFile) ((Pair) it3.next()).i()).b, userId)) {
                    }
                }
            }
            z = false;
            List<ClipVideoFile> list6 = neeVar.f;
            boolean z2 = !(list6 != null || list6.isEmpty());
            boolean z3 = !list4.isEmpty();
            list2 = neeVar.c;
            if (list2 != null) {
                list2.isEmpty();
            }
            boolean d = fkq0.d(userId);
            UserId userId2 = this.b;
            it = this.g.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (epx.f(((ClipGridParams.Data.Profile) obj).b.b.b, userId2)) {
                        break;
                    }
                }
            }
            profile = (ClipGridParams.Data.Profile) obj;
            if (profile != null) {
                Map<String, Long> map = profile.b.c;
                eoe eoeVar = (eoe) xdeVar.f.get(userId2);
                map.put("clips", Long.valueOf(eoeVar != null ? eoeVar.b + eoeVar.c : 0L));
                map.put("clips_views", Long.valueOf(neeVar.j));
                map.put("clips_likes", Long.valueOf(neeVar.k));
                map.put("lives", Long.valueOf(neeVar.d));
            }
            d(neeVar, z2, z3);
            xdeVar.b(profile2, neeVar.a, neeVar.b);
            this.i.b(profile2, neeVar.n, neeVar.o);
            list3 = neeVar.f;
            if (list3 != null && (mdeVar = this.f) != null) {
                String str = neeVar.g;
                mdeVar.b = null;
                mdeVar.b(str, list3);
            }
            wce wceVar = this.j;
            wceVar.b = list4;
            abstractClipsGridListFragment = wceVar.a;
            if (abstractClipsGridListFragment != null) {
                abstractClipsGridListFragment.po(list4, true);
            }
            weeVar.ql(z, z3, z2, d);
            weeVar.Yi();
        }
        z = true;
        List<ClipVideoFile> list62 = neeVar.f;
        boolean z22 = !(list62 != null || list62.isEmpty());
        boolean z32 = !list4.isEmpty();
        list2 = neeVar.c;
        if (list2 != null) {
        }
        boolean d2 = fkq0.d(userId);
        UserId userId22 = this.b;
        it = this.g.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        profile = (ClipGridParams.Data.Profile) obj;
        if (profile != null) {
        }
        d(neeVar, z22, z32);
        xdeVar.b(profile2, neeVar.a, neeVar.b);
        this.i.b(profile2, neeVar.n, neeVar.o);
        list3 = neeVar.f;
        if (list3 != null) {
            String str2 = neeVar.g;
            mdeVar.b = null;
            mdeVar.b(str2, list3);
        }
        wce wceVar2 = this.j;
        wceVar2.b = list4;
        abstractClipsGridListFragment = wceVar2.a;
        if (abstractClipsGridListFragment != null) {
        }
        weeVar.ql(z, z32, z22, d2);
        weeVar.Yi();
    }

    @Override // xsna.y490
    public final io.reactivex.rxjava3.core.x<nee> c() {
        z490 z490Var = this.c;
        return rsg0.w0(new a3q(this.b, z490Var.b, z490Var.c, z490Var.d));
    }
}
