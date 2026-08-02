package xsna;

import android.os.SystemClock;
import com.vk.clips.attachments.api.di.ClipsAttachmentsComponentStub;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.core.store.entity.core.api.EntityCacheComponent;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.vc.ContactsViews;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.newsfeed.impl.posting.settings.mvi.PostingSettingsFragmentMvi;
import com.vk.search.ui.impl.catalog.GlobalSearchClipsFeatureCatalogFragment;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.toggle.Features;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseFragmentInternalComponent;
import kotlin.collections.builders.MapBuilder;
import kotlin.text.Regex;
import one.video.controls.views.PlayerControlsView;
import xsna.yre0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class kk1 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ kk1(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = 12;
        char c = 1;
        int i2 = 0;
        switch (this.b) {
            case 0:
                return new StringBuffer();
            case 1:
                return s3q0.a;
            case 2:
                ClipsAttachmentsComponentStub.f.getClass();
                return new com.vk.clips.attachments.api.di.d();
            case 3:
                qcy<Object>[] qcyVarArr = ClipsViewerComponentImpl.o0;
                return new gxe(new rhh0(12));
            case 4:
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return rl3.y0(new ContactsViews[]{ContactsViews.USERS, ContactsViews.HINTS, ContactsViews.EMPTY, ContactsViews.SELECTION_PREVIEW});
            case 5:
                CoverChooseFragmentInternalComponent.a aVar = CoverChooseFragmentInternalComponent.e;
                return new s0k();
            case 6:
                return new nmh0();
            case 7:
                FeedFeatures feedFeatures = FeedFeatures.DISCOVER_NETWORK_ERROR_FIX;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 8:
                return new GlobalSearchClipsFeatureCatalogFragment.a(GlobalSearchClipsFeatureCatalogFragment.class, null, null).f();
            case 9:
                Features.Type type = Features.Type.FEATURE_FEED_ENABLE_RECYCLER_PROFILING;
                type.getClass();
                if (!com.vk.toggle.b.A.a(type)) {
                    return null;
                }
                asu0.a.getClass();
                return new com.vk.stat.recycler.d(new com.vk.stat.recycler.c(asu0.o(), "newsfeed"));
            case 10:
                return new fg20();
            case 11:
                return new Regex("/([A-Za-z0-9._]+)");
            case 12:
                return new Regex("/mediapicker");
            case 13:
                o2l.a.getClass();
                return Boolean.valueOf(BuildInfo.h() && o2l.b("__dbg_apply_spaces", false));
            case 14:
                return new DisplayNameFormatter(null, 3, null);
            case 15:
                return Boolean.valueOf(com.vk.toggle.d.N());
            case 16:
                FeedFeatures feedFeatures2 = FeedFeatures.DEVICE_VOLUME;
                feedFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures2));
            case 17:
                return new la60();
            case 18:
                return s3q0.a;
            case 19:
                PlayerControlsView.b bVar = PlayerControlsView.O;
                return new PlayerControlsView.e();
            case 20:
                return Boolean.valueOf(MusicFeatures.PODCAST_EPISODE_DOWNLOAD.h());
            case 21:
                return new p2r();
            case 22:
                ComFeatures comFeatures = ComFeatures.COM_POSTING_AUTHOR_SELECTION;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 23:
                int i3 = PostingSettingsFragmentMvi.Y;
                return f870.v(InternalVkMiniApps.ORD.h());
            case 24:
                return s3q0.a;
            case 25:
                yre0.a.b bVar2 = yre0.a.b.c;
                return "";
            case 26:
                return Long.valueOf(SystemClock.elapsedRealtime());
            case 27:
                return ((EntityCacheComponent) ((k7m) m7m.f(cul0.b)).a(fpf0.a(EntityCacheComponent.class))).nb();
            case 28:
                MapBuilder mapBuilder = new MapBuilder();
                int i4 = 2;
                mapBuilder.put(WebStickerType.HASHTAG, new epj0(i4));
                mapBuilder.put(WebStickerType.MENTION, new g2h0(3));
                mapBuilder.put(WebStickerType.LINK, new o7j0(i4));
                mapBuilder.put(WebStickerType.QUESTION, new wql0(c == true ? 1 : 0));
                mapBuilder.put(WebStickerType.MUSIC, new wo40(17));
                mapBuilder.put(WebStickerType.GEO, new d7l0(i4));
                mapBuilder.put(WebStickerType.GIF, new acc0(10));
                mapBuilder.put(WebStickerType.MARKET_ITEM, new t810(15));
                mapBuilder.put(WebStickerType.MARKET_SERVICE_ITEM, new m0m0(i2));
                mapBuilder.put(WebStickerType.SERVICE_YC_ITEM, new j6e0(i));
                mapBuilder.put(WebStickerType.TIME, new z410(25));
                mapBuilder.put(WebStickerType.POLL, new d7l0(i4));
                mapBuilder.put(WebStickerType.REACTION, new n0m0(i2));
                return mapBuilder.h();
            default:
                pqo pqoVar = hdo0.a;
                return null;
        }
    }
}
