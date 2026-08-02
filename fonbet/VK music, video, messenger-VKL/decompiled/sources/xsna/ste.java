package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoChangePlaylistPositionDto;
import com.vk.clips.playlists.ClipsPlaylistsFolderLaunchParams;
import com.vk.clips.playlists.model.PlaylistRawId;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.common.id.UserId;
import com.vk.internal.api.GsonHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.a7f0;
import xsna.aue;
import xsna.jte;
import xsna.kte;
import xsna.ute;
import xsna.vte;
import xsna.zte;

/* compiled from: ClipsPlaylistsFoldersFeature.kt */
/* loaded from: classes16.dex */
public final class ste extends wk50<cue, aue, jte, vte> {
    public final kue f;
    public final List<UserId> g;
    public final mhd h;
    public final int i;
    public final f4z<ute> j;
    public final f4z<zte> k;

    public ste() {
        throw null;
    }

    public ste(ClipsPlaylistsFolderLaunchParams.FoldersLaunchType foldersLaunchType, kue kueVar, List list, mhd mhdVar) {
        super(new jte.m(foldersLaunchType, list), new xte(new aue.c(foldersLaunchType, new kte(new kte.d(list), (UserId) j5g.Y(list)))));
        this.f = kueVar;
        this.g = list;
        this.h = mhdVar;
        this.i = 15;
        this.j = new f4z<>();
        this.k = new f4z<>();
    }

    public static Set U(UserId userId, Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            PlaylistRawId playlistRawId = (PlaylistRawId) it.next();
            Integer valueOf = playlistRawId.b.equals(userId) ? Integer.valueOf(playlistRawId.c) : null;
            if (valueOf != null) {
                arrayList.add(valueOf);
            }
        }
        return j5g.S0(arrayList);
    }

    @Override // xsna.wk50
    public final void N(aue aueVar, jte jteVar) {
        aue aueVar2 = aueVar;
        jte jteVar2 = jteVar;
        boolean equals = jteVar2.equals(jte.c.b);
        f4z<ute> f4zVar = this.j;
        if (equals) {
            if (aueVar2 instanceof aue.b) {
                aue.b bVar = (aue.b) aueVar2;
                if (!(bVar.b instanceof ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.Reorder)) {
                    int i = bVar.d;
                    Integer num = bVar.g;
                    if (i < (num != null ? num.intValue() : 0)) {
                        f4zVar.b(new ute.a(bVar.e.b));
                        return;
                    }
                }
            }
            this.k.b(zte.a.a);
            return;
        }
        Object obj = null;
        if (jteVar2 instanceof jte.e) {
            if (!(aueVar2 instanceof aue.b)) {
                fp.d("You should call ItemClick only from Loaded state");
                return;
            }
            aue.b bVar2 = (aue.b) aueVar2;
            int i2 = ((jte.e) jteVar2).b;
            ClipsPlaylistsFolderLaunchParams.FoldersLaunchType foldersLaunchType = bVar2.b;
            if (!(foldersLaunchType instanceof ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.SinglePick)) {
                if (foldersLaunchType instanceof ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.MultiPick) {
                    T(new vte.c(i2));
                    return;
                } else {
                    if (!(foldersLaunchType instanceof ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.Reorder)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fp.d("Item selection is not available in REORDER state");
                    return;
                }
            }
            Iterator<T> it = bVar2.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((mqe) ((Pair) next).i()).a == i2) {
                    obj = next;
                    break;
                }
            }
            Pair pair = (Pair) obj;
            if (pair == null) {
                throw new IllegalStateException("Selected unavailable clip");
            }
            if (((Boolean) pair.j()).booleanValue()) {
                Object obj2 = lqe.a;
                mqe mqeVar = (mqe) pair.i();
                f4zVar.b(new ute.c(new ClipsPlaylist(mqeVar.a, mqeVar.c, lqe.b(mqeVar.b), mqeVar.d, mqeVar.e, true, null, 64, null)));
            } else {
                Object obj3 = lqe.a;
                mqe mqeVar2 = (mqe) pair.i();
                f4zVar.b(new ute.d(new ClipsPlaylist(mqeVar2.a, mqeVar2.c, lqe.b(mqeVar2.b), mqeVar2.d, mqeVar2.e, true, null, 64, null)));
            }
            T(new vte.c(i2));
            return;
        }
        if (jteVar2 instanceof jte.f) {
            if (!(aueVar2 instanceof aue.b)) {
                fp.d("You should call ItemClick only from Loaded state");
                return;
            } else {
                jte.f fVar = (jte.f) jteVar2;
                T(new vte.b(fVar.b, fVar.c));
                return;
            }
        }
        boolean z = jteVar2 instanceof jte.m;
        int i3 = this.i;
        vte.e eVar = vte.e.b;
        kue kueVar = this.f;
        if (z) {
            jte.m mVar = (jte.m) jteVar2;
            List<UserId> list = mVar.c;
            T(eVar);
            com.vk.core.utils.newtork.b.a.getClass();
            a7f0.a.e(this, com.vk.core.utils.newtork.b.f(), null, new xcd(this, 2), null, null, 13);
            UserId userId = (UserId) j5g.Y(list);
            List<String> list2 = kue.g;
            a7f0.a.f(this, io.reactivex.rxjava3.core.x.B(kueVar.d(i3, userId, null), !(mVar.b instanceof ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.Reorder) ? kueVar.e(list) : io.reactivex.rxjava3.core.x.k(EmptyList.b), new t34(new qte(0), 9)).f(1L, TimeUnit.SECONDS), new rte(this, mVar, userId, 0), new nm1(6, this, mVar), 1);
            return;
        }
        if (jteVar2 instanceof jte.a) {
            if (!(aueVar2 instanceof aue.b)) {
                fp.d("You should call ScrolledToEnd only from Loaded state");
                return;
            }
            aue.b bVar3 = (aue.b) aueVar2;
            String str = bVar3.f;
            if (str == null) {
                return;
            }
            a7f0.a.f(this, kueVar.d(i3, bVar3.e.b, str), new s53(10, this, bVar3), new u8(this, 29), 1);
            return;
        }
        if (jteVar2 instanceof jte.h) {
            if (!epx.f(aueVar2.R2(), ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.Reorder.b)) {
                fp.d("Reorder ready should be called only from reorder BS");
                return;
            }
            aue.b bVar4 = (aue.b) aueVar2;
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : bVar4.c) {
                int i4 = r7 + 1;
                if (r7 < 0) {
                    e43.t();
                    throw null;
                }
                arrayList.add(new ShortVideoChangePlaylistPositionDto(((mqe) ((Pair) obj4).i()).a, r7));
                r7 = i4;
            }
            UserId userId2 = bVar4.e.b;
            ngj0 ngj0Var = kueVar.b;
            tfx tfxVar = new tfx("shortVideo.reorderPlaylists", new sr(27), new rf3(26));
            tfx.n(tfxVar, "owner_id", userId2, 0L, 0L, 12);
            tfx.o(tfxVar, "playlists", GsonHolder.a().toJson(arrayList), 0, 0, 12);
            a7f0.a.f(this, rsg0.W(yfb.x(tfxVar), 7), new td0(10, this, bVar4), new defpackage.o(13, this, bVar4), 1);
            return;
        }
        if (jteVar2 instanceof jte.d) {
            if (!(aueVar2 instanceof aue.a)) {
                fp.d("You should call OnErrorReload only from Error state");
                return;
            }
            aue.a aVar = (aue.a) aueVar2;
            T(eVar);
            UserId userId3 = aVar.c.b;
            List<String> list3 = kue.g;
            a7f0.a.f(this, io.reactivex.rxjava3.core.x.B(kueVar.d(i3, userId3, null), kueVar.e(this.g), new rj4(new ug4((byte) 0, 2), 5)), new sh3(11, this, aVar), new defpackage.s(6, this, aVar), 1);
            return;
        }
        if (jteVar2 instanceof jte.b) {
            if ((aueVar2 instanceof aue.b) && ((aue.b) aueVar2).i) {
                C(jte.g.b);
                return;
            }
            return;
        }
        if (jteVar2 instanceof jte.k) {
            if (aueVar2 instanceof aue.b) {
                T(new vte.f(true));
                return;
            }
            return;
        }
        if (jteVar2 instanceof jte.l) {
            if (aueVar2 instanceof aue.b) {
                T(new vte.f(false));
                return;
            }
            return;
        }
        if (!(jteVar2 instanceof jte.j)) {
            throw new NoWhenBranchMatchedException();
        }
        jte.j jVar = (jte.j) jteVar2;
        if (aueVar2 instanceof aue.b) {
            T(new vte.f(false));
            UserId userId4 = jVar.b;
            List<String> list4 = kue.g;
            a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.n(kueVar.d(i3, userId4, null), new ph3(new mre(this, 1), 15)), new defpackage.l(this, aueVar2, jVar, 1), new defpackage.m(7, this, aueVar2), 1);
        }
    }
}
