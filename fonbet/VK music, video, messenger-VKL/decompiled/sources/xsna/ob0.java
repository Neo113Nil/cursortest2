package xsna;

import android.content.Context;
import app.effectum.filter.di.FiltersComponentImpl;
import com.unity3d.ads.core.data.datasource.TcfDataSource;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.ads.stats.impl.di.AdPixelStatsComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.core.ui.image.VKImageController;
import com.vk.dto.common.id.UserId;
import com.vk.feed.design.view.newsfeed.reactionstack.FeedMiniReactionsStack;
import com.vk.music.player.PlaySourceMeta;
import com.vk.registration.funnels.RegistrationElementsTracker;
import com.vk.registration.funnels.TrackingElement;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import java.util.Calendar;
import java.util.HashMap;
import java.util.UUID;
import kotlin.text.Regex;
import xsna.cex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ob0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ob0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        TcfDataSource initialize$lambda$220$lambda$36;
        int i = 0;
        switch (this.b) {
            case 0:
                return UUID.randomUUID().toString();
            case 1:
                qcy<Object>[] qcyVarArr = AdPixelStatsComponentImpl.b;
                return new mqa0(new bpn0(new vg0(i)));
            case 2:
                return s3q0.a;
            case 3:
                return "channelNotificationOn: ";
            case 4:
                return new io.reactivex.rxjava3.disposables.g();
            case 5:
                qcy<Object>[] qcyVarArr2 = ClipsViewerComponentImpl.o0;
                return new m900(10);
            case 6:
                return new zqu();
            case 7:
                return new zqu();
            case 8:
                return Calendar.getInstance();
            case 9:
                kpp kppVar = opp.T;
                TrackingElement.Registration registration = TrackingElement.Registration.FIRST_NAME;
                RegistrationElementsTracker registrationElementsTracker = RegistrationElementsTracker.a;
                return new com.vk.registration.funnels.d(registration);
            case 10:
                return new zqu();
            case 11:
                int i2 = FeedMiniReactionsStack.i;
                return new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, true, R.drawable.user_placeholder, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65515);
            case 12:
                bpn0 bpn0Var = u8r.a;
                return "silenceUpload";
            case 13:
                qcy<Object>[] qcyVarArr3 = FiltersComponentImpl.b;
                return new tjg(new gcr());
            case 14:
                return new xau(0);
            case 15:
                int[] iArr = {n8g.l(-16777216, 0), n8g.l(-16777216, 5), n8g.l(-16777216, 20), n8g.l(-16777216, 81), n8g.l(-16777216, 96), n8g.l(-16777216, 102)};
                cex.a aVar = cex.a.a;
                return cex.a.a(iArr);
            case 16:
                return s3q0.a;
            case 17:
                return new Regex("/wall(([-0-9]+)_([0-9]+))");
            case 18:
                return s3q0.a;
            case 19:
                return new k24();
            case 20:
                return s3q0.a;
            case 21:
                return Boolean.valueOf(MusicFeatures.OFFLINE_PENDING_UI.h());
            case 22:
                return new s970();
            case 23:
                return new PlaySourceMeta.PlaylistPlaySourceMeta("", false, UserId.d, 0, 0, null, 48, null);
            case 24:
                return new wxq();
            case 25:
                return s3q0.a;
            case 26:
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                return Integer.valueOf(e3m.a(R.dimen.vkim_reactions_avatar_offset, context));
            case 27:
                return s3q0.a;
            case 28:
                initialize$lambda$220$lambda$36 = ServiceProvider.initialize$lambda$220$lambda$36();
                return initialize$lambda$220$lambda$36;
            default:
                HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
                StickersDatabase.a.b().A().b();
                return s3q0.a;
        }
    }

    public /* synthetic */ ob0(Object obj, int i) {
        this.b = i;
    }
}
