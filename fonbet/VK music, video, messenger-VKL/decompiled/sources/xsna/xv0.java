package xsna;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.ads.impl.di.AdsComponentImpl;
import com.vk.channelrestrictions.ChannelRestrictionsComponent$Companion$STUB$2$1;
import com.vk.clips.sdk.parcer.api.MyTargetComponent;
import com.vk.core.preference.Preference;
import com.vk.core.serialize.Serializer;
import com.vk.dto.badges.BadgeImage;
import com.vk.dto.user.UserNameType;
import com.vk.movika.impl.VideoInteractiveFullscreenFragment;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.profile.user.impl.ui.edit.cover.crop.CoverCropActivity;
import com.vk.superapp.subscriptions.js.bridge.impl.di.JsSubscriptionsDelegateComponentImpl;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.SmbAdFeatures;
import com.vkontakte.android.R;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import xsna.r5f0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class xv0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ xv0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        SDKPropertiesManager initialize$lambda$220$lambda$62;
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = AdsComponentImpl.g;
                SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_VIDEO_AD_DYNAMIC_BUTTON;
                smbAdFeatures.getClass();
                if (com.vk.toggle.b.A.a(smbAdFeatures)) {
                    return new zvn();
                }
                awn awnVar = new awn();
                awnVar.a = new io.reactivex.rxjava3.subjects.a<>();
                return awnVar;
            case 1:
                Serializer.c<BadgeImage> cVar = BadgeImage.CREATOR;
                HashMap hashMap = new HashMap();
                hq.c(28, hashMap, "", 56, "_2x");
                hq.c(84, hashMap, "_3x", 112, "_4x");
                return hashMap;
            case 2:
                return Boolean.valueOf(MusicFeatures.AUDIO_BOOK_CHAPTER_DOWNLOAD.h());
            case 3:
                return new ChannelRestrictionsComponent$Companion$STUB$2$1.a();
            case 4:
                return ((MyTargetComponent) ((k7m) m7m.f(h0f.b)).mo408a(fpf0.a(MyTargetComponent.class))).X0();
            case 5:
                return new shg();
            case 6:
                return new a390();
            case 7:
                return UserNameType.VK;
            case 8:
                int i = CoverCropActivity.w;
                return androidx.compose.runtime.k.b(Boolean.FALSE);
            case 9:
                return s3q0.a;
            case 10:
                return new m4r();
            case 11:
                return com.vk.stat.scheme.v.a();
            case 12:
                qcy<Object>[] qcyVarArr2 = JsSubscriptionsDelegateComponentImpl.b;
                return new defpackage.p0();
            case 13:
                return new Handler(Looper.getMainLooper());
            case 14:
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                return Boolean.valueOf(MusicFeatures.AUDIO_ARTIST_CONCERTS.h());
            case 15:
                qcy<Object>[] qcyVarArr3 = NewsfeedFragment.J0;
                return Boolean.valueOf(com.vk.toggle.d.N());
            case 16:
                return null;
            case 17:
                return new s290();
            case 18:
                dhr0.a.getClass();
                return new brj0(2, 0, dhr0.t.b(R.drawable.vk_icon_minus_square_outline_28, R.attr.vk_ui_icon_accent), R.string.modal_dialog_option_remove_from_friends, null, false, false, null, 0, null, null, null, null, null, 131058);
            case 19:
                return new h2c0();
            case 20:
                qcy<Object>[] qcyVarArr4 = ReactionsFeedFragment.q0;
                return new AtomicReference("FEED_LIKES");
            case 21:
                return new r5f0.b();
            case 22:
                pqo pqoVar = pei0.a;
                return null;
            case 23:
                initialize$lambda$220$lambda$62 = ServiceProvider.initialize$lambda$220$lambda$62();
                return initialize$lambda$220$lambda$62;
            case 24:
                throw new IllegalStateException("Not provided");
            case 25:
                long j = ryk0.d;
                if (j < 10000) {
                    Log.e("TVTHelper", "telemetryInterval (" + j + ") is too short, will use 10000 instead!");
                    j = 10000L;
                }
                return Long.valueOf(j);
            case 26:
                return new p4r();
            case 27:
                return "handleUpload: no network connection";
            case 28:
                return Preference.j();
            default:
                int i2 = VideoInteractiveFullscreenFragment.Q0;
                return new ccx();
        }
    }
}
