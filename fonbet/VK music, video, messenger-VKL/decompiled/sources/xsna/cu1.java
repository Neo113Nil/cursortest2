package xsna;

import android.content.Context;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.vk.feed.design.view.newsfeed.reactionstack.FeedMiniReactionsStack;
import com.vk.games.presentation.detail.GamesCatalogDetailFragment;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.vc.ContactsViews;
import com.vk.im.ui.views.counter.AnimatedCounterView;
import com.vk.music.bottomsheets.promo.di.MusicBottomSheetComponentImpl;
import com.vk.music.offline.configs.impl.di.AudioReactionsComponentImpl;
import com.vk.music.offline.core.database.OfflineAudioDatabase;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;
import com.vk.superapp.ads.js.bridge.impl.di.JsAdsDelegateComponentImpl;
import com.vk.superapp.location.js.bridge.impl.di.JsLocationDelegateComponentImpl;
import com.vk.toggle.b;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.ImFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vk.toggle.features.SoccomFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class cu1 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ cu1(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ExposedFunction writeStorage;
        switch (this.b) {
            case 0:
                int i = AllHighlightsFragment.g0;
                ComFeatures comFeatures = ComFeatures.COM_SECTIONS_REDESIGN;
                comFeatures.getClass();
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                boolean z = false;
                if (bVar.a(comFeatures)) {
                    b.d j = bVar.j(comFeatures.getKey(), false);
                    String d = j != null ? j.d() : null;
                    if (epx.f(d, "B") || epx.f(d, "C")) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                qcy<Object>[] qcyVarArr = AnimatedCounterView.w;
                ImFeatures imFeatures = ImFeatures.REDESIGN_DIALOG_LIST_ITEM;
                imFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(imFeatures));
            case 2:
                qcy<Object>[] qcyVarArr2 = AudioReactionsComponentImpl.b;
                ix4 ix4Var = new ix4();
                Context context = e43.a;
                return new du4(new ju4(ix4Var, OfflineAudioDatabase.j.a(context != null ? context : null).z(), new xo9()), new crx0());
            case 3:
                return new z0a();
            case 4:
                return s3q0.a;
            case 5:
                return "markChannelAsRead: ";
            case 6:
                SoccomFeatures soccomFeatures = SoccomFeatures.CHECKOUT_NEW_FLOW;
                soccomFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(soccomFeatures));
            case 7:
                return s3q0.a;
            case 8:
                return new com.vk.clips.attachments.impl.publish.geolocation.presentation.i();
            case 9:
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return rl3.y0(new ContactsViews[]{ContactsViews.USERS, ContactsViews.HINTS, ContactsViews.EMPTY, ContactsViews.SELECTION_PREVIEW, ContactsViews.USERS_FROM_ROOT_CONVERSATION});
            case 10:
                return new gdp();
            case 11:
                kpp kppVar = opp.T;
                return new Integer[]{2, 5};
            case 12:
                int i2 = FeedMiniReactionsStack.i;
                return new ArrayList();
            case 13:
                int i3 = GamesCatalogDetailFragment.d0;
                return Boolean.valueOf(com.vk.toggle.b.A.a(SaFeatures.SA_GAMES_FRIENDLY_URL_DEEPLINK));
            case 14:
                writeStorage = CommonAdViewerExposedFunctionsKt.writeStorage();
                return writeStorage;
            case 15:
                hew hewVar = hew.b;
                return "ImUnstableConnectionModalHelper: showing custom im modal (dismissable true)";
            case 16:
                qcy<Object>[] qcyVarArr3 = JsAdsDelegateComponentImpl.e;
                return new av0();
            case 17:
                qcy<Object>[] qcyVarArr4 = JsLocationDelegateComponentImpl.b;
                return new e5y();
            case 18:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_LINKVH_REDESIGN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 19:
                ArrayList a = e43.a("vk.com", "vk.ru");
                if (!a.contains(a0a.d)) {
                    a.add(a0a.d);
                }
                ArrayList arrayList = new ArrayList(c5g.u(a, 10));
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    arrayList.add("qr." + ((String) it.next()));
                }
                return j5g.S0(arrayList);
            case 20:
                qcy<Object>[] qcyVarArr5 = w920.v;
                return "checkHistoryUpdate: skipped with isUpdatingHistory = true";
            case 21:
                return s3q0.a;
            case 22:
                return Boolean.valueOf(o25.b(o25.a()));
            case 23:
                qcy<Object>[] qcyVarArr6 = MusicBottomSheetComponentImpl.e;
                return new e6e0();
            case 24:
                return s3q0.a;
            case 25:
                return ((VideoShareComponent) ((k7m) m7m.f(iuc0.b)).a(fpf0.a(VideoShareComponent.class))).S();
            case 26:
                return new moe0();
            case 27:
                Context context2 = e43.a;
                return Integer.valueOf(e3m.a(R.dimen.vkim_reactions_margin_before_reaction_icon, context2 != null ? context2 : null));
            case 28:
                return s3q0.a;
            default:
                return new io.reactivex.rxjava3.disposables.b();
        }
    }

    public /* synthetic */ cu1(AudioReactionsComponentImpl audioReactionsComponentImpl) {
        this.b = 2;
    }
}
