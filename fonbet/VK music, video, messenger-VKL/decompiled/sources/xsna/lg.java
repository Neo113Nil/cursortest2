package xsna;

import android.content.Context;
import android.text.TextPaint;
import android.util.SizeF;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.properties.SdkProperties;
import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.BiometricsLockSettingsFragment;
import com.vk.clips.attachments.api.di.ClipsAttachmentsComponentStub;
import com.vk.feed.design.view.newsfeed.reactionstack.FeedMiniReactionsStack;
import com.vk.music.offline.configs.api.di.AudioRestrictionComponent;
import com.vk.music.player.analytics.impl.tracker.di.AbstractPlayerAnalyticsComponent;
import com.vk.search.ui.impl.catalog.GlobalSearchGamesCatalogFragment;
import com.vk.superapp.local.storage.js.bridge.impl.di.JsLocalStorageDelegateComponentImpl;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import java.util.Collections;
import kotlin.text.Regex;
import ru.ok.android.webrtc.stat.cpu.processor.ProcessorStatistics;
import xsna.bx1;
import xsna.cz40;
import xsna.fx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ lg(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        long initializationTime;
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = AbstractPlayerAnalyticsComponent.g;
                return new y2b0();
            case 1:
                initializationTime = SdkProperties.getInitializationTime();
                return Long.valueOf(initializationTime);
            case 2:
                csu0.a.getClass();
                return csu0.a();
            case 3:
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                return ((AudioRestrictionComponent) m7m.e().a(fpf0.a(AudioRestrictionComponent.class))).h6();
            case 4:
                return s3q0.a;
            case 5:
                int i = BiometricsLockSettingsFragment.Y;
                return (n97) r57.b.getValue();
            case 6:
                return new pbc0();
            case 7:
                return "collapseChannelRecommendations: ";
            case 8:
                ClipsAttachmentsComponentStub.f.getClass();
                return new com.vk.clips.attachments.api.di.b();
            case 9:
                ComFeatures comFeatures = ComFeatures.COM_PROFILE_POSTING_REDESIGN;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 10:
                return new GlobalSearchGamesCatalogFragment.a(GlobalSearchGamesCatalogFragment.class, null, null).f();
            case 11:
                return new exn();
            case 12:
                return new p4r();
            case 13:
                return new oib();
            case 14:
                int i2 = FeedMiniReactionsStack.i;
                return new SizeF(-16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            case 15:
                return new StringBuilder();
            case 16:
                return new s6r();
            case 17:
                return s3q0.a;
            case 18:
                qcy<Object>[] qcyVarArr2 = JsLocalStorageDelegateComponentImpl.b;
                return new y4y();
            case 19:
                return new Regex("/(?:club|public)([0-9]+)");
            case 20:
                io.reactivex.rxjava3.subjects.h hVar = k720.u;
                it80.b.getClass();
                hVar.onNext(new it80(null));
                return s3q0.a;
            case 21:
                return s3q0.a;
            case 22:
                return s3q0.a;
            case 23:
                return Boolean.valueOf(MusicFeatures.PODCAST_EPISODE_DOWNLOAD.h());
            case 24:
                return Collections.singletonList(new ief0());
            case 25:
                return "Activity.onResume";
            case 26:
                cz40.b.C2691b c2691b = cz40.b.C2691b.a;
                Context context2 = e43.a;
                if (context2 == null) {
                    context2 = null;
                }
                return new hx40(c2691b, context2, (otp) null, new fx40.a(new bx1.a(true, false), null, null, null, 59), (oh6) null, 52);
            case 27:
                return s3q0.a;
            case 28:
                return Integer.valueOf(ProcessorStatistics.b());
            default:
                TextPaint textPaint = new TextPaint();
                textPaint.setColor(dhr0.t.c(R.attr.vk_ui_text_secondary));
                Context context3 = e43.a;
                com.vk.typography.b.c(textPaint, context3 != null ? context3 : null, FontFamily.MEDIUM, Float.valueOf(13.0f), TextSizeUnit.SP);
                return textPaint;
        }
    }
}
