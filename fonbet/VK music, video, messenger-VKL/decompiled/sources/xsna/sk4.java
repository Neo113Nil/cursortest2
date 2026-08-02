package xsna;

import android.graphics.Path;
import android.os.Build;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.impl.DeprecatedAttachActivity;
import com.vk.comments.impl.di.CommentsComponentImpl;
import com.vk.content.pivacy.di.ContentPrivacyComponentImpl;
import com.vk.core.view.FutureDateTimePickerView;
import com.vk.ecomm.moderation.impl.restrictions.di.ModerationComponentImpl;
import com.vk.foldertypeobserver.impl.FolderTypeObserverComponentImpl;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.toggle.b;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.SoccomFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.OKVoipEngine;
import java.util.Calendar;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.Conversation;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class sk4 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ sk4(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        JSONObject g;
        JSONArray optJSONArray;
        ExposedFunction readStorage;
        boolean z = false;
        switch (this.b) {
            case 1:
                int i = BonusCatalogFragment.f0;
                break;
            case 4:
                b.d i2 = com.vk.toggle.b.A.i(VideoFeatures.VP9_BLACKLIST);
                if (i2 != null && (g = i2.g()) != null && (optJSONArray = g.optJSONArray("devices")) != null) {
                    z = f370.O(optJSONArray).contains(Build.MANUFACTURER + ' ' + Build.MODEL);
                }
                break;
            case 5:
                qcy<Object>[] qcyVarArr = CommentsComponentImpl.g;
                break;
            case 6:
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
                break;
            case 8:
                qcy<Object>[] qcyVarArr2 = ContentPrivacyComponentImpl.c;
                break;
            case 9:
                int i3 = DeprecatedAttachActivity.K0;
                break;
            case 12:
                qcy<Object>[] qcyVarArr3 = FolderTypeObserverComponentImpl.b;
                break;
            case 13:
                int i4 = FriendRequestsFragment.d0;
                break;
            case 14:
                int i5 = FutureDateTimePickerView.o;
                Calendar calendar = Calendar.getInstance(pvo0.d().getTimeZone());
                calendar.add(10, 4);
                calendar.set(13, 0);
                break;
            case 17:
                readStorage = CommonAdViewerExposedFunctionsKt.readStorage();
                break;
            case 18:
                Path path = new Path();
                path.moveTo(20.0f, 40.0f);
                path.cubicTo(20.0f, 40.0f, 20.0f, 40.0f, 20.0f, 40.0f);
                path.cubicTo(20.0f, 40.0f, 20.0f, 40.0f, 20.0f, 40.0f);
                path.lineTo(20.0f, 43.0f);
                path.cubicTo(19.393f, 43.0f, 19.123f, 42.646f, 18.506f, 41.839f);
                path.lineTo(18.4f, 41.7f);
                path.cubicTo(17.682f, 40.762f, 17.004f, 40.223f, 16.0f, 39.7f);
                path.cubicTo(15.8f, 39.603f, 15.633f, 39.542f, 15.477f, 39.486f);
                path.cubicTo(6.61f, 37.437f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 29.49f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20.0f);
                path.cubicTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.954f, 8.954f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                path.cubicTo(31.046f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 40.0f, 8.954f, 40.0f, 20.0f);
                path.cubicTo(40.0f, 29.49f, 33.39f, 37.437f, 24.523f, 39.487f);
                path.cubicTo(24.367f, 39.543f, 24.2f, 39.603f, 24.0f, 39.7f);
                path.cubicTo(22.996f, 40.223f, 22.318f, 40.762f, 21.6f, 41.7f);
                path.lineTo(21.494f, 41.839f);
                path.cubicTo(20.878f, 42.646f, 20.607f, 43.0f, 20.0f, 43.0f);
                path.lineTo(20.0f, 40.0f);
                path.close();
                path.moveTo(20.0f, 40.0f);
                break;
            case 22:
                SoccomFeatures soccomFeatures = SoccomFeatures.MULTI_INTEGRATION;
                soccomFeatures.getClass();
                break;
            case 23:
                qcy<Object>[] qcyVarArr4 = ModerationComponentImpl.g;
                break;
            case 27:
                OKVoipEngine.b.getClass();
                Conversation conversation = OKVoipEngine.E.getConversation();
                if (conversation != null) {
                    OKVoipEngine.N(conversation, conversation.getMe());
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ sk4(FutureDateTimePickerView futureDateTimePickerView) {
        this.b = 14;
    }
}
