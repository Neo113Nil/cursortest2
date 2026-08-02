package xsna;

import android.graphics.RectF;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.BiometricsLockPinFragment;
import com.vk.censoredsettings.di.CensoredSettingsComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.preference.Preference;
import com.vk.home.HomeFragment2;
import com.vk.im.engine.di.ImConfigurationScopedComponentImpl;
import com.vk.im.messageviews.impl.dependencies.MessageViewsFeatureComponentImpl;
import com.vk.im.video.b;
import com.vk.newsfeed.impl.explore.ExploreFragment;
import com.vk.toggle.features.SearchFeatures;
import com.vk.video.ui.albums.fragments.AbsVideoListFragment;
import com.vk.voip.api.id.CallId;
import java.text.SimpleDateFormat;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import xsna.k840;
import xsna.kw40;
import xsna.ly40;
import xsna.s2r;
import xsna.ucm;
import xsna.xua0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class fc implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ fc(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                int i = AbsVideoListFragment.W0;
                return new i1t0(true, bo.h());
            case 1:
                int i2 = BiometricsLockPinFragment.c0;
                return (n97) r57.b.getValue();
            case 2:
                return new CallId(ConversationFactory.generateConversationId());
            case 3:
                return new pxo0(2000L);
            case 4:
                qcy<Object>[] qcyVarArr = CensoredSettingsComponentImpl.b;
                return new npa();
            case 5:
                return "leaveChannel: ";
            case 6:
                return "Error on loading more of suggested channels.";
            case 7:
                int i3 = ClipFeedListFragment.a2;
                return qsk0.a;
            case 8:
                return new ish();
            case 9:
                return Boolean.valueOf(k840.a.i.b());
            case 10:
                ucm.a.C3798a c3798a = ucm.a.Companion;
                return '?';
            case 11:
                return s3q0.a;
            case 12:
                int i4 = ExploreFragment.h0;
                int i5 = y1z.a;
                LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
                return Boolean.FALSE;
            case 13:
                return new kll();
            case 14:
                int i6 = HomeFragment2.x0;
                return Boolean.valueOf(com.vk.toggle.d.N());
            case 15:
                return new zzq(false);
            case 16:
                return new RectF();
            case 17:
                qcy<Object>[] qcyVarArr2 = ImConfigurationScopedComponentImpl.d;
                return mbw.a;
            case 18:
                return new b.C1185b();
            case 19:
                return s3q0.a;
            case 20:
                return er90.a;
            case 21:
                qcy<Object>[] qcyVarArr3 = MessageViewsFeatureComponentImpl.c;
                return new gd20();
            case 22:
                return new SimpleDateFormat("HH:mm");
            case 23:
                return new ly40.a((p4b0) p4b0.e.getValue(), new kw40.b((mw40) mw40.g.getValue(), xua0.j.a));
            case 24:
                return new np50();
            case 25:
                s2r G = o25.a().G();
                if (G == null) {
                    G = new s2r(new s2r.c(false, false), new s2r.b(false));
                }
                return Boolean.valueOf(G.b.c);
            case 26:
                return new blk0();
            case 27:
                return new ots();
            case 28:
                SearchFeatures searchFeatures = SearchFeatures.SEARCH_FILTERS_DS;
                searchFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(searchFeatures));
            default:
                return Preference.f("podcast_search_prefs");
        }
    }
}
