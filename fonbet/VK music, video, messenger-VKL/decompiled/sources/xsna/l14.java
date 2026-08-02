package xsna;

import android.content.Context;
import android.net.Uri;
import com.ironsource.X3;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.core.compose.component.button.DropdownButton$Appearance;
import com.vk.core.serialize.Serializer;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Image;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.im.engine.models.messages.MessagesType;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.permission.PermissionHelper;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.api.id.CallId;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import xsna.e24;
import xsna.i4c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class l14 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l14(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Boolean bool;
        String l2;
        int i;
        int i2;
        DownloadingState downloadingState;
        boolean z;
        int i3 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i3) {
            case 0:
                m14 m14Var = (m14) obj4;
                AttachDoc attachDoc = (AttachDoc) obj3;
                MsgFromChannel msgFromChannel = (MsgFromChannel) obj2;
                e24.a aVar = (e24.a) obj;
                Context context = m14Var.a;
                h9k0 h9k0Var = m14Var.d;
                if (aVar instanceof e24.a.b) {
                    a1w a1wVar = m14Var.b;
                    long j = msgFromChannel.c;
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    a1wVar.D(m14Var, new p14(Peer.a.b(j), msgFromChannel.b, attachDoc.b, MessagesType.CHANNEL));
                    h9k0Var.e(context.getString(R.string.vkim_download_started), null);
                } else if (aVar instanceof e24.a.c) {
                    h9k0Var.d(R.string.vkim_download_impossible);
                } else {
                    if (!(aVar instanceof e24.a.C2773a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    m14Var.c.getClass();
                    Uri fromFile = Uri.fromFile(((e24.a.C2773a) aVar).a.i1());
                    String scheme = fromFile.getScheme();
                    String lastPathSegment = fromFile.getLastPathSegment();
                    if (scheme == null || !(scheme.equals("http") || scheme.equals(HttpRequest.DEFAULT_SCHEME))) {
                        vao.g(context, fromFile.toString());
                    } else if (!vao.j(context, fromFile, true)) {
                        grb grbVar = new grb(context, lastPathSegment, fromFile, 8);
                        if (gz80.a(34)) {
                            grbVar.invoke();
                        } else {
                            PermissionHelper permissionHelper = PermissionHelper.a;
                            permissionHelper.getClass();
                            permissionHelper.d(context, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, grbVar, null);
                        }
                    }
                }
                return s3q0.a;
            case 1:
                hr8 hr8Var = (hr8) obj4;
                nvy nvyVar = (nvy) obj;
                ListBuilder listBuilder = hr8Var.b;
                nvyVar.e(listBuilder.size(), new cr8(new cj1(5), listBuilder), new dr8(listBuilder, 0), new jai(802480018, new er8(listBuilder, hr8Var, (VkBlurContentView) obj3, (rv5) obj2), true));
                nvy.g(nvyVar, null, null, new jai(-546004487, new x95(hr8Var, 1), true), 3);
                zrp<DropdownButton$Appearance> zrpVar = hr8Var.c;
                nvyVar.e(zrpVar.size(), null, new fr8(zrpVar), new jai(802480018, new gr8(zrpVar), true));
                return s3q0.a;
            case 2:
                xdw0 xdw0Var = (xdw0) obj3;
                a1w a1wVar2 = (a1w) obj;
                CallId b = OKVoipEngine.b.b();
                String str = xdw0Var.g;
                vx2.a.getClass();
                return a1wVar2.C((jsa) obj2, new lzo(b, (String) obj4, str, vx2.b().a.f.toString(), xdw0Var.b));
            case 3:
                nvy nvyVar2 = (nvy) obj;
                ArrayList arrayList = ((v8s) obj4).a;
                nvyVar2.e(arrayList.size(), new i4c.a(new z90(13), arrayList), new i4c.b(new lt0(14), arrayList), new jai(802480018, new i4c.c(arrayList, (l5c) obj3, (izs) obj2), true));
                nvy.g(nvyVar2, null, null, pci.a, 3);
                return s3q0.a;
            case 4:
                ClipsGridFragment clipsGridFragment = (ClipsGridFragment) obj4;
                Context context2 = (Context) obj3;
                ClipGridParams.Data data = (ClipGridParams.Data) obj2;
                qcy<Object>[] qcyVarArr = ClipsGridFragment.H0;
                int i4 = ((e520) obj).a;
                if (i4 == R.id.grid_more_menu_action_report) {
                    clipsGridFragment.mo().b2(context2, data);
                } else if (i4 == R.id.grid_more_menu_action_block) {
                    clipsGridFragment.mo().o2(context2, data);
                } else if (i4 == R.id.grid_more_menu_action_unblock) {
                    clipsGridFragment.mo().f2(context2, data);
                } else if (i4 == R.id.grid_more_menu_action_share) {
                    clipsGridFragment.mo().Z1(data);
                }
                return s3q0.a;
            case 5:
                vve.e(((com.vk.clips.playlists.di.a) obj4).c, new ove(((ClipsPlaylist) obj3).c), false, ((Boolean) ((nm0) obj2).invoke()).booleanValue(), 2);
                return s3q0.a;
            case 6:
                String str2 = (String) obj3;
                List list = (List) obj2;
                qyg0 V0 = ((hyg0) obj).V0((String) obj4);
                try {
                    V0.D3(1, str2);
                    Iterator it = list.iterator();
                    int i5 = 2;
                    while (it.hasNext()) {
                        V0.D3(i5, (String) it.next());
                        i5++;
                    }
                    int k = egi.k(V0, "id");
                    int k2 = egi.k(V0, "uid");
                    int k3 = egi.k(V0, "mid");
                    int k4 = egi.k(V0, "track_code");
                    int k5 = egi.k(V0, "title");
                    int k6 = egi.k(V0, "artist");
                    int k7 = egi.k(V0, "url");
                    int k8 = egi.k(V0, "duration");
                    int k9 = egi.k(V0, "date");
                    int k10 = egi.k(V0, "is_explicit");
                    int k11 = egi.k(V0, "is_focus_track");
                    int k12 = egi.k(V0, "plays");
                    int k13 = egi.k(V0, "is_favorite");
                    int k14 = egi.k(V0, X3.i.L);
                    int k15 = egi.k(V0, "description");
                    int k16 = egi.k(V0, "cover");
                    int k17 = egi.k(V0, "post_id");
                    int k18 = egi.k(V0, "is_donut");
                    int k19 = egi.k(V0, "downloading_state");
                    int k20 = egi.k(V0, X3.a.k);
                    int k21 = egi.k(V0, "manifest_url");
                    int k22 = egi.k(V0, "json_raw");
                    ArrayList arrayList2 = new ArrayList();
                    while (V0.step()) {
                        int i6 = k13;
                        int i7 = k12;
                        int i8 = (int) V0.getLong(k);
                        UserId b2 = fwx0.b(V0.l2(k2));
                        String l22 = V0.l2(k3);
                        String l23 = V0.isNull(k4) ? null : V0.l2(k4);
                        String l24 = V0.isNull(k5) ? null : V0.l2(k5);
                        String l25 = V0.isNull(k6) ? null : V0.l2(k6);
                        String l26 = V0.isNull(k7) ? null : V0.l2(k7);
                        Long valueOf = V0.isNull(k8) ? null : Long.valueOf(V0.getLong(k8));
                        Long valueOf2 = V0.isNull(k9) ? null : Long.valueOf(V0.getLong(k9));
                        boolean z2 = ((int) V0.getLong(k10)) != 0;
                        Integer valueOf3 = V0.isNull(k11) ? null : Integer.valueOf((int) V0.getLong(k11));
                        if (valueOf3 != null) {
                            bool = Boolean.valueOf(valueOf3.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        int i9 = k10;
                        int i10 = (int) V0.getLong(i7);
                        boolean z3 = ((int) V0.getLong(i6)) != 0;
                        long j2 = V0.getLong(k14);
                        int i11 = k15;
                        String l27 = V0.isNull(i11) ? null : V0.l2(i11);
                        int i12 = k16;
                        Image g = yfb.g(V0.isNull(i12) ? null : V0.l2(i12));
                        int i13 = k;
                        int i14 = k17;
                        if (V0.isNull(i14)) {
                            l2 = null;
                            k17 = i14;
                            i2 = i11;
                            i = k18;
                        } else {
                            l2 = V0.l2(i14);
                            k17 = i14;
                            i = k18;
                            i2 = i11;
                        }
                        boolean z4 = ((int) V0.getLong(i)) != 0;
                        int i15 = k19;
                        int i16 = (int) V0.getLong(i15);
                        if (i16 == 0) {
                            downloadingState = DownloadingState.NotLoaded.b;
                        } else if (i16 == 1) {
                            downloadingState = DownloadingState.Downloaded.b;
                        } else if (i16 == 2) {
                            downloadingState = DownloadingState.PendingDownload.b;
                        } else if (i16 == 3) {
                            downloadingState = DownloadingState.PartlyDownloaded.b;
                        } else {
                            if (i16 != 4) {
                                throw new IllegalStateException("Incorrect download state value");
                            }
                            downloadingState = DownloadingState.Corrupted.b;
                        }
                        DownloadingState downloadingState2 = downloadingState;
                        int i17 = k20;
                        int i18 = k21;
                        int i19 = i;
                        int i20 = k22;
                        k22 = i20;
                        arrayList2.add(new xsp(i8, b2, l22, l23, l24, l25, l26, valueOf, valueOf2, z2, bool, i10, z3, j2, l27, g, l2, z4, downloadingState2, uh.a(V0.isNull(i17) ? null : V0.l2(i17)), V0.isNull(i18) ? null : V0.l2(i18), V0.l2(i20)));
                        k19 = i15;
                        k13 = i6;
                        k = i13;
                        k21 = i18;
                        k15 = i2;
                        k16 = i12;
                        k18 = i19;
                        k10 = i9;
                        k20 = i17;
                        k12 = i7;
                    }
                    V0.close();
                    return arrayList2;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 7:
                nk40 nk40Var = (nk40) obj3;
                MusicTrack musicTrack = (MusicTrack) obj2;
                UIBlock uIBlock = (UIBlock) obj;
                if (!uIBlock.Ib().contains((String) obj4)) {
                    if (uIBlock instanceof UIBlockMusicTrack ? nk40Var.b(uIBlock, ((UIBlockMusicTrack) uIBlock).Rb(), musicTrack, true) : uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryTrack ? nk40Var.b(uIBlock, ((UIBlockSearchHistory.UIBlockSearchHistoryTrack) uIBlock).Rb(), musicTrack, true) : false) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                ncl0 ncl0Var = (ncl0) obj4;
                StickerStockItem stickerStockItem = (StickerStockItem) obj3;
                izs<? super StickerStockItem, s3q0> izsVar = (izs) obj2;
                if (((BaseOkResponseDto) obj) == BaseOkResponseDto.OK) {
                    ncl0Var.f1(stickerStockItem, izsVar);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ l14(String str, String str2, List list, wsp wspVar) {
        this.b = 6;
        this.c = str;
        this.d = str2;
        this.e = list;
    }
}
