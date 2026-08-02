package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.clips.playlists.ClipsPlaylistsFolderLaunchParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.aue;
import xsna.vte;

/* compiled from: ClipsPlaylistsFoldersReducer.kt */
/* loaded from: classes16.dex */
public final class xte extends dm50<cue, vte, aue> {
    public final bpn0 d;

    public xte(aue.c cVar) {
        super(cVar);
        this.d = new bpn0(new kbe(cVar, 3));
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, xsna.kte$b] */
    @Override // xsna.dm50
    public final aue c(aue aueVar, vte vteVar) {
        aue aueVar2 = aueVar;
        vte vteVar2 = vteVar;
        if (vteVar2 instanceof vte.e) {
            return new aue.c(aueVar2.R2(), aueVar2.Q2());
        }
        if (vteVar2 instanceof vte.d) {
            return aueVar2 instanceof aue.a ? (aue.a) aueVar2 : new aue.a(aueVar2.R2(), aueVar2.Q2());
        }
        if (vteVar2 instanceof vte.h) {
            vte.h hVar = (vte.h) vteVar2;
            if (aueVar2 instanceof aue.c) {
                ClipsPlaylistsFolderLaunchParams.FoldersLaunchType foldersLaunchType = ((aue.c) aueVar2).b;
                ShortVideoGetPlaylistsResponseDto shortVideoGetPlaylistsResponseDto = hVar.b;
                List<ShortVideoPlaylistFullDto> d = shortVideoGetPlaylistsResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (ShortVideoPlaylistFullDto shortVideoPlaylistFullDto : d) {
                    int id = shortVideoPlaylistFullDto.getId();
                    List<List<BaseImageDto>> e = shortVideoPlaylistFullDto.e();
                    if (e == null) {
                        e = EmptyList.b;
                    }
                    arrayList.add(new mqe(id, shortVideoPlaylistFullDto.getCount(), shortVideoPlaylistFullDto.q(), shortVideoPlaylistFullDto.getTitle(), e));
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    mqe mqeVar = (mqe) it.next();
                    arrayList2.add(new Pair(mqeVar, Boolean.valueOf(hVar.c.contains(Integer.valueOf(mqeVar.a)))));
                }
                return new aue.b(foldersLaunchType, arrayList2, shortVideoGetPlaylistsResponseDto.getCount(), new kte(hVar.d, hVar.e), shortVideoGetPlaylistsResponseDto.g(), shortVideoGetPlaylistsResponseDto.e(), false, false);
            }
        } else if (vteVar2 instanceof vte.g) {
            vte.g gVar = (vte.g) vteVar2;
            ShortVideoGetPlaylistsResponseDto shortVideoGetPlaylistsResponseDto2 = gVar.b;
            if (aueVar2 instanceof aue.b) {
                aue.b bVar = (aue.b) aueVar2;
                List<Pair<mqe, Boolean>> list = bVar.c;
                List<ShortVideoPlaylistFullDto> d2 = shortVideoGetPlaylistsResponseDto2.d();
                ArrayList arrayList3 = new ArrayList(c5g.u(d2, 10));
                for (ShortVideoPlaylistFullDto shortVideoPlaylistFullDto2 : d2) {
                    int id2 = shortVideoPlaylistFullDto2.getId();
                    List<List<BaseImageDto>> e2 = shortVideoPlaylistFullDto2.e();
                    if (e2 == null) {
                        e2 = EmptyList.b;
                    }
                    arrayList3.add(new mqe(id2, shortVideoPlaylistFullDto2.getCount(), shortVideoPlaylistFullDto2.q(), shortVideoPlaylistFullDto2.getTitle(), e2));
                }
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    mqe mqeVar2 = (mqe) it2.next();
                    arrayList4.add(new Pair(mqeVar2, Boolean.valueOf(gVar.c.contains(Integer.valueOf(mqeVar2.a)))));
                }
                return aue.b.a(bVar, j5g.u0(arrayList4, list), shortVideoGetPlaylistsResponseDto2.g(), false, false, 109);
            }
        } else if (vteVar2 instanceof vte.c) {
            ClipsPlaylistsFolderLaunchParams.FoldersLaunchType R2 = aueVar2.R2();
            if (R2 instanceof ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.SinglePick) {
                vte.c cVar = (vte.c) vteVar2;
                if (!(aueVar2 instanceof aue.b)) {
                    fp.d("You should call ItemClick only from Loaded state");
                    return aueVar2;
                }
                aue.b bVar2 = (aue.b) aueVar2;
                List<Pair<mqe, Boolean>> list2 = bVar2.c;
                ArrayList arrayList5 = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    Pair pair = (Pair) it3.next();
                    arrayList5.add(((mqe) pair.i()).a == cVar.b ? Pair.h(pair, Boolean.valueOf(!((Boolean) pair.j()).booleanValue())) : Pair.h(pair, Boolean.FALSE));
                }
                return aue.b.a(bVar2, arrayList5, null, false, false, 253);
            }
            if (R2 instanceof ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.MultiPick) {
                vte.c cVar2 = (vte.c) vteVar2;
                if (!(aueVar2 instanceof aue.b)) {
                    fp.d("You should call ItemClick only from Loaded state");
                    return aueVar2;
                }
                aue.b bVar3 = (aue.b) aueVar2;
                List<Pair<mqe, Boolean>> list3 = bVar3.c;
                ArrayList arrayList6 = new ArrayList(c5g.u(list3, 10));
                Iterator<T> it4 = list3.iterator();
                while (it4.hasNext()) {
                    Pair pair2 = (Pair) it4.next();
                    if (((mqe) pair2.i()).a == cVar2.b) {
                        pair2 = Pair.h(pair2, Boolean.valueOf(!((Boolean) pair2.j()).booleanValue()));
                    }
                    arrayList6.add(pair2);
                }
                return aue.b.a(bVar3, arrayList6, null, false, false, 253);
            }
        } else {
            if (vteVar2 instanceof vte.b) {
                vte.b bVar4 = (vte.b) vteVar2;
                if (!(aueVar2 instanceof aue.b)) {
                    fp.d("You should call ItemMoved only from Loaded state");
                    return aueVar2;
                }
                aue.b bVar5 = (aue.b) aueVar2;
                List g = rdi.g(bVar5.c);
                g.add(bVar4.c, g.remove(bVar4.b));
                s3q0 s3q0Var = s3q0.a;
                return aue.b.a(bVar5, g, null, false, false, 253);
            }
            if (vteVar2 instanceof vte.f) {
                vte.f fVar = (vte.f) vteVar2;
                if (aueVar2 instanceof aue.b) {
                    return aue.b.a((aue.b) aueVar2, null, null, fVar.b, false, 191);
                }
            } else {
                if (!(vteVar2 instanceof vte.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (aueVar2 instanceof aue.b) {
                    return aue.b.a((aue.b) aueVar2, null, null, false, true, 127);
                }
            }
        }
        return aueVar2;
    }

    @Override // xsna.dm50
    public final cue d() {
        return new cue(e(new dj1(16)), e(new fj1(11)), e(new s9(this, 26)));
    }

    @Override // xsna.dm50
    public final void h(aue aueVar, cue cueVar) {
        aue aueVar2 = aueVar;
        cue cueVar2 = cueVar;
        if (aueVar2 instanceof aue.a) {
            f(cueVar2.b, aueVar2);
        } else if (aueVar2 instanceof aue.b) {
            f(cueVar2.c, aueVar2);
        } else {
            if (!(aueVar2 instanceof aue.c)) {
                throw new NoWhenBranchMatchedException();
            }
            f(cueVar2.a, aueVar2);
        }
    }
}
