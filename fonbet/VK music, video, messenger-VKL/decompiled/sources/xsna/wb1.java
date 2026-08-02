package xsna;

import android.content.Context;
import androidx.constraintlayout.motion.widget.MotionLayoutWithFixedTouches;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.attachments.impl.di.ClipsAttachmentsComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.core.apps.BuildInfo;
import com.vk.core.performance.device.DevicePerformanceInfo;
import com.vk.core.preference.Preference;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.vc.ContactsViews;
import com.vk.im.ui.fragments.DialogsFragment;
import com.vk.method.selector.impl.MethodSelectorComponentImpl;
import com.vk.metrics.reporters.AnrAppExitExceptions;
import com.vk.music.player.core.helper.moosic.VkMusicOfflineCipher;
import com.vk.toggle.features.SoccomFeatures;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Landscape;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Portrait;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.text.Regex;
import xsna.wy30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class wb1 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ wb1(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ExposedFunction clearStorage;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                bpn0 bpn0Var = AnrAppExitExceptions.b;
                return new Regex(".*Input dispatching.*");
            case 2:
                int i = ClipFeedListFragment.a2;
                return new ezc();
            case 3:
                qcy<Object>[] qcyVarArr = ClipsAttachmentsComponentImpl.f;
                return new sd9();
            case 4:
                return new bae();
            case 5:
                return Preference.f("creation.onboarding");
            case 6:
                SoccomFeatures soccomFeatures = SoccomFeatures.MULTI_INTEGRATION;
                soccomFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(soccomFeatures));
            case 7:
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return izi0.m(ContactsViews.USERS, ContactsViews.HINTS, ContactsViews.CONTACTS, ContactsViews.CREATE_CHANNEL, ContactsViews.WRITE_BY_PHONE_NUMBER, ContactsViews.EMPTY, ContactsViews.CREATE_CHAT, ContactsViews.SHOW_CONTACT_LIST);
            case 8:
                if (BuildInfo.q()) {
                    DevicePerformanceInfo a = DevicePerformanceInfo.a.a();
                    if ((a != null ? a.e : null) == DevicePerformanceInfo.Class.HIGH) {
                        return new zl80(UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION, UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION, 1000, 2000, 20000, false);
                    }
                }
                return new zl80(70000, 70000, 1000, 2000, 20000, false);
            case 9:
                return Long.valueOf(TimeUnit.SECONDS.toMillis(com.vk.toggle.d.f().a));
            case 10:
                boolean z = DialogsFragment.u0;
                return Boolean.valueOf(com.vk.toggle.d.N());
            case 11:
                return s3q0.a;
            case 12:
                return new w5r0();
            case 13:
                x290.i.b(true);
                x290.i.setEnabled(false);
                return s3q0.a;
            case 14:
                clearStorage = CommonAdViewerExposedFunctionsKt.clearStorage();
                return clearStorage;
            case 15:
                jgp jgpVar = jgp.b;
                EmptySet emptySet = EmptySet.b;
                return new i8w(jgpVar, emptySet, emptySet);
            case 16:
                pqo pqoVar = cuw.a;
                return idl.a;
            case 17:
                return s3q0.a;
            case 18:
                return new Regex("^music\\.(vk|vkontakte)\\.(com|ru|me)");
            case 19:
                qcy<Object>[] qcyVarArr2 = MethodSelectorComponentImpl.b;
                return new fk20();
            case 20:
                return s3q0.a;
            case 21:
                return new d20();
            case 22:
                int i2 = MotionLayoutWithFixedTouches.O0;
                HashMap hashMap = new HashMap();
                zrp<DiscoveryScreenMotionStates$Portrait> i3 = DiscoveryScreenMotionStates$Portrait.i();
                ArrayList arrayList = new ArrayList(c5g.u(i3, 10));
                for (DiscoveryScreenMotionStates$Portrait discoveryScreenMotionStates$Portrait : i3) {
                    arrayList.add(new Pair(Integer.valueOf(discoveryScreenMotionStates$Portrait.h()), discoveryScreenMotionStates$Portrait));
                }
                pn00.p(hashMap, arrayList);
                zrp<DiscoveryScreenMotionStates$Landscape> i4 = DiscoveryScreenMotionStates$Landscape.i();
                ArrayList arrayList2 = new ArrayList(c5g.u(i4, 10));
                for (DiscoveryScreenMotionStates$Landscape discoveryScreenMotionStates$Landscape : i4) {
                    arrayList2.add(new Pair(Integer.valueOf(discoveryScreenMotionStates$Landscape.h()), discoveryScreenMotionStates$Landscape));
                }
                pn00.p(hashMap, arrayList2);
                man manVar = man.b;
                manVar.getClass();
                hashMap.put(Integer.valueOf(man.c), manVar);
                return hashMap;
            case 23:
                return new ConcurrentHashMap();
            case 24:
                return new ArrayList(10);
            case 25:
                return new wy30.a(0);
            case 26:
                return new Date();
            case 27:
                return new v370();
            case 28:
                Context context = e43.a;
                return new VkMusicOfflineCipher(new ncc((context != null ? context : null).getFilesDir()));
            default:
                return new u780();
        }
    }
}
