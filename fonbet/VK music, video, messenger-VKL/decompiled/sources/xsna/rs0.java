package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.configuration.MusicVerticalStackedListVh;
import com.vk.catalog2.feature.music.configuration.MusicVerticalStackedListVh$createDefaultOfflineBlock$1;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh;
import com.vk.catalog2.feature.music.ui.holder.MusicHistoryRemoveAllVh;
import com.vk.channels.impl.channel_screen.AppChannelFragment;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.Playlist;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.engine.models.groups.WarningNotification;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastAuthor;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.profile.community.impl.ui.trust_mark.CommunityTrustMarksArgs;
import com.vk.profile.community.impl.ui.trust_mark.c;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeDownloadClip;
import com.vk.stickers.settings.StickerSettingsFeature;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import one.video.player.OneVideoPlayer;
import org.json.JSONObject;
import xsna.dn90;
import xsna.gyw;
import xsna.ht0;
import xsna.l7x0;
import xsna.lzd;
import xsna.o9t;
import xsna.qjh;
import xsna.r2c;
import xsna.szb0;
import xsna.um90;
import xsna.xyj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class rs0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rs0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v26, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.gzs
    public final Object invoke() {
        View view;
        gpa0 gpa0Var;
        boolean z;
        Group group;
        yvj initialize$lambda$220$lambda$7;
        int i = this.b;
        boolean z2 = true;
        int i2 = 2;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ht0 ht0Var = (ht0) obj2;
                izs izsVar = (izs) obj;
                if (ht0Var instanceof ht0.b) {
                    izsVar.invoke(xyj.a.C4053a.b);
                } else {
                    if (!(ht0Var instanceof ht0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    izsVar.invoke(xyj.a.b.b);
                }
                return s3q0.a;
            case 1:
                AppChannelFragment appChannelFragment = (AppChannelFragment) obj2;
                int i3 = AppChannelFragment.l1;
                itg0.j(((rta) appChannelFragment.d1.getValue()).a(((WarningNotification) obj).h(), appChannelFragment.mo()), null, 3);
                return s3q0.a;
            case 2:
                gm9 gm9Var = (gm9) obj;
                if (!epx.f((szb0.a) obj2, gm9Var.H1) && (view = gm9Var.V) != null) {
                    view.setVisibility(4);
                }
                return s3q0.a;
            case 3:
                ((cxb) obj2).x.d((DialogMember) obj);
                return s3q0.a;
            case 4:
                ((izs) obj).invoke(new r2c.z(((u1x) obj2).b, "", r2c.z.a.C3592a.a));
                return s3q0.a;
            case 5:
                lzd.a aVar = (lzd.a) obj2;
                lzd lzdVar = (lzd) obj;
                aVar.a.set(true);
                WeakReference<gpa0> weakReference = aVar.b;
                if (weakReference != null && (gpa0Var = weakReference.get()) != null) {
                    gpa0Var.cancel();
                }
                qzd j = bzd.this.j();
                if (j != null) {
                    j.a(new MobileOfficialAppsClipsStat$TypeDownloadClip(MobileOfficialAppsClipsStat$TypeDownloadClip.EventType.CANCEL_DOWNLOAD_CLIP));
                }
                return s3q0.a;
            case 6:
                ((qjh.b) obj2).n.invoke((GoodAlbum) obj);
                return s3q0.a;
            case 7:
                ((izs) obj).invoke(new c.g(((CommunityTrustMarksArgs.TrustMarkData) obj2).b));
                return s3q0.a;
            case 8:
                llu lluVar = (llu) obj2;
                View view2 = (View) obj;
                uij uijVar = (uij) lluVar.d.getValue();
                l7s u = bwt0.u(view2.getContext());
                BroadcastAuthor.Group group2 = lluVar.j;
                if (group2 == null || (group = group2.b) == null) {
                    z = false;
                } else {
                    int i4 = group.m;
                    if (i4 != 2 && i4 != 1) {
                        z2 = false;
                    }
                    z = z2;
                }
                int i5 = 13;
                uijVar.e(u, z, lluVar.b().j().b, new g1j(lluVar, i5), new pw(i5, view2, lluVar));
                return s3q0.a;
            case 9:
                ((u2b0) obj2).n0((gyw.a) obj);
                return s3q0.a;
            case 10:
                MusicHistoryRemoveAllVh musicHistoryRemoveAllVh = (MusicHistoryRemoveAllVh) obj2;
                musicHistoryRemoveAllVh.f.getClass();
                io.reactivex.rxjava3.internal.operators.observable.m1 T = rsg0.T(yfb.x(new tfx("audio.clearDownloadHistory", new mr(3), new sn(7))));
                asu0 asu0Var = asu0.a;
                musicHistoryRemoveAllVh.g.b(T.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new s440(new defpackage.h0(20, musicHistoryRemoveAllVh, (UIBlock) obj), i2)));
                return s3q0.a;
            case 11:
                MusicVerticalStackedListVh musicVerticalStackedListVh = (MusicVerticalStackedListVh) obj2;
                View view3 = (View) obj;
                b5a b5aVar = musicVerticalStackedListVh.e.b.f;
                UIBlock uIBlock = musicVerticalStackedListVh.L;
                if (uIBlock == null) {
                    uIBlock = new MusicVerticalStackedListVh$createDefaultOfflineBlock$1("", CatalogViewType.UNKNOWN, CatalogDataType.DATA_TYPE_NONE, "", UserId.d, EmptyList.b, EmptySet.b, null, null, null, null, null, null, null, null, 32512, null);
                }
                b5aVar.a(new cfp0(uIBlock, new pp40()));
                Activity w = bwt0.w(view3);
                if (w != null) {
                    lyd.g().N(w);
                }
                return s3q0.a;
            case 12:
                ((bn90) obj2).T(new dn90.d(((um90.g) obj).b));
                return s3q0.a;
            case 13:
                ubb0 ubb0Var = (ubb0) obj2;
                UserId userId = (UserId) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + userId.b});
                }
                List<uab0> i6 = ubb0Var.c.i(String.valueOf(userId.b));
                ArrayList arrayList = new ArrayList(c5g.u(i6, 10));
                for (uab0 uab0Var : i6) {
                    Playlist playlist = new Playlist(new JSONObject(uab0Var.e));
                    playlist.H = uab0Var.d;
                    arrayList.add(playlist);
                }
                return arrayList;
            case 14:
                b7d0 b7d0Var = (b7d0) obj2;
                ine0 ine0Var = b7d0Var.F;
                nvl nvlVar = new nvl(l7x0.e.a, (lad0) obj, b7d0Var.D, b7d0Var, b7d0Var.K, b7d0Var.L);
                ine0Var.getClass();
                nvlVar.a();
                return s3q0.a;
            case 15:
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) obj;
                bqu0 bqu0Var = ((a2e0) obj2).b;
                if (bqu0Var != null) {
                    bqu0Var.a(new nt10(cVar, 17));
                }
                return s3q0.a;
            case 16:
                izs izsVar2 = (izs) obj;
                uet uetVar = ((w7t) obj2).b;
                if (uetVar != null) {
                    izsVar2.invoke(new o9t.a(uetVar));
                }
                return s3q0.a;
            case 17:
                UserProfile userProfile = (UserProfile) obj;
                q76.d((com.vk.qrcode.c) obj2, userProfile, new p1d0(userProfile, 5), 2);
                userProfile.k = false;
                return s3q0.a;
            case 18:
                ((gzs) obj2).invoke();
                dw20 dw20Var = ((yrf0) obj).a;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 19:
                ((wzs) obj2).invoke(Long.valueOf(((wgg0) obj).a), 0);
                return s3q0.a;
            case 20:
                SearchHistoryItemVh searchHistoryItemVh = (SearchHistoryItemVh) obj2;
                UIBlockSearchHistory<?> uIBlockSearchHistory = searchHistoryItemVh.d;
                Context context = ((ComposeView) obj).getContext();
                if (uIBlockSearchHistory != null && context != null) {
                    searchHistoryItemVh.c.z(0, uIBlockSearchHistory);
                    searchHistoryItemVh.d(uIBlockSearchHistory, context);
                }
                return s3q0.a;
            case 21:
                initialize$lambda$220$lambda$7 = ServiceProvider.initialize$lambda$220$lambda$7((UnityAdsModule) obj2, (ServicesRegistry) obj);
                return initialize$lambda$220$lambda$7;
            case 22:
                oyk0 oyk0Var = (oyk0) obj2;
                OneVideoPlayer oneVideoPlayer = (OneVideoPlayer) obj;
                OneVideoPlayer oneVideoPlayer2 = oyk0Var.f;
                return "StatisticListener player setter: " + oneVideoPlayer2 + " [" + (oneVideoPlayer2 != null ? Integer.valueOf(oneVideoPlayer2.N()) : null) + "] -> " + oneVideoPlayer + " [" + (oneVideoPlayer != null ? Integer.valueOf(oneVideoPlayer.N()) : null) + "] " + oyk0Var.d();
            case 23:
                ((StickerSettingsFeature) obj2).V((StickerStockItem) obj, false);
                return s3q0.a;
            case 24:
                ((m8t0) obj2).a.c.invoke();
                ((gzs) obj).invoke();
                return s3q0.a;
            default:
                com.vk.voip.ui.hint.a aVar2 = (com.vk.voip.ui.hint.a) obj2;
                ?? r7 = (FunctionReferenceImpl) obj;
                aVar2.b.getClass();
                if (com.vk.voip.ui.c.z0()) {
                    r7.invoke();
                }
                aVar2.c();
                return s3q0.a;
        }
    }

    public /* synthetic */ rs0(int i, Object obj, izs izsVar) {
        this.b = i;
        this.d = izsVar;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ rs0(com.vk.voip.ui.hint.a aVar, gzs gzsVar) {
        this.b = 25;
        this.c = aVar;
        this.d = (FunctionReferenceImpl) gzsVar;
    }
}
