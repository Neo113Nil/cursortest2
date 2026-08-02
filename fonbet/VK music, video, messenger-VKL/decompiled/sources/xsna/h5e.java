package xsna;

import android.app.Activity;
import com.vk.api.generated.shortVideo.dto.ShortVideoAddPlaylistTypeDto;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.autoplay.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.d4e;
import xsna.t5e;

/* compiled from: ClipsFavoritesInteractorImpl.kt */
/* loaded from: classes16.dex */
public final class h5e implements c5e {
    public final s5e a;
    public final u5e b;
    public final e4e c;

    public h5e(s5e s5eVar, u5e u5eVar, e4e e4eVar) {
        this.a = s5eVar;
        this.b = u5eVar;
        this.c = e4eVar;
    }

    public static void j(VideoFile videoFile, boolean z) {
        videoFile.s0(z);
        if (z) {
            wjs0.a(new axr0(videoFile));
        } else {
            wjs0.a(new cxr0(videoFile));
        }
        wjs0.a(new fyr0(videoFile));
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        b.C1208b.a().e(videoFile, null).N(videoFile);
    }

    @Override // xsna.c5e
    public final void a(FavoriteFolderId favoriteFolderId, UserId userId, String str, List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((VideoFile) it.next()).a1());
        }
        ver0.a(io.reactivex.rxjava3.kotlin.c.e(this.a.b(userId, favoriteFolderId, arrayList).m(io.reactivex.rxjava3.android.schedulers.a.b()), new b1a(6, this, list), new cyc(this, favoriteFolderId, list, str, 1)));
    }

    @Override // xsna.c5e
    public final void b(final UserId userId, final FavoriteFolderId favoriteFolderId, final String str, final List list, final boolean z) {
        ver0.a(io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.r(s5e.c(this.a, favoriteFolderId, null, 2), new jo3(new r3e(list, this, userId, favoriteFolderId, 1), 6)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new defpackage.v(5, this, list), new izs() { // from class: xsna.f5e
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                h5e h5eVar = h5e.this;
                e4e e4eVar = h5eVar.c;
                e4eVar.g(new d4e.a.f((u2e) obj));
                List list2 = list;
                List list3 = list2;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((VideoFile) it.next()).r1());
                }
                FavoriteFolderId favoriteFolderId2 = favoriteFolderId;
                e4eVar.g(new d4e.a.C2703a(favoriteFolderId2, arrayList));
                h5eVar.b.d(new t5e.h(userId, favoriteFolderId2, str, list2.size(), z), null);
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    h5e.j((VideoFile) it2.next(), true);
                }
                return s3q0.a;
            }
        }));
    }

    @Override // xsna.c5e
    public final void c(final UserId userId, final FavoriteFolderId favoriteFolderId, final FavoriteFolderId favoriteFolderId2, final String str, final List list) {
        int i = 1;
        ver0.a(io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.r(s5e.c(this.a, favoriteFolderId2, null, 2), new jo3(new r3e(list, this, userId, favoriteFolderId2, i), 6)), new np1(new aa5(this, userId, favoriteFolderId, list, i), 9)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new nm1(5, this, list), new izs() { // from class: xsna.d5e
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                h5e h5eVar = h5e.this;
                e4e e4eVar = h5eVar.c;
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    e4eVar.g(new d4e.a.f((u2e) it.next()));
                }
                List list2 = list;
                List list3 = list2;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((VideoFile) it2.next()).r1());
                }
                FavoriteFolderId favoriteFolderId3 = favoriteFolderId;
                FavoriteFolderId favoriteFolderId4 = favoriteFolderId2;
                e4eVar.g(new d4e.a.b(favoriteFolderId3, favoriteFolderId4, arrayList));
                h5eVar.b.d(new t5e.j(userId, favoriteFolderId4, str, list2.size()), null);
                return s3q0.a;
            }
        }));
    }

    @Override // xsna.c5e
    public final void d(final UserId userId, final VideoFile videoFile, final Activity activity) {
        j(videoFile, true);
        FavoriteFolderId.Alias.AllClips allClips = FavoriteFolderId.Alias.AllClips.c;
        List singletonList = Collections.singletonList(videoFile.a1());
        List<String> list = s5e.e;
        ver0.a(io.reactivex.rxjava3.kotlin.c.e(this.a.a(allClips, userId, null, singletonList).m(io.reactivex.rxjava3.android.schedulers.a.b()), new dlb(this, activity, videoFile, 1), new izs() { // from class: xsna.g5e
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                Integer num;
                h5e h5eVar = this;
                e4e e4eVar = h5eVar.c;
                u2e u2eVar = (u2e) obj;
                VideoFile videoFile2 = VideoFile.this;
                ClipVideoFile clipVideoFile = videoFile2 instanceof ClipVideoFile ? (ClipVideoFile) videoFile2 : null;
                if (((clipVideoFile == null || (num = clipVideoFile.x1) == null) ? 0 : num.intValue()) > 0) {
                    h5eVar.k((ClipVideoFile) videoFile2);
                }
                e4eVar.g(new d4e.a.f(u2eVar));
                e4eVar.g(new d4e.a.C2703a(FavoriteFolderId.Alias.AllClips.c, Collections.singletonList(videoFile2.r1())));
                h5eVar.b.d(new t5e.b(videoFile2, userId), activity);
                return s3q0.a;
            }
        }));
    }

    @Override // xsna.c5e
    public final void e(UserId userId, VideoFile videoFile, Activity activity) {
        j(videoFile, false);
        ver0.a(io.reactivex.rxjava3.kotlin.c.e(this.a.b(userId, FavoriteFolderId.Alias.AllClips.c, Collections.singletonList(videoFile.a1())).m(io.reactivex.rxjava3.android.schedulers.a.b()), new w95(this, activity, videoFile, 3), new ihb(this, videoFile, activity, 2)));
    }

    @Override // xsna.c5e
    public final void g(UserId userId, FavoriteFolderId.Id id, String str) {
        ver0.a(io.reactivex.rxjava3.kotlin.c.d(rsg0.Z(yfb.x(this.a.a.k(userId, Collections.singletonList(Integer.valueOf(id.b))))).o(io.reactivex.rxjava3.android.schedulers.a.b()), new grb(this, id, str, 2), new com.vk.movika.sdk.base.data.a(this, 23)));
    }

    @Override // xsna.c5e
    public final io.reactivex.rxjava3.core.x h(UserId userId, String str, boolean z) {
        s5e s5eVar = this.a;
        return new io.reactivex.rxjava3.internal.operators.single.o(rsg0.w0(yfb.x(s5eVar.a.x(userId, ShortVideoAddPlaylistTypeDto.FAVORITE, str))).l(new ai3(new ym1(s5eVar.c, 4), 10)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new b00(new e5e(this, z, userId), 12)).h(new cw(new w5(this, 22), 12));
    }

    @Override // xsna.c5e
    public final io.reactivex.rxjava3.core.x i(UserId userId, FavoriteFolderId.Id id, String str) {
        s5e s5eVar = this.a;
        return new io.reactivex.rxjava3.internal.operators.single.o(rsg0.w0(yfb.x(s5eVar.a.B(id.b, userId, str))).l(new e10(new r5e(1, s5eVar.c, c4e.class, "mapPlaylist", "mapPlaylist(Lcom/vk/api/generated/shortVideo/dto/ShortVideoPlaylistFullDto;)Lcom/vk/clips/favorites/api/model/ClipsFavoriteFolder;", 0), 13)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new p41(new qm1(this, 27), 11)).h(new wn(new r9(this, 21), 16));
    }

    public final void k(ClipVideoFile clipVideoFile) {
        s5e s5eVar = this.a;
        lax0 lax0Var = s5eVar.b;
        StringBuilder sb = new StringBuilder();
        sb.append(clipVideoFile.b);
        sb.append('_');
        sb.append(clipVideoFile.x1);
        ver0.a(io.reactivex.rxjava3.kotlin.c.h(rsg0.w0(yfb.x(lax0Var.h(Collections.singletonList(sb.toString()), s5e.f))).l(new com.vk.movika.sdk.base.ui.p0(new q5e(1, s5eVar.d, n9x0.class, "mapExtended", "mapExtended(Lcom/vk/api/generated/wall/dto/WallGetByIdExtendedResponseDto;Ljava/util/Map;)Lcom/vk/feed/core/models/news/NewsEntry;", 0), 10)), null, new tc(8), 1));
    }
}
