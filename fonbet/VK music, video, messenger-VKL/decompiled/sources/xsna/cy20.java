package xsna;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.Size;
import android.view.animation.LinearInterpolator;
import com.google.gson.GsonBuilder;
import com.unity3d.services.UnityAdsConstants;
import com.vk.biometrics.lock.api.di.BiometricsLockComponent;
import com.vk.catalog2.common.ui.mvp.holder.video.SubcategoryFilterVh;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.VkCellSkeleton$Left$Main;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.newsfeed.posting.api.di.Posting2ComponentStub;
import com.vk.profile.user.impl.di.UserProfileComponentImpl;
import com.vk.pushes.PushComponent$Companion$STUB$2$1;
import com.vk.toggle.b;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.R;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import org.json.JSONObject;
import xsna.gfc0;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class cy20 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ cy20(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        JSONObject g;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                return new GsonBuilder().serializeNulls().create();
            case 2:
                return new ru50();
            case 3:
                return new y1q0(0);
            case 4:
                return ((BiometricsLockComponent) ((k7m) m7m.f(o970.b)).a(fpf0.a(BiometricsLockComponent.class))).b();
            case 5:
                return Boolean.valueOf(Preference.j().getBoolean("overlay_menu_enable_on_next_launch", false));
            case 6:
                qcy<Object>[] qcyVarArr = Posting2ComponentStub.d;
                return gfc0.a.a.getSTUB();
            case 7:
                ComFeatures comFeatures = ComFeatures.COM_POSTING_AUTHOR_SELECTION;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 8:
                qcy<Object>[] qcyVarArr2 = PushComponent$Companion$STUB$2$1.b;
                return new uev0(null);
            case 9:
                FeedFeatures feedFeatures = FeedFeatures.FRIEND_LIKES_INLINE;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 10:
                return new Regex("qr\\.vk\\.(com|ru)", RegexOption.IGNORE_CASE);
            case 11:
                return new la60();
            case 12:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6.2831855f);
                ofFloat.setDuration(2000L);
                ofFloat.setRepeatCount(-1);
                ofFloat.setRepeatMode(-1);
                ofFloat.setInterpolator(new LinearInterpolator());
                return ofFloat;
            case 13:
                return ((NarrativeComponent) ((k7m) m7m.f(f1m0.b)).a(fpf0.a(NarrativeComponent.class))).Ic();
            case 14:
                qcy<Object>[] qcyVarArr3 = SubcategoryFilterVh.f;
                return s3q0.a;
            case 15:
                return s3q0.a;
            case 16:
                return s3q0.a;
            case 17:
                qcy<Object>[] qcyVarArr4 = UserProfileComponentImpl.m;
                return new nyd0();
            case 18:
                Context context = e43.a;
                return Integer.valueOf((context != null ? context : null).getResources().getDimensionPixelSize(R.dimen.voip_small_content_item_height));
            case 19:
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                b.d i = com.vk.toggle.b.A.i(StoriesFeatures.VERTICALIZATION);
                return Long.valueOf((i == null || (g = i.g()) == null) ? 10000L : g.optLong("initial_delay_ms"));
            case 20:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_AD_IN_PIP;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 21:
                return new StringBuffer();
            case 22:
                qcy<Object>[] qcyVarArr5 = VideoView.T0;
                return new jl80();
            case 23:
                return VkCell.Middle.d.b.Companion.serializer();
            case 24:
                return VkCellSkeleton$Left$Main.Size.Companion.serializer();
            case 25:
                return new pco(0);
            case 26:
                c63 c63Var = c63.a;
                Activity b = c63.b();
                if (b == null) {
                    return s3q0.a;
                }
                ikv0.a aVar = new ikv0.a(b);
                aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
                aVar.u = new ikv0.d(b.getString(R.string.user_profile_cover_upload_failed), (String) null, (ikv0.d.a) null, 6);
                aVar.n();
                return s3q0.a;
            default:
                return new ltw0(OKVoipEngine.b);
        }
    }
}
