package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Spannable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.catalog.sandbox.SandboxCatalogRootVh;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.error.CatalogEntryPointResolveFailedException;
import com.vk.catalog2.common.dto.api.error.CatalogRestoreException;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.auto.VKAndroidAutoCatalogMediaService;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.friend.FriendsCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipDiscoverRootVh;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipGlobalSearchFeatureRootVh;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh;
import com.vk.catalog2.common.ui.mvp.holder.clip.VideoCatalogSearchRootVh;
import com.vk.catalog2.common.ui.mvp.holder.friends.FriendsCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.group.FriendCommunitiesCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupsCollectionCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchFriendFriendsCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchGamesInServiceCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchGroupMembersCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchInCommunityCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchOwnerVideosCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.search.apps.SearchMiniAppsInServiceCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.sticker.StickerCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicClipsSelectorCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.AuthorsCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.category.VideoCategoryRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistRootVh;
import com.vk.catalog2.feature.music.configuration.MusicSearchCatalogConfiguration;
import com.vk.catalog2.feature.music.configuration.a;
import com.vk.catalog2.feature.music.configuration.b;
import com.vk.catalog2.feature.music.ui.holder.AudioBookGenreCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.AudioBookPersonCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.AudioBookPersonGenreCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicArtistCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicCuratorCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicDownloadsHistoryCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.PodcastCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.PodcastCategoryCatalogRootVh;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.search.communities.map.catalog.root.SearchCommunitiesOnMapListRootVh;
import com.vk.search.integration.followers.impl.presentation.SearchFollowersCatalogRootVh;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchAllCatalogRootVh;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchChannelsCatalogRootVh;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchFeedCatalogRootVh;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGamesCatalogRootVh;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGroupsCatalogRootVh;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGroupsCatalogRootVhOld;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchPeopleCatalogRootVh;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchVideoRootVh;
import com.vk.search.ui.impl.catalog.roots.MusicSearchCatalogRootVh;
import com.vk.search.ui.impl.catalog.roots.apps.GlobalSearchMiniappsCatalogRootVh;
import com.vk.stickers.ContextUser;
import com.vk.video.profile.presentation.catalog.holders.VideoProfileCatalogContentVh;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.InitializedLazyImpl;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.b9s0;
import xsna.mf40;
import xsna.nvs;
import xsna.t4a;
import xsna.u4a;
import xsna.v4a;

/* compiled from: VkCatalogEntryPointParamsFactory.kt */
/* loaded from: classes.dex */
public final class xhu0 implements t4a {
    public final q3a a;
    public final bpn0 b;
    public final bpn0 c;
    public final bpn0 d;
    public final bpn0 e;
    public final bpn0 f;
    public final bpn0 g;
    public final bpn0 h;
    public final bpn0 i;
    public final bpn0 j;
    public final bpn0 k;
    public final bpn0 l;
    public final Object m = msy.a(LazyThreadSafetyMode.NONE, new cuq(this, 8));
    public final ArrayList n;

    /* compiled from: VkCatalogEntryPointParamsFactory.kt */
    /* loaded from: classes16.dex */
    public static final class a implements r8a {
        @Override // xsna.r8a
        public final CharSequence a(String str) {
            return xwk.d().a().m(str);
        }

        @Override // xsna.r8a
        public final CharSequence b(CharSequence charSequence, View.OnClickListener onClickListener, float f) {
            CharSequence f2 = xwk.d().a().f(charSequence, f);
            if (f2 instanceof Spannable) {
                x7q[] x7qVarArr = (x7q[]) ((Spannable) f2).getSpans(0, f2.length(), x7q.class);
                if (x7qVarArr != null) {
                    for (x7q x7qVar : x7qVarArr) {
                        x7qVar.m = onClickListener;
                    }
                }
            }
            return f2;
        }
    }

    /* compiled from: VkCatalogEntryPointParamsFactory.kt */
    /* loaded from: classes16.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipDiscoverRootVh.CatalogViewType.values().length];
            try {
                iArr[ClipDiscoverRootVh.CatalogViewType.MUSIC_TEMPLATES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipDiscoverRootVh.CatalogViewType.TRENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public xhu0(q3a q3aVar, bpn0 bpn0Var, bpn0 bpn0Var2, bpn0 bpn0Var3, bpn0 bpn0Var4, bpn0 bpn0Var5, bpn0 bpn0Var6, bpn0 bpn0Var7, bpn0 bpn0Var8, bpn0 bpn0Var9, bpn0 bpn0Var10, bpn0 bpn0Var11, bpn0 bpn0Var12, bpn0 bpn0Var13, bpn0 bpn0Var14) {
        this.a = q3aVar;
        this.b = bpn0Var;
        this.c = bpn0Var6;
        this.d = bpn0Var7;
        this.e = bpn0Var8;
        this.f = bpn0Var9;
        this.g = bpn0Var10;
        this.h = bpn0Var11;
        this.i = bpn0Var12;
        this.j = bpn0Var13;
        this.k = bpn0Var14;
        this.l = bpn0Var2;
        ArrayList arrayList = new ArrayList();
        this.n = arrayList;
        arrayList.add(bpn0Var3);
        arrayList.add(bpn0Var4);
        arrayList.add(bpn0Var5);
    }

    @Override // xsna.t4a
    public final u4a.a a(Bundle bundle, String str) {
        Object obj;
        String a2 = t4a.a.a(str);
        if (bxj0.b(SandboxCatalogRootVh.class, a2) || bxj0.b(StickerCatalogRootVh.class, a2) || bxj0.b(PodcastCatalogRootVh.class, a2) || bxj0.b(AudioBookGenreCatalogRootVh.class, a2) || bxj0.b(AudioBookPersonGenreCatalogRootVh.class, a2) || bxj0.b(AudioBookPersonCatalogRootVh.class, a2) || bxj0.b(PodcastCategoryCatalogRootVh.class, a2) || bxj0.b(VKAndroidAutoCatalogMediaService.class, a2) || bxj0.b(VKAndroidAutoCatalogMediaService.a.class, a2) || bxj0.b(MusicOfflineCatalogRootVh.class, a2)) {
            return c(bundle, str);
        }
        if (bxj0.b(MusicClipsSelectorCatalogRootVh.class, a2)) {
            return u4a.a.a(c(bundle, str), null, ((AudioModelsComponent) this.l.getValue()).s8(), null, null, null, null, null, null, null, null, null, -257, 1048575);
        }
        if (bxj0.b(MusicArtistCatalogRootVh.class, a2) || bxj0.b(MusicCuratorCatalogRootVh.class, a2) || bxj0.b(MusicMyAudiosCatalogRootVh.class, a2) || bxj0.b(MusicDownloadsHistoryCatalogRootVh.class, a2) || bxj0.b(GlobalSearchGroupsCatalogRootVh.class, a2) || bxj0.b(GlobalSearchGroupsCatalogRootVhOld.class, a2) || bxj0.b(GlobalSearchChannelsCatalogRootVh.class, a2) || bxj0.b(MusicSearchCatalogRootVh.class, a2) || bxj0.b(MusicCatalogRootVh.class, a2) || bxj0.b(FriendCommunitiesCatalogRootVh.class, a2) || bxj0.b(CommunitiesCatalogRootVh.class, a2) || bxj0.b(GroupsCollectionCatalogRootVh.class, a2) || bxj0.b(GlobalSearchPeopleCatalogRootVh.class, a2) || bxj0.b(SearchFriendFriendsCatalogRootVh.class, a2) || bxj0.b(SearchGamesInServiceCatalogRootVh.class, a2) || bxj0.b(SearchGroupMembersCatalogRootVh.class, a2) || bxj0.b(SearchFollowersCatalogRootVh.class, a2) || bxj0.b(SearchCommunitiesOnMapListRootVh.class, a2) || bxj0.b(SearchInCommunityCatalogRootVh.class, a2) || bxj0.b(GlobalSearchMiniappsCatalogRootVh.class, a2) || bxj0.b(SearchMiniAppsInServiceCatalogRootVh.class, a2) || bxj0.b(GlobalSearchFeedCatalogRootVh.class, a2) || bxj0.b(GlobalSearchGamesCatalogRootVh.class, a2)) {
            return c(bundle, str);
        }
        if (bxj0.b(GlobalSearchAllCatalogRootVh.class, a2)) {
            return u4a.a.a(c(bundle, str), null, null, null, null, null, null, "global_search_all", null, null, null, null, -134217729, 1048575);
        }
        if (bxj0.b(SearchOwnerVideosCatalogRootVh.class, a2) || bxj0.b(GlobalSearchVideoRootVh.class, a2) || bxj0.b(ClipGlobalSearchFeatureRootVh.class, a2) || bxj0.b(ClipDiscoverRootVh.class, a2) || bxj0.b(VideoCatalogRootVh.class, a2) || bxj0.b(VideoProfileCatalogContentVh.class, a2) || bxj0.b(ClipSearchRootVh.class, a2) || bxj0.b(VideoCatalogSearchRootVh.class, a2) || bxj0.b(VideoPlaylistRootVh.class, a2) || bxj0.b(AuthorsCatalogRootVh.class, a2) || bxj0.b(VideoCategoryRootVh.class, a2)) {
            return u4a.a.a(c(bundle, str), null, null, ScrollScreenType.FEED_VIDEO, null, null, null, null, null, null, null, null, -1025, 1048575);
        }
        if (bxj0.b(FriendsCatalogRootVh.class, a2)) {
            dos dosVar = new dos(new vls[0]);
            dosVar.b(new FriendsCatalogFragment.b((rj70) this.d.getValue()));
            return u4a.a.a(c(bundle, str), null, null, ScrollScreenType.FRIENDS, new cks(new w0a()), dosVar, null, null, null, null, null, null, -19457, 1048575);
        }
        Iterator it = this.n.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((y3a) ((Lazy) obj).getValue()).b().contains(a2)) {
                break;
            }
        }
        Lazy lazy = (Lazy) obj;
        if (lazy != null) {
            return u4a.a.a(c(bundle, str), null, null, ((y3a) lazy.getValue()).c(a2), null, null, null, null, null, null, null, null, -1025, 1048575);
        }
        throw new CatalogEntryPointResolveFailedException(zr.a("Unknown entryPointToken=", str, ". how to create?"));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final RecyclerView.u b() {
        int a2;
        RecyclerView.u uVar = new RecyclerView.u();
        a2 = ((mca) this.m.getValue()).a(CatalogDataType.DATA_TYPE_ACTION, CatalogViewType.BUTTONS_HORIZONTAL, null, false);
        uVar.setMaxRecycledViews(a2, 10);
        return uVar;
    }

    public final u4a.a c(Bundle bundle, String str) {
        v4a v4aVar;
        boolean z;
        lda ldaVar;
        CatalogConfiguration b9s0Var;
        Object obj;
        y3a y3aVar;
        RecyclerView.u ve5Var;
        Iterable iterable;
        xf40 xf40Var;
        boolean z2;
        nvs a2;
        izs tml0Var;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        Resources resources = context.getResources();
        boolean z3 = resources != null ? resources.getBoolean(R.bool.lenovo_tb_884f_fixed_is_tabled_resolver) : false;
        v4a.a aVar = new v4a.a();
        aVar.b(new by2(R.string.liblists_empty_list, 12, null));
        v4a a3 = aVar.a();
        lda ldaVar2 = new lda(this.a, str);
        String string = bundle.getString("___CTLG_KEY_CLASS__");
        if (ky80.c(ClipDiscoverRootVh.class, string)) {
            Serializable serializable = bundle.getSerializable("clips_catalog_view_type");
            v4aVar = a3;
            ClipDiscoverRootVh.CatalogViewType catalogViewType = serializable instanceof ClipDiscoverRootVh.CatalogViewType ? (ClipDiscoverRootVh.CatalogViewType) serializable : null;
            int i = catalogViewType == null ? -1 : b.$EnumSwitchMapping$0[catalogViewType.ordinal()];
            b9s0Var = i != 1 ? i != 2 ? new tqc(bundle) : new sdd(bundle) : new l8d(bundle);
            z = z3;
            ldaVar = ldaVar2;
        } else {
            v4aVar = a3;
            boolean c = ky80.c(GlobalSearchVideoRootVh.class, string);
            bpn0 bpn0Var = this.h;
            if (c) {
                z = z3;
                ldaVar = ldaVar2;
                b9s0Var = new ozh0(bundle, new b9s0.a(new q6s0(this, 11), bpn0Var != null ? (jsf0) bpn0Var.getValue() : null, null, 382));
            } else {
                z = z3;
                ldaVar = ldaVar2;
                if (ky80.c(GlobalSearchFeedCatalogRootVh.class, string)) {
                    b9s0Var = new osh0(bundle);
                } else if (ky80.c(SearchOwnerVideosCatalogRootVh.class, string) || ky80.c(VideoCatalogRootVh.class, string)) {
                    afl0 afl0Var = new afl0(this, 25);
                    jsf0 jsf0Var = bpn0Var != null ? (jsf0) bpn0Var.getValue() : null;
                    bpn0 bpn0Var2 = this.k;
                    b9s0Var = new b9s0(bundle, new b9s0.a(afl0Var, jsf0Var, bpn0Var2 != null ? (sos0) bpn0Var2.getValue() : null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
                } else if (ky80.c(VideoCatalogSearchRootVh.class, string)) {
                    b9s0Var = new b9s0(bundle, new b9s0.a(new orj0(this, 29), bpn0Var != null ? (jsf0) bpn0Var.getValue() : null, null, 382));
                } else {
                    int i2 = 24;
                    if (ky80.c(VideoProfileCatalogContentVh.class, string)) {
                        b9s0Var = new y6t0(bundle, new b9s0.a(new oqh0(this, i2), null, null, 510));
                    } else if (ky80.c(VideoPlaylistRootVh.class, string)) {
                        b9s0Var = new n4t0(bundle);
                    } else if (ky80.c(VideoCategoryRootVh.class, string)) {
                        b9s0Var = new est0(bundle, new b9s0.a(new ghn0(this, 19), bpn0Var != null ? (jsf0) bpn0Var.getValue() : null, null, 382));
                    } else if (ky80.c(AuthorsCatalogRootVh.class, string)) {
                        b9s0Var = new rd5(bundle, new b9s0.a(new ejf0(this, 24), bpn0Var != null ? (jsf0) bpn0Var.getValue() : null, null, 382));
                    } else if (ky80.c(StickerCatalogRootVh.class, string)) {
                        b9s0Var = new d9l0(bundle);
                    } else if (ky80.c(MusicClipsSelectorCatalogRootVh.class, string)) {
                        b9s0Var = new mf40(new mf40.b(new mwm0(this, 20), new eni0(14)), bundle);
                    } else if (ky80.c(MusicSearchCatalogRootVh.class, string)) {
                        b9s0Var = new MusicSearchCatalogConfiguration();
                    } else if (ky80.c(MusicArtistCatalogRootVh.class, string)) {
                        b9s0Var = new com.vk.catalog2.feature.music.configuration.a(bundle, new a.C0517a());
                    } else if (ky80.c(MusicCuratorCatalogRootVh.class, string)) {
                        b9s0Var = new vf40(bundle);
                    } else if (ky80.c(MusicMyAudiosCatalogRootVh.class, string)) {
                        b9s0Var = new uo40(bundle);
                    } else if (ky80.c(MusicDownloadsHistoryCatalogRootVh.class, string)) {
                        b9s0Var = new ni40(bundle);
                    } else if (ky80.c(PodcastCatalogRootVh.class, string) || ky80.c(PodcastCategoryCatalogRootVh.class, string)) {
                        b9s0Var = new kgb0(bundle);
                    } else if (ky80.c(AudioBookGenreCatalogRootVh.class, string)) {
                        b9s0Var = new bh4(bundle);
                    } else if (ky80.c(AudioBookPersonGenreCatalogRootVh.class, string)) {
                        b9s0Var = new gi4(bundle);
                    } else if (ky80.c(AudioBookPersonCatalogRootVh.class, string)) {
                        b9s0Var = new ci4(bundle);
                    } else if (ky80.c(MusicCatalogRootVh.class, string)) {
                        b9s0Var = new com.vk.catalog2.feature.music.configuration.b(bundle, new b.C0518b());
                    } else if (ky80.c(MusicOfflineCatalogRootVh.class, string)) {
                        b9s0Var = new xp40(bundle);
                    } else if (ky80.c(VKAndroidAutoCatalogMediaService.class, string)) {
                        b9s0Var = new x940(bundle);
                    } else if (ky80.c(VKAndroidAutoCatalogMediaService.a.class, string)) {
                        b9s0Var = new z940(bundle);
                    } else if (ky80.c(FriendsCatalogRootVh.class, string)) {
                        b9s0Var = new bms(bundle);
                    } else if (ky80.c(SandboxCatalogRootVh.class, string)) {
                        b9s0Var = new t0h0(bundle);
                    } else if (ky80.c(ClipSearchRootVh.class, string)) {
                        b9s0Var = new vbd(bundle);
                    } else if (ky80.c(VideoCatalogSearchRootVh.class, string)) {
                        b9s0Var = new vbd(bundle);
                    } else if (ky80.c(ClipGlobalSearchFeatureRootVh.class, string)) {
                        b9s0Var = new z1u(bundle);
                    } else if (ky80.c(GlobalSearchGroupsCatalogRootVh.class, string) || ky80.c(GlobalSearchGroupsCatalogRootVhOld.class, string) || ky80.c(GlobalSearchChannelsCatalogRootVh.class, string) || ky80.c(SearchFriendFriendsCatalogRootVh.class, string) || ky80.c(SearchGroupMembersCatalogRootVh.class, string) || ky80.c(SearchFollowersCatalogRootVh.class, string) || ky80.c(GlobalSearchPeopleCatalogRootVh.class, string) || ky80.c(GlobalSearchAllCatalogRootVh.class, string)) {
                        b9s0Var = new smh0(bundle);
                    } else if (ky80.c(GlobalSearchGamesCatalogRootVh.class, string) || ky80.c(SearchGamesInServiceCatalogRootVh.class, string)) {
                        b9s0Var = new wmh0(bundle);
                    } else if (ky80.c(GlobalSearchMiniappsCatalogRootVh.class, string) || ky80.c(SearchMiniAppsInServiceCatalogRootVh.class, string)) {
                        b9s0Var = new xmh0(bundle);
                    } else if (ky80.c(SearchCommunitiesOnMapListRootVh.class, string)) {
                        b9s0Var = new wnh0(bundle);
                    } else if (ky80.c(SearchInCommunityCatalogRootVh.class, string)) {
                        b9s0Var = new mvh0(bundle);
                    } else {
                        Iterator it = this.n.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (j5g.P(((y3a) ((Lazy) obj).getValue()).b(), string)) {
                                break;
                            }
                        }
                        Lazy lazy = (Lazy) obj;
                        if (lazy == null || (y3aVar = (y3a) lazy.getValue()) == null) {
                            throw new CatalogRestoreException("Can't restore configuration: " + bundle);
                        }
                        b9s0Var = y3aVar.a(bundle);
                    }
                }
            }
        }
        String a4 = t4a.a.a(str);
        if (bxj0.b(SearchOwnerVideosCatalogRootVh.class, a4) || bxj0.b(MusicSearchCatalogRootVh.class, a4) || bxj0.b(MusicArtistCatalogRootVh.class, a4) || bxj0.b(MusicCatalogRootVh.class, a4)) {
            ve5Var = new ve5();
        } else if (bxj0.b(VideoCatalogRootVh.class, a4)) {
            qca s = b9s0Var.s();
            if (s == null || (ve5Var = s.a()) == null) {
                ve5Var = b();
            }
        } else if (bxj0.b(VideoCatalogSearchRootVh.class, a4)) {
            qca s2 = b9s0Var.s();
            if (s2 == null || (ve5Var = s2.a()) == null) {
                ve5Var = b();
            }
        } else {
            ve5Var = b();
        }
        bpn0 bpn0Var3 = this.l;
        u2b0 r = ((AudioModelsComponent) bpn0Var3.getValue()).r();
        xf40 xf40Var2 = new xf40();
        f750 f750Var = new f750(k840.b, new qxi());
        SearchStatInfoProvider searchStatInfoProvider = new SearchStatInfoProvider();
        lda ldaVar3 = ldaVar;
        com.vk.catalog2.common.ui.mvp.util.a aVar2 = new com.vk.catalog2.common.ui.mvp.util.a(ldaVar3, r, f750Var, searchStatInfoProvider);
        ContextUser contextUser = (ContextUser) bundle.getParcelable("context_user");
        long[] longArray = bundle.getLongArray("gift_users");
        if (longArray == null || (iterable = rl3.t0(longArray)) == null) {
            iterable = EmptyList.b;
        }
        Iterable iterable2 = iterable;
        String string2 = bundle.getString("ref");
        if (bxj0.b(MusicCatalogRootVh.class, t4a.a.a(str))) {
            xf40Var = xf40Var2;
            z2 = z;
            a2 = new kwu0(z2);
        } else {
            xf40Var = xf40Var2;
            z2 = z;
            nvs.s7.getClass();
            a2 = nvs.a.a();
        }
        nvs nvsVar = a2;
        int i3 = 6;
        if (bxj0.b(VideoCatalogRootVh.class, t4a.a.a(str))) {
            int i4 = VideoCatalogRootVh.M0;
            tml0Var = VideoCatalogRootVh.a.a();
        } else if (bxj0.b(VideoCatalogSearchRootVh.class, t4a.a.a(str))) {
            int i5 = VideoCatalogSearchRootVh.S;
            tml0Var = VideoCatalogSearchRootVh.a.a();
        } else {
            tml0Var = new tml0(i3);
        }
        izs izsVar = tml0Var;
        CatalogConfiguration catalogConfiguration = b9s0Var;
        b5a b5aVar = new b5a(null);
        kl40 kl40Var = bxj0.b(MusicCatalogRootVh.class, t4a.a.a(str)) ? new kl40() : null;
        r4a r4aVar = new r4a();
        m3a m3aVar = new m3a(0);
        InitializedLazyImpl initializedLazyImpl = new InitializedLazyImpl(ve5Var);
        k7a k7aVar = new k7a();
        mcc0 mcc0Var = new mcc0(2);
        hh7 hh7Var = new hh7(25);
        a aVar3 = new a();
        fa40 P1 = ((AudioModelsComponent) bpn0Var3.getValue()).P1();
        diu0 diu0Var = new diu0(aVar2, b5aVar, kl40Var);
        f0q f0qVar = new f0q();
        Iterable iterable3 = iterable2;
        ArrayList arrayList = new ArrayList(c5g.u(iterable3, 10));
        Iterator it2 = iterable3.iterator();
        while (it2.hasNext()) {
            dq.h(((Number) it2.next()).longValue(), arrayList);
            z2 = z2;
        }
        boolean z4 = z2;
        sd9 sd9Var = new sd9(false);
        xf40 xf40Var3 = xf40Var;
        e7b0 e7b0Var = new e7b0();
        z0a z0aVar = new z0a();
        yfa yfaVar = new yfa();
        NotificationsPermission notificationsPermission = (NotificationsPermission) this.c.getValue();
        UserId userId = (UserId) bundle.getParcelable("owner_id");
        String str2 = (String) j5g.a0(drm0.c0(str, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6));
        if (str2 == null) {
            str2 = "";
        }
        boolean equals = str2.equals(fpf0.a(VideoProfileCatalogContentVh.class).a().getCanonicalName());
        bpn0 bpn0Var4 = this.i;
        bpn0 bpn0Var5 = this.j;
        return new u4a.a(str, r4aVar, z4, m3aVar, ldaVar3, b5aVar, initializedLazyImpl, v4aVar, r, k7aVar, searchStatInfoProvider, mcc0Var, hh7Var, aVar3, diu0Var, catalogConfiguration, P1, xf40Var3, f750Var, aVar2, f0qVar, contextUser, arrayList, string2, sd9Var, e7b0Var, z0aVar, nvsVar, izsVar, yfaVar, notificationsPermission, this.b, this.e, this.f, this.g, equals ? new w0e0(bpn0Var4, userId, ldaVar3, bpn0Var5) : (str2.equals(fpf0.a(VideoPlaylistRootVh.class).a().getCanonicalName()) || str2.equals(fpf0.a(VideoCategoryRootVh.class).a().getCanonicalName())) ? new yeb0(bpn0Var4, userId, ldaVar3, bpn0Var5) : new h9s0(bpn0Var4, bpn0Var5, 2), new l4v0(), new e1a(), this.i, new yjj0());
    }
}
