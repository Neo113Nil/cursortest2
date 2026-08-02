package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.shortVideo.dto.ShortVideoChangeVideoPositionDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosResponseDto;
import com.vk.clips.playlists.ClipsPlaylistContentLaunchParams;
import com.vk.clips.playlists.ClipsPlaylistNamingLaunchParams;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.internal.api.GsonHolder;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.a7f0;
import xsna.eqe;
import xsna.ore;
import xsna.rre;
import xsna.tre;
import xsna.ure;
import xsna.vre;
import xsna.zqe;

/* compiled from: ClipsPlaylistUiFeature.kt */
/* loaded from: classes16.dex */
public final class nre extends wk50<yre, vre, zqe, rre> {
    public final ClipsPlaylistContentLaunchParams f;
    public final kue g;
    public final cse h;
    public final vve i;
    public final s2f j;
    public final mhd k;
    public final boolean l;
    public final f4z<ore> m;
    public final f4z<ure> n;
    public final hqe o;
    public boolean p;
    public boolean q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nre(ClipsPlaylistContentLaunchParams clipsPlaylistContentLaunchParams, kue kueVar, cse cseVar, vve vveVar, s2f s2fVar, mhd mhdVar, boolean z) {
        super(new zqe.a(r1.b, clipsPlaylistContentLaunchParams.e ? null : Integer.valueOf(r1.e), r1.f, r1.c, clipsPlaylistContentLaunchParams.c), new sre());
        ClipsPlaylist clipsPlaylist = clipsPlaylistContentLaunchParams.b;
        this.f = clipsPlaylistContentLaunchParams;
        this.g = kueVar;
        this.h = cseVar;
        this.i = vveVar;
        this.j = s2fVar;
        this.k = mhdVar;
        this.l = z;
        this.m = new f4z<>();
        this.n = new f4z<>();
        this.o = clipsPlaylistContentLaunchParams.f;
    }

    public static final io.reactivex.rxjava3.core.x<ShortVideoGetOwnerVideosResponseDto> V(nre nreVar, String str, UserId userId, int i, boolean z) {
        if (str == null && !z) {
            return io.reactivex.rxjava3.core.x.k(new ShortVideoGetOwnerVideosResponseDto(0, EmptyList.b, null, null, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED, null));
        }
        return kue.f(nreVar.g, userId, i, str, null, z ? 10 : 3, !z, 72);
    }

    @Override // xsna.wk50
    public final void N(vre vreVar, zqe zqeVar) {
        vre vreVar2 = vreVar;
        zqe zqeVar2 = zqeVar;
        if (zqeVar2 instanceof zqe.a) {
            zqe.a aVar = (zqe.a) zqeVar2;
            String str = aVar.c;
            Integer num = aVar.d;
            int i = aVar.e;
            T(new rre.g(str, num, Integer.valueOf(i), aVar.f, aVar.b, 16));
            U(i, aVar.b, aVar.f, false);
            cse cseVar = this.h;
            a7f0.a.e(this, new io.reactivex.rxjava3.internal.operators.observable.i0(cseVar.b(), new dg1(new w8(this, 27), 13)), null, new com.vk.im.ui.fragments.b(this, 29), null, null, 13);
            a7f0.a.e(this, new io.reactivex.rxjava3.internal.operators.observable.i0(cseVar.c(), new b8(new nhe(this, 1), 13)), null, new t1e(this, 3), null, null, 13);
            com.vk.core.utils.newtork.b.a.getClass();
            a7f0.a.e(this, com.vk.core.utils.newtork.b.f(), null, new mre(this, 0), null, null, 13);
            return;
        }
        if (zqeVar2 instanceof zqe.j) {
            W((vre.b) vreVar2);
            return;
        }
        if (zqeVar2 instanceof zqe.k) {
            X((vre.b) vreVar2);
            return;
        }
        if (zqeVar2 instanceof zqe.h) {
            T(rre.k.b);
            return;
        }
        boolean z = zqeVar2 instanceof zqe.c;
        ore.a aVar2 = ore.a.a;
        f4z<ore> f4zVar = this.m;
        if (z) {
            f4zVar.b(aVar2);
            return;
        }
        boolean z2 = zqeVar2 instanceof zqe.d;
        hqe hqeVar = this.o;
        if (z2) {
            f4zVar.b(aVar2);
            if (hqeVar != null) {
                hqeVar.b(new eqe.f(((zqe.d) zqeVar2).b));
                return;
            }
            return;
        }
        if (zqeVar2 instanceof zqe.g) {
            vre.a aVar3 = (vre.a) vreVar2;
            String str2 = aVar3.f;
            Integer num2 = aVar3.g;
            int i2 = aVar3.h;
            T(new rre.g(str2, num2, Integer.valueOf(i2), aVar3.j, aVar3.i, 16));
            U(i2, aVar3.i, aVar3.j, aVar3.k);
            return;
        }
        boolean z3 = zqeVar2 instanceof zqe.i;
        kue kueVar = this.g;
        rre.c cVar = rre.c.b;
        if (!z3) {
            if (zqeVar2 instanceof zqe.f) {
                T(cVar);
                return;
            }
            if (zqeVar2 instanceof zqe.e) {
                zqe.e eVar = (zqe.e) zqeVar2;
                boolean f = epx.f(eVar, zqe.e.a.b);
                rre.b bVar = rre.b.b;
                if (!f) {
                    if (!epx.f(eVar, zqe.e.b.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    T(bVar);
                    return;
                }
                T(bVar);
                if (vreVar2 instanceof vre.b) {
                    vre.b bVar2 = (vre.b) vreVar2;
                    io.reactivex.rxjava3.internal.operators.observable.f0 W = rsg0.W(yfb.x(kueVar.b.k(bVar2.q, Collections.singletonList(Integer.valueOf(bVar2.j)))), 7);
                    asu0 asu0Var = asu0.a;
                    ver0.a(io.reactivex.rxjava3.kotlin.c.e(W.q(asu0Var.c()).m(asu0Var.d()), new fre(this, 0), new bi0(6, vreVar2, this)));
                    return;
                }
                return;
            }
            if (!(zqeVar2 instanceof zqe.l)) {
                if (!(zqeVar2 instanceof zqe.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (vreVar2 instanceof vre.b) {
                    if (this.p) {
                        X((vre.b) vreVar2);
                    }
                    if (this.q) {
                        W((vre.b) vreVar2);
                        return;
                    }
                    return;
                }
                return;
            }
            ClipsPlaylist clipsPlaylist = ((zqe.l) zqeVar2).b;
            int i3 = clipsPlaylist.e;
            int i4 = clipsPlaylist.b;
            if (i3 != 0) {
                T(new rre.g(clipsPlaylist.c, Integer.valueOf(i3), Integer.valueOf(i4), null, clipsPlaylist.f, 24));
                U(i4, clipsPlaylist.f, null, true);
                return;
            } else {
                if (hqeVar != null) {
                    hqeVar.b(new eqe.e(EmptyList.b, null));
                }
                f4zVar.b(new ore.b(clipsPlaylist));
                return;
            }
        }
        if (!(vreVar2 instanceof vre.d)) {
            T(cVar);
            return;
        }
        vre.d dVar = (vre.d) vreVar2;
        zqe.i iVar = (zqe.i) zqeVar2;
        boolean f2 = epx.f(iVar, zqe.i.a.b);
        boolean z4 = this.l;
        if (f2) {
            if (!z4) {
                Y();
                return;
            } else {
                T(cVar);
                f4zVar.b(new ore.c(dVar.q(), dVar.i().intValue()));
                return;
            }
        }
        if (epx.f(iVar, zqe.i.d.b)) {
            if (!z4) {
                Y();
                return;
            }
            T(cVar);
            UserId q = dVar.q();
            int intValue = dVar.i().intValue();
            String title = dVar.getTitle();
            f4zVar.b(new ore.d(q, intValue, title != null ? title : ""));
            return;
        }
        if (epx.f(iVar, zqe.i.e.b)) {
            if (!z4) {
                Y();
                return;
            }
            T(cVar);
            UserId q2 = dVar.q();
            String title2 = dVar.getTitle();
            f4zVar.b(new ore.e(new ClipsPlaylistNamingLaunchParams(q2, title2 == null ? "" : title2, true, null, dVar.i().intValue(), this.o)));
            return;
        }
        if (epx.f(iVar, zqe.i.c.b)) {
            if (!z4) {
                Y();
                return;
            } else {
                T(cVar);
                T(rre.j.b);
                return;
            }
        }
        if (epx.f(iVar, zqe.i.h.b)) {
            StringBuilder sb = new StringBuilder();
            sb.append(dVar.q());
            sb.append('_');
            sb.append(dVar.i().intValue());
            this.n.b(new ure.a(sb.toString()));
            T(cVar);
            return;
        }
        if (epx.f(iVar, zqe.i.f.b)) {
            if (!z4) {
                Y();
                return;
            } else {
                T(cVar);
                T(new rre.i(true));
                return;
            }
        }
        if (!epx.f(iVar, zqe.i.g.b)) {
            if (!(iVar instanceof zqe.i.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!z4) {
                Y();
                return;
            } else {
                if (dVar instanceof vre.b) {
                    zqe.i.b bVar3 = (zqe.i.b) iVar;
                    T(new rre.d(bVar3.b, bVar3.c));
                    return;
                }
                return;
            }
        }
        vre.b bVar4 = (vre.b) dVar;
        UserId userId = bVar4.q;
        tre treVar = bVar4.r;
        List<VideoFile> list = bVar4.f;
        if (treVar instanceof tre.a) {
            List A = rli0.A(rli0.m(new tlp0(new k920(new i5g(list), new i5g(((tre.a) treVar).a), new gre(0)), new hre(0))));
            if (A.isEmpty()) {
                T(new rre.i(false));
            } else {
                L.d(new k75(2, A, bVar4));
                ArrayList X0 = j5g.X0(list.subList(((Number) j5g.Y(A)).intValue(), ((Number) j5g.i0(A)).intValue() + 1), j5g.O0(new k9x(((Number) j5g.Y(A)).intValue(), ((Number) j5g.i0(A)).intValue(), 1)));
                ArrayList arrayList = new ArrayList(c5g.u(X0, 10));
                Iterator it = X0.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    VideoFile videoFile = (VideoFile) pair.d();
                    int intValue2 = ((Number) pair.g()).intValue();
                    UserId I0 = videoFile.I0();
                    int o0 = videoFile.o0();
                    Integer num3 = bVar4.s;
                    arrayList.add(new ShortVideoChangeVideoPositionDto(I0, o0, intValue2 + (num3 != null ? num3.intValue() : 0)));
                }
                int i5 = bVar4.j;
                ngj0 ngj0Var = kueVar.b;
                tfx tfxVar = new tfx("shortVideo.reorderVideos", new cq(28), new dq(27));
                tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
                tfx.l(tfxVar, "playlist_id", i5, 1, 0, 8);
                tfx.o(tfxVar, "videos", GsonHolder.a().toJson(arrayList), 0, 0, 12);
                a7f0.a.f(this, rsg0.W(yfb.x(tfxVar), 7), new hn0(6, this, bVar4), new ire(this, 0), 1);
            }
        }
        wjs0.a(new twr0(userId));
    }

    public final void U(int i, final UserId userId, final String str, final boolean z) {
        a7f0.a.f(this, io.reactivex.rxjava3.core.x.A(V(this, str, userId, i, true), V(this, str, userId, i, false), new io.reactivex.rxjava3.internal.operators.single.d0(xg5.a().D().N0(fkq0.a(userId)).K(), new uq(8), null), new pi0(new kre(0), 13)), new izs() { // from class: xsna.lre
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                Integer num;
                Pair pair = (Pair) obj;
                ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto = (ShortVideoGetOwnerVideosResponseDto) pair.d();
                ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto2 = (ShortVideoGetOwnerVideosResponseDto) pair.g();
                ums0 ums0Var = ums0.a;
                List e = ums0.e(ums0Var, new fgg0(shortVideoGetOwnerVideosResponseDto2.e()), shortVideoGetOwnerVideosResponseDto2.j(), shortVideoGetOwnerVideosResponseDto2.d(), false, 52);
                List e2 = ums0.e(ums0Var, shortVideoGetOwnerVideosResponseDto.e(), shortVideoGetOwnerVideosResponseDto.j(), shortVideoGetOwnerVideosResponseDto.d(), false, 52);
                ArrayList u0 = j5g.u0(e2, e);
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                Iterator it = u0.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (hashSet.add(((VideoFile) next).a1())) {
                        arrayList.add(next);
                    }
                }
                String g = shortVideoGetOwnerVideosResponseDto.g();
                String g2 = shortVideoGetOwnerVideosResponseDto2.g();
                Integer valueOf = Integer.valueOf(shortVideoGetOwnerVideosResponseDto.getCount());
                Integer i2 = shortVideoGetOwnerVideosResponseDto.i();
                if (i2 != null) {
                    num = Integer.valueOf((i2.intValue() - shortVideoGetOwnerVideosResponseDto2.e().size()) + (str != null ? 1 : 0));
                } else {
                    num = null;
                }
                rre.f fVar = new rre.f(arrayList, g, g2, valueOf, num, xg5.a().e(userId), 40);
                nre nreVar = nre.this;
                nreVar.T(fVar);
                s2f s2fVar = nreVar.j;
                hqe hqeVar = nreVar.o;
                if (!z) {
                    if (hqeVar != null) {
                        List list = e;
                        ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(s2fVar.c((VideoFile) it2.next()));
                        }
                        hqeVar.b(new eqe.b(shortVideoGetOwnerVideosResponseDto2.g(), arrayList2, false));
                    }
                    if (hqeVar != null) {
                        ArrayList arrayList3 = new ArrayList(c5g.u(e2, 10));
                        Iterator it3 = e2.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(s2fVar.c((VideoFile) it3.next()));
                        }
                        hqeVar.b(new eqe.b(shortVideoGetOwnerVideosResponseDto.g(), arrayList3, true));
                    }
                } else if (hqeVar != null) {
                    ArrayList arrayList4 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(s2fVar.c((VideoFile) it4.next()));
                    }
                    hqeVar.b(new eqe.e(arrayList4, shortVideoGetOwnerVideosResponseDto.g()));
                }
                return s3q0.a;
            }
        }, new m58(this, z, 1), 1);
    }

    public final void W(vre.b bVar) {
        if (bVar.g == null) {
            return;
        }
        T(new rre.h(false));
        a7f0.a.f(this, kue.f(this.g, bVar.q, bVar.j, null, bVar.g, 0, false, 116), new go1(this, 23), new com.vk.movika.sdk.base.observable.e(this, 27), 1);
    }

    public final void X(vre.b bVar) {
        if (bVar.m == null) {
            return;
        }
        T(new rre.h(true));
        a7f0.a.f(this, kue.f(this.g, bVar.q, bVar.j, null, bVar.m, 0, true, 84), new hb(this, 28), new com.vk.movika.sdk.base.observable.c(this, 29), 1);
    }

    public final void Y() {
        i0q0.j(new sc4(this, 2));
    }
}
