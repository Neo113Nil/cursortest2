package xsna;

import android.os.Parcelable;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Image;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class pf4 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pf4(int i, NewsEntry newsEntry) {
        this.b = 1;
        this.c = i;
        this.d = newsEntry;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        fg4 fg4Var;
        DownloadingState downloadingState;
        ArrayList arrayList;
        h8u h8uVar;
        List<hfz> list;
        boolean z;
        int i = this.b;
        int i2 = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                String str = (String) obj2;
                qyg0 V0 = ((hyg0) obj).V0("SELECT * FROM audio_book WHERE uid = ? AND book_id = ? LIMIT 1");
                try {
                    V0.D3(1, str);
                    V0.bindLong(2, i2);
                    int k = egi.k(V0, "id");
                    int k2 = egi.k(V0, "uid");
                    int k3 = egi.k(V0, "book_id");
                    int k4 = egi.k(V0, "title");
                    int k5 = egi.k(V0, "annotation");
                    int k6 = egi.k(V0, "minimum_age");
                    int k7 = egi.k(V0, "is_explicit");
                    int k8 = egi.k(V0, "duration");
                    int k9 = egi.k(V0, "updated_at");
                    int k10 = egi.k(V0, "cover_image");
                    int k11 = egi.k(V0, "copyright");
                    int k12 = egi.k(V0, "release_date");
                    int k13 = egi.k(V0, "is_favorite");
                    int k14 = egi.k(V0, "access_status");
                    int k15 = egi.k(V0, "track_code");
                    int k16 = egi.k(V0, "context_flags_mask");
                    int k17 = egi.k(V0, "restriction");
                    int k18 = egi.k(V0, "downloading_state");
                    int k19 = egi.k(V0, "json_raw");
                    if (V0.step()) {
                        int i3 = (int) V0.getLong(k);
                        UserId b = fwx0.b(V0.l2(k2));
                        int i4 = (int) V0.getLong(k3);
                        String l2 = V0.l2(k4);
                        String l22 = V0.l2(k5);
                        int i5 = (int) V0.getLong(k6);
                        boolean z2 = ((int) V0.getLong(k7)) != 0;
                        int i6 = (int) V0.getLong(k8);
                        int i7 = (int) V0.getLong(k9);
                        Image g = yfb.g(V0.isNull(k10) ? null : V0.l2(k10));
                        String l23 = V0.isNull(k11) ? null : V0.l2(k11);
                        Integer valueOf = V0.isNull(k12) ? null : Integer.valueOf((int) V0.getLong(k12));
                        boolean z3 = ((int) V0.getLong(k13)) != 0;
                        String l24 = V0.l2(k14);
                        String l25 = V0.l2(k15);
                        int i8 = (int) V0.getLong(k16);
                        String l26 = V0.isNull(k17) ? null : V0.l2(k17);
                        MusicDynamicRestriction musicDynamicRestriction = l26 == null ? null : (MusicDynamicRestriction) MusicDynamicRestriction.i.a(new JSONObject(l26));
                        int i9 = (int) V0.getLong(k18);
                        if (i9 == 0) {
                            downloadingState = DownloadingState.NotLoaded.b;
                        } else if (i9 == 1) {
                            downloadingState = DownloadingState.Downloaded.b;
                        } else if (i9 == 2) {
                            downloadingState = DownloadingState.PendingDownload.b;
                        } else if (i9 == 3) {
                            downloadingState = DownloadingState.PartlyDownloaded.b;
                        } else {
                            if (i9 != 4) {
                                throw new IllegalStateException("Incorrect download state value");
                            }
                            downloadingState = DownloadingState.Corrupted.b;
                        }
                        fg4Var = new fg4(i3, b, i4, l2, l22, i5, z2, i6, i7, g, l23, valueOf, z3, l24, l25, i8, musicDynamicRestriction, downloadingState, V0.l2(k19));
                    } else {
                        fg4Var = null;
                    }
                    return fg4Var;
                } finally {
                    V0.close();
                }
            case 1:
                NewsEntry newsEntry = (NewsEntry) obj2;
                u1c0 u1c0Var = (u1c0) obj;
                return Boolean.valueOf(u1c0Var.c == i2 && (epx.f(u1c0Var.b, newsEntry) || epx.f(u1c0Var.a, newsEntry)));
            case 2:
                cxo cxoVar = (cxo) obj2;
                h8u h8uVar2 = cxoVar.J;
                if (h8uVar2 == null || (list = h8uVar2.j) == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(list);
                    arrayList = new ArrayList(c5g.u(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        hfz hfzVar = (hfz) it.next();
                        if (epx.f(hfzVar.getItemId(), Integer.valueOf(i2)) && (hfzVar instanceof u7u)) {
                            u7u u7uVar = (u7u) hfzVar;
                            hfzVar = new t7u(u7uVar.b, u7uVar.c, u7uVar.d, u7uVar.e, u7uVar.f, u7uVar.g, u7uVar.h, u7uVar.i, u7uVar.j);
                        }
                        arrayList.add(hfzVar);
                    }
                }
                h8u h8uVar3 = cxoVar.J;
                List list2 = arrayList;
                if (h8uVar3 != null) {
                    if (arrayList == null) {
                        list2 = EmptyList.b;
                    }
                    h8uVar = h8u.c(h8uVar3, list2, 524031);
                } else {
                    h8uVar = null;
                }
                cxoVar.J = h8uVar;
                c4u.d(cxoVar);
                return s3q0.a;
            case 3:
                Peer peer = (Peer) obj2;
                sxp sxpVar = (sxp) obj;
                if (sxpVar instanceof lc80) {
                    lc80 lc80Var = (lc80) sxpVar;
                    if (lc80Var.b.d == peer.d && lc80Var.c == i2) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                UserId userId = (UserId) obj2;
                qyg0 V02 = ((hyg0) obj).V0("SELECT * FROM story_statistics_viewer WHERE owner_id = ? AND story_id = ? ORDER BY ordinal_id");
                try {
                    bpn0 bpn0Var = bfm0.a;
                    V02.bindLong(1, userId.b);
                    V02.bindLong(2, i2);
                    int k20 = egi.k(V02, "ordinal_id");
                    int k21 = egi.k(V02, "owner_id");
                    int k22 = egi.k(V02, "story_id");
                    int k23 = egi.k(V02, "user_id");
                    int k24 = egi.k(V02, "storyStatisticsViewer");
                    ArrayList arrayList3 = new ArrayList();
                    while (V02.step()) {
                        int i10 = (int) V02.getLong(k20);
                        long j = V02.getLong(k21);
                        bpn0 bpn0Var2 = bfm0.a;
                        UserId userId2 = new UserId(j);
                        int i11 = (int) V02.getLong(k22);
                        UserId userId3 = new UserId(V02.getLong(k23));
                        rhm0 r = x1o0.r(V02.l2(k24));
                        if (r == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.vk.story.viewer.stat.`data`.cache.viewers.viewer.model.StoryStatisticsViewerDbModel', but it was NULL.");
                        }
                        arrayList3.add(new shm0(i10, userId2, i11, userId3, r));
                    }
                    return arrayList3;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }

    public /* synthetic */ pf4(Parcelable parcelable, int i, int i2) {
        this.b = i2;
        this.d = parcelable;
        this.c = i;
    }

    public /* synthetic */ pf4(String str, int i, wf4 wf4Var) {
        this.b = 0;
        this.d = str;
        this.c = i;
    }

    public /* synthetic */ pf4(cxo cxoVar, c4u c4uVar, int i) {
        this.b = 2;
        this.d = cxoVar;
        this.c = i;
    }
}
