package xsna;

import android.graphics.RectF;
import android.util.SparseArray;
import com.vk.catalog2.feature.music.ui.holder.ArtistLinkHorizontalListItemVh;
import com.vk.clips.precache.impl.di.ClipsPrecacheRecyclerComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.serialize.Serializer;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.vc.ContactsViews;
import com.vk.search.ui.impl.catalog.GlobalSearchFeedCatalogFragment;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.api.id.CallId;
import com.vkontakte.android.R;
import java.util.Calendar;
import kotlin.Result;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import one.video.ad.ux.motion.view.OneVideoMotionHeaderView;
import ru.ok.android.externcalls.sdk.Conversation;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zq3 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ zq3(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object failure;
        boolean z = false;
        switch (this.b) {
            case 0:
                int i = ArtistLinkHorizontalListItemVh.s;
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_LINKVH_REDESIGN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 1:
                return Boolean.valueOf(MusicFeatures.AUDIO_REWORK_PLAYER_ADS.h());
            case 2:
                try {
                    failure = new ys4(fg40.a() == null);
                    bn40.b("[AudioPlayerPool] - config is " + failure);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    up2.c("[AudioPlayerPool] - read config failed with " + a);
                    failure = new ys4(false);
                }
                return (ys4) failure;
            case 3:
                return Integer.valueOf(iah0.v() - iah0.a(36));
            case 4:
                float f = CameraUIView.w1;
                return new yy80();
            case 5:
                return s3q0.a;
            case 6:
                return new oqc();
            case 7:
                return new i1t0(true, bo.h());
            case 8:
                return new u1r0();
            case 9:
                qcy<Object>[] qcyVarArr = ClipsPrecacheRecyclerComponentImpl.b;
                return new tie();
            case 10:
                qcy<Object>[] qcyVarArr2 = ClipsViewerComponentImpl.o0;
                return new z1e();
            case 11:
                a1w a1wVar = q1w.a;
                return (a1wVar != null ? a1wVar : null).r().h;
            case 12:
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return izi0.m(ContactsViews.USERS, ContactsViews.CONTACTS, ContactsViews.INVITE_BY_PHONE_NUMBER, ContactsViews.HINTS, ContactsViews.EMPTY, ContactsViews.SELECTION_PREVIEW, o25.b(o25.a()) ? ContactsViews.EDU_CONTACTS : null);
            case 13:
                return new GlobalSearchFeedCatalogFragment.a(GlobalSearchFeedCatalogFragment.class, null, null).f();
            case 14:
                return new RectF();
            case 15:
                return Boolean.valueOf(com.vk.toggle.d.G());
            case 16:
                return (n5w) n5w.d.getValue();
            case 17:
                return new dns0();
            case 18:
                return new Regex("^(www\\.)?ozon\\.(ru|by|kz)", RegexOption.IGNORE_CASE);
            case 19:
                return new afq0();
            case 20:
                return new ix4();
            case 21:
                return vtk0.a(Boolean.FALSE);
            case 22:
                if (e370.s != null && com.vk.toggle.b.A.a(SaFeatures.STICKY_BANNER_NATIVE_AD)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                return s3q0.a;
            case 24:
                Serializer.c<CallId> cVar = CallId.CREATOR;
                OKVoipEngine.b.getClass();
                Conversation conversation = OKVoipEngine.E.getConversation();
                return CallId.a.a(conversation != null ? conversation.getConversationId() : null);
            case 25:
                int i2 = OneVideoMotionHeaderView.D;
                return new mpz();
            case 26:
                return new i1t0(true, bo.h());
            case 27:
                SparseArray sparseArray = new SparseArray();
                int b = cn70.b(20);
                abg0 abg0Var = dhr0.t;
                sparseArray.put(b, abg0Var.b(R.drawable.vk_icon_block_outline_20, R.attr.vk_ui_icon_secondary));
                sparseArray.put(cn70.b(28), abg0Var.b(R.drawable.vk_icon_block_outline_28, R.attr.vk_ui_icon_secondary));
                return sparseArray;
            case 28:
                return Calendar.getInstance();
            default:
                return new wfd0();
        }
    }
}
