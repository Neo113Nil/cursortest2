package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.clips.playlists.ClipsPlaylistsSmallFoldersLaunchParams;
import com.vk.clips.playlists.di.ClipsPlaylistsComponentImpl;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsGridItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.utils.Logger;
import xsna.a7f0;
import xsna.bve;
import xsna.cve;
import xsna.eve;
import xsna.fve;
import xsna.nue;

/* compiled from: ClipsPlaylistsSmallFoldersFeature.kt */
/* loaded from: classes16.dex */
public final class uue extends wk50<kve, fve, nue, cve> implements w8i {
    public final int f;
    public final bpn0 g;
    public final f4z<bve> h;
    public final f4z<eve> i;

    public uue(ClipsPlaylistsSmallFoldersLaunchParams clipsPlaylistsSmallFoldersLaunchParams) {
        super(new nue.f(clipsPlaylistsSmallFoldersLaunchParams), new dve(clipsPlaylistsSmallFoldersLaunchParams.b, clipsPlaylistsSmallFoldersLaunchParams.c));
        this.f = 7;
        this.g = new bpn0(new defpackage.k(this, 18));
        this.h = new f4z<>();
        this.i = new f4z<>();
    }

    public static io.reactivex.rxjava3.core.x U(UserId userId) {
        return fkq0.d(userId) ? io.reactivex.rxjava3.core.x.k(new Group()) : new io.reactivex.rxjava3.internal.operators.single.d0(xg5.a().D().N0(fkq0.a(userId)).K(), new rq(9), null);
    }

    @Override // xsna.wk50
    public final void N(fve fveVar, nue nueVar) {
        List<ShortVideoPlaylistFullDto> list;
        fve fveVar2 = fveVar;
        nue nueVar2 = nueVar;
        boolean z = nueVar2 instanceof nue.f;
        int i = this.f;
        bpn0 bpn0Var = this.g;
        Object obj = null;
        if (z) {
            nue.f fVar = (nue.f) nueVar2;
            ClipsPlaylistsSmallFoldersLaunchParams clipsPlaylistsSmallFoldersLaunchParams = fVar.b;
            UserId userId = clipsPlaylistsSmallFoldersLaunchParams.b;
            T(new cve.c(clipsPlaylistsSmallFoldersLaunchParams.c, userId, false));
            a7f0.a.e(this, iqe.a, null, new xcd(this, 3), null, null, 13);
            kue Ef = ((ClipsPlaylistsComponentImpl) bpn0Var.getValue()).Ef();
            List<String> list2 = kue.g;
            a7f0.a.f(this, io.reactivex.rxjava3.core.x.B(Ef.d(i, userId, null), U(userId), new yq(new oue(0), 8)), new oh3(10, this, fVar), new sue(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 1);
            return;
        }
        if (nueVar2 instanceof nue.g) {
            nue.g gVar = (nue.g) nueVar2;
            UserId userId2 = gVar.b;
            T(new cve.c(gVar.c, userId2, false));
            fve.c cVar = fveVar2 instanceof fve.c ? (fve.c) fveVar2 : null;
            if (epx.f(cVar != null ? cVar.b : null, userId2)) {
                return;
            }
            kue Ef2 = ((ClipsPlaylistsComponentImpl) bpn0Var.getValue()).Ef();
            UserId userId3 = gVar.b;
            List<String> list3 = kue.g;
            a7f0.a.f(this, io.reactivex.rxjava3.core.x.B(io.reactivex.rxjava3.core.x.B(Ef2.d(i, userId3, null), U(userId2), new tq(new oue(0), 8)), io.reactivex.rxjava3.core.x.t(250L, TimeUnit.MILLISECONDS), new vq(new pue(0), 9)), new ku1(10, this, gVar), new tue(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 1);
            return;
        }
        boolean z2 = nueVar2 instanceof nue.b;
        f4z<eve> f4zVar = this.i;
        if (z2) {
            nue.b bVar = (nue.b) nueVar2;
            boolean z3 = bVar.c;
            ShortVideoGetPlaylistsResponseDto shortVideoGetPlaylistsResponseDto = bVar.b;
            T(new cve.d(shortVideoGetPlaylistsResponseDto, z3, fveVar2.q(), false));
            f4zVar.b(new eve.a(!z3 && shortVideoGetPlaylistsResponseDto.getCount() == 0));
            return;
        }
        boolean equals = nueVar2.equals(nue.c.b);
        f4z<bve> f4zVar2 = this.h;
        if (equals) {
            if (fveVar2 instanceof fve.b) {
                fve.b bVar2 = (fve.b) fveVar2;
                Integer num = bVar2.g;
                if (num == null || bVar2.h >= num.intValue()) {
                    f4zVar.b(eve.b.a);
                    return;
                } else {
                    f4zVar2.b(new bve.a(bVar2.c));
                    return;
                }
            }
            return;
        }
        if (nueVar2 instanceof nue.d) {
            fve.b bVar3 = fveVar2 instanceof fve.b ? (fve.b) fveVar2 : null;
            if (bVar3 != null && (list = bVar3.d) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((ShortVideoPlaylistFullDto) next).getId() == ((nue.d) nueVar2).b) {
                        obj = next;
                        break;
                    }
                }
                ShortVideoPlaylistFullDto shortVideoPlaylistFullDto = (ShortVideoPlaylistFullDto) obj;
                if (shortVideoPlaylistFullDto != null) {
                    SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIPS_PLAYLIST, Long.valueOf(shortVideoPlaylistFullDto.getId()), Long.valueOf(shortVideoPlaylistFullDto.q().b), null, null, null, 56, null), new MobileOfficialAppsClipsStat$TypeClipsGridItem(MobileOfficialAppsClipsStat$TypeClipsGridItem.EventType.CLICK_TO_PLAYLIST, fkq0.d(shortVideoPlaylistFullDto.q()) ? MobileOfficialAppsClipsStat$TypeClipsGridItem.ScreenType.GRID_USER : MobileOfficialAppsClipsStat$TypeClipsGridItem.ScreenType.GRID_COMMUNITY, null, null, null, 28, null), 2);
                    UiTracker uiTracker = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                    uzp0 uzp0Var = UiTracker.h;
                    uzp0Var.getClass();
                    new bjc(c, b, uzp0Var.a).q();
                    f4zVar2.b(new bve.b(new ClipsPlaylist(((nue.d) nueVar2).b, shortVideoPlaylistFullDto.getTitle(), EmptyList.b, shortVideoPlaylistFullDto.getCount(), shortVideoPlaylistFullDto.q(), ((fve.b) fveVar2).b, null, 64, null)));
                    return;
                }
            }
            throw new IllegalStateException("Clicked playlist id is not present in list");
        }
        if (!nueVar2.equals(nue.e.b)) {
            if (nueVar2 instanceof nue.h) {
                T(new cve.e(((nue.h) nueVar2).b));
                return;
            }
            if (!(nueVar2 instanceof nue.a)) {
                throw new NoWhenBranchMatchedException();
            }
            nue.a aVar = (nue.a) nueVar2;
            kue Ef3 = ((ClipsPlaylistsComponentImpl) bpn0Var.getValue()).Ef();
            UserId userId4 = aVar.b;
            List<String> list4 = kue.g;
            a7f0.a.f(this, Ef3.d(i, userId4, null), new hn0(7, this, aVar), new que(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 1);
            return;
        }
        boolean z4 = fveVar2 instanceof fve.b;
        if (z4) {
            fve.b bVar4 = (fve.b) fveVar2;
            UserId userId5 = bVar4.c;
            String str = bVar4.e;
            if (str != null) {
                T(new cve.c(bVar4.b, userId5, true));
                a7f0.a.f(this, ((ClipsPlaylistsComponentImpl) bpn0Var.getValue()).Ef().d(i, userId5, str), new k8(8, this, bVar4), new rue(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 1);
                return;
            }
        }
        if (z4) {
            T(cve.a.b);
        }
    }
}
