package xsna;

import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogButtonAddFriend;
import com.vk.catalog2.common.dto.api.CatalogButtonAddFriends;
import com.vk.catalog2.common.dto.api.CatalogButtonAddVideos;
import com.vk.catalog2.common.dto.api.CatalogButtonAllFilters;
import com.vk.catalog2.common.dto.api.CatalogButtonClearRecent;
import com.vk.catalog2.common.dto.api.CatalogButtonClearSection;
import com.vk.catalog2.common.dto.api.CatalogButtonCloseNotification;
import com.vk.catalog2.common.dto.api.CatalogButtonCreateGroup;
import com.vk.catalog2.common.dto.api.CatalogButtonDragAndRemove;
import com.vk.catalog2.common.dto.api.CatalogButtonEnterEditMode;
import com.vk.catalog2.common.dto.api.CatalogButtonExpandBlock;
import com.vk.catalog2.common.dto.api.CatalogButtonFilters;
import com.vk.catalog2.common.dto.api.CatalogButtonFollowUser;
import com.vk.catalog2.common.dto.api.CatalogButtonFriendsCleanup;
import com.vk.catalog2.common.dto.api.CatalogButtonGoToAuthor;
import com.vk.catalog2.common.dto.api.CatalogButtonGoToOwner;
import com.vk.catalog2.common.dto.api.CatalogButtonHideBlock;
import com.vk.catalog2.common.dto.api.CatalogButtonImportContacts;
import com.vk.catalog2.common.dto.api.CatalogButtonLogin;
import com.vk.catalog2.common.dto.api.CatalogButtonLogout;
import com.vk.catalog2.common.dto.api.CatalogButtonMakeCall;
import com.vk.catalog2.common.dto.api.CatalogButtonMarketEditAlbum;
import com.vk.catalog2.common.dto.api.CatalogButtonMarketOptions;
import com.vk.catalog2.common.dto.api.CatalogButtonOnboarding;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenChallenge;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenDialog;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenGroupsAdvertisement;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenModal;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenQoeSurvey;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenQr;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenScreen;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenScreenLarge;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenSearchFilters;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenSearchTab;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenSection;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenUrl;
import com.vk.catalog2.common.dto.api.CatalogButtonPlayAudio;
import com.vk.catalog2.common.dto.api.CatalogButtonPlayVideosFromBlock;
import com.vk.catalog2.common.dto.api.CatalogButtonProfileAuthorCabinetVideo;
import com.vk.catalog2.common.dto.api.CatalogButtonProfileBecomeAuthorVideo;
import com.vk.catalog2.common.dto.api.CatalogButtonProfileChangeProfileVideo;
import com.vk.catalog2.common.dto.api.CatalogButtonProfileChildModeVideo;
import com.vk.catalog2.common.dto.api.CatalogButtonProfileOwnerGroupsVideo;
import com.vk.catalog2.common.dto.api.CatalogButtonRemoveFriend;
import com.vk.catalog2.common.dto.api.CatalogButtonReorder;
import com.vk.catalog2.common.dto.api.CatalogButtonResetFilters;
import com.vk.catalog2.common.dto.api.CatalogButtonSearchMode;
import com.vk.catalog2.common.dto.api.CatalogButtonStartLiveStream;
import com.vk.catalog2.common.dto.api.CatalogButtonSwitchAccount;
import com.vk.catalog2.common.dto.api.CatalogButtonSwitchSection;
import com.vk.catalog2.common.dto.api.CatalogButtonToggleAlbumShuffle;
import com.vk.catalog2.common.dto.api.CatalogButtonToggleAlbumSubscription;
import com.vk.catalog2.common.dto.api.CatalogButtonUpdateNonActiveGroups;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogShowFiltersButton;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.OpenSectionViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockActionDnDEdit;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockActionDnDReorder;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionAddVideos;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearRecent;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionEnterEditMode;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionExpandBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFollow;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionGoToAuthor;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionGoToOwner;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionIconButton;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionMarketEditAlbum;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionMarketOptions;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOnboarding;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenAllSearchFilters;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenChallenge;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenQoeSurvey;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenScreen;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenScreenLarge;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSearchFilter;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSearchTab;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudio;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayVideosFromBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionResetSearchFilter;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSearchMode;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionShowFilters;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSwitchSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionToggleAlbumShuffle;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionToggleAlbumSubscription;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionUpdateNonActiveGroups;
import com.vk.catalog2.common.dto.ui.actions.UIBlockHideBlockButton;
import com.vk.catalog2.feature.music.dto.ui.actions.UIBlockActionLogout;
import com.vk.catalog2.feature.music.dto.ui.actions.UIBlockActionSwitchAccount;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoAlbum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CommonButtonCatalogTransformer.kt */
/* loaded from: classes16.dex */
public final class thg implements ep8 {
    public final HashMap b = pn00.i(new Pair(fpf0.a(CatalogButtonLogin.class), k.b), new Pair(fpf0.a(CatalogButtonLogout.class), v.b), new Pair(fpf0.a(CatalogButtonOpenQr.class), g0.b), new Pair(fpf0.a(CatalogButtonOpenGroupsAdvertisement.class), r0.b), new Pair(fpf0.a(CatalogButtonOpenUrl.class), x0.b), new Pair(fpf0.a(CatalogButtonAddFriend.class), y0.b), new Pair(fpf0.a(CatalogButtonRemoveFriend.class), z0.b), new Pair(fpf0.a(CatalogButtonAddFriends.class), a1.b), new Pair(fpf0.a(CatalogButtonFriendsCleanup.class), b1.b), new Pair(fpf0.a(CatalogButtonImportContacts.class), a.b), new Pair(fpf0.a(CatalogButtonCreateGroup.class), b.b), new Pair(fpf0.a(CatalogButtonOpenScreen.class), c.b), new Pair(fpf0.a(CatalogButtonOpenScreenLarge.class), d.b), new Pair(fpf0.a(CatalogButtonClearRecent.class), e.b), new Pair(fpf0.a(CatalogButtonOpenSearchTab.class), f.b), new Pair(fpf0.a(CatalogButtonOpenSection.class), g.b), new Pair(fpf0.a(CatalogButtonSwitchSection.class), h.b), new Pair(fpf0.a(CatalogButtonSwitchAccount.class), i.b), new Pair(fpf0.a(CatalogButtonFilters.class), j.b), new Pair(fpf0.a(CatalogShowFiltersButton.class), l.b), new Pair(fpf0.a(CatalogButtonCloseNotification.class), m.b), new Pair(fpf0.a(CatalogButtonFollowUser.class), n.b), new Pair(fpf0.a(CatalogButtonGoToOwner.class), o.b), new Pair(fpf0.a(CatalogButtonEnterEditMode.class), p.b), new Pair(fpf0.a(CatalogButtonDragAndRemove.class), q.b), new Pair(fpf0.a(CatalogButtonReorder.class), r.b), new Pair(fpf0.a(CatalogButtonOpenDialog.class), s.b), new Pair(fpf0.a(CatalogButtonSearchMode.class), t.b), new Pair(fpf0.a(CatalogButtonMakeCall.class), u.b), new Pair(fpf0.a(CatalogButtonPlayVideosFromBlock.class), w.b), new Pair(fpf0.a(CatalogButtonToggleAlbumSubscription.class), x.b), new Pair(fpf0.a(CatalogButtonAddVideos.class), y.b), new Pair(fpf0.a(CatalogButtonToggleAlbumSubscription.class), z.b), new Pair(fpf0.a(CatalogButtonOpenQoeSurvey.class), a0.b), new Pair(fpf0.a(CatalogButtonClearSection.class), b0.b), new Pair(fpf0.a(CatalogButtonHideBlock.class), c0.b), new Pair(fpf0.a(CatalogButtonExpandBlock.class), d0.b), new Pair(fpf0.a(CatalogButtonOnboarding.class), e0.b), new Pair(fpf0.a(CatalogButtonOpenChallenge.class), f0.b), new Pair(fpf0.a(CatalogButtonPlayAudio.class), h0.b), new Pair(fpf0.a(CatalogButtonStartLiveStream.class), i0.b), new Pair(fpf0.a(CatalogButtonUpdateNonActiveGroups.class), j0.b), new Pair(fpf0.a(CatalogButtonMarketOptions.class), k0.b), new Pair(fpf0.a(CatalogButtonMarketEditAlbum.class), l0.b), new Pair(fpf0.a(CatalogButtonOpenModal.class), m0.b), new Pair(fpf0.a(CatalogButtonProfileOwnerGroupsVideo.class), n0.b), new Pair(fpf0.a(CatalogButtonProfileBecomeAuthorVideo.class), o0.b), new Pair(fpf0.a(CatalogButtonProfileAuthorCabinetVideo.class), p0.b), new Pair(fpf0.a(CatalogButtonProfileChildModeVideo.class), q0.b), new Pair(fpf0.a(CatalogButtonOpenSearchFilters.class), s0.b), new Pair(fpf0.a(CatalogButtonResetFilters.class), t0.b), new Pair(fpf0.a(CatalogButtonAllFilters.class), u0.b), new Pair(fpf0.a(CatalogButtonProfileChangeProfileVideo.class), v0.b), new Pair(fpf0.a(CatalogButtonGoToAuthor.class), w0.b));

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final a b = new a(3, aqw.class, "transformImportContactsButton", "transformImportContactsButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonImportContacts catalogButtonImportContacts = (CatalogButtonImportContacts) catalogButton;
            CatalogViewType catalogViewType = CatalogViewType.SYNTHETIC_ACTION_IMPORT_CONTACTS;
            UserId userId = UserId.d;
            String str = catalogButtonImportContacts.e;
            if (str == null) {
                str = "";
            }
            return znk0.N(bi20Var2, catalogViewType, userId, str, catalogButtonImportContacts.f);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class a0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final a0 b = new a0(3, j7s0.class, "transformOpenQoeSurvey", "transformOpenQoeSurvey(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonOpenQoeSurvey catalogButtonOpenQoeSurvey = (CatalogButtonOpenQoeSurvey) catalogButton;
            return new UIBlockActionOpenQoeSurvey(bi20Var2.a, CatalogViewType.SYNTHETIC_ACTION_OPEN_QOE_SURVEY, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, catalogButtonOpenQoeSurvey.e, catalogButtonOpenQoeSurvey.f);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class a1 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final a1 b = new a1(3, bis.class, "transformAddFriendsButton", "transformAddFriendsButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            return znk0.N(bi20Var, CatalogViewType.SYNTHETIC_ACTION_ADD_FRIENDS, UserId.d, "", ((CatalogButtonAddFriends) catalogButton).e);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final b b = new b(3, bhu.class, "transformCreateGroupButton", "transformCreateGroupButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            CatalogButtonCreateGroup catalogButtonCreateGroup = (CatalogButtonCreateGroup) catalogButton;
            return znk0.N(bi20Var, CatalogViewType.SYNTHETIC_ACTION_CREATE_GROUP, catalogButtonCreateGroup.f, catalogButtonCreateGroup.e, catalogButtonCreateGroup.g);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class b0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final b0 b = new b0(3, t1i0.class, "transformClearSectionButton", "transformClearSectionButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonClearSection catalogButtonClearSection = (CatalogButtonClearSection) catalogButton;
            return new UIBlockActionClearSection(bi20Var2.a, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, catalogButtonClearSection.e, catalogButtonClearSection.f);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class b1 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final b1 b = new b1(3, bis.class, "transformCleanupFriendsButton", "transformCleanupFriendsButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            return znk0.N(bi20Var, CatalogViewType.SYNTHETIC_ACTION_FRIENDS_CLEANUP, UserId.d, "", ((CatalogButtonFriendsCleanup) catalogButton).e);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final c b = new c(3, wp80.class, "transformOpenScreenButton", "transformOpenScreenButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonOpenScreen catalogButtonOpenScreen = (CatalogButtonOpenScreen) catalogButton;
            return new UIBlockActionOpenScreen(bi20Var2.a, CatalogViewType.SYNTHETIC_ACTION_OPEN_SCREEN, bi20Var2.c, bi20Var2.k, UserId.d, bi20Var2.j, bi20Var2.m, bi20Var2.o, catalogButtonOpenScreen.g, catalogButtonOpenScreen.e, catalogButtonOpenScreen.f, null, 2048, null);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class c0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final c0 b = new c0(3, we7.class, "transformHideBlockButton", "transformHideBlockButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            CatalogButtonHideBlock catalogButtonHideBlock = (CatalogButtonHideBlock) catalogButton;
            return new UIBlockHideBlockButton(bi20Var.b(), null, catalogButtonHideBlock.g, catalogButtonHideBlock.f, catalogButtonHideBlock.h, catalogButtonHideBlock.e, catalogButtonHideBlock.i);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final d b = new d(3, wp80.class, "transformOpenScreenLargeButton", "transformOpenScreenLargeButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonOpenScreenLarge catalogButtonOpenScreenLarge = (CatalogButtonOpenScreenLarge) catalogButton;
            return new UIBlockActionOpenScreenLarge(bi20Var2.a, CatalogViewType.SYNTHETIC_ACTION_OPEN_SCREEN_LARGE, bi20Var2.c, bi20Var2.k, UserId.d, bi20Var2.j, bi20Var2.m, bi20Var2.o, catalogButtonOpenScreenLarge.g, catalogButtonOpenScreenLarge.e, catalogButtonOpenScreenLarge.f);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class d0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final d0 b = new d0(3, we7.class, "transformExpandBlockButton", "transformExpandBlockButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonExpandBlock catalogButtonExpandBlock = (CatalogButtonExpandBlock) catalogButton;
            com.vk.catalog2.common.dto.api.ui.a a = com.vk.catalog2.common.dto.api.ui.a.a(bi20Var2.c(CatalogViewType.SYNTHETIC_ACTION_EXPAND_BLOCK), null, null, null, CatalogDataType.DATA_TYPE_ACTION, null, null, 8183);
            String str = catalogButtonExpandBlock.f;
            String a2 = cqm0.a(catalogButtonExpandBlock.e);
            if (a2 == null) {
                a2 = bi20Var2.a;
            }
            return new UIBlockActionExpandBlock(a, str, a2, catalogButtonExpandBlock.g, catalogButtonExpandBlock.h, null, 32, null);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final e b = new e(3, mnh0.class, "transformClearRecentButton", "transformClearRecentButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonClearRecent catalogButtonClearRecent = (CatalogButtonClearRecent) catalogButton;
            return new UIBlockActionClearRecent(bi20Var2.a, CatalogViewType.SYNTHETIC_HEADER_CLEAR_RECENTS, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, catalogButtonClearRecent.g, catalogButtonClearRecent.f, catalogButtonClearRecent.h);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class e0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final e0 b = new e0(3, dd80.class, "transformOnboardingButton", "transformOnboardingButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            CatalogButtonOnboarding catalogButtonOnboarding = (CatalogButtonOnboarding) catalogButton;
            com.vk.catalog2.common.dto.api.ui.a b2 = bi20Var.b();
            String str = catalogButtonOnboarding.h;
            String str2 = catalogButtonOnboarding.e;
            String str3 = catalogButtonOnboarding.f;
            List list = catalogButtonOnboarding.g;
            if (list == null) {
                list = EmptyList.b;
            }
            return new UIBlockActionOnboarding(b2, str, str2, str3, list);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final f b = new f(3, mnh0.class, "transformOpenSearchTabButton", "transformOpenSearchTabButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonOpenSearchTab catalogButtonOpenSearchTab = (CatalogButtonOpenSearchTab) catalogButton;
            return new UIBlockActionOpenSearchTab(bi20Var2.c(CatalogViewType.SYNTHETIC_ACTION_OPEN_TAB), catalogButtonOpenSearchTab.i, catalogButtonOpenSearchTab.e, catalogButtonOpenSearchTab.f, bi20Var2.p.getString(CatalogCustomAttributes$Keys.STYLE.h()), catalogButtonOpenSearchTab.g, catalogButtonOpenSearchTab.h);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class f0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final f0 b = new f0(3, skd.class, "transformOpenChallengeButton", "transformOpenChallengeButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            CatalogButtonOpenChallenge catalogButtonOpenChallenge = (CatalogButtonOpenChallenge) catalogButton;
            return new UIBlockActionOpenChallenge(bi20Var.b(), catalogButtonOpenChallenge.g, catalogButtonOpenChallenge.f);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final g b = new g(3, t1i0.class, "transformOpenSectionButton", "transformOpenSectionButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonOpenSection catalogButtonOpenSection = (CatalogButtonOpenSection) catalogButton;
            String str = catalogButtonOpenSection.c;
            CatalogDataType catalogDataType = bi20Var2.c;
            CatalogDataType catalogDataType2 = CatalogDataType.DATA_TYPE_CATALOG_MARKET_ITEMS;
            CatalogViewType catalogViewType = (catalogDataType == catalogDataType2 && epx.f(str, "open_section")) ? CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_MARKET_ITEMS : !epx.f(str, "open_section_slider_cell") ? CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION : catalogDataType == catalogDataType2 ? CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_MARKET_ITEMS : (catalogDataType == CatalogDataType.DATA_TYPE_VIDEO_VIDEOS && bi20Var2.d == CatalogViewType.SLIDER) ? CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_VIDEOS : CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_DEFAULT;
            if (epx.f(str, "open_section_slider_cell")) {
                catalogDataType = CatalogDataType.DATA_TYPE_ACTION;
            }
            CatalogDataType catalogDataType3 = catalogDataType;
            String str2 = catalogButtonOpenSection.l;
            if (str2 == null) {
                str2 = bi20Var2.p.getString(CatalogCustomAttributes$Keys.STYLE.h());
            }
            String str3 = str2;
            com.vk.catalog2.common.dto.api.ui.a c = bi20Var2.c(catalogViewType);
            String str4 = bi20Var2.b;
            OpenSectionViewStyle.ButtonStyle.Companion.getClass();
            OpenSectionViewStyle.ButtonStyle a = OpenSectionViewStyle.ButtonStyle.a.a(str3);
            OpenSectionViewStyle.ButtonIcon.a aVar = OpenSectionViewStyle.ButtonIcon.Companion;
            String str5 = catalogButtonOpenSection.i;
            aVar.getClass();
            return new UIBlockActionOpenSection(com.vk.catalog2.common.dto.api.ui.a.a(c, null, str4, null, catalogDataType3, null, new OpenSectionViewStyle(a, OpenSectionViewStyle.ButtonIcon.a.a(str5)), 7669), catalogButtonOpenSection.h, catalogButtonOpenSection.e, catalogButtonOpenSection.f, str3, catalogButtonOpenSection.g, catalogButtonOpenSection.i, catalogButtonOpenSection.k, catalogButtonOpenSection.j, catalogButtonOpenSection.m);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class g0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final g0 b = new g0(3, ine0.class, "transformOpenQrButton", "transformOpenQrButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            return znk0.N(bi20Var, CatalogViewType.SYNTHETIC_ACTION_SCAN_QR, UserId.d, "", ((CatalogButtonOpenQr) catalogButton).e);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final h b = new h(3, t1i0.class, "transformSwitchSectionButton", "transformSwitchSectionButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            ArrayList arrayList;
            ImageSize imageSize;
            bi20 bi20Var2 = bi20Var;
            CatalogButtonSwitchSection catalogButtonSwitchSection = (CatalogButtonSwitchSection) catalogButton;
            String str = bi20Var2.a;
            CatalogViewType catalogViewType = CatalogViewType.SYNTHETIC_ACTION_SWITCH_SECTION;
            CatalogDataType catalogDataType = bi20Var2.c;
            String str2 = bi20Var2.k;
            UserId userId = bi20Var2.e;
            List<String> list = bi20Var2.j;
            Set<UIBlockDragDropAction> set = bi20Var2.m;
            UIBlockHint uIBlockHint = bi20Var2.o;
            String str3 = catalogButtonSwitchSection.h;
            String str4 = catalogButtonSwitchSection.e;
            String str5 = catalogButtonSwitchSection.f;
            String str6 = catalogButtonSwitchSection.g;
            String str7 = catalogButtonSwitchSection.i;
            String str8 = catalogButtonSwitchSection.k;
            Image image = catalogButtonSwitchSection.j;
            return new UIBlockActionSwitchSection(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, str3, str4, str5, str6, str7, str8, (image == null || (arrayList = image.b) == null || (imageSize = (ImageSize) j5g.a0(arrayList)) == null) ? null : imageSize.d.d, catalogButtonSwitchSection.l, catalogButtonSwitchSection.m, catalogButtonSwitchSection.n);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class h0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final h0 b = new h0(3, skd.class, "transformPlayAudioButton", "transformPlayAudioButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonPlayAudio catalogButtonPlayAudio = (CatalogButtonPlayAudio) catalogButton;
            CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_MUSIC_TRACKS;
            StringBuilder sb = new StringBuilder();
            sb.append(catalogButtonPlayAudio.g);
            sb.append('_');
            sb.append(catalogButtonPlayAudio.f);
            Object Ab = catalogExtendedData.Ab(catalogDataType, sb.toString());
            return new UIBlockActionPlayAudio(bi20Var2.b(), catalogButtonPlayAudio.h, Ab instanceof MusicTrack ? (MusicTrack) Ab : null);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final i b = new i(3, t1i0.class, "transformSwitchAccountButton", "transformSwitchAccountButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonSwitchAccount catalogButtonSwitchAccount = (CatalogButtonSwitchAccount) catalogButton;
            return new UIBlockActionSwitchAccount(bi20Var2.a, CatalogViewType.SYNTHETIC_ACTION_SWITCH_ACCOUNT, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, catalogButtonSwitchAccount.f, catalogButtonSwitchAccount.e);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class i0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final i0 b = new i0(3, j7s0.class, "transformStartLiveStreamButton", "transformStartLiveStreamButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonStartLiveStream catalogButtonStartLiveStream = (CatalogButtonStartLiveStream) catalogButton;
            return znk0.N(bi20Var2, CatalogViewType.SYNTHETIC_ACTION_START_LIVE_STREAM, bi20Var2.e, catalogButtonStartLiveStream.e, catalogButtonStartLiveStream.f);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class j extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final j b = new j(3, jcr.class, "transformFiltersButton", "transformFiltersButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        /* JADX WARN: Code restructure failed: missing block: B:41:0x003b, code lost:
        
            if (r3.equals("select_sorting") == false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0047, code lost:
        
            r4 = com.vk.catalog2.common.dto.api.CatalogDataType.DATA_TYPE_ACTION;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0042, code lost:
        
            if (r3.equals("friends_sort_modes") == false) goto L17;
         */
        @Override // xsna.yzs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            CatalogDataType catalogDataType;
            CatalogViewType catalogViewType;
            bi20 bi20Var2 = bi20Var;
            CatalogButtonFilters catalogButtonFilters = (CatalogButtonFilters) catalogButton;
            List list = catalogButtonFilters.g;
            String str = catalogButtonFilters.c;
            int hashCode = str.hashCode();
            if (hashCode != 233034297) {
                if (hashCode != 1221293377) {
                    if (hashCode == 1466733249 && str.equals("groups_my_groups_tabs")) {
                        catalogDataType = CatalogDataType.DATA_TYPE_ACTION;
                    }
                }
                catalogDataType = bi20Var2.c;
            }
            CatalogDataType catalogDataType2 = catalogDataType;
            int hashCode2 = str.hashCode();
            if (hashCode2 == 233034297) {
                if (str.equals("friends_sort_modes")) {
                    catalogViewType = CatalogViewType.SYNTHETIC_ACTION_FRIENDS_SORT_MODES;
                }
                catalogViewType = bi20Var2.d;
            } else if (hashCode2 != 1221293377) {
                if (hashCode2 == 1466733249 && str.equals("groups_my_groups_tabs")) {
                    catalogViewType = (list == null ? EmptyList.b : list).size() >= 3 ? CatalogViewType.BUTTONS_HORIZONTAL_WITH_SCROLL : CatalogViewType.BUTTONS_HORIZONTAL;
                }
                catalogViewType = bi20Var2.d;
            } else {
                if (str.equals("select_sorting")) {
                    catalogViewType = CatalogViewType.SYNTHETIC_ACTION_SELECT_SORTING;
                }
                catalogViewType = bi20Var2.d;
            }
            com.vk.catalog2.common.dto.api.ui.a a = com.vk.catalog2.common.dto.api.ui.a.a(bi20Var2.b(), null, null, catalogViewType, catalogDataType2, null, null, 8179);
            String str2 = catalogButtonFilters.i;
            String str3 = catalogButtonFilters.e;
            if (list == null) {
                list = EmptyList.b;
            }
            List list2 = list;
            String str4 = catalogButtonFilters.h;
            if (str4 == null) {
                str4 = "";
            }
            return new UIBlockActionShowFilters(a, str2, str3, list2, str4, null, 32, null);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class j0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final j0 b = new j0(3, bhu.class, "transformUpdateNonActiveGroupsButton", "transformUpdateNonActiveGroupsButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            CatalogButtonUpdateNonActiveGroups catalogButtonUpdateNonActiveGroups = (CatalogButtonUpdateNonActiveGroups) catalogButton;
            return new UIBlockActionUpdateNonActiveGroups(com.vk.catalog2.common.dto.api.ui.a.a(bi20Var.c(CatalogViewType.EMPTY), null, null, null, null, UserId.d, null, 8159), catalogButtonUpdateNonActiveGroups.e, catalogButtonUpdateNonActiveGroups.f, catalogButtonUpdateNonActiveGroups.g);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class k extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final k b = new k(3, m200.class, "transformLoginButton", "transformLoginButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            CatalogButtonLogin catalogButtonLogin = (CatalogButtonLogin) catalogButton;
            return znk0.N(bi20Var, CatalogViewType.SYNTHETIC_ACTION_LOGIN, UserId.d, catalogButtonLogin.e, catalogButtonLogin.f);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class k0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final k0 b = new k0(3, bu00.class, "transformMarketOptionsButton", "transformMarketOptionsButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            CatalogButtonMarketOptions catalogButtonMarketOptions = (CatalogButtonMarketOptions) catalogButton;
            return new UIBlockActionMarketOptions(com.vk.catalog2.common.dto.api.ui.a.a(bi20Var.b(), null, null, null, null, catalogButtonMarketOptions.e, null, 8159), catalogButtonMarketOptions.f, catalogButtonMarketOptions.g);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class l extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final l b = new l(3, jcr.class, "transformShowFiltersButton", "transformShowFiltersButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            CatalogShowFiltersButton catalogShowFiltersButton = (CatalogShowFiltersButton) catalogButton;
            com.vk.catalog2.common.dto.api.ui.a b2 = bi20Var.b();
            String str = catalogShowFiltersButton.e;
            List list = catalogShowFiltersButton.g;
            if (list == null) {
                list = EmptyList.b;
            }
            List list2 = list;
            String str2 = catalogShowFiltersButton.f;
            if (str2 == null) {
                str2 = "";
            }
            return new UIBlockActionShowFilters(b2, null, str, list2, str2, null, 32, null);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class l0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final l0 b = new l0(3, bu00.class, "transformMarketEditAlbumButton", "transformMarketEditAlbumButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonMarketEditAlbum catalogButtonMarketEditAlbum = (CatalogButtonMarketEditAlbum) catalogButton;
            com.vk.catalog2.common.dto.api.ui.a a = com.vk.catalog2.common.dto.api.ui.a.a(bi20Var2.b(), null, null, CatalogViewType.SYNTHETIC_ACTION_MARKET_EDIT_ALBUM, null, bi20Var2.e, null, 8155);
            String str = catalogButtonMarketEditAlbum.e;
            if (str == null) {
                str = "";
            }
            return new UIBlockActionMarketEditAlbum(a, str, catalogButtonMarketEditAlbum.f);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class m extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final m b = new m(3, f870.class, "transformCloseNotificationButton", "transformCloseNotificationButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            return znk0.N(bi20Var, CatalogViewType.SYNTHETIC_ACTION_CLOSE_BANNER, UserId.d, "", ((CatalogButtonCloseNotification) catalogButton).e);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class m0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final m0 b = new m0(3, wp80.class, "transformOpenModalButton", "transformOpenModalButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogViewType catalogViewType = CatalogViewType.SYNTHETIC_ACTION_OPEN_MODAL;
            UserId userId = bi20Var2.e;
            String str = ((CatalogButtonOpenModal) catalogButton).e;
            if (str == null) {
                str = "";
            }
            return znk0.N(bi20Var2, catalogViewType, userId, str, null);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class n extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final n b = new n(3, s490.class, "transformFollowUserButton", "transformFollowUserButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            UserId userId;
            bi20 bi20Var2 = bi20Var;
            CatalogButtonFollowUser catalogButtonFollowUser = (CatalogButtonFollowUser) catalogButton;
            rba Gb = catalogExtendedData.Gb(catalogButtonFollowUser.e);
            UserProfile userProfile = Gb.a;
            Group group = Gb.b;
            if (userProfile == null || (userId = userProfile.c) == null) {
                userId = group != null ? group.c : null;
                if (userId == null) {
                    userId = bi20Var2.e;
                }
            }
            if (group != null && fkq0.d(userId)) {
                userId = fkq0.e(userId);
            }
            return new UIBlockActionFollow(bi20Var2.a, CatalogViewType.SYNTHETIC_ACTION_FOLLOW, bi20Var2.c, bi20Var2.k, userId, bi20Var2.j, bi20Var2.m, bi20Var2.o, catalogButtonFollowUser.f, group, userProfile, catalogButtonFollowUser.g);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class n0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final n0 b = new n0(3, j7s0.class, "transformProfileOwnerGroupsVideoButton", "transformProfileOwnerGroupsVideoButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            CatalogButtonProfileOwnerGroupsVideo catalogButtonProfileOwnerGroupsVideo = (CatalogButtonProfileOwnerGroupsVideo) catalogButton;
            return j7s0.a(bi20Var, CatalogViewType.VIDEO_OWNER_GROUPS, catalogButtonProfileOwnerGroupsVideo.f, catalogButtonProfileOwnerGroupsVideo.e, catalogButtonProfileOwnerGroupsVideo.g);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class o extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final o b = new o(3, s490.class, "transformGoToOwnerButton", "transformGoToOwnerButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            UserId userId;
            bi20 bi20Var2 = bi20Var;
            CatalogButtonGoToOwner catalogButtonGoToOwner = (CatalogButtonGoToOwner) catalogButton;
            rba Gb = catalogExtendedData.Gb(catalogButtonGoToOwner.e);
            UserProfile userProfile = Gb.a;
            Group group = Gb.b;
            if (userProfile == null || (userId = userProfile.c) == null) {
                userId = group != null ? group.c : null;
                if (userId == null) {
                    userId = bi20Var2.e;
                }
            }
            if (group != null && fkq0.d(userId)) {
                userId = fkq0.e(userId);
            }
            return new UIBlockActionGoToOwner(bi20Var2.a, CatalogViewType.SYNTHETIC_ACTION_GO_TO_OWNER, bi20Var2.c, bi20Var2.k, userId, bi20Var2.j, bi20Var2.m, bi20Var2.o, catalogButtonGoToOwner.f, userProfile, group);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class o0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final o0 b = new o0(3, j7s0.class, "transformProfileBecomeAuthorVideoButton", "transformProfileBecomeAuthorVideoButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            CatalogButtonProfileBecomeAuthorVideo catalogButtonProfileBecomeAuthorVideo = (CatalogButtonProfileBecomeAuthorVideo) catalogButton;
            return j7s0.a(bi20Var, CatalogViewType.VIDEO_BECOME_AUTHOR, catalogButtonProfileBecomeAuthorVideo.f, catalogButtonProfileBecomeAuthorVideo.e, catalogButtonProfileBecomeAuthorVideo.g);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class p extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final p b = new p(3, nzo.class, "transformEnterEditModeButton", "transformEnterEditModeButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            CatalogButtonEnterEditMode catalogButtonEnterEditMode = (CatalogButtonEnterEditMode) catalogButton;
            return new UIBlockActionEnterEditMode(bi20Var.b(), catalogButtonEnterEditMode.f, catalogButtonEnterEditMode.e);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class p0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final p0 b = new p0(3, j7s0.class, "transformProfileAuthorCabinetVideoButton", "transformProfileAuthorCabinetVideoButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            CatalogButtonProfileAuthorCabinetVideo catalogButtonProfileAuthorCabinetVideo = (CatalogButtonProfileAuthorCabinetVideo) catalogButton;
            return j7s0.a(bi20Var, CatalogViewType.VIDEO_AUTHOR_CABINET, catalogButtonProfileAuthorCabinetVideo.f, catalogButtonProfileAuthorCabinetVideo.e, catalogButtonProfileAuthorCabinetVideo.g);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class q extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final q b = new q(3, nzo.class, "transformDragAndRemoveButton", "transformDragAndRemoveButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            return new UIBlockActionDnDEdit(bi20Var2.a, CatalogViewType.SYNTHETIC_DND_ACTION_EDIT, CatalogDataType.DATA_TYPE_DND_ACTION, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.o);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class q0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final q0 b = new q0(3, j7s0.class, "transformProfileChildModeVideoButton", "transformProfileChildModeVideoButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            CatalogButtonProfileChildModeVideo catalogButtonProfileChildModeVideo = (CatalogButtonProfileChildModeVideo) catalogButton;
            return j7s0.a(bi20Var, CatalogViewType.VIDEO_CHILD_MODE, catalogButtonProfileChildModeVideo.f, catalogButtonProfileChildModeVideo.e, catalogButtonProfileChildModeVideo.g);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class r extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final r b = new r(3, nzo.class, "transformReorderButton", "transformReorderButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            return new UIBlockActionDnDReorder(bi20Var2.a, CatalogViewType.SYNTHETIC_DND_ACTION_REORDER, CatalogDataType.DATA_TYPE_DND_ACTION, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.o);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class r0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final r0 b = new r0(3, bhu.class, "transformOpenGroupsAdvertisementButton", "transformOpenGroupsAdvertisementButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            CatalogButtonOpenGroupsAdvertisement catalogButtonOpenGroupsAdvertisement = (CatalogButtonOpenGroupsAdvertisement) catalogButton;
            return wp80.j(bi20Var, CatalogViewType.SYNTHETIC_ACTION_ADV_URL, catalogButtonOpenGroupsAdvertisement.e, catalogButtonOpenGroupsAdvertisement.g, catalogButtonOpenGroupsAdvertisement.h, catalogButtonOpenGroupsAdvertisement.i, null, null, null);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class s extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final s b = new s(3, wp80.class, "transformOpenDialogButton", "transformOpenDialogButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonOpenDialog catalogButtonOpenDialog = (CatalogButtonOpenDialog) catalogButton;
            return new UIBlockActionIconButton(bi20Var2.a, CatalogViewType.SYNTHETIC_ACTION_OPEN_DIALOG, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, catalogButtonOpenDialog.f, catalogButtonOpenDialog.g, catalogButtonOpenDialog.e);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class s0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final s0 b = new s0(3, mnh0.class, "transformOpenSearchFiltersButton", "transformOpenSearchFiltersButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            CatalogButtonOpenSearchFilters catalogButtonOpenSearchFilters = (CatalogButtonOpenSearchFilters) catalogButton;
            return new UIBlockActionOpenSearchFilter(bi20Var.b(), catalogButtonOpenSearchFilters.d, catalogButtonOpenSearchFilters.e);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class t extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final t b = new t(3, mnh0.class, "transformSearchModeButton", "transformSearchModeButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonSearchMode catalogButtonSearchMode = (CatalogButtonSearchMode) catalogButton;
            String str = catalogButtonSearchMode.g;
            if (str == null) {
                str = bi20Var2.b;
            }
            return new UIBlockActionSearchMode(bi20Var2.d(catalogButtonSearchMode.j, str), catalogButtonSearchMode.h, catalogButtonSearchMode.f, catalogButtonSearchMode.i, null, 16, null);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class t0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final t0 b = new t0(3, mnh0.class, "transformResetSearchFiltersButton", "transformResetSearchFiltersButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            CatalogButtonResetFilters catalogButtonResetFilters = (CatalogButtonResetFilters) catalogButton;
            com.vk.catalog2.common.dto.api.ui.a b2 = bi20Var.b();
            Boolean bool = catalogButtonResetFilters.f;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            String str = catalogButtonResetFilters.e;
            if (str == null) {
                str = "";
            }
            return new UIBlockActionResetSearchFilter(b2, booleanValue, str);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class u extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final u b = new u(3, o19.class, "transformMakeCallButton", "transformMakeCallButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonMakeCall catalogButtonMakeCall = (CatalogButtonMakeCall) catalogButton;
            return new UIBlockActionIconButton(bi20Var2.a, CatalogViewType.SYNTHETIC_ACTION_MAKE_CALL, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, catalogButtonMakeCall.f, catalogButtonMakeCall.g, catalogButtonMakeCall.e);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class u0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final u0 b = new u0(3, mnh0.class, "transformOpenAllSearchFiltersButton", "transformOpenAllSearchFiltersButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            com.vk.catalog2.common.dto.api.ui.a b2 = bi20Var.b();
            Boolean bool = ((CatalogButtonAllFilters) catalogButton).g;
            return new UIBlockActionOpenAllSearchFilters(b2, bool != null ? bool.booleanValue() : false);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class v extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final v b = new v(3, s200.class, "transformLogoutButton", "transformLogoutButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            CatalogButtonLogout catalogButtonLogout = (CatalogButtonLogout) catalogButton;
            return new UIBlockActionLogout(bi20Var.b(), catalogButtonLogout.g, catalogButtonLogout.e);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class v0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final v0 b = new v0(3, j7s0.class, "transformProfileChangeProfileVideoButton", "transformProfileChangeProfileVideoButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            CatalogButtonProfileChangeProfileVideo catalogButtonProfileChangeProfileVideo = (CatalogButtonProfileChangeProfileVideo) catalogButton;
            return j7s0.a(bi20Var, CatalogViewType.VIDEO_CHANGE_PROFILE, catalogButtonProfileChangeProfileVideo.f, catalogButtonProfileChangeProfileVideo.e, catalogButtonProfileChangeProfileVideo.g);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class w extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final w b = new w(3, j7s0.class, "transformPlayVideosFromBlockButton", "transformPlayVideosFromBlockButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            CatalogButtonPlayVideosFromBlock catalogButtonPlayVideosFromBlock = (CatalogButtonPlayVideosFromBlock) catalogButton;
            return new UIBlockActionPlayVideosFromBlock(bi20Var.b(), catalogButtonPlayVideosFromBlock.h, catalogButtonPlayVideosFromBlock.e, catalogButtonPlayVideosFromBlock.g, catalogButtonPlayVideosFromBlock.f, null, 32, null);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class w0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final w0 b = new w0(3, s490.class, "transformGoToAuthorButton", "transformGoToAuthorButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonGoToAuthor catalogButtonGoToAuthor = (CatalogButtonGoToAuthor) catalogButton;
            Object Ab = catalogExtendedData.Ab(CatalogDataType.DATA_TYPE_GROUPS_ITEMS, String.valueOf(fkq0.e(catalogButtonGoToAuthor.f).b));
            return new UIBlockActionGoToAuthor(new com.vk.catalog2.common.dto.api.ui.a(bi20Var2.a, bi20Var2.b, bi20Var2.d, bi20Var2.c, bi20Var2.k, catalogButtonGoToAuthor.f, bi20Var2.j, bi20Var2.m, bi20Var2.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680), catalogButtonGoToAuthor.g, catalogButtonGoToAuthor.e, Ab instanceof Group ? (Group) Ab : null);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class x extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final x b = new x(3, j7s0.class, "transformToggleAlbumSubscriptionButton", "transformToggleAlbumSubscriptionButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonToggleAlbumSubscription catalogButtonToggleAlbumSubscription = (CatalogButtonToggleAlbumSubscription) catalogButton;
            Serializer.c<VideoAlbum> cVar = VideoAlbum.CREATOR;
            Object Ab = catalogExtendedData.Ab(CatalogDataType.DATA_TYPE_VIDEO_ALBUMS, VideoAlbum.a.a(catalogButtonToggleAlbumSubscription.g, bi20Var2.e));
            return new UIBlockActionToggleAlbumSubscription(bi20Var2.a, CatalogViewType.SYNTHETIC_ACTION_TOGGLE_PLAYLIST_SUBSCRIPTION, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, catalogButtonToggleAlbumSubscription.f, catalogButtonToggleAlbumSubscription.e, Ab instanceof VideoAlbum ? (VideoAlbum) Ab : null);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class x0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final x0 b = new x0(3, wp80.class, "transformOpenUrlButton", "transformOpenUrlButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonOpenUrl catalogButtonOpenUrl = (CatalogButtonOpenUrl) catalogButton;
            String str = catalogButtonOpenUrl.c;
            return wp80.j(bi20Var2, epx.f(str, "open_url_slider_cell") ? CatalogViewType.SYNTHETIC_ACTION_OPEN_URL_SLIDER : epx.f(str, "open_url_bottom_button") ? CatalogViewType.SYNTHETIC_ACTION_OPEN_URL_BOTTOM : CatalogViewType.SYNTHETIC_ACTION_OPEN_URL, catalogButtonOpenUrl.e, catalogButtonOpenUrl.f, catalogButtonOpenUrl.g, catalogButtonOpenUrl.i, catalogButtonOpenUrl.h, catalogButtonOpenUrl.j, catalogButtonOpenUrl.k);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class y extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final y b = new y(3, j7s0.class, "transformAddVideosButton", "transformAddVideosButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            CatalogButtonAddVideos catalogButtonAddVideos = (CatalogButtonAddVideos) catalogButton;
            Serializer.c<VideoAlbum> cVar = VideoAlbum.CREATOR;
            Object Ab = catalogExtendedData.Ab(CatalogDataType.DATA_TYPE_VIDEO_ALBUMS, VideoAlbum.a.a(catalogButtonAddVideos.g, bi20Var2.e));
            return new UIBlockActionAddVideos(bi20Var2.a, CatalogViewType.SYNTHETIC_ACTION_ADD_VIDEOS, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, catalogButtonAddVideos.f, catalogButtonAddVideos.e, Ab instanceof VideoAlbum ? (VideoAlbum) Ab : null);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class y0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final y0 b = new y0(3, bis.class, "transformAddFriendButton", "transformAddFriendButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            CatalogButtonAddFriend catalogButtonAddFriend = (CatalogButtonAddFriend) catalogButton;
            return znk0.N(bi20Var, CatalogViewType.SYNTHETIC_ACTION_ADD_FRIEND, UserId.d, catalogButtonAddFriend.e, catalogButtonAddFriend.f);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class z extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final z b = new z(3, j7s0.class, "transformToggleAlbumShuffle", "transformToggleAlbumShuffle(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            bi20 bi20Var2 = bi20Var;
            return new UIBlockActionToggleAlbumShuffle(bi20Var2.a, CatalogViewType.SYNTHETIC_ACTION_TOGGLE_ALBUM_SHUFFLE, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, ((CatalogButtonToggleAlbumShuffle) catalogButton).e);
        }
    }

    /* compiled from: CommonButtonCatalogTransformer.kt */
    public static final /* synthetic */ class z0 extends FunctionReferenceImpl implements yzs<CatalogButton, bi20, CatalogExtendedData, UIBlockAction> {
        public static final z0 b = new z0(3, bis.class, "transformRemoveFriendButton", "transformRemoveFriendButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 1);

        @Override // xsna.yzs
        public final UIBlockAction invoke(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            return znk0.N(bi20Var, CatalogViewType.SYNTHETIC_ACTION_REMOVE_FRIEND, UserId.d, "", ((CatalogButtonRemoveFriend) catalogButton).g);
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
