package xsna;

import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogButtonClearDownloadsHistory;
import com.vk.catalog2.common.dto.api.CatalogButtonCreatePlaylist;
import com.vk.catalog2.common.dto.api.CatalogButtonDownloadAll;
import com.vk.catalog2.common.dto.api.CatalogButtonMusicFollowOwner;
import com.vk.catalog2.common.dto.api.CatalogButtonMusicSubscription;
import com.vk.catalog2.common.dto.api.CatalogButtonMusicUnfollowOwner;
import com.vk.catalog2.common.dto.api.CatalogButtonMyAudiosSectionOptions;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenInfoPopup;
import com.vk.catalog2.common.dto.api.CatalogButtonPlayAudioFromBlock;
import com.vk.catalog2.common.dto.api.CatalogButtonPlayMix;
import com.vk.catalog2.common.dto.api.CatalogButtonSaveAsPlaylist;
import com.vk.catalog2.common.dto.api.CatalogButtonToggleSubscriptionCurator;
import com.vk.catalog2.common.dto.api.CatalogButtonUnfollowArtist;
import com.vk.catalog2.common.dto.api.CatalogButtonUnfollowCurator;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionCuratorSubscription;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenInfoPopup;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSaveAsPlaylistFromBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton;
import com.vk.catalog2.common.dto.ui.actions.UIBlockDownloadAll;
import com.vk.catalog2.common.dto.ui.actions.UIBlockMusicFollowOwnerButton;
import com.vk.catalog2.common.dto.ui.actions.UIBlockMusicUnfollowOwnerButton;
import com.vk.catalog2.common.dto.ui.actions.UIBlockUnfollowArtistButton;
import com.vk.catalog2.feature.music.dto.ui.actions.UIBlockClearDownloadsHistory;
import com.vk.catalog2.feature.music.dto.ui.actions.UIBlockMyAudiosSectionOptions;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MusicButtonCatalogTransformer.kt */
/* loaded from: classes16.dex */
public final class pc40 implements ep8 {
    public final HashMap b = pn00.i(new Pair(fpf0.a(CatalogButtonPlayAudioFromBlock.class), f.b), new Pair(fpf0.a(CatalogButtonSaveAsPlaylist.class), g.b), new Pair(fpf0.a(CatalogButtonCreatePlaylist.class), h.b), new Pair(fpf0.a(CatalogButtonMusicSubscription.class), i.b), new Pair(fpf0.a(CatalogButtonUnfollowArtist.class), j.b), new Pair(fpf0.a(CatalogButtonUnfollowCurator.class), k.b), new Pair(fpf0.a(CatalogButtonToggleSubscriptionCurator.class), l.b), new Pair(fpf0.a(CatalogButtonMyAudiosSectionOptions.class), m.b), new Pair(fpf0.a(CatalogButtonDownloadAll.class), n.b), new Pair(fpf0.a(CatalogButtonClearDownloadsHistory.class), a.b), new Pair(fpf0.a(CatalogButtonMusicFollowOwner.class), b.b), new Pair(fpf0.a(CatalogButtonMusicUnfollowOwner.class), c.b), new Pair(fpf0.a(CatalogButtonPlayMix.class), d.b), new Pair(fpf0.a(CatalogButtonOpenInfoPopup.class), e.b));

    /* compiled from: MusicButtonCatalogTransformer.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final a b = new a(3, wwf0.class, "transformRemoveDownloads", "transformRemoveDownloads(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            return new UIBlockClearDownloadsHistory(bi20Var2.a, CatalogViewType.SYNTHETIC_HEADER_CLEAR_TRACKS, CatalogDataType.DATA_TYPE_ACTION, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.o, ((CatalogButtonClearDownloadsHistory) catalogButton).f);
        }
    }

    /* compiled from: MusicButtonCatalogTransformer.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final b b = new b(3, r490.class, "transformFollowOwnerButton", "transformFollowOwnerButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonMusicFollowOwner catalogButtonMusicFollowOwner = (CatalogButtonMusicFollowOwner) catalogButton;
            return new UIBlockMusicFollowOwnerButton(new com.vk.catalog2.common.dto.api.ui.a(bi20Var2.a, bi20Var2.b, CatalogViewType.SYNTHETIC_ACTION_MUSIC_FOLLOW_OWNER, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, (UIBlockHint) null, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7936), bi20Var2.o, catalogButtonMusicFollowOwner.g, catalogButtonMusicFollowOwner.e, catalogButtonMusicFollowOwner.f);
        }
    }

    /* compiled from: MusicButtonCatalogTransformer.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final c b = new c(3, r490.class, "transformUnfollowOwnerButton", "transformUnfollowOwnerButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonMusicUnfollowOwner catalogButtonMusicUnfollowOwner = (CatalogButtonMusicUnfollowOwner) catalogButton;
            return new UIBlockMusicUnfollowOwnerButton(new com.vk.catalog2.common.dto.api.ui.a(bi20Var2.a, bi20Var2.b, CatalogViewType.SYNTHETIC_ACTION_UNFOLLOW_OWNER, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, (UIBlockHint) null, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7936), bi20Var2.o, catalogButtonMusicUnfollowOwner.g, catalogButtonMusicUnfollowOwner.f, catalogButtonMusicUnfollowOwner.e);
        }
    }

    /* compiled from: MusicButtonCatalogTransformer.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final d b = new d(3, zua0.class, "transformPlayMixButton", "transformPlayMixButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            return zua0.a(catalogButton, bi20Var);
        }
    }

    /* compiled from: MusicButtonCatalogTransformer.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final e b = new e(3, hr80.class, "transformOpenInfoPopupButton", "transformOpenInfoPopupButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonOpenInfoPopup catalogButtonOpenInfoPopup = (CatalogButtonOpenInfoPopup) catalogButton;
            return new UIBlockActionOpenInfoPopup(bi20Var2.c(CatalogViewType.SYNTHETIC_ACTION_OPEN_INFO_POPUP), catalogButtonOpenInfoPopup.d, catalogButtonOpenInfoPopup.e, catalogButtonOpenInfoPopup.f, catalogButtonOpenInfoPopup.g, catalogButtonOpenInfoPopup.h, bi20Var2.p.getString(CatalogCustomAttributes$Keys.STYLE.h()));
        }
    }

    /* compiled from: MusicButtonCatalogTransformer.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final f b = new f(3, vua0.class, "transformPlayAudioFromBlockButton", "transformPlayAudioFromBlockButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            ArrayList arrayList;
            bi20 bi20Var2 = bi20Var;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            CatalogButtonPlayAudioFromBlock catalogButtonPlayAudioFromBlock = (CatalogButtonPlayAudioFromBlock) catalogButton;
            CatalogViewType catalogViewType = catalogButtonPlayAudioFromBlock.h ? CatalogViewType.SYNTHETIC_ACTION_PLAY_SHUFFLED_AUDIO_FROM_BLOCK : CatalogViewType.SYNTHETIC_ACTION_PLAY_AUDIO_FROM_BLOCK;
            String str = catalogButtonPlayAudioFromBlock.f;
            if (str == null) {
                return null;
            }
            boolean z = catalogViewType == CatalogViewType.SYNTHETIC_ACTION_PLAY_SHUFFLED_AUDIO_FROM_BLOCK;
            List<String> list = catalogButtonPlayAudioFromBlock.g;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    Object Ab = catalogExtendedData2.Ab(CatalogDataType.DATA_TYPE_MUSIC_TRACKS, (String) it.next());
                    MusicTrack musicTrack = Ab instanceof MusicTrack ? (MusicTrack) Ab : null;
                    if (musicTrack != null) {
                        arrayList2.add(musicTrack);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            return new UIBlockActionPlayAudiosFromBlock(bi20Var2.a, catalogViewType, CatalogDataType.DATA_TYPE_ACTION, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, catalogButtonPlayAudioFromBlock.i, str, catalogButtonPlayAudioFromBlock.e, z, arrayList, bi20Var2.s, bi20Var2.u);
        }
    }

    /* compiled from: MusicButtonCatalogTransformer.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final g b = new g(3, k7b0.class, "transformSaveAsPlaylistButton", "transformSaveAsPlaylistButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonSaveAsPlaylist catalogButtonSaveAsPlaylist = (CatalogButtonSaveAsPlaylist) catalogButton;
            String str = catalogButtonSaveAsPlaylist.f;
            if (str == null) {
                return null;
            }
            return new UIBlockActionSaveAsPlaylistFromBlock(bi20Var2.b(), CatalogViewType.SYNTHETIC_ACTION_SAVE_AS_PLAYLIST, catalogButtonSaveAsPlaylist.i, str, catalogButtonSaveAsPlaylist.e, catalogButtonSaveAsPlaylist.h, catalogButtonSaveAsPlaylist.j);
        }
    }

    /* compiled from: MusicButtonCatalogTransformer.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final h b = new h(3, k7b0.class, "transformCreatePlaylistButton", "transformCreatePlaylistButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            CatalogButtonCreatePlaylist catalogButtonCreatePlaylist = (CatalogButtonCreatePlaylist) catalogButton;
            return znk0.N(bi20Var, CatalogViewType.SYNTHETIC_ACTION_CREATE_PLAYLIST, catalogButtonCreatePlaylist.f, catalogButtonCreatePlaylist.e, catalogButtonCreatePlaylist.g);
        }
    }

    /* compiled from: MusicButtonCatalogTransformer.kt */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final i b = new i(3, qxm0.class, "transformSubscriptionTextButton", "transformSubscriptionTextButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonMusicSubscription catalogButtonMusicSubscription = (CatalogButtonMusicSubscription) catalogButton;
            return new UIBlockActionTextButton(new com.vk.catalog2.common.dto.api.ui.a(bi20Var2.a, bi20Var2.b, CatalogViewType.SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_BTN, bi20Var2.c, bi20Var2.k, UserId.d, bi20Var2.j, bi20Var2.m, bi20Var2.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680), null, catalogButtonMusicSubscription.e, catalogButtonMusicSubscription.f);
        }
    }

    /* compiled from: MusicButtonCatalogTransformer.kt */
    public static final /* synthetic */ class j extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final j b = new j(3, pq3.class, "transformUnfollowArtistButton", "transformUnfollowArtistButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonUnfollowArtist catalogButtonUnfollowArtist = (CatalogButtonUnfollowArtist) catalogButton;
            return new UIBlockUnfollowArtistButton(bi20Var2.a, CatalogViewType.SYNTHETIC_ACTION_UNFOLLOW_ARTIST, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, catalogButtonUnfollowArtist.g, catalogButtonUnfollowArtist.e, catalogButtonUnfollowArtist.f);
        }
    }

    /* compiled from: MusicButtonCatalogTransformer.kt */
    public static final /* synthetic */ class k extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final k b = new k(3, blk.class, "transformUnfollowCuratorButton", "transformUnfollowCuratorButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            CatalogButtonUnfollowCurator catalogButtonUnfollowCurator = (CatalogButtonUnfollowCurator) catalogButton;
            return new UIBlockActionCuratorSubscription(bi20Var.c(CatalogViewType.SYNTHETIC_ACTION_UNFOLLOW_CURATOR), catalogButtonUnfollowCurator.g, catalogButtonUnfollowCurator.e, catalogButtonUnfollowCurator.f, true);
        }
    }

    /* compiled from: MusicButtonCatalogTransformer.kt */
    public static final /* synthetic */ class l extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final l b = new l(3, blk.class, "transformToggleSubscriptionCuratorButton", "transformToggleSubscriptionCuratorButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            CatalogButtonToggleSubscriptionCurator catalogButtonToggleSubscriptionCurator = (CatalogButtonToggleSubscriptionCurator) catalogButton;
            return new UIBlockActionCuratorSubscription(bi20Var.c(CatalogViewType.SYNTHETIC_ACTION_TOGGLE_SUBSCRIPTION_CURATOR), catalogButtonToggleSubscriptionCurator.g, "", catalogButtonToggleSubscriptionCurator.e, catalogButtonToggleSubscriptionCurator.f);
        }
    }

    /* compiled from: MusicButtonCatalogTransformer.kt */
    public static final /* synthetic */ class m extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final m b = new m(3, fo50.class, "transformMyAudiosSectionOptionsButton", "transformMyAudiosSectionOptionsButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            return new UIBlockMyAudiosSectionOptions(bi20Var2.a, CatalogViewType.SYNTHETIC_ACTION_MY_AUDIOS_SECTION_OPTIONS, CatalogDataType.DATA_TYPE_ACTION, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.o);
        }
    }

    /* compiled from: MusicButtonCatalogTransformer.kt */
    public static final /* synthetic */ class n extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final n b = new n(3, q7o.class, "transformDownloadAll", "transformDownloadAll(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            return new UIBlockDownloadAll(bi20Var2.a, CatalogViewType.SYNTHETIC_ACTION_MY_AUDIOS_SECTION_OPTIONS, CatalogDataType.DATA_TYPE_ACTION, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.o);
        }
    }

    @Override // xsna.ep8
    public final UIBlockAction d(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
        yzs yzsVar = (yzs) this.b.get(fpf0.a(catalogButton.getClass()));
        if (yzsVar != null) {
            return (UIBlockAction) yzsVar.invoke(catalogButton, bi20Var, catalogExtendedData);
        }
        return null;
    }
}
