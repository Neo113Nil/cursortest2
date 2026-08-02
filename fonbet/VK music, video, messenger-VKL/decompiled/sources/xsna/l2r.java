package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.sdk.shared.api.playlist.SdkClipsDraftablePlaylist;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a7f0;
import xsna.c2r;
import xsna.ea90;
import xsna.eqe;
import xsna.q4r;
import xsna.qvq;
import xsna.uyq;
import xsna.wk50;

/* compiled from: FeedPlaylistActionDelegate.kt */
/* loaded from: classes17.dex */
public final class l2r implements oj50<q4r, qvq, c2r> {
    public final ClipFeedTab a;
    public final sv1 b;
    public final f4z c;
    public final myc d;
    public final b7b0 e;

    public l2r(ClipFeedTab clipFeedTab, i4r i4rVar, sv1 sv1Var, f4z f4zVar, alk alkVar, myc mycVar, b7b0 b7b0Var) {
        this.a = clipFeedTab;
        this.b = sv1Var;
        this.c = f4zVar;
        this.d = mycVar;
        this.e = b7b0Var;
    }

    public static final void b(q4r.a aVar, qvq.m.a aVar2, l2r l2rVar, List<ClipsPlaylist> list) {
        c1r c1rVar = aVar.b().get(aVar2.c.r1());
        FeedItem feedItem = c1rVar != null ? c1rVar.a : null;
        if (feedItem == null || !(feedItem instanceof FeedItem.f)) {
            return;
        }
        l2rVar.c.b(new uyq.e.c((FeedItem.f) feedItem, list));
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        io.reactivex.rxjava3.core.x l;
        q4r q4rVar = (q4r) km50Var;
        qvq qvqVar = (qvq) kj50Var;
        if ((q4rVar instanceof q4r.a) && (qvqVar instanceof qvq.m)) {
            qvq.m mVar = (qvq.m) qvqVar;
            boolean z = mVar instanceof qvq.m.c;
            f4z f4zVar = this.c;
            if (!z) {
                if (mVar instanceof qvq.m.b) {
                    q4r.a aVar2 = (q4r.a) q4rVar;
                    qvq.m.b bVar = (qvq.m.b) qvqVar;
                    ClipsPlaylist clipsPlaylist = bVar.b;
                    SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.CLIPS_PLAYLIST;
                    SdkVideoFile sdkVideoFile = bVar.c;
                    int i = clipsPlaylist.b;
                    int i2 = clipsPlaylist.e;
                    SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(type, Long.valueOf(i), Long.valueOf(clipsPlaylist.f.b), null, null, null, 56, null);
                    ClipFeedTab clipFeedTab = this.a;
                    SchemeStat$TypeClipViewerItem schemeStat$TypeClipViewerItem = new SchemeStat$TypeClipViewerItem(fzc.b(clipFeedTab), SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_PLAYLIST, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741820, null);
                    b7b0 b7b0Var = this.e;
                    if (b7b0Var != null) {
                        b7b0Var.a(SchemeStat$TypeClick.a.b(schemeStat$EventItem, schemeStat$TypeClipViewerItem, 2));
                    }
                    if ((clipFeedTab instanceof ClipFeedTab.Playlist) && ((ClipFeedTab.Playlist) clipFeedTab).Z0().b == clipsPlaylist.b) {
                        if (i2 == 0) {
                            clipsPlaylist = ClipsPlaylist.a(clipsPlaylist, 1);
                        }
                        f4zVar.b(new uyq.e.a.b(clipsPlaylist, sdkVideoFile.a1(), aVar2.d.a, aVar2.e.a));
                        return;
                    } else {
                        if (i2 == 0) {
                            clipsPlaylist = ClipsPlaylist.a(clipsPlaylist, 1);
                        }
                        f4zVar.b(new uyq.e.b(clipsPlaylist, sdkVideoFile));
                        return;
                    }
                }
                if (!(mVar instanceof qvq.m.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                q4r.a aVar3 = (q4r.a) q4rVar;
                qvq.m.a aVar4 = (qvq.m.a) qvqVar;
                List<ClipsPlaylist> list = aVar4.b;
                if (list.isEmpty()) {
                    l = io.reactivex.rxjava3.core.x.k(EmptyList.b);
                } else {
                    ngj0 ngj0Var = new ngj0();
                    List<ClipsPlaylist> list2 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    for (ClipsPlaylist clipsPlaylist2 : list2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(clipsPlaylist2.f);
                        sb.append('_');
                        sb.append(clipsPlaylist2.b);
                        arrayList.add(sb.toString());
                    }
                    dz2 x = yfb.x(mgj0.n(ngj0Var, null, null, null, null, arrayList, null, null, null, 239));
                    ahn.D(x);
                    l = rsg0.W(x, 7).l(new pa(new oa(25), 17));
                }
                a7f0.a.f(aVar, l, new z14(aVar3, aVar4, this, 6), new rr3(aVar4, aVar3, this, 2), 1);
                return;
            }
            gwx gwxVar = ((q4r.a) q4rVar).b;
            eqe eqeVar = ((qvq.m.c) qvqVar).b;
            boolean z2 = eqeVar instanceof eqe.c;
            sv1 sv1Var = this.b;
            if (z2) {
                f4zVar.b(uyq.a.a);
                sv1Var.A(new swr0(((eqe.c) eqeVar).a));
                return;
            }
            if (eqeVar instanceof eqe.f) {
                Iterator<FeedItem> it = gwxVar.a.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    FeedItem next = it.next();
                    if (!(next instanceof FeedItem.d) ? false : epx.f(((FeedItem.d) next).k().a1(), ((eqe.f) eqeVar).a)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 >= 0) {
                    f4zVar.b(new uyq.g.b(i3));
                    return;
                }
                return;
            }
            boolean z3 = eqeVar instanceof eqe.b;
            myc mycVar = this.d;
            if (z3) {
                eqe.b bVar2 = (eqe.b) eqeVar;
                ArrayList arrayList2 = alk.o(gwxVar.a, mycVar.h(bVar2.a, null)).a;
                if (arrayList2.isEmpty()) {
                    return;
                }
                String str = bVar2.b;
                aVar.b(new c2r.f.d(arrayList2, (str == null || str.length() == 0 || str.equals("null")) ? PaginationKey.LoadedFull.b : new PaginationKey.Next(str), null, bVar2.c));
                aVar.a(new qvq.a.C3575a(arrayList2));
                return;
            }
            if (eqeVar instanceof eqe.e) {
                eqe.e eVar = (eqe.e) eqeVar;
                ArrayList h = mycVar.h(eVar.a, null);
                String str2 = eVar.b;
                aVar.b(new c2r.h.d(h, (str2 == null || str2.length() == 0 || str2.equals("null")) ? PaginationKey.LoadedFull.b : new PaginationKey.Next(str2), null, null));
                return;
            }
            if (eqeVar instanceof eqe.a) {
                eqe.a aVar5 = (eqe.a) eqeVar;
                ArrayList h2 = mycVar.h(aVar5.a, null);
                String str3 = aVar5.b;
                PaginationKey next2 = (str3 == null || str3.length() == 0 || str3.equals("null")) ? PaginationKey.LoadedFull.b : new PaginationKey.Next(str3);
                ea90.a.b bVar3 = ea90.a.b.a;
                ea90 ea90Var = new ea90(next2, bVar3);
                String str4 = aVar5.c;
                aVar.b(new f2r(h2, new ea90((str4 == null || str4.length() == 0 || str4.equals("null")) ? PaginationKey.LoadedFull.b : new PaginationKey.Next(str4), bVar3), ea90Var));
                return;
            }
            if (!(eqeVar instanceof eqe.d)) {
                throw new NoWhenBranchMatchedException();
            }
            List<FeedItem> list3 = gwxVar.a;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list3) {
                if (obj instanceof FeedItem.f) {
                    arrayList3.add(obj);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                SdkClipVideoFile sdkClipVideoFile = ((FeedItem.f) it2.next()).e;
                List<SdkClipsDraftablePlaylist> d0 = sdkClipVideoFile.d0();
                ArrayList arrayList4 = new ArrayList(c5g.u(d0, 10));
                for (SdkClipsDraftablePlaylist sdkClipsDraftablePlaylist : d0) {
                    int i4 = sdkClipsDraftablePlaylist.b;
                    eqe.d dVar = (eqe.d) eqeVar;
                    if (i4 == dVar.a) {
                        sdkClipsDraftablePlaylist = new SdkClipsDraftablePlaylist(i4, dVar.b, sdkClipsDraftablePlaylist.d, sdkClipsDraftablePlaylist.e);
                    }
                    arrayList4.add(sdkClipsDraftablePlaylist);
                }
                sv1Var.A(new gyr0(sdkClipVideoFile.M1(arrayList4)));
            }
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
