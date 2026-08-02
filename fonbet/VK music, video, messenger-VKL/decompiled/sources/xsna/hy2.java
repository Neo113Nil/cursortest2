package xsna;

import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.clips.favorites.impl.di.ClipsFavoritesComponentImpl;
import com.vk.clips.playlists.di.stub.ClipsPlaylistsComponentStub;
import com.vk.ecomm.cart.api.di.CartComponent$Companion$STUB$1;
import com.vk.ecomm.market.impl.di.MarketComponentImpl;
import com.vk.feed.settings.impl.di.NewsfeedSettingsComponentImpl;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.vc.ContactsViews;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomToolbarFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.voip.OKVoipEngine;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class hy2 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ hy2(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        BaseUserGroupFieldsDto baseUserGroupFieldsDto;
        boolean z = false;
        switch (this.b) {
            case 0:
                List c0 = drm0.c0("first_name,last_name,nick_name,bdate,photo_base,sex,screen_name,role,emoji_status,domain,is_closed,has_photo,is_nft,verified,messages_counter_settings", new String[]{StringUtils.COMMA}, 0, 6);
                ArrayList arrayList = new ArrayList();
                Iterator it = c0.iterator();
                while (it.hasNext()) {
                    try {
                        baseUserGroupFieldsDto = BaseUserGroupFieldsDto.valueOf((String) it.next());
                    } catch (Throwable unused) {
                        baseUserGroupFieldsDto = null;
                    }
                    if (baseUserGroupFieldsDto != null) {
                        arrayList.add(baseUserGroupFieldsDto);
                    }
                }
                return arrayList;
            case 1:
                return s3q0.a;
            case 2:
                qcy<Object>[] qcyVarArr = CartComponent$Companion$STUB$1.f;
                return new ayl();
            case 3:
                return e9w.b("ChannelInviteUsersCmd");
            case 4:
                return new d8c();
            case 5:
                qcy<Object>[] qcyVarArr2 = ClipsFavoritesComponentImpl.l;
                return new max0();
            case 6:
                qcy<Object>[] qcyVarArr3 = ClipsPlaylistsComponentStub.d;
                return new ClipsPlaylistsComponentStub.c();
            case 7:
                return new upi();
            case 8:
                return new nag();
            case 9:
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return izi0.m(ContactsViews.USERS, ContactsViews.CONTACTS, ContactsViews.HINTS, ContactsViews.NEW_USERS_BANNER, ContactsViews.BIRTHDAYS, ContactsViews.EMPTY, ContactsViews.INVITE, ContactsViews.CREATE_CONTACT, ContactsViews.SHARE, o25.b(o25.a()) ? ContactsViews.EDU_CONTACTS : null);
            case 10:
                return new y3v();
            case 11:
                return new ots();
            case 12:
                qcy<Object>[] qcyVarArr4 = GeoPostsFragment.q0;
                return new y3v();
            case 13:
                return new aha0();
            case 14:
                return "Ignoring request to stopLongPoll for ImEnvironment. Reason: already stopped before or is in stopping state";
            case 15:
                return new pjx();
            case 16:
                return new Regex("(^|[a-z0-9.\\-]*\\.)(vk|vkontakte)\\.(com|ru)");
            case 17:
                qcy<Object>[] qcyVarArr5 = MarketComponentImpl.l;
                return a0a.d;
            case 18:
                return Pattern.compile("\\[((id|club|event|public)\\d+|[A-Za-z0-9_\\.]{2,32})\\|[^\\]\\n<]+\\]|(?<=^|[\\s.,:\\'\"«»;>\\)\\(\\[\\]])(\\*|@)([A-Za-z0-9_\\.]{2,32})\\s*\\((.+?)\\)|(?<=^|[\\s.,:\\'\"«»;>\\)\\(\\[\\]])(\\*|@)([A-Za-z0-9_\\.]{2,32})(?=$|[\\s.,:\\'\"«»&;?<\\)\\(])");
            case 19:
                return new gdp();
            case 20:
                FeedFeatures feedFeatures = FeedFeatures.FRESH_TIMER;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 21:
                int i = NewsfeedCustomToolbarFragment.W;
                return Boolean.valueOf(com.vk.toggle.d.N());
            case 22:
                return new ql60();
            case 23:
                FeedFeatures feedFeatures2 = FeedFeatures.ASYNC_DIFF_UTIL;
                feedFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures2));
            case 24:
                FeedFeatures feedFeatures3 = FeedFeatures.DISABLE_PLAYLIST_ANIM;
                feedFeatures3.getClass();
                if (com.vk.toggle.b.A.a(feedFeatures3) && com.vk.toggle.d.j().a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 25:
                qcy<Object>[] qcyVarArr6 = NewsfeedSettingsComponentImpl.d;
                return new iz60();
            case 26:
                OKVoipEngine.b.getClass();
                return Boolean.valueOf(OKVoipEngine.q);
            case 27:
                return s3q0.a;
            case 28:
                return new wfa0();
            default:
                int i2 = PodcastEpisodeFragment.u0;
                return Boolean.valueOf(MusicFeatures.AUDIO_KIDS_MODE.h());
        }
    }
}
