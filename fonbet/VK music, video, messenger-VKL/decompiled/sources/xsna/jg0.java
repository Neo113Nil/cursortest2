package xsna;

import androidx.constraintlayout.motion.widget.MotionLayoutWithFixedTouches;
import com.vk.clips.attachments.impl.di.ClipsAttachmentsComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.dialogslist.impl.di.DialogsListInternalFeatureComponentStub;
import com.vk.ecomm.shop_conditions.impl.di.MarketShopConditionsComponentImpl;
import com.vk.games.presentation.detail.GamesCatalogDetailFragment;
import com.vk.geo.impl.di.GeoComponentImpl;
import com.vk.im.engine.models.EmailStatus;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.vc.ContactsViews;
import com.vk.metrics.reporters.AnrAppExitExceptions;
import com.vk.newsfeed.impl.config.FeedTabsDelayConfig;
import com.vk.profile.community.impl.ui.widget.CommunityWidgetPreviewFragment;
import com.vk.search.ui.impl.catalog.SearchAllFeatureCatalogFragment;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.b;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.text.Regex;
import xsna.mdz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class jg0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ jg0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = false;
        switch (this.b) {
            case 0:
                return Integer.valueOf(dhr0.t.c(R.attr.vk_ui_icon_accent));
            case 1:
                bpn0 bpn0Var = AnrAppExitExceptions.b;
                return "user request after error";
            case 2:
                return new Regex("^bank\\d{12}://.*$");
            case 3:
                int i = ClipFeedListFragment.a2;
                return new ngj0();
            case 4:
                qcy<Object>[] qcyVarArr = ClipsAttachmentsComponentImpl.f;
                return new eze();
            case 5:
                return new pod();
            case 6:
                qcy<Object>[] qcyVarArr2 = ClipsViewerComponentImpl.o0;
                return b100.a;
            case 7:
                return new y1q0(0);
            case 8:
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(qni0.a());
                return calendar;
            case 9:
                ComFeatures comFeatures = ComFeatures.COM_SECTIONS_REDESIGN;
                comFeatures.getClass();
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                if (bVar.a(comFeatures)) {
                    b.d j = bVar.j(comFeatures.getKey(), false);
                    String d = j != null ? j.d() : null;
                    if (epx.f(d, "B") || epx.f(d, "C")) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 10:
                int i2 = CommunityWidgetPreviewFragment.U;
                return new lc3();
            case 11:
                return s3q0.a;
            case 12:
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return izi0.m(ContactsViews.USERS, ContactsViews.HINTS, ContactsViews.CONTACTS, ContactsViews.WRITE_BY_PHONE_NUMBER, ContactsViews.EMPTY, ContactsViews.CREATE_CHAT, ContactsViews.SHOW_CONTACT_LIST);
            case 13:
                return Double.valueOf(com.vk.toggle.d.f().b);
            case 14:
                qcy<Object>[] qcyVarArr3 = DialogsListInternalFeatureComponentStub.b;
                return new n7p();
            case 15:
                return new FeedTabsDelayConfig(10000L);
            case 16:
                return new SearchAllFeatureCatalogFragment.a(SearchAllFeatureCatalogFragment.class, null, null).f();
            case 17:
                return EmailStatus.h();
            case 18:
                return Boolean.valueOf(SakFeatures.Type.VKC_PHONE_HINT_IM.h());
            case 19:
                return new ArrayList();
            case 20:
                return Boolean.valueOf(com.vk.toggle.d.N());
            case 21:
                int i3 = GamesCatalogDetailFragment.d0;
                return new w9t();
            case 22:
                qcy<Object>[] qcyVarArr4 = GeoComponentImpl.f;
                return new wgx();
            case 23:
                return new Regex("^vk\\.link");
            case 24:
                return new ConcurrentSkipListSet(new mdz.b());
            case 25:
                return s3q0.a;
            case 26:
                qcy<Object>[] qcyVarArr5 = MarketShopConditionsComponentImpl.b;
                return new ne10();
            case 27:
                return s3q0.a;
            case 28:
                int i4 = MotionLayoutWithFixedTouches.O0;
                return new bri();
            default:
                return Calendar.getInstance();
        }
    }
}
