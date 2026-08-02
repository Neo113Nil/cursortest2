package xsna;

import android.content.Context;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.stickers.bridge.GiftData;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.a080;
import xsna.zwc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class vkb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vkb(FragmentImpl fragmentImpl, String str, ihx0 ihx0Var) {
        this.b = 7;
        this.e = ihx0Var;
        this.d = str;
        this.c = fragmentImpl;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        int i2;
        Integer valueOf;
        int i3;
        Integer valueOf2;
        DownloadingState downloadingState;
        s3q0 promoteParticipant$lambda$0;
        zwc0.a bVar;
        zwc0.a bVar2;
        Post b;
        int i4 = this.b;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.e;
        switch (i4) {
            case 0:
                String str = (String) obj4;
                List list = (List) obj2;
                qyg0 V0 = ((hyg0) obj).V0((String) obj3);
                try {
                    V0.D3(1, str);
                    Iterator it = list.iterator();
                    int i5 = 2;
                    while (it.hasNext()) {
                        V0.D3(i5, (String) it.next());
                        i5++;
                    }
                    int k = egi.k(V0, "id");
                    int k2 = egi.k(V0, "uid");
                    int k3 = egi.k(V0, "chapter_id");
                    int k4 = egi.k(V0, "title");
                    int k5 = egi.k(V0, "url");
                    int k6 = egi.k(V0, "duration");
                    int k7 = egi.k(V0, "progress_time");
                    int k8 = egi.k(V0, "progress_status");
                    int k9 = egi.k(V0, "track_code");
                    int k10 = egi.k(V0, "special_project_id");
                    int k11 = egi.k(V0, "context_flags_mask");
                    int k12 = egi.k(V0, "manifest_url");
                    int k13 = egi.k(V0, "downloading_state");
                    int k14 = egi.k(V0, X3.a.k);
                    int k15 = egi.k(V0, "json_raw");
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        ArrayList arrayList2 = arrayList;
                        int i6 = k14;
                        int i7 = (int) V0.getLong(k);
                        UserId b2 = fwx0.b(V0.l2(k2));
                        String l2 = V0.l2(k3);
                        String l22 = V0.l2(k4);
                        String l23 = V0.isNull(k5) ? null : V0.l2(k5);
                        if (V0.isNull(k6)) {
                            i = k;
                            i2 = i7;
                            valueOf = null;
                        } else {
                            i = k;
                            i2 = i7;
                            valueOf = Integer.valueOf((int) V0.getLong(k6));
                        }
                        int i8 = (int) V0.getLong(k7);
                        String l24 = V0.l2(k8);
                        String l25 = V0.isNull(k9) ? null : V0.l2(k9);
                        if (V0.isNull(k10)) {
                            i3 = i8;
                            valueOf2 = null;
                        } else {
                            i3 = i8;
                            valueOf2 = Integer.valueOf((int) V0.getLong(k10));
                        }
                        Integer valueOf3 = V0.isNull(k11) ? null : Integer.valueOf((int) V0.getLong(k11));
                        String l26 = V0.isNull(k12) ? null : V0.l2(k12);
                        int i9 = (int) V0.getLong(k13);
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
                        int i10 = k15;
                        flb flbVar = new flb(i2, b2, l2, l22, l23, valueOf, i3, l24, l25, valueOf2, valueOf3, l26, downloadingState, uh.a(V0.isNull(i6) ? null : V0.l2(i6)), V0.l2(i10));
                        k15 = i10;
                        arrayList = arrayList2;
                        arrayList.add(flbVar);
                        k = i;
                        k14 = i6;
                    }
                    V0.close();
                    return arrayList;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 1:
                nye.l((sxe) obj, (izs) obj3, (hud0) ((List) obj2).get(((rg50) obj4).getIntValue()));
                return s3q0.a;
            case 2:
                oke b3 = ((l3n0) ((u5f) obj3).a).b((dfe) obj, (com.vk.movika.sdk.base.observable.a) obj4, e3m.a(R.dimen.clips_suggestions_block_height, ((mqd) obj2).getContext()));
                b3.h = 3.5f;
                return b3;
            case 3:
                EntriesListPresenter entriesListPresenter = (EntriesListPresenter) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                entriesListPresenter.getRef();
                entriesListPresenter.a();
                com.vk.newsfeed.common.util.j.h(entriesListPresenter.A, (NewsEntry) obj4, entriesListPresenter.b.M0(), entriesListPresenter.getRef(), entriesListPresenter.a(), arrayList3, (jzf0) obj, 64);
                return arrayList3;
            case 4:
                ((wh50) obj4).setValue(Boolean.FALSE);
                ((wh50) obj2).setValue(Float.valueOf(1.0f));
                ((izs) obj3).invoke(a080.c.b);
                return s3q0.a;
            case 5:
                String str2 = (String) obj3;
                Context context = (Context) obj4;
                yp80 yp80Var = (yp80) obj2;
                StickerStockItem stickerStockItem = (StickerStockItem) obj;
                if (str2 == null) {
                    str2 = "link";
                }
                stickerStockItem.O = str2;
                zal0.m(g2v.d().a(), context, stickerStockItem, GiftData.d, null, 56);
                if (yp80Var != null) {
                    yp80Var.onSuccess();
                }
                return s3q0.a;
            case 6:
                promoteParticipant$lambda$0 = StereoRoomManagerImpl.promoteParticipant$lambda$0((StereoRoomManagerImpl) obj3, (gzs) obj4, (izs) obj2, (CallParticipant.ParticipantId) obj);
                return promoteParticipant$lambda$0;
            default:
                ihx0 ihx0Var = (ihx0) obj4;
                String str3 = (String) obj3;
                FragmentImpl fragmentImpl = (FragmentImpl) obj2;
                Group group = (Group) obj;
                int i11 = rfc0.a;
                q860 q860Var = new q860();
                qfx0.d.getClass();
                UserId userId = ihx0Var.a;
                UserId userId2 = ihx0Var.b;
                Boolean valueOf4 = Boolean.valueOf(ihx0Var.e);
                Integer valueOf5 = Integer.valueOf(ihx0Var.g);
                if (!fkq0.c(group.c)) {
                    group = null;
                }
                if (group != null) {
                    bVar2 = new zwc0.a.C4207a(group.c, 6);
                } else {
                    if (!fkq0.c(userId2)) {
                        bVar = new zwc0.a.b(userId, null);
                        q860Var.j = zwc0.a(q860Var.j, bVar, null, null, null, null, false, 62);
                        if (str3 != null || str3.length() == 0) {
                            str3 = null;
                        }
                        if (str3 != null || (b = p6c0.b(new JSONObject(str3), null, null, null, 30)) == null) {
                            q860Var.f = epc0.NewPost;
                        } else if (b.n > 0) {
                            q860Var.h = Post.Nb(b, null, UserId.d, 0, null, 0, null, null, null, null, -3);
                            q860Var.f = epc0.EditPost;
                        } else {
                            zwc0 zwc0Var = q860Var.j;
                            String str4 = b.s;
                            ArrayList<EntryAttachment> arrayList4 = b.z;
                            ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
                            Iterator<T> it2 = arrayList4.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(((EntryAttachment) it2.next()).b);
                            }
                            q860Var.j = zwc0.a(zwc0Var, null, str4, arrayList5, null, null, false, 57);
                            q860Var.f = epc0.NewPost;
                        }
                        q860Var.k = false;
                        q860Var.m = valueOf5;
                        q860Var.n = true;
                        q860Var.o = valueOf4.equals(Boolean.TRUE);
                        q860Var.p(116, fragmentImpl.mo2getContext());
                        return s3q0.a;
                    }
                    bVar2 = new zwc0.a.b(userId2, null);
                }
                bVar = bVar2;
                q860Var.j = zwc0.a(q860Var.j, bVar, null, null, null, null, false, 62);
                if (str3 != null) {
                }
                str3 = null;
                if (str3 != null) {
                }
                q860Var.f = epc0.NewPost;
                q860Var.k = false;
                q860Var.m = valueOf5;
                q860Var.n = true;
                q860Var.o = valueOf4.equals(Boolean.TRUE);
                q860Var.p(116, fragmentImpl.mo2getContext());
                return s3q0.a;
        }
    }

    public /* synthetic */ vkb(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    public /* synthetic */ vkb(String str, String str2, List list, elb elbVar) {
        this.b = 0;
        this.d = str;
        this.e = str2;
        this.c = list;
    }

    public /* synthetic */ vkb(nye nyeVar, izs izsVar, List list, rg50 rg50Var) {
        this.b = 1;
        this.d = izsVar;
        this.c = list;
        this.e = rg50Var;
    }
}
